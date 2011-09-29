
/**
 * ComponenteWSWSDLClonadoServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

    package com.emasesa.aqua.serviciosWeb.Filenet;

    /**
     *  ComponenteWSWSDLClonadoServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ComponenteWSWSDLClonadoServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ComponenteWSWSDLClonadoServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ComponenteWSWSDLClonadoServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for insertarDocumento method
            * override this method for handling normal response from insertarDocumento operation
            */
           public void receiveResultinsertarDocumento(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.InsertarDocumentoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarDocumento operation
           */
            public void receiveErrorinsertarDocumento(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buscarDocumentos method
            * override this method for handling normal response from buscarDocumentos operation
            */
           public void receiveResultbuscarDocumentos(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.BuscarDocumentosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buscarDocumentos operation
           */
            public void receiveErrorbuscarDocumentos(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for moverPiezaAExpediente method
            * override this method for handling normal response from moverPiezaAExpediente operation
            */
           public void receiveResultmoverPiezaAExpediente(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.MoverPiezaAExpedienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from moverPiezaAExpediente operation
           */
            public void receiveErrormoverPiezaAExpediente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerSeries method
            * override this method for handling normal response from obtenerSeries operation
            */
           public void receiveResultobtenerSeries(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.ObtenerSeriesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerSeries operation
           */
            public void receiveErrorobtenerSeries(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buscarElementos method
            * override this method for handling normal response from buscarElementos operation
            */
           public void receiveResultbuscarElementos(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.BuscarElementosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buscarElementos operation
           */
            public void receiveErrorbuscarElementos(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for crearExpedienteOrigen method
            * override this method for handling normal response from crearExpedienteOrigen operation
            */
           public void receiveResultcrearExpedienteOrigen(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.CrearExpedienteOrigenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from crearExpedienteOrigen operation
           */
            public void receiveErrorcrearExpedienteOrigen(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarExpediente method
            * override this method for handling normal response from insertarExpediente operation
            */
           public void receiveResultinsertarExpediente(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.InsertarExpedienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarExpediente operation
           */
            public void receiveErrorinsertarExpediente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for crearDocumentoOrigen method
            * override this method for handling normal response from crearDocumentoOrigen operation
            */
           public void receiveResultcrearDocumentoOrigen(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.CrearDocumentoOrigenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from crearDocumentoOrigen operation
           */
            public void receiveErrorcrearDocumentoOrigen(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrar method
            * override this method for handling normal response from borrar operation
            */
           public void receiveResultborrar(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.BorrarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrar operation
           */
            public void receiveErrorborrar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerInformacionElemento method
            * override this method for handling normal response from obtenerInformacionElemento operation
            */
           public void receiveResultobtenerInformacionElemento(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.ObtenerInformacionElementoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerInformacionElemento operation
           */
            public void receiveErrorobtenerInformacionElemento(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerElemento method
            * override this method for handling normal response from obtenerElemento operation
            */
           public void receiveResultobtenerElemento(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.ObtenerElementoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerElemento operation
           */
            public void receiveErrorobtenerElemento(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarPieza method
            * override this method for handling normal response from insertarPieza operation
            */
           public void receiveResultinsertarPieza(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.InsertarPiezaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarPieza operation
           */
            public void receiveErrorinsertarPieza(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for actualizar method
            * override this method for handling normal response from actualizar operation
            */
           public void receiveResultactualizar(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.ActualizarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from actualizar operation
           */
            public void receiveErroractualizar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for actualizarDocumento method
            * override this method for handling normal response from actualizarDocumento operation
            */
           public void receiveResultactualizarDocumento(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.ActualizarDocumentoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from actualizarDocumento operation
           */
            public void receiveErroractualizarDocumento(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for moverDocumentoAPieza method
            * override this method for handling normal response from moverDocumentoAPieza operation
            */
           public void receiveResultmoverDocumentoAPieza(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.MoverDocumentoAPiezaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from moverDocumentoAPieza operation
           */
            public void receiveErrormoverDocumentoAPieza(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for crearDocumentoBusqueda method
            * override this method for handling normal response from crearDocumentoBusqueda operation
            */
           public void receiveResultcrearDocumentoBusqueda(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.CrearDocumentoBusquedaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from crearDocumentoBusqueda operation
           */
            public void receiveErrorcrearDocumentoBusqueda(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPaginaSiguiente method
            * override this method for handling normal response from obtenerPaginaSiguiente operation
            */
           public void receiveResultobtenerPaginaSiguiente(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.ObtenerPaginaSiquienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPaginaSiguiente operation
           */
            public void receiveErrorobtenerPaginaSiguiente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPaginaAnterior method
            * override this method for handling normal response from obtenerPaginaAnterior operation
            */
           public void receiveResultobtenerPaginaAnterior(
                    com.emasesa.aqua.serviciosWeb.Filenet.ComponenteWSWSDLClonadoServiceStub.ObtenerPaginaAnteriorResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPaginaAnterior operation
           */
            public void receiveErrorobtenerPaginaAnterior(java.lang.Exception e) {
            }
                


    }
    