package demo1;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public void keepPet(Dog dog,String something){
        System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
        dog.eat(something);
    }

    public void keepPet(Cat cat,String something){
        System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");
        cat.eat(something);
    }*/

    public void keePet(Animal animal,String something){
        if(animal instanceof Dog ){
            Dog dog =(Dog) animal;
            System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
            dog.eat(something);
        }else if(animal instanceof  Cat){
            Cat cat = (Cat) animal;
            System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");
            cat.eat(something);
        }else {
            System.out.println("没有这种动物");
        }
    }
}
