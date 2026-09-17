package birds;

public class Penguin implements Bird {
    String currentLocation;
    int numberOfFeathers;

    @Override
    public void sing() {
        System.out.println("Penguin sings");
    }

    @Override
    public void eat() {
        System.out.println("Penguin eats");
    }

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}