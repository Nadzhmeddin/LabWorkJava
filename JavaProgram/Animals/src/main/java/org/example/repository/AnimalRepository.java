package org.example.repository;

import org.example.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    private List<Animal> animalList = new ArrayList<>();

    public AnimalRepository(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public AnimalRepository() {
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void findByName(String name) {
        for (Animal animal1 : animalList) {
            if(animal1.getName().equals(name)) {
                System.out.println(animal1);
            }
            else throw new RuntimeException("animal not found");
        }
    }


    @Override
    public String toString() {
        return "Animals: \n" +
                "animalList=" + animalList +
                '}';
    }
}
