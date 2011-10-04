package com.emasesa.aqua.serviciosWeb.Filenet;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;

import com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.BuscarDocumentosRequest;
import com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.ObtenerSeriesRequest;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Iniciando secuencia de llamadas a WS de Filenet");
		try {
			ComponenteWSWSDLClonadoServiceStub clienteServicioFilenet = new ComponenteWSWSDLClonadoServiceStub("https://ares:19005/ComponenteWSWSDLClonadoService/ComponenteWSWSDLClonadoPort");
			ObtenerSeriesRequest peticion = new ObtenerSeriesRequest();
			peticion.setNombreGrupo("RED");
			clienteServicioFilenet.obtenerSeries(peticion);
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin");
	}
}
