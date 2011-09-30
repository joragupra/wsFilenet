/*
 * An XML document type.
 * Localname: actualizarDocumentoResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one actualizarDocumentoResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ActualizarDocumentoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument
{
    
    public ActualizarDocumentoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTUALIZARDOCUMENTORESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "actualizarDocumentoResponse");
    
    
    /**
     * Gets the "actualizarDocumentoResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse getActualizarDocumentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse)get_store().find_element_user(ACTUALIZARDOCUMENTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "actualizarDocumentoResponse" element
     */
    public void setActualizarDocumentoResponse(org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse actualizarDocumentoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse)get_store().find_element_user(ACTUALIZARDOCUMENTORESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse)get_store().add_element_user(ACTUALIZARDOCUMENTORESPONSE$0);
            }
            target.set(actualizarDocumentoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "actualizarDocumentoResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse addNewActualizarDocumentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse)get_store().add_element_user(ACTUALIZARDOCUMENTORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML actualizarDocumentoResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class ActualizarDocumentoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoResponseDocument.ActualizarDocumentoResponse
    {
        
        public ActualizarDocumentoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDFILENET$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idFileNet");
        
        
        /**
         * Gets the "idFileNet" element
         */
        public java.lang.String getIdFileNet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDFILENET$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idFileNet" element
         */
        public org.apache.xmlbeans.XmlString xgetIdFileNet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDFILENET$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "idFileNet" element
         */
        public boolean isNilIdFileNet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDFILENET$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "idFileNet" element
         */
        public void setIdFileNet(java.lang.String idFileNet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDFILENET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDFILENET$0);
                }
                target.setStringValue(idFileNet);
            }
        }
        
        /**
         * Sets (as xml) the "idFileNet" element
         */
        public void xsetIdFileNet(org.apache.xmlbeans.XmlString idFileNet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDFILENET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDFILENET$0);
                }
                target.set(idFileNet);
            }
        }
        
        /**
         * Nils the "idFileNet" element
         */
        public void setNilIdFileNet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDFILENET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDFILENET$0);
                }
                target.setNil();
            }
        }
    }
}
