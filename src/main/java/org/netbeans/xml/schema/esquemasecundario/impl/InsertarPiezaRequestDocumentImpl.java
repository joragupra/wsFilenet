/*
 * An XML document type.
 * Localname: insertarPiezaRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one insertarPiezaRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class InsertarPiezaRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument
{
    
    public InsertarPiezaRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSERTARPIEZAREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "insertarPiezaRequest");
    
    
    /**
     * Gets the "insertarPiezaRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest getInsertarPiezaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest)get_store().find_element_user(INSERTARPIEZAREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "insertarPiezaRequest" element
     */
    public void setInsertarPiezaRequest(org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest insertarPiezaRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest)get_store().find_element_user(INSERTARPIEZAREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest)get_store().add_element_user(INSERTARPIEZAREQUEST$0);
            }
            target.set(insertarPiezaRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "insertarPiezaRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest addNewInsertarPiezaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest)get_store().add_element_user(INSERTARPIEZAREQUEST$0);
            return target;
        }
    }
    /**
     * An XML insertarPiezaRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class InsertarPiezaRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest
    {
        
        public InsertarPiezaRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFICADORORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "identificadorOrigen");
        private static final javax.xml.namespace.QName NOMBREPIEZA$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "nombrePieza");
        private static final javax.xml.namespace.QName USUARIOINDEXACION$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "usuarioIndexacion");
        private static final javax.xml.namespace.QName USUARIO$6 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "usuario");
        private static final javax.xml.namespace.QName CAMPOS$8 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "campos");
        private static final javax.xml.namespace.QName IDEXPEDIENTE$10 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "idExpediente");
        
        
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
         * Gets the "nombrePieza" element
         */
        public java.lang.String getNombrePieza()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREPIEZA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nombrePieza" element
         */
        public org.apache.xmlbeans.XmlString xgetNombrePieza()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREPIEZA$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "nombrePieza" element
         */
        public boolean isNilNombrePieza()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREPIEZA$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "nombrePieza" element
         */
        public void setNombrePieza(java.lang.String nombrePieza)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREPIEZA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREPIEZA$2);
                }
                target.setStringValue(nombrePieza);
            }
        }
        
        /**
         * Sets (as xml) the "nombrePieza" element
         */
        public void xsetNombrePieza(org.apache.xmlbeans.XmlString nombrePieza)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREPIEZA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREPIEZA$2);
                }
                target.set(nombrePieza);
            }
        }
        
        /**
         * Nils the "nombrePieza" element
         */
        public void setNilNombrePieza()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREPIEZA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREPIEZA$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACION$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$4, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIOINDEXACION$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACION$4);
                }
                target.set(usuarioIndexacion);
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
        
        /**
         * Gets array of all "campos" elements
         */
        public org.netbeans.xml.schema.esquemaprimario.Campo[] getCamposArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CAMPOS$8, targetList);
                org.netbeans.xml.schema.esquemaprimario.Campo[] result = new org.netbeans.xml.schema.esquemaprimario.Campo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "campos" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Campo getCamposArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "campos" element
         */
        public int sizeOfCamposArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CAMPOS$8);
            }
        }
        
        /**
         * Sets array of all "campos" element
         */
        public void setCamposArray(org.netbeans.xml.schema.esquemaprimario.Campo[] camposArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(camposArray, CAMPOS$8);
            }
        }
        
        /**
         * Sets ith "campos" element
         */
        public void setCamposArray(int i, org.netbeans.xml.schema.esquemaprimario.Campo campos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(campos);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "campos" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Campo insertNewCampos(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().insert_element_user(CAMPOS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "campos" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Campo addNewCampos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(CAMPOS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "campos" element
         */
        public void removeCampos(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CAMPOS$8, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEXPEDIENTE$10, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEXPEDIENTE$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEXPEDIENTE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDEXPEDIENTE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEXPEDIENTE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDEXPEDIENTE$10);
                }
                target.set(idExpediente);
            }
        }
    }
}
