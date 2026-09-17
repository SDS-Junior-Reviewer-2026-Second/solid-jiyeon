package birds;

public class Eagle implements FlyableBird {
    String currentLocation;
    int numberOfFeathers;

    @Override
    public void sing() {
        System.out.println("Eagle sings");
    }

    @Override
    public void eat() {
        System.out.println("Eagle eats");
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
}