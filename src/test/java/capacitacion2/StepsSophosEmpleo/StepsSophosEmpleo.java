package capacitacion2.StepsSophosEmpleo;

import org.openqa.selenium.WebDriver;

import ManagerObject.ManagerDriver;
import ManagerObject.PageObjectSophosEmpleo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepsSophosEmpleo {
	private ManagerDriver managerDriver;
	private String nombreNavegador;
	private String urlPagina;
	private PageObjectSophosEmpleo PageObjectSophosEmpleo;

	@Given("^Elige el navegador \"([^\"]*)\"$")
	public void elige_el_navegador(String arg1) throws Throwable {
		this.nombreNavegador = arg1;
	}

	@Given("^La Direccion Del Navegador \"([^\"]*)\"$")
	public void la_direcciondeldnavegador(String arg1) throws Throwable {
		this.urlPagina = arg1;
	}

	@Then("^El lanza el navegador con la pagina$")
	public void El_lanza_Navegador() throws Throwable {
		managerDriver = new ManagerDriver(nombreNavegador, urlPagina);
		managerDriver.navegarAPagina();
	}

	@Then("^El hace clic en la pagina$")
	public void el_hace_clic_en_la_pagina() throws Throwable {
		PageObjectSophosEmpleo = new PageObjectSophosEmpleo(managerDriver.getWebDriver());
		PageObjectSophosEmpleo.darClickPaginaWeb();
	}
	
	
	@Then("^El hace clic en buscar empleo$")
	public void el_hace_clic_en_buscar_empleo() throws Throwable {
		PageObjectSophosEmpleo = new PageObjectSophosEmpleo(managerDriver.getWebDriver());
		PageObjectSophosEmpleo.darClickTrabajaConNosotros();
	}
	
	
	@And("^el usuario espera (\\d+) segundos$")
	public void el_usuario_espera_segundos(int timeSleep) throws Throwable {
	    Thread.sleep(timeSleep*1000);
	}
	
			
	@Then("^El imprime las opciones de busqueda$")
	public void imprimirBusqueda() throws Throwable {
		PageObjectSophosEmpleo.imprimircargos();		
	}
	
	@Then("^El cierra el navegador$")
	public void cierreNavegador() throws Throwable {
		managerDriver.cerrarNavegador();
	}
}
