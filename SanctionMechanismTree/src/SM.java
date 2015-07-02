import javax.swing.plaf.basic.BasicTreeUI;

import jamder.Actions;
import jamder.Agent;
import jamder.AgentRole;
import jamder.Norms;
import sm.No;
import sm.Operador;
import sm.SMTree;

public class SM {

	public static void main(String[] args) {

		//Montagem da Organizacao
		
		
		//Criacao dos Papeis de agentes
		AgentRole professor = new AgentRole("Professor");
		AgentRole aluno_pos = new AgentRole("Aluno Pos");
		AgentRole aluno_ic = new AgentRole("Aluno IC");
		
		//Criacao dos Agentes e vinculacao aos seus papeis
		Agent ag1 = new Agent("Joao", professor);
		
		Agent ag2 = new Agent("Julia", aluno_pos);
		Agent ag3 = new Agent("Israel", aluno_pos);
		Agent ag4 = new Agent("Paulo", aluno_pos);
		
		Agent ag5 = new Agent("Roberto", aluno_ic);
		Agent ag6 = new Agent("Vitoria", aluno_ic);
		Agent ag7 = new Agent("Eduardo", aluno_ic);
		Agent ag8 = new Agent("Lucas", aluno_ic);
		
		//Definir as acoes
		Actions g0 = new Actions("g0", 	"Escrever Papel		", professor);
		
		Actions g1 = new Actions("g1", 	"Coordenar Escrita	", aluno_pos);
		Actions g2 = new Actions("g2", 	"Coletar Dados		", aluno_pos);
		Actions g3 = new Actions("g3", 	"Revisao			", aluno_pos);
		
		Actions g11 = new Actions("g11", "Escrever Intro		", aluno_ic);
		Actions g12 = new Actions("g12", "Escrever Sessoes	", aluno_ic);
		Actions g21 = new Actions("g21", "Coletar Internet	", aluno_ic);
		Actions g22 = new Actions("g22", "Coletar Em Campo	", aluno_ic);
		
		//Definir as Normas
		
		Norms ng0 = new Norms(ag1, g0);
		Norms ng1 = new Norms(ag2, g1);
		Norms ng2 = new Norms(ag3, g2);
		Norms ng3 = new Norms(ag4, g3);
		Norms ng11 = new Norms(ag5, g11);
		Norms ng12 = new Norms(ag6, g12);
		Norms ng21 = new Norms(ag7, g21);
		Norms ng22 = new Norms(ag8, g22);
	
		//Estabelecer Hierarquia atraves da avore
		
		
		SMTree arvore = new SMTree(ng0, Operador.SEQUENCIA);	//Raiz - g0 , operador sequencia para os filhos dela
		No raiz = arvore.getRaiz();
		
		//Atribuir a g0 - g1,g2,g3
		arvore.inserir_delegacao(ng0, ng1, Operador.PARALELO);
		arvore.inserir_delegacao(ng0, ng2, Operador.ESCOLHA);
		arvore.inserir_delegacao(ng0, ng3, null);
	
		//Atribuir a g1 - g11,g22
		arvore.inserir_delegacao(ng1,ng11, null);
		arvore.inserir_delegacao(ng1,ng12, null);
	
		//Atribuir a g2 - g21,g22
		arvore.inserir_delegacao(ng2,ng21, null);
		arvore.inserir_delegacao(ng2,ng22, null);
	
		System.out.println("____________ ARVORE - ESTRUTURA	________________________________________________\n");
		
			arvore.show(0, raiz);
		
		System.out.println("\n____________ BUSCAR N� - g2	________________________________________________\n");
		
			arvore.buscar_um_no(ng2);
		
		System.out.println("\n\nExecu��o das metas\n");
		
		System.out.println("________________________________________________________________________________________________________________________________");
		System.out.print("META			 EXECU��O			META	INDIVIDUAL	COLETIVO	GERENCIAL	TOTAL");
		System.out.println("\n________________________________________________________________________________________________________________________________");
			arvore.executar_metas(raiz);

				

	}

}
