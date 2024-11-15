package demo2;

public class Frog extends Animal {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" 吃虫子");
    }
}
