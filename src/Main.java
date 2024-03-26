import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); // Fecha actual

        System.out.println(today); // Fecha de hoy
        System.out.println(today.getDayOfWeek()); // Dia de la semana
        System.out.println(today.getYear()); // Obtener el año, mes, día
        System.out.println(today.getMonth()); // Obtener el año, mes, día
        System.out.println(today.getDayOfMonth()); // Obtener el numero de dia del mes.
        System.out.println(today.getDayOfYear()); // Obtener el numero de dia DEL AÑO.
        System.out.println(today.minusDays(7)); // quita cantidad de días.
        System.out.println("---------------------------");

        LocalDateTime todayFull = LocalDateTime.now();

        System.out.println(todayFull);

        DateTimeFormatter dtf01 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // BUENISIMOOOOOOOOOOOOOOOOOOOO

        System.out.println(todayFull.format(dtf01));
        System.out.println(todayFull.format(dtf02));
    }
}