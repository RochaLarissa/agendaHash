import java.util.Arrays;

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

	public void deletar(Contato contato) { 
		for (int i = 0; i < tamanhoHash; i++) {
			vetor[i].deletarContato(contato);
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
				System.out.println(vetor[i].buscarContatoPorNome(nome));
				return vetor[i].buscarContatoPorNome(nome);
			};
		}
		System.out.println("Contato n�o encontrado");
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
