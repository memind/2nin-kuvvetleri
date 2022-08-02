import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = inp.nextInt();

        System.out.println("4'ün, "+k+" sayısından küçük kuvvetleri");
        for (int i = 1; i <= k; i*=4){System.out.println(i + "");}
        System.out.println("5'in, "+k+" sayısından küçük kuvvetleri");
        for (int i = 1; i <= k; i*=5){System.out.println(i + "");}
    }
}