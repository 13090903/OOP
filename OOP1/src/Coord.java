public class Coord {
    final int x, y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coord move(Direction direction) {
        return  new Coord(x  + direction.x, y + direction.y);
    }

    @Override
    public String toString() {
        return "Coord{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
