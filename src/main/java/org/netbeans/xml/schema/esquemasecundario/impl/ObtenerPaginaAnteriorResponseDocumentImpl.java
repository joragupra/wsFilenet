/*
 * An XML document type.
 * Localname: obtenerPaginaAnteriorResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one obtenerPaginaAnteriorResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ObtenerPaginaAnteriorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorResponseDocument
{
    
    public ObtenerPaginaAnteriorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTENERPAGINAANTERIORRESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "obtenerPaginaAnteriorResponse");
    
    
    /**
     * Gets the "obtenerPaginaAnteriorResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda getObtenerPaginaAnteriorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(OBTENERPAGINAANTERIORRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "obtenerPaginaAnteriorResponse" element
     */
    public boolean isNilObtenerPaginaAnteriorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(OBTENERPAGINAANTERIORRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "obtenerPaginaAnteriorResponse" element
     */
    public void setObtenerPaginaAnteriorResponse(org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda obtenerPaginaAnteriorResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(OBTENERPAGINAANTERIORRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(OBTENERPAGINAANTERIORRESPONSE$0);
            }
            target.set(obtenerPaginaAnteriorResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "obtenerPaginaAnteriorResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda addNewObtenerPaginaAnteriorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(OBTENERPAGINAANTERIORRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "obtenerPaginaAnteriorResponse" element
     */
    public void setNilObtenerPaginaAnteriorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(OBTENERPAGINAANTERIORRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(OBTENERPAGINAANTERIORRESPONSE$0);
            }
            target.setNil();
        }
    }
}
