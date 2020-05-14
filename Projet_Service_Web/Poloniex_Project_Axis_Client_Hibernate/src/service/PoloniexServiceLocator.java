/**
 * PoloniexServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class PoloniexServiceLocator extends org.apache.axis.client.Service implements service.PoloniexService {

    public PoloniexServiceLocator() {
    }


    public PoloniexServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PoloniexServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PoloniexPort
    private java.lang.String PoloniexPort_address = "http://localhost:1212/";

    public java.lang.String getPoloniexPortAddress() {
        return PoloniexPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PoloniexPortWSDDServiceName = "PoloniexPort";

    public java.lang.String getPoloniexPortWSDDServiceName() {
        return PoloniexPortWSDDServiceName;
    }

    public void setPoloniexPortWSDDServiceName(java.lang.String name) {
        PoloniexPortWSDDServiceName = name;
    }

    public service.Poloniex getPoloniexPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PoloniexPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPoloniexPort(endpoint);
    }

    public service.Poloniex getPoloniexPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.PoloniexPortBindingStub _stub = new service.PoloniexPortBindingStub(portAddress, this);
            _stub.setPortName(getPoloniexPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPoloniexPortEndpointAddress(java.lang.String address) {
        PoloniexPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.Poloniex.class.isAssignableFrom(serviceEndpointInterface)) {
                service.PoloniexPortBindingStub _stub = new service.PoloniexPortBindingStub(new java.net.URL(PoloniexPort_address), this);
                _stub.setPortName(getPoloniexPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PoloniexPort".equals(inputPortName)) {
            return getPoloniexPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "PoloniexService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "PoloniexPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PoloniexPort".equals(portName)) {
            setPoloniexPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
