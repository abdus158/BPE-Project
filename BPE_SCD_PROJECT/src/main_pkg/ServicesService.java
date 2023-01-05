/**
 * ServicesService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main_pkg;

public interface ServicesService extends javax.xml.rpc.Service {
    public java.lang.String getServicesAddress();

    public main_pkg.Services getServices() throws javax.xml.rpc.ServiceException;

    public main_pkg.Services getServices(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
