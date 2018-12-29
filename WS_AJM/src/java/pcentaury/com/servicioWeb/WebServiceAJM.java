/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcentaury.com.servicioWeb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alfred
 */
@WebService(serviceName = "WebServiceAJM")
public class WebServiceAJM {    
    /**Web service operation     */
    @WebMethod(operationName = "saludo")
    public String saludo(@WebParam(name = "nombreUsuario") String nombreUsuario) {
        //TODO write your implementation code here:
        return null;
    }
}
