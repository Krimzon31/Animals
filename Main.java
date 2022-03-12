package com.company;

public class Main {
    public static class Animal{
        Animal animal;
        public String Name;
        private String food;
        public String location;
        public String setFood(){
            return food;
        }

        Animal(String Name,String food,String location){
            this.Name = Name;
            this.food=food;
            this.location=location;
        }
        public void eat(){
            System.out.println("*звуки поедания пищи* \n ест ");
        }
        public void makeNoise(){
            System.out.println("шумит");
        }
        public void sleep(){
            System.out.println("спит");
        }
        public void displayInfo(){
            System.out.println("location: " + location);
            System.out.println("food: " + food);
        }
    }

    static class Dog extends Animal{
        private String dost = "верный друг и хороший помошник";

        Dog(String Name,String food,String location) {
            super(Name, food, location);
        }

        @Override
        public void eat() {
            System.out.println("Собака ест " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("Собака гавкает");
        }

        @Override
        public void sleep() {
            System.out.println("Собака спит ");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("плюс: " + dost);
        }
    }
    static class Hourse extends Animal{
        private String plus = "можно кататься";
        Hourse(String Name,String food,String location) {
            super(Name, food, location);
        }
        @Override
        public void eat() {
            System.out.println("Лошадь ест " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("лошадь игогокает");
        }

        @Override
        public void sleep() {
            System.out.println("лошадь спит");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("плюс: " + plus);
        }
    }
    static class Cat extends Animal{
        private String plus = "Помогает уснуть и мило выглядит";
        Cat(String Name,String food,String location) {
            super(Name, food, location);
        }

        @Override
        public void eat() {
            System.out.println("кот кушает " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("кот мяукает");
        }

        @Override
        public void sleep() {
            System.out.println("кот спит");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("плюс " + plus);
        }
    }
    static class Veterenar{

        void treatAnimal(Animal animal) {
            System.out.print(" food :" + animal.food);
            System.out.println("\n location: " + animal.location);
            System.out.println( animal.Name + " на приеме у Ветеринара");
        }
    }


    public static void main(String[] args) {
        Veterenar vet = new Veterenar();
        Animal dog = new Dog("Шарик", "Хлеб, мясо и морковка", "дома");
        Animal cat = new Cat("Валера","все мясные продуты и вообще всё что угодно", "будка");
        Animal hourse = new Hourse ("Игогоша","марковка и яблоки", "конюшня");
        dog.displayInfo();
        vet.treatAnimal(dog);
        cat.displayInfo();
        vet.treatAnimal(cat);
        hourse.displayInfo();
        vet.treatAnimal(hourse);
    }
}
