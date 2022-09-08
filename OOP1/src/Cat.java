public class Cat extends Animal {

    @Override
    String talk() {
        return "Meow";
    }

    public Cat() {
        super(new Coord(0, 0));
    }
}
