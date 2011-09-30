/*
 * XML Type:  serie
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.Serie
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML serie(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class SerieImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.Serie
{
    
    public SerieImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGOSERIE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "codigoSerie");
    private static final javax.xml.namespace.QName NOMBRESERIE$2 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreSerie");
    
    
    /**
     * Gets the "codigoSerie" element
     */
    public org.netbeans.xml.schema.esquemaprimario.StringType getCodigoSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.StringType target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.StringType)get_store().find_element_user(CODIGOSERIE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "codigoSerie" element
     */
    public boolean isSetCodigoSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGOSERIE$0) != 0;
        }
    }
    
    /**
     * Sets the "codigoSerie" element
     */
    public void setCodigoSerie(org.netbeans.xml.schema.esquemaprimario.StringType codigoSerie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.StringType target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.StringType)get_store().find_element_user(CODIGOSERIE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.StringType)get_store().add_element_user(CODIGOSERIE$0);
            }
            target.set(codigoSerie);
        }
    }
    
    /**
     * Appends and returns a new empty "codigoSerie" element
     */
    public org.netbeans.xml.schema.esquemaprimario.StringType addNewCodigoSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.StringType target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.StringType)get_store().add_element_user(CODIGOSERIE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "codigoSerie" element
     */
    public void unsetCodigoSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGOSERIE$0, 0);
        }
    }
    
    /**
     * Gets the "nombreSerie" element
     */
    public org.netbeans.xml.schema.esquemaprimario.StringType getNombreSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.StringType target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.StringType)get_store().find_element_user(NOMBRESERIE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nombreSerie" element
     */
    public boolean isSetNombreSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOMBRESERIE$2) != 0;
        }
    }
    
    /**
     * Sets the "nombreSerie" element
     */
    public void setNombreSerie(org.netbeans.xml.schema.esquemaprimario.StringType nombreSerie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.StringType target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.StringType)get_store().find_element_user(NOMBRESERIE$2, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemaprimario.StringType)get_store().add_element_user(NOMBRESERIE$2);
            }
            target.set(nombreSerie);
        }
    }
    
    /**
     * Appends and returns a new empty "nombreSerie" element
     */
    public org.netbeans.xml.schema.esquemaprimario.StringType addNewNombreSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.StringType target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.StringType)get_store().add_element_user(NOMBRESERIE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "nombreSerie" element
     */
    public void unsetNombreSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOMBRESERIE$2, 0);
        }
    }
}
