package org.example.model;

import org.example.impl.AnimalCommand;

import java.util.Scanner;

public class Hamster extends Animal implements AnimalCommand {
    public Hamster(int id, String name, String breed) {
        super(id, name, breed);
    }

    public Hamster() {
    }

    @Override
    public String voiceCommand() {
        return "Голоса особо нет, только писк...";
    }

    @Override
    public String sitCommand() {
        return "Хомяк тихо сел";
    }

    @Override
    public String homeCommand() {
        return "Пошел к себе в домик";
    }

    public static Hamster createHamster() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        System.out.print("Порода: ");
        String breed = scanner.nextLine();
        System.out.print("Введите id собаки: ");
        int id = scanner.nextInt();

        Hamster hamster = new Hamster();
        hamster.setId(id);
        hamster.setName(name);
        hamster.setBreed(breed);
        return hamster;
    }

    @Override
    public String addCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String newCommand = scanner.nextLine();
        return newCommand;
    }
}
