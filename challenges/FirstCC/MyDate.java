package challenges.FirstCC;
import java.util.Date;


public class MyDate extends Date{
    
    private int year;
    
    public MyDate(int year){
        this.year = year;
    }


    public int getDate(){
        return this.year;
    }
}

