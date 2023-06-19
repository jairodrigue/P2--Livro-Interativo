import java.util.Scanner;

public class livro {

	public static void main(String[] args) {
		Scanner scanOpcoes = new Scanner(System.in);
		i("--LIVROS INTERATIVOS--");
		i("(existem 2 livros disponíveis)");
		i("Escolha uma opção:");
		i("1- Ler livro");
		i("2- Informações de funcionamento");
		i("3- Informações dos livros");
		int opcoes = scanOpcoes.nextInt();
		if (opcoes == 1) {
			selecionarLivro();
		} else if (opcoes == 2) {
			informacoesDeFuncionamento();
		} else if (opcoes == 3) {
			informacaoDosLivros();
		} else {
			System.err.println("Entrada inválida!!!");
		}

	}

	static void historia1() {
		Scanner scan1 = new Scanner(System.in);
		i("-Detetive Parker-" + "\r\n");
		i("Prólogo: Você, um jovem detetive chamado Alex Parker, se vê envolvido em um \n"
				+ "complexo caso de assassinato na cidade de Ravenwood. Uma série de mortes \n"
				+ "misteriosas abalou a tranquilidade do local e, como um dos melhores \n"
				+ "investigadores, você foi designado para solucionar o caso. Em sua busca por \n"
				+ "respostas, você se parte com uma teia de segredos e conspirações que ameaçam \n"
				+ "tanto sua vida quanto a paz da cidade. Suas escolhas determinam o rumo da \n"
				+ "história.\n");
		i("Capítulo: A Escolha Inicial\r\n"
				+ "\r\n"
				+ "Você começa a investigação visitando a cena do primeiro crime. Um corpo mutilado\n"
				+ "foi encontrado em um beco escuro. Enquanto examina a área, você encontra duas \n"
				+ "pistas intrigantes: um bilhete  e um colar estranho deixado ao lado do corpo.\n");
		i("Curioso, você pega o bilhete e percebe que contém um número de telefone escrito nele. \n"
				+ "Ao verificar mais de perto, você reconhece o número como o telefone de sua esposa. \n"
				+ "Isso o deixa perplexo. Por que sua esposa estaria presente nesse caso? Agora, \n"
				+ "você tem duas escolhas:\r\n"
				+ "\r\n"
				+ "Opção 1: Ligar para o número e confrontar sua esposa diretamente.\n"
				+ "Opção 2: Guardar o bilhete e colar como prova e continuar a investigação.\n");
		int opcao = scan1.nextInt();
		if (opcao == 1) {
			i("Capítulo: O Encontro Confrontante");
			i("Você decide ligar para o número no bilhete e confrontar sua esposa diretamente. Após \n"
					+ "alguns toques, ela atende, e você sente a tensão em sua voz. Ela nega veementemente \n"
					+ "qualquer envolvimento nos assassinatos e parece chocada ao descobrir que o número estava \n"
					+ "no bilhete. Ela implora que você acredite nela. Agora, você tem duas escolhas:\n"
					+ "\r\n"
					+ "Opção 1: Confiar na palavra de sua esposa e buscar outras pistas.\n"
					+ "Opção 2: Desconfiar de sua esposa e investigar sua possível ligação com os crimes.");
			int confiar = scan1.nextInt();
			if (confiar == 1) {
				invertigacaoProfunda();
			} else if (confiar == 2) {
				i("Capítulo: A desconfiança incessante");
				i("Essa situação te deixa muito intrigado, e você decide procurar pistas na antiga casa dela.\n"
						+ "Até que você descobre vários documentos que comprovam que sua esposa matou e esfaqueou\n"
						+ "uma criança de três anos, mas não apenas esse crime, você descobre que a pessoa que você\n"
						+ "mais amou, já fez uma chacina em uma escola no Texas, tudo isso registrado em fotos, \n"
						+ "gravações e em bilhetes bem descritivos.\n"
						+ "Você então volta a sua casa e quando ela menos espera, você enfia uma faca no peito da \n"
						+ "pessoa que você mais amou na vida. Mas a dor emocional sua é tão grande que você se mata\n"
						+ "junto com ela. Mortos, a única forma de continuar vivendo.");
			}
		}

		else if (opcao == 2) {
			cenaDoCrime();
		}
	}

