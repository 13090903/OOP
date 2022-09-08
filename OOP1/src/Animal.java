
public abstract class Animal {

    Coord position;

    public Animal(Coord position) {
        this.position = position;
    }


    Coord walk(Direction direction) {
        this.position = position.move(direction);
        return this.position;
    }

    abstract String talk();
}
