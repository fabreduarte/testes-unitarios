package com.example;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

// IMPORTANDO TODOS
import static org.junit.jupiter.api.Assertions.*;

// IMPORTAÇÃO UM POR UM
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsTeste {

	@Test
	void validarLancamento() {
		int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
		int[] segundoLancamento = { 10, 20, 30, 40, 50 };

		assertArrayEquals(primeiroLancamento, segundoLancamento);
	}

	@Test
	void validarSeObjetoEstaNulo() {
		Pessoa pessoa = null;
		assertNull(pessoa);

		pessoa = new Pessoa("Luciano", LocalDateTime.now());
		assertNotNull(pessoa);
	}

	@Test
	void validarNumerosDeTiposDiferentes() {

		double valor = 5.0;
		double valor1 = 5.0;

		assertEquals(valor, valor1);
	}

}
