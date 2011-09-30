/*
 * An XML document type.
 * Localname: borrarRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one borrarRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class BorrarRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument
{
    
    public BorrarRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORRARREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "borrarRequest");
    
    
    /**
     * Gets the "borrarRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest getBorrarRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest)get_store().find_element_user(BORRARREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "borrarRequest" element
     */
    public void setBorrarRequest(org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest borrarRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest)get_store().find_element_user(BORRARREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest)get_store().add_element_user(BORRARREQUEST$0);
            }
            target.set(borrarRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "borrarRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest addNewBorrarRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest)get_store().add_element_user(BORRARREQUEST$0);
            return target;
        }
    }
    /**
     * An XML borrarRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class BorrarRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.BorrarRequestDocument.BorrarRequest
    {
        
        public BorrarRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDSISTEMAORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idSistemaOrigen");
        private static final javax.xml.namespace.QName IDELEMENTO$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idElemento");
        private static final javax.xml.namespace.QName TIPO$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "tipo");
        private static final javax.xml.namespace.QName USUARIO$6 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "usuario");
        
        
        /**
         * Gets the "idSistemaOrigen" element
         */
        public int getIdSistemaOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "idSistemaOrigen" element
         */
        public org.apache.xmlbeans.XmlInt xgetIdSistemaOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "idSistemaOrigen" element
         */
        public boolean isNilIdSistemaOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "idSistemaOrigen" element
         */
        public void setIdSistemaOrigen(int idSistemaOrigen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDSISTEMAORIGEN$0);
                }
                target.setIntValue(idSistemaOrigen);
            }
        }
        
        /**
         * Sets (as xml) the "idSistemaOrigen" element
         */
        public void xsetIdSistemaOrigen(org.apache.xmlbeans.XmlInt idSistemaOrigen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDSISTEMAORIGEN$0);
                }
                target.set(idSistemaOrigen);
            }
        }
        
        /**
         * Nils the "idSistemaOrigen" element
         */
        public void setNilIdSistemaOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDSISTEMAORIGEN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "idElemento" element
         */
        public java.lang.String getIdElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDELEMENTO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idElemento" element
         */
        public org.apache.xmlbeans.XmlString xgetIdElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDELEMENTO$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "idElemento" element
         */
        public boolean isNilIdElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDELEMENTO$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "idElemento" element
         */
        public void setIdElemento(java.lang.String idElemento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDELEMENTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDELEMENTO$2);
                }
                target.setStringValue(idElemento);
            }
        }
        
        /**
         * Sets (as xml) the "idElemento" element
         */
        public void xsetIdElemento(org.apache.xmlbeans.XmlString idElemento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDELEMENTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDELEMENTO$2);
                }
                target.set(idElemento);
            }
        }
        
        /**
         * Nils the "idElemento" element
         */
        public void setNilIdElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDELEMENTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDELEMENTO$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$4, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$4, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO$4);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPO$4);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPO$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "usuario" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Usuario getUsuario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Usuario target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "usuario" element
         */
        public boolean isNilUsuario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Usuario target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "usuario" element
         */
        public void setUsuario(org.netbeans.xml.schema.esquemaprimario.Usuario usuario)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Usuario target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$6, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$6);
                }
                target.set(usuario);
            }
        }
        
        /**
         * Appends and returns a new empty "usuario" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Usuario addNewUsuario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Usuario target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$6);
                return target;
            }
        }
        
        /**
         * Nils the "usuario" element
         */
        public void setNilUsuario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Usuario target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$6, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$6);
                }
                target.setNil();
            }
        }
    }
}