	// MÉTODOS PARA A HISTÓRIA DO DETETIVE PARKER
	static void invertigacaoProfunda() {
		Scanner scan1 = new Scanner(System.in);
		i("Capítulo: A Investigação Profunda");
		i("Você decide guardar o bilhete e colar como prova e continuar sua investigação. Afinal, \n"
				+ "sua esposa pode ser apenas uma peça em um jogo muito maior. Você se dedica a buscar \n"
				+ "outras pistas e investigar possíveis conexões com os assassinatos.\nAgora, "
				+ "você tem duas escolhas:"
				+ "\r\n"
				+ "Opção 1: Explorar a cena do crime com mais detalhes.\nOpção 2: Investigar o "
				+ "histórico da vítima e possíveis suspeitos.");
		int opcao1 = scan1.nextInt();
		if (opcao1 == 1) {
			cenaDoCrime();
		} else if (opcao1 == 2) {
			i("Você decide investigar o histórico da vítima e possíveis suspeitos. Ao aprofundar sua \n"
					+ "pesquisa, você descobre que a vítima tinha conexões com um cartel de drogas local. "
					+ "Agora, você tem duas escolhas:\r\n"
					+ "\r\n"
					+ "Opção 1: Infiltrar-se no cartel e obter informações de dentro.\n"
					+ "Opção 2: Confrontar os líderes do cartel e exigir respostas.\n");
			int historico = scan1.nextInt();
			if (historico == 1) {
				i("Antes de infiltrar-se no cartel você decide procurar mais informações para saber se essa \n"
						+ "relação de fato existe.");
				cenaDoCrime();
			} else if (historico == 2) {
				i("Você vai ao catel e antes de chegar lá você é atropelado por um caminhão e morre no \n"
						+ "local");
			}
		}
	}

	static void cenaDoCrime() {
		Scanner scan = new Scanner(System.in);
		i("Capítulo: Explorando a Cena do Crime\nVocê decide explorar a cena do crime com mais "
				+ "detalhes.\n Enquanto examina minuciosamente o local, você encontra uma pequena chave \n"
				+ "escondida sob um dos móveis. Ela parece ser de algum lugar específico. Agora, você tem \n"
				+ "duas escolhas:\r\n"
				+ "\r\n"
				+ "Opção 1: Seguir a pista da chave e investigar o correspondente local\n"
				+ "Opção 2: Levar a chave para a equipe de análise forense e aguardar por mais informações");
		int chave = scan.nextInt();
		if (chave == 1) {
			i("Capítulo: O enigma da chave");
			i("Você decide levar a chave para um laboratório para analisar as digitais. Facilmente ver \n"
					+ "que o crime está relacionado com Charlles McCartney, um músico que já teve várias \n"
					+ "passagens pela polícia, por crimes como, homicídio, sequestro, porte ilegal de armas, \n"
					+ "estupro, e assaltos contínuos. Você então lembra do colar, e então volta a cena do crime \n"
					+ "para uma segunda análise.\nCápitulo: A perseguição\n"
					+ "Chegando na cena do crime você se depara com um senho um pouco velho com algo na mão.\n"
					+ "É uma joia! Você então corre em direção aquele senhor e atira em uma de suas pernas, era \n"
					+ "ele que você estava procurando. A polícia parabenisa você pelo trabalho e você fica muito \n"
					+ "e animado para uma próxima aventura.");
		} else if (chave == 2) {
			i("Chegando lá você se depara com um cara, ele estava sendo enterrogado e você esperou\n"
					+ "até o fim, quando acabou. A detetive Johnson já havia concuido o caso, e você perdeu \n"
					+ "o caso, mas não tem problema porque o detetive Parker é o melhor!");
		}
	}

