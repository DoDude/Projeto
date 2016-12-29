package teste;

import br.edu.unoesc.dao.PessoaDAO;
import br.edu.unoesc.exception.DAOException;
import br.edu.unoesc.model.Administrador;

public class Main {

	public static void main(String[] args) throws DAOException {
		Administrador adm = new Administrador();
		adm.setNome("Matheus Poletto");
		adm.setCpf("093.656.198-61");
		adm.setRg("6.578.321");
		adm.setTelefone1("(49) 3435-0901");
		adm.setTelefone2("(49) 99954-9683");
		adm.setEmail("motaviop@gmail.com");
		adm.setGenero("Masculino");
		adm.setUsuario("admin");
		adm.setSenha("admin");
		adm.setCargo("Presidente");
		adm.setSalario(10000.0);
		adm.setIsAtivo(true);
		
		System.out.println(adm.getNome());

		PessoaDAO pessoaDao = new PessoaDAO();
		pessoaDao.salvar(adm);
		System.out.println("Salvo");
	}

}
