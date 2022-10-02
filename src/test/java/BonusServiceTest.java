import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @CsvFileSource(files="src/test/java/resources/data.csv")
    @ParameterizedTest
    public void shouldCalcBonus(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        // long amount = 1000_60;
        // boolean registered = true;

        //long bonus = service.calculate(amount, registered);
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}