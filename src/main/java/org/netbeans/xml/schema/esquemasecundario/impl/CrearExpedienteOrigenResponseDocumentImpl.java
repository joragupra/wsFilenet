/*
 * An XML document type.
 * Localname: crearExpedienteOrigenResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one crearExpedienteOrigenResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class CrearExpedienteOrigenResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument
{
    
    public CrearExpedienteOrigenResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREAREXPEDIENTEORIGENRESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "crearExpedienteOrigenResponse");
    
    
    /**
     * Gets the "crearExpedienteOrigenResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen getCrearExpedienteOrigenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().find_element_user(CREAREXPEDIENTEORIGENRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "crearExpedienteOrigenResponse" element
     */
    public boolean isNilCrearExpedienteOrigenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().find_element_user(CREAREXPEDIENTEORIGENRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "crearExpedienteOrigenResponse" element
     */
    public void setCrearExpedienteOrigenResponse(org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen crearExpedienteOrigenResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().find_element_user(CREAREXPEDIENTEORIGENRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().add_element_user(CREAREXPEDIENTEORIGENRESPONSE$0);
            }
            target.set(crearExpedienteOrigenResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "crearExpedienteOrigenResponse" element
     */
    public org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen addNewCrearExpedienteOrigenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().add_element_user(CREAREXPEDIENTEORIGENRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "crearExpedienteOrigenResponse" element
     */
    public void setNilCrearExpedienteOrigenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().find_element_user(CREAREXPEDIENTEORIGENRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().add_element_user(CREAREXPEDIENTEORIGENRESPONSE$0);
            }
            target.setNil();
        }
    }
}
