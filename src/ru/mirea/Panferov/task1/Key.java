package ru.mirea.Panferov.task1;

import java.util.Scanner;

public class Key {
    public void getKey() {
        Scanner scanner = new Scanner(System.in);
        try {
            String key = scanner.next();
            printKey(key);
        }
        catch (Exception e){
            getKey();
        }

    }
    public void printKey(String key){
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key){
        return "Data for " + key;
    }
}
