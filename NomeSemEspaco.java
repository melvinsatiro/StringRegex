import java.util.Scanner;

public class NomeSemEspaco {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome completo");

    String nome = scanner.nextLine();

    String formate = String.format(nome.trim());

    System.out.println("Nome completo: " + formate);
  }
}
