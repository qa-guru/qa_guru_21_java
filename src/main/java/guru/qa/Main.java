package guru.qa;

public class Main {

    public static void main(String[] args) {
        // Примитивные типы данных
        boolean isNameIvan = false;
        Boolean isName = false;
        boolean unbox = isName;

        byte varByte = 0;  // -128 ... 127
        short varShort = 0; // -32768 ... 32767
        int varInt = 0; // -2147483648 ... 2147483647
        long varLong = 0; //
        char varChar = '0';
        float varFloat = 0.0F;
        double varDouble = 0.0;

        // Операторы
        // Арифметические + - * / % ++ --
        int var = 10;
        var = ++var;

        // Операторы сравнения < > <= >= != ==
        System.out.println( 10.0 == 10);

        // Логические операторы &&(&)  ||(|) , !
        String name = "Dima";
        int age = 34;

        System.out.println(!(age == 44 || name.equals("Dima")));

        // Оператор присвоения = += -= *=
        age += 10;
        age = age + 10;

        // Оператор instanceof
        boolean isNameTypeString = name instanceof String;

        // Теранрный оператор
        char sex = 'm';

        String childName = (sex == 'm')
                ? "Valera"
                : "Maria";

        if (sex == 'm') {
            childName = "Valera";
        } else if (sex == 'w') {
            childName = "Maria";
        } else {
            childName = "Undefined";
        }

        switch (name) {
            case "Valera" : {
                System.out.println("Happy Valera!");
                break;
            }
            case "Maria" : {
                System.out.println("Happy Maria!");
                break;
            }
            default: {
                System.out.println("Don`t known (");
            }
        }


        String statement = "Hello " + " World!";
        System.out.println(statement);
    }

}