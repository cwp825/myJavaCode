package dmeo4;

public class TableTennisSporter extends Sporter implements English{
    public TableTennisSporter() {
    }

    public TableTennisSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习打乒乓球");
    }


    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员讲英语");

    }
}
