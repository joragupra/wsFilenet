/*
 * An XML document type.
 * Localname: crearDocumentoOrigenRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one crearDocumentoOrigenRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class CrearDocumentoOrigenRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument
{
    
    public CrearDocumentoOrigenRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREARDOCUMENTOORIGENREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "crearDocumentoOrigenRequest");
    
    
    /**
     * Gets the "crearDocumentoOrigenRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest getCrearDocumentoOrigenRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest)get_store().find_element_user(CREARDOCUMENTOORIGENREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "crearDocumentoOrigenRequest" element
     */
    public void setCrearDocumentoOrigenRequest(org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest crearDocumentoOrigenRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest)get_store().find_element_user(CREARDOCUMENTOORIGENREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest)get_store().add_element_user(CREARDOCUMENTOORIGENREQUEST$0);
            }
            target.set(crearDocumentoOrigenRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "crearDocumentoOrigenRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest addNewCrearDocumentoOrigenRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest)get_store().add_element_user(CREARDOCUMENTOORIGENREQUEST$0);
            return target;
        }
    }
    /**
     * An XML crearDocumentoOrigenRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class CrearDocumentoOrigenRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest
    {
        
        public CrearDocumentoOrigenRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFICADORORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "identificadorOrigen");
        private static final javax.xml.namespace.QName SERIEDOCUMENTAL$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "serieDocumental");
        private static final javax.xml.namespace.QName TIPODOCUMENTAL$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "tipoDocumental");
        private static final javax.xml.namespace.QName USUARIOINDEXACION$6 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "usuarioIndexacion");
        private static final javax.xml.namespace.QName USUARIO$8 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "usuario");
        
        
        /**
         * Gets the "identificadorOrigen" element
         */
        public int getIdentificadorOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "identificadorOrigen" element
         */
        public org.apache.xmlbeans.XmlInt xgetIdentificadorOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "identificadorOrigen" element
         */
        public boolean isNilIdentificadorOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "identificadorOrigen" element
         */
        public void setIdentificadorOrigen(int identificadorOrigen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICADORORIGEN$0);
                }
                target.setIntValue(identificadorOrigen);
            }
        }
        
        /**
         * Sets (as xml) the "identificadorOrigen" element
         */
        public void xsetIdentificadorOrigen(org.apache.xmlbeans.XmlInt identificadorOrigen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDENTIFICADORORIGEN$0);
                }
                target.set(identificadorOrigen);
            }
        }
        
        /**
         * Nils the "identificadorOrigen" element
         */
        public void setNilIdentificadorOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDENTIFICADORORIGEN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "serieDocumental" element
         */
        public java.lang.String getSerieDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIEDOCUMENTAL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "serieDocumental" element
         */
        public org.apache.xmlbeans.XmlString xgetSerieDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERIEDOCUMENTAL$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "serieDocumental" element
         */
        public boolean isNilSerieDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERIEDOCUMENTAL$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "serieDocumental" element
         */
        public void setSerieDocumental(java.lang.String serieDocumental)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIEDOCUMENTAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERIEDOCUMENTAL$2);
                }
                target.setStringValue(serieDocumental);
            }
        }
        
        /**
         * Sets (as xml) the "serieDocumental" element
         */
        public void xsetSerieDocumental(org.apache.xmlbeans.XmlString serieDocumental)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERIEDOCUMENTAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERIEDOCUMENTAL$2);
                }
                target.set(serieDocumental);
            }
        }
        
        /**
         * Nils the "serieDocumental" element
         */
        public void setNilSerieDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERIEDOCUMENTAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERIEDOCUMENTAL$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "tipoDocumental" element
         */
        public java.lang.String getTipoDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTAL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tipoDocumental" element
         */
        public org.apache.xmlbeans.XmlString xgetTipoDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "tipoDocumental" element
         */
        public boolean isNilTipoDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "tipoDocumental" element
         */
        public void setTipoDocumental(java.lang.String tipoDocumental)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTAL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODOCUMENTAL$4);
                }
                target.setStringValue(tipoDocumental);
            }
        }
        
        /**
         * Sets (as xml) the "tipoDocumental" element
         */
        public void xsetTipoDocumental(org.apache.xmlbeans.XmlString tipoDocumental)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODOCUMENTAL$4);
                }
                target.set(tipoDocumental);
            }
        }
        
        /**
         * Nils the "tipoDocumental" element
         */
        public void setNilTipoDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODOCUMENTAL$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "usuarioIndexacion" element
         */
        public java.lang.String getUsuarioIndexacion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "usuarioIndexacion" element
         */
        public org.apache.xmlbeans.XmlString xgetUsuarioIndexacion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$6, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "usuarioIndexacion" element
         */
        public boolean isNilUsuarioIndexacion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "usuarioIndexacion" element
         */
        public void setUsuarioIndexacion(java.lang.String usuarioIndexacion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIOINDEXACION$6);
                }
                target.setStringValue(usuarioIndexacion);
            }
        }
        
        /**
         * Sets (as xml) the "usuarioIndexacion" element
         */
        public void xsetUsuarioIndexacion(org.apache.xmlbeans.XmlString usuarioIndexacion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACION$6);
                }
                target.set(usuarioIndexacion);
            }
        }
        
        /**
         * Nils the "usuarioIndexacion" element
         */
        public void setNilUsuarioIndexacion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACION$6);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$8, 0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$8, 0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$8, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$8);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$8);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$8, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$8);
                }
                target.setNil();
            }
        }
    }
}
