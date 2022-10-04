package Seminar_2_Hw;

import java.util.Scanner;

public class Program {

    private Scanner scanner;
    Zoo zoo = new Zoo();


    public Program(Scanner scanner) {
        this.scanner = scanner;
    }
 
    private void printMenu() {
        System.out.println("1. Добавить зверя в зоопарк");
        System.out.println("2. Удалить зверя из зоопарка");
        System.out.println("3. Посмотреть информацию о животном");
        System.out.println("4. Заставить животное издать звук");
        System.out.println("5. Информация обо всех животных в зоопарке");
        System.out.println("6. Заставить всех животных издать звук.");
        System.out.println("7. Завершить программу...");
    }
 
    public void start() {
        if (this.scanner != null) {
            int key;
            printMenu();
            do {
                System.out.print("Введите номер меню: ");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                        zoo.addInZoo();
                        break;
                    case 2:
                        zoo.deleteFromZoo();
                        break;
                    case 3:
                        zoo.currentGetInfo();
                        break;
                    case 4:
                        zoo.currentGetSound();
                        break;
                    case 5:
                        zoo.getAllInfo();
                        break;
                    case 6:
                        zoo.getAllSound();
                        break;
                    case 7:
                        System.out.println("Программа завершена!");
                        break;
                    default:
                        System.out.println("Такого пункта в меню нет! Попробуйте снова.\n");
                }
            } while (key != 7);
        }
    }
} 

class CaseMenuTest {
    public static void main(String[] args) {
        new Program(new Scanner(System.in)).start();
    }
}

    // public static void main(String[] args) {
    //     Dog doggy = new Dog("Вася","Бигль","Да","Цвет",2015, "Да" );
    //     Tiger tiger = new Tiger("Камчатский край", 2019);
    //     Chicken chicken = new Chicken(1);
    //     System.out.println(doggy.getInfo());
    //     doggy.getSound();
    //     System.out.println(tiger.getInfo());
    //     tiger.getSound();
    //     doggy.do_kindness();
    //     System.out.println(chicken.getInfo());
    //     System.out.println(chicken.doFly());
    //     chicken.getSound();


 
    
// }

