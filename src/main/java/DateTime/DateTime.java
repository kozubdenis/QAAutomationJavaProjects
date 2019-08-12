package DateTime;

public class DateTime extends Date {
    private int currentHour;
    private int currentMinute;
    private int currentSecond;

    public DateTime() {

    }


    public DateTime(int hour, int minute, int second) throws IllegalTimeException {
        if (hour < 0 || hour > 23) {
            System.out.println("большое значение для часа");
            throw new IllegalTimeException();
        }
        if (minute < 0 || minute > 59) {
            System.out.println("большое значение для минуты");
            throw new IllegalTimeException();
        }
        if (second < 0 || second > 59) {
            System.out.println("большое значение для секунды");
            throw new IllegalTimeException();

        }
        this.currentHour = hour;
        this.currentMinute = minute;
        this.currentSecond = second;
    }


    public DateTime(DateTime dateTime) {
        this.currentHour = dateTime.currentHour;
        this.currentMinute = dateTime.currentMinute;
        this.currentSecond = dateTime.currentSecond;
    }

    public int getCurrentHour() {
        return currentHour;
    }

    public void setCurrentHour(int currentHour) {
        this.currentHour = currentHour;
    }

    public int getCurrentMinute() {
        return currentMinute;
    }

    public void setCurrentMinute(int currentMinute) {
        this.currentMinute = currentMinute;
    }

    public int getCurrentSecond() {
        return currentSecond;
    }

    public void setCurrentSecond(int currentSecond) {
        this.currentSecond = currentSecond;
    }

    //увеличиваeт на единицу значение секунды
    public int nextSecond(int currentSecond) {
        int nextSecond = currentSecond + 1;
        return nextSecond;
    }

    //увеличиваeт на единицу значение минуты
    public int nextMinute(int currentMinute) {
        int nextMinute = currentMinute + 1;
        return nextMinute;
    }

    //увеличиваeт на единицу значение часа
    public int nextHour(int currentHour) {
        int nextHour = currentHour + 1;
        return nextHour;
    }

    @Override
    public String toString() {
        return ((currentHour) + ":" + (currentMinute) + ":" + (currentSecond));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void printTime() {
        System.out.println((currentHour) + ":" + (currentMinute) + ":" + (currentSecond));
    }

    public void printDateTime() {
        System.out.println((getCurrentDay()) + "." + (getCurrentMonth()) + "." + (getCurrentYear()) + " " + this.toString());
    }
}
