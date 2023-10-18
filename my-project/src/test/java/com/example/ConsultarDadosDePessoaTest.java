package com.example;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTest {

	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.iniciarConexao();
		System.out.println("Rodou ConfigurarConexão");

	}

	@BeforeEach
	void insereDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 00)));
	}

	@AfterEach
	void removeDadosParaTeste() {
		BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 00)));
	}

	@Test
	void validarDadosDeRetorno() {
		Assertions.assertTrue(true);
	}

	@AfterAll
	static void finalizarConexao() {
		BancoDeDados.finalizarConexao();
		System.out.println("Rodou finalizarConexao");

	}

}
