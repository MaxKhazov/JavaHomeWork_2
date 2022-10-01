package Seminar_2_Hw;


public abstract class Home_Animal implements Animal {
    String name;
    String breed;
    String vacination;
    String body_color;
    Integer birthday;

    

    public void do_kindness(){
        System.out.println("Проявляет ласку...");
    }
}
