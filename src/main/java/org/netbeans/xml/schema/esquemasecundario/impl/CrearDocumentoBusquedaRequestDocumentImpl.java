/*
 * An XML document type.
 * Localname: crearDocumentoBusquedaRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one crearDocumentoBusquedaRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class CrearDocumentoBusquedaRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument
{
    
    public CrearDocumentoBusquedaRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREARDOCUMENTOBUSQUEDAREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "crearDocumentoBusquedaRequest");
    
    
    /**
     * Gets the "crearDocumentoBusquedaRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest getCrearDocumentoBusquedaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest)get_store().find_element_user(CREARDOCUMENTOBUSQUEDAREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "crearDocumentoBusquedaRequest" element
     */
    public void setCrearDocumentoBusquedaRequest(org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest crearDocumentoBusquedaRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest)get_store().find_element_user(CREARDOCUMENTOBUSQUEDAREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest)get_store().add_element_user(CREARDOCUMENTOBUSQUEDAREQUEST$0);
            }
            target.set(crearDocumentoBusquedaRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "crearDocumentoBusquedaRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest addNewCrearDocumentoBusquedaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest)get_store().add_element_user(CREARDOCUMENTOBUSQUEDAREQUEST$0);
            return target;
        }
    }
    /**
     * An XML crearDocumentoBusquedaRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class CrearDocumentoBusquedaRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaRequestDocument.CrearDocumentoBusquedaRequest
    {
        
        public CrearDocumentoBusquedaRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFICADORORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "identificadorOrigen");
        private static final javax.xml.namespace.QName TIPOELEMENTO$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "tipoElemento");
        private static final javax.xml.namespace.QName IDENTIFICADORELEMENTO$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "identificadorElemento");
        private static final javax.xml.namespace.QName TIPODOCUMENTAL$6 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "tipoDocumental");
        private static final javax.xml.namespace.QName USUARIOINDEXACION$8 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "usuarioIndexacion");
        private static final javax.xml.namespace.QName IDENTIFICADORES$10 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "identificadores");
        private static final javax.xml.namespace.QName USUARIO$12 = 
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
         * Gets the "tipoElemento" element
         */
        public int getTipoElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOELEMENTO$2, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "tipoElemento" element
         */
        public boolean isNilTipoElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$2, 0);
                if (target == null) return false;
                return target.isNil();
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOELEMENTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOELEMENTO$2);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPOELEMENTO$2);
                }
                target.set(tipoElemento);
            }
        }
        
        /**
         * Nils the "tipoElemento" element
         */
        public void setNilTipoElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPOELEMENTO$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "identificadorElemento" element
         */
        public java.lang.String getIdentificadorElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "identificadorElemento" element
         */
        public org.apache.xmlbeans.XmlString xgetIdentificadorElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "identificadorElemento" element
         */
        public boolean isNilIdentificadorElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "identificadorElemento" element
         */
        public void setIdentificadorElemento(java.lang.String identificadorElemento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICADORELEMENTO$4);
                }
                target.setStringValue(identificadorElemento);
            }
        }
        
        /**
         * Sets (as xml) the "identificadorElemento" element
         */
        public void xsetIdentificadorElemento(org.apache.xmlbeans.XmlString identificadorElemento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICADORELEMENTO$4);
                }
                target.set(identificadorElemento);
            }
        }
        
        /**
         * Nils the "identificadorElemento" element
         */
        public void setNilIdentificadorElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICADORELEMENTO$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODOCUMENTAL$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODOCUMENTAL$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODOCUMENTAL$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACION$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIOINDEXACION$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACION$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACION$8);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets array of all "identificadores" elements
         */
        public java.lang.String[] getIdentificadoresArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFICADORES$10, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "identificadores" element
         */
        public java.lang.String getIdentificadoresArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORES$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "identificadores" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetIdentificadoresArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFICADORES$10, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "identificadores" element
         */
        public org.apache.xmlbeans.XmlString xgetIdentificadoresArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Tests for nil ith "identificadores" element
         */
        public boolean isNilIdentificadoresArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "identificadores" element
         */
        public int sizeOfIdentificadoresArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFICADORES$10);
            }
        }
        
        /**
         * Sets array of all "identificadores" element
         */
        public void setIdentificadoresArray(java.lang.String[] identificadoresArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(identificadoresArray, IDENTIFICADORES$10);
            }
        }
        
        /**
         * Sets ith "identificadores" element
         */
        public void setIdentificadoresArray(int i, java.lang.String identificadores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORES$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(identificadores);
            }
        }
        
        /**
         * Sets (as xml) array of all "identificadores" element
         */
        public void xsetIdentificadoresArray(org.apache.xmlbeans.XmlString[]identificadoresArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(identificadoresArray, IDENTIFICADORES$10);
            }
        }
        
        /**
         * Sets (as xml) ith "identificadores" element
         */
        public void xsetIdentificadoresArray(int i, org.apache.xmlbeans.XmlString identificadores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(identificadores);
            }
        }
        
        /**
         * Nils the ith "identificadores" element
         */
        public void setNilIdentificadoresArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "identificadores" element
         */
        public void insertIdentificadores(int i, java.lang.String identificadores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IDENTIFICADORES$10, i);
                target.setStringValue(identificadores);
            }
        }
        
        /**
         * Appends the value as the last "identificadores" element
         */
        public void addIdentificadores(java.lang.String identificadores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICADORES$10);
                target.setStringValue(identificadores);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "identificadores" element
         */
        public org.apache.xmlbeans.XmlString insertNewIdentificadores(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(IDENTIFICADORES$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "identificadores" element
         */
        public org.apache.xmlbeans.XmlString addNewIdentificadores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICADORES$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "identificadores" element
         */
        public void removeIdentificadores(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFICADORES$10, i);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$12, 0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$12, 0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$12, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$12);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$12);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$12, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$12);
                }
                target.setNil();
            }
        }
    }
}
