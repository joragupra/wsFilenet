/*
 * An XML document type.
 * Localname: actualizarDocumentoRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario;


/**
 * A document containing one actualizarDocumentoRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public interface ActualizarDocumentoRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActualizarDocumentoRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("actualizardocumentorequestd630doctype");
    
    /**
     * Gets the "actualizarDocumentoRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest getActualizarDocumentoRequest();
    
    /**
     * Sets the "actualizarDocumentoRequest" element
     */
    void setActualizarDocumentoRequest(org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest actualizarDocumentoRequest);
    
    /**
     * Appends and returns a new empty "actualizarDocumentoRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest addNewActualizarDocumentoRequest();
    
    /**
     * An XML actualizarDocumentoRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public interface ActualizarDocumentoRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActualizarDocumentoRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("actualizardocumentorequest5597elemtype");
        
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
         * Gets the "documento" element
         */
        org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen getDocumento();
        
        /**
         * Tests for nil "documento" element
         */
        boolean isNilDocumento();
        
        /**
         * Sets the "documento" element
         */
        void setDocumento(org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen documento);
        
        /**
         * Appends and returns a new empty "documento" element
         */
        org.netbeans.xml.schema.esquemaprimario.DocumentoOrigen addNewDocumento();
        
        /**
         * Nils the "documento" element
         */
        void setNilDocumento();
        
        /**
         * Gets the "actualizarContenido" element
         */
        boolean getActualizarContenido();
        
        /**
         * Gets (as xml) the "actualizarContenido" element
         */
        org.apache.xmlbeans.XmlBoolean xgetActualizarContenido();
        
        /**
         * Tests for nil "actualizarContenido" element
         */
        boolean isNilActualizarContenido();
        
        /**
         * Sets the "actualizarContenido" element
         */
        void setActualizarContenido(boolean actualizarContenido);
        
        /**
         * Sets (as xml) the "actualizarContenido" element
         */
        void xsetActualizarContenido(org.apache.xmlbeans.XmlBoolean actualizarContenido);
        
        /**
         * Nils the "actualizarContenido" element
         */
        void setNilActualizarContenido();
        
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
            public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest newInstance() {
              return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument.ActualizarDocumentoRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument newInstance() {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.ActualizarDocumentoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
