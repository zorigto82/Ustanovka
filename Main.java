package com.company.Ustanovka;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        File dir = new File("C://Games//src");
        File dir1 = new File("C://Games//res");
        File dir2 = new File("C://Games//savegames");
        File dir3 = new File("C://Games//temp");
        File file = new File("C://Games//src//main");
        File file1 = new File("C://Games//src//test");
        File file2 = new File("C://Games//res//drawables");
        File file3 = new File("C://Games//res//vectors");
        File file4 = new File("C://Games//res//icons");

        if (dir.mkdir()) {
            System.out.println("Каталог создан");
        }
        if (dir1.mkdir()) {
            System.out.println("Каталог создан");
        }
        if (dir2.mkdir()) {
            System.out.println("Каталог создан");
        }
        if (dir3.mkdir()) {
            System.out.println("Каталог создан");
        }
        if (file.mkdir()) {
            System.out.println("Каталог создан");
        }
        if (file1.mkdir()) {
            System.out.println("Каталог создан");
        }
        if (file2.mkdir()) {
            System.out.println("Каталог создан");
        }
        if (file3.mkdir()) {
            System.out.println("Каталог создан");
        }
        if (file4.mkdir()) {
            System.out.println("Каталог создан");
        }

        File myFile = new File("C://Games//src//main//Main.java");
        File myFile1 = new File("C://Games//src//main//Utils.java");
        File myFile2 = new File("C://Games//temp//temp.txt");

        try {
            if (myFile.createNewFile()) {
                System.out.println("Файл был создан");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            if (myFile1.createNewFile()) {
                System.out.println("Файл был создан");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            if (myFile2.createNewFile()) {
                System.out.println("Файл был создан");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        sb.append(dir);
        sb.append(dir1);
        sb.append(dir2);
        sb.append(dir3);
        sb.append(file);
        sb.append(file1);
        sb.append(file2);
        sb.append(file3);
        sb.append(file4);
        sb.append(myFile);
        sb.append(myFile1);
        sb.append(myFile2);

        String text = sb.toString();

        try (FileWriter writer = new FileWriter("C://Games//temp//temp.txt", false)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileReader reader = new FileReader("C://Games//temp//temp.txt")) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
