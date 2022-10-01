package Seminar_2_Hw;

public class Chicken extends Bird{

    public Chicken(Integer fly_height){
        this.fly_height = fly_height;
    }

    @Override
    public void getSound() {
        System.out.println("Ко-ко-ко-ко-ко");
        
    }

    @Override
    public String getInfo() {
        return String.format("Это просто курица.");
    }
    
}
