public class Owl implements MailDeliveryService{
    private String name;

    public Owl(String name) {
        this.name = name;
    }

    @Override
    public void sendMail() {
        System.out.println("Привет, Гарри Поттер! Куда лететь?");
    }

    @Override
    public String getName() {
        return "Owl " + name;
    }
}