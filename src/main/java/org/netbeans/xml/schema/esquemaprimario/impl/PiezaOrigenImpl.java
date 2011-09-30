/*
 * XML Type:  piezaOrigen
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.PiezaOrigen
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML piezaOrigen(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class PiezaOrigenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.PiezaOrigen
{
    
    public PiezaOrigenImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName IDPIEZA$10 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idPieza");
    private static final javax.xml.namespace.QName NOMBREPIEZA$12 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombrePieza");
    private static final javax.xml.namespace.QName DOCUMENTOS$14 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "documentos");
    private static final javax.xml.namespace.QName IDEXPEDIENTE$16 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idExpediente");
    private static final javax.xml.namespace.QName CODIGOSERIEDOCUMENTAL$18 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "codigoSerieDocumental");
    private static final javax.xml.namespace.QName NOMBRESERIEDOCUMENTAL$20 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreSerieDocumental");
    private static final javax.xml.namespace.QName ACTIVA$22 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "activa");
    private static final javax.xml.namespace.QName CAMPOS$24 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "campos");
    private static final javax.xml.namespace.QName IDALMACENFILENET$26 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idAlmacenFilenet");
    private static final javax.xml.namespace.QName IDTIPOFN$28 = 
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
     * Gets the "idPieza" element
     */
    public int getIdPieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPIEZA$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "idPieza" element
     */
    public org.apache.xmlbeans.XmlInt xgetIdPieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDPIEZA$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "idPieza" element
     */
    public boolean isNilIdPieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDPIEZA$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "idPieza" element
     */
    public void setIdPieza(int idPieza)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPIEZA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDPIEZA$10);
            }
            target.setIntValue(idPieza);
        }
    }
    
    /**
     * Sets (as xml) the "idPieza" element
     */
    public void xsetIdPieza(org.apache.xmlbeans.XmlInt idPieza)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDPIEZA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDPIEZA$10);
            }
            target.set(idPieza);
        }
    }
    
    /**
     * Nils the "idPieza" element
     */
    public void setNilIdPieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDPIEZA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDPIEZA$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "nombrePieza" element
     */
    public java.lang.String getNombrePieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREPIEZA$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombrePieza" element
     */
    public org.apache.xmlbeans.XmlString xgetNombrePieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREPIEZA$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "nombrePieza" element
     */
    public boolean isNilNombrePieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREPIEZA$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nombrePieza" element
     */
    public void setNombrePieza(java.lang.String nombrePieza)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREPIEZA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREPIEZA$12);
            }
            target.setStringValue(nombrePieza);
        }
    }
    
    /**
     * Sets (as xml) the "nombrePieza" element
     */
    public void xsetNombrePieza(org.apache.xmlbeans.XmlString nombrePieza)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREPIEZA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREPIEZA$12);
            }
            target.set(nombrePieza);
        }
    }
    
    /**
     * Nils the "nombrePieza" element
     */
    public void setNilNombrePieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREPIEZA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREPIEZA$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets array of all "documentos" elements
     */
    public org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen[] getDocumentosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTOS$14, targetList);
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen[] result = new org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "documentos" element
     */
    public org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen getDocumentosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTOS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "documentos" element
     */
    public boolean isNilDocumentosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTOS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "documentos" element
     */
    public int sizeOfDocumentosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTOS$14);
        }
    }
    
    /**
     * Sets array of all "documentos" element
     */
    public void setDocumentosArray(org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen[] documentosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(documentosArray, DOCUMENTOS$14);
        }
    }
    
    /**
     * Sets ith "documentos" element
     */
    public void setDocumentosArray(int i, org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen documentos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTOS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(documentos);
        }
    }
    
    /**
     * Nils the ith "documentos" element
     */
    public void setNilDocumentosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().find_element_user(DOCUMENTOS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentos" element
     */
    public org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen insertNewDocumentos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().insert_element_user(DOCUMENTOS$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentos" element
     */
    public org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen addNewDocumentos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen)get_store().add_element_user(DOCUMENTOS$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "documentos" element
     */
    public void removeDocumentos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTOS$14, i);
        }
    }
    
    /**
     * Gets the "idExpediente" element
     */
    public java.lang.String getIdExpediente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEXPEDIENTE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idExpediente" element
     */
    public org.apache.xmlbeans.XmlString xgetIdExpediente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEXPEDIENTE$16, 0);
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
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEXPEDIENTE$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "idExpediente" element
     */
    public void setIdExpediente(java.lang.String idExpediente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEXPEDIENTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDEXPEDIENTE$16);
            }
            target.setStringValue(idExpediente);
        }
    }
    
    /**
     * Sets (as xml) the "idExpediente" element
     */
    public void xsetIdExpediente(org.apache.xmlbeans.XmlString idExpediente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEXPEDIENTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDEXPEDIENTE$16);
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
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEXPEDIENTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDEXPEDIENTE$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "codigoSerieDocumental" element
     */
    public java.lang.String getCodigoSerieDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoSerieDocumental" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoSerieDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "codigoSerieDocumental" element
     */
    public boolean isNilCodigoSerieDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "codigoSerieDocumental" element
     */
    public void setCodigoSerieDocumental(java.lang.String codigoSerieDocumental)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOSERIEDOCUMENTAL$18);
            }
            target.setStringValue(codigoSerieDocumental);
        }
    }
    
    /**
     * Sets (as xml) the "codigoSerieDocumental" element
     */
    public void xsetCodigoSerieDocumental(org.apache.xmlbeans.XmlString codigoSerieDocumental)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOSERIEDOCUMENTAL$18);
            }
            target.set(codigoSerieDocumental);
        }
    }
    
    /**
     * Nils the "codigoSerieDocumental" element
     */
    public void setNilCodigoSerieDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOSERIEDOCUMENTAL$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "nombreSerieDocumental" element
     */
    public java.lang.String getNombreSerieDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombreSerieDocumental" element
     */
    public org.apache.xmlbeans.XmlString xgetNombreSerieDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "nombreSerieDocumental" element
     */
    public boolean isNilNombreSerieDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nombreSerieDocumental" element
     */
    public void setNombreSerieDocumental(java.lang.String nombreSerieDocumental)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRESERIEDOCUMENTAL$20);
            }
            target.setStringValue(nombreSerieDocumental);
        }
    }
    
    /**
     * Sets (as xml) the "nombreSerieDocumental" element
     */
    public void xsetNombreSerieDocumental(org.apache.xmlbeans.XmlString nombreSerieDocumental)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRESERIEDOCUMENTAL$20);
            }
            target.set(nombreSerieDocumental);
        }
    }
    
    /**
     * Nils the "nombreSerieDocumental" element
     */
    public void setNilNombreSerieDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRESERIEDOCUMENTAL$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "activa" element
     */
    public boolean getActiva()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVA$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "activa" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetActiva()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVA$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "activa" element
     */
    public boolean isNilActiva()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVA$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "activa" element
     */
    public void setActiva(boolean activa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVA$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVA$22);
            }
            target.setBooleanValue(activa);
        }
    }
    
    /**
     * Sets (as xml) the "activa" element
     */
    public void xsetActiva(org.apache.xmlbeans.XmlBoolean activa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVA$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACTIVA$22);
            }
            target.set(activa);
        }
    }
    
    /**
     * Nils the "activa" element
     */
    public void setNilActiva()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVA$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACTIVA$22);
            }
            target.setNil();
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
            get_store().find_all_element_users(CAMPOS$24, targetList);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$24, i);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$24, i);
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
            return get_store().count_elements(CAMPOS$24);
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
            arraySetterHelper(camposArray, CAMPOS$24);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$24, i);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$24, i);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().insert_element_user(CAMPOS$24, i);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(CAMPOS$24);
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
            get_store().remove_element(CAMPOS$24, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALMACENFILENET$26, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDALMACENFILENET$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALMACENFILENET$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDALMACENFILENET$26);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDALMACENFILENET$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDALMACENFILENET$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTIPOFN$28, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTIPOFN$28, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTIPOFN$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDTIPOFN$28);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTIPOFN$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDTIPOFN$28);
            }
            target.set(idTipoFN);
        }
    }
}
