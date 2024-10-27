public class EMail implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Запускаем OUTLOOK");
        System.out.println("Отправлено!");
    }

    @Override
    public String getName() {
        return "E-mail";
    }
}