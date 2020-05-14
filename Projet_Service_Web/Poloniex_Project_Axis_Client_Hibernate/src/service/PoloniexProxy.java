package service;

public class PoloniexProxy implements service.Poloniex {
  private String _endpoint = null;
  private service.Poloniex poloniex = null;
  
  public PoloniexProxy() {
    _initPoloniexProxy();
  }
  
  public PoloniexProxy(String endpoint) {
    _endpoint = endpoint;
    _initPoloniexProxy();
  }
  
  private void _initPoloniexProxy() {
    try {
      poloniex = (new service.PoloniexServiceLocator()).getPoloniexPort();
      if (poloniex != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)poloniex)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)poloniex)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (poloniex != null)
      ((javax.xml.rpc.Stub)poloniex)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.Poloniex getPoloniex() {
    if (poloniex == null)
      _initPoloniexProxy();
    return poloniex;
  }
  
  public service.CryotCurrency recherche(java.lang.String type) throws java.rmi.RemoteException{
    if (poloniex == null)
      _initPoloniexProxy();
    return poloniex.recherche(type);
  }
  
  
}