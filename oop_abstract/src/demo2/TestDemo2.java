package demo2;

public class TestDemo2 {
    public static void main(String[] args) {
        Frog f = new Frog("蛙蛙",1);
        Dog d = new Dog("汪汪",2);
        Sheep s = new Sheep("咩咩",3);
        f.eat();
        f.drink();
        d.eat();
        d.drink();
        s.eat();
        s.drink();
    }
}
