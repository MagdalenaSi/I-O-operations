package com.collection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void zad1() throws FileNotFoundException {
        Scanner reading = new Scanner(new File("dane1.txt"));
        String row;
        System.out.println("Zad1");
        while (reading.hasNextLine())  //hasNextLine - check whether there is exist any line to read
        {
            row = reading.nextLine();
            System.out.println(row);
        }
        reading.close();
    }

    public static void zad2() throws FileNotFoundException {
        File file = new File("dane1.txt");
        Scanner scanner = new Scanner(file);
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum = sum + Integer.valueOf(scanner.next());
        }
        System.out.println("Zad2\nSuma wynosi " + sum);
    }

    public static void zad3() throws IOException {
        Path ścieżka = Paths.get("", "dane2.txt");
        String tekst = new String(Files.readAllBytes(ścieżka));
        System.out.println("Zad3\n" + tekst);
    }


    public static void zad4() throws IOException {
        RandomAccessFile plik = new RandomAccessFile("napis.txt", "r");
        plik.seek(15464);
        String wartość = plik.readLine();
        System.out.println("zad4\nWczytany tekst:  "+wartość);
    }

    public static void main(String[] args) throws IOException {
        zad1();
        zad2();
        zad3();
        zad4();

    }

}
