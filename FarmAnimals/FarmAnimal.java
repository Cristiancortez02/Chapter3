package FarmAnimals;

public abstract class FarmAnimal {
    private final String name;
    private final String gender;
    private final double weight;
    private final int age;

    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public abstract void feedLoadingSchedule();

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }


    public int getAge() {
        return age;
    }




    @Override
    public String toString(){

        return "Name: " + name + "Gender: " + gender + "Weight: " + weight + "Age: " + age;
    }
}
