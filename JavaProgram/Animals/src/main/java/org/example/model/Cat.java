package org.example.model;

import org.example.impl.AnimalCommand;

import java.util.Scanner;

public class Cat extends Animal implements AnimalCommand {
    public Cat(int id, String name, String breed) {
        super(id, name, breed);
    }

    public Cat() {
    }
    @Override
    public String voiceCommand() {
        return "Мяу-Мяууууууууу";
    }

    public static Cat createCat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        System.out.print("Порода: ");
        String breed = scanner.nextLine();
        System.out.print("Введите id котика: ");
        int id = scanner.nextInt();

        Cat cat = new Cat();
        cat.setId(id);
        cat.setName(name);
        cat.setBreed(breed);
        return cat;
    }

    @Override
    public String sitCommand() {
        return "Котик сел";
    }

    @Override
    public String homeCommand() {
        return "Котик тихонько вернулся на лежанку";
    }

    @Override
    public String addCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String newCommand = scanner.nextLine();
        return newCommand;
    }
}
