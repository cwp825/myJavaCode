package demo1;

public class TestDemo1 {
    public static void main(String[] args) {
        Person p = new Person("老王",30);
        Dog d = new Dog(2,"黑");
        Cat c  = new Cat(3,"灰");

        /*p.keepPet(d,"骨头");
        p.keepPet(c,"鱼");*/
        p.keePet(d,"骨头");
        p.keePet(c,"鱼");

    }
}
