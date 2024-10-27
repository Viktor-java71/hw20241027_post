import java.util.Scanner;

/* создать программу,которая предоставляет пользователю возможность отослать письмо одним из 3 возможных способов:
 DHL, E-Mail, Owl. Необходимо реализовать один общий метод отправки почты, который в качестве параметра получает
 способ отправки почты. Реализация каждого из способов, должна быть выполнена отдельным методом
 (каждый метод может просто выводить на экран соответствующее сообщения, например, в случае DHL, что то типа:
  «кладу письмо в конверт, клею марку, иду на  почту»). Выбор способа отправки определяется пользователем, например
  через Scanner


 */



public class Main {
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите способ доставки почты:");
        MailDeliveryService[] deliveryServices = mailSender.getDeliveryServices();
        for (int i=0; i<deliveryServices.length; i++){
            System.out.println(i+" "+deliveryServices[i].getName());
        }
        int selectedServiceNumber = scanner.nextInt();
        if(selectedServiceNumber<0 || selectedServiceNumber>=deliveryServices.length){
            System.out.println("Ошибка ввода");
        } else {
            mailSender.sendMail(deliveryServices[selectedServiceNumber]);
        }



    }
}