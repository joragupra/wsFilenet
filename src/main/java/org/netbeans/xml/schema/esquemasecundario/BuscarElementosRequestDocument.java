/*
 * An XML document type.
 * Localname: buscarElementosRequest
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario;


/**
 * A document containing one buscarElementosRequest(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public interface BuscarElementosRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscarElementosRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("buscarelementosrequest9fb8doctype");
    
    /**
     * Gets the "buscarElementosRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest getBuscarElementosRequest();
    
    /**
     * Sets the "buscarElementosRequest" element
     */
    void setBuscarElementosRequest(org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest buscarElementosRequest);
    
    /**
     * Appends and returns a new empty "buscarElementosRequest" element
     */
    org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest addNewBuscarElementosRequest();
    
    /**
     * An XML buscarElementosRequest(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public interface BuscarElementosRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscarElementosRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("buscarelementosrequest9197elemtype");
        
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
         * Gets the "tipoElemento" element
         */
        int getTipoElemento();
        
        /**
         * Gets (as xml) the "tipoElemento" element
         */
        org.apache.xmlbeans.XmlInt xgetTipoElemento();
        
        /**
         * Tests for nil "tipoElemento" element
         */
        boolean isNilTipoElemento();
        
        /**
         * Sets the "tipoElemento" element
         */
        void setTipoElemento(int tipoElemento);
        
        /**
         * Sets (as xml) the "tipoElemento" element
         */
        void xsetTipoElemento(org.apache.xmlbeans.XmlInt tipoElemento);
        
        /**
         * Nils the "tipoElemento" element
         */
        void setNilTipoElemento();
        
        /**
         * Gets the "identificadorElemento" element
         */
        java.lang.String getIdentificadorElemento();
        
        /**
         * Gets (as xml) the "identificadorElemento" element
         */
        org.apache.xmlbeans.XmlString xgetIdentificadorElemento();
        
        /**
         * Tests for nil "identificadorElemento" element
         */
        boolean isNilIdentificadorElemento();
        
        /**
         * Sets the "identificadorElemento" element
         */
        void setIdentificadorElemento(java.lang.String identificadorElemento);
        
        /**
         * Sets (as xml) the "identificadorElemento" element
         */
        void xsetIdentificadorElemento(org.apache.xmlbeans.XmlString identificadorElemento);
        
        /**
         * Nils the "identificadorElemento" element
         */
        void setNilIdentificadorElemento();
        
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
         * Gets array of all "identificadores" elements
         */
        java.lang.String[] getIdentificadoresArray();
        
        /**
         * Gets ith "identificadores" element
         */
        java.lang.String getIdentificadoresArray(int i);
        
        /**
         * Gets (as xml) array of all "identificadores" elements
         */
        org.apache.xmlbeans.XmlString[] xgetIdentificadoresArray();
        
        /**
         * Gets (as xml) ith "identificadores" element
         */
        org.apache.xmlbeans.XmlString xgetIdentificadoresArray(int i);
        
        /**
         * Tests for nil ith "identificadores" element
         */
        boolean isNilIdentificadoresArray(int i);
        
        /**
         * Returns number of "identificadores" element
         */
        int sizeOfIdentificadoresArray();
        
        /**
         * Sets array of all "identificadores" element
         */
        void setIdentificadoresArray(java.lang.String[] identificadoresArray);
        
        /**
         * Sets ith "identificadores" element
         */
        void setIdentificadoresArray(int i, java.lang.String identificadores);
        
        /**
         * Sets (as xml) array of all "identificadores" element
         */
        void xsetIdentificadoresArray(org.apache.xmlbeans.XmlString[] identificadoresArray);
        
        /**
         * Sets (as xml) ith "identificadores" element
         */
        void xsetIdentificadoresArray(int i, org.apache.xmlbeans.XmlString identificadores);
        
        /**
         * Nils the ith "identificadores" element
         */
        void setNilIdentificadoresArray(int i);
        
        /**
         * Inserts the value as the ith "identificadores" element
         */
        void insertIdentificadores(int i, java.lang.String identificadores);
        
        /**
         * Appends the value as the last "identificadores" element
         */
        void addIdentificadores(java.lang.String identificadores);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "identificadores" element
         */
        org.apache.xmlbeans.XmlString insertNewIdentificadores(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "identificadores" element
         */
        org.apache.xmlbeans.XmlString addNewIdentificadores();
        
        /**
         * Removes the ith "identificadores" element
         */
        void removeIdentificadores(int i);
        
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
        org.netbeans.xml.schema.esquemaprimario.CampoBusqueda[] getCamposArray();
        
        /**
         * Gets ith "campos" element
         */
        org.netbeans.xml.schema.esquemaprimario.CampoBusqueda getCamposArray(int i);
        
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
        void setCamposArray(org.netbeans.xml.schema.esquemaprimario.CampoBusqueda[] camposArray);
        
        /**
         * Sets ith "campos" element
         */
        void setCamposArray(int i, org.netbeans.xml.schema.esquemaprimario.CampoBusqueda campos);
        
        /**
         * Nils the ith "campos" element
         */
        void setNilCamposArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "campos" element
         */
        org.netbeans.xml.schema.esquemaprimario.CampoBusqueda insertNewCampos(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "campos" element
         */
        org.netbeans.xml.schema.esquemaprimario.CampoBusqueda addNewCampos();
        
        /**
         * Removes the ith "campos" element
         */
        void removeCampos(int i);
        
        /**
         * Gets the "tamayoPagina" element
         */
        int getTamayoPagina();
        
        /**
         * Gets (as xml) the "tamayoPagina" element
         */
        org.apache.xmlbeans.XmlInt xgetTamayoPagina();
        
        /**
         * Tests for nil "tamayoPagina" element
         */
        boolean isNilTamayoPagina();
        
        /**
         * Sets the "tamayoPagina" element
         */
        void setTamayoPagina(int tamayoPagina);
        
        /**
         * Sets (as xml) the "tamayoPagina" element
         */
        void xsetTamayoPagina(org.apache.xmlbeans.XmlInt tamayoPagina);
        
        /**
         * Nils the "tamayoPagina" element
         */
        void setNilTamayoPagina();
        
        /**
         * Gets array of all "ordenadoPor" elements
         */
        java.lang.String[] getOrdenadoPorArray();
        
        /**
         * Gets ith "ordenadoPor" element
         */
        java.lang.String getOrdenadoPorArray(int i);
        
        /**
         * Gets (as xml) array of all "ordenadoPor" elements
         */
        org.apache.xmlbeans.XmlString[] xgetOrdenadoPorArray();
        
        /**
         * Gets (as xml) ith "ordenadoPor" element
         */
        org.apache.xmlbeans.XmlString xgetOrdenadoPorArray(int i);
        
        /**
         * Tests for nil ith "ordenadoPor" element
         */
        boolean isNilOrdenadoPorArray(int i);
        
        /**
         * Returns number of "ordenadoPor" element
         */
        int sizeOfOrdenadoPorArray();
        
        /**
         * Sets array of all "ordenadoPor" element
         */
        void setOrdenadoPorArray(java.lang.String[] ordenadoPorArray);
        
        /**
         * Sets ith "ordenadoPor" element
         */
        void setOrdenadoPorArray(int i, java.lang.String ordenadoPor);
        
        /**
         * Sets (as xml) array of all "ordenadoPor" element
         */
        void xsetOrdenadoPorArray(org.apache.xmlbeans.XmlString[] ordenadoPorArray);
        
        /**
         * Sets (as xml) ith "ordenadoPor" element
         */
        void xsetOrdenadoPorArray(int i, org.apache.xmlbeans.XmlString ordenadoPor);
        
        /**
         * Nils the ith "ordenadoPor" element
         */
        void setNilOrdenadoPorArray(int i);
        
        /**
         * Inserts the value as the ith "ordenadoPor" element
         */
        void insertOrdenadoPor(int i, java.lang.String ordenadoPor);
        
        /**
         * Appends the value as the last "ordenadoPor" element
         */
        void addOrdenadoPor(java.lang.String ordenadoPor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ordenadoPor" element
         */
        org.apache.xmlbeans.XmlString insertNewOrdenadoPor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ordenadoPor" element
         */
        org.apache.xmlbeans.XmlString addNewOrdenadoPor();
        
        /**
         * Removes the ith "ordenadoPor" element
         */
        void removeOrdenadoPor(int i);
        
        /**
         * Gets the "ordenacionDescendente" element
         */
        boolean getOrdenacionDescendente();
        
        /**
         * Gets (as xml) the "ordenacionDescendente" element
         */
        org.apache.xmlbeans.XmlBoolean xgetOrdenacionDescendente();
        
        /**
         * Tests for nil "ordenacionDescendente" element
         */
        boolean isNilOrdenacionDescendente();
        
        /**
         * Sets the "ordenacionDescendente" element
         */
        void setOrdenacionDescendente(boolean ordenacionDescendente);
        
        /**
         * Sets (as xml) the "ordenacionDescendente" element
         */
        void xsetOrdenacionDescendente(org.apache.xmlbeans.XmlBoolean ordenacionDescendente);
        
        /**
         * Nils the "ordenacionDescendente" element
         */
        void setNilOrdenacionDescendente();
        
        /**
         * Gets the "versionMayor" element
         */
        boolean getVersionMayor();
        
        /**
         * Gets (as xml) the "versionMayor" element
         */
        org.apache.xmlbeans.XmlBoolean xgetVersionMayor();
        
        /**
         * Tests for nil "versionMayor" element
         */
        boolean isNilVersionMayor();
        
        /**
         * Sets the "versionMayor" element
         */
        void setVersionMayor(boolean versionMayor);
        
        /**
         * Sets (as xml) the "versionMayor" element
         */
        void xsetVersionMayor(org.apache.xmlbeans.XmlBoolean versionMayor);
        
        /**
         * Nils the "versionMayor" element
         */
        void setNilVersionMayor();
        
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
         * Gets the "relacionDocumentoPieza" element
         */
        int getRelacionDocumentoPieza();
        
        /**
         * Gets (as xml) the "relacionDocumentoPieza" element
         */
        org.apache.xmlbeans.XmlInt xgetRelacionDocumentoPieza();
        
        /**
         * Tests for nil "relacionDocumentoPieza" element
         */
        boolean isNilRelacionDocumentoPieza();
        
        /**
         * Sets the "relacionDocumentoPieza" element
         */
        void setRelacionDocumentoPieza(int relacionDocumentoPieza);
        
        /**
         * Sets (as xml) the "relacionDocumentoPieza" element
         */
        void xsetRelacionDocumentoPieza(org.apache.xmlbeans.XmlInt relacionDocumentoPieza);
        
        /**
         * Nils the "relacionDocumentoPieza" element
         */
        void setNilRelacionDocumentoPieza();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest newInstance() {
              return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument.BuscarElementosRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument newInstance() {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