	static void historia2() {
		Scanner scan2 = new Scanner(System.in);
		i("-Mordida do Destino-");
		i("Era uma vez um jovem chamado Lucas, que vivia em uma pequena cidade cercada por "
				+ "florestas.\nUm dia, enquanto explorava os arredores, ele encontrou um animal nunca antes \n"
				+ "visto, de aparência bizarra e núcleos vibrantes. Fascinado pela criatura \n"
				+ "misteriosa, Lucas decidiu levar-la para casa, escondendo-a dos olhos curiosos de\n"
				+ "seus pais e amigos.\n"
				+ "No início, o relacionamento entre Lucas e o animal estranho era pacífico. Eles \n"
				+ "desenvolveram uma ligação peculiar, e o garoto sentiu-se especial por ter \n"
				+ "encontrado algo tão único. No entanto, tudo mudou em uma tarde fatídica. O animal\n"
				+ " mordeu acidentalmente Lucas durante uma brincadeira controlada, deixando uma \n"
				+ "ferida profunda em seu braço.\n"
				+ "A partir desse momento, Lucas começou a experimentar mudanças drásticas. Sentia-se\n"
				+ " mais forte, rápido e sua mente parecia aguda como nunca antes. Mas, ao mesmo\n"
				+ " tempo, uma fome incontrolável e um desejo ardente por destruição pediram a \n"
				+ "consumi-lo. Lucas descobriu que a mordida do animal havia desencadeado uma \n"
				+ "transformação desconhecida dentro dele.\n"
				+ "Confrontado com uma situação terrível, Lucas se viu diante de duas escolhas \n"
				+ "cruciais:\n"
				+ "\r\n"
				+ "Escolha 1: Buscar a cura\r\n"
				+ "Escolha 2: Abraçar a escuridão\r\n");
		int escolha = scan2.nextInt();
		if (escolha == 1) {
			i("Lucas decidiu que buscar a cura era o caminho a seguir. Ele não queria sucumbir à"
					+ " escuridão que o consumia e estava determinado a restaurar sua humanidade. Assim,"
					+ " embarcou em uma jornada perigosa e desafiadora em busca do antigo alquimista "
					+ "mencionado nas lendas da região.\r\n"
					+ "Ao longo de sua jornada, Lucas criou criaturas assustadoras, desafios mortais e \n"
					+ "obstáculos aparentemente intransponíveis. No entanto, sua força de vontade e força \n"
					+ "de vontade não vacilaram. Ele sabia que sua única chance de redenção estava nas \n"
					+ "mãos do alquimista.\r\n"
					+ "Finalmente, após muitas semanas de busca incansável, Lucas encontrou o alquimista \n"
					+ "em uma cabana pedagógica nas trilhas de uma floresta subterrânea. O sábio examinou \n"
					+ "na ferida de Lucas com cuidado e acolheu em ajudá-lo. Após longos dias e noites \n"
					+ "de estudo e experimentação, o alquimista finalmente criou um elixir que prometia \n"
					+ "reverter a transformação de Lucas.\r\n"
					+ "Com as mãos trêmulas, Lucas bebeu o elixir. Uma onda de energia percorreu seu \n"
					+ "corpo, e ele sentiu o peso da escuridão se dissipar lentamente. A fome destrutiva\n"
					+ "sofreu, e Lucas se viu novamente no controle de seus impulsos.\r\n"
					+ "A cura, no entanto, não veio sem consequências. Lucas carregaria as cicatrizes \n"
					+ "emocionais e lembranças de suas ações. Mas ele estava determinado a compensar \n"
					+ "seus erros e viver uma vida melhor.\r\n"
					+ "Lucas voltou para sua cidade natal, onde ficou a desconfiança e o medo dos outros.\n"
					+ " Mas, com paciência, tristeza e provas de sua mudança, ele começou a reconstruir \n"
					+ "as ligações que havia rompido. O jovem garoto tornou-se um símbolo de esperança e\n"
					+ " redenção, inspirando outros a encontrarem a força dentro de si para superar seus \n"
					+ "próprios demônios.\r\n"
					+ "E assim, a história de Lucas foi uma lição sobre o poder da escolha e da busca \n"
					+ "pela redenção. Ele mostrou que, mesmo quando confrontado com a escuridão, ainda é\n"
					+ " possível encontrar a luz dentro de si mesmo.\r\n");
		} else if (escolha == 2) {
			i("Lucas decidiu abraçar a escuridão que o consumia. Ele se deixou levar pelo \n"
					+ "Lucas decidiu abraçar a escuridão que o consumia. Ele se deixou levar pelo \n"
					+ "poder sombrio que a mordida do animal lhe concedeu e entregou-se totalmente à\n"
					+ " sua sede de destruição. Com cada ato de violência, sua fome insaciável se \n"
					+ "intensifica, e ele se torna cada vez mais imerso na escuridão.\r\n"
					+ "A cidade onde Lucas vivia mergulhava em um estado de pânico e medo constante. \n"
					+ "Os habitantes viviam sob a constante ameaça do jovem que uma vez fora um \n"
					+ "garoto inocente. O terror se espalhou pelas ruas e o caos reinava, enquanto \n"
					+ "Lucas dominava a cidade com seus poderes sombrios.\r\n"
					+ "\r\n"
					+ "No entanto, à medida que o tempo passava, Lucas começou a sentir uma sensação\n"
					+ "de vazio profundo. A escuridão que o consumir não traz.\r\n");
		}

	}

	static void i(String informacao) {
		System.out.println(informacao);
	}

	static void selecionarLivro() {
		Scanner livro = new Scanner(System.in);
		i("Selecione o livro desejado:");
		i("- Detetive Parker (digite 1)");
		i("- Mordida do Destino (digite 2)");
		int selecionar = livro.nextInt();
		if (selecionar == 1) {
			historia1();
		} else if (selecionar == 2) {
			historia2();
		}
	}

	static void informacoesDeFuncionamento() {
		Scanner scanner = new Scanner(System.in);
		i("O programa funciona apenas digitando números, com isso você poderar acessar qualquer \n"
				+ "informação e tomar qualquer decisão possível dentro do livro. De acordo com suas decisões\n"
				+ "você poderá tomar diversos rumos na história. Animado?\nSe quiser selecionar o livro digite 1");
		int lerLivro = scanner.nextInt();
		if (lerLivro == 1) {
			selecionarLivro();
		} else {
			System.err.println("Entrada inválida!!!");
			;
		}
	}

	static void informacaoDosLivros() {
		Scanner scanner = new Scanner(System.in);
		i("O livro Detetive Parker é um livro interativo com 2 esscolhas iniciais, pode selecionar e\n"
				+ " construir uma história que pode voltar por outras ramificações não escolhidas, com isso \n"
				+ "o leitor pode terminar em 4 possíveis desfechos.");
		i("O livro Mordida do Destino é um livro com apenas 2 possíbilidades, a história dele é \n"
				+ "construida de acordo com apenass uma decisão do leitor, ou seja, com duas possibilidades\n"
				+ "de desfecho.\nSe quiser selecionar um livro digite 1");
		int lerLivro = scanner.nextInt();
		if (lerLivro == 1) {
			selecionarLivro();
		} else {
			System.err.println("Entrada inválida!!!");
			;
		}
	}

}
