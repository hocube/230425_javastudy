package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex07_LocalDate {
	public static void main(String[] args) {
		// java version 8.0 이상만 가능
		// LocalDate : 날짜 정보만 필요할 때
		// LocalTime : 시간 정보만 필요할 때
		// LocalDateTime : 날짜, 시간 모두 필요할 때

		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);

		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);

		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		System.out.println();

		System.out.println("--날짜--");
		System.out.println("getYear() : " + cDate.getYear()); // 년도
		System.out.println("getMonth() : " + cDate.getMonth()); // May
		System.out.println("getMonthValue() : " + cDate.getMonthValue()); // 월(1,2,3...)
		System.out.println("getDayOfYear() : " + cDate.getDayOfYear()); // 년의 몇번째 일(365일 중 며칠 지났는지)
		System.out.println("getDayOfMonth() : " + cDate.getDayOfMonth()); // 일
		System.out.println("getDayOfWeek() : " + cDate.getDayOfWeek()); // 요일(MONDAY)
		System.out.println("isLeapYear() : 윤년여부 " + cDate.isLeapYear()); // 윤년 여부
		System.out.println(); // boolean형은 is가 붙음

		System.out.println("--시간--");
		System.out.println("getHour() : " + cTime.getHour());
		System.out.println("getMinute() : " + cTime.getMinute());
		System.out.println("getSecond() : " + cTime.getSecond());
		System.out.println("getNano() : " + cTime.getNano());
		// 1970년 1월 1일 UTC 첫 번째 순간 이후의 현재 시간까지의 나노 초를 나타내는 값
		// 초끼리 연산할때 사용함.
		System.out.println();

		System.out.println(cDate.format(DateTimeFormatter.BASIC_ISO_DATE)); // 국제표준화기구
		System.out.println(cDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println(cdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS")));
		System.out.println();

		System.out.println("--날짜 차이 계산--");
		LocalDate sDate = LocalDate.now(); // 현재
		LocalDate eDate = LocalDate.of(2024, 6, 20); // 설정 날짜
		Period period = Period.between(sDate, eDate); // 두 날짜의 차이 구하기

		System.out.println(period.getYears()); // 년 1년
		//↓ 한달이 30일도 있고 31일도 있기 때문에 조심해서 사용해야 함.
		System.out.println(period.getMonths()); // 월 1개월
		System.out.println(period.getDays()); // 일 5일 차이
		//↓ 그래서 보통 이걸 많이 씀
		System.out.println(ChronoUnit.DAYS.between(sDate, eDate));  
		System.out.println();
		
		System.out.println(sDate.plusYears(2));   //sDate(현재)에서 2년 지난 날짜
		System.out.println(sDate.plusMonths(2));  //sDate(현재)에서 2개월 지난 날짜
		System.out.println(sDate.plusDays(15));   //sDate(현재)에서 15일 지난 날짜

		
	}// main
}// class