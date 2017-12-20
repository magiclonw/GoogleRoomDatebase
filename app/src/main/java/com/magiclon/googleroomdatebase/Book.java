package com.magiclon.googleroomdatebase;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * 作者：MagicLon
 * 时间：2017/12/20 020
 * 邮箱：1348149485@qq.com
 * 描述：
 */
@Entity(foreignKeys = @ForeignKey(entity = User.class,parentColumns = "id",childColumns = "userid"))
public class Book {
    @PrimaryKey
    int bid;
    String bname;
    String btitle;
    int userid;

    public Book(int bid, String bname, String btitle, int userid) {
        this.bid = bid;
        this.bname = bname;
        this.btitle = btitle;
        this.userid = userid;
    }

    public int getUserid() {

        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", btitle='" + btitle + '\'' +
                '}';
    }

}
