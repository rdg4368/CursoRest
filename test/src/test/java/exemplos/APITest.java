package exemplos;

import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class APITest {
    @Test
    public void validarRespostaAPI() {
        APIUtils.enviarRequisicaoGET("/products/1")
            .then()
            //.statusCode(200)
            .body("id", equalTo(1))
            .body("price", equalTo(109.95));
    }

    // Outros métodos de teste
}