package teste;

import br.edu.unoesc.dao.AdministradorDAO;
import br.edu.unoesc.dao.EnderecoDAO;
import br.edu.unoesc.exception.DAOException;
import br.edu.unoesc.model.Administrador;
import br.edu.unoesc.model.Endereco;


public class Main {
	
	public static void main(String[] args) throws DAOException {
		Administrador adm = new Administrador();
		AdministradorDAO pessoaDao = new AdministradorDAO();
		
		Endereco endereco = new Endereco();
		EnderecoDAO endDao = new EnderecoDAO();
		endDao.salvar(endereco);
		
		adm.setNome("teste");
		adm.setEndereco(endereco);
		
		
			pessoaDao.salvar(adm);
		
	}
	
	

}
