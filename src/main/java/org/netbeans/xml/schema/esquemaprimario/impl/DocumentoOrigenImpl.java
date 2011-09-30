/*
 * XML Type:  documentoOrigen
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML documentoOrigen(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class DocumentoOrigenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen
{
    
    public DocumentoOrigenImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName CODIGOSERIEDOCUMENTAL$10 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "codigoSerieDocumental");
    private static final javax.xml.namespace.QName CODIGOTIPODOCUMENTAL$12 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "codigoTipoDocumental");
    private static final javax.xml.namespace.QName NOMBRESERIEDOCUMENTAL$14 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreSerieDocumental");
    private static final javax.xml.namespace.QName NOMBRETIPODOCUMENTAL$16 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreTipoDocumental");
    private static final javax.xml.namespace.QName NUMERORENT$18 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "numeroREnt");
    private static final javax.xml.namespace.QName DESTINATARIORENT$20 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "destinatarioREnt");
    private static final javax.xml.namespace.QName FECHARECEPCIONRENT$22 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "fechaRecepcionREnt");
    private static final javax.xml.namespace.QName PROCEDENCIARENT$24 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "procedenciaREnt");
    private static final javax.xml.namespace.QName OBSERVACIONESRENT$26 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "observacionesREnt");
    private static final javax.xml.namespace.QName USUARIOINDEXACIONRENT$28 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "usuarioIndexacionREnt");
    private static final javax.xml.namespace.QName NUMEROVERSION$30 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "numeroVersion");
    private static final javax.xml.namespace.QName IDPIEZA$32 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idPieza");
    private static final javax.xml.namespace.QName VERSIONES$34 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "versiones");
    private static final javax.xml.namespace.QName FICHEROS$36 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "ficheros");
    private static final javax.xml.namespace.QName CAMPOS$38 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "campos");
    private static final javax.xml.namespace.QName IDALMACENFILENET$40 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idAlmacenFileNet");
    private static final javax.xml.namespace.QName IDTIPOFN$42 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idTipoFN");
    private static final javax.xml.namespace.QName URLDESCARGA$44 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "urlDescarga");
    private static final javax.xml.namespace.QName URLVISOR$46 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "urlVisor");
    
    
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
     * True if has "idSistemaOrigen" element
     */
    public boolean isSetIdSistemaOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDSISTEMAORIGEN$0) != 0;
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
     * Unsets the "idSistemaOrigen" element
     */
    public void unsetIdSistemaOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDSISTEMAORIGEN$0, 0);
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
     * Gets the "codigoSerieDocumental" element
     */
    public java.lang.String getCodigoSerieDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOSERIEDOCUMENTAL$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOSERIEDOCUMENTAL$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOSERIEDOCUMENTAL$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "codigoTipoDocumental" element
     */
    public java.lang.String getCodigoTipoDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOTIPODOCUMENTAL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoTipoDocumental" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoTipoDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOTIPODOCUMENTAL$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "codigoTipoDocumental" element
     */
    public boolean isNilCodigoTipoDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOTIPODOCUMENTAL$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "codigoTipoDocumental" element
     */
    public void setCodigoTipoDocumental(java.lang.String codigoTipoDocumental)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOTIPODOCUMENTAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOTIPODOCUMENTAL$12);
            }
            target.setStringValue(codigoTipoDocumental);
        }
    }
    
    /**
     * Sets (as xml) the "codigoTipoDocumental" element
     */
    public void xsetCodigoTipoDocumental(org.apache.xmlbeans.XmlString codigoTipoDocumental)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOTIPODOCUMENTAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOTIPODOCUMENTAL$12);
            }
            target.set(codigoTipoDocumental);
        }
    }
    
    /**
     * Nils the "codigoTipoDocumental" element
     */
    public void setNilCodigoTipoDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOTIPODOCUMENTAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOTIPODOCUMENTAL$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRESERIEDOCUMENTAL$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRESERIEDOCUMENTAL$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRESERIEDOCUMENTAL$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "nombreTipoDocumental" element
     */
    public java.lang.String getNombreTipoDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRETIPODOCUMENTAL$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombreTipoDocumental" element
     */
    public org.apache.xmlbeans.XmlString xgetNombreTipoDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRETIPODOCUMENTAL$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "nombreTipoDocumental" element
     */
    public boolean isNilNombreTipoDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRETIPODOCUMENTAL$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nombreTipoDocumental" element
     */
    public void setNombreTipoDocumental(java.lang.String nombreTipoDocumental)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRETIPODOCUMENTAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRETIPODOCUMENTAL$16);
            }
            target.setStringValue(nombreTipoDocumental);
        }
    }
    
    /**
     * Sets (as xml) the "nombreTipoDocumental" element
     */
    public void xsetNombreTipoDocumental(org.apache.xmlbeans.XmlString nombreTipoDocumental)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRETIPODOCUMENTAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRETIPODOCUMENTAL$16);
            }
            target.set(nombreTipoDocumental);
        }
    }
    
    /**
     * Nils the "nombreTipoDocumental" element
     */
    public void setNilNombreTipoDocumental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRETIPODOCUMENTAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRETIPODOCUMENTAL$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "numeroREnt" element
     */
    public java.lang.String getNumeroREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERORENT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numeroREnt" element
     */
    public org.apache.xmlbeans.XmlString xgetNumeroREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERORENT$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "numeroREnt" element
     */
    public boolean isNilNumeroREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERORENT$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "numeroREnt" element
     */
    public void setNumeroREnt(java.lang.String numeroREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERORENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERORENT$18);
            }
            target.setStringValue(numeroREnt);
        }
    }
    
    /**
     * Sets (as xml) the "numeroREnt" element
     */
    public void xsetNumeroREnt(org.apache.xmlbeans.XmlString numeroREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERORENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERORENT$18);
            }
            target.set(numeroREnt);
        }
    }
    
    /**
     * Nils the "numeroREnt" element
     */
    public void setNilNumeroREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERORENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERORENT$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "destinatarioREnt" element
     */
    public java.lang.String getDestinatarioREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESTINATARIORENT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "destinatarioREnt" element
     */
    public org.apache.xmlbeans.XmlString xgetDestinatarioREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESTINATARIORENT$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "destinatarioREnt" element
     */
    public boolean isNilDestinatarioREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESTINATARIORENT$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "destinatarioREnt" element
     */
    public void setDestinatarioREnt(java.lang.String destinatarioREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESTINATARIORENT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESTINATARIORENT$20);
            }
            target.setStringValue(destinatarioREnt);
        }
    }
    
    /**
     * Sets (as xml) the "destinatarioREnt" element
     */
    public void xsetDestinatarioREnt(org.apache.xmlbeans.XmlString destinatarioREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESTINATARIORENT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESTINATARIORENT$20);
            }
            target.set(destinatarioREnt);
        }
    }
    
    /**
     * Nils the "destinatarioREnt" element
     */
    public void setNilDestinatarioREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESTINATARIORENT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESTINATARIORENT$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "fechaRecepcionREnt" element
     */
    public java.util.Calendar getFechaRecepcionREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHARECEPCIONRENT$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "fechaRecepcionREnt" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetFechaRecepcionREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHARECEPCIONRENT$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "fechaRecepcionREnt" element
     */
    public boolean isNilFechaRecepcionREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHARECEPCIONRENT$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "fechaRecepcionREnt" element
     */
    public void setFechaRecepcionREnt(java.util.Calendar fechaRecepcionREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHARECEPCIONRENT$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHARECEPCIONRENT$22);
            }
            target.setCalendarValue(fechaRecepcionREnt);
        }
    }
    
    /**
     * Sets (as xml) the "fechaRecepcionREnt" element
     */
    public void xsetFechaRecepcionREnt(org.apache.xmlbeans.XmlDateTime fechaRecepcionREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHARECEPCIONRENT$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FECHARECEPCIONRENT$22);
            }
            target.set(fechaRecepcionREnt);
        }
    }
    
    /**
     * Nils the "fechaRecepcionREnt" element
     */
    public void setNilFechaRecepcionREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHARECEPCIONRENT$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FECHARECEPCIONRENT$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "procedenciaREnt" element
     */
    public java.lang.String getProcedenciaREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDENCIARENT$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "procedenciaREnt" element
     */
    public org.apache.xmlbeans.XmlString xgetProcedenciaREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCEDENCIARENT$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "procedenciaREnt" element
     */
    public boolean isNilProcedenciaREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCEDENCIARENT$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "procedenciaREnt" element
     */
    public void setProcedenciaREnt(java.lang.String procedenciaREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDENCIARENT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCEDENCIARENT$24);
            }
            target.setStringValue(procedenciaREnt);
        }
    }
    
    /**
     * Sets (as xml) the "procedenciaREnt" element
     */
    public void xsetProcedenciaREnt(org.apache.xmlbeans.XmlString procedenciaREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCEDENCIARENT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROCEDENCIARENT$24);
            }
            target.set(procedenciaREnt);
        }
    }
    
    /**
     * Nils the "procedenciaREnt" element
     */
    public void setNilProcedenciaREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCEDENCIARENT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROCEDENCIARENT$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "observacionesREnt" element
     */
    public java.lang.String getObservacionesREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBSERVACIONESRENT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "observacionesREnt" element
     */
    public org.apache.xmlbeans.XmlString xgetObservacionesREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBSERVACIONESRENT$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "observacionesREnt" element
     */
    public boolean isNilObservacionesREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBSERVACIONESRENT$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "observacionesREnt" element
     */
    public void setObservacionesREnt(java.lang.String observacionesREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBSERVACIONESRENT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBSERVACIONESRENT$26);
            }
            target.setStringValue(observacionesREnt);
        }
    }
    
    /**
     * Sets (as xml) the "observacionesREnt" element
     */
    public void xsetObservacionesREnt(org.apache.xmlbeans.XmlString observacionesREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBSERVACIONESRENT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBSERVACIONESRENT$26);
            }
            target.set(observacionesREnt);
        }
    }
    
    /**
     * Nils the "observacionesREnt" element
     */
    public void setNilObservacionesREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBSERVACIONESRENT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBSERVACIONESRENT$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "usuarioIndexacionREnt" element
     */
    public java.lang.String getUsuarioIndexacionREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACIONRENT$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "usuarioIndexacionREnt" element
     */
    public org.apache.xmlbeans.XmlString xgetUsuarioIndexacionREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACIONRENT$28, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "usuarioIndexacionREnt" element
     */
    public boolean isNilUsuarioIndexacionREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACIONRENT$28, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "usuarioIndexacionREnt" element
     */
    public void setUsuarioIndexacionREnt(java.lang.String usuarioIndexacionREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACIONRENT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIOINDEXACIONRENT$28);
            }
            target.setStringValue(usuarioIndexacionREnt);
        }
    }
    
    /**
     * Sets (as xml) the "usuarioIndexacionREnt" element
     */
    public void xsetUsuarioIndexacionREnt(org.apache.xmlbeans.XmlString usuarioIndexacionREnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACIONRENT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACIONRENT$28);
            }
            target.set(usuarioIndexacionREnt);
        }
    }
    
    /**
     * Nils the "usuarioIndexacionREnt" element
     */
    public void setNilUsuarioIndexacionREnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACIONRENT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACIONRENT$28);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "numeroVersion" element
     */
    public java.lang.String getNumeroVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROVERSION$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numeroVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetNumeroVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROVERSION$30, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "numeroVersion" element
     */
    public boolean isNilNumeroVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROVERSION$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "numeroVersion" element
     */
    public void setNumeroVersion(java.lang.String numeroVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROVERSION$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROVERSION$30);
            }
            target.setStringValue(numeroVersion);
        }
    }
    
    /**
     * Sets (as xml) the "numeroVersion" element
     */
    public void xsetNumeroVersion(org.apache.xmlbeans.XmlString numeroVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROVERSION$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMEROVERSION$30);
            }
            target.set(numeroVersion);
        }
    }
    
    /**
     * Nils the "numeroVersion" element
     */
    public void setNilNumeroVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROVERSION$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMEROVERSION$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "idPieza" element
     */
    public java.lang.String getIdPieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPIEZA$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idPieza" element
     */
    public org.apache.xmlbeans.XmlString xgetIdPieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDPIEZA$32, 0);
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
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDPIEZA$32, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "idPieza" element
     */
    public void setIdPieza(java.lang.String idPieza)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPIEZA$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDPIEZA$32);
            }
            target.setStringValue(idPieza);
        }
    }
    
    /**
     * Sets (as xml) the "idPieza" element
     */
    public void xsetIdPieza(org.apache.xmlbeans.XmlString idPieza)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDPIEZA$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDPIEZA$32);
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
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDPIEZA$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDPIEZA$32);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets array of all "versiones" elements
     */
    public java.lang.String[] getVersionesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERSIONES$34, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "versiones" element
     */
    public java.lang.String getVersionesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONES$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "versiones" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetVersionesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERSIONES$34, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "versiones" element
     */
    public org.apache.xmlbeans.XmlString xgetVersionesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONES$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Tests for nil ith "versiones" element
     */
    public boolean isNilVersionesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONES$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "versiones" element
     */
    public int sizeOfVersionesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONES$34);
        }
    }
    
    /**
     * Sets array of all "versiones" element
     */
    public void setVersionesArray(java.lang.String[] versionesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(versionesArray, VERSIONES$34);
        }
    }
    
    /**
     * Sets ith "versiones" element
     */
    public void setVersionesArray(int i, java.lang.String versiones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONES$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(versiones);
        }
    }
    
    /**
     * Sets (as xml) array of all "versiones" element
     */
    public void xsetVersionesArray(org.apache.xmlbeans.XmlString[]versionesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(versionesArray, VERSIONES$34);
        }
    }
    
    /**
     * Sets (as xml) ith "versiones" element
     */
    public void xsetVersionesArray(int i, org.apache.xmlbeans.XmlString versiones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONES$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(versiones);
        }
    }
    
    /**
     * Nils the ith "versiones" element
     */
    public void setNilVersionesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONES$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "versiones" element
     */
    public void insertVersiones(int i, java.lang.String versiones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VERSIONES$34, i);
            target.setStringValue(versiones);
        }
    }
    
    /**
     * Appends the value as the last "versiones" element
     */
    public void addVersiones(java.lang.String versiones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONES$34);
            target.setStringValue(versiones);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "versiones" element
     */
    public org.apache.xmlbeans.XmlString insertNewVersiones(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(VERSIONES$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "versiones" element
     */
    public org.apache.xmlbeans.XmlString addNewVersiones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSIONES$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "versiones" element
     */
    public void removeVersiones(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONES$34, i);
        }
    }
    
    /**
     * Gets array of all "ficheros" elements
     */
    public org.netbeans.xml.schema.esquemaprimario.Contenido[] getFicherosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FICHEROS$36, targetList);
            org.netbeans.xml.schema.esquemaprimario.Contenido[] result = new org.netbeans.xml.schema.esquemaprimario.Contenido[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ficheros" element
     */
    public org.netbeans.xml.schema.esquemaprimario.Contenido getFicherosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Contenido target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Contenido)get_store().find_element_user(FICHEROS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ficheros" element
     */
    public boolean isNilFicherosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Contenido target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Contenido)get_store().find_element_user(FICHEROS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ficheros" element
     */
    public int sizeOfFicherosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FICHEROS$36);
        }
    }
    
    /**
     * Sets array of all "ficheros" element
     */
    public void setFicherosArray(org.netbeans.xml.schema.esquemaprimario.Contenido[] ficherosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ficherosArray, FICHEROS$36);
        }
    }
    
    /**
     * Sets ith "ficheros" element
     */
    public void setFicherosArray(int i, org.netbeans.xml.schema.esquemaprimario.Contenido ficheros)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Contenido target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Contenido)get_store().find_element_user(FICHEROS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ficheros);
        }
    }
    
    /**
     * Nils the ith "ficheros" element
     */
    public void setNilFicherosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Contenido target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Contenido)get_store().find_element_user(FICHEROS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ficheros" element
     */
    public org.netbeans.xml.schema.esquemaprimario.Contenido insertNewFicheros(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Contenido target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Contenido)get_store().insert_element_user(FICHEROS$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ficheros" element
     */
    public org.netbeans.xml.schema.esquemaprimario.Contenido addNewFicheros()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.Contenido target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.Contenido)get_store().add_element_user(FICHEROS$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "ficheros" element
     */
    public void removeFicheros(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FICHEROS$36, i);
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
            get_store().find_all_element_users(CAMPOS$38, targetList);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$38, i);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$38, i);
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
            return get_store().count_elements(CAMPOS$38);
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
            arraySetterHelper(camposArray, CAMPOS$38);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$38, i);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().find_element_user(CAMPOS$38, i);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().insert_element_user(CAMPOS$38, i);
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
            target = (org.netbeans.xml.schema.esquemaprimario.Campo)get_store().add_element_user(CAMPOS$38);
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
            get_store().remove_element(CAMPOS$38, i);
        }
    }
    
    /**
     * Gets the "idAlmacenFileNet" element
     */
    public java.lang.String getIdAlmacenFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALMACENFILENET$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idAlmacenFileNet" element
     */
    public org.apache.xmlbeans.XmlString xgetIdAlmacenFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDALMACENFILENET$40, 0);
            return target;
        }
    }
    
    /**
     * Sets the "idAlmacenFileNet" element
     */
    public void setIdAlmacenFileNet(java.lang.String idAlmacenFileNet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALMACENFILENET$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDALMACENFILENET$40);
            }
            target.setStringValue(idAlmacenFileNet);
        }
    }
    
    /**
     * Sets (as xml) the "idAlmacenFileNet" element
     */
    public void xsetIdAlmacenFileNet(org.apache.xmlbeans.XmlString idAlmacenFileNet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDALMACENFILENET$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDALMACENFILENET$40);
            }
            target.set(idAlmacenFileNet);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTIPOFN$42, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTIPOFN$42, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTIPOFN$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDTIPOFN$42);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTIPOFN$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDTIPOFN$42);
            }
            target.set(idTipoFN);
        }
    }
    
    /**
     * Gets the "urlDescarga" element
     */
    public java.lang.String getUrlDescarga()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLDESCARGA$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "urlDescarga" element
     */
    public org.apache.xmlbeans.XmlString xgetUrlDescarga()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLDESCARGA$44, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "urlDescarga" element
     */
    public boolean isNilUrlDescarga()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLDESCARGA$44, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "urlDescarga" element
     */
    public void setUrlDescarga(java.lang.String urlDescarga)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLDESCARGA$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URLDESCARGA$44);
            }
            target.setStringValue(urlDescarga);
        }
    }
    
    /**
     * Sets (as xml) the "urlDescarga" element
     */
    public void xsetUrlDescarga(org.apache.xmlbeans.XmlString urlDescarga)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLDESCARGA$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URLDESCARGA$44);
            }
            target.set(urlDescarga);
        }
    }
    
    /**
     * Nils the "urlDescarga" element
     */
    public void setNilUrlDescarga()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLDESCARGA$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URLDESCARGA$44);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "urlVisor" element
     */
    public java.lang.String getUrlVisor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLVISOR$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "urlVisor" element
     */
    public org.apache.xmlbeans.XmlString xgetUrlVisor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLVISOR$46, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "urlVisor" element
     */
    public boolean isNilUrlVisor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLVISOR$46, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "urlVisor" element
     */
    public void setUrlVisor(java.lang.String urlVisor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLVISOR$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URLVISOR$46);
            }
            target.setStringValue(urlVisor);
        }
    }
    
    /**
     * Sets (as xml) the "urlVisor" element
     */
    public void xsetUrlVisor(org.apache.xmlbeans.XmlString urlVisor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLVISOR$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URLVISOR$46);
            }
            target.set(urlVisor);
        }
    }
    
    /**
     * Nils the "urlVisor" element
     */
    public void setNilUrlVisor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLVISOR$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URLVISOR$46);
            }
            target.setNil();
        }
    }
}
