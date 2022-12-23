package ru.gb.homework.Model;

import ru.gb.homework.MyException.NotFullEnterData;

public class CheckEnterData {
    public boolean checkfullName(String fullName){
        int length = fullName.split(" ").length;
        if(length > 3){
            return false;
        }else if (length < 3 ) {
            return false;
        }else {
        return true;
        }
    }
    public boolean checkBitrhday(String birthday) {
        int length = birthday.split("\\.").length;
        if (length > 3) {
            return false;
        } else if (length < 3) {
            return false;
        } else {
            return true;
        }
    }
    public boolean checkteTephoneNumver(Integer telefoneNumber){
        String telefonNumberToString = telefoneNumber.toString();
        return telefonNumberToString.matches("\\d{11}");
    }
    public boolean checkSex(char sex){
        if (sex == 'f' || sex == 'm' ){
            return true;
        }else {
            return false;
        }

    }
}
