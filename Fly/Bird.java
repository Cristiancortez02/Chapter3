package Fly;

public class Bird implements Flight {
    private String type;

    public Bird(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void fly() {
        System.out.println(getType() + "I'm a bird that flaps my wings to fly.");
    }

    @Override
    public String toString(){

        return "Type= " + type;
    }
}
