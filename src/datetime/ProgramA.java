package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramA {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern ("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDate d02 = LocalDate.from(LocalDateTime.now());
        Instant d03 = Instant.now();  // Z = GMT

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); //PA DRAO ISO8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); //especificando TIMEZONE

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println(d01);
        System.out.println("d02= " +d02);
        System.out.println("d03= " +d03);
        System.out.println("d04= " +d04);
        System.out.println("d05= " +d05);
        System.out.println("d06= " +d06);
        System.out.println("d07= " +d07);
        System.out.println("d08= " +d08);
        System.out.println("d09= " +d09);
        System.out.println("d10= " +d10);
        System.out.println("d11= " +d10);

    }
}
