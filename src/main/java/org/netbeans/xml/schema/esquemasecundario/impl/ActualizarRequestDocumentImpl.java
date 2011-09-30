/*
 * An XML document type.
 * Localname: actualizarRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one actualizarRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ActualizarRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument
{
    
    public ActualizarRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTUALIZARREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "actualizarRequest");
    
    
    /**
     * Gets the "actualizarRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest getActualizarRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest)get_store().find_element_user(ACTUALIZARREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "actualizarRequest" element
     */
    public void setActualizarRequest(org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest actualizarRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest)get_store().find_element_user(ACTUALIZARREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest)get_store().add_element_user(ACTUALIZARREQUEST$0);
            }
            target.set(actualizarRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "actualizarRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest addNewActualizarRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest)get_store().add_element_user(ACTUALIZARREQUEST$0);
            return target;
        }
    }
    /**
     * An XML actualizarRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class ActualizarRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ActualizarRequestDocument.ActualizarRequest
    {
        
        public ActualizarRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDSISTEMAORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idSistemaOrigen");
        private static final javax.xml.namespace.QName TIPO$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "tipo");
        private static final javax.xml.namespace.QName ELEMENTO$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "elemento");
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
         * Gets the "tipo" element
         */
        public int getTipo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$2, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$2, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO$2);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPO$2);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPO$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "elemento" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Elemento getElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMENTO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "elemento" element
         */
        public boolean isNilElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMENTO$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "elemento" element
         */
        public void setElemento(org.netbeans.xml.schema.esquemaprimario.Elemento elemento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMENTO$4, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().add_element_user(ELEMENTO$4);
                }
                target.set(elemento);
            }
        }
        
        /**
         * Appends and returns a new empty "elemento" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Elemento addNewElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().add_element_user(ELEMENTO$4);
                return target;
            }
        }
        
        /**
         * Nils the "elemento" element
         */
        public void setNilElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMENTO$4, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().add_element_user(ELEMENTO$4);
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
