/*
 * An XML document type.
 * Localname: insertarDocumentoResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one insertarDocumentoResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class InsertarDocumentoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument
{
    
    public InsertarDocumentoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSERTARDOCUMENTORESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "insertarDocumentoResponse");
    
    
    /**
     * Gets the "insertarDocumentoResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse getInsertarDocumentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse)get_store().find_element_user(INSERTARDOCUMENTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "insertarDocumentoResponse" element
     */
    public void setInsertarDocumentoResponse(org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse insertarDocumentoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse)get_store().find_element_user(INSERTARDOCUMENTORESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse)get_store().add_element_user(INSERTARDOCUMENTORESPONSE$0);
            }
            target.set(insertarDocumentoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "insertarDocumentoResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse addNewInsertarDocumentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse)get_store().add_element_user(INSERTARDOCUMENTORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML insertarDocumentoResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class InsertarDocumentoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoResponseDocument.InsertarDocumentoResponse
    {
        
        public InsertarDocumentoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDDOCUMENTOFN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idDocumentoFN");
        
        
        /**
         * Gets the "idDocumentoFN" element
         */
        public java.lang.String getIdDocumentoFN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDDOCUMENTOFN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idDocumentoFN" element
         */
        public org.apache.xmlbeans.XmlString xgetIdDocumentoFN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDDOCUMENTOFN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "idDocumentoFN" element
         */
        public boolean isNilIdDocumentoFN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDDOCUMENTOFN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "idDocumentoFN" element
         */
        public void setIdDocumentoFN(java.lang.String idDocumentoFN)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDDOCUMENTOFN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDDOCUMENTOFN$0);
                }
                target.setStringValue(idDocumentoFN);
            }
        }
        
        /**
         * Sets (as xml) the "idDocumentoFN" element
         */
        public void xsetIdDocumentoFN(org.apache.xmlbeans.XmlString idDocumentoFN)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDDOCUMENTOFN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDDOCUMENTOFN$0);
                }
                target.set(idDocumentoFN);
            }
        }
        
        /**
         * Nils the "idDocumentoFN" element
         */
        public void setNilIdDocumentoFN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDDOCUMENTOFN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDDOCUMENTOFN$0);
                }
                target.setNil();
            }
        }
    }
}
