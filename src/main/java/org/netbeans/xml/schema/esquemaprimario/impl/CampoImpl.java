/*
 * XML Type:  campo
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.Campo
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML campo(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class CampoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.Campo
{
    
    public CampoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOMBREORIGEN$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreOrigen");
    private static final javax.xml.namespace.QName TIPOORIGEN$2 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "tipoOrigen");
    private static final javax.xml.namespace.QName STRINGVALUE1$4 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "stringValue");
    private static final javax.xml.namespace.QName INTVALUE1$6 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "intValue");
    private static final javax.xml.namespace.QName BOOLEANVALUE1$8 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "booleanValue");
    private static final javax.xml.namespace.QName DOUBLEVALUE1$10 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "doubleValue");
    private static final javax.xml.namespace.QName BYTEARRAYVALUE1$12 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "byteArrayValue");
    private static final javax.xml.namespace.QName DATEVALUE1$14 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "dateValue");
    private static final javax.xml.namespace.QName NOMBREDESTINO$16 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreDestino");
    private static final javax.xml.namespace.QName TIPODESTINO$18 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "tipoDestino");
    
    
    /**
     * Gets the "nombreOrigen" element
     */
    public java.lang.String getNombreOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREORIGEN$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREORIGEN$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREORIGEN$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREORIGEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREORIGEN$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREORIGEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREORIGEN$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREORIGEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREORIGEN$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOORIGEN$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOORIGEN$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOORIGEN$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOORIGEN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOORIGEN$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOORIGEN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOORIGEN$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOORIGEN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOORIGEN$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "stringValue" element
     */
    public java.lang.String getStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stringValue" element
     */
    public org.apache.xmlbeans.XmlString xgetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "stringValue" element
     */
    public boolean isNilStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "stringValue" element
     */
    public void setStringValue1(java.lang.String stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGVALUE1$4);
            }
            target.setStringValue(stringValue1);
        }
    }
    
    /**
     * Sets (as xml) the "stringValue" element
     */
    public void xsetStringValue1(org.apache.xmlbeans.XmlString stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGVALUE1$4);
            }
            target.set(stringValue1);
        }
    }
    
    /**
     * Nils the "stringValue" element
     */
    public void setNilStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGVALUE1$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "intValue" element
     */
    public int getIntValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTVALUE1$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "intValue" element
     */
    public org.apache.xmlbeans.XmlInt xgetIntValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTVALUE1$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "intValue" element
     */
    public boolean isNilIntValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTVALUE1$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "intValue" element
     */
    public void setIntValue1(int intValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTVALUE1$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTVALUE1$6);
            }
            target.setIntValue(intValue1);
        }
    }
    
    /**
     * Sets (as xml) the "intValue" element
     */
    public void xsetIntValue1(org.apache.xmlbeans.XmlInt intValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTVALUE1$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INTVALUE1$6);
            }
            target.set(intValue1);
        }
    }
    
    /**
     * Nils the "intValue" element
     */
    public void setNilIntValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTVALUE1$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INTVALUE1$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "booleanValue" element
     */
    public boolean getBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "booleanValue" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "booleanValue" element
     */
    public boolean isNilBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "booleanValue" element
     */
    public void setBooleanValue1(boolean booleanValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANVALUE1$8);
            }
            target.setBooleanValue(booleanValue1);
        }
    }
    
    /**
     * Sets (as xml) the "booleanValue" element
     */
    public void xsetBooleanValue1(org.apache.xmlbeans.XmlBoolean booleanValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEANVALUE1$8);
            }
            target.set(booleanValue1);
        }
    }
    
    /**
     * Nils the "booleanValue" element
     */
    public void setNilBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEANVALUE1$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "doubleValue" element
     */
    public double getDoubleValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEVALUE1$10, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "doubleValue" element
     */
    public org.apache.xmlbeans.XmlDouble xgetDoubleValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DOUBLEVALUE1$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "doubleValue" element
     */
    public boolean isNilDoubleValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DOUBLEVALUE1$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "doubleValue" element
     */
    public void setDoubleValue1(double doubleValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEVALUE1$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOUBLEVALUE1$10);
            }
            target.setDoubleValue(doubleValue1);
        }
    }
    
    /**
     * Sets (as xml) the "doubleValue" element
     */
    public void xsetDoubleValue1(org.apache.xmlbeans.XmlDouble doubleValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DOUBLEVALUE1$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(DOUBLEVALUE1$10);
            }
            target.set(doubleValue1);
        }
    }
    
    /**
     * Nils the "doubleValue" element
     */
    public void setNilDoubleValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DOUBLEVALUE1$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(DOUBLEVALUE1$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets array of all "byteArrayValue" elements
     */
    public byte[] getByteArrayValue1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BYTEARRAYVALUE1$12, targetList);
            byte[] result = new byte[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getByteValue();
            return result;
        }
    }
    
    /**
     * Gets ith "byteArrayValue" element
     */
    public byte getByteArrayValue1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYTEARRAYVALUE1$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "byteArrayValue" elements
     */
    public org.apache.xmlbeans.XmlByte[] xgetByteArrayValue1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BYTEARRAYVALUE1$12, targetList);
            org.apache.xmlbeans.XmlByte[] result = new org.apache.xmlbeans.XmlByte[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "byteArrayValue" element
     */
    public org.apache.xmlbeans.XmlByte xgetByteArrayValue1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(BYTEARRAYVALUE1$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlByte)target;
        }
    }
    
    /**
     * Tests for nil ith "byteArrayValue" element
     */
    public boolean isNilByteArrayValue1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(BYTEARRAYVALUE1$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "byteArrayValue" element
     */
    public int sizeOfByteArrayValue1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BYTEARRAYVALUE1$12);
        }
    }
    
    /**
     * Sets array of all "byteArrayValue" element
     */
    public void setByteArrayValue1Array(byte[] byteArrayValue1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(byteArrayValue1Array, BYTEARRAYVALUE1$12);
        }
    }
    
    /**
     * Sets ith "byteArrayValue" element
     */
    public void setByteArrayValue1Array(int i, byte byteArrayValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYTEARRAYVALUE1$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setByteValue(byteArrayValue1);
        }
    }
    
    /**
     * Sets (as xml) array of all "byteArrayValue" element
     */
    public void xsetByteArrayValue1Array(org.apache.xmlbeans.XmlByte[]byteArrayValue1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(byteArrayValue1Array, BYTEARRAYVALUE1$12);
        }
    }
    
    /**
     * Sets (as xml) ith "byteArrayValue" element
     */
    public void xsetByteArrayValue1Array(int i, org.apache.xmlbeans.XmlByte byteArrayValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(BYTEARRAYVALUE1$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(byteArrayValue1);
        }
    }
    
    /**
     * Nils the ith "byteArrayValue" element
     */
    public void setNilByteArrayValue1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(BYTEARRAYVALUE1$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "byteArrayValue" element
     */
    public void insertByteArrayValue1(int i, byte byteArrayValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BYTEARRAYVALUE1$12, i);
            target.setByteValue(byteArrayValue1);
        }
    }
    
    /**
     * Appends the value as the last "byteArrayValue" element
     */
    public void addByteArrayValue1(byte byteArrayValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BYTEARRAYVALUE1$12);
            target.setByteValue(byteArrayValue1);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "byteArrayValue" element
     */
    public org.apache.xmlbeans.XmlByte insertNewByteArrayValue1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().insert_element_user(BYTEARRAYVALUE1$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "byteArrayValue" element
     */
    public org.apache.xmlbeans.XmlByte addNewByteArrayValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().add_element_user(BYTEARRAYVALUE1$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "byteArrayValue" element
     */
    public void removeByteArrayValue1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BYTEARRAYVALUE1$12, i);
        }
    }
    
    /**
     * Gets the "dateValue" element
     */
    public java.util.Calendar getDateValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEVALUE1$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateValue" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEVALUE1$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "dateValue" element
     */
    public boolean isNilDateValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEVALUE1$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "dateValue" element
     */
    public void setDateValue1(java.util.Calendar dateValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEVALUE1$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEVALUE1$14);
            }
            target.setCalendarValue(dateValue1);
        }
    }
    
    /**
     * Sets (as xml) the "dateValue" element
     */
    public void xsetDateValue1(org.apache.xmlbeans.XmlDateTime dateValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEVALUE1$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATEVALUE1$14);
            }
            target.set(dateValue1);
        }
    }
    
    /**
     * Nils the "dateValue" element
     */
    public void setNilDateValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEVALUE1$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATEVALUE1$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREDESTINO$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREDESTINO$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREDESTINO$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREDESTINO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREDESTINO$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREDESTINO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREDESTINO$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREDESTINO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREDESTINO$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODESTINO$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODESTINO$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODESTINO$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODESTINO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODESTINO$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODESTINO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODESTINO$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODESTINO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODESTINO$18);
            }
            target.setNil();
        }
    }
}
