package br.com.caelum.vraptor.controller;

import java.lang.ProcessBuilder.Redirect;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import check.CheckFuncionario;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.dao.FuncionarioDAO;
import br.edu.unoesc.model.Funcionario;

@ApplicationScoped
@Controller
public class IndexController {

	private final Result result;
	private Funcionario funcionario;
	
	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null);
	}

	@Inject
	public IndexController(Result result) {
		this.result = result;
	}
	
	private void generalUserInfo(){
		result.include("nome", funcionario.getPessoa().getNome());	
		result.include("cargo", funcionario.getCargo());	

	}

	@Path("/")
	public void index(){
		FuncionarioDAO funcDao = new FuncionarioDAO();
		funcionario = funcDao.buscar(Funcionario.class, 6L);
		result.redirectTo(this).home();		
	}
	
	@Path("/home")
	public void home(){
		result.include("tituloPagina", "Inicío");	
		generalUserInfo();
	}
	
	@Post("/cadFisica")
	public void cadFisica(){
		generalUserInfo();
		

	}
	
	@Post("/verificaFuncionario")
	public void verificaFuncionario(Funcionario funcionario) {
			CheckFuncionario ckUsuario = new CheckFuncionario();
			funcionario = ckUsuario.verificaLogin(funcionario);
			if (funcionario == null) {
				//result.redirectTo(IndexController.class).precisaMensagem("ERRO_LOGIN_INCORRETO", "entrar.jsp");
				System.out.println("vazio");
			} else {
					result.redirectTo(this).home();
					this.funcionario = funcionario;
					  
			}
		}
	
	


}