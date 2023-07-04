package br.ce.wcaquino.tests;

import static io.restassured.RestAssured.*;

import org.junit.Test;

import br.ce.wcaquino.rest.core.BaseTest;

public class AppTest extends BaseTest  {

	@Test
	public void naoDeveAcessarAPISemToken() {
		given()
		.log().all()
		.when()
			.get("/contas")
		.then()
			.statusCode(401)
		;
	}
}
