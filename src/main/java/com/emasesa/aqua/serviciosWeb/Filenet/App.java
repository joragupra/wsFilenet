package com.emasesa.aqua.serviciosWeb.Filenet;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Iniciando secuencia de llamadas a WS de Filenet");
		System.out.println("Cliente sin opciones en su generacion");
		consultaConClienteSinOpciones();
		System.out.println("Cliente con opcion osv en su generacion");
		consultaConClienteConOsv();
		System.out.println("Fin");
	}
	
	private static void consultaConClienteSinOpciones(){
		try {
			com.emasesa.aqua.serviciosWeb.FilenetNoOpts.ComponenteWSWSDLClonadoServiceStub clienteServicioFilenet = new com.emasesa.aqua.serviciosWeb.FilenetNoOpts.ComponenteWSWSDLClonadoServiceStub("https://10.1.125.251:19005/ComponenteWSWSDLClonadoService/ComponenteWSWSDLClonadoPort");
			com.emasesa.aqua.serviciosWeb.FilenetNoOpts.ComponenteWSWSDLClonadoServiceStub.ObtenerSeriesRequest peticion = new com.emasesa.aqua.serviciosWeb.FilenetNoOpts.ComponenteWSWSDLClonadoServiceStub.ObtenerSeriesRequest();
			peticion.setNombreGrupo("RED");
			clienteServicioFilenet.obtenerSeries(peticion);
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.emasesa.aqua.serviciosWeb.FilenetNoOpts.FaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void consultaConClienteConOsv(){
		try {
			com.emasesa.aqua.serviciosWeb.FilenetEosv.ComponenteWSWSDLClonadoServiceStub clienteServicioFilenet = new com.emasesa.aqua.serviciosWeb.FilenetEosv.ComponenteWSWSDLClonadoServiceStub("https://10.1.125.251:19005/ComponenteWSWSDLClonadoService/ComponenteWSWSDLClonadoPort");
			com.emasesa.aqua.serviciosWeb.FilenetEosv.ComponenteWSWSDLClonadoServiceStub.ObtenerSeriesRequest peticion = new com.emasesa.aqua.serviciosWeb.FilenetEosv.ComponenteWSWSDLClonadoServiceStub.ObtenerSeriesRequest();
			peticion.setNombreGrupo("RED");
			clienteServicioFilenet.obtenerSeries(peticion);
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.emasesa.aqua.serviciosWeb.FilenetEosv.FaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
