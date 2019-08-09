package DateTime;

public class ExtendedTime extends DateTime {
    private int millisecond;

    public ExtendedTime(){

    }

    public ExtendedTime(int millisecond) {
        super(12,13,14);
        this.millisecond = millisecond;

    }

    public ExtendedTime (ExtendedTime extendedTime){
        this.millisecond = extendedTime.millisecond;

    }

    public void setMillisecond(int millisecond) {
        this.millisecond = millisecond;
    }

    @Override
    public String toString() {
        return (super.toString()+"."+(millisecond));
    }

    public void printFullTime (){
        System.out.println(toString());
    }
}

