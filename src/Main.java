import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now(); // Fecha actual

        System.out.println(fechaActual); // Fecha de hoy
        System.out.println(fechaActual.getDayOfWeek()); // Dia de la semana
        System.out.println(fechaActual.getYear()); // Obtener el año, mes, dia
        System.out.println(fechaActual.getMonth()); // Obtener el año, mes, dia
        System.out.println(fechaActual.getDayOfMonth()); // Obtener el año, mes, dia
    }
}