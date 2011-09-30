/*
 * An XML document type.
 * Localname: obtenerSeriesResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one obtenerSeriesResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class ObtenerSeriesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument
{
    
    public ObtenerSeriesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTENERSERIESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "obtenerSeriesResponse");
    
    
    /**
     * Gets the "obtenerSeriesResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse getObtenerSeriesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse)get_store().find_element_user(OBTENERSERIESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obtenerSeriesResponse" element
     */
    public void setObtenerSeriesResponse(org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse obtenerSeriesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse)get_store().find_element_user(OBTENERSERIESRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse)get_store().add_element_user(OBTENERSERIESRESPONSE$0);
            }
            target.set(obtenerSeriesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "obtenerSeriesResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse addNewObtenerSeriesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse)get_store().add_element_user(OBTENERSERIESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML obtenerSeriesResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class ObtenerSeriesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.ObtenerSeriesResponseDocument.ObtenerSeriesResponse
    {
        
        public ObtenerSeriesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERIES$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "series");
        
        
        /**
         * Gets array of all "series" elements
         */
        public org.netbeans.xml.schema.esquemaprimario.Serie[] getSeriesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERIES$0, targetList);
                org.netbeans.xml.schema.esquemaprimario.Serie[] result = new org.netbeans.xml.schema.esquemaprimario.Serie[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "series" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Serie getSeriesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Serie target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Serie)get_store().find_element_user(SERIES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "series" element
         */
        public boolean isNilSeriesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Serie target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Serie)get_store().find_element_user(SERIES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "series" element
         */
        public int sizeOfSeriesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERIES$0);
            }
        }
        
        /**
         * Sets array of all "series" element
         */
        public void setSeriesArray(org.netbeans.xml.schema.esquemaprimario.Serie[] seriesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(seriesArray, SERIES$0);
            }
        }
        
        /**
         * Sets ith "series" element
         */
        public void setSeriesArray(int i, org.netbeans.xml.schema.esquemaprimario.Serie series)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Serie target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Serie)get_store().find_element_user(SERIES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(series);
            }
        }
        
        /**
         * Nils the ith "series" element
         */
        public void setNilSeriesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Serie target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Serie)get_store().find_element_user(SERIES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "series" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Serie insertNewSeries(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Serie target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Serie)get_store().insert_element_user(SERIES$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "series" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Serie addNewSeries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Serie target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Serie)get_store().add_element_user(SERIES$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "series" element
         */
        public void removeSeries(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERIES$0, i);
            }
        }
    }
}
