package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student st1 = new Student("James", 5000);
        Student st2 = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        st1.takeBus(bus100);
        st1.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        st2.takeSubway(subwayGreen);
        st2.showInfo();
        subwayGreen.showInfo();
    }
}
