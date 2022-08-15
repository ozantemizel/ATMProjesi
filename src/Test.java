import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
         int numberOfAttempt=3;
         int balance=1500;
         int select,price;

         while (numberOfAttempt>0){
             System.out.print("Kullanıcı adını giriniz: ");
             userName= input.nextLine();

             System.out.print("Şifrenizi giriniz: ");
             password=input.nextLine();

             if(userName.equals("patika")&&password.equals("dev123")){
                 System.out.println("Merhaba. Kodluyoruz bankasına hoşgeldiniz.");
                 do {
                     System.out.println("1.Bakiye Sorgulama\n" +
                             "2.Para Yatırma\n" +
                             "3.Para Çekme\n" +
                             "4.Çıkış");
                     System.out.print("Lütfen yapmak istediğiniz işlemi tuşlayınız:");
                     select=input.nextInt();
                     switch (select){
                         case 1:
                             System.out.println("Hesabınızdaki total bakiye: "+balance);
                             break;
                         case 2:
                             System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                             price = input.nextInt();
                             balance+=price;
                             System.out.println("Güncel bakiyeniz: "+balance);
                             break;
                         case 3:
                             System.out.print("Çekmek istediğiniz tutarı giriniz:");
                             price =input.nextInt();
                             if(price>balance){
                                 System.out.println("Bakiye yetersiz");
                             }else{
                                 balance-=price;
                                 System.out.print("Çekmek istediğiniz tutarı giriniz:");
                             }
                             break;
                     }
                 }while (select!=4);
                 System.out.println("Tekrar Görüşmek Üzere");
                 break;

             }else{
                 System.out.println("Maalesef hatalı giriş yaptınız. Tekrar deneyiniz.");
                 numberOfAttempt--;
                 System.out.println("Kalan giriş hakkınız: "+numberOfAttempt);
                 if(numberOfAttempt==0){
                     System.out.println("Hesabınız bloke olmuştur.");
                 }
             }




         }

    }
}
