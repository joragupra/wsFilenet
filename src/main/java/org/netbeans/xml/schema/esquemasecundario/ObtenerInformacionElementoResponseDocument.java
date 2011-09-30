/*
 * An XML document type.
 * Localname: obtenerInformacionElementoResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario;


/**
 * A document containing one obtenerInformacionElementoResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public interface ObtenerInformacionElementoResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObtenerInformacionElementoResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("obtenerinformacionelementoresponse66e1doctype");
    
    /**
     * Gets the "obtenerInformacionElementoResponse" element
     */
    org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse getObtenerInformacionElementoResponse();
    
    /**
     * Sets the "obtenerInformacionElementoResponse" element
     */
    void setObtenerInformacionElementoResponse(org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse obtenerInformacionElementoResponse);
    
    /**
     * Appends and returns a new empty "obtenerInformacionElementoResponse" element
     */
    org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse addNewObtenerInformacionElementoResponse();
    
    /**
     * An XML obtenerInformacionElementoResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public interface ObtenerInformacionElementoResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObtenerInformacionElementoResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("obtenerinformacionelementoresponseba37elemtype");
        
        /**
         * Gets array of all "campos" elements
         */
        org.netbeans.xml.schema.esquemaprimario.Campo[] getCamposArray();
        
        /**
         * Gets ith "campos" element
         */
        org.netbeans.xml.schema.esquemaprimario.Campo getCamposArray(int i);
        
        /**
         * Tests for nil ith "campos" element
         */
        boolean isNilCamposArray(int i);
        
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
         * Nils the ith "campos" element
         */
        void setNilCamposArray(int i);
        
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
         * Gets array of all "tipoDocumentales" elements
         */
        org.netbeans.xml.schema.esquemaprimario.TipoDocumental[] getTipoDocumentalesArray();
        
        /**
         * Gets ith "tipoDocumentales" element
         */
        org.netbeans.xml.schema.esquemaprimario.TipoDocumental getTipoDocumentalesArray(int i);
        
        /**
         * Returns number of "tipoDocumentales" element
         */
        int sizeOfTipoDocumentalesArray();
        
        /**
         * Sets array of all "tipoDocumentales" element
         */
        void setTipoDocumentalesArray(org.netbeans.xml.schema.esquemaprimario.TipoDocumental[] tipoDocumentalesArray);
        
        /**
         * Sets ith "tipoDocumentales" element
         */
        void setTipoDocumentalesArray(int i, org.netbeans.xml.schema.esquemaprimario.TipoDocumental tipoDocumentales);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tipoDocumentales" element
         */
        org.netbeans.xml.schema.esquemaprimario.TipoDocumental insertNewTipoDocumentales(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tipoDocumentales" element
         */
        org.netbeans.xml.schema.esquemaprimario.TipoDocumental addNewTipoDocumentales();
        
        /**
         * Removes the ith "tipoDocumentales" element
         */
        void removeTipoDocumentales(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse newInstance() {
              return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument.ObtenerInformacionElementoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument newInstance() {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerInformacionElementoResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
