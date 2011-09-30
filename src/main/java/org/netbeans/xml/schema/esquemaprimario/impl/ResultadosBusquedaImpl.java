/*
 * XML Type:  resultadosBusqueda
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML resultadosBusqueda(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class ResultadosBusquedaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda
{
    
    public ResultadosBusquedaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXISTEPAGINASIGUIENTE$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "existePaginaSiguiente");
    private static final javax.xml.namespace.QName EXISTEPAGINAANTERIOR$2 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "existePaginaAnterior");
    private static final javax.xml.namespace.QName DOCUMENTOBUSQUEDA$4 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "documentoBusqueda");
    private static final javax.xml.namespace.QName ELEMETOS$6 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "elemetos");
    
    
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
     * Gets array of all "elemetos" elements
     */
    public org.netbeans.xml.schema.esquemaprimario.Elemento[] getElemetosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ELEMETOS$6, targetList);
            org.netbeans.xml.schema.esquemaprimario.Elemento[] result = new org.netbeans.xml.schema.esquemaprimario.Elemento[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "elemetos" element
     */
    public org.netbeans.xml.schema.esquemaprimario.Elemento getElemetosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMETOS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "elemetos" element
     */
    public boolean isNilElemetosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMETOS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "elemetos" element
     */
    public int sizeOfElemetosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEMETOS$6);
        }
    }
    
    /**
     * Sets array of all "elemetos" element
     */
    public void setElemetosArray(org.netbeans.xml.schema.esquemaprimario.Elemento[] elemetosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(elemetosArray, ELEMETOS$6);
        }
    }
    
    /**
     * Sets ith "elemetos" element
     */
    public void setElemetosArray(int i, org.netbeans.xml.schema.esquemaprimario.Elemento elemetos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMETOS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(elemetos);
        }
    }
    
    /**
     * Nils the ith "elemetos" element
     */
    public void setNilElemetosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().find_element_user(ELEMETOS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "elemetos" element
     */
    public org.netbeans.xml.schema.esquemaprimario.Elemento insertNewElemetos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().insert_element_user(ELEMETOS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "elemetos" element
     */
    public org.netbeans.xml.schema.esquemaprimario.Elemento addNewElemetos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Elemento target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Elemento)get_store().add_element_user(ELEMETOS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "elemetos" element
     */
    public void removeElemetos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEMETOS$6, i);
        }
    }
}
