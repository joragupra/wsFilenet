/*
 * XML Type:  campoBusqueda
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.CampoBusqueda
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML campoBusqueda(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class CampoBusquedaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.CampoBusqueda
{
    
    public CampoBusquedaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDICIONES$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "condiciones");
    private static final javax.xml.namespace.QName STRINGVALORES$2 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "stringValores");
    private static final javax.xml.namespace.QName INTVALORES$4 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "intValores");
    private static final javax.xml.namespace.QName BOOLEANVALORES$6 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "booleanValores");
    private static final javax.xml.namespace.QName DOUBLEVALORES$8 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "doubleValores");
    private static final javax.xml.namespace.QName DATEVALORES$10 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "dateValores");
    private static final javax.xml.namespace.QName TIPOSENLACE$12 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "tiposEnlace");
    private static final javax.xml.namespace.QName NOMBREORIGEN$14 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreOrigen");
    private static final javax.xml.namespace.QName TIPOORIGEN$16 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "tipoOrigen");
    private static final javax.xml.namespace.QName NOMBREDESTINO$18 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreDestino");
    private static final javax.xml.namespace.QName TIPODESTINO$20 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "tipoDestino");
    
    
    /**
     * Gets array of all "condiciones" elements
     */
    public int[] getCondicionesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDICIONES$0, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "condiciones" element
     */
    public int getCondicionesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDICIONES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "condiciones" elements
     */
    public org.apache.xmlbeans.XmlInt[] xgetCondicionesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDICIONES$0, targetList);
            org.apache.xmlbeans.XmlInt[] result = new org.apache.xmlbeans.XmlInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "condiciones" element
     */
    public org.apache.xmlbeans.XmlInt xgetCondicionesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONDICIONES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInt)target;
        }
    }
    
    /**
     * Tests for nil ith "condiciones" element
     */
    public boolean isNilCondicionesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONDICIONES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "condiciones" element
     */
    public int sizeOfCondicionesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDICIONES$0);
        }
    }
    
    /**
     * Sets array of all "condiciones" element
     */
    public void setCondicionesArray(int[] condicionesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(condicionesArray, CONDICIONES$0);
        }
    }
    
    /**
     * Sets ith "condiciones" element
     */
    public void setCondicionesArray(int i, int condiciones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDICIONES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(condiciones);
        }
    }
    
    /**
     * Sets (as xml) array of all "condiciones" element
     */
    public void xsetCondicionesArray(org.apache.xmlbeans.XmlInt[]condicionesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(condicionesArray, CONDICIONES$0);
        }
    }
    
    /**
     * Sets (as xml) ith "condiciones" element
     */
    public void xsetCondicionesArray(int i, org.apache.xmlbeans.XmlInt condiciones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONDICIONES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(condiciones);
        }
    }
    
    /**
     * Nils the ith "condiciones" element
     */
    public void setNilCondicionesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONDICIONES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "condiciones" element
     */
    public void insertCondiciones(int i, int condiciones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CONDICIONES$0, i);
            target.setIntValue(condiciones);
        }
    }
    
    /**
     * Appends the value as the last "condiciones" element
     */
    public void addCondiciones(int condiciones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONDICIONES$0);
            target.setIntValue(condiciones);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "condiciones" element
     */
    public org.apache.xmlbeans.XmlInt insertNewCondiciones(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(CONDICIONES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "condiciones" element
     */
    public org.apache.xmlbeans.XmlInt addNewCondiciones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CONDICIONES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "condiciones" element
     */
    public void removeCondiciones(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDICIONES$0, i);
        }
    }
    
    /**
     * Gets array of all "stringValores" elements
     */
    public java.lang.String[] getStringValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRINGVALORES$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "stringValores" element
     */
    public java.lang.String getStringValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALORES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "stringValores" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetStringValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRINGVALORES$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "stringValores" element
     */
    public org.apache.xmlbeans.XmlString xgetStringValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALORES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Tests for nil ith "stringValores" element
     */
    public boolean isNilStringValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALORES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "stringValores" element
     */
    public int sizeOfStringValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRINGVALORES$2);
        }
    }
    
    /**
     * Sets array of all "stringValores" element
     */
    public void setStringValoresArray(java.lang.String[] stringValoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stringValoresArray, STRINGVALORES$2);
        }
    }
    
    /**
     * Sets ith "stringValores" element
     */
    public void setStringValoresArray(int i, java.lang.String stringValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALORES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(stringValores);
        }
    }
    
    /**
     * Sets (as xml) array of all "stringValores" element
     */
    public void xsetStringValoresArray(org.apache.xmlbeans.XmlString[]stringValoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stringValoresArray, STRINGVALORES$2);
        }
    }
    
    /**
     * Sets (as xml) ith "stringValores" element
     */
    public void xsetStringValoresArray(int i, org.apache.xmlbeans.XmlString stringValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALORES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stringValores);
        }
    }
    
    /**
     * Nils the ith "stringValores" element
     */
    public void setNilStringValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALORES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "stringValores" element
     */
    public void insertStringValores(int i, java.lang.String stringValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRINGVALORES$2, i);
            target.setStringValue(stringValores);
        }
    }
    
    /**
     * Appends the value as the last "stringValores" element
     */
    public void addStringValores(java.lang.String stringValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGVALORES$2);
            target.setStringValue(stringValores);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stringValores" element
     */
    public org.apache.xmlbeans.XmlString insertNewStringValores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STRINGVALORES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stringValores" element
     */
    public org.apache.xmlbeans.XmlString addNewStringValores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGVALORES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "stringValores" element
     */
    public void removeStringValores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRINGVALORES$2, i);
        }
    }
    
    /**
     * Gets array of all "intValores" elements
     */
    public int[] getIntValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTVALORES$4, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "intValores" element
     */
    public int getIntValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTVALORES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "intValores" elements
     */
    public org.apache.xmlbeans.XmlInt[] xgetIntValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTVALORES$4, targetList);
            org.apache.xmlbeans.XmlInt[] result = new org.apache.xmlbeans.XmlInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "intValores" element
     */
    public org.apache.xmlbeans.XmlInt xgetIntValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTVALORES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInt)target;
        }
    }
    
    /**
     * Tests for nil ith "intValores" element
     */
    public boolean isNilIntValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTVALORES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "intValores" element
     */
    public int sizeOfIntValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTVALORES$4);
        }
    }
    
    /**
     * Sets array of all "intValores" element
     */
    public void setIntValoresArray(int[] intValoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(intValoresArray, INTVALORES$4);
        }
    }
    
    /**
     * Sets ith "intValores" element
     */
    public void setIntValoresArray(int i, int intValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTVALORES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(intValores);
        }
    }
    
    /**
     * Sets (as xml) array of all "intValores" element
     */
    public void xsetIntValoresArray(org.apache.xmlbeans.XmlInt[]intValoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(intValoresArray, INTVALORES$4);
        }
    }
    
    /**
     * Sets (as xml) ith "intValores" element
     */
    public void xsetIntValoresArray(int i, org.apache.xmlbeans.XmlInt intValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTVALORES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(intValores);
        }
    }
    
    /**
     * Nils the ith "intValores" element
     */
    public void setNilIntValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTVALORES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "intValores" element
     */
    public void insertIntValores(int i, int intValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INTVALORES$4, i);
            target.setIntValue(intValores);
        }
    }
    
    /**
     * Appends the value as the last "intValores" element
     */
    public void addIntValores(int intValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTVALORES$4);
            target.setIntValue(intValores);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "intValores" element
     */
    public org.apache.xmlbeans.XmlInt insertNewIntValores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(INTVALORES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "intValores" element
     */
    public org.apache.xmlbeans.XmlInt addNewIntValores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INTVALORES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "intValores" element
     */
    public void removeIntValores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTVALORES$4, i);
        }
    }
    
    /**
     * Gets array of all "booleanValores" elements
     */
    public boolean[] getBooleanValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOLEANVALORES$6, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "booleanValores" element
     */
    public boolean getBooleanValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANVALORES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "booleanValores" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetBooleanValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOLEANVALORES$6, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "booleanValores" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBooleanValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALORES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlBoolean)target;
        }
    }
    
    /**
     * Tests for nil ith "booleanValores" element
     */
    public boolean isNilBooleanValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALORES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "booleanValores" element
     */
    public int sizeOfBooleanValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLEANVALORES$6);
        }
    }
    
    /**
     * Sets array of all "booleanValores" element
     */
    public void setBooleanValoresArray(boolean[] booleanValoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(booleanValoresArray, BOOLEANVALORES$6);
        }
    }
    
    /**
     * Sets ith "booleanValores" element
     */
    public void setBooleanValoresArray(int i, boolean booleanValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANVALORES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(booleanValores);
        }
    }
    
    /**
     * Sets (as xml) array of all "booleanValores" element
     */
    public void xsetBooleanValoresArray(org.apache.xmlbeans.XmlBoolean[]booleanValoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(booleanValoresArray, BOOLEANVALORES$6);
        }
    }
    
    /**
     * Sets (as xml) ith "booleanValores" element
     */
    public void xsetBooleanValoresArray(int i, org.apache.xmlbeans.XmlBoolean booleanValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALORES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(booleanValores);
        }
    }
    
    /**
     * Nils the ith "booleanValores" element
     */
    public void setNilBooleanValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALORES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "booleanValores" element
     */
    public void insertBooleanValores(int i, boolean booleanValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BOOLEANVALORES$6, i);
            target.setBooleanValue(booleanValores);
        }
    }
    
    /**
     * Appends the value as the last "booleanValores" element
     */
    public void addBooleanValores(boolean booleanValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANVALORES$6);
            target.setBooleanValue(booleanValores);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "booleanValores" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewBooleanValores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(BOOLEANVALORES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "booleanValores" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewBooleanValores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEANVALORES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "booleanValores" element
     */
    public void removeBooleanValores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLEANVALORES$6, i);
        }
    }
    
    /**
     * Gets array of all "doubleValores" elements
     */
    public double[] getDoubleValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOUBLEVALORES$8, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "doubleValores" element
     */
    public double getDoubleValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEVALORES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "doubleValores" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetDoubleValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOUBLEVALORES$8, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "doubleValores" element
     */
    public org.apache.xmlbeans.XmlDouble xgetDoubleValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DOUBLEVALORES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "doubleValores" element
     */
    public boolean isNilDoubleValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DOUBLEVALORES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "doubleValores" element
     */
    public int sizeOfDoubleValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOUBLEVALORES$8);
        }
    }
    
    /**
     * Sets array of all "doubleValores" element
     */
    public void setDoubleValoresArray(double[] doubleValoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(doubleValoresArray, DOUBLEVALORES$8);
        }
    }
    
    /**
     * Sets ith "doubleValores" element
     */
    public void setDoubleValoresArray(int i, double doubleValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEVALORES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(doubleValores);
        }
    }
    
    /**
     * Sets (as xml) array of all "doubleValores" element
     */
    public void xsetDoubleValoresArray(org.apache.xmlbeans.XmlDouble[]doubleValoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(doubleValoresArray, DOUBLEVALORES$8);
        }
    }
    
    /**
     * Sets (as xml) ith "doubleValores" element
     */
    public void xsetDoubleValoresArray(int i, org.apache.xmlbeans.XmlDouble doubleValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DOUBLEVALORES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(doubleValores);
        }
    }
    
    /**
     * Nils the ith "doubleValores" element
     */
    public void setNilDoubleValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DOUBLEVALORES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "doubleValores" element
     */
    public void insertDoubleValores(int i, double doubleValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DOUBLEVALORES$8, i);
            target.setDoubleValue(doubleValores);
        }
    }
    
    /**
     * Appends the value as the last "doubleValores" element
     */
    public void addDoubleValores(double doubleValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOUBLEVALORES$8);
            target.setDoubleValue(doubleValores);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "doubleValores" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewDoubleValores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(DOUBLEVALORES$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "doubleValores" element
     */
    public org.apache.xmlbeans.XmlDouble addNewDoubleValores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(DOUBLEVALORES$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "doubleValores" element
     */
    public void removeDoubleValores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOUBLEVALORES$8, i);
        }
    }
    
    /**
     * Gets array of all "dateValores" elements
     */
    public java.util.Calendar[] getDateValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATEVALORES$10, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "dateValores" element
     */
    public java.util.Calendar getDateValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEVALORES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "dateValores" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetDateValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATEVALORES$10, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "dateValores" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEVALORES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDateTime)target;
        }
    }
    
    /**
     * Tests for nil ith "dateValores" element
     */
    public boolean isNilDateValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEVALORES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "dateValores" element
     */
    public int sizeOfDateValoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEVALORES$10);
        }
    }
    
    /**
     * Sets array of all "dateValores" element
     */
    public void setDateValoresArray(java.util.Calendar[] dateValoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateValoresArray, DATEVALORES$10);
        }
    }
    
    /**
     * Sets ith "dateValores" element
     */
    public void setDateValoresArray(int i, java.util.Calendar dateValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEVALORES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(dateValores);
        }
    }
    
    /**
     * Sets (as xml) array of all "dateValores" element
     */
    public void xsetDateValoresArray(org.apache.xmlbeans.XmlDateTime[]dateValoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateValoresArray, DATEVALORES$10);
        }
    }
    
    /**
     * Sets (as xml) ith "dateValores" element
     */
    public void xsetDateValoresArray(int i, org.apache.xmlbeans.XmlDateTime dateValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEVALORES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dateValores);
        }
    }
    
    /**
     * Nils the ith "dateValores" element
     */
    public void setNilDateValoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEVALORES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "dateValores" element
     */
    public void insertDateValores(int i, java.util.Calendar dateValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATEVALORES$10, i);
            target.setCalendarValue(dateValores);
        }
    }
    
    /**
     * Appends the value as the last "dateValores" element
     */
    public void addDateValores(java.util.Calendar dateValores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEVALORES$10);
            target.setCalendarValue(dateValores);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dateValores" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewDateValores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(DATEVALORES$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dateValores" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewDateValores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATEVALORES$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "dateValores" element
     */
    public void removeDateValores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEVALORES$10, i);
        }
    }
    
    /**
     * Gets array of all "tiposEnlace" elements
     */
    public java.lang.String[] getTiposEnlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSENLACE$12, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "tiposEnlace" element
     */
    public java.lang.String getTiposEnlaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOSENLACE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "tiposEnlace" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetTiposEnlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSENLACE$12, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "tiposEnlace" element
     */
    public org.apache.xmlbeans.XmlString xgetTiposEnlaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOSENLACE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Tests for nil ith "tiposEnlace" element
     */
    public boolean isNilTiposEnlaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOSENLACE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "tiposEnlace" element
     */
    public int sizeOfTiposEnlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSENLACE$12);
        }
    }
    
    /**
     * Sets array of all "tiposEnlace" element
     */
    public void setTiposEnlaceArray(java.lang.String[] tiposEnlaceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tiposEnlaceArray, TIPOSENLACE$12);
        }
    }
    
    /**
     * Sets ith "tiposEnlace" element
     */
    public void setTiposEnlaceArray(int i, java.lang.String tiposEnlace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOSENLACE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(tiposEnlace);
        }
    }
    
    /**
     * Sets (as xml) array of all "tiposEnlace" element
     */
    public void xsetTiposEnlaceArray(org.apache.xmlbeans.XmlString[]tiposEnlaceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tiposEnlaceArray, TIPOSENLACE$12);
        }
    }
    
    /**
     * Sets (as xml) ith "tiposEnlace" element
     */
    public void xsetTiposEnlaceArray(int i, org.apache.xmlbeans.XmlString tiposEnlace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOSENLACE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tiposEnlace);
        }
    }
    
    /**
     * Nils the ith "tiposEnlace" element
     */
    public void setNilTiposEnlaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOSENLACE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "tiposEnlace" element
     */
    public void insertTiposEnlace(int i, java.lang.String tiposEnlace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TIPOSENLACE$12, i);
            target.setStringValue(tiposEnlace);
        }
    }
    
    /**
     * Appends the value as the last "tiposEnlace" element
     */
    public void addTiposEnlace(java.lang.String tiposEnlace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOSENLACE$12);
            target.setStringValue(tiposEnlace);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposEnlace" element
     */
    public org.apache.xmlbeans.XmlString insertNewTiposEnlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TIPOSENLACE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposEnlace" element
     */
    public org.apache.xmlbeans.XmlString addNewTiposEnlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOSENLACE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposEnlace" element
     */
    public void removeTiposEnlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSENLACE$12, i);
        }
    }
    
    /**
     * Gets the "nombreOrigen" element
     */
    public java.lang.String getNombreOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREORIGEN$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombreOrigen" element
     */
    public org.apache.xmlbeans.XmlString xgetNombreOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREORIGEN$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "nombreOrigen" element
     */
    public boolean isNilNombreOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREORIGEN$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nombreOrigen" element
     */
    public void setNombreOrigen(java.lang.String nombreOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREORIGEN$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREORIGEN$14);
            }
            target.setStringValue(nombreOrigen);
        }
    }
    
    /**
     * Sets (as xml) the "nombreOrigen" element
     */
    public void xsetNombreOrigen(org.apache.xmlbeans.XmlString nombreOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREORIGEN$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREORIGEN$14);
            }
            target.set(nombreOrigen);
        }
    }
    
    /**
     * Nils the "nombreOrigen" element
     */
    public void setNilNombreOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREORIGEN$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREORIGEN$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "tipoOrigen" element
     */
    public java.lang.String getTipoOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOORIGEN$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipoOrigen" element
     */
    public org.apache.xmlbeans.XmlString xgetTipoOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOORIGEN$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "tipoOrigen" element
     */
    public boolean isNilTipoOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOORIGEN$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "tipoOrigen" element
     */
    public void setTipoOrigen(java.lang.String tipoOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOORIGEN$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOORIGEN$16);
            }
            target.setStringValue(tipoOrigen);
        }
    }
    
    /**
     * Sets (as xml) the "tipoOrigen" element
     */
    public void xsetTipoOrigen(org.apache.xmlbeans.XmlString tipoOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOORIGEN$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOORIGEN$16);
            }
            target.set(tipoOrigen);
        }
    }
    
    /**
     * Nils the "tipoOrigen" element
     */
    public void setNilTipoOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOORIGEN$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOORIGEN$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "nombreDestino" element
     */
    public java.lang.String getNombreDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREDESTINO$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombreDestino" element
     */
    public org.apache.xmlbeans.XmlString xgetNombreDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREDESTINO$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "nombreDestino" element
     */
    public boolean isNilNombreDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREDESTINO$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nombreDestino" element
     */
    public void setNombreDestino(java.lang.String nombreDestino)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREDESTINO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREDESTINO$18);
            }
            target.setStringValue(nombreDestino);
        }
    }
    
    /**
     * Sets (as xml) the "nombreDestino" element
     */
    public void xsetNombreDestino(org.apache.xmlbeans.XmlString nombreDestino)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREDESTINO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREDESTINO$18);
            }
            target.set(nombreDestino);
        }
    }
    
    /**
     * Nils the "nombreDestino" element
     */
    public void setNilNombreDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREDESTINO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREDESTINO$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "tipoDestino" element
     */
    public java.lang.String getTipoDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODESTINO$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipoDestino" element
     */
    public org.apache.xmlbeans.XmlString xgetTipoDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODESTINO$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "tipoDestino" element
     */
    public boolean isNilTipoDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODESTINO$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "tipoDestino" element
     */
    public void setTipoDestino(java.lang.String tipoDestino)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODESTINO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODESTINO$20);
            }
            target.setStringValue(tipoDestino);
        }
    }
    
    /**
     * Sets (as xml) the "tipoDestino" element
     */
    public void xsetTipoDestino(org.apache.xmlbeans.XmlString tipoDestino)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODESTINO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODESTINO$20);
            }
            target.set(tipoDestino);
        }
    }
    
    /**
     * Nils the "tipoDestino" element
     */
    public void setNilTipoDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODESTINO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODESTINO$20);
            }
            target.setNil();
        }
    }
}
