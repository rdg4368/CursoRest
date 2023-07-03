package exemplos;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;

public class APIUtils {
    private static final String BASE_URL = "https://fakestoreapi.com";

    public static Response enviarRequisicaoGET(String endpoint) {
        return RestAssured.get(BASE_URL + endpoint);
    }

    // Outros métodos úteis para configuração, envio de requisições, etc.
}