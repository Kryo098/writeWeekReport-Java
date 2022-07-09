import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    LocalDate now = LocalDate.now();
    LocalDate getFriday = now.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
    LocalDate getMonday = getFriday.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
    final List<String> weekPack = new ArrayList<String>();
    final String StrMonday = getMonday.toString().replaceAll("-", "/").substring(8 - 2);
    final String StrFriday = getFriday.toString().replaceAll("-", "/").substring(8 - 2);
    final String week = StrMonday + "~" + StrFriday;
    final String write = "の週報を書け";
    System.out.println(week + write);
  }
}
