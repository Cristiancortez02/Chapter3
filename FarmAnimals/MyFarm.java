package FarmAnimals;

import java.util.Arrays;

public class MyFarm {
    public static void main(String[] args) {

        FarmAnimal[] animals = new FarmAnimal[6];

        FarmAnimal[0] = new Duck("Donald", "male", 3.2, 5, "Quack Quack");
        FarmAnimal[1] = new Duck("Cheese","female",3.6,3,"Quack Quack");
        FarmAnimal[2] = new Cow("Molly", "female", 1600.0, 5,"Moo Moo");
        FarmAnimal[3] = new Chicken("Albert", "male", 1.6, 2,"Cock-a-Doodle-doo");
        FarmAnimal[4] = new Chicken("Amelia", "female", 1.8, 4,"Cluck Cluck");
        FarmAnimal[5] = new Chicken("Dixie", "female", 1.7, 4,"Cluck Cluck");

    }
}
