package com.company;

public class Main {

    public static void main(String[] args) {

        int yearOfBirthday = 2000;
        int monthOfBirthday = 6;
        int dayOfBirthday = 6;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println(sum + " Сумма из года, месяца и дня моего рождения");

        boolean monthBiggerday = monthOfBirthday > dayOfBirthday;
        System.out.println(monthBiggerday);

        char name[] = new char[]{'Д', 'а', 'н', 'и', 'л', 'а'};
        System.out.print("Массив с моим именем: ");
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }
        System.out.println();

        double myAge = 20.0;
        double partAge = 4.0 / 12.0;
        double sumAge = myAge + partAge;
        System.out.println(" Мне " + sumAge + " лет");
    }
}
