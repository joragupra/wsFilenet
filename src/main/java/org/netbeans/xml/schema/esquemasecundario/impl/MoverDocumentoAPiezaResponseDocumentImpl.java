/*
 * An XML document type.
 * Localname: moverDocumentoAPiezaResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one moverDocumentoAPiezaResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class MoverDocumentoAPiezaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument
{
    
    public MoverDocumentoAPiezaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVERDOCUMENTOAPIEZARESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "moverDocumentoAPiezaResponse");
    
    
    /**
     * Gets the "moverDocumentoAPiezaResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse getMoverDocumentoAPiezaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse)get_store().find_element_user(MOVERDOCUMENTOAPIEZARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "moverDocumentoAPiezaResponse" element
     */
    public void setMoverDocumentoAPiezaResponse(org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse moverDocumentoAPiezaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse)get_store().find_element_user(MOVERDOCUMENTOAPIEZARESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse)get_store().add_element_user(MOVERDOCUMENTOAPIEZARESPONSE$0);
            }
            target.set(moverDocumentoAPiezaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "moverDocumentoAPiezaResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse addNewMoverDocumentoAPiezaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse)get_store().add_element_user(MOVERDOCUMENTOAPIEZARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML moverDocumentoAPiezaResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class MoverDocumentoAPiezaResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaResponseDocument.MoverDocumentoAPiezaResponse
    {
        
        public MoverDocumentoAPiezaResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXITO$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "exito");
        
        
        /**
         * Gets the "exito" element
         */
        public boolean getExito()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXITO$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "exito" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetExito()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXITO$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "exito" element
         */
        public boolean isNilExito()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXITO$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "exito" element
         */
        public void setExito(boolean exito)
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
                target.setBooleanValue(exito);
            }
        }
        
        /**
         * Sets (as xml) the "exito" element
         */
        public void xsetExito(org.apache.xmlbeans.XmlBoolean exito)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXITO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXITO$0);
                }
                target.set(exito);
            }
        }
        
        /**
         * Nils the "exito" element
         */
        public void setNilExito()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXITO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXITO$0);
                }
                target.setNil();
            }
        }
    }
}
