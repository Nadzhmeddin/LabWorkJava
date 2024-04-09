package org.example.model;

public class Animal {

    private int id;
    private String name;
    private String breed;

    public Animal(int id, String name, String breed) {
        this.id = id;
        this.name = name;
        this.breed = breed;
    }

    public Animal() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal: {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
