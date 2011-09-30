/*
 * XML Type:  contenido
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.Contenido
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML contenido(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class ContenidoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.Contenido
{
    
    public ContenidoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMEROORDEN$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "numeroOrden");
    private static final javax.xml.namespace.QName EXTENSION$2 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "extension");
    private static final javax.xml.namespace.QName FICHERO$4 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "fichero");
    
    
    /**
     * Gets the "numeroOrden" element
     */
    public int getNumeroOrden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROORDEN$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "numeroOrden" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumeroOrden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROORDEN$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "numeroOrden" element
     */
    public boolean isNilNumeroOrden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROORDEN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "numeroOrden" element
     */
    public void setNumeroOrden(int numeroOrden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROORDEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROORDEN$0);
            }
            target.setIntValue(numeroOrden);
        }
    }
    
    /**
     * Sets (as xml) the "numeroOrden" element
     */
    public void xsetNumeroOrden(org.apache.xmlbeans.XmlInt numeroOrden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROORDEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMEROORDEN$0);
            }
            target.set(numeroOrden);
        }
    }
    
    /**
     * Nils the "numeroOrden" element
     */
    public void setNilNumeroOrden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROORDEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMEROORDEN$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "extension" element
     */
    public java.lang.String getExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "extension" element
     */
    public org.apache.xmlbeans.XmlString xgetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENSION$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "extension" element
     */
    public boolean isNilExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENSION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "extension" element
     */
    public void setExtension(java.lang.String extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENSION$2);
            }
            target.setStringValue(extension);
        }
    }
    
    /**
     * Sets (as xml) the "extension" element
     */
    public void xsetExtension(org.apache.xmlbeans.XmlString extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENSION$2);
            }
            target.set(extension);
        }
    }
    
    /**
     * Nils the "extension" element
     */
    public void setNilExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENSION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "fichero" element
     */
    public byte[] getFichero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FICHERO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "fichero" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetFichero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(FICHERO$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "fichero" element
     */
    public boolean isNilFichero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(FICHERO$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "fichero" element
     */
    public void setFichero(byte[] fichero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FICHERO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FICHERO$4);
            }
            target.setByteArrayValue(fichero);
        }
    }
    
    /**
     * Sets (as xml) the "fichero" element
     */
    public void xsetFichero(org.apache.xmlbeans.XmlBase64Binary fichero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(FICHERO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(FICHERO$4);
            }
            target.set(fichero);
        }
    }
    
    /**
     * Nils the "fichero" element
     */
    public void setNilFichero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(FICHERO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(FICHERO$4);
            }
            target.setNil();
        }
    }
}
