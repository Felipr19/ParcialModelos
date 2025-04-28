public class TransactionNotify implements NotificationStrategy {
    private String preference;

    @Override
    public void sendNotification() {
        System.out.println("User preference set to: " + preference);;
    }

    @Override
    public void setUserPreference(String preference) {
        this.preference = preference;
        // instant (1) or daily (2) or weekly (3)
    }
    
}
