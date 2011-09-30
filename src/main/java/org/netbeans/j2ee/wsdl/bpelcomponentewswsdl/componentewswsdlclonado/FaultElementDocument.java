/*
 * An XML document type.
 * Localname: FaultElement
 * Namespace: http://j2ee.netbeans.org/wsdl/BPELComponenteWSWSDL/ComponenteWSWSDLClonado
 * Java type: org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado;


/**
 * A document containing one FaultElement(@http://j2ee.netbeans.org/wsdl/BPELComponenteWSWSDL/ComponenteWSWSDLClonado) element.
 *
 * This is a complex type.
 */
public interface FaultElementDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FaultElementDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("faultelement9723doctype");
    
    /**
     * Gets the "FaultElement" element
     */
    org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement getFaultElement();
    
    /**
     * Sets the "FaultElement" element
     */
    void setFaultElement(org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement faultElement);
    
    /**
     * Appends and returns a new empty "FaultElement" element
     */
    org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement addNewFaultElement();
    
    /**
     * An XML FaultElement(@http://j2ee.netbeans.org/wsdl/BPELComponenteWSWSDL/ComponenteWSWSDLClonado).
     *
     * This is a complex type.
     */
    public interface FaultElement extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FaultElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6534428E96997AD4A0E8C79EEB6640C").resolveHandle("faultelement1ad9elemtype");
        
        /**
         * Gets the "Fault" element
         */
        java.lang.String getFault();
        
        /**
         * Gets (as xml) the "Fault" element
         */
        org.apache.xmlbeans.XmlString xgetFault();
        
        /**
         * Sets the "Fault" element
         */
        void setFault(java.lang.String fault);
        
        /**
         * Sets (as xml) the "Fault" element
         */
        void xsetFault(org.apache.xmlbeans.XmlString fault);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement newInstance() {
              return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument.FaultElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument newInstance() {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.j2ee.wsdl.bpelcomponentewswsdl.componentewswsdlclonado.FaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
