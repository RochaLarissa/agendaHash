import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		HashMap<K, V>
		
		Hash hash = new Hash(5);
		
		hash.inserir(new Contato(15, "Moema", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));
		hash.inserir(new Contato(24, "Francisco", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));
		hash.inserir(new Contato(53, "Maria", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));
		hash.inserir(new Contato(12, "Roberta", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));
		hash.inserir(new Contato(74, "Heitor", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));

		
		System.out.println(hash);
		
		System.out.println("Buscando por codigo");
		hash.buscar(24);
		
		System.out.println("Buscando por nome");
		hash.buscarPorNome("Moemaa");
		
		System.out.println("Deletar");
		hash.deletar("Moema");
		System.out.println(hash);
		
		
	}

}
