package dmeo4;

public class TableTennisCoach extends Coach implements English{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练讲英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教学乒乓球");
    }
}
