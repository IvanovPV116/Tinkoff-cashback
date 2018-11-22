import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @org.junit.jupiter.api.Test
    void calculateCashback()
    {
        CashbackService service = new CashbackService();
        int cachback = (int) service.calculateCashback (-1000, 1, 1);
        assertEquals( 0, cachback);
        System.out.println( cachback);
    }{
        CashbackService service = new CashbackService();
        int cachback = (int) service.calculateCashback (1000, 1, 1);
        assertEquals(10, cachback);
        System.out.println( cachback);
    }{
        CashbackService service = new CashbackService();
        int cachback = (int) service.calculateCashback (1000, 2, 1);
        assertEquals(50, cachback);
        System.out.println(cachback);
    }{
        CashbackService service = new CashbackService();
        int cachback = (int) service.calculateCashback (1000, 3, 1);
        assertEquals(300, cachback);
        System.out.println(cachback);
    }{
        CashbackService service = new CashbackService();
        int cachback = (int) service.calculateCashback (555555, 3, 1);
        assertEquals(3000, cachback);
        System.out.println(cachback);
    }

}