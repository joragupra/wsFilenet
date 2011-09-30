/*
 * An XML document type.
 * Localname: insertarExpedienteResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one insertarExpedienteResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class InsertarExpedienteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument
{
    
    public InsertarExpedienteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSERTAREXPEDIENTERESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "insertarExpedienteResponse");
    
    
    /**
     * Gets the "insertarExpedienteResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse getInsertarExpedienteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse)get_store().find_element_user(INSERTAREXPEDIENTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "insertarExpedienteResponse" element
     */
    public void setInsertarExpedienteResponse(org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse insertarExpedienteResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse)get_store().find_element_user(INSERTAREXPEDIENTERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse)get_store().add_element_user(INSERTAREXPEDIENTERESPONSE$0);
            }
            target.set(insertarExpedienteResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "insertarExpedienteResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse addNewInsertarExpedienteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse)get_store().add_element_user(INSERTAREXPEDIENTERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML insertarExpedienteResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class InsertarExpedienteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.InsertarExpedienteResponseDocument.InsertarExpedienteResponse
    {
        
        public InsertarExpedienteResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDEXPEDIENTEFN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idExpedienteFN");
        
        
        /**
         * Gets the "idExpedienteFN" element
         */
        public java.lang.String getIdExpedienteFN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEXPEDIENTEFN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idExpedienteFN" element
         */
        public org.apache.xmlbeans.XmlString xgetIdExpedienteFN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEXPEDIENTEFN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "idExpedienteFN" element
         */
        public void setIdExpedienteFN(java.lang.String idExpedienteFN)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEXPEDIENTEFN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDEXPEDIENTEFN$0);
                }
                target.setStringValue(idExpedienteFN);
            }
        }
        
        /**
         * Sets (as xml) the "idExpedienteFN" element
         */
        public void xsetIdExpedienteFN(org.apache.xmlbeans.XmlString idExpedienteFN)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEXPEDIENTEFN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDEXPEDIENTEFN$0);
                }
                target.set(idExpedienteFN);
            }
        }
    }
}
