package ru.mirea.Panferov.task1;

import java.util.Scanner;

public class Program {
    static public void main(String[] args) {
        exceptionDemo();
        exceptionDemo2();
        Key key = new Key();
        key.getKey();
    }

    static public void exceptionDemo(){
        try{
            System.out.println(2 / 0);
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
    }
    static public void exceptionDemo2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Напишите число: ");
        String s = scanner.nextLine();
        try {
            int i = Integer.parseInt(s);
            System.out.println(2/i);
        }
        catch (NumberFormatException e){
            System.out.println("Вы ввели не число");
        }
        finally {
            System.out.println("Бебра");
        }
    }
}
