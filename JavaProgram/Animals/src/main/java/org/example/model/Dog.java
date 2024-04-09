package org.example.model;

import org.example.impl.AnimalCommand;

import java.util.Scanner;

public class Dog extends Animal implements AnimalCommand {
    public Dog(int id, String name, String breed) {
        super(id, name, breed);
    }

    public Dog() {
    }

    @Override
    public String voiceCommand() {
        return "Гав - Гав";
    }

    @Override
    public String sitCommand() {
        return "Пёсик сел";
    }

    @Override
    public String homeCommand() {
        return "Вернулся в домик";
    }

    public static Dog createDog() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        System.out.print("Порода: ");
        String breed = scanner.nextLine();
        System.out.print("Введите id собаки: ");
        int id = scanner.nextInt();

        Dog dog = new Dog();
        dog.setId(id);
        dog.setName(name);
        dog.setBreed(breed);
        return dog;
    }

    @Override
    public String addCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String newCommand = scanner.nextLine();
        return newCommand;
    }
}
