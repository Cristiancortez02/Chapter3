package Fly;

public class Airplane implements Flight {
    private String model;
    private int year;

    public Airplane(String model, int year){
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void fly() {
        System.out.println(getYear() + getModel() + "I'm a bird that flaps my wings to fly.");
    }

    @Override
    public String toString(){

        return "Model= " + model + ", Year= " + year;
    }
}
