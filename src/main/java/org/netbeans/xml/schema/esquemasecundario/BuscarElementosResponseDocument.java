/*
 * An XML document type.
 * Localname: buscarElementosResponse
 * Namespace: http://xml.netbeans.org/schema/esquemaSecundario
 * Java type: org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemasecundario;


/**
 * A document containing one buscarElementosResponse(@http://xml.netbeans.org/schema/esquemaSecundario) element.
 *
 * This is a complex type.
 */
public interface BuscarElementosResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscarElementosResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("buscarelementosresponsecdc0doctype");
    
    /**
     * Gets the "buscarElementosResponse" element
     */
    org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse getBuscarElementosResponse();
    
    /**
     * Sets the "buscarElementosResponse" element
     */
    void setBuscarElementosResponse(org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse buscarElementosResponse);
    
    /**
     * Appends and returns a new empty "buscarElementosResponse" element
     */
    org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse addNewBuscarElementosResponse();
    
    /**
     * An XML buscarElementosResponse(@http://xml.netbeans.org/schema/esquemaSecundario).
     *
     * This is a complex type.
     */
    public interface BuscarElementosResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscarElementosResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("buscarelementosresponsed467elemtype");
        
        /**
         * Gets the "existePaginaSiguiente" element
         */
        boolean getExistePaginaSiguiente();
        
        /**
         * Gets (as xml) the "existePaginaSiguiente" element
         */
        org.apache.xmlbeans.XmlBoolean xgetExistePaginaSiguiente();
        
        /**
         * Tests for nil "existePaginaSiguiente" element
         */
        boolean isNilExistePaginaSiguiente();
        
        /**
         * Sets the "existePaginaSiguiente" element
         */
        void setExistePaginaSiguiente(boolean existePaginaSiguiente);
        
        /**
         * Sets (as xml) the "existePaginaSiguiente" element
         */
        void xsetExistePaginaSiguiente(org.apache.xmlbeans.XmlBoolean existePaginaSiguiente);
        
        /**
         * Nils the "existePaginaSiguiente" element
         */
        void setNilExistePaginaSiguiente();
        
        /**
         * Gets the "existePaginaAnterior" element
         */
        boolean getExistePaginaAnterior();
        
        /**
         * Gets (as xml) the "existePaginaAnterior" element
         */
        org.apache.xmlbeans.XmlBoolean xgetExistePaginaAnterior();
        
        /**
         * Tests for nil "existePaginaAnterior" element
         */
        boolean isNilExistePaginaAnterior();
        
        /**
         * Sets the "existePaginaAnterior" element
         */
        void setExistePaginaAnterior(boolean existePaginaAnterior);
        
        /**
         * Sets (as xml) the "existePaginaAnterior" element
         */
        void xsetExistePaginaAnterior(org.apache.xmlbeans.XmlBoolean existePaginaAnterior);
        
        /**
         * Nils the "existePaginaAnterior" element
         */
        void setNilExistePaginaAnterior();
        
        /**
         * Gets the "documentoBusqueda" element
         */
        org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda getDocumentoBusqueda();
        
        /**
         * Tests for nil "documentoBusqueda" element
         */
        boolean isNilDocumentoBusqueda();
        
        /**
         * Sets the "documentoBusqueda" element
         */
        void setDocumentoBusqueda(org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda documentoBusqueda);
        
        /**
         * Appends and returns a new empty "documentoBusqueda" element
         */
        org.netbeans.xml.schema.esquemaprimario.DocumentoBusqueda addNewDocumentoBusqueda();
        
        /**
         * Nils the "documentoBusqueda" element
         */
        void setNilDocumentoBusqueda();
        
        /**
         * Gets array of all "elemento" elements
         */
        org.netbeans.xml.schema.esquemaprimario.Elemento[] getElementoArray();
        
        /**
         * Gets ith "elemento" element
         */
        org.netbeans.xml.schema.esquemaprimario.Elemento getElementoArray(int i);
        
        /**
         * Tests for nil ith "elemento" element
         */
        boolean isNilElementoArray(int i);
        
        /**
         * Returns number of "elemento" element
         */
        int sizeOfElementoArray();
        
        /**
         * Sets array of all "elemento" element
         */
        void setElementoArray(org.netbeans.xml.schema.esquemaprimario.Elemento[] elementoArray);
        
        /**
         * Sets ith "elemento" element
         */
        void setElementoArray(int i, org.netbeans.xml.schema.esquemaprimario.Elemento elemento);
        
        /**
         * Nils the ith "elemento" element
         */
        void setNilElementoArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "elemento" element
         */
        org.netbeans.xml.schema.esquemaprimario.Elemento insertNewElemento(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "elemento" element
         */
        org.netbeans.xml.schema.esquemaprimario.Elemento addNewElemento();
        
        /**
         * Removes the ith "elemento" element
         */
        void removeElemento(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse newInstance() {
              return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument.BuscarElementosResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument newInstance() {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemasecundario.BuscarElementosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
