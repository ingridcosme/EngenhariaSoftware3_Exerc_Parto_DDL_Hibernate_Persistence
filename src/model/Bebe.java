package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe")
public class Bebe {

	@Id
	@Column(name = "cpf_bebe")
	@NotNull
	private int cpf;
	
	@Column(name = "nome_bebe", length = 60)
	@NotNull
	private String nome;
	
	@Column(name = "data_nascimento")
	@NotNull
	private LocalDate dataNascimento;
	
	@Column(name = "peso_bebe")
	@NotNull
	private double peso;
	
	@Column(name = "altura_bebe")
	@NotNull
	private double altura;
	
	@Column(name = "mae_bebe", length = 10)
	@NotNull
	private Mae mae;
	
	@Column(name = "medico_bebe", length = 7)
	@NotNull
	private Medico medico;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Mae getMae() {
		return mae;
	}

	public void setMae(Mae mae) {
		this.mae = mae;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	@Override
	public String toString() {
		return "Bebe [cpf=" + cpf + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
}

