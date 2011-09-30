/*
 * An XML document type.
 * Localname: moverPiezaAExpedienteRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario;


/**
 * A document containing one moverPiezaAExpedienteRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public interface MoverPiezaAExpedienteRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MoverPiezaAExpedienteRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("moverpiezaaexpedienterequest9cc2doctype");
    
    /**
     * Gets the "moverPiezaAExpedienteRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest getMoverPiezaAExpedienteRequest();
    
    /**
     * Sets the "moverPiezaAExpedienteRequest" element
     */
    void setMoverPiezaAExpedienteRequest(org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest moverPiezaAExpedienteRequest);
    
    /**
     * Appends and returns a new empty "moverPiezaAExpedienteRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest addNewMoverPiezaAExpedienteRequest();
    
    /**
     * An XML moverPiezaAExpedienteRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public interface MoverPiezaAExpedienteRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MoverPiezaAExpedienteRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("moverpiezaaexpedienterequeste9d7elemtype");
        
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
         * Gets the "idPieza" element
         */
        java.lang.String getIdPieza();
        
        /**
         * Gets (as xml) the "idPieza" element
         */
        org.apache.xmlbeans.XmlString xgetIdPieza();
        
        /**
         * Sets the "idPieza" element
         */
        void setIdPieza(java.lang.String idPieza);
        
        /**
         * Sets (as xml) the "idPieza" element
         */
        void xsetIdPieza(org.apache.xmlbeans.XmlString idPieza);
        
        /**
         * Gets the "idExpediente" element
         */
        java.lang.String getIdExpediente();
        
        /**
         * Gets (as xml) the "idExpediente" element
         */
        org.apache.xmlbeans.XmlString xgetIdExpediente();
        
        /**
         * Sets the "idExpediente" element
         */
        void setIdExpediente(java.lang.String idExpediente);
        
        /**
         * Sets (as xml) the "idExpediente" element
         */
        void xsetIdExpediente(org.apache.xmlbeans.XmlString idExpediente);
        
        /**
         * Gets the "volumenDeArchivoAsociado" element
         */
        java.lang.String getVolumenDeArchivoAsociado();
        
        /**
         * Gets (as xml) the "volumenDeArchivoAsociado" element
         */
        org.apache.xmlbeans.XmlString xgetVolumenDeArchivoAsociado();
        
        /**
         * Sets the "volumenDeArchivoAsociado" element
         */
        void setVolumenDeArchivoAsociado(java.lang.String volumenDeArchivoAsociado);
        
        /**
         * Sets (as xml) the "volumenDeArchivoAsociado" element
         */
        void xsetVolumenDeArchivoAsociado(org.apache.xmlbeans.XmlString volumenDeArchivoAsociado);
        
        /**
         * Gets the "usuario" element
         */
        org.netbeans.xml.schema.esquemaprimario.Usuario getUsuario();
        
        /**
         * Sets the "usuario" element
         */
        void setUsuario(org.netbeans.xml.schema.esquemaprimario.Usuario usuario);
        
        /**
         * Appends and returns a new empty "usuario" element
         */
        org.netbeans.xml.schema.esquemaprimario.Usuario addNewUsuario();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest newInstance() {
              return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument.MoverPiezaAExpedienteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument newInstance() {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.MoverPiezaAExpedienteRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
