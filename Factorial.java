import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Faktorial of : ");
        var data = scanner.nextInt();

        var factor = 1;
        for (var i = data; i > 0; i--){
            factor *= i;
        }
        System.out.println(factor);
      
    }
}  
