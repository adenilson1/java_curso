package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program04Instanciando {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2025-10-15");
		LocalDateTime d02 = LocalDateTime.parse("2025-10-15T01:30:26");
		Instant d03 = Instant.parse("2025-10-15T01:30:26Z");

		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		LocalDate nextYearLocalDate = d01.plusYears(1);

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("nextYearLocalDate = " + nextYearLocalDate);

		System.out.println("===================================================");

		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		LocalDateTime nextHourLocalDateTime = d02.plusHours(7);

		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		System.out.println("nextHourLocalDateTime = " + nextHourLocalDateTime);

		System.out.println("===================================================");

		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		System.out.println("===================================================");
		
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
//		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0,0), d01.atTime(0,0));
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant, d03);
		Duration t4 = Duration.between(d03, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t3 dias = " + t4.toDays());

	}

}
