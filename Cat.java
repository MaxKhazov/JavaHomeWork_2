package Seminar_2_Hw;

public class Cat extends Home_Animal {

    protected String have_wool;

    public Cat(String name, String breed, String vacination, String body_color, Integer birthday, String have_wool) {
        this.name = name;
        this.breed = breed;
        this.vacination = vacination;
        this.body_color = body_color;
        this.birthday = birthday;
        this.have_wool = have_wool;
    }
    

    @Override
    public void getSound() {
        System.out.println("Мяяяяуууу...");
        
    }

    @Override
    public String getInfo() {
        return String.format("Кот\nКличка: %s\nПорода: %s\nПрививки: %s\nЦвет: %s\n Дата рождения: %s\n Наличие шерсти: %s",
                this.name, this.breed, this.vacination, this.body_color, this.birthday, this.have_wool);
        
    }
    
}
