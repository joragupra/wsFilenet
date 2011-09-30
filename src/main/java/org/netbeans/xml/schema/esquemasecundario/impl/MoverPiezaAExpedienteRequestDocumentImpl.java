/*
 * An XML document type.
 * Localname: moverPiezaAExpedienteRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one moverPiezaAExpedienteRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class MoverPiezaAExpedienteRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument
{
    
    public MoverPiezaAExpedienteRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVERPIEZAAEXPEDIENTEREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "moverPiezaAExpedienteRequest");
    
    
    /**
     * Gets the "moverPiezaAExpedienteRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest getMoverPiezaAExpedienteRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest)get_store().find_element_user(MOVERPIEZAAEXPEDIENTEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "moverPiezaAExpedienteRequest" element
     */
    public void setMoverPiezaAExpedienteRequest(org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest moverPiezaAExpedienteRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest)get_store().find_element_user(MOVERPIEZAAEXPEDIENTEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest)get_store().add_element_user(MOVERPIEZAAEXPEDIENTEREQUEST$0);
            }
            target.set(moverPiezaAExpedienteRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "moverPiezaAExpedienteRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest addNewMoverPiezaAExpedienteRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest)get_store().add_element_user(MOVERPIEZAAEXPEDIENTEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML moverPiezaAExpedienteRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class MoverPiezaAExpedienteRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest
    {
        
        public MoverPiezaAExpedienteRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDSISTEMAORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idSistemaOrigen");
        private static final javax.xml.namespace.QName IDPIEZA$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idPieza");
        private static final javax.xml.namespace.QName IDEXPEDIENTE$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idExpediente");
        private static final javax.xml.namespace.QName VOLUMENDEARCHIVOASOCIADO$6 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "volumenDeArchivoAsociado");
        private static final javax.xml.namespace.QName USUARIO$8 = 
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
         * Gets the "idPieza" element
         */
        public java.lang.String getIdPieza()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPIEZA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idPieza" element
         */
        public org.apache.xmlbeans.XmlString xgetIdPieza()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDPIEZA$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "idPieza" element
         */
        public void setIdPieza(java.lang.String idPieza)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPIEZA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDPIEZA$2);
                }
                target.setStringValue(idPieza);
            }
        }
        
        /**
         * Sets (as xml) the "idPieza" element
         */
        public void xsetIdPieza(org.apache.xmlbeans.XmlString idPieza)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDPIEZA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDPIEZA$2);
                }
                target.set(idPieza);
            }
        }
        
        /**
         * Gets the "idExpediente" element
         */
        public java.lang.String getIdExpediente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEXPEDIENTE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idExpediente" element
         */
        public org.apache.xmlbeans.XmlString xgetIdExpediente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEXPEDIENTE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "idExpediente" element
         */
        public void setIdExpediente(java.lang.String idExpediente)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEXPEDIENTE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDEXPEDIENTE$4);
                }
                target.setStringValue(idExpediente);
            }
        }
        
        /**
         * Sets (as xml) the "idExpediente" element
         */
        public void xsetIdExpediente(org.apache.xmlbeans.XmlString idExpediente)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEXPEDIENTE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDEXPEDIENTE$4);
                }
                target.set(idExpediente);
            }
        }
        
        /**
         * Gets the "volumenDeArchivoAsociado" element
         */
        public java.lang.String getVolumenDeArchivoAsociado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUMENDEARCHIVOASOCIADO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "volumenDeArchivoAsociado" element
         */
        public org.apache.xmlbeans.XmlString xgetVolumenDeArchivoAsociado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUMENDEARCHIVOASOCIADO$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "volumenDeArchivoAsociado" element
         */
        public void setVolumenDeArchivoAsociado(java.lang.String volumenDeArchivoAsociado)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUMENDEARCHIVOASOCIADO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOLUMENDEARCHIVOASOCIADO$6);
                }
                target.setStringValue(volumenDeArchivoAsociado);
            }
        }
        
        /**
         * Sets (as xml) the "volumenDeArchivoAsociado" element
         */
        public void xsetVolumenDeArchivoAsociado(org.apache.xmlbeans.XmlString volumenDeArchivoAsociado)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUMENDEARCHIVOASOCIADO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VOLUMENDEARCHIVOASOCIADO$6);
                }
                target.set(volumenDeArchivoAsociado);
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
    }
}
