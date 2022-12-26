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
                person.setFullName(outConsole.enterFullname());
            }catch (NotFullEnterData e){
                e.getStackTrace();
            }
        }
        String fullName = outConsole.enterFullname();
    }


}
