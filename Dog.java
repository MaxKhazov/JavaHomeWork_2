package Seminar_2_Hw;



public class Dog extends Home_Animal {

    protected String have_training;

    public Dog(String name, String breed, String vacination, String body_color, Integer birthday, String have_training) {
        this.name = name;
        this.breed = breed;
        this.vacination = vacination;
        this.body_color = body_color;
        this.birthday = birthday;
        this.have_training = have_training;
    }

    public Dog() {
	}

	public void trainDog(){
        System.out.println("Вы начали дрессировку...");
    }

    @Override
    public void getSound() {
        System.out.println("Гав-гав!");
        
    }

    @Override
    public String getInfo() {
        
        return String.format("Собака\nКличка: %s\nПорода: %s\nПрививки: %s\nЦвет: %s\nДата рождения: %s\nНаличие дрессировки: %s",
        this.name, this.breed, this.vacination, this.body_color, this.birthday, this.have_training);
    }

    
}
