import java.util.Scanner;

public class MaiusculaMinuscula {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite algo?");

    String texto = scanner.nextLine();

    String maiuscula = texto.toUpperCase();

    String minuscula = texto.toLowerCase();

    System.out.println(maiuscula);

    System.out.println(minuscula);

  }
}
