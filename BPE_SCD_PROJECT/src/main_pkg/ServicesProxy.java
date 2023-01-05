package main_pkg;

public class ServicesProxy implements main_pkg.Services {
  private String _endpoint = null;
  private main_pkg.Services services = null;
  
  public ServicesProxy() {
    _initServicesProxy();
  }
  
  public ServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicesProxy();
  }
  
  private void _initServicesProxy() {
    try {
      services = (new main_pkg.ServicesServiceLocator()).getServices();
      if (services != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)services)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)services)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (services != null)
      ((javax.xml.rpc.Stub)services)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main_pkg.Services getServices() {
    if (services == null)
      _initServicesProxy();
    return services;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.main(args);
  }
  
  
}