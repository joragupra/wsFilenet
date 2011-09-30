/*
 * XML Type:  resultadosBusqueda
 * Namespace: http://xml.netbeans.org/schema/esquemaPrimario
 * Java type: org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.xml.schema.esquemaprimario;


/**
 * An XML resultadosBusqueda(@http://xml.netbeans.org/schema/esquemaPrimario).
 *
 * This is a complex type.
 */
public interface ResultadosBusqueda extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultadosBusqueda.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("resultadosbusqueda2b55type");
    
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
     * Gets array of all "elemetos" elements
     */
    org.netbeans.xml.schema.esquemaprimario.Elemento[] getElemetosArray();
    
    /**
     * Gets ith "elemetos" element
     */
    org.netbeans.xml.schema.esquemaprimario.Elemento getElemetosArray(int i);
    
    /**
     * Tests for nil ith "elemetos" element
     */
    boolean isNilElemetosArray(int i);
    
    /**
     * Returns number of "elemetos" element
     */
    int sizeOfElemetosArray();
    
    /**
     * Sets array of all "elemetos" element
     */
    void setElemetosArray(org.netbeans.xml.schema.esquemaprimario.Elemento[] elemetosArray);
    
    /**
     * Sets ith "elemetos" element
     */
    void setElemetosArray(int i, org.netbeans.xml.schema.esquemaprimario.Elemento elemetos);
    
    /**
     * Nils the ith "elemetos" element
     */
    void setNilElemetosArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "elemetos" element
     */
    org.netbeans.xml.schema.esquemaprimario.Elemento insertNewElemetos(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "elemetos" element
     */
    org.netbeans.xml.schema.esquemaprimario.Elemento addNewElemetos();
    
    /**
     * Removes the ith "elemetos" element
     */
    void removeElemetos(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda newInstance() {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.xml.schema.esquemaprimario.ResultadosBusqueda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
