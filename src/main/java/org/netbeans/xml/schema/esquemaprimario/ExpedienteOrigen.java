/*
 * XML Type:  expedienteOrigen
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario;


/**
 * An XML expedienteOrigen(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public interface ExpedienteOrigen extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExpedienteOrigen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("expedienteorigen1c66type");
    
    /**
     * Gets the "idSistemaOrigen" element
     */
    int getIdSistemaOrigen();
    
    /**
     * Gets (as xml) the "idSistemaOrigen" element
     */
    org.apache.xmlbeans.XmlInt xgetIdSistemaOrigen();
    
    /**
     * Tests for nil "idSistemaOrigen" element
     */
    boolean isNilIdSistemaOrigen();
    
    /**
     * Sets the "idSistemaOrigen" element
     */
    void setIdSistemaOrigen(int idSistemaOrigen);
    
    /**
     * Sets (as xml) the "idSistemaOrigen" element
     */
    void xsetIdSistemaOrigen(org.apache.xmlbeans.XmlInt idSistemaOrigen);
    
    /**
     * Nils the "idSistemaOrigen" element
     */
    void setNilIdSistemaOrigen();
    
    /**
     * Gets the "usuarioIndexacion" element
     */
    java.lang.String getUsuarioIndexacion();
    
    /**
     * Gets (as xml) the "usuarioIndexacion" element
     */
    org.apache.xmlbeans.XmlString xgetUsuarioIndexacion();
    
    /**
     * Tests for nil "usuarioIndexacion" element
     */
    boolean isNilUsuarioIndexacion();
    
    /**
     * Sets the "usuarioIndexacion" element
     */
    void setUsuarioIndexacion(java.lang.String usuarioIndexacion);
    
    /**
     * Sets (as xml) the "usuarioIndexacion" element
     */
    void xsetUsuarioIndexacion(org.apache.xmlbeans.XmlString usuarioIndexacion);
    
    /**
     * Nils the "usuarioIndexacion" element
     */
    void setNilUsuarioIndexacion();
    
    /**
     * Gets the "titulo" element
     */
    java.lang.String getTitulo();
    
    /**
     * Gets (as xml) the "titulo" element
     */
    org.apache.xmlbeans.XmlString xgetTitulo();
    
    /**
     * Tests for nil "titulo" element
     */
    boolean isNilTitulo();
    
    /**
     * Sets the "titulo" element
     */
    void setTitulo(java.lang.String titulo);
    
    /**
     * Sets (as xml) the "titulo" element
     */
    void xsetTitulo(org.apache.xmlbeans.XmlString titulo);
    
    /**
     * Nils the "titulo" element
     */
    void setNilTitulo();
    
    /**
     * Gets the "fechaCreacion" element
     */
    java.util.Calendar getFechaCreacion();
    
    /**
     * Gets (as xml) the "fechaCreacion" element
     */
    org.apache.xmlbeans.XmlDateTime xgetFechaCreacion();
    
    /**
     * Tests for nil "fechaCreacion" element
     */
    boolean isNilFechaCreacion();
    
    /**
     * Sets the "fechaCreacion" element
     */
    void setFechaCreacion(java.util.Calendar fechaCreacion);
    
    /**
     * Sets (as xml) the "fechaCreacion" element
     */
    void xsetFechaCreacion(org.apache.xmlbeans.XmlDateTime fechaCreacion);
    
    /**
     * Nils the "fechaCreacion" element
     */
    void setNilFechaCreacion();
    
    /**
     * Gets the "idFileNet" element
     */
    java.lang.String getIdFileNet();
    
    /**
     * Gets (as xml) the "idFileNet" element
     */
    org.apache.xmlbeans.XmlString xgetIdFileNet();
    
    /**
     * Tests for nil "idFileNet" element
     */
    boolean isNilIdFileNet();
    
    /**
     * Sets the "idFileNet" element
     */
    void setIdFileNet(java.lang.String idFileNet);
    
    /**
     * Sets (as xml) the "idFileNet" element
     */
    void xsetIdFileNet(org.apache.xmlbeans.XmlString idFileNet);
    
    /**
     * Nils the "idFileNet" element
     */
    void setNilIdFileNet();
    
    /**
     * Gets the "idExpediente" element
     */
    int getIdExpediente();
    
    /**
     * Gets (as xml) the "idExpediente" element
     */
    org.apache.xmlbeans.XmlInt xgetIdExpediente();
    
    /**
     * Tests for nil "idExpediente" element
     */
    boolean isNilIdExpediente();
    
    /**
     * Sets the "idExpediente" element
     */
    void setIdExpediente(int idExpediente);
    
    /**
     * Sets (as xml) the "idExpediente" element
     */
    void xsetIdExpediente(org.apache.xmlbeans.XmlInt idExpediente);
    
    /**
     * Nils the "idExpediente" element
     */
    void setNilIdExpediente();
    
    /**
     * Gets the "nombreExpediente" element
     */
    java.lang.String getNombreExpediente();
    
    /**
     * Gets (as xml) the "nombreExpediente" element
     */
    org.apache.xmlbeans.XmlString xgetNombreExpediente();
    
    /**
     * Tests for nil "nombreExpediente" element
     */
    boolean isNilNombreExpediente();
    
    /**
     * Sets the "nombreExpediente" element
     */
    void setNombreExpediente(java.lang.String nombreExpediente);
    
    /**
     * Sets (as xml) the "nombreExpediente" element
     */
    void xsetNombreExpediente(org.apache.xmlbeans.XmlString nombreExpediente);
    
    /**
     * Nils the "nombreExpediente" element
     */
    void setNilNombreExpediente();
    
    /**
     * Gets array of all "piezas" elements
     */
    org.netbeans.xml.schema.esquemaprimario.PiezaOrigen[] getPiezasArray();
    
    /**
     * Gets ith "piezas" element
     */
    org.netbeans.xml.schema.esquemaprimario.PiezaOrigen getPiezasArray(int i);
    
    /**
     * Tests for nil ith "piezas" element
     */
    boolean isNilPiezasArray(int i);
    
    /**
     * Returns number of "piezas" element
     */
    int sizeOfPiezasArray();
    
    /**
     * Sets array of all "piezas" element
     */
    void setPiezasArray(org.netbeans.xml.schema.esquemaprimario.PiezaOrigen[] piezasArray);
    
    /**
     * Sets ith "piezas" element
     */
    void setPiezasArray(int i, org.netbeans.xml.schema.esquemaprimario.PiezaOrigen piezas);
    
    /**
     * Nils the ith "piezas" element
     */
    void setNilPiezasArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "piezas" element
     */
    org.netbeans.xml.schema.esquemaprimario.PiezaOrigen insertNewPiezas(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "piezas" element
     */
    org.netbeans.xml.schema.esquemaprimario.PiezaOrigen addNewPiezas();
    
    /**
     * Removes the ith "piezas" element
     */
    void removePiezas(int i);
    
    /**
     * Gets array of all "campos" elements
     */
    org.netbeans.xml.schema.esquemaprimario.Campo[] getCamposArray();
    
    /**
     * Gets ith "campos" element
     */
    org.netbeans.xml.schema.esquemaprimario.Campo getCamposArray(int i);
    
    /**
     * Returns number of "campos" element
     */
    int sizeOfCamposArray();
    
    /**
     * Sets array of all "campos" element
     */
    void setCamposArray(org.netbeans.xml.schema.esquemaprimario.Campo[] camposArray);
    
    /**
     * Sets ith "campos" element
     */
    void setCamposArray(int i, org.netbeans.xml.schema.esquemaprimario.Campo campos);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "campos" element
     */
    org.netbeans.xml.schema.esquemaprimario.Campo insertNewCampos(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "campos" element
     */
    org.netbeans.xml.schema.esquemaprimario.Campo addNewCampos();
    
    /**
     * Removes the ith "campos" element
     */
    void removeCampos(int i);
    
    /**
     * Gets the "idAlmacenFilenet" element
     */
    java.lang.String getIdAlmacenFilenet();
    
    /**
     * Gets (as xml) the "idAlmacenFilenet" element
     */
    org.apache.xmlbeans.XmlString xgetIdAlmacenFilenet();
    
    /**
     * Sets the "idAlmacenFilenet" element
     */
    void setIdAlmacenFilenet(java.lang.String idAlmacenFilenet);
    
    /**
     * Sets (as xml) the "idAlmacenFilenet" element
     */
    void xsetIdAlmacenFilenet(org.apache.xmlbeans.XmlString idAlmacenFilenet);
    
    /**
     * Gets the "idTipoFN" element
     */
    java.lang.String getIdTipoFN();
    
    /**
     * Gets (as xml) the "idTipoFN" element
     */
    org.apache.xmlbeans.XmlString xgetIdTipoFN();
    
    /**
     * Sets the "idTipoFN" element
     */
    void setIdTipoFN(java.lang.String idTipoFN);
    
    /**
     * Sets (as xml) the "idTipoFN" element
     */
    void xsetIdTipoFN(org.apache.xmlbeans.XmlString idTipoFN);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen newInstance() {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
