import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;double number2;

        System.out.print("Bir tam sayı gir:   ");
        number1 = input.nextInt();

        System.out.print("Bir ondalıklı sayı gir:   ");
        number2 = input.nextDouble();

      System.out.println(number1+" sayısı "+(double)number1+" olarak değiştirildi");
        System.out.println(number2+" sayısı "+(int)number2+" olarak değiştirildi");

        }

}
