package lesson02;

public class DataTypes {
    //    комментарий 01
    //    комментарий 02
    /* многострочный
    комментарий
     */
    /**
     * документация - это инструкция по пользованию прокета
     */

    public static void main (String[] args) {
        // точка входа в приложение ( на одно приложение - одна точка входа)
        // без главного метода приложение не запускается
        System.out.println("Консольный вывод ...");
        //тип данных имяПеременной

        int yearOfBirth; //объявление переменной, принято писать полным именем (Code Convension)
        int height, length;  //однотипные переменные можно объявлять вместе

        yearOfBirth = 1987; // присваивание значения переменной (инициализация переменной)
        yearOfBirth = 1990; // НЕ ИНИЦИАЛИЗАЦИЯ, просто присвоение значение, т.к. она уже была инициализорована
        length = 50;
        height = 37;

        int numberOfPearce = 10;  // объявление с инициализацией
        int numberOfApples = 30, numberOfBannanes = 40; // множественное объявление с инициализацией


        numberOfApples = 100;

        System.out.println(numberOfBannanes); //вывод переменной в консоль
        System.out.println(numberOfApples);

        //  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // примитивные типы данных
        // ссылочные типы данных

        byte readByte = 87;
        short eserAge = 35;
        long temp = 12l, planetAge = 40_000_000_000_000L;
        // l или L - явно указывают на тип long
        System.out.println(planetAge);

        float outsideTemp = -12.5f, catAge = 4.5f;
        double weight = 200.5;

        System.out.println(outsideTemp);
        System.out.println(weight);

        boolean isActive = true;     // логический тип данных, используется для хранения состояний
        boolean isConnected = false; // или для хранения условий, дя вествления кода или совершения последовательных действий

        char aLetter = 'a';  // примитивный тип данных, может быть записан как один символ в одинарных ковычках
                            // либо его номер таблице Uni-cod

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

        //Прведение типов
        int numberOfStones01 = 12_000;
        long numberOfStones02 = numberOfStones01; // автоматическое приведение типов, т.к. мы перекладываем из меньшего в большее

        System.out.println(numberOfStones01);
        System.out.println(numberOfStones02);

        int distance = 100;
        byte smallDistance = (byte) distance;  // если есть потеря данных (из большего в меньшее), то необходимо явное приведение типа

        // объявление переменных через var, появилось в JDK 10 версииб ранее не доступно
        // при объявлении переменной через var иннициализация ОБЯЗАТЕЛЬНА!

        var version = 10;       // автоматически определила, что это int
        var bigNumber = 10L;    // автоматически определила, что это long
        var name01 = "Элиза";   // автоматически определила, что это String
        var connected = true;   // boolean
        var balance = 4000.8;   // автоматически определила, что это double
        var numberOfHourse = 50.5F; // автоматически определила, что это float
        var price = (short) 290; // автоматически определила, что это short, через явное приведение

    }
}
