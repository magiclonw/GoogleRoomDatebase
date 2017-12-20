package com.magiclon.googleroomdatebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.arch.persistence.room.Room
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread(Runnable {
            val db = Room.databaseBuilder(applicationContext,
                    AppDatabase::class.java!!, "user.db").build()
            db.userDao().delete(db.userDao().all)
            db.userDao().insertAll(arrayListOf(User(3,"first","last")))
            db.userDao().getAll(3).forEach { user->
                Log.e("----",user.toString())
            }
        }).start()
    }
}
