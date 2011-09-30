/*
 * An XML document type.
 * Localname: buscarDocumentosRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one buscarDocumentosRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class BuscarDocumentosRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument
{
    
    public BuscarDocumentosRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCARDOCUMENTOSREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "buscarDocumentosRequest");
    
    
    /**
     * Gets the "buscarDocumentosRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest getBuscarDocumentosRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest)get_store().find_element_user(BUSCARDOCUMENTOSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscarDocumentosRequest" element
     */
    public void setBuscarDocumentosRequest(org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest buscarDocumentosRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest)get_store().find_element_user(BUSCARDOCUMENTOSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest)get_store().add_element_user(BUSCARDOCUMENTOSREQUEST$0);
            }
            target.set(buscarDocumentosRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "buscarDocumentosRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest addNewBuscarDocumentosRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest)get_store().add_element_user(BUSCARDOCUMENTOSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML buscarDocumentosRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class BuscarDocumentosRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.BuscarDocumentosRequestDocument.BuscarDocumentosRequest
    {
        
        public BuscarDocumentosRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USUARIO$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "usuario");
        private static final javax.xml.namespace.QName DOCUMENTOBUSQUEDA$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "documentoBusqueda");
        
        
        /**
         * Gets the "usuario" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Usuario getUsuario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Usuario target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$0, 0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$0, 0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$0, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$0, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "documentoBusqueda" element
         */
        public org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda getDocumentoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(DOCUMENTOBUSQUEDA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "documentoBusqueda" element
         */
        public boolean isNilDocumentoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(DOCUMENTOBUSQUEDA$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "documentoBusqueda" element
         */
        public void setDocumentoBusqueda(org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda documentoBusqueda)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(DOCUMENTOBUSQUEDA$2, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().add_element_user(DOCUMENTOBUSQUEDA$2);
                }
                target.set(documentoBusqueda);
            }
        }
        
        /**
         * Appends and returns a new empty "documentoBusqueda" element
         */
        public org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda addNewDocumentoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().add_element_user(DOCUMENTOBUSQUEDA$2);
                return target;
            }
        }
        
        /**
         * Nils the "documentoBusqueda" element
         */
        public void setNilDocumentoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(DOCUMENTOBUSQUEDA$2, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().add_element_user(DOCUMENTOBUSQUEDA$2);
                }
                target.setNil();
            }
        }
    }
}
