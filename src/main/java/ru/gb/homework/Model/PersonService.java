package ru.gb.homework.Model;

import ru.gb.homework.MyException.NotFullEnterData;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class PersonService {

    private List<User> listAllUser = new LinkedList<>();
    private final Person person = new Person();
    private final CheckEnterData checkEnterData = new CheckEnterData();

    public void enterFullName(String fullName) throws NotFullEnterData {
        if (checkEnterData.checkfullName(fullName)) {
            person.setFullName(fullName);
        } else {
            throw new NotFullEnterData(fullName);
        }
    }

    public void enterBirthday(String birthday) throws NotFullEnterData {
        if (checkEnterData.checkBitrhday(birthday)) {
            person.setDaysBirthday(birthday);
        } else {
            throw new NotFullEnterData(birthday);
        }
    }

    public void enterTelephoneNumber(Integer telephone) throws NotFullEnterData {
        if (checkEnterData.checkteTephoneNumver(telephone)) {

        } else {
            throw new NotFullEnterData(telephone.toString());
        }
    }

    public void enterSex(Character chars) throws NotFullEnterData {
        if (checkEnterData.checkSex(chars)) {
            person.setSex(chars);
        } else {
            throw new NotFullEnterData(chars.toString());
        }
    }
    public List<User> getListAllUser() {
        return listAllUser;
    }

    public void setListAllUser(List<User> listAllUser) {
        this.listAllUser = listAllUser;
    }
    public User createPerson(){
        User person = new Person();
        listAllUser.add(person);
        return person;
    }
}
