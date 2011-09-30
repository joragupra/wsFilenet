/*
 * An XML document type.
 * Localname: obtenerPaginaSiquienteResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaSiquienteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one obtenerPaginaSiquienteResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ObtenerPaginaSiquienteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaSiquienteResponseDocument
{
    
    public ObtenerPaginaSiquienteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTENERPAGINASIQUIENTERESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "obtenerPaginaSiquienteResponse");
    
    
    /**
     * Gets the "obtenerPaginaSiquienteResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda getObtenerPaginaSiquienteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(OBTENERPAGINASIQUIENTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "obtenerPaginaSiquienteResponse" element
     */
    public boolean isNilObtenerPaginaSiquienteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(OBTENERPAGINASIQUIENTERESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "obtenerPaginaSiquienteResponse" element
     */
    public void setObtenerPaginaSiquienteResponse(org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda obtenerPaginaSiquienteResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(OBTENERPAGINASIQUIENTERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(OBTENERPAGINASIQUIENTERESPONSE$0);
            }
            target.set(obtenerPaginaSiquienteResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "obtenerPaginaSiquienteResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda addNewObtenerPaginaSiquienteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(OBTENERPAGINASIQUIENTERESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "obtenerPaginaSiquienteResponse" element
     */
    public void setNilObtenerPaginaSiquienteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(OBTENERPAGINASIQUIENTERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(OBTENERPAGINASIQUIENTERESPONSE$0);
            }
            target.setNil();
        }
    }
}
