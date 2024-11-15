package dmeo4;

public class BaskeballSporter extends Sporter {
    public BaskeballSporter() {
    }

    public BaskeballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习打篮球");
    }
}
