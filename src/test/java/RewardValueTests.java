import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {

    @Test
    public void testCashToMilesConversion() {
        // Given a cash value of 100
        RewardValue rewardValue = new RewardValue(100.0);
        // Expected miles value = 100 / 0.0035
        double expectedMilesValue = 100.0 / 0.0035;
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), 0.0001);
    }

    @Test
    public void testMilesToCashConversion() {
        // Given a miles value of 10000
        RewardValue rewardValue = new RewardValue(10000);
        // Expected cash value = 10000 * 0.0035
        double expectedCashValue = 10000 * 0.0035;
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.0001);
    }

    @Test
    public void testGetCashValue() {
        // Given a cash value of 50
        RewardValue rewardValue = new RewardValue(50.0);
        // Expected cash value should be exactly 50
        assertEquals(50.0, rewardValue.getCashValue(), 0.0001);
    }

    @Test
    public void testGetMilesValue() {
        // Given a miles value of 5000
        RewardValue rewardValue = new RewardValue(5000);
        // Expected miles value should be exactly 5000
        assertEquals(5000, rewardValue.getMilesValue(), 0.0001);
    }
}
