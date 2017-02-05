package check;

import br.edu.unoesc.dao.FuncionarioDAO;
import br.edu.unoesc.model.Funcionario;

public class CheckFuncionario {
	
	public Funcionario verificaLogin(Funcionario funcionario){	
		FuncionarioDAO funcionarioDao = new FuncionarioDAO();
		funcionario = funcionarioDao.buscarUsuario(funcionario);
		return funcionario;		
	}

}
