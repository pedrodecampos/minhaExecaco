package criandoExecao;

public class Aplicacao {
	public static void ehPar(int i) throws Exception {
		if( i % 2 == 0) 
			System.out.println("Numero eh par ! ");
		
		else 
			throw new Exception("O numero informado eh impar!");		
	}

	public static void main(String[] args)  {
		
		try {
			ehPar(5);
		}
		
		catch(Exception excecao) {
			System.out.println(excecao.getMessage());
		}

	}

}
