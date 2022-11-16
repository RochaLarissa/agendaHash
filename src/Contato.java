import java.util.Objects;

public class Contato {
	
	private int codigo;
	
	private String nome;

	private String telefone;
	
	private String nascimento;

	private String email;
	
	private String celular;

	public Contato(int codigo, String nome, String telefone, String nascimento, String email, String celular) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.email = email;
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Contato [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + ", nascimento=" + nascimento
				+ ", email=" + email + ", celular=" + celular + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(celular, other.celular) && codigo == other.codigo && Objects.equals(email, other.email)
				&& Objects.equals(nascimento, other.nascimento) && Objects.equals(nome, other.nome)
				&& Objects.equals(telefone, other.telefone);
	}
	
	
	

}
