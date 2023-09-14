import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String userName, password;
        int right = 3;
        int amount = 1500;
        int select;

        while (right > 0){
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("seyit") && password.equals("sey123")){
                System.out.println("Giriş Başarılı!!!");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                System.out.println("1-Para yatırma\n"+
                                    "2- Para Çekme \n"+
                                    "3- Bakiye Sorgula\n"+
                                    "4-Çıkış Yap" );
                select = input.nextInt();
                if (!(select > 4 || select <= 0)){
                    switch (select){


                        case 1:
                            System.out.print("miktar: " );
                            int price = input.nextInt();
                            System.out.println("bakiyeniz: " + (amount + price));
                            System.out.println("yatırma işlemi başarılı");
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            price = input.nextInt();
                            System.out.println("çekme işlemi başarılı");
                            System.out.println("bakiyeniz: " + (amount + price));
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + amount);
                            break;
                        case 4:
                            System.out.println("Sistem çıkış işlemi başarılı!");
                            break;
                    }
                }
                else {
                    System.out.println("ERROR");

                }

                break;
            }

            else {
                right--;
                System.out.println("Şifre veya kullanıcı adı hatalı: ");
                System.out.println("Kalan hakkınız: " + right) ;
                if (right == 0){
                    System.out.println("Hesap bloke olmuştur, bankanız ile iletişime geçiniz!!!");
                }
            }

        }
    }
}