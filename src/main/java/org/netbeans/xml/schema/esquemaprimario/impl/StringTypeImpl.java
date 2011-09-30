/*
 * XML Type:  String_Type
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.StringType
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML String_Type(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is an atomic type that is a restriction of org.netbeans.xml.schema.esquemaprimario.StringType.
 */
public class StringTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.netbeans.xml.schema.esquemaprimario.StringType
{
    
    public StringTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected StringTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ISUPDATED$0 = 
        new javax.xml.namespace.QName("", "isUpdated");
    
    
    /**
     * Gets the "isUpdated" attribute
     */
    public boolean getIsUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISUPDATED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISUPDATED$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isUpdated" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISUPDATED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISUPDATED$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "isUpdated" attribute
     */
    public boolean isSetIsUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISUPDATED$0) != null;
        }
    }
    
    /**
     * Sets the "isUpdated" attribute
     */
    public void setIsUpdated(boolean isUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISUPDATED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISUPDATED$0);
            }
            target.setBooleanValue(isUpdated);
        }
    }
    
    /**
     * Sets (as xml) the "isUpdated" attribute
     */
    public void xsetIsUpdated(org.apache.xmlbeans.XmlBoolean isUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISUPDATED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISUPDATED$0);
            }
            target.set(isUpdated);
        }
    }
    
    /**
     * Unsets the "isUpdated" attribute
     */
    public void unsetIsUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISUPDATED$0);
        }
    }
}
