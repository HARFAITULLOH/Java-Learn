import java.util.Scanner;

public class Fpb_Kpk {
    public static void main(String[] args) {

        System.out.println("Program Mencari KPK dan FPB");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama : ");
        var angka1 = scanner.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        var angka2 = scanner.nextInt();

        var a = Math.min(angka1, angka2);
        var b= Math.max(angka1, angka2);

        searchFpb(a, b);
        searchKpk(a, b);

    }

    //Program of Highest Common Factor (GDC)
    public static void searchFpb(int a, int b){
        for (var i = a; i > 0; i--){
            if (a%i == 0 && b%i == 0){
                System.out.println("FPB dari " + a + " dan " + b + " = " + i);
                break;
            }
        }
    }

    //Program of Lowest Common Multiple (LCM)
    public static void searchKpk(int a, int b){
        for (var i = 1; i <= a; i++){
            var hasil = b * i;
            if (hasil % a == 0){
                System.out.println("KPK dari " + a + " dan " + b + " = " + hasil);
                break;
            }
        }
    }
}
