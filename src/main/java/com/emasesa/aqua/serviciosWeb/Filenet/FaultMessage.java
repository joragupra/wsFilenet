
/**
 * FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package com.emasesa.aqua.serviciosWeb.Filenet;

public class FaultMessage extends java.lang.Exception{
    
    private org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument faultMessage;
    
    public FaultMessage() {
        super("FaultMessage");
    }
           
    public FaultMessage(java.lang.String s) {
       super(s);
    }
    
    public FaultMessage(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument msg){
       faultMessage = msg;
    }
    
    public org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument getFaultMessage(){
       return faultMessage;
    }
}
    