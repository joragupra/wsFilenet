/*
 * An XML document type.
 * Localname: actualizarDocumentoRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one actualizarDocumentoRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ActualizarDocumentoRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument
{
    
    public ActualizarDocumentoRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTUALIZARDOCUMENTOREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "actualizarDocumentoRequest");
    
    
    /**
     * Gets the "actualizarDocumentoRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest getActualizarDocumentoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest)get_store().find_element_user(ACTUALIZARDOCUMENTOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "actualizarDocumentoRequest" element
     */
    public void setActualizarDocumentoRequest(org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest actualizarDocumentoRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest)get_store().find_element_user(ACTUALIZARDOCUMENTOREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest)get_store().add_element_user(ACTUALIZARDOCUMENTOREQUEST$0);
            }
            target.set(actualizarDocumentoRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "actualizarDocumentoRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest addNewActualizarDocumentoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest)get_store().add_element_user(ACTUALIZARDOCUMENTOREQUEST$0);
            return target;
        }
    }
    /**
     * An XML actualizarDocumentoRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class ActualizarDocumentoRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest
    {
        
        public ActualizarDocumentoRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDSISTEMAORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idSistemaOrigen");
        private static final javax.xml.namespace.QName DOCUMENTO$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "documento");
        private static final javax.xml.namespace.QName ACTUALIZARCONTENIDO$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "actualizarContenido");
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
         * Gets the "documento" element
         */
        public org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen getDocumento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "documento" element
         */
        public boolean isNilDocumento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTO$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "documento" element
         */
        public void setDocumento(org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen documento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTO$2, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().add_element_user(DOCUMENTO$2);
                }
                target.set(documento);
            }
        }
        
        /**
         * Appends and returns a new empty "documento" element
         */
        public org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen addNewDocumento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().add_element_user(DOCUMENTO$2);
                return target;
            }
        }
        
        /**
         * Nils the "documento" element
         */
        public void setNilDocumento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTO$2, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().add_element_user(DOCUMENTO$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "actualizarContenido" element
         */
        public boolean getActualizarContenido()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTUALIZARCONTENIDO$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "actualizarContenido" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetActualizarContenido()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTUALIZARCONTENIDO$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "actualizarContenido" element
         */
        public boolean isNilActualizarContenido()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTUALIZARCONTENIDO$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "actualizarContenido" element
         */
        public void setActualizarContenido(boolean actualizarContenido)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTUALIZARCONTENIDO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTUALIZARCONTENIDO$4);
                }
                target.setBooleanValue(actualizarContenido);
            }
        }
        
        /**
         * Sets (as xml) the "actualizarContenido" element
         */
        public void xsetActualizarContenido(org.apache.xmlbeans.XmlBoolean actualizarContenido)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTUALIZARCONTENIDO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACTUALIZARCONTENIDO$4);
                }
                target.set(actualizarContenido);
            }
        }
        
        /**
         * Nils the "actualizarContenido" element
         */
        public void setNilActualizarContenido()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTUALIZARCONTENIDO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACTUALIZARCONTENIDO$4);
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
