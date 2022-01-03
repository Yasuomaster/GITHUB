package Homeworks.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.System.out;
public class Data {
    public static void main(String[] args) {
        //과제9) java.util.Date, java.text.SimpleDateFormat 을 임포트하고 현재 날짜를 2021-12-31 23:59:59 로 출력하시오.
        
        Date today = new Date();


        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

        out.println(date.format(today)+" " +  time.format(today));
  


        
    }
}
