package domainobjects;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DOB {
    private int day;
    private int month;
    private int year;

    public DOB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean set(int d,int m,int y) {
        String DATE_FORMAT ="dd-MM-yyyy";
        String date = String.valueOf(d)+"-"+String.valueOf(m)+"-"+String.valueOf(y);
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        }
        catch (ParseException e) {
            return false;
        }
    }
}