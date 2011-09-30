/*
 * An XML document type.
 * Localname: crearDocumentoBusquedaResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one crearDocumentoBusquedaResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class CrearDocumentoBusquedaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaResponseDocument
{
    
    public CrearDocumentoBusquedaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREARDOCUMENTOBUSQUEDARESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "crearDocumentoBusquedaResponse");
    
    
    /**
     * Gets the "crearDocumentoBusquedaResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda getCrearDocumentoBusquedaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(CREARDOCUMENTOBUSQUEDARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "crearDocumentoBusquedaResponse" element
     */
    public boolean isNilCrearDocumentoBusquedaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(CREARDOCUMENTOBUSQUEDARESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "crearDocumentoBusquedaResponse" element
     */
    public void setCrearDocumentoBusquedaResponse(org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda crearDocumentoBusquedaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(CREARDOCUMENTOBUSQUEDARESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().add_element_user(CREARDOCUMENTOBUSQUEDARESPONSE$0);
            }
            target.set(crearDocumentoBusquedaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "crearDocumentoBusquedaResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda addNewCrearDocumentoBusquedaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().add_element_user(CREARDOCUMENTOBUSQUEDARESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "crearDocumentoBusquedaResponse" element
     */
    public void setNilCrearDocumentoBusquedaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(CREARDOCUMENTOBUSQUEDARESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().add_element_user(CREARDOCUMENTOBUSQUEDARESPONSE$0);
            }
            target.setNil();
        }
    }
}
