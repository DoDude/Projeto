package teste;

import br.edu.unoesc.dao.EnderecoDAO;
import br.edu.unoesc.dao.FuncionarioDAO;
import br.edu.unoesc.dao.PessoaDAO;
import br.edu.unoesc.exception.DAOException;
import br.edu.unoesc.model.Endereco;
import br.edu.unoesc.model.Funcionario;
import br.edu.unoesc.model.Pessoa;


public class Main {
	
	public static void main(String[] args) throws DAOException {
		/*Administrador adm = new Administrador();
		adm.setIsAtivo(true);
		AdministradorDAO pessoaDao = new AdministradorDAO();
		pessoaDao.salvar(adm);
		
		PessoaDAO psDao = new PessoaDAO();
		Pessoa pessoa = new Pessoa();
		psDao.salvar(pessoa);
		
		
		Funcionario func = new Funcionario();
		func.setAdministrador(adm);
		func.setCargo("t");
		func.setSalario(155.0);
		func.setUsuario("tst");
		func.setSenha("tst");
		func.setPessoa(pessoa);
		adm.setFuncionario(func);
		
		
		FuncionarioDAO funcDao = new FuncionarioDAO();
		
		
		
		
		funcDao.salvar(func);
*/
		
		FuncionarioDAO funcDao = new FuncionarioDAO();
		Funcionario func = new Funcionario();
		func.setUsuario("tst");
		func.setSenha("9301c2a72c0f099d0313099f1cd54799");
		
		func = funcDao.buscarUsuario(func);
		
		System.out.println(func.getUsuario());
		

		

		
	}
	
	

}
