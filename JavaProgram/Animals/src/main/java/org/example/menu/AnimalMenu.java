package org.example.menu;

import org.example.model.Cat;
import org.example.model.Dog;
import org.example.model.Hamster;
import org.example.repository.AnimalRepository;

import java.util.Scanner;

public class AnimalMenu {
    public static void animalMenu() {
        AnimalRepository animalRepository = new AnimalRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер операции: \n1. Добавить животное в базу;\n2. Вывести лист комманд; \n3. Добавить команду; \n4. Выход;\nВвод: ");
        int numOperation = scanner.nextInt();
        if(numOperation == 1) {
            System.out.print("Введите данные домашнего животного");
            System.out.print("Какое животное хотите добавить? \n1.Собачку;\n2.Котика;\n3.Хомячка;\nВвод: ");
            int animalNum = scanner.nextInt();
            if(animalNum == 1) {
                Dog dog = Dog.createDog();
                animalRepository.addAnimal(dog);
                System.out.println(animalRepository.toString());
            } if(animalNum == 2) {
                Cat cat = Cat.createCat();
                animalRepository.addAnimal(cat);
                System.out.println(animalRepository.toString());
            } if(animalNum == 3) {
                Hamster hamster = Hamster.createHamster();
                animalRepository.addAnimal(hamster);
                System.out.println(animalRepository.toString());
            }
        }
        if(numOperation == 2) {
            System.out.print("Выберите животное, чтобы узнать его команды: \n1.Собачки;\n2.Котика;\n3.Хомячка;\nВвод: ");
            int animalNum = scanner.nextInt();
            if(animalNum == 1) {
                Dog dog = new Dog();
                System.out.print("Выберите команду для собачки: \n1.Голос;\n2.Сидеть;\n3.Вольер;\nВвод: ");
                int commandNum = scanner.nextInt();
                if(commandNum == 1) {
                    System.out.println(dog.voiceCommand());
                } if(commandNum == 2) {
                    System.out.println(dog.sitCommand());
                } if(commandNum == 3) {
                    System.out.println(dog.homeCommand());
                }
            } if(animalNum == 2) {
                Cat cat = new Cat();
                System.out.print("Выберите команду для котика: \n1.Голос;\n2.Сидеть;\n3.Вольер;\nВвод: ");
                int commandNum = scanner.nextInt();
                if(commandNum == 1) {
                    System.out.println(cat.voiceCommand());
                } if(commandNum == 2) {
                    System.out.println(cat.sitCommand());
                } if(commandNum == 3) {
                    System.out.println(cat.homeCommand());
                }
            } if(animalNum == 3) {
                Hamster hamster = new Hamster();
                System.out.print("Выберите команду для хомяка: \n1.Голос;\n2.Сидеть;\n3.Вольер;\nВвод: ");
                int commandNum = scanner.nextInt();
                if(commandNum == 1) {
                    System.out.println(hamster.voiceCommand());
                } if(commandNum == 2) {
                    System.out.println(hamster.sitCommand());
                } if(commandNum == 3) {
                    System.out.println(hamster.homeCommand());
                }
            }
        }
        if(numOperation == 3) {
            System.out.print("Выберите животное, чтобы научить его новой команде: \n1.Собачки;\n2.Котика;\n3.Хомячка;\nВвод: ");
            int animalNum = scanner.nextInt();
            if(animalNum == 1) {
                Dog dog = new Dog();
                System.out.println("Команда " + dog.addCommand().toLowerCase() + " " + "добавлена");
            } if(animalNum == 2) {
                Cat cat = new Cat();
                System.out.println("Команда " + cat.addCommand().toLowerCase() +" " + "добавлена");
            }if(animalNum == 3) {
                Hamster hamster = new Hamster();
                System.out.println("Команда " + hamster.addCommand().toLowerCase() + " " + "добавлена");
            }
        }
    }
}
