public class Promos implements NotificationStrategy{
    private String preference;

    @Override
    public void sendNotification() {
        System.out.println("Promo Alert: New promotional offer available! \n Description: *example \n sent from:"+ this.preference);
    }

    @Override
    public void setUserPreference(String preference) {
        this.preference = preference;
        // sms(1) or email(2)
    }

} 