package ru.gb.homework.Controller;

import ru.gb.homework.Model.Person;
import ru.gb.homework.Model.PersonService;
import ru.gb.homework.Model.User;
import ru.gb.homework.MyException.NotFullEnterData;
import ru.gb.homework.View.OutConsole;

import java.util.LinkedList;
import java.util.List;

public class Controller {
    PersonService personService = new PersonService();
    OutConsole outConsole = new OutConsole();
    public void start(){
        if (outConsole.createUser()){
            User person = personService.createPerson();
            try {
                String fullName = outConsole.enterFullname();
                personService.enterFullName(fullName,person);
            }catch (NotFullEnterData e){
                e.getStackTrace();
            }
            try {
                personService.enterBirthday(outConsole.enterBirthday(),person);
            }catch (NotFullEnterData e){
                e.getStackTrace();
            }
            try {
                personService.enterTelephoneNumber(Integer.parseInt(outConsole.enterTelephoneNumber()), person);
            }catch (NotFullEnterData e){
                e.getStackTrace();
            }
            try {
                personService.enterSex(outConsole.sex(), person);
            }catch (NotFullEnterData e){
                e.getStackTrace();
            }
        }else{
            System.out.println("Не хочет");
        }

    }


}
