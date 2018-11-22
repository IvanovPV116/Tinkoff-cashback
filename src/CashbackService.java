public class CashbackService {
    public int calculateCashback (int payment, int levelCachback, int period ) {
        int baseLevel = 1;
        int highLevel = 2;
        int superLevel = 3;
        int cashbackPercent;
        int cachback;

        if (levelCachback >= superLevel) {
            cashbackPercent = 30;
        } else if (levelCachback >= highLevel) {
            cashbackPercent = 5;
        } else {
            cashbackPercent = 1;
        }

        cachback =(payment/100)* cashbackPercent;

        if (cachback >=3001) {cachback = 3000;}

        if (cachback <0) {cachback = 0;}


        return cachback;
    }





}

