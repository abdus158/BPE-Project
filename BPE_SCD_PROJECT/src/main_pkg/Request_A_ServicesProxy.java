package main_pkg;

public class Request_A_ServicesProxy implements main_pkg.Request_A_Services {
  private String _endpoint = null;
  private main_pkg.Request_A_Services request_A_Services = null;
  
  public Request_A_ServicesProxy() {
    _initRequest_A_ServicesProxy();
  }
  
  public Request_A_ServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initRequest_A_ServicesProxy();
  }
  
  private void _initRequest_A_ServicesProxy() {
    try {
      request_A_Services = (new main_pkg.Request_A_ServicesServiceLocator()).getRequest_A_Services();
      if (request_A_Services != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)request_A_Services)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)request_A_Services)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (request_A_Services != null)
      ((javax.xml.rpc.Stub)request_A_Services)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main_pkg.Request_A_Services getRequest_A_Services() {
    if (request_A_Services == null)
      _initRequest_A_ServicesProxy();
    return request_A_Services;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (request_A_Services == null)
      _initRequest_A_ServicesProxy();
    request_A_Services.main(args);
  }
  
  
}