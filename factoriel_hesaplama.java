import java.util.Scanner;
/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
 N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */
//faktöriyel=1*2*3*4*...*n
public class factoriel_hesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int process1=1,process2=1,process3=1;
        int sonuc;
        System.out.print("kombinasyonunu hesaplamak istediğiniz sayıları giriniz\nn:");
        int n=input.nextInt();
        System.out.print("r:");
        int r=input.nextInt();
        System.out.println(n+" , "+r+" kombinasyonu");
        for(int i=1; i<=n;i++) {
            process1*=i;
        }
        for(int j=1;j<=r;j++) {
            process2*=j;
        }

        for(int k=1; k<=(n-r);k++) {
            process3*=k;
        }
        sonuc=(process1)/(process2 * process3);
        System.out.println("girilen sayıların kombinasyonu="+sonuc);
    }
}
