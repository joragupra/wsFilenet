/*
 * XML Type:  expedienteOrigen
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML expedienteOrigen(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class ExpedienteOrigenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen
{
    
    public ExpedienteOrigenImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDSISTEMAORIGEN$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idSistemaOrigen");
    private static final javax.xml.namespace.QName USUARIOINDEXACION$2 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "usuarioIndexacion");
    private static final javax.xml.namespace.QName TITULO$4 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "titulo");
    private static final javax.xml.namespace.QName FECHACREACION$6 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "fechaCreacion");
    private static final javax.xml.namespace.QName IDFILENET$8 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idFileNet");
    private static final javax.xml.namespace.QName IDEXPEDIENTE$10 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idExpediente");
    private static final javax.xml.namespace.QName NOMBREEXPEDIENTE$12 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreExpediente");
    private static final javax.xml.namespace.QName PIEZAS$14 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "piezas");
    private static final javax.xml.namespace.QName CAMPOS$16 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "campos");
    private static final javax.xml.namespace.QName IDALMACENFILENET$18 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idAlmacenFilenet");
    private static final javax.xml.namespace.QName IDTIPOFN$20 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idTipoFN");
    
    
    /**
     * Gets the "idSistemaOrigen" element
     */
    public int getIdSistemaOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "idSistemaOrigen" element
     */
    public org.apache.xmlbeans.XmlInt xgetIdSistemaOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "idSistemaOrigen" element
     */
    public boolean isNilIdSistemaOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "idSistemaOrigen" element
     */
    public void setIdSistemaOrigen(int idSistemaOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDSISTEMAORIGEN$0);
            }
            target.setIntValue(idSistemaOrigen);
        }
    }
    
    /**
     * Sets (as xml) the "idSistemaOrigen" element
     */
    public void xsetIdSistemaOrigen(org.apache.xmlbeans.XmlInt idSistemaOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDSISTEMAORIGEN$0);
            }
            target.set(idSistemaOrigen);
        }
    }
    
    /**
     * Nils the "idSistemaOrigen" element
     */
    public void setNilIdSistemaOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSISTEMAORIGEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDSISTEMAORIGEN$0);
            }
            target.setNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACION$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "usuarioIndexacion" element
     */
    public boolean isNilUsuarioIndexacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$2, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIOINDEXACION$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACION$2);
            }
            target.set(usuarioIndexacion);
        }
    }
    
    /**
     * Nils the "usuarioIndexacion" element
     */
    public void setNilUsuarioIndexacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "titulo" element
     */
    public java.lang.String getTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITULO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "titulo" element
     */
    public org.apache.xmlbeans.XmlString xgetTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITULO$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "titulo" element
     */
    public boolean isNilTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITULO$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "titulo" element
     */
    public void setTitulo(java.lang.String titulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITULO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITULO$4);
            }
            target.setStringValue(titulo);
        }
    }
    
    /**
     * Sets (as xml) the "titulo" element
     */
    public void xsetTitulo(org.apache.xmlbeans.XmlString titulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITULO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITULO$4);
            }
            target.set(titulo);
        }
    }
    
    /**
     * Nils the "titulo" element
     */
    public void setNilTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITULO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITULO$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "fechaCreacion" element
     */
    public java.util.Calendar getFechaCreacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHACREACION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "fechaCreacion" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetFechaCreacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHACREACION$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "fechaCreacion" element
     */
    public boolean isNilFechaCreacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHACREACION$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "fechaCreacion" element
     */
    public void setFechaCreacion(java.util.Calendar fechaCreacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHACREACION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHACREACION$6);
            }
            target.setCalendarValue(fechaCreacion);
        }
    }
    
    /**
     * Sets (as xml) the "fechaCreacion" element
     */
    public void xsetFechaCreacion(org.apache.xmlbeans.XmlDateTime fechaCreacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHACREACION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FECHACREACION$6);
            }
            target.set(fechaCreacion);
        }
    }
    
    /**
     * Nils the "fechaCreacion" element
     */
    public void setNilFechaCreacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHACREACION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FECHACREACION$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "idFileNet" element
     */
    public java.lang.String getIdFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDFILENET$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idFileNet" element
     */
    public org.apache.xmlbeans.XmlString xgetIdFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDFILENET$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "idFileNet" element
     */
    public boolean isNilIdFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDFILENET$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "idFileNet" element
     */
    public void setIdFileNet(java.lang.String idFileNet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDFILENET$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDFILENET$8);
            }
            target.setStringValue(idFileNet);
        }
    }
    
    /**
     * Sets (as xml) the "idFileNet" element
     */
    public void xsetIdFileNet(org.apache.xmlbeans.XmlString idFileNet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDFILENET$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDFILENET$8);
            }
            target.set(idFileNet);
        }
    }
    
    /**
     * Nils the "idFileNet" element
     */
    public void setNilIdFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDFILENET$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDFILENET$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "idExpediente" element
     */
    public int getIdExpediente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEXPEDIENTE$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "idExpediente" element
     */
    public org.apache.xmlbeans.XmlInt xgetIdExpediente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDEXPEDIENTE$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "idExpediente" element
     */
    public boolean isNilIdExpediente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDEXPEDIENTE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "idExpediente" element
     */
    public void setIdExpediente(int idExpediente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEXPEDIENTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDEXPEDIENTE$10);
            }
            target.setIntValue(idExpediente);
        }
    }
    
    /**
     * Sets (as xml) the "idExpediente" element
     */
    public void xsetIdExpediente(org.apache.xmlbeans.XmlInt idExpediente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDEXPEDIENTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDEXPEDIENTE$10);
            }
            target.set(idExpediente);
        }
    }
    
    /**
     * Nils the "idExpediente" element
     */
    public void setNilIdExpediente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDEXPEDIENTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDEXPEDIENTE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "nombreExpediente" element
     */
    public java.lang.String getNombreExpediente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREEXPEDIENTE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombreExpediente" element
     */
    public org.apache.xmlbeans.XmlString xgetNombreExpediente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREEXPEDIENTE$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "nombreExpediente" element
     */
    public boolean isNilNombreExpediente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREEXPEDIENTE$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nombreExpediente" element
     */
    public void setNombreExpediente(java.lang.String nombreExpediente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREEXPEDIENTE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREEXPEDIENTE$12);
            }
            target.setStringValue(nombreExpediente);
        }
    }
    
    /**
     * Sets (as xml) the "nombreExpediente" element
     */
    public void xsetNombreExpediente(org.apache.xmlbeans.XmlString nombreExpediente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREEXPEDIENTE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREEXPEDIENTE$12);
            }
            target.set(nombreExpediente);
        }
    }
    
    /**
     * Nils the "nombreExpediente" element
     */
    public void setNilNombreExpediente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREEXPEDIENTE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREEXPEDIENTE$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets array of all "piezas" elements
     */
    public org.netbeans.xml.schema.esquemaprimario.PiezaOrigen[] getPiezasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIEZAS$14, targetList);
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen[] result = new org.netbeans.xml.schema.esquemaprimario.PiezaOrigen[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "piezas" element
     */
    public org.netbeans.xml.schema.esquemaprimario.PiezaOrigen getPiezasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().find_element_user(PIEZAS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "piezas" element
     */
    public boolean isNilPiezasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().find_element_user(PIEZAS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "piezas" element
     */
    public int sizeOfPiezasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIEZAS$14);
        }
    }
    
    /**
     * Sets array of all "piezas" element
     */
    public void setPiezasArray(org.netbeans.xml.schema.esquemaprimario.PiezaOrigen[] piezasArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(piezasArray, PIEZAS$14);
        }
    }
    
    /**
     * Sets ith "piezas" element
     */
    public void setPiezasArray(int i, org.netbeans.xml.schema.esquemaprimario.PiezaOrigen piezas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().find_element_user(PIEZAS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(piezas);
        }
    }
    
    /**
     * Nils the ith "piezas" element
     */
    public void setNilPiezasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().find_element_user(PIEZAS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "piezas" element
     */
    public org.netbeans.xml.schema.esquemaprimario.PiezaOrigen insertNewPiezas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().insert_element_user(PIEZAS$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "piezas" element
     */
    public org.netbeans.xml.schema.esquemaprimario.PiezaOrigen addNewPiezas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.PiezaOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.PiezaOrigen)get_store().add_element_user(PIEZAS$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "piezas" element
     */
    public void removePiezas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIEZAS$14, i);
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
            get_store().find_all_element_users(CAMPOS$16, targetList);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$16, i);
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
            return get_store().count_elements(CAMPOS$16);
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
            arraySetterHelper(camposArray, CAMPOS$16);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$16, i);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().insert_element_user(CAMPOS$16, i);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(CAMPOS$16);
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
            get_store().remove_element(CAMPOS$16, i);
        }
    }
    
    /**
     * Gets the "idAlmacenFilenet" element
     */
    public java.lang.String getIdAlmacenFilenet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALMACENFILENET$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idAlmacenFilenet" element
     */
    public org.apache.xmlbeans.XmlString xgetIdAlmacenFilenet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDALMACENFILENET$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "idAlmacenFilenet" element
     */
    public void setIdAlmacenFilenet(java.lang.String idAlmacenFilenet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALMACENFILENET$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDALMACENFILENET$18);
            }
            target.setStringValue(idAlmacenFilenet);
        }
    }
    
    /**
     * Sets (as xml) the "idAlmacenFilenet" element
     */
    public void xsetIdAlmacenFilenet(org.apache.xmlbeans.XmlString idAlmacenFilenet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDALMACENFILENET$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDALMACENFILENET$18);
            }
            target.set(idAlmacenFilenet);
        }
    }
    
    /**
     * Gets the "idTipoFN" element
     */
    public java.lang.String getIdTipoFN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTIPOFN$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idTipoFN" element
     */
    public org.apache.xmlbeans.XmlString xgetIdTipoFN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTIPOFN$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "idTipoFN" element
     */
    public void setIdTipoFN(java.lang.String idTipoFN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTIPOFN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDTIPOFN$20);
            }
            target.setStringValue(idTipoFN);
        }
    }
    
    /**
     * Sets (as xml) the "idTipoFN" element
     */
    public void xsetIdTipoFN(org.apache.xmlbeans.XmlString idTipoFN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTIPOFN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDTIPOFN$20);
            }
            target.set(idTipoFN);
        }
    }
}
