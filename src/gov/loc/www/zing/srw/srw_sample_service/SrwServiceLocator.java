/**
 * SrwServiceLocator.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package gov.loc.www.zing.srw.srw_sample_service;

public class SrwServiceLocator extends org.apache.axis.client.Service implements gov.loc.www.zing.srw.srw_sample_service.SrwService {

    public SrwServiceLocator() {
    }


    public SrwServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SrwServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // SrwPortのプロキシクラスの取得に使用します / [en]-(Use to get a proxy class for SrwPort)
    private java.lang.String SrwPort_address = "http://192.168.203.132/omekas/s/u-t-archive/srw";

    public java.lang.String getSrwPortAddress() {
        return SrwPort_address;
    }

    // WSDDサービス名のデフォルトはポート名です / [en]-(The WSDD service name defaults to the port name.)
    private java.lang.String SrwPortWSDDServiceName = "SrwPort";

    public java.lang.String getSrwPortWSDDServiceName() {
        return SrwPortWSDDServiceName;
    }

    public void setSrwPortWSDDServiceName(java.lang.String name) {
        SrwPortWSDDServiceName = name;
    }

    public gov.loc.www.zing.srw.srw_sample_service.SrwPort getSrwPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SrwPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSrwPort(endpoint);
    }

    public gov.loc.www.zing.srw.srw_sample_service.SrwPort getSrwPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            gov.loc.www.zing.srw.srw_sample_service.SrwBindingStub _stub = new gov.loc.www.zing.srw.srw_sample_service.SrwBindingStub(portAddress, this);
            _stub.setPortName(getSrwPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSrwPortEndpointAddress(java.lang.String address) {
        SrwPort_address = address;
    }

    /**
     * 与えられたインターフェースに対して、スタブの実装を取得します。 / [en]-(For the given interface, get the stub implementation.)
     * このサービスが与えられたインターフェースに対してポートを持たない場合、 / [en]-(If this service has no port for the given interface,)
     * ServiceExceptionが投げられます。 / [en]-(then ServiceException is thrown.)
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (gov.loc.www.zing.srw.srw_sample_service.SrwPort.class.isAssignableFrom(serviceEndpointInterface)) {
                gov.loc.www.zing.srw.srw_sample_service.SrwBindingStub _stub = new gov.loc.www.zing.srw.srw_sample_service.SrwBindingStub(new java.net.URL(SrwPort_address), this);
                _stub.setPortName(getSrwPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("インターフェースに対するスタブの実装がありません: / [en]-(There is no stub implementation for the interface:)  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * 与えられたインターフェースに対して、スタブの実装を取得します。 / [en]-(For the given interface, get the stub implementation.)
     * このサービスが与えられたインターフェースに対してポートを持たない場合、 / [en]-(If this service has no port for the given interface,)
     * ServiceExceptionが投げられます。 / [en]-(then ServiceException is thrown.)
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SrwPort".equals(inputPortName)) {
            return getSrwPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/srw-sample-service/", "SrwService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/srw-sample-service/", "SrwPort"));
        }
        return ports.iterator();
    }

    /**
    * 指定したポート名に対するエンドポイントのアドレスをセットします / [en]-(Set the endpoint address for the specified port name.)
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SrwPort".equals(portName)) {
            setSrwPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" 未知のポートに対してはエンドポイントのアドレスをセットできません / [en]-(Cannot set Endpoint Address for Unknown Port)" + portName);
        }
    }

    /**
    * 指定したポート名に対するエンドポイントのアドレスをセットします / [en]-(Set the endpoint address for the specified port name.)
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
