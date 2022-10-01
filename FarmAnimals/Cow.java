package FarmAnimals;

public class Cow extends FarmAnimal{
    protected String sound;

    public Cow(String name, String gender, double weight, int age, String sound) {
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
        System.out.println(getName() + ": 6am-4pm");
    }

    @Override
    public String toString() {
        return "Moo Moo ";
    }
}
