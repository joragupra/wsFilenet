/*
 * An XML document type.
 * Localname: FaultElement
 * Namespace: http://j2ee.netbeans.org/wsdl/BPELComponenteWSWSDL/ComponenteWSWSDLClonado
 * Java type: org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.impl;
/**
 * A document containing one FaultElement(@http://j2ee.netbeans.org/wsdl/BPELComponenteWSWSDL/ComponenteWSWSDLClonado) element.
 *
 * This is a complex type.
 */
public class FaultElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument
{
    
    public FaultElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULTELEMENT$0 = 
        new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/BPELComponenteWSWSDL/ComponenteWSWSDLClonado", "FaultElement");
    
    
    /**
     * Gets the "FaultElement" element
     */
    public org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement getFaultElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement target = null;
            target = (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement)get_store().find_element_user(FAULTELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FaultElement" element
     */
    public void setFaultElement(org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement faultElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement target = null;
            target = (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement)get_store().find_element_user(FAULTELEMENT$0, 0);
            if (target == null)
            {
                target = (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement)get_store().add_element_user(FAULTELEMENT$0);
            }
            target.set(faultElement);
        }
    }
    
    /**
     * Appends and returns a new empty "FaultElement" element
     */
    public org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement addNewFaultElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement target = null;
            target = (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement)get_store().add_element_user(FAULTELEMENT$0);
            return target;
        }
    }
    /**
     * An XML FaultElement(@http://j2ee.netbeans.org/wsdl/BPELComponenteWSWSDL/ComponenteWSWSDLClonado).
     *
     * This is a complex type.
     */
    public static class FaultElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement
    {
        
        public FaultElementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FAULT$0 = 
            new javax.xml.namespace.QName("", "Fault");
        
        
        /**
         * Gets the "Fault" element
         */
        public java.lang.String getFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Fault" element
         */
        public org.apache.xmlbeans.XmlString xgetFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Fault" element
         */
        public void setFault(java.lang.String fault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULT$0);
                }
                target.setStringValue(fault);
            }
        }
        
        /**
         * Sets (as xml) the "Fault" element
         */
        public void xsetFault(org.apache.xmlbeans.XmlString fault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAULT$0);
                }
                target.set(fault);
            }
        }
    }
}
