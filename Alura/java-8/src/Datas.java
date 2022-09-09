import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

  public static void main(String[] args) {
    LocalDate hoje = LocalDate.now();
    System.out.println(hoje);

    LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE,5);
    int anos = olimpiadasRio.getYear() - hoje.getYear();
    System.out.println(anos);

    Period period = Period.between(hoje, olimpiadasRio);
    System.out.println("Period: " + period);
    System.out.println("Period: getdays" + period.getDays());
    System.out.println("Period: getYear" + period.getYears());

    System.out.println("");
    System.out.println("Somando Datas");
    LocalDate dtSoma = hoje.plusYears(4);
    System.out.println("hoje + 4 anos = " + dtSoma);

    System.out.println("");
    System.out.println("Data Formatada");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String valorFormatado = hoje.format(formatter);
    System.out.println(valorFormatado);

    System.out.println("");
    System.out.println("Data Hora");
    DateTimeFormatter formatterDtHr = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
    LocalDateTime agora = LocalDateTime.now();
    System.out.println(agora.format(formatterDtHr));


    LocalTime intervalo = LocalTime.of(15, 30);
    System.out.println(intervalo);
  }

}
