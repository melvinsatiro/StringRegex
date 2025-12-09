import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substituicao {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o texto: ");

    String texto = scanner.nextLine();

    System.out.println("Digite a palavra a ser subistituida:");

    String substituida = scanner.nextLine();

    // Usamos contains() para verificar (case-insensitive) se a palavra existe.
    if (!texto.toLowerCase().contains(substituida.toLowerCase())) {
      System.out.println("ERRO: A palavra '" + substituida + "' não foi encontrada no texto.");
      // ENCERRA a execução do programa conforme o requisito
      scanner.close(); // Boa prática: fechar antes de sair
      return;
    }

    System.out.println("Digite a palavra que irá substituir");

    String substituir = scanner.nextLine();

    Pattern pattern = Pattern.compile(substituida, Pattern.CASE_INSENSITIVE);

    Matcher matcher = pattern.matcher(texto);
    String novoTexto = matcher.replaceAll(substituir);

    System.out.println("Texto Original: " + texto);
    System.out.println("Novo texto: " + novoTexto);
    scanner.close();
  }

}
