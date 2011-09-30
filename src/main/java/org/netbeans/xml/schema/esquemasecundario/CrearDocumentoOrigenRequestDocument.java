/*
 * An XML document type.
 * Localname: crearDocumentoOrigenRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario;


/**
 * A document containing one crearDocumentoOrigenRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public interface CrearDocumentoOrigenRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrearDocumentoOrigenRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("creardocumentoorigenrequest7455doctype");
    
    /**
     * Gets the "crearDocumentoOrigenRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest getCrearDocumentoOrigenRequest();
    
    /**
     * Sets the "crearDocumentoOrigenRequest" element
     */
    void setCrearDocumentoOrigenRequest(org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest crearDocumentoOrigenRequest);
    
    /**
     * Appends and returns a new empty "crearDocumentoOrigenRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest addNewCrearDocumentoOrigenRequest();
    
    /**
     * An XML crearDocumentoOrigenRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public interface CrearDocumentoOrigenRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrearDocumentoOrigenRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("creardocumentoorigenrequestfbd1elemtype");
        
        /**
         * Gets the "identificadorOrigen" element
         */
        int getIdentificadorOrigen();
        
        /**
         * Gets (as xml) the "identificadorOrigen" element
         */
        org.apache.xmlbeans.XmlInt xgetIdentificadorOrigen();
        
        /**
         * Tests for nil "identificadorOrigen" element
         */
        boolean isNilIdentificadorOrigen();
        
        /**
         * Sets the "identificadorOrigen" element
         */
        void setIdentificadorOrigen(int identificadorOrigen);
        
        /**
         * Sets (as xml) the "identificadorOrigen" element
         */
        void xsetIdentificadorOrigen(org.apache.xmlbeans.XmlInt identificadorOrigen);
        
        /**
         * Nils the "identificadorOrigen" element
         */
        void setNilIdentificadorOrigen();
        
        /**
         * Gets the "serieDocumental" element
         */
        java.lang.String getSerieDocumental();
        
        /**
         * Gets (as xml) the "serieDocumental" element
         */
        org.apache.xmlbeans.XmlString xgetSerieDocumental();
        
        /**
         * Tests for nil "serieDocumental" element
         */
        boolean isNilSerieDocumental();
        
        /**
         * Sets the "serieDocumental" element
         */
        void setSerieDocumental(java.lang.String serieDocumental);
        
        /**
         * Sets (as xml) the "serieDocumental" element
         */
        void xsetSerieDocumental(org.apache.xmlbeans.XmlString serieDocumental);
        
        /**
         * Nils the "serieDocumental" element
         */
        void setNilSerieDocumental();
        
        /**
         * Gets the "tipoDocumental" element
         */
        java.lang.String getTipoDocumental();
        
        /**
         * Gets (as xml) the "tipoDocumental" element
         */
        org.apache.xmlbeans.XmlString xgetTipoDocumental();
        
        /**
         * Tests for nil "tipoDocumental" element
         */
        boolean isNilTipoDocumental();
        
        /**
         * Sets the "tipoDocumental" element
         */
        void setTipoDocumental(java.lang.String tipoDocumental);
        
        /**
         * Sets (as xml) the "tipoDocumental" element
         */
        void xsetTipoDocumental(org.apache.xmlbeans.XmlString tipoDocumental);
        
        /**
         * Nils the "tipoDocumental" element
         */
        void setNilTipoDocumental();
        
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
         * Gets the "usuario" element
         */
        org.netbeans.xml.schema.esquemaprimario.Usuario getUsuario();
        
        /**
         * Tests for nil "usuario" element
         */
        boolean isNilUsuario();
        
        /**
         * Sets the "usuario" element
         */
        void setUsuario(org.netbeans.xml.schema.esquemaprimario.Usuario usuario);
        
        /**
         * Appends and returns a new empty "usuario" element
         */
        org.netbeans.xml.schema.esquemaprimario.Usuario addNewUsuario();
        
        /**
         * Nils the "usuario" element
         */
        void setNilUsuario();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest newInstance() {
              return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument.CrearDocumentoOrigenRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument newInstance() {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.CrearDocumentoOrigenRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
