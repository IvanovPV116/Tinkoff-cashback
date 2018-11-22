public class Main {
    public static void main(String[] args) {
        CashbackService service = new CashbackService();
        int cachback = (int) service.calculateCashback (-1000, 1, 1);
        if (cachback >=3001) cachback = 3000;
        System.out.println(cachback);
    }
}
