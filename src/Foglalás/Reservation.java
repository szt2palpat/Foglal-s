package Foglalás;
import java.time.DayOfWeek;

public class Reservation implements Reservable {

    private final String code;
    private final DayOfWeek dayOfWeek;
    @Override
    public String GetCode() {

        return code;
    }

    @Override
    public DayOfWeek GetDay() {

        return dayOfWeek;
    }

    public Reservation(){
        StringBuilder s=new StringBuilder();
        for (int i=0;i<8;i++){
            int index;
            do{
               index=(int)Math.random()*43+48;

            }
            while(index>57 &&index<65);
            s.append((char)index);

        }
        code=s.toString();
        int dayIndex=(int)Math.floor(Math.random()*7);
        dayOfWeek=DayOfWeek.values()[dayIndex];



    }
@Override
    public String toString(){
        String Day=dayOfWeek.toString().substring(0,3);
        return code+" for "+Day;
    }
}
