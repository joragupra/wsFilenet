/*
 * An XML document type.
 * Localname: obtenerInformacionElementoResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one obtenerInformacionElementoResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ObtenerInformacionElementoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument
{
    
    public ObtenerInformacionElementoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTENERINFORMACIONELEMENTORESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "obtenerInformacionElementoResponse");
    
    
    /**
     * Gets the "obtenerInformacionElementoResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse getObtenerInformacionElementoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse)get_store().find_element_user(OBTENERINFORMACIONELEMENTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obtenerInformacionElementoResponse" element
     */
    public void setObtenerInformacionElementoResponse(org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse obtenerInformacionElementoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse)get_store().find_element_user(OBTENERINFORMACIONELEMENTORESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse)get_store().add_element_user(OBTENERINFORMACIONELEMENTORESPONSE$0);
            }
            target.set(obtenerInformacionElementoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "obtenerInformacionElementoResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse addNewObtenerInformacionElementoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse)get_store().add_element_user(OBTENERINFORMACIONELEMENTORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML obtenerInformacionElementoResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class ObtenerInformacionElementoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse
    {
        
        public ObtenerInformacionElementoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CAMPOS$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "campos");
        private static final javax.xml.namespace.QName TIPODOCUMENTALES$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "tipoDocumentales");
        
        
        /**
         * Gets array of all "campos" elements
         */
        public org.netbeans.xml.schema.esquemaprimario.Campo[] getCamposArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CAMPOS$0, targetList);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "campos" element
         */
        public boolean isNilCamposArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
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
                return get_store().count_elements(CAMPOS$0);
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
                arraySetterHelper(camposArray, CAMPOS$0);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(campos);
            }
        }
        
        /**
         * Nils the ith "campos" element
         */
        public void setNilCamposArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
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
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().insert_element_user(CAMPOS$0, i);
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
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(CAMPOS$0);
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
                get_store().remove_element(CAMPOS$0, i);
            }
        }
        
        /**
         * Gets array of all "tipoDocumentales" elements
         */
        public org.netbeans.xml.schema.esquemaprimario.TipoDocumental[] getTipoDocumentalesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TIPODOCUMENTALES$2, targetList);
                org.netbeans.xml.schema.esquemaprimario.TipoDocumental[] result = new org.netbeans.xml.schema.esquemaprimario.TipoDocumental[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "tipoDocumentales" element
         */
        public org.netbeans.xml.schema.esquemaprimario.TipoDocumental getTipoDocumentalesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.TipoDocumental target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.TipoDocumental)get_store().find_element_user(TIPODOCUMENTALES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "tipoDocumentales" element
         */
        public int sizeOfTipoDocumentalesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TIPODOCUMENTALES$2);
            }
        }
        
        /**
         * Sets array of all "tipoDocumentales" element
         */
        public void setTipoDocumentalesArray(org.netbeans.xml.schema.esquemaprimario.TipoDocumental[] tipoDocumentalesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(tipoDocumentalesArray, TIPODOCUMENTALES$2);
            }
        }
        
        /**
         * Sets ith "tipoDocumentales" element
         */
        public void setTipoDocumentalesArray(int i, org.netbeans.xml.schema.esquemaprimario.TipoDocumental tipoDocumentales)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.TipoDocumental target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.TipoDocumental)get_store().find_element_user(TIPODOCUMENTALES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(tipoDocumentales);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tipoDocumentales" element
         */
        public org.netbeans.xml.schema.esquemaprimario.TipoDocumental insertNewTipoDocumentales(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.TipoDocumental target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.TipoDocumental)get_store().insert_element_user(TIPODOCUMENTALES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tipoDocumentales" element
         */
        public org.netbeans.xml.schema.esquemaprimario.TipoDocumental addNewTipoDocumentales()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.TipoDocumental target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.TipoDocumental)get_store().add_element_user(TIPODOCUMENTALES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "tipoDocumentales" element
         */
        public void removeTipoDocumentales(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TIPODOCUMENTALES$2, i);
            }
        }
    }
}
