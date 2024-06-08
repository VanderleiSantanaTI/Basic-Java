import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BuscaCEP {
    private static final String VIA_CEP_URL = "https://viacep.com.br/ws/";

    public static void main(String[] args) {
        String cep = "06401015"; // Exemplo de CEP
        String jsonResposta = buscarCEP(cep);

        if (jsonResposta != null) {
            // Usando String.split() para parsear JSON de forma simples
            String[] keyValuePairs = jsonResposta.replace("{", "").replace("}", "").replace("\"", "").split(",");
            for (String pair : keyValuePairs) {
                String[] entry = pair.split(":");
                System.out.println(entry[0].trim() + ": " + entry[1].trim());
            }
        } else {
            System.out.println("Erro ao buscar informações do CEP.");
        }
    }

    public static String buscarCEP(String cep) {
        String url = VIA_CEP_URL + cep + "/json/";
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) { // HTTP OK
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                return response.toString();
            } else {
                System.out.println("Erro na requisição: " + responseCode);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
