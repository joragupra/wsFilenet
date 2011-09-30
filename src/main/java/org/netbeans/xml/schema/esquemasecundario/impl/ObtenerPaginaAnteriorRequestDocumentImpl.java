/*
 * An XML document type.
 * Localname: obtenerPaginaAnteriorRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one obtenerPaginaAnteriorRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ObtenerPaginaAnteriorRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument
{
    
    public ObtenerPaginaAnteriorRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTENERPAGINAANTERIORREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "obtenerPaginaAnteriorRequest");
    
    
    /**
     * Gets the "obtenerPaginaAnteriorRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest getObtenerPaginaAnteriorRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest)get_store().find_element_user(OBTENERPAGINAANTERIORREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obtenerPaginaAnteriorRequest" element
     */
    public void setObtenerPaginaAnteriorRequest(org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest obtenerPaginaAnteriorRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest)get_store().find_element_user(OBTENERPAGINAANTERIORREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest)get_store().add_element_user(OBTENERPAGINAANTERIORREQUEST$0);
            }
            target.set(obtenerPaginaAnteriorRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "obtenerPaginaAnteriorRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest addNewObtenerPaginaAnteriorRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest)get_store().add_element_user(OBTENERPAGINAANTERIORREQUEST$0);
            return target;
        }
    }
    /**
     * An XML obtenerPaginaAnteriorRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class ObtenerPaginaAnteriorRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerPaginaAnteriorRequestDocument.ObtenerPaginaAnteriorRequest
    {
        
        public ObtenerPaginaAnteriorRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULTADOBUSQUEDA$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "resultadoBusqueda");
        private static final javax.xml.namespace.QName USUARIO$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "usuario");
        private static final javax.xml.namespace.QName TIPOELEMENTO$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "tipoElemento");
        
        
        /**
         * Gets the "resultadoBusqueda" element
         */
        public org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda getResultadoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(RESULTADOBUSQUEDA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "resultadoBusqueda" element
         */
        public boolean isNilResultadoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(RESULTADOBUSQUEDA$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "resultadoBusqueda" element
         */
        public void setResultadoBusqueda(org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda resultadoBusqueda)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(RESULTADOBUSQUEDA$0, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(RESULTADOBUSQUEDA$0);
                }
                target.set(resultadoBusqueda);
            }
        }
        
        /**
         * Appends and returns a new empty "resultadoBusqueda" element
         */
        public org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda addNewResultadoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(RESULTADOBUSQUEDA$0);
                return target;
            }
        }
        
        /**
         * Nils the "resultadoBusqueda" element
         */
        public void setNilResultadoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().find_element_user(RESULTADOBUSQUEDA$0, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda)get_store().add_element_user(RESULTADOBUSQUEDA$0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$2, 0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$2, 0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$2, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$2);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$2);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$2, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "tipoElemento" element
         */
        public int getTipoElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOELEMENTO$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "tipoElemento" element
         */
        public org.apache.xmlbeans.XmlInt xgetTipoElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "tipoElemento" element
         */
        public void setTipoElemento(int tipoElemento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOELEMENTO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOELEMENTO$4);
                }
                target.setIntValue(tipoElemento);
            }
        }
        
        /**
         * Sets (as xml) the "tipoElemento" element
         */
        public void xsetTipoElemento(org.apache.xmlbeans.XmlInt tipoElemento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPOELEMENTO$4);
                }
                target.set(tipoElemento);
            }
        }
    }
}
