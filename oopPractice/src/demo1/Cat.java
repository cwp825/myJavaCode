package demo1;

public class Cat extends Animal{


    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void eat(String something){
        System.out.println(this.getAge()+"的"+this.getColor()+"色的猫咪着眼睛侧着头吃"+something);
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
