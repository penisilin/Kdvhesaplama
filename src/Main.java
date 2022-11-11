import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18 ,kdvTutar, kdvliTutar;
        Scanner imput = new Scanner(System.in);
        System.out.println("Ücret Tutarı Giriniz : ");
        tutar = imput.nextDouble();
        kdvTutar = tutar * kdvOran ;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV siz Tutar : " + tutar);
        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV Tutarı  : " + kdvTutar);
        System.out.println("KDV li Tutar : " + kdvliTutar);
    }
}