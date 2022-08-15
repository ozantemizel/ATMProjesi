import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        int right=3; // Kalan giriş hakkı.
        int balance=1500;
        int select;

        while (right>0) {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();

            System.out.print("Parolanız: ");
            password = input.nextLine();
            if(userName.equals("patika")&&(password.equals("dev123"))){
                System.out.println("Merhaba, Kodluyoruz bankasına hoşgeldiniz.");
                do {
                    System.out.println("1.Para Yatırma\n" +
                            "2-Para Çekme\n"+
                            "3-Bakiye Sorgulama\n"+
                            "4-Çıkış yap.");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    select = input.nextInt();
                    if(select==1){
                        System.out.print("Para miktarı:");
                        int price = input.nextInt();
                        balance+=price;
                    }else if(select==2){
                        System.out.print("Çekmek istediğiniz tutar:");
                        int price = input.nextInt();
                        if(price>balance){
                            System.out.println("Bakiye yetersiz.");
                        }else {
                            balance-=price;
                        }
                    }else if(select==3){
                        System.out.println("Bakiyeniz: "+balance);
                    }
                }while (select!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else{
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz");
                right--;
                System.out.println("Kalan hakkınız: "+ right);
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                }
            }
        }


    }
}
