package poo.ejercicioclase.ejercicio2.entrada;

import java.util.Scanner;

public class InputConsoleService{

    public static Scanner scanner;

    public static void createScanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
    }

    public static Scanner getScanner(){
        createScanner();
        return scanner;
    }

    public static void closeScanner(){
        if(scanner != null){
            scanner.close();
        }
    }

}
