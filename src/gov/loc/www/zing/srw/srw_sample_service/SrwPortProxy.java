package gov.loc.www.zing.srw.srw_sample_service;

public class SrwPortProxy implements gov.loc.www.zing.srw.srw_sample_service.SrwPort {
  private String _endpoint = null;
  private gov.loc.www.zing.srw.srw_sample_service.SrwPort srwPort = null;
  
  public SrwPortProxy() {
    _initSrwPortProxy();
  }
  
  public SrwPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initSrwPortProxy();
  }
  
  private void _initSrwPortProxy() {
    try {
      srwPort = (new gov.loc.www.zing.srw.srw_sample_service.SrwServiceLocator()).getSrwPort();
      if (srwPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)srwPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)srwPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (srwPort != null)
      ((javax.xml.rpc.Stub)srwPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public gov.loc.www.zing.srw.srw_sample_service.SrwPort getSrwPort() {
    if (srwPort == null)
      _initSrwPortProxy();
    return srwPort;
  }
  
  public gov.loc.www.zing.srw.SearchRetrieveResponseType searchRetrieve(gov.loc.www.zing.srw.SearchRetrieveRequestType searchRetrieveRequest) throws java.rmi.RemoteException{
    if (srwPort == null)
      _initSrwPortProxy();
    return srwPort.searchRetrieve(searchRetrieveRequest);
  }
  
  
}