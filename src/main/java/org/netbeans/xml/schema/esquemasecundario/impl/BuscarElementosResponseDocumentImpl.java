/*
 * An XML document type.
 * Localname: buscarElementosResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one buscarElementosResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class BuscarElementosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument
{
    
    public BuscarElementosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCARELEMENTOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "buscarElementosResponse");
    
    
    /**
     * Gets the "buscarElementosResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse getBuscarElementosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse)get_store().find_element_user(BUSCARELEMENTOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscarElementosResponse" element
     */
    public void setBuscarElementosResponse(org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse buscarElementosResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse)get_store().find_element_user(BUSCARELEMENTOSRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse)get_store().add_element_user(BUSCARELEMENTOSRESPONSE$0);
            }
            target.set(buscarElementosResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscarElementosResponse" element
     */
    public org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse addNewBuscarElementosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse)get_store().add_element_user(BUSCARELEMENTOSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML buscarElementosResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class BuscarElementosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse
    {
        
        public BuscarElementosResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXISTEPAGINASIGUIENTE$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "existePaginaSiguiente");
        private static final javax.xml.namespace.QName EXISTEPAGINAANTERIOR$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "existePaginaAnterior");
        private static final javax.xml.namespace.QName DOCUMENTOBUSQUEDA$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "documentoBusqueda");
        private static final javax.xml.namespace.QName ELEMENTO$6 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "elemento");
        
        
        /**
         * Gets the "existePaginaSiguiente" element
         */
        public boolean getExistePaginaSiguiente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTEPAGINASIGUIENTE$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "existePaginaSiguiente" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetExistePaginaSiguiente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXISTEPAGINASIGUIENTE$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "existePaginaSiguiente" element
         */
        public boolean isNilExistePaginaSiguiente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXISTEPAGINASIGUIENTE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "existePaginaSiguiente" element
         */
        public void setExistePaginaSiguiente(boolean existePaginaSiguiente)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTEPAGINASIGUIENTE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXISTEPAGINASIGUIENTE$0);
                }
                target.setBooleanValue(existePaginaSiguiente);
            }
        }
        
        /**
         * Sets (as xml) the "existePaginaSiguiente" element
         */
        public void xsetExistePaginaSiguiente(org.apache.xmlbeans.XmlBoolean existePaginaSiguiente)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXISTEPAGINASIGUIENTE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXISTEPAGINASIGUIENTE$0);
                }
                target.set(existePaginaSiguiente);
            }
        }
        
        /**
         * Nils the "existePaginaSiguiente" element
         */
        public void setNilExistePaginaSiguiente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXISTEPAGINASIGUIENTE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXISTEPAGINASIGUIENTE$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "existePaginaAnterior" element
         */
        public boolean getExistePaginaAnterior()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTEPAGINAANTERIOR$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "existePaginaAnterior" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetExistePaginaAnterior()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXISTEPAGINAANTERIOR$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "existePaginaAnterior" element
         */
        public boolean isNilExistePaginaAnterior()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXISTEPAGINAANTERIOR$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "existePaginaAnterior" element
         */
        public void setExistePaginaAnterior(boolean existePaginaAnterior)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTEPAGINAANTERIOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXISTEPAGINAANTERIOR$2);
                }
                target.setBooleanValue(existePaginaAnterior);
            }
        }
        
        /**
         * Sets (as xml) the "existePaginaAnterior" element
         */
        public void xsetExistePaginaAnterior(org.apache.xmlbeans.XmlBoolean existePaginaAnterior)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXISTEPAGINAANTERIOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXISTEPAGINAANTERIOR$2);
                }
                target.set(existePaginaAnterior);
            }
        }
        
        /**
         * Nils the "existePaginaAnterior" element
         */
        public void setNilExistePaginaAnterior()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXISTEPAGINAANTERIOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXISTEPAGINAANTERIOR$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "documentoBusqueda" element
         */
        public org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda getDocumentoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(DOCUMENTOBUSQUEDA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "documentoBusqueda" element
         */
        public boolean isNilDocumentoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(DOCUMENTOBUSQUEDA$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "documentoBusqueda" element
         */
        public void setDocumentoBusqueda(org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda documentoBusqueda)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(DOCUMENTOBUSQUEDA$4, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().add_element_user(DOCUMENTOBUSQUEDA$4);
                }
                target.set(documentoBusqueda);
            }
        }
        
        /**
         * Appends and returns a new empty "documentoBusqueda" element
         */
        public org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda addNewDocumentoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().add_element_user(DOCUMENTOBUSQUEDA$4);
                return target;
            }
        }
        
        /**
         * Nils the "documentoBusqueda" element
         */
        public void setNilDocumentoBusqueda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().find_element_user(DOCUMENTOBUSQUEDA$4, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda)get_store().add_element_user(DOCUMENTOBUSQUEDA$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets array of all "elemento" elements
         */
        public org.netbeans.xml.schema.esquemaprimario.Elemento[] getElementoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ELEMENTO$6, targetList);
                org.netbeans.xml.schema.esquemaprimario.Elemento[] result = new org.netbeans.xml.schema.esquemaprimario.Elemento[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "elemento" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Elemento getElementoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMENTO$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "elemento" element
         */
        public boolean isNilElementoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMENTO$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "elemento" element
         */
        public int sizeOfElementoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELEMENTO$6);
            }
        }
        
        /**
         * Sets array of all "elemento" element
         */
        public void setElementoArray(org.netbeans.xml.schema.esquemaprimario.Elemento[] elementoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(elementoArray, ELEMENTO$6);
            }
        }
        
        /**
         * Sets ith "elemento" element
         */
        public void setElementoArray(int i, org.netbeans.xml.schema.esquemaprimario.Elemento elemento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMENTO$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(elemento);
            }
        }
        
        /**
         * Nils the ith "elemento" element
         */
        public void setNilElementoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMENTO$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "elemento" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Elemento insertNewElemento(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().insert_element_user(ELEMENTO$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "elemento" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Elemento addNewElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().add_element_user(ELEMENTO$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "elemento" element
         */
        public void removeElemento(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELEMENTO$6, i);
            }
        }
    }
}
