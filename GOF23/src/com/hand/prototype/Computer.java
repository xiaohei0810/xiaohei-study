package com.hand.prototype;

import java.util.Date;

/**
 * @Author xiaohei
 * @Date 2021/6/25 11:32 上午
 * @Version 1.0
 */
public class Computer implements Cloneable{

    private String cpu;
    private String keyboard;
    public Date dateTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        Computer c = (Computer)clone;
        this.dateTime = (Date) c.dateTime.clone();
        return clone;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public Computer() {

    }

    public Computer(String cpu, String keyboard,Date dateTime) {
        this.cpu = cpu;
        this.keyboard = keyboard;
        this.dateTime = dateTime;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
