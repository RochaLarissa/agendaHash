
public class Hash {
	
	private int tamanhoHash;
	
	private Lista[] vetor;

	public Hash(int tamanhoHash) {
		this.tamanhoHash = tamanhoHash;
		vetor = new Lista[tamanhoHash];
		for (int i = 0; i < tamanhoHash; i++) {
			vetor[i] = new Lista();
		}
	}
	
	public void inserir(Contato contato) { 
		int chave = contato.getCodigo() % tamanhoHash;
		vetor[chave].inserirContato(contato);
	}

	public void deletar(String nome) { 
		if(buscarPorNome(nome) != null) {
			Contato contato = buscarPorNome(nome);
			int chave = contato.getCodigo() % tamanhoHash;
			vetor[chave].deletarContato(contato);
		} else {
			System.out.println("Impossível deletar, contato não encontrado!");
		}
	}
	
	public Contato buscar(int codigo) {
		Contato retorno = vetor[codigo % tamanhoHash].buscarContato(codigo);
		System.out.println(retorno);
		return retorno;
	}

	public Contato buscarPorNome(String nome) {		
		for (int i = 0; i < tamanhoHash; i++) {
			if (vetor[i].buscarContatoPorNome(nome) != null) {				
				return vetor[i].buscarContatoPorNome(nome);
			};
		}
		System.out.println("Contato nao encontrado");
		return null;
	}

	@Override
	public String toString() {
		String out = "";
		for (int i = 0; i < tamanhoHash; i++) {
			out += "" + i + ": ";
			out += vetor[i % tamanhoHash] + "\n";
		}
		return out;
	}
	
	

}
