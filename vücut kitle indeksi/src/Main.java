import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // variables
        double l, w, indeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz : ");
        l = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        w = input.nextDouble();
        indeks = w / (l*l);
        System.out.print("Vücut Kitle İndeksiniz : " + indeks);

    }
}
