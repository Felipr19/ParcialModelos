

public class User {
    BalanceAlert balanceAlert;
    TransactionNotify transactionNotify;
    Promos promos;

    public void setBalancePref(String preference) {
        this.balanceAlert.setUserPreference(preference);
    }

    public void setTransactionPref(String preference) {
        this.transactionNotify.setUserPreference(preference);
    }
    public void setPromoPref(String preference) {
        this.promos.setUserPreference(preference);
    }

    public void notification(){
        this.balanceAlert.sendNotification();
        this.transactionNotify.sendNotification();
        this.promos.sendNotification();
    }
}
