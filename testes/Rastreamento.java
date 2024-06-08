import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Rastreamento {
    private static final String BASE_URL = "https://www.linkcorreios.com.br/?id=";

    public static void main(String[] args) {
        String trackingCode = "ti170831802br";
        String status = rastrearEncomenda(trackingCode);
        System.out.println(status);
    }

    public static String rastrearEncomenda(String cod) {
        try {
            // Faz a requisição GET para a URL com o código de rastreamento
            Document doc = Jsoup.connect(BASE_URL + cod).get();

            // Encontre o div desejado que contém a ul
            Element divDesejado = doc.selectFirst("ul.linha_status");

            if (divDesejado != null) {
                return divDesejado.text().strip();
            } else {
                return "\nOBJETO SEM INFORMAÇÃO";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "\nOBJETO SEM INFORMAÇÃO";
        } finally {
            System.out.println("\n\n============TDS===============\n\n");
        }
    }
}
