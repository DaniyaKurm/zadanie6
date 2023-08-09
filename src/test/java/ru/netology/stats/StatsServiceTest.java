package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public int salesLenght() {
        StatsService service = new StatsService();

        int[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 8;
        int actualDay = service.minSales(7);

        Assertions.assertEquals(expectedDay, actualDay);

    }
}
