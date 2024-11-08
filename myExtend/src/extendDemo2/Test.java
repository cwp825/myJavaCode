package extendDemo2;

public class Test {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.breakHome();
        h.drink();
        h.lookHome();

        ChineseDog c = new ChineseDog();
        c.eat();
        c.drink();
        c.lookHome();
        h.eat();
    }
}
