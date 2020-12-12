Feature: Busqueda de empleo
  I want to use this template for my feature file

  Background: 
    Given Elige el navegador "google"
    Given La Direccion Del Navegador "https://www.sophossolutions.com/"
    Then El lanza el navegador con la pagina

  @SophosEmpleo
  Scenario Outline: Escenario busqueda
  	Then El hace clic en la pagina
  	Then El hace clic en buscar empleo
  	And el usuario espera <tiempoA> segundos
    Then El imprime las opciones de busqueda
    Then El cierra el navegador
    
    Examples:
     | OpcionBusqueda | tiempoA |
     | Cargos		  |       1 |
