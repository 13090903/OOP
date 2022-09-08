public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.talk());
        System.out.println(a.walk(new Direction(2, 5)));
        System.out.println(a.walk(new Direction(1, -1)));
    }
}
