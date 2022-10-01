package FarmAnimals;

import java.time.LocalTime;

public class Duck extends FarmAnimal{
    protected String sound;

    public Duck(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void feedLoadingSchedule(){
        System.out.println(getName() + ": 8am-12am-6pm");
    }
    @Override
    public String toString(){
        return "Quack Quack ";
    }
}
