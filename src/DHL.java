public class DHL implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Покупаем конверт и марку");
        System.out.println("Кладем письмо, клеем марку, бежим на почту");
        System.out.println("отправлено!");
    }

    @Override
    public String getName() {
        return "DHL";
    }
}
