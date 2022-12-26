package ru.gb.homework.View;


import java.util.Scanner;

public class OutConsole {
    Scanner enter = new Scanner(System.in);

    //    public void startInterface(){
//        System.out.println("Введите данные через пробел в следующем порядке: ");
//    }
    public boolean createUser() {
        System.out.println("Хотите создать нового пользователя? да/нет");
        String answer = null;
        try (Scanner enter = new Scanner(System.in)) {
            answer = enter.nextLine().toLowerCase();
            switch (answer){
                case "да" -> {
                    return true;

                }
                case "нет" -> {
                    return false;
                }

            }
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

        return false;
    }

    public String enterFullname() {
        System.out.println("Введите ФИО чсерез пробел: ");
        try (Scanner enter = new Scanner(System.in)) {
            return enter.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public String enterBirthday(){
        System.out.println("Введите дату рождения (dd.mm.yyyy): ");
        try (Scanner enter = new Scanner(System.in)) {
            return enter.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
