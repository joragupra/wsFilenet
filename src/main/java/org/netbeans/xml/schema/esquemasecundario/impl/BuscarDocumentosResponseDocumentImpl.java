/*
 * An XML document type.
 * Localname: buscarDocumentosResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one buscarDocumentosResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class BuscarDocumentosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosResponseDocument
{
    
    public BuscarDocumentosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCARDOCUMENTOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "buscarDocumentosResponse");
    
    
    /**
     * Gets the "buscarDocumentosResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda getBuscarDocumentosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(BUSCARDOCUMENTOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "buscarDocumentosResponse" element
     */
    public boolean isNilBuscarDocumentosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(BUSCARDOCUMENTOSRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "buscarDocumentosResponse" element
     */
    public void setBuscarDocumentosResponse(org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda buscarDocumentosResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(BUSCARDOCUMENTOSRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(BUSCARDOCUMENTOSRESPONSE$0);
            }
            target.set(buscarDocumentosResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscarDocumentosResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda addNewBuscarDocumentosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(BUSCARDOCUMENTOSRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "buscarDocumentosResponse" element
     */
    public void setNilBuscarDocumentosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(BUSCARDOCUMENTOSRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(BUSCARDOCUMENTOSRESPONSE$0);
            }
            target.setNil();
        }
    }
}
