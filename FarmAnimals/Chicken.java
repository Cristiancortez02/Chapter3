package FarmAnimals;

public class Chicken extends FarmAnimal{
    protected String sound;

    public Chicken(String name, String gender, double weight, int age, String sound) {
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
    public void feedLoadingSchedule() {
        System.out.println(getName() + ": 8am-4pm");
    }

    @Override
    public String toString(){
        return "Cock-a-Doodle-doo ";
    }
}
