public class Pegas implements MailDeliveryService {
    boolean epiphanny;


    public Pegas(boolean epiphanny) {
        this.epiphanny = epiphanny;
    }


    @Override
    public void sendMail() {
        if (epiphanny){
            System.out.println("Кинь письмо в сумку с овсом  !");
            System.out.println("Полетели!");
        } else {
            System.out.println("я в печали, сам лети!");
        }
    }

    @Override
    public String getName() {
        return "Ваш Пегас)))";
    }
}


