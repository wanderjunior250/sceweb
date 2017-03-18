package br.sceweb.modelo;

import java.util.InputMismatchException;

public class Empresa {
	private String cnpj;
	private String nomeFantasia;
	private String nomeDaEmpresa;
	private String telefone;
	private String endereco;

	public Empresa() {
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (nomeDaEmpresa.equals("")) {
			throw new IllegalArgumentException("Nome da empresa inválido!");
		} else {
			this.cnpj = cnpj;
		}
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		if (nomeDaEmpresa.equals("")) {
			throw new IllegalArgumentException("Nome da empresa inválido!");
		} else {
			this.nomeFantasia = nomeFantasia;
		}
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		if (nomeDaEmpresa.equals("")) {
			throw new IllegalArgumentException("Nome da empresa inválido!");
		} else {
			this.nomeDaEmpresa = nomeDaEmpresa;
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (nomeDaEmpresa.equals("")) {
			throw new IllegalArgumentException("Nome da empresa inválido!");
		} else {
			this.telefone = telefone;
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (nomeDaEmpresa.equals("")) {
			throw new IllegalArgumentException("Nome da empresa inválido!");
		} else {
			this.endereco = endereco;
		}
	}

}
