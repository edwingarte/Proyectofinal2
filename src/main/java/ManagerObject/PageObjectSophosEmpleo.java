package ManagerObject;

import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageObjectSophosEmpleo extends PageFactory{
	public PageObjectSophosEmpleo(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//*[@id=\"sg-popup-content-wrapper-5998\"]")
	private WebElement PaginaWeb;
	
	public void darClickPaginaWeb() throws AWTException{
		PaginaWeb.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_W);
		}
	
	@FindBy(xpath = "//*[@id=\"mega-menu-item-1541\"]/a")
	private WebElement TrabajaConNosotros;
	
	public void darClickTrabajaConNosotros() {
		TrabajaConNosotros.click();
	}
	
	@FindBy(className = "premium-blog-entry-meta")
	public WebElement fecha;
	
	@FindBy(className = "premium-blog-entry-title")
	public WebElement titulo;
	
	@FindBy(className = "premium-blog-post-content")
	List<WebElement> listacargos;
	
	
	
	public void imprimircargos () {
	int contador = 1;
		for ( WebElement webelement : listacargos) {
			System.out.println("Oferta "+contador);
			System.out.println("Nombre de la Oferta:"+ titulo.getText());
			System.out.println("Fecha de Publicación:"+ fecha.getText());
			System.out.println("Descripción:"+webelement.getText());
			contador++;
			}
		}

	}


