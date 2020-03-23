package io.github.joaopaulorosa.cantina.service;

import io.github.joaopaulorosa.cantina.model.Responsavel;

public interface ResponsavelService {

	public boolean isCPF(String CPF);
	public Responsavel buscaPorCPF(String CPF);

}
