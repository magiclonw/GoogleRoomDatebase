package com.magiclon.googleroomdatebase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * 作者：MagicLon
 * 时间：2017/12/20 020
 * 邮箱：1348149485@qq.com
 * 描述：
 */
@Dao
public interface UserDao {
    @Insert
    void insertAll(List<User> products);
    @Query("SELECT * FROM users")
    List<User> getAll();
    @Query("SELECT * FROM users where id=:id")
    List<User> getAll(int id);
    @Delete
    void delete(List<User> products);
}
