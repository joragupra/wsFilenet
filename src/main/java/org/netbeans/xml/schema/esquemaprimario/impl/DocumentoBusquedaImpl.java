/*
 * XML Type:  documentoBusqueda
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario.impl;
/**
 * An XML documentoBusqueda(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public class DocumentoBusquedaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda
{
    
    public DocumentoBusquedaImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName IDALMACENFILENET$8 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idAlmacenFileNet");
    private static final javax.xml.namespace.QName TIPOELEMENTO$10 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "tipoElemento");
    private static final javax.xml.namespace.QName CODIGOSERIEDOCUMENTAL$12 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "codigoSerieDocumental");
    private static final javax.xml.namespace.QName CODIGOTIPODOCUMENTAL$14 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "codigoTipoDocumental");
    private static final javax.xml.namespace.QName NOMBRESERIEDOCUMENTAL$16 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreSerieDocumental");
    private static final javax.xml.namespace.QName NOMBRETIPODOCUMENTAL$18 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "nombreTipoDocumental");
    private static final javax.xml.namespace.QName ORDERNARPOR$20 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "ordernarPor");
    private static final javax.xml.namespace.QName ORDENACIONDESCENDENTE$22 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "ordenacionDescendente");
    private static final javax.xml.namespace.QName VERSIONMAYOR$24 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "versionMayor");
    private static final javax.xml.namespace.QName CLASEFILENET$26 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "claseFileNet");
    private static final javax.xml.namespace.QName IDENTIFICADORES$28 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "identificadores");
    private static final javax.xml.namespace.QName IDMOSTRADOS$30 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "idMostrados");
    private static final javax.xml.namespace.QName TAMANYOPAGINA$32 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "tamanyoPagina");
    private static final javax.xml.namespace.QName RELACIONDOCUMENTOPIEZA$34 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "relacionDocumentoPieza");
    private static final javax.xml.namespace.QName CAMPOS$36 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaPrimario", "campos");
    
    
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
     * Gets the "idAlmacenFileNet" element
     */
    public java.lang.String getIdAlmacenFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALMACENFILENET$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDALMACENFILENET$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "idAlmacenFileNet" element
     */
    public boolean isNilIdAlmacenFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDALMACENFILENET$8, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALMACENFILENET$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDALMACENFILENET$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDALMACENFILENET$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDALMACENFILENET$8);
            }
            target.set(idAlmacenFileNet);
        }
    }
    
    /**
     * Nils the "idAlmacenFileNet" element
     */
    public void setNilIdAlmacenFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDALMACENFILENET$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDALMACENFILENET$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "tipoElemento" element
     */
    public int getTipoElemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOELEMENTO$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipoElemento" element
     */
    public org.apache.xmlbeans.XmlInt xgetTipoElemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "tipoElemento" element
     */
    public boolean isNilTipoElemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "tipoElemento" element
     */
    public void setTipoElemento(int tipoElemento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOELEMENTO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOELEMENTO$10);
            }
            target.setIntValue(tipoElemento);
        }
    }
    
    /**
     * Sets (as xml) the "tipoElemento" element
     */
    public void xsetTipoElemento(org.apache.xmlbeans.XmlInt tipoElemento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPOELEMENTO$10);
            }
            target.set(tipoElemento);
        }
    }
    
    /**
     * Nils the "tipoElemento" element
     */
    public void setNilTipoElemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPOELEMENTO$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOSERIEDOCUMENTAL$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOSERIEDOCUMENTAL$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERIEDOCUMENTAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOSERIEDOCUMENTAL$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOTIPODOCUMENTAL$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOTIPODOCUMENTAL$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOTIPODOCUMENTAL$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOTIPODOCUMENTAL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOTIPODOCUMENTAL$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOTIPODOCUMENTAL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOTIPODOCUMENTAL$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOTIPODOCUMENTAL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOTIPODOCUMENTAL$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRESERIEDOCUMENTAL$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRESERIEDOCUMENTAL$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRESERIEDOCUMENTAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRESERIEDOCUMENTAL$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRETIPODOCUMENTAL$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRETIPODOCUMENTAL$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRETIPODOCUMENTAL$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRETIPODOCUMENTAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRETIPODOCUMENTAL$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRETIPODOCUMENTAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRETIPODOCUMENTAL$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRETIPODOCUMENTAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRETIPODOCUMENTAL$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets array of all "ordernarPor" elements
     */
    public java.lang.String[] getOrdernarPorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDERNARPOR$20, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ordernarPor" element
     */
    public java.lang.String getOrdernarPorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNARPOR$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ordernarPor" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetOrdernarPorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDERNARPOR$20, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ordernarPor" element
     */
    public org.apache.xmlbeans.XmlString xgetOrdernarPorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNARPOR$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Tests for nil ith "ordernarPor" element
     */
    public boolean isNilOrdernarPorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNARPOR$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ordernarPor" element
     */
    public int sizeOfOrdernarPorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERNARPOR$20);
        }
    }
    
    /**
     * Sets array of all "ordernarPor" element
     */
    public void setOrdernarPorArray(java.lang.String[] ordernarPorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ordernarPorArray, ORDERNARPOR$20);
        }
    }
    
    /**
     * Sets ith "ordernarPor" element
     */
    public void setOrdernarPorArray(int i, java.lang.String ordernarPor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNARPOR$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(ordernarPor);
        }
    }
    
    /**
     * Sets (as xml) array of all "ordernarPor" element
     */
    public void xsetOrdernarPorArray(org.apache.xmlbeans.XmlString[]ordernarPorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ordernarPorArray, ORDERNARPOR$20);
        }
    }
    
    /**
     * Sets (as xml) ith "ordernarPor" element
     */
    public void xsetOrdernarPorArray(int i, org.apache.xmlbeans.XmlString ordernarPor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNARPOR$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ordernarPor);
        }
    }
    
    /**
     * Nils the ith "ordernarPor" element
     */
    public void setNilOrdernarPorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNARPOR$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "ordernarPor" element
     */
    public void insertOrdernarPor(int i, java.lang.String ordernarPor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ORDERNARPOR$20, i);
            target.setStringValue(ordernarPor);
        }
    }
    
    /**
     * Appends the value as the last "ordernarPor" element
     */
    public void addOrdernarPor(java.lang.String ordernarPor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNARPOR$20);
            target.setStringValue(ordernarPor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ordernarPor" element
     */
    public org.apache.xmlbeans.XmlString insertNewOrdernarPor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ORDERNARPOR$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ordernarPor" element
     */
    public org.apache.xmlbeans.XmlString addNewOrdernarPor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNARPOR$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "ordernarPor" element
     */
    public void removeOrdernarPor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERNARPOR$20, i);
        }
    }
    
    /**
     * Gets the "ordenacionDescendente" element
     */
    public boolean getOrdenacionDescendente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDENACIONDESCENDENTE$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ordenacionDescendente" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOrdenacionDescendente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDENACIONDESCENDENTE$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ordenacionDescendente" element
     */
    public boolean isNilOrdenacionDescendente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDENACIONDESCENDENTE$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ordenacionDescendente" element
     */
    public void setOrdenacionDescendente(boolean ordenacionDescendente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDENACIONDESCENDENTE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDENACIONDESCENDENTE$22);
            }
            target.setBooleanValue(ordenacionDescendente);
        }
    }
    
    /**
     * Sets (as xml) the "ordenacionDescendente" element
     */
    public void xsetOrdenacionDescendente(org.apache.xmlbeans.XmlBoolean ordenacionDescendente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDENACIONDESCENDENTE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORDENACIONDESCENDENTE$22);
            }
            target.set(ordenacionDescendente);
        }
    }
    
    /**
     * Nils the "ordenacionDescendente" element
     */
    public void setNilOrdenacionDescendente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDENACIONDESCENDENTE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORDENACIONDESCENDENTE$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "versionMayor" element
     */
    public boolean getVersionMayor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONMAYOR$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "versionMayor" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetVersionMayor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERSIONMAYOR$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "versionMayor" element
     */
    public boolean isNilVersionMayor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERSIONMAYOR$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "versionMayor" element
     */
    public void setVersionMayor(boolean versionMayor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONMAYOR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONMAYOR$24);
            }
            target.setBooleanValue(versionMayor);
        }
    }
    
    /**
     * Sets (as xml) the "versionMayor" element
     */
    public void xsetVersionMayor(org.apache.xmlbeans.XmlBoolean versionMayor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERSIONMAYOR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VERSIONMAYOR$24);
            }
            target.set(versionMayor);
        }
    }
    
    /**
     * Nils the "versionMayor" element
     */
    public void setNilVersionMayor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERSIONMAYOR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VERSIONMAYOR$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "claseFileNet" element
     */
    public java.lang.String getClaseFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASEFILENET$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "claseFileNet" element
     */
    public org.apache.xmlbeans.XmlString xgetClaseFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASEFILENET$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "claseFileNet" element
     */
    public boolean isNilClaseFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASEFILENET$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "claseFileNet" element
     */
    public void setClaseFileNet(java.lang.String claseFileNet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASEFILENET$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASEFILENET$26);
            }
            target.setStringValue(claseFileNet);
        }
    }
    
    /**
     * Sets (as xml) the "claseFileNet" element
     */
    public void xsetClaseFileNet(org.apache.xmlbeans.XmlString claseFileNet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASEFILENET$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASEFILENET$26);
            }
            target.set(claseFileNet);
        }
    }
    
    /**
     * Nils the "claseFileNet" element
     */
    public void setNilClaseFileNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASEFILENET$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASEFILENET$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets array of all "identificadores" elements
     */
    public java.lang.String[] getIdentificadoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFICADORES$28, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "identificadores" element
     */
    public java.lang.String getIdentificadoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORES$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "identificadores" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetIdentificadoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFICADORES$28, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "identificadores" element
     */
    public org.apache.xmlbeans.XmlString xgetIdentificadoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Tests for nil ith "identificadores" element
     */
    public boolean isNilIdentificadoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "identificadores" element
     */
    public int sizeOfIdentificadoresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICADORES$28);
        }
    }
    
    /**
     * Sets array of all "identificadores" element
     */
    public void setIdentificadoresArray(java.lang.String[] identificadoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identificadoresArray, IDENTIFICADORES$28);
        }
    }
    
    /**
     * Sets ith "identificadores" element
     */
    public void setIdentificadoresArray(int i, java.lang.String identificadores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORES$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(identificadores);
        }
    }
    
    /**
     * Sets (as xml) array of all "identificadores" element
     */
    public void xsetIdentificadoresArray(org.apache.xmlbeans.XmlString[]identificadoresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identificadoresArray, IDENTIFICADORES$28);
        }
    }
    
    /**
     * Sets (as xml) ith "identificadores" element
     */
    public void xsetIdentificadoresArray(int i, org.apache.xmlbeans.XmlString identificadores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identificadores);
        }
    }
    
    /**
     * Nils the ith "identificadores" element
     */
    public void setNilIdentificadoresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "identificadores" element
     */
    public void insertIdentificadores(int i, java.lang.String identificadores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IDENTIFICADORES$28, i);
            target.setStringValue(identificadores);
        }
    }
    
    /**
     * Appends the value as the last "identificadores" element
     */
    public void addIdentificadores(java.lang.String identificadores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICADORES$28);
            target.setStringValue(identificadores);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identificadores" element
     */
    public org.apache.xmlbeans.XmlString insertNewIdentificadores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(IDENTIFICADORES$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identificadores" element
     */
    public org.apache.xmlbeans.XmlString addNewIdentificadores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICADORES$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "identificadores" element
     */
    public void removeIdentificadores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICADORES$28, i);
        }
    }
    
    /**
     * Gets array of all "idMostrados" elements
     */
    public java.lang.String[] getIdMostradosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDMOSTRADOS$30, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "idMostrados" element
     */
    public java.lang.String getIdMostradosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDMOSTRADOS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "idMostrados" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetIdMostradosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDMOSTRADOS$30, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "idMostrados" element
     */
    public org.apache.xmlbeans.XmlString xgetIdMostradosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDMOSTRADOS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Tests for nil ith "idMostrados" element
     */
    public boolean isNilIdMostradosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDMOSTRADOS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "idMostrados" element
     */
    public int sizeOfIdMostradosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDMOSTRADOS$30);
        }
    }
    
    /**
     * Sets array of all "idMostrados" element
     */
    public void setIdMostradosArray(java.lang.String[] idMostradosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idMostradosArray, IDMOSTRADOS$30);
        }
    }
    
    /**
     * Sets ith "idMostrados" element
     */
    public void setIdMostradosArray(int i, java.lang.String idMostrados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDMOSTRADOS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(idMostrados);
        }
    }
    
    /**
     * Sets (as xml) array of all "idMostrados" element
     */
    public void xsetIdMostradosArray(org.apache.xmlbeans.XmlString[]idMostradosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idMostradosArray, IDMOSTRADOS$30);
        }
    }
    
    /**
     * Sets (as xml) ith "idMostrados" element
     */
    public void xsetIdMostradosArray(int i, org.apache.xmlbeans.XmlString idMostrados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDMOSTRADOS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(idMostrados);
        }
    }
    
    /**
     * Nils the ith "idMostrados" element
     */
    public void setNilIdMostradosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDMOSTRADOS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "idMostrados" element
     */
    public void insertIdMostrados(int i, java.lang.String idMostrados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IDMOSTRADOS$30, i);
            target.setStringValue(idMostrados);
        }
    }
    
    /**
     * Appends the value as the last "idMostrados" element
     */
    public void addIdMostrados(java.lang.String idMostrados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDMOSTRADOS$30);
            target.setStringValue(idMostrados);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "idMostrados" element
     */
    public org.apache.xmlbeans.XmlString insertNewIdMostrados(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(IDMOSTRADOS$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "idMostrados" element
     */
    public org.apache.xmlbeans.XmlString addNewIdMostrados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDMOSTRADOS$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "idMostrados" element
     */
    public void removeIdMostrados(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDMOSTRADOS$30, i);
        }
    }
    
    /**
     * Gets the "tamanyoPagina" element
     */
    public int getTamanyoPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAMANYOPAGINA$32, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "tamanyoPagina" element
     */
    public org.apache.xmlbeans.XmlInt xgetTamanyoPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TAMANYOPAGINA$32, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "tamanyoPagina" element
     */
    public boolean isNilTamanyoPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TAMANYOPAGINA$32, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "tamanyoPagina" element
     */
    public void setTamanyoPagina(int tamanyoPagina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAMANYOPAGINA$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAMANYOPAGINA$32);
            }
            target.setIntValue(tamanyoPagina);
        }
    }
    
    /**
     * Sets (as xml) the "tamanyoPagina" element
     */
    public void xsetTamanyoPagina(org.apache.xmlbeans.XmlInt tamanyoPagina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TAMANYOPAGINA$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TAMANYOPAGINA$32);
            }
            target.set(tamanyoPagina);
        }
    }
    
    /**
     * Nils the "tamanyoPagina" element
     */
    public void setNilTamanyoPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TAMANYOPAGINA$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TAMANYOPAGINA$32);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "relacionDocumentoPieza" element
     */
    public int getRelacionDocumentoPieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$34, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "relacionDocumentoPieza" element
     */
    public org.apache.xmlbeans.XmlInt xgetRelacionDocumentoPieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$34, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "relacionDocumentoPieza" element
     */
    public boolean isNilRelacionDocumentoPieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$34, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "relacionDocumentoPieza" element
     */
    public void setRelacionDocumentoPieza(int relacionDocumentoPieza)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELACIONDOCUMENTOPIEZA$34);
            }
            target.setIntValue(relacionDocumentoPieza);
        }
    }
    
    /**
     * Sets (as xml) the "relacionDocumentoPieza" element
     */
    public void xsetRelacionDocumentoPieza(org.apache.xmlbeans.XmlInt relacionDocumentoPieza)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RELACIONDOCUMENTOPIEZA$34);
            }
            target.set(relacionDocumentoPieza);
        }
    }
    
    /**
     * Nils the "relacionDocumentoPieza" element
     */
    public void setNilRelacionDocumentoPieza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RELACIONDOCUMENTOPIEZA$34);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets array of all "campos" elements
     */
    public org.netbeans.xml.schema.esquemaprimario.CampoBusqueda[] getCamposArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAMPOS$36, targetList);
            org.netbeans.xml.schema.esquemaprimario.CampoBusqueda[] result = new org.netbeans.xml.schema.esquemaprimario.CampoBusqueda[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "campos" element
     */
    public org.netbeans.xml.schema.esquemaprimario.CampoBusqueda getCamposArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.CampoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().find_element_user(CAMPOS$36, i);
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
            org.netbeans.xml.schema.esquemaprimario.CampoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().find_element_user(CAMPOS$36, i);
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
            return get_store().count_elements(CAMPOS$36);
        }
    }
    
    /**
     * Sets array of all "campos" element
     */
    public void setCamposArray(org.netbeans.xml.schema.esquemaprimario.CampoBusqueda[] camposArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(camposArray, CAMPOS$36);
        }
    }
    
    /**
     * Sets ith "campos" element
     */
    public void setCamposArray(int i, org.netbeans.xml.schema.esquemaprimario.CampoBusqueda campos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.CampoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().find_element_user(CAMPOS$36, i);
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
            org.netbeans.xml.schema.esquemaprimario.CampoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().find_element_user(CAMPOS$36, i);
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
    public org.netbeans.xml.schema.esquemaprimario.CampoBusqueda insertNewCampos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.CampoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().insert_element_user(CAMPOS$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "campos" element
     */
    public org.netbeans.xml.schema.esquemaprimario.CampoBusqueda addNewCampos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemaprimario.CampoBusqueda target = null;
            target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().add_element_user(CAMPOS$36);
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
            get_store().remove_element(CAMPOS$36, i);
        }
    }
}
