
public class No {
	
	private Contato contato;
	
	private No proximo;
	
	public No() {
		
	}

	public No(Contato info, No proximo) {
		this.contato = info;
		this.proximo = proximo;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	

}
