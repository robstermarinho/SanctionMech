
(i)		Incluir um atributo que trate sobre as metas que est�o no operador ESCOLHA. 
		Lembre-se que o mecanismo deve perceber apenas a meta que foi realmente escolhida;

	/*	Eu fui olhar no MOISE+ e ele trata as metas em escolha da seguinte forma: se duas metas A e B estao em escolha,
	 * 	isso n�o significa necessariamente que uma delas deve ser escolhida previamente, mas que
	 * 	qualquer uma delas pode ser executada. Por�m uma e somente uma deve ser executada.
	 * 	Ent�o no algoritmo eu verifico 
	 * 	se A e B n�o foram cumpridas ambas recebem puni��o individual
	 * 	se A nao foi cumprida e B sim ninguem recebe puni��o
	 * 	se B n�o foi cumprida e A sim ninguem recebe pini��o
	 * 
	 */


(ii) 	Percebi que voc� implementou a escolha das metas que ser�o cumpridas ou n�o utilizando Threads. 
		Poder�amos deixar mais gen�rica para que facilitasse a execu��o dos pr�ximos estudos de caso;

	/*	Na verdade a fun��o execu��o de metas foi criada pra exemplificar 
	 * 	foi onde eu defini que o g12 iria falhar por�m esta execu��o acontecer� a medida que os agentes 
	 * 	autonomicamente realizam suas tarefas. A� entra o c�lculo ddos cutos.
	 * 
	 */
(iii) Comparei o algoritmo com o artigo que enviamos para o CLEI e n�o foi inclu�da a entidade Contrato;


(iv) 	Analisando os resultados, seria interessante colocar o valor do custo coletivo e individual separados. 
		Veja os resultados do mesmo estudo de caso que calculamos no artigo:
	
	/*	O resultado g1	Cvmf = -3 (aqui seria apenas o custo gerencial, n�o?)
	 *  que deu diferente � porque o c�digo somava a individual + a gerencial da meta g1
	 *  pq al�m de ser uma meta gerencial ela tamb�m est� na hierarquia e se violada recebe individual
	 *  pois ela faz parte da sequencia g1 g2 g3
	 *  o c�digo agora calcula separos os custos
	 *  
	 *  
	 *  A arquitetura � constru�da pela �rvore
	 *  e a contagem de san��es � feita pela "leitura" da �rvore,
	 *  ou seja leitura da hierarquia em si.
	 *  
	 */