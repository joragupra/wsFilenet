/*
 * An XML document type.
 * Localname: crearDocumentoBusqueda
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one crearDocumentoBusqueda(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class CrearDocumentoBusquedaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument
{
    
    public CrearDocumentoBusquedaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREARDOCUMENTOBUSQUEDA$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "crearDocumentoBusqueda");
    
    
    /**
     * Gets the "crearDocumentoBusqueda" element
     */
    public org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda getCrearDocumentoBusqueda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda)get_store().find_element_user(CREARDOCUMENTOBUSQUEDA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "crearDocumentoBusqueda" element
     */
    public void setCrearDocumentoBusqueda(org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda crearDocumentoBusqueda)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda)get_store().find_element_user(CREARDOCUMENTOBUSQUEDA$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda)get_store().add_element_user(CREARDOCUMENTOBUSQUEDA$0);
            }
            target.set(crearDocumentoBusqueda);
        }
    }
    
    /**
     * Appends and returns a new empty "crearDocumentoBusqueda" element
     */
    public org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda addNewCrearDocumentoBusqueda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda)get_store().add_element_user(CREARDOCUMENTOBUSQUEDA$0);
            return target;
        }
    }
    /**
     * An XML crearDocumentoBusqueda(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class CrearDocumentoBusquedaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.CrearDocumentoBusquedaDocument.CrearDocumentoBusqueda
    {
        
        public CrearDocumentoBusquedaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFICADORORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "identificadorOrigen");
        private static final javax.xml.namespace.QName CAMPOPRUEBA$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "campoPrueba");
        
        
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
         * Gets the "campoPrueba" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Campo getCampoPrueba()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOPRUEBA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "campoPrueba" element
         */
        public void setCampoPrueba(org.netbeans.xml.schema.esquemaprimario.Campo campoPrueba)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOPRUEBA$2, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(CAMPOPRUEBA$2);
                }
                target.set(campoPrueba);
            }
        }
        
        /**
         * Appends and returns a new empty "campoPrueba" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Campo addNewCampoPrueba()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Campo target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(CAMPOPRUEBA$2);
                return target;
            }
        }
    }
}
