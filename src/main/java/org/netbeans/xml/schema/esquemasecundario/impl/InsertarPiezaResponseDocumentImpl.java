/*
 * An XML document type.
 * Localname: insertarPiezaResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one insertarPiezaResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class InsertarPiezaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument
{
    
    public InsertarPiezaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSERTARPIEZARESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "insertarPiezaResponse");
    
    
    /**
     * Gets the "insertarPiezaResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse getInsertarPiezaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse)get_store().find_element_user(INSERTARPIEZARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "insertarPiezaResponse" element
     */
    public void setInsertarPiezaResponse(org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse insertarPiezaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse)get_store().find_element_user(INSERTARPIEZARESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse)get_store().add_element_user(INSERTARPIEZARESPONSE$0);
            }
            target.set(insertarPiezaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "insertarPiezaResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse addNewInsertarPiezaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse)get_store().add_element_user(INSERTARPIEZARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML insertarPiezaResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class InsertarPiezaResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.InsertarPiezaResponseDocument.InsertarPiezaResponse
    {
        
        public InsertarPiezaResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDPIEZAFN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idPiezaFN");
        
        
        /**
         * Gets the "idPiezaFN" element
         */
        public java.lang.String getIdPiezaFN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPIEZAFN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idPiezaFN" element
         */
        public org.apache.xmlbeans.XmlString xgetIdPiezaFN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDPIEZAFN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "idPiezaFN" element
         */
        public void setIdPiezaFN(java.lang.String idPiezaFN)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPIEZAFN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDPIEZAFN$0);
                }
                target.setStringValue(idPiezaFN);
            }
        }
        
        /**
         * Sets (as xml) the "idPiezaFN" element
         */
        public void xsetIdPiezaFN(org.apache.xmlbeans.XmlString idPiezaFN)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDPIEZAFN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDPIEZAFN$0);
                }
                target.set(idPiezaFN);
            }
        }
    }
}
