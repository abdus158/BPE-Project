/**
 * Provide_A_ServicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main_pkg;

public class Provide_A_ServicesServiceLocator extends org.apache.axis.client.Service implements main_pkg.Provide_A_ServicesService {

    public Provide_A_ServicesServiceLocator() {
    }


    public Provide_A_ServicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Provide_A_ServicesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Provide_A_Services
    private java.lang.String Provide_A_Services_address = "http://localhost:8080/BPE_SCD_PROJECT/services/Provide_A_Services";

    public java.lang.String getProvide_A_ServicesAddress() {
        return Provide_A_Services_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Provide_A_ServicesWSDDServiceName = "Provide_A_Services";

    public java.lang.String getProvide_A_ServicesWSDDServiceName() {
        return Provide_A_ServicesWSDDServiceName;
    }

    public void setProvide_A_ServicesWSDDServiceName(java.lang.String name) {
        Provide_A_ServicesWSDDServiceName = name;
    }

    public main_pkg.Provide_A_Services getProvide_A_Services() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Provide_A_Services_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProvide_A_Services(endpoint);
    }

    public main_pkg.Provide_A_Services getProvide_A_Services(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main_pkg.Provide_A_ServicesSoapBindingStub _stub = new main_pkg.Provide_A_ServicesSoapBindingStub(portAddress, this);
            _stub.setPortName(getProvide_A_ServicesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProvide_A_ServicesEndpointAddress(java.lang.String address) {
        Provide_A_Services_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main_pkg.Provide_A_Services.class.isAssignableFrom(serviceEndpointInterface)) {
                main_pkg.Provide_A_ServicesSoapBindingStub _stub = new main_pkg.Provide_A_ServicesSoapBindingStub(new java.net.URL(Provide_A_Services_address), this);
                _stub.setPortName(getProvide_A_ServicesWSDDServiceName());
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
        if ("Provide_A_Services".equals(inputPortName)) {
            return getProvide_A_Services();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Provide_A_ServicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Provide_A_Services"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Provide_A_Services".equals(portName)) {
            setProvide_A_ServicesEndpointAddress(address);
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
