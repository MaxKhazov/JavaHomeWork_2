package Seminar_2_Hw;

import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> anlist = new ArrayList<>();
    Dog dg = new Dog();
    int countAnimal = 0;

    public void addInZoo() {
        anlist.add(new Dog("Вася","Бигль","Да","Цвет",2015, "Да" ));
        System.out.println("Животное добавлено!");
        countAnimal++;
    }

    public void deleteFromZoo(){
        anlist.remove(anlist.get(0));
        System.out.println("Животное удалено!");
        countAnimal--;
    }

    public void currentGetInfo(){
        System.out.println(anlist.get(1).getInfo());
        System.out.println("----------");

    }
    public void currentGetSound(){
        anlist.get(0).getSound();
    }
    public void getAllInfo(){
        System.out.println("Животных в зоопарке:");
        System.out.println(countAnimal);
        System.out.println("---------");
        for (int i = 0; i < countAnimal; i++) {
            System.out.println(anlist.get(i).getInfo());
            System.out.println("----------");
        }
    }
    public void getAllSound(){
        for (int i = 0; i < countAnimal; i++) {
            anlist.get(i).getSound();
            System.out.println("----------");
        }
    }
} 