public class BalanceAlert implements  NotificationStrategy {
    private String preference;

    @Override
    public void sendNotification() {
        System.out.println("User Balance Alert preference set to: " + preference);
        if (this.preference.equals("1")) {
            System.out.println("Alert: Your balance is below the threshold!");
        } else if (this.preference.equals("2")) {
            System.out.println("Alert: Your balance notification is deactivated!");
        } else {
            System.out.println("No alert set for this preference.");
        }
    }

    @Override
    public void setUserPreference(String preference) {
        this.preference = preference;
        // treshhold(1) or desactivated(2)
    }
}
