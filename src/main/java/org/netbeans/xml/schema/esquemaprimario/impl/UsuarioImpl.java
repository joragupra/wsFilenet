/*
 * XML Type:  usuario
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.Usuario
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML usuario(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class UsuarioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.Usuario
{
    
    public UsuarioImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOMBREUSUARIO$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreUsuario");
    private static final javax.xml.namespace.QName CLAVE$2 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "clave");
    
    
    /**
     * Gets the "nombreUsuario" element
     */
    public java.lang.String getNombreUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREUSUARIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombreUsuario" element
     */
    public org.apache.xmlbeans.XmlString xgetNombreUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREUSUARIO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nombreUsuario" element
     */
    public void setNombreUsuario(java.lang.String nombreUsuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREUSUARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREUSUARIO$0);
            }
            target.setStringValue(nombreUsuario);
        }
    }
    
    /**
     * Sets (as xml) the "nombreUsuario" element
     */
    public void xsetNombreUsuario(org.apache.xmlbeans.XmlString nombreUsuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREUSUARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREUSUARIO$0);
            }
            target.set(nombreUsuario);
        }
    }
    
    /**
     * Gets the "clave" element
     */
    public java.lang.String getClave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAVE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clave" element
     */
    public org.apache.xmlbeans.XmlString xgetClave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLAVE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "clave" element
     */
    public void setClave(java.lang.String clave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAVE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLAVE$2);
            }
            target.setStringValue(clave);
        }
    }
    
    /**
     * Sets (as xml) the "clave" element
     */
    public void xsetClave(org.apache.xmlbeans.XmlString clave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLAVE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLAVE$2);
            }
            target.set(clave);
        }
    }
}
