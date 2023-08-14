package Practice_Day08;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateTime03 {

    // Belirli bir tarih girip o günden bugüne geçen zamanı gün saat dakika saniye olarak yazdırın.

    public static void main(String[] args) {
        LocalDateTime startDate=LocalDateTime.of(2022,6,27,14,00);
        LocalDateTime currentDate=LocalDateTime.now();

        Duration duration=Duration.between(startDate,currentDate);

        long day= duration.toDays();
        long hour= duration.toHoursPart();
        long minutes= duration.toMinutesPart();
        long seconds= duration.toSecondsPart();

        System.out.println("Evliliğimizde bugün: "+day+".gün "+hour+".saat "+minutes+".dakika "+seconds+".saniye geride kaldı");
    }
}
