package Seminar_2_Hw;

public class Stork extends Bird {

    public Stork(Integer fly_height){
        this.fly_height = fly_height;
    }

    @Override
    public void getSound() {
        System.out.println("*красивые звуки аиста*");
        
    }

    @Override
    public String getInfo() {

        return String.format("Красивый аист, но он не живет в зоопарке.");
    }
    
}
