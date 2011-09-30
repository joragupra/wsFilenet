/*
 * An XML document type.
 * Localname: moverPiezaAExpedienteResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one moverPiezaAExpedienteResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class MoverPiezaAExpedienteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument
{
    
    public MoverPiezaAExpedienteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVERPIEZAAEXPEDIENTERESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "moverPiezaAExpedienteResponse");
    
    
    /**
     * Gets the "moverPiezaAExpedienteResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse getMoverPiezaAExpedienteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse)get_store().find_element_user(MOVERPIEZAAEXPEDIENTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "moverPiezaAExpedienteResponse" element
     */
    public void setMoverPiezaAExpedienteResponse(org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse moverPiezaAExpedienteResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse)get_store().find_element_user(MOVERPIEZAAEXPEDIENTERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse)get_store().add_element_user(MOVERPIEZAAEXPEDIENTERESPONSE$0);
            }
            target.set(moverPiezaAExpedienteResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "moverPiezaAExpedienteResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse addNewMoverPiezaAExpedienteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse)get_store().add_element_user(MOVERPIEZAAEXPEDIENTERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML moverPiezaAExpedienteResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class MoverPiezaAExpedienteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteResponseDocument.MoverPiezaAExpedienteResponse
    {
        
        public MoverPiezaAExpedienteResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXITO$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "exito");
        
        
        /**
         * Gets the "exito" element
         */
        public java.lang.String getExito()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXITO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "exito" element
         */
        public org.apache.xmlbeans.XmlString xgetExito()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXITO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "exito" element
         */
        public void setExito(java.lang.String exito)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXITO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXITO$0);
                }
                target.setStringValue(exito);
            }
        }
        
        /**
         * Sets (as xml) the "exito" element
         */
        public void xsetExito(org.apache.xmlbeans.XmlString exito)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXITO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXITO$0);
                }
                target.set(exito);
            }
        }
    }
}
