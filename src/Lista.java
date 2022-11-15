
public class Lista {
	
	private No inicio;
	
	private int tamanho;
		
	public Lista() {
	}

	public Lista(int tamanho) {
		this.tamanho = tamanho;
	}

	public void inserirContato(Contato contato) {
		No no = new No();
		no.setContato(contato);
		no.setProximo(inicio);
		inicio = no;
		tamanho++;		
	}
	
	public void deletarContato(Contato contato) {		
		No no = new No();
		no.setContato(contato);
		
		No proximoNo = no.getProximo();
		tamanho--;		
		
//		no.setProximo(inicio);
//		inicio = no;
	}
	
	public Contato buscarContato(int codigo) {
		No no = inicio;
		while(no != null) {
			if(no.getContato().getCodigo() == codigo) {
				return no.getContato();
			}
			no = no.getProximo();
		}
		return null;
	}

	public Contato buscarContatoPorNome(String nome) {
		No no = inicio;
		while(no != null) {
			if(nome.equals(no.getContato().getNome())) {
				return no.getContato();
			}
			no = no.getProximo();
		}
		return null;
	}

	@Override
	public String toString() {
		String out = "";
		No no = inicio;
		while (no != null) {
			out += no.getContato() + " ";
			no = no.getProximo();
		}
		return out;
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
