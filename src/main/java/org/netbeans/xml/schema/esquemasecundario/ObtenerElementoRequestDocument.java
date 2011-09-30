/*
 * An XML document type.
 * Localname: obtenerElementoRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario;


/**
 * A document containing one obtenerElementoRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public interface ObtenerElementoRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObtenerElementoRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("obtenerelementorequest7876doctype");
    
    /**
     * Gets the "obtenerElementoRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument.ObtenerElementoRequest getObtenerElementoRequest();
    
    /**
     * Sets the "obtenerElementoRequest" element
     */
    void setObtenerElementoRequest(org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument.ObtenerElementoRequest obtenerElementoRequest);
    
    /**
     * Appends and returns a new empty "obtenerElementoRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument.ObtenerElementoRequest addNewObtenerElementoRequest();
    
    /**
     * An XML obtenerElementoRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public interface ObtenerElementoRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObtenerElementoRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("obtenerelementorequest4357elemtype");
        
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
         * Gets the "idElemento" element
         */
        java.lang.String getIdElemento();
        
        /**
         * Gets (as xml) the "idElemento" element
         */
        org.apache.xmlbeans.XmlString xgetIdElemento();
        
        /**
         * Tests for nil "idElemento" element
         */
        boolean isNilIdElemento();
        
        /**
         * Sets the "idElemento" element
         */
        void setIdElemento(java.lang.String idElemento);
        
        /**
         * Sets (as xml) the "idElemento" element
         */
        void xsetIdElemento(org.apache.xmlbeans.XmlString idElemento);
        
        /**
         * Nils the "idElemento" element
         */
        void setNilIdElemento();
        
        /**
         * Gets the "procesarContenidos" element
         */
        boolean getProcesarContenidos();
        
        /**
         * Gets (as xml) the "procesarContenidos" element
         */
        org.apache.xmlbeans.XmlBoolean xgetProcesarContenidos();
        
        /**
         * Tests for nil "procesarContenidos" element
         */
        boolean isNilProcesarContenidos();
        
        /**
         * Sets the "procesarContenidos" element
         */
        void setProcesarContenidos(boolean procesarContenidos);
        
        /**
         * Sets (as xml) the "procesarContenidos" element
         */
        void xsetProcesarContenidos(org.apache.xmlbeans.XmlBoolean procesarContenidos);
        
        /**
         * Nils the "procesarContenidos" element
         */
        void setNilProcesarContenidos();
        
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
            public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument.ObtenerElementoRequest newInstance() {
              return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument.ObtenerElementoRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument.ObtenerElementoRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument.ObtenerElementoRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument newInstance() {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.ObtenerElementoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
