package Seminar_2_Hw;

public class Tiger extends Wild_Animal {
    public Tiger(String habitat, Integer found_date){
        this.habitat = habitat;
        this.found_date = found_date;
    }

    

    @Override
    public void getSound() {
        System.out.println("*Ооооочень громкое и бассистое рычание*");
        
    }

    @Override
    public String getInfo() {
        return String.format("Тигр\nМесто обитания: %s\nДата нахождения: %s", 
        this.habitat, this.found_date);
    }
    
}
