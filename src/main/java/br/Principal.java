package br;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService (name="WebServiceUno", targetNamespace="http://egv.com/webservices/jaxws")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, 
			use=SOAPBinding.Use.LITERAL, 
			parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public class Principal {
	
	@WebMethod(operationName="HolaMundo")
	public void HolaMundo(@WebParam(name="nombre")String nombre) {
		System.out.println("Holao! Te saluda " + nombre);
	}

}  
