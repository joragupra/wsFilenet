/*
 * An XML document type.
 * Localname: insertarDocumentoRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one insertarDocumentoRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class InsertarDocumentoRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument
{
    
    public InsertarDocumentoRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSERTARDOCUMENTOREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "insertarDocumentoRequest");
    
    
    /**
     * Gets the "insertarDocumentoRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest getInsertarDocumentoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest)get_store().find_element_user(INSERTARDOCUMENTOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "insertarDocumentoRequest" element
     */
    public void setInsertarDocumentoRequest(org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest insertarDocumentoRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest)get_store().find_element_user(INSERTARDOCUMENTOREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest)get_store().add_element_user(INSERTARDOCUMENTOREQUEST$0);
            }
            target.set(insertarDocumentoRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "insertarDocumentoRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest addNewInsertarDocumentoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest)get_store().add_element_user(INSERTARDOCUMENTOREQUEST$0);
            return target;
        }
    }
    /**
     * An XML insertarDocumentoRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class InsertarDocumentoRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.InsertarDocumentoRequestDocument.InsertarDocumentoRequest
    {
        
        public InsertarDocumentoRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName CAMPOS$10 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "campos");
        private static final javax.xml.namespace.QName FICHEROS$12 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "ficheros");
        
        
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
        
        /**
         * Gets array of all "campos" elements
         */
        public org.netbeans.xml.schema.esquemaprimario.Campo[] getCamposArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CAMPOS$10, targetList);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$10, i);
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
                return get_store().count_elements(CAMPOS$10);
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
                arraySetterHelper(camposArray, CAMPOS$10);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$10, i);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().insert_element_user(CAMPOS$10, i);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(CAMPOS$10);
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
                get_store().remove_element(CAMPOS$10, i);
            }
        }
        
        /**
         * Gets array of all "ficheros" elements
         */
        public org.netbeans.xml.schema.esquemaprimario.Contenido[] getFicherosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FICHEROS$12, targetList);
                org.netbeans.xml.schema.esquemaprimario.Contenido[] result = new org.netbeans.xml.schema.esquemaprimario.Contenido[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ficheros" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Contenido getFicherosArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Contenido target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Contenido)get_store().find_element_user(FICHEROS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ficheros" element
         */
        public int sizeOfFicherosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FICHEROS$12);
            }
        }
        
        /**
         * Sets array of all "ficheros" element
         */
        public void setFicherosArray(org.netbeans.xml.schema.esquemaprimario.Contenido[] ficherosArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ficherosArray, FICHEROS$12);
            }
        }
        
        /**
         * Sets ith "ficheros" element
         */
        public void setFicherosArray(int i, org.netbeans.xml.schema.esquemaprimario.Contenido ficheros)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Contenido target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Contenido)get_store().find_element_user(FICHEROS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ficheros);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ficheros" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Contenido insertNewFicheros(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Contenido target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Contenido)get_store().insert_element_user(FICHEROS$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ficheros" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Contenido addNewFicheros()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Contenido target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Contenido)get_store().add_element_user(FICHEROS$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "ficheros" element
         */
        public void removeFicheros(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FICHEROS$12, i);
            }
        }
    }
}
