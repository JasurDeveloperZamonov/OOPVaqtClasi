public class Main {
    public static void main(String[] args) {
        MyTime m=new MyTime();
        m.setTime(23,59,59);
        System.out.println();
        m.nextSecond();
        System.out.println();
        m.nextMinut();
        System.out.println();
        m.nextHour();
        System.out.println();
        m.previousSecond();
        System.out.println();
        m.previousMinute();
        System.out.println();
        m.oldingiHour();
    }
}