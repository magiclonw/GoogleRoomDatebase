package com.magiclon.googleroomdatebase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * 作者：MagicLon
 * 时间：2017/12/20 020
 * 邮箱：1348149485@qq.com
 * 描述：
 */
@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
