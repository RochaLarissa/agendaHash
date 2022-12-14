
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
		No no = inicio;
		No anterior = new No();
		No proximo = new No();
		
		if(tamanho == 1) {														//DELETANDO SE FOR O NO INICIAL
			inicio = null;
		} else {																//SE N?O FOR O NO INICIAL
			while (no != null) { 												// PERCORRE A LISTA
				if (contato.getCodigo() == no.getContato().getCodigo()) { 		// ENCONTRA O CONTATO A DELETAR
					proximo = no.getProximo(); 									// ENCONTRA O PROXIMO
					
					No noAnterior = inicio;
					try {
						while (noAnterior != null) { 								// PERCORRE A LISTA NOVAMENTE PARA ENCONTRAR O ANTERIOR
							if (no.getContato().getCodigo() == noAnterior.getProximo().getContato().getCodigo()) {
								anterior = noAnterior; 								// ENCONTRA O ANTERIOR
								anterior.setProximo(proximo); 						// FAZ A REMO??O DO CONTATO DESEJADO DA LISTA
								break;
							}
							noAnterior = noAnterior.getProximo();
						}
					} catch (Exception e) {}
				} 																// SAI DO LA?O
				no = no.getProximo(); 											// SAI DO OUTRO LA?O
			}			
		}		
		tamanho--;
	}

	public Contato buscarContato(int codigo) {
		No no = inicio;
		while (no != null) {
			if (no.getContato().getCodigo() == codigo) {
				return no.getContato();
			}
			no = no.getProximo();
		}
		return null;
	}

	public Contato buscarContatoPorNome(String nome) {
		No no = inicio;
		while (no != null) {
			if (nome.equalsIgnoreCase(no.getContato().getNome())) {
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
