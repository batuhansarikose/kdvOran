import java.util.Scanner;

public class main {
public static void main(String[] args) {

    double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar ;
    Scanner input = new Scanner(System.in);
    System.out.println("Ücret tutarını giriniz: ");
    tutar = input.nextDouble();

    kdvTutar = tutar*kdvOran;
    kdvliTutar = tutar+kdvTutar;

    System.out.println("Kdv'siz tutar:" + tutar);
    System.out.println("Kdv oranı:" + kdvOran);
    System.out.println("Kdv tutarı: " + kdvTutar);
    System.out.println("Toplam tutar: " +kdvliTutar);




}
}
