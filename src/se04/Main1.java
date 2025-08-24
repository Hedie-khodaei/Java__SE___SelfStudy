package src.se04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main1 {
    public static void main(String[] args) {

        LocalDate birthdate;
        birthdate=LocalDate.of(2022,11,20);
        System.out.println(birthdate.plusDays(369));
        LocalDate date =LocalDate.now();
        System.out.println(date);
        LocalTime savedtime = LocalTime.of(20,15,48,678);
        System.out.println(savedtime);

       // LocalTime time = LocalTime.now();
        System.out.println(LocalTime.now());

       // LocalDateTime document =LocalDateTime.now();
        //System.out.println(LocalDateTime.now());

        LocalDateTime document =LocalDateTime.of(2024,12,15,18,30);
        System.out.println(document.plusDays(200).minusHours(400).plusMonths(8).plusMinutes(3000));




    }
}
