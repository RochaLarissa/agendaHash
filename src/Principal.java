import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Hash hash = new Hash(5);
		
		Contato c2 = new Contato(24, "Francisco", "3333-3333", "00/00/00", "moema@email.com", "99999-9999");
		
		hash.inserir(new Contato(15, "Moema", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));
		hash.inserir(new Contato(24, "Francisco", "3333-3333", "00/00/00", "moema@email.com", "99999-9999"));
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
		System.out.println("Deletar");
		hash.deletar("Maria");
		System.out.println(hash);
		System.out.println("Deletar");
		hash.deletar("Roberta");
		System.out.println(hash);
		
//		System.out.println("------------ AGENDA TELEFÔNICA ------------");
//		
//		Scanner scanner = new Scanner(System.in);
//		Hash minhaAgenda = new Hash(26);
//		Menu menu = new Menu();				
//		int operador = 0;
//		
//		while(operador != 5) {			
//			menu.menuInicial();
//			operador = scanner.nextInt();
//			
//			switch (operador) {
//				case 1: 				//ADD NOVO CONTATO
//					System.out.println("Nome:");
//					String nome = scanner.next();					
//					int codigo = minhaAgenda.verificaCodigo(nome);
//					System.out.println("Telefone:");
//					String telefone = scanner.next();
//					System.out.println("Data de Nascimento:");
//					String nascimento = scanner.next();
//					System.out.println("Email:");
//					String email = scanner.next();
//					System.out.println("Celular:");
//					String celular = scanner.next();
//					
//					Contato contato = new Contato(codigo, nome, telefone, nascimento, email, celular);
//					minhaAgenda.inserir(contato);
//					break;
//					
//				case 2:  				//EXCLUIR
//					System.out.println("Informe o nome completo do contato que deseja excluir:");
//					String nomeCompleto = scanner.next();
//					minhaAgenda.deletar(nomeCompleto);
//					break;
//					
//				case 3: 				//PESQUISAR
//					System.out.println("Informe o nome completo do contato que deseja localizar:");
//					String nomeCompleto1 = scanner.next();
//					System.out.println(minhaAgenda.buscarPorNome(nomeCompleto1));
//					break;
//					
//				case 4:  				//VER TODOS
//					minhaAgenda.exibirTodos();
//					break;
//					
//				case 5: 				//SAIR
//					break;
//			}
//				
//				
//			
//			
//		}
//		
	}

}
