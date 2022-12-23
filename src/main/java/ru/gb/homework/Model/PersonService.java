package ru.gb.homework.Model;

import java.util.regex.Pattern;

public class PersonService {
    Person person = new Person();
    CheckEnterData checkEnterData = new CheckEnterData();
    public void enterFullName(String fullName){
        if (checkEnterData.checkfullName(fullName)){
            person.setFullName(fullName);
        }else {

        }
    }

    public void enterBirthday(String birthday){
        if(checkEnterData.checkBitrhday(birthday)){
            person.setDaysBirthday(birthday);
        }else {

        }
    }
    public void enterTelephoneNumber(Integer telephone){
        if(checkEnterData.checkteTephoneNumver(telephone)){

        }else {

        }
    }
    public void enterSex(Character chars){
        if (checkEnterData.checkSex(chars)){
            person.setSex(chars);
        }
        else {
            //Дописать ошибку
        }
    }
}
