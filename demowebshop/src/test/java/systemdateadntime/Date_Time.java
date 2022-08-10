package systemdateadntime;

import java.time.LocalDateTime;

import net.bytebuddy.matcher.FieldTypeMatcher;

public class Date_Time {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now().toString().replace(':', '-'));
	}

}
