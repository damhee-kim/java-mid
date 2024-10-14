package lang.immutable.test;

public class ImmutableMyDate {

    private int year;
    private int month;
    private int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public ImmutableMyDate withYear(int newYear) {
        // yaer의 값만 바꿔주기위해서 해당 년에 대한 새로운 객체를 생성해 주었다.
        return new ImmutableMyDate(newYear, month, day);
    }
    public int getMonth() {
        return month;
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }

    public int getDay() {
        return day;
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
