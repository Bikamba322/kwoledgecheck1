import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();
        accList.add(new Account(98, "Akacu Ketsia", "Debit", "120000","0.5"));
        accList.add(new Account(63, "Umutesi Asma", "Credit", "230000","0.2"));
        accList.add(new Account(721, "Murekatete Nasrat", "Checking", "80000","0.4"));
        accList.add(new Account(905, "Mutoni Sifa", "Saving", "200000","0.3"));
        accList.add(new Account(230, "Bikamba Lucas", "Checking", "900000","0.1"));
        accList.add(new Account(160, "Brenda Fasi", "Debit", "320000","0.8"));
        accList.add(new Account(185, "Ernest Sugira", "Credit", "300000","0.6"));
        accList.add(new Account(818, "Mugisha Gilbert", "Debit", "110000","0.9"));
        accList.add(new Account(909, "Akami Makombe", "Saving", "330000","0.5"));
        accList.add(new Account(1220, "Eugene Mukabwa", "Checking", "650000","0.7"));



        for (Account acc:accList){
            System.out.println(acc);
        }
    }
}