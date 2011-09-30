/*
 * An XML document type.
 * Localname: obtenerSeriesRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one obtenerSeriesRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ObtenerSeriesRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument
{
    
    public ObtenerSeriesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTENERSERIESREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "obtenerSeriesRequest");
    
    
    /**
     * Gets the "obtenerSeriesRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest getObtenerSeriesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest)get_store().find_element_user(OBTENERSERIESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obtenerSeriesRequest" element
     */
    public void setObtenerSeriesRequest(org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest obtenerSeriesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest)get_store().find_element_user(OBTENERSERIESREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest)get_store().add_element_user(OBTENERSERIESREQUEST$0);
            }
            target.set(obtenerSeriesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "obtenerSeriesRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest addNewObtenerSeriesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest)get_store().add_element_user(OBTENERSERIESREQUEST$0);
            return target;
        }
    }
    /**
     * An XML obtenerSeriesRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class ObtenerSeriesRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesRequestDocument.ObtenerSeriesRequest
    {
        
        public ObtenerSeriesRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOMBREGRUPO$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "nombreGrupo");
        
        
        /**
         * Gets the "nombreGrupo" element
         */
        public java.lang.String getNombreGrupo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREGRUPO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nombreGrupo" element
         */
        public org.apache.xmlbeans.XmlString xgetNombreGrupo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREGRUPO$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "nombreGrupo" element
         */
        public boolean isNilNombreGrupo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREGRUPO$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "nombreGrupo" element
         */
        public void setNombreGrupo(java.lang.String nombreGrupo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREGRUPO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREGRUPO$0);
                }
                target.setStringValue(nombreGrupo);
            }
        }
        
        /**
         * Sets (as xml) the "nombreGrupo" element
         */
        public void xsetNombreGrupo(org.apache.xmlbeans.XmlString nombreGrupo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREGRUPO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREGRUPO$0);
                }
                target.set(nombreGrupo);
            }
        }
        
        /**
         * Nils the "nombreGrupo" element
         */
        public void setNilNombreGrupo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREGRUPO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREGRUPO$0);
                }
                target.setNil();
            }
        }
    }
}
