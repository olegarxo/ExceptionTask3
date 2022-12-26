package ru.gb.homework.MyException;

public class NotFullEnterData extends IllegalStateException {

    public NotFullEnterData(String string) {
        super("Строка заполнена некоректно: " + string);
    }
}
