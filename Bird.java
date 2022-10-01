package Seminar_2_Hw;

public abstract class Bird implements Animal {
    protected Integer fly_height;

    public String doFly(){
        return String.format("Я лечу на %d метрах!", this.fly_height);
    }


}
