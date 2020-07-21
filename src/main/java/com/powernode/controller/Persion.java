package com.powernode.controller;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.SQLOutput;
import java.util.Date;

public class Persion {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String test;

    @Override
    public String toString() {
        return "Persion{" +
                "time=" + time +
                '}';
    }
}
