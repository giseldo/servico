package br.ifal;

import javax.jws.*;

@WebService
public class CEP {
	
	@WebMethod
	public void consultarCEP(String CEP) {
		System.out.println("CEP consultado com sucesso");
	}
	
}
