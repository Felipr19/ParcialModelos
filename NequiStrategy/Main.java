public class Main {
    public static void main(String[] args) {}

        // Create a user and set their preferences
        User user = new User();
        user.setBalancePref("1"); // 1 for balance alert, 2 for deactivated
        user.setTransactionPref("2"); // 1 for instant, 2 for daily, 3 for weekly
        user.setPromoPref("1"); // 1 for SMS, 2 for email
        
        User.notification();
    }