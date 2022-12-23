package ru.gb.homework.Model;

public abstract class User {
    private String fullName;
    private String daysBirthday;
    private Integer telephoneNumber;
    private char sex;

    public User(String fullName, String daysBirthday, Integer telephoneNumber, char sex) {
        this.fullName = fullName;
        this.daysBirthday = daysBirthday;
        this.telephoneNumber = telephoneNumber;
        this.sex = sex;
    }

    public User() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDaysBirthday() {
        return daysBirthday;
    }

    public void setDaysBirthday(String daysBirthday) {
        this.daysBirthday = daysBirthday;
    }

    public Integer getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(Integer telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


}