
/**
 * FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package com.emasesa.aqua.serviciosWeb.Filenet;

public class FaultMessage extends java.lang.Exception{
    
    private com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.FaultElement faultMessage;
    
    public FaultMessage() {
        super("FaultMessage");
    }
           
    public FaultMessage(java.lang.String s) {
       super(s);
    }
    
    public FaultMessage(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.FaultElement msg){
       faultMessage = msg;
    }
    
    public com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.FaultElement getFaultMessage(){
       return faultMessage;
    }
}
    