/**
 * SrwService.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package gov.loc.www.zing.srw.srw_sample_service;

public interface SrwService extends javax.xml.rpc.Service {
    public java.lang.String getSrwPortAddress();

    public gov.loc.www.zing.srw.srw_sample_service.SrwPort getSrwPort() throws javax.xml.rpc.ServiceException;

    public gov.loc.www.zing.srw.srw_sample_service.SrwPort getSrwPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
