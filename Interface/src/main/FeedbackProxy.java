package main;

public class FeedbackProxy implements main.Feedback {
  private String _endpoint = null;
  private main.Feedback feedback = null;
  
  public FeedbackProxy() {
    _initFeedbackProxy();
  }
  
  public FeedbackProxy(String endpoint) {
    _endpoint = endpoint;
    _initFeedbackProxy();
  }
  
  private void _initFeedbackProxy() {
    try {
      feedback = (new main.FeedbackServiceLocator()).getFeedback();
      if (feedback != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)feedback)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)feedback)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (feedback != null)
      ((javax.xml.rpc.Stub)feedback)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Feedback getFeedback() {
    if (feedback == null)
      _initFeedbackProxy();
    return feedback;
  }
  
  public java.lang.String giveFeedback(int customerID, java.lang.String yourService, java.lang.String feedback0) throws java.rmi.RemoteException{
    if (feedback == null)
      _initFeedbackProxy();
    return feedback.giveFeedback(customerID, yourService, feedback0);
  }
  
  
}