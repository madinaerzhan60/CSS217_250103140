package CSS217_250103140.week10.task3;

public class SmsChannel implements MessageChannel {
    @Override
    public void transmit(String recipient, String message) {
        String condensed = message.replace("\n", " -- ");
        System.out.printf("[SMS PROTOCOL -> %s] %s%n", recipient, condensed);
    }
}
