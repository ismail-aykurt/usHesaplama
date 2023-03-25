import java.util.Scanner;

public class usluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,us,total=1;
        System.out.print("Üssü alanacak  sayıyı giriniz:");
        sayi=input.nextInt();
        System.out.print("üs olacak sayıyı giriniz:");
        us=input.nextInt();
        for(int i=1;i<=us;i++) {
            total*=sayi;
        }
        System.out.println(sayi+"^"+us+"="+ total);
    }
}
