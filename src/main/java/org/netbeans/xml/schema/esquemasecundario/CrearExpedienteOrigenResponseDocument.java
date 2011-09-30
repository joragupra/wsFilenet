/*
 * An XML document type.
 * Localname: crearExpedienteOrigenResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario;


/**
 * A document containing one crearExpedienteOrigenResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public interface CrearExpedienteOrigenResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrearExpedienteOrigenResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("crearexpedienteorigenresponse7c74doctype");
    
    /**
     * Gets the "crearExpedienteOrigenResponse" element
     */
    org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen getCrearExpedienteOrigenResponse();
    
    /**
     * Tests for nil "crearExpedienteOrigenResponse" element
     */
    boolean isNilCrearExpedienteOrigenResponse();
    
    /**
     * Sets the "crearExpedienteOrigenResponse" element
     */
    void setCrearExpedienteOrigenResponse(org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen crearExpedienteOrigenResponse);
    
    /**
     * Appends and returns a new empty "crearExpedienteOrigenResponse" element
     */
    org.netbeans.xml.schema.esquemaprimario.ExpedienteOrigen addNewCrearExpedienteOrigenResponse();
    
    /**
     * Nils the "crearExpedienteOrigenResponse" element
     */
    void setNilCrearExpedienteOrigenResponse();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument newInstance() {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearExpedienteOrigenResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
