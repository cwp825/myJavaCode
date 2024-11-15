package dmeo4;

public class Test {
    public static void main(String[] args) {
        BaskeballSporter bs = new BaskeballSporter("崔永熙", 23);
        BasketballCoach bc = new BasketballCoach("姚明",33);
        TableTennisSporter ts = new TableTennisSporter("张继科",25);
        TableTennisCoach tc = new TableTennisCoach("刘国梁",35);

        System.out.println(bs.getName()+", "+bs.getAge());
        System.out.println(bc.getName()+", "+bc.getAge());
        System.out.println(ts.getName()+", "+ts.getAge());
        System.out.println(tc.getName()+", "+tc.getAge());

        bs.study();
        bc.teach();
        ts.speakEnglish();
        ts.study();
        tc.teach();
        tc.speakEnglish();
    }
}
