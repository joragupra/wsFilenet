/*
 * An XML document type.
 * Localname: obtenerInformacionElementoRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one obtenerInformacionElementoRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ObtenerInformacionElementoRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument
{
    
    public ObtenerInformacionElementoRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTENERINFORMACIONELEMENTOREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "obtenerInformacionElementoRequest");
    
    
    /**
     * Gets the "obtenerInformacionElementoRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest getObtenerInformacionElementoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest)get_store().find_element_user(OBTENERINFORMACIONELEMENTOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obtenerInformacionElementoRequest" element
     */
    public void setObtenerInformacionElementoRequest(org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest obtenerInformacionElementoRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest)get_store().find_element_user(OBTENERINFORMACIONELEMENTOREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest)get_store().add_element_user(OBTENERINFORMACIONELEMENTOREQUEST$0);
            }
            target.set(obtenerInformacionElementoRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "obtenerInformacionElementoRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest addNewObtenerInformacionElementoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest)get_store().add_element_user(OBTENERINFORMACIONELEMENTOREQUEST$0);
            return target;
        }
    }
    /**
     * An XML obtenerInformacionElementoRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class ObtenerInformacionElementoRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoRequestDocument.ObtenerInformacionElementoRequest
    {
        
        public ObtenerInformacionElementoRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDSISTEMAORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idSistemaOrigen");
        private static final javax.xml.namespace.QName IDENTIFICADOR$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "identificador");
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
         * Gets the "identificador" element
         */
        public java.lang.String getIdentificador()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADOR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "identificador" element
         */
        public org.apache.xmlbeans.XmlString xgetIdentificador()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADOR$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "identificador" element
         */
        public boolean isNilIdentificador()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADOR$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "identificador" element
         */
        public void setIdentificador(java.lang.String identificador)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICADOR$2);
                }
                target.setStringValue(identificador);
            }
        }
        
        /**
         * Sets (as xml) the "identificador" element
         */
        public void xsetIdentificador(org.apache.xmlbeans.XmlString identificador)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICADOR$2);
                }
                target.set(identificador);
            }
        }
        
        /**
         * Nils the "identificador" element
         */
        public void setNilIdentificador()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICADOR$2);
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
    }
}
