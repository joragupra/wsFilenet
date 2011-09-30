/*
 * XML Type:  elemento
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.Elemento
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario;


/**
 * An XML elemento(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public interface Elemento extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Elemento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("elemento5e84type");
    
    /**
     * Gets the "expedienteOrigen" element
     */
    org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen getExpedienteOrigen();
    
    /**
     * Tests for nil "expedienteOrigen" element
     */
    boolean isNilExpedienteOrigen();
    
    /**
     * Sets the "expedienteOrigen" element
     */
    void setExpedienteOrigen(org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen expedienteOrigen);
    
    /**
     * Appends and returns a new empty "expedienteOrigen" element
     */
    org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen addNewExpedienteOrigen();
    
    /**
     * Nils the "expedienteOrigen" element
     */
    void setNilExpedienteOrigen();
    
    /**
     * Gets the "documentoOrigen" element
     */
    org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen getDocumentoOrigen();
    
    /**
     * Tests for nil "documentoOrigen" element
     */
    boolean isNilDocumentoOrigen();
    
    /**
     * Sets the "documentoOrigen" element
     */
    void setDocumentoOrigen(org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen documentoOrigen);
    
    /**
     * Appends and returns a new empty "documentoOrigen" element
     */
    org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen addNewDocumentoOrigen();
    
    /**
     * Nils the "documentoOrigen" element
     */
    void setNilDocumentoOrigen();
    
    /**
     * Gets the "piezaOrigen" element
     */
    org.netbeans.xml.schema.esquemaprimario.PiezaOrigen getPiezaOrigen();
    
    /**
     * Tests for nil "piezaOrigen" element
     */
    boolean isNilPiezaOrigen();
    
    /**
     * Sets the "piezaOrigen" element
     */
    void setPiezaOrigen(org.netbeans.xml.schema.esquemaprimario.PiezaOrigen piezaOrigen);
    
    /**
     * Appends and returns a new empty "piezaOrigen" element
     */
    org.netbeans.xml.schema.esquemaprimario.PiezaOrigen addNewPiezaOrigen();
    
    /**
     * Nils the "piezaOrigen" element
     */
    void setNilPiezaOrigen();
    
    /**
     * Gets the "tipo" element
     */
    int getTipo();
    
    /**
     * Gets (as xml) the "tipo" element
     */
    org.apache.xmlbeans.XmlInt xgetTipo();
    
    /**
     * Tests for nil "tipo" element
     */
    boolean isNilTipo();
    
    /**
     * Sets the "tipo" element
     */
    void setTipo(int tipo);
    
    /**
     * Sets (as xml) the "tipo" element
     */
    void xsetTipo(org.apache.xmlbeans.XmlInt tipo);
    
    /**
     * Nils the "tipo" element
     */
    void setNilTipo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemaprimario.Elemento newInstance() {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemaprimario.Elemento parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemaprimario.Elemento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
