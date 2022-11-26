import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Hash hash = new Hash(10);

		Scanner s = new Scanner(System.in);

		int opcao = 0;

		int codigo = 1;

		while (opcao!=5) {
			Menu.menuInicial();
			opcao = s.nextInt();
			switch (opcao) {
				case 1: // Adicionar Contato
					System.out.println("Informe o nome do contato: ");
					String nome = s.next();
					System.out.println("Informe o telefone: ");
					String telefone = s.next();
					System.out.println("Informe a data de nascimento: ");
					String nascimento = s.next();
					System.out.println("Informe o email: ");
					String email = s.next();
					System.out.println("Informe o celular: ");
					String celular = s.next();
					hash.inserir(new Contato(codigo, nome, telefone, nascimento, email, celular));
					System.out.println("Contato Inserido com sucesso");
					codigo++;
					break;

				case 2: //Excluir contato
					System.out.println("Digite o nome do contato que quer deletar: ");
					String nome1 = s.next();
					hash.deletar(nome1);
					break;

				case 3: // PESQUISAR DADO -
					System.out.println("Digite o nome do contato que quer procurar: ");
					String nome2 = s.next();
					System.out.println(hash.buscarPorNome(nome2));
					break;

				case 4: // Exibir a lista de contato
					hash.exibirTodos();
					break;

				case 5: // Encerrar
					break;

				default:
					System.out.println("O número escolhido é inválido! Digite um número entre 1 a 5.");
			}
		}
	}
}
