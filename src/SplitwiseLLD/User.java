package SplitwiseLLD;

import java.util.Map;

public class User {
    String name;
    String id;
    String phno;

    UserBalanceSheet userBalanceSheet;

    User(String name, String id, String pNo){
        this.name = name;
        this.id =id;
        this.phno=pNo;
        userBalanceSheet  = new UserBalanceSheet();
    }

}
