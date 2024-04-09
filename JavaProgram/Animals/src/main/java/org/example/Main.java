package org.example;

import org.example.menu.AnimalMenu;
import org.example.model.Animal;
import org.example.model.Cat;
import org.example.model.Dog;
import org.example.model.Hamster;
import org.example.repository.AnimalRepository;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        AnimalMenu menu = new AnimalMenu();
        AnimalMenu.animalMenu();
    }
}
