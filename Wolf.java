package Seminar_2_Hw;

public class Wolf extends Wild_Animal {

    protected String leader;

    public Wolf(String habitat, Integer found_date, String leader){
        this.habitat = habitat;
        this.found_date = found_date;
        this.leader = leader;
    }

    @Override
    public void getSound() {
        System.out.println("Ррр... Ауууууууу.....");
        
    }

    @Override
    public String getInfo() {

        return String.format("Волк\nМесто обитания: %s\nДата нахождения: %s\nВожак стаи: %s",
         this.habitat, this.found_date, this.leader);
    }
    
}
