package dmeo4;

public abstract class Sporter extends Person {
    public Sporter() {
    }

    public Sporter(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
