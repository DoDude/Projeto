package br.com.caelum.vraptor.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import check.CheckFuncionario;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.model.Funcionario;

@ApplicationScoped
@Controller
public class IndexController {

	private final Result result;
	
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

	@Path("/")
	public void index(){
		
	}
	
	@Path("/home")
	public void home(){
			
	}
	
	@Post("/verificaFuncionario")
	public void verificaFuncionario(Funcionario funcionario) {
			CheckFuncionario ckUsuario = new CheckFuncionario();
			System.out.println(funcionario.getUsuario());
			System.out.println(funcionario.getSenha());
			funcionario = ckUsuario.verificaLogin(funcionario.getUsuario(), funcionario.getSenha());
			if (funcionario == null) {
				//result.redirectTo(IndexController.class).precisaMensagem("ERRO_LOGIN_INCORRETO", "entrar.jsp");
				System.out.println("vazio");
			} else {
					result.redirectTo(IndexController.class).home();
					  
			}
		}
	
	


}