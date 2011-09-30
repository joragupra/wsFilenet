/*
 * An XML document type.
 * Localname: crearDocumentoOrigenResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one crearDocumentoOrigenResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class CrearDocumentoOrigenResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenResponseDocument
{
    
    public CrearDocumentoOrigenResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREARDOCUMENTOORIGENRESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "crearDocumentoOrigenResponse");
    
    
    /**
     * Gets the "crearDocumentoOrigenResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen getCrearDocumentoOrigenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(CREARDOCUMENTOORIGENRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "crearDocumentoOrigenResponse" element
     */
    public boolean isNilCrearDocumentoOrigenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(CREARDOCUMENTOORIGENRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "crearDocumentoOrigenResponse" element
     */
    public void setCrearDocumentoOrigenResponse(org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen crearDocumentoOrigenResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(CREARDOCUMENTOORIGENRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().add_element_user(CREARDOCUMENTOORIGENRESPONSE$0);
            }
            target.set(crearDocumentoOrigenResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "crearDocumentoOrigenResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen addNewCrearDocumentoOrigenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().add_element_user(CREARDOCUMENTOORIGENRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "crearDocumentoOrigenResponse" element
     */
    public void setNilCrearDocumentoOrigenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(CREARDOCUMENTOORIGENRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().add_element_user(CREARDOCUMENTOORIGENRESPONSE$0);
            }
            target.setNil();
        }
    }
}
