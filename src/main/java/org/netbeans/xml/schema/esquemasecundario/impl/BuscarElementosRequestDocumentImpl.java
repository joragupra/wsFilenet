/*
 * An XML document type.
 * Localname: buscarElementosRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario.impl;
/**
 * A document containing one buscarElementosRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public class BuscarElementosRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument
{
    
    public BuscarElementosRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCARELEMENTOSREQUEST$0 = 
        new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "buscarElementosRequest");
    
    
    /**
     * Gets the "buscarElementosRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest getBuscarElementosRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest)get_store().find_element_user(BUSCARELEMENTOSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscarElementosRequest" element
     */
    public void setBuscarElementosRequest(org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest buscarElementosRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest)get_store().find_element_user(BUSCARELEMENTOSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest)get_store().add_element_user(BUSCARELEMENTOSREQUEST$0);
            }
            target.set(buscarElementosRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "buscarElementosRequest" element
     */
    public org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest addNewBuscarElementosRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest target = null;
            target = (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest)get_store().add_element_user(BUSCARELEMENTOSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML buscarElementosRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public static class BuscarElementosRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest
    {
        
        public BuscarElementosRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFICADORORIGEN$0 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "identificadorOrigen");
        private static final javax.xml.namespace.QName TIPOELEMENTO$2 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "tipoElemento");
        private static final javax.xml.namespace.QName IDENTIFICADORELEMENTO$4 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "identificadorElemento");
        private static final javax.xml.namespace.QName TIPODOCUMENTAL$6 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "tipoDocumental");
        private static final javax.xml.namespace.QName USUARIOINDEXACION$8 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "usuarioIndexacion");
        private static final javax.xml.namespace.QName IDENTIFICADORES$10 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "identificadores");
        private static final javax.xml.namespace.QName USUARIO$12 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "usuario");
        private static final javax.xml.namespace.QName CAMPOS$14 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "campos");
        private static final javax.xml.namespace.QName TAMAYOPAGINA$16 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "tamayoPagina");
        private static final javax.xml.namespace.QName ORDENADOPOR$18 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "ordenadoPor");
        private static final javax.xml.namespace.QName ORDENACIONDESCENDENTE$20 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "ordenacionDescendente");
        private static final javax.xml.namespace.QName VERSIONMAYOR$22 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "versionMayor");
        private static final javax.xml.namespace.QName TITULO$24 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "titulo");
        private static final javax.xml.namespace.QName FECHACREACION$26 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "fechaCreacion");
        private static final javax.xml.namespace.QName RELACIONDOCUMENTOPIEZA$28 = 
            new javax.xml.namespace.QName("http://xml.netbeans.org/schema/esquemaSecundario", "relacionDocumentoPieza");
        
        
        /**
         * Gets the "identificadorOrigen" element
         */
        public int getIdentificadorOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "identificadorOrigen" element
         */
        public org.apache.xmlbeans.XmlInt xgetIdentificadorOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "identificadorOrigen" element
         */
        public boolean isNilIdentificadorOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "identificadorOrigen" element
         */
        public void setIdentificadorOrigen(int identificadorOrigen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICADORORIGEN$0);
                }
                target.setIntValue(identificadorOrigen);
            }
        }
        
        /**
         * Sets (as xml) the "identificadorOrigen" element
         */
        public void xsetIdentificadorOrigen(org.apache.xmlbeans.XmlInt identificadorOrigen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDENTIFICADORORIGEN$0);
                }
                target.set(identificadorOrigen);
            }
        }
        
        /**
         * Nils the "identificadorOrigen" element
         */
        public void setNilIdentificadorOrigen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDENTIFICADORORIGEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDENTIFICADORORIGEN$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOELEMENTO$2, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$2, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOELEMENTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOELEMENTO$2);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPOELEMENTO$2);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIPOELEMENTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIPOELEMENTO$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "identificadorElemento" element
         */
        public java.lang.String getIdentificadorElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "identificadorElemento" element
         */
        public org.apache.xmlbeans.XmlString xgetIdentificadorElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "identificadorElemento" element
         */
        public boolean isNilIdentificadorElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "identificadorElemento" element
         */
        public void setIdentificadorElemento(java.lang.String identificadorElemento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICADORELEMENTO$4);
                }
                target.setStringValue(identificadorElemento);
            }
        }
        
        /**
         * Sets (as xml) the "identificadorElemento" element
         */
        public void xsetIdentificadorElemento(org.apache.xmlbeans.XmlString identificadorElemento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICADORELEMENTO$4);
                }
                target.set(identificadorElemento);
            }
        }
        
        /**
         * Nils the "identificadorElemento" element
         */
        public void setNilIdentificadorElemento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORELEMENTO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICADORELEMENTO$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "tipoDocumental" element
         */
        public java.lang.String getTipoDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tipoDocumental" element
         */
        public org.apache.xmlbeans.XmlString xgetTipoDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "tipoDocumental" element
         */
        public boolean isNilTipoDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "tipoDocumental" element
         */
        public void setTipoDocumental(java.lang.String tipoDocumental)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODOCUMENTAL$6);
                }
                target.setStringValue(tipoDocumental);
            }
        }
        
        /**
         * Sets (as xml) the "tipoDocumental" element
         */
        public void xsetTipoDocumental(org.apache.xmlbeans.XmlString tipoDocumental)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODOCUMENTAL$6);
                }
                target.set(tipoDocumental);
            }
        }
        
        /**
         * Nils the "tipoDocumental" element
         */
        public void setNilTipoDocumental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTAL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODOCUMENTAL$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACION$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIOINDEXACION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIOINDEXACION$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACION$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIOINDEXACION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIOINDEXACION$8);
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
                get_store().find_all_element_users(IDENTIFICADORES$10, targetList);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORES$10, i);
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
                get_store().find_all_element_users(IDENTIFICADORES$10, targetList);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$10, i);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$10, i);
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
                return get_store().count_elements(IDENTIFICADORES$10);
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
                arraySetterHelper(identificadoresArray, IDENTIFICADORES$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADORES$10, i);
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
                arraySetterHelper(identificadoresArray, IDENTIFICADORES$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$10, i);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADORES$10, i);
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
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IDENTIFICADORES$10, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICADORES$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(IDENTIFICADORES$10, i);
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
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICADORES$10);
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
                get_store().remove_element(IDENTIFICADORES$10, i);
            }
        }
        
        /**
         * Gets the "usuario" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Usuario getUsuario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Usuario target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "usuario" element
         */
        public void setUsuario(org.netbeans.xml.schema.esquemaprimario.Usuario usuario)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Usuario target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().find_element_user(USUARIO$12, 0);
                if (target == null)
                {
                    target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$12);
                }
                target.set(usuario);
            }
        }
        
        /**
         * Appends and returns a new empty "usuario" element
         */
        public org.netbeans.xml.schema.esquemaprimario.Usuario addNewUsuario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.netbeans.xml.schema.esquemaprimario.Usuario target = null;
                target = (org.netbeans.xml.schema.esquemaprimario.Usuario)get_store().add_element_user(USUARIO$12);
                return target;
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
                get_store().find_all_element_users(CAMPOS$14, targetList);
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
                target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().find_element_user(CAMPOS$14, i);
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
                target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().find_element_user(CAMPOS$14, i);
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
                return get_store().count_elements(CAMPOS$14);
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
                arraySetterHelper(camposArray, CAMPOS$14);
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
                target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().find_element_user(CAMPOS$14, i);
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
                target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().find_element_user(CAMPOS$14, i);
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
                target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().insert_element_user(CAMPOS$14, i);
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
                target = (org.netbeans.xml.schema.esquemaprimario.CampoBusqueda)get_store().add_element_user(CAMPOS$14);
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
                get_store().remove_element(CAMPOS$14, i);
            }
        }
        
        /**
         * Gets the "tamayoPagina" element
         */
        public int getTamayoPagina()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAMAYOPAGINA$16, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "tamayoPagina" element
         */
        public org.apache.xmlbeans.XmlInt xgetTamayoPagina()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TAMAYOPAGINA$16, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "tamayoPagina" element
         */
        public boolean isNilTamayoPagina()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TAMAYOPAGINA$16, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "tamayoPagina" element
         */
        public void setTamayoPagina(int tamayoPagina)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAMAYOPAGINA$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAMAYOPAGINA$16);
                }
                target.setIntValue(tamayoPagina);
            }
        }
        
        /**
         * Sets (as xml) the "tamayoPagina" element
         */
        public void xsetTamayoPagina(org.apache.xmlbeans.XmlInt tamayoPagina)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TAMAYOPAGINA$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TAMAYOPAGINA$16);
                }
                target.set(tamayoPagina);
            }
        }
        
        /**
         * Nils the "tamayoPagina" element
         */
        public void setNilTamayoPagina()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TAMAYOPAGINA$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TAMAYOPAGINA$16);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets array of all "ordenadoPor" elements
         */
        public java.lang.String[] getOrdenadoPorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORDENADOPOR$18, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ordenadoPor" element
         */
        public java.lang.String getOrdenadoPorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDENADOPOR$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ordenadoPor" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetOrdenadoPorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORDENADOPOR$18, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ordenadoPor" element
         */
        public org.apache.xmlbeans.XmlString xgetOrdenadoPorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDENADOPOR$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Tests for nil ith "ordenadoPor" element
         */
        public boolean isNilOrdenadoPorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDENADOPOR$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "ordenadoPor" element
         */
        public int sizeOfOrdenadoPorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDENADOPOR$18);
            }
        }
        
        /**
         * Sets array of all "ordenadoPor" element
         */
        public void setOrdenadoPorArray(java.lang.String[] ordenadoPorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ordenadoPorArray, ORDENADOPOR$18);
            }
        }
        
        /**
         * Sets ith "ordenadoPor" element
         */
        public void setOrdenadoPorArray(int i, java.lang.String ordenadoPor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDENADOPOR$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(ordenadoPor);
            }
        }
        
        /**
         * Sets (as xml) array of all "ordenadoPor" element
         */
        public void xsetOrdenadoPorArray(org.apache.xmlbeans.XmlString[]ordenadoPorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ordenadoPorArray, ORDENADOPOR$18);
            }
        }
        
        /**
         * Sets (as xml) ith "ordenadoPor" element
         */
        public void xsetOrdenadoPorArray(int i, org.apache.xmlbeans.XmlString ordenadoPor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDENADOPOR$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ordenadoPor);
            }
        }
        
        /**
         * Nils the ith "ordenadoPor" element
         */
        public void setNilOrdenadoPorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDENADOPOR$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "ordenadoPor" element
         */
        public void insertOrdenadoPor(int i, java.lang.String ordenadoPor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ORDENADOPOR$18, i);
                target.setStringValue(ordenadoPor);
            }
        }
        
        /**
         * Appends the value as the last "ordenadoPor" element
         */
        public void addOrdenadoPor(java.lang.String ordenadoPor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDENADOPOR$18);
                target.setStringValue(ordenadoPor);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ordenadoPor" element
         */
        public org.apache.xmlbeans.XmlString insertNewOrdenadoPor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ORDENADOPOR$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ordenadoPor" element
         */
        public org.apache.xmlbeans.XmlString addNewOrdenadoPor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDENADOPOR$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "ordenadoPor" element
         */
        public void removeOrdenadoPor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDENADOPOR$18, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDENACIONDESCENDENTE$20, 0);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDENACIONDESCENDENTE$20, 0);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDENACIONDESCENDENTE$20, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDENACIONDESCENDENTE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDENACIONDESCENDENTE$20);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDENACIONDESCENDENTE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORDENACIONDESCENDENTE$20);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDENACIONDESCENDENTE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORDENACIONDESCENDENTE$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONMAYOR$22, 0);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERSIONMAYOR$22, 0);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERSIONMAYOR$22, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONMAYOR$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONMAYOR$22);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERSIONMAYOR$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VERSIONMAYOR$22);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERSIONMAYOR$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VERSIONMAYOR$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITULO$24, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITULO$24, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITULO$24, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITULO$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITULO$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITULO$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITULO$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITULO$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITULO$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHACREACION$26, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHACREACION$26, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHACREACION$26, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHACREACION$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHACREACION$26);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHACREACION$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FECHACREACION$26);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHACREACION$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FECHACREACION$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$28, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$28, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$28, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELACIONDOCUMENTOPIEZA$28);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RELACIONDOCUMENTOPIEZA$28);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELACIONDOCUMENTOPIEZA$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RELACIONDOCUMENTOPIEZA$28);
                }
                target.setNil();
            }
        }
    }
}
