/*
 * XML Type:  elemento
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.Elemento
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML elemento(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class ElementoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.Elemento
{
    
    public ElementoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPEDIENTEORIGEN$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "expedienteOrigen");
    private static final javax.xml.namespace.QName DOCUMENTOORIGEN$2 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "documentoOrigen");
    private static final javax.xml.namespace.QName PIEZAORIGEN$4 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "piezaOrigen");
    private static final javax.xml.namespace.QName TIPO$6 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "tipo");
    
    
    /**
     * Gets the "expedienteOrigen" element
     */
    public org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen getExpedienteOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().find_element_user(EXPEDIENTEORIGEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "expedienteOrigen" element
     */
    public boolean isNilExpedienteOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().find_element_user(EXPEDIENTEORIGEN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "expedienteOrigen" element
     */
    public void setExpedienteOrigen(org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen expedienteOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().find_element_user(EXPEDIENTEORIGEN$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().add_element_user(EXPEDIENTEORIGEN$0);
            }
            target.set(expedienteOrigen);
        }
    }
    
    /**
     * Appends and returns a new empty "expedienteOrigen" element
     */
    public org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen addNewExpedienteOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().add_element_user(EXPEDIENTEORIGEN$0);
            return target;
        }
    }
    
    /**
     * Nils the "expedienteOrigen" element
     */
    public void setNilExpedienteOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().find_element_user(EXPEDIENTEORIGEN$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen)get_store().add_element_user(EXPEDIENTEORIGEN$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "documentoOrigen" element
     */
    public org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen getDocumentoOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTOORIGEN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "documentoOrigen" element
     */
    public boolean isNilDocumentoOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTOORIGEN$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "documentoOrigen" element
     */
    public void setDocumentoOrigen(org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen documentoOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTOORIGEN$2, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().add_element_user(DOCUMENTOORIGEN$2);
            }
            target.set(documentoOrigen);
        }
    }
    
    /**
     * Appends and returns a new empty "documentoOrigen" element
     */
    public org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen addNewDocumentoOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().add_element_user(DOCUMENTOORIGEN$2);
            return target;
        }
    }
    
    /**
     * Nils the "documentoOrigen" element
     */
    public void setNilDocumentoOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTOORIGEN$2, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().add_element_user(DOCUMENTOORIGEN$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "piezaOrigen" element
     */
    public org.netbeans.xml.schema.esquemaprimario.PiezaOrigen getPiezaOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().find_element_user(PIEZAORIGEN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "piezaOrigen" element
     */
    public boolean isNilPiezaOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().find_element_user(PIEZAORIGEN$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "piezaOrigen" element
     */
    public void setPiezaOrigen(org.netbeans.xml.schema.esquemaprimario.PiezaOrigen piezaOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().find_element_user(PIEZAORIGEN$4, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().add_element_user(PIEZAORIGEN$4);
            }
            target.set(piezaOrigen);
        }
    }
    
    /**
     * Appends and returns a new empty "piezaOrigen" element
     */
    public org.netbeans.xml.schema.esquemaprimario.PiezaOrigen addNewPiezaOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().add_element_user(PIEZAORIGEN$4);
            return target;
        }
    }
    
    /**
     * Nils the "piezaOrigen" element
     */
    public void setNilPiezaOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().find_element_user(PIEZAORIGEN$4, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().add_element_user(PIEZAORIGEN$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "tipo" element
     */
    public int getTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo" element
     */
    public org.apache.xmlbeans.XmlInt xgetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "tipo" element
     */
    public boolean isNilTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "tipo" element
     */
    public void setTipo(int tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO$6);
            }
            target.setIntValue(tipo);
        }
    }
    
    /**
     * Sets (as xml) the "tipo" element
     */
    public void xsetTipo(org.apache.xmlbeans.XmlInt tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPO$6);
            }
            target.set(tipo);
        }
    }
    
    /**
     * Nils the "tipo" element
     */
    public void setNilTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPO$6);
            }
            target.setNil();
        }
    }
}
