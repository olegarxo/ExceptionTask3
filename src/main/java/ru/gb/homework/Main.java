package ru.gb.homework;

import ru.gb.homework.Controller.Controller;

import java.security.cert.CertPath;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        boolean flag = true;
        while (flag){
            controller.start();
        }

    }
}