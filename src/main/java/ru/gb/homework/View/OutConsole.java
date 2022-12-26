package ru.gb.homework.View;


import java.io.IOException;
import java.util.Scanner;

public class OutConsole {

    public boolean createUser() {
        System.out.print("Хотите создать нового пользователя? да/нет: ");
        try (Scanner enter = new Scanner(System.in)) {
            String answer = enter.next().toLowerCase();
            if (answer.equals("да")){

                return true;
            }else if (answer.equals("нет")){
                System.out.println("It's a piety");
                return false;
            }

        } catch (Exception e ){
            System.out.println("It's a piety");
            System.out.println(e.getMessage());
        }
        System.out.println("It's a piety");
        throw new IllegalArgumentException();
    }

    public String enterFullname() {
        try {
            Scanner enter = new Scanner(System.in);
            System.out.print("Введите ФИО чсерез пробел: ");
            System.out.println(enter.hasNextLine());
            String text = enter.nextLine();
            return text.toString();
        } catch (IllegalArgumentException e) {
            System.out.println("asfas fasf asas ew         asdfds faas df");
            System.out.println(e.getMessage());//Попробовать вызвать еще раз эту функцию\
        }
        return null;
    }
    public String enterBirthday(){
        System.out.println("Введите дату рождения (dd.mm.yyyy): ");
        try (Scanner enter = new Scanner(System.in)) {
            return enter.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());//Попробовать вызвать еще раз эту функцию
        }
        return null;
    }
    public String enterTelephoneNumber(){
        System.out.println("Введите номер телефона без (+,-) и без пробелов: ");
        try (Scanner enter = new Scanner(System.in)) {
            return enter.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());//Попробовать вызвать еще раз эту функцию
        }
        return null;
    }
    public String sex(){
        System.out.println("Введите пол латиницей f или m: ");
        try (Scanner enter = new Scanner(System.in)) {
            return enter.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());//Попробовать вызвать еще раз эту функцию
        }
        return null;
    }
}
