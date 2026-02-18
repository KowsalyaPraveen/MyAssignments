package week7.day1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LearnTimeStamp {

	public static void main(String[] args) {
		
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        DateTimeFormatter requiredPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd,EEE HH_mm_ss a");
        String timeStamp = currentDateAndTime.format(requiredPattern);
        System.out.println(currentDateAndTime);
        System.out.println(timeStamp);
	}

}