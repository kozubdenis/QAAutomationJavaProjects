package DateTime;

import javafx.scene.input.DataFormat;

public class Date {
    private int currentDay;
    private int currentMonth;
    private int currentYear;

    public enum Format
    {
        RU,
        USA,
        ENG,
        UK
    }
    //конструткор инициированный 1 января 1970
    public Date() {
        this.currentDay = 1;
        this.currentMonth = 1;
        this.currentYear = 1970;
    }

    //конструктор инициализирует все поля public Date(int day, int month, int year)
    public Date(int day, int month, int year) {
        this.currentDay = day;
        this.currentMonth = month;
        this.currentYear = year;
    }

    //конструктор копирования public Date(Date date)
    public Date(Date date){
        this.currentDay = date.currentDay;
        this.currentMonth = date.currentMonth;
        this.currentYear = date.currentYear;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public void setCurrentMonth(int currentMonth) {
        this.currentMonth = currentMonth;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public void set(Date date){
        this.currentDay = date.currentDay;
        this.currentMonth = date.currentMonth;
        this.currentYear = date.currentYear;
    }

    public void set(int day, int month, int year){
        this.currentDay = day;
        this.currentMonth = month;
        this.currentYear = year;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public int getCurrentMonth() {
        return currentMonth;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    //увеличиваeт на единицу значение дня
    public int nextDay(int currentDay){
        int nextDay = currentDay + 1;
        return nextDay;
    }

    //увеличиваeт на единицу значение месяца
    public int nextMonth(int currentMonth){
        int nextMonth = currentMonth + 1;
        return nextMonth;
    }

    //увеличиваeт на единицу значение года
    public int nextYear(int currentYear){
        int nextYear = currentYear + 1;
        return nextYear;
    }

    @Override
    public String toString() {
        return ((currentDay)+"."+(currentMonth)+"."+(currentYear));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public void printData(){
        System.out.println ((currentDay)+"."+(currentMonth)+"."+(currentYear));
    }

    // ОТображение даты согласно заданному формату из списка перечислений

    public void print(Format format){
        if (format == Format.RU){
            System.out.println ("Отображение даты в RU (Россия) формате: "
                    +(currentDay)+"."+(currentMonth)+"."+(currentYear));
        }

        if (format == Format.USA){
            System.out.println ("Отображение даты в USA (США) формате: "
                    +(currentMonth)+"-"+(currentDay)+"-"+(currentYear));
        }

        if (format == Format.ENG){
            System.out.println ("Отображение даты в ENG (Международный английский) формате: "
                    +(currentDay)+"-"+(currentMonth)+"-"+(currentYear));
        }

        if (format == Format.UK){
            System.out.println ("Отображение даты в UK (Великобритания) формате: "
                    +(currentDay)+"/"+(currentMonth)+"/"+(currentYear));
        }

        System.out.println ((currentDay)+"."+(currentMonth)+"."+(currentYear));
    }
}
