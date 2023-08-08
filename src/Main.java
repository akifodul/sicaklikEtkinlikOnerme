import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        double sicaklik = input.nextDouble();

        if (sicaklik < 5) {
            System.out.println("Kayak yapmanı öneririm.");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinema etkinliğini öneririm.");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik etkinliğini öneririm.");
        } else {
            System.out.println("Yüzme etkinliğini öneririm.");


        }
    }
}