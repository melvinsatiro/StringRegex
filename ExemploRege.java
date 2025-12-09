import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploRegex {
  public static void main(String[] args) {
    String textoOriginal = "O filme foi ruim, o som estava ruim, mas a pipoca estava boa.";
    String padrao = "ruim"; // O texto a ser procurado
    String substituicao = "bom"; // O texto para substituir

    // 1. Compila o padrão de regex
    Pattern pattern = Pattern.compile(padrao);

    // 2. Cria o Matcher para o texto
    Matcher matcher = pattern.matcher(textoOriginal);

    // 3. Executa a substituição em todas as ocorrências
    // A linha correta é 'replaceAll'
    String novoTexto = matcher.replaceAll(substituicao);

    System.out.println("Original: " + textoOriginal);
    System.out.println("Substituído: " + novoTexto);
    // Saída: Substituído: O filme foi bom, o som estava bom, mas a pipoca estava
    // boa.
  }
}
