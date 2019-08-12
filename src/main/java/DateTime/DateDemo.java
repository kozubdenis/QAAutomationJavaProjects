package DateTime;

public class DateDemo {
    public static void main(String[] args) {

        //Date dateDemo = new Date(); //возьмет значения по умолчанию (1.1.1970)

        Date dateDemo = new Date(13, 11, 1988);
        dateDemo.printData();

        dateDemo.print(Date.Format.RU);
        dateDemo.print(Date.Format.USA);
        dateDemo.print(Date.Format.ENG);
        dateDemo.print(Date.Format.UK);

        try {
            DateTime timeDemo = new DateTime(0, 59, 59);

            timeDemo.printTime();
            timeDemo.printDateTime();


        } catch (IllegalTimeException e) {
            e.printStackTrace();
        }

//        ExtendedTime extendedTime = new ExtendedTime(111);


//        extendedTime.printFullTime();

    }
}