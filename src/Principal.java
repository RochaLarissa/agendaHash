
public class Principal {

	public static void main(String[] args) {
		
		Hash hash = new Hash(5);
		
		Contato c2 = new Contato(24, "Francisco", "3333-3333", "00/00/00", "moema@email.com", "99999-9999");
		
		hash.inserir(new Contato(15, "Moema", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));
		hash.inserir(c2);
		hash.inserir(new Contato(53, "Maria", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));
		hash.inserir(new Contato(12, "Roberta", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));
		hash.inserir(new Contato(74, "Heitor", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));

		
		System.out.println(hash);
		
		System.out.println("Buscando por codigo");
		hash.buscar(24);
		
		System.out.println("Buscando por nome");
		System.out.println(hash.buscarPorNome("Moema"));
		
		System.out.println("Deletar");
		hash.deletar("Francisco");
		System.out.println(hash);
		
		
	}

}
