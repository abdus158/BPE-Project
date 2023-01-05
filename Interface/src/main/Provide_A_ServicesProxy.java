package main;

public class Provide_A_ServicesProxy implements main.Provide_A_Services {
  private String _endpoint = null;
  private main.Provide_A_Services provide_A_Services = null;
  
  public Provide_A_ServicesProxy() {
    _initProvide_A_ServicesProxy();
  }
  
  public Provide_A_ServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initProvide_A_ServicesProxy();
  }
  
  private void _initProvide_A_ServicesProxy() {
    try {
      provide_A_Services = (new main.Provide_A_ServicesServiceLocator()).getProvide_A_Services();
      if (provide_A_Services != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)provide_A_Services)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)provide_A_Services)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (provide_A_Services != null)
      ((javax.xml.rpc.Stub)provide_A_Services)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Provide_A_Services getProvide_A_Services() {
    if (provide_A_Services == null)
      _initProvide_A_ServicesProxy();
    return provide_A_Services;
  }
  
  public java.lang.String provideService(int custid, java.lang.String service, java.lang.String provisiondescription) throws java.rmi.RemoteException{
    if (provide_A_Services == null)
      _initProvide_A_ServicesProxy();
    return provide_A_Services.provideService(custid, service, provisiondescription);
  }
  
  
}