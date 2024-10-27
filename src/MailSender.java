import java.io.FilterOutputStream;
import java.util.Arrays;

public class MailSender {
    private final MailDeliveryService[] deliveryServices = {
            new DHL(),
            new EMail(),
            new Owl("Буклю"),
            new Pegas(true),
    };


    public void sendMail(MailDeliveryService deliveryService ){
        System.out.println("Отправляем почту с помощью " + deliveryService.getName());
        deliveryService.sendMail();
        System.out.println("----------- !!! отправлено успешно !!! ----");
    }

    public MailDeliveryService[] getDeliveryServices() {
        return Arrays.copyOf(deliveryServices, deliveryServices.length); // создаем копию
    }
}
