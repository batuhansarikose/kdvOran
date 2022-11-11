import java.util.Scanner;

public class main {
public static void main(String[] args) {


    double kdvOran = 0.18 , kdvOran2 = 0.08;
    int tutar ;
    Scanner input = new Scanner(System.in);
    System.out.println("Ürün fiyatını giriniz :");
    tutar = input.nextInt();

    double toplamKdv = (tutar <= 1000) ? tutar * kdvOran : tutar * kdvOran2;

    System.out.println("Kdv'siz Tutar : " + tutar);
    System.out.println("Kdv'li Tutar : " + (tutar+toplamKdv));
    System.out.println("Toplam Kdv : " + toplamKdv);

    double kdvorani = (tutar > 1000) ? kdvOran2 : kdvOran;
    System.out.println("Kdv Oranı:" + kdvorani);




}
}
