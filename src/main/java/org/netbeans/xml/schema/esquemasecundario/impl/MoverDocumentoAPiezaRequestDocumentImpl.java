/*
 * An XML document type.
 * Localname: moverDocumentoAPiezaRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one moverDocumentoAPiezaRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class MoverDocumentoAPiezaRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument
{
    
    public MoverDocumentoAPiezaRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVERDOCUMENTOAPIEZAREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "moverDocumentoAPiezaRequest");
    
    
    /**
     * Gets the "moverDocumentoAPiezaRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest getMoverDocumentoAPiezaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest)get_store().find_element_user(MOVERDOCUMENTOAPIEZAREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "moverDocumentoAPiezaRequest" element
     */
    public void setMoverDocumentoAPiezaRequest(org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest moverDocumentoAPiezaRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest)get_store().find_element_user(MOVERDOCUMENTOAPIEZAREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest)get_store().add_element_user(MOVERDOCUMENTOAPIEZAREQUEST$0);
            }
            target.set(moverDocumentoAPiezaRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "moverDocumentoAPiezaRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest addNewMoverDocumentoAPiezaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest)get_store().add_element_user(MOVERDOCUMENTOAPIEZAREQUEST$0);
            return target;
        }
    }
    /**
     * An XML moverDocumentoAPiezaRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class MoverDocumentoAPiezaRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.MoverDocumentoAPiezaRequestDocument.MoverDocumentoAPiezaRequest
    {
        
        public MoverDocumentoAPiezaRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDSISTEMAORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idSistemaOrigen");
        private static final javax.xml.namespace.QName IDPIEZA$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idPieza");
        private static final javax.xml.namespace.QName VOLUMENDESTINO$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "volumenDestino");
        private static final javax.xml.namespace.QName METADATOCLAVE$6 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "metadatoClave");
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
         * Tests for nil "idPieza" element
         */
        public boolean isNilIdPieza()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDPIEZA$2, 0);
                if (target == null) return false;
                return target.isNil();
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
         * Nils the "idPieza" element
         */
        public void setNilIdPieza()
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
                target.setNil();
            }
        }
        
        /**
         * Gets the "volumenDestino" element
         */
        public java.lang.String getVolumenDestino()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUMENDESTINO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "volumenDestino" element
         */
        public org.apache.xmlbeans.XmlString xgetVolumenDestino()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUMENDESTINO$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "volumenDestino" element
         */
        public boolean isNilVolumenDestino()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUMENDESTINO$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "volumenDestino" element
         */
        public void setVolumenDestino(java.lang.String volumenDestino)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUMENDESTINO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOLUMENDESTINO$4);
                }
                target.setStringValue(volumenDestino);
            }
        }
        
        /**
         * Sets (as xml) the "volumenDestino" element
         */
        public void xsetVolumenDestino(org.apache.xmlbeans.XmlString volumenDestino)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUMENDESTINO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VOLUMENDESTINO$4);
                }
                target.set(volumenDestino);
            }
        }
        
        /**
         * Nils the "volumenDestino" element
         */
        public void setNilVolumenDestino()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUMENDESTINO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VOLUMENDESTINO$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "metadatoClave" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Campo getMetadatoClave()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(METADATOCLAVE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "metadatoClave" element
         */
        public boolean isNilMetadatoClave()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(METADATOCLAVE$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "metadatoClave" element
         */
        public void setMetadatoClave(org.netbeans.xml.schema.esquemaprimario.Campo metadatoClave)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(METADATOCLAVE$6, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(METADATOCLAVE$6);
                }
                target.set(metadatoClave);
            }
        }
        
        /**
         * Appends and returns a new empty "metadatoClave" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Campo addNewMetadatoClave()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(METADATOCLAVE$6);
                return target;
            }
        }
        
        /**
         * Nils the "metadatoClave" element
         */
        public void setNilMetadatoClave()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(METADATOCLAVE$6, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(METADATOCLAVE$6);
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
