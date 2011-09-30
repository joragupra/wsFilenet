/*
 * An XML document type.
 * Localname: insertarPiezaRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario;


/**
 * A document containing one insertarPiezaRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public interface InsertarPiezaRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InsertarPiezaRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("insertarpiezarequest9ab5doctype");
    
    /**
     * Gets the "insertarPiezaRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest getInsertarPiezaRequest();
    
    /**
     * Sets the "insertarPiezaRequest" element
     */
    void setInsertarPiezaRequest(org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest insertarPiezaRequest);
    
    /**
     * Appends and returns a new empty "insertarPiezaRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest addNewInsertarPiezaRequest();
    
    /**
     * An XML insertarPiezaRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public interface InsertarPiezaRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InsertarPiezaRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("insertarpiezarequestdc77elemtype");
        
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
         * Gets the "nombrePieza" element
         */
        java.lang.String getNombrePieza();
        
        /**
         * Gets (as xml) the "nombrePieza" element
         */
        org.apache.xmlbeans.XmlString xgetNombrePieza();
        
        /**
         * Tests for nil "nombrePieza" element
         */
        boolean isNilNombrePieza();
        
        /**
         * Sets the "nombrePieza" element
         */
        void setNombrePieza(java.lang.String nombrePieza);
        
        /**
         * Sets (as xml) the "nombrePieza" element
         */
        void xsetNombrePieza(org.apache.xmlbeans.XmlString nombrePieza);
        
        /**
         * Nils the "nombrePieza" element
         */
        void setNilNombrePieza();
        
        /**
         * Gets the "usuarioIndexacion" element
         */
        java.lang.String getUsuarioIndexacion();
        
        /**
         * Gets (as xml) the "usuarioIndexacion" element
         */
        org.apache.xmlbeans.XmlString xgetUsuarioIndexacion();
        
        /**
         * Sets the "usuarioIndexacion" element
         */
        void setUsuarioIndexacion(java.lang.String usuarioIndexacion);
        
        /**
         * Sets (as xml) the "usuarioIndexacion" element
         */
        void xsetUsuarioIndexacion(org.apache.xmlbeans.XmlString usuarioIndexacion);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest newInstance() {
              return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument.InsertarPiezaRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument newInstance() {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.InsertarPiezaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
