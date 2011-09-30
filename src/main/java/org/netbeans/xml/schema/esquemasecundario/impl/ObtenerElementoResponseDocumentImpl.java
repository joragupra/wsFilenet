/*
 * An XML document type.
 * Localname: obtenerElementoResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ObtenerElementoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one obtenerElementoResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ObtenerElementoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerElementoResponseDocument
{
    
    public ObtenerElementoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTENERELEMENTORESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "obtenerElementoResponse");
    
    
    /**
     * Gets the "obtenerElementoResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.Elemento getObtenerElementoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(OBTENERELEMENTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "obtenerElementoResponse" element
     */
    public boolean isNilObtenerElementoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(OBTENERELEMENTORESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "obtenerElementoResponse" element
     */
    public void setObtenerElementoResponse(org.netbeans.xml.schema.esquemaprimario.Elemento obtenerElementoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(OBTENERELEMENTORESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().add_element_user(OBTENERELEMENTORESPONSE$0);
            }
            target.set(obtenerElementoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "obtenerElementoResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.Elemento addNewObtenerElementoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().add_element_user(OBTENERELEMENTORESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "obtenerElementoResponse" element
     */
    public void setNilObtenerElementoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(OBTENERELEMENTORESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().add_element_user(OBTENERELEMENTORESPONSE$0);
            }
            target.setNil();
        }
    }
}
