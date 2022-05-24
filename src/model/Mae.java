package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "mae")
public class Mae {

	@Id
	@Column(name = "cpf_mae", length = 11)
	@NotNull
	private String cpf;
	
	@Column(name = "nome_mae", length = 60)
	@NotNull
	private String nome;
	
	@Column(name = "logradouro_endereco", length = 100)
	@NotNull
	private String logradouroEndereço;
	
	@Column(name = "numero_endereco")
	@NotNull
	private int numeroEndereco;
	
	@Column(name = "cep_endereco", length = 8)
	@NotNull
	private String cepEndereco;
	
	@Column(name = "complemento_endereco", length = 200)
	private String complementoEndereco;
	
	@Column(name = "data_nascimento")
	@NotNull
	private LocalDate dataNascimento;
	
	@Column(name = "telefone_mae", length = 10)
	@NotNull
	private String telefone;
	
	public String getLogradouroEndereço() {
		return logradouroEndereço;
	}

	public void setLogradouroEndereço(String logradouroEndereço) {
		this.logradouroEndereço = logradouroEndereço;
	}

	public int getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getCepEndereco() {
		return cepEndereco;
	}

	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	public String getComplementoEndereco() {
		return complementoEndereco;
	}

	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Mae [cpf=" + cpf + ", nome=" + nome + ", logradouroEndereço=" + logradouroEndereço + ", numeroEndereco="
				+ numeroEndereco + ", cepEndereco=" + cepEndereco + ", complementoEndereco=" + complementoEndereco
				+ ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + "]";
	}
	
}
