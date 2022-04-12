package sample;

import java.math.BigInteger;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import gov.loc.www.zing.srw.SearchRetrieveRequestType;
import gov.loc.www.zing.srw.SearchRetrieveResponseType;
import gov.loc.www.zing.srw.srw_sample_service.SrwPort;
import gov.loc.www.zing.srw.srw_sample_service.SrwService;
import gov.loc.www.zing.srw.srw_sample_service.SrwServiceLocator;

@SuppressWarnings("unused")
public class SrwSample {
    
    @SuppressWarnings("static-access")
    public static void main(String[] args) throws ServiceException, RemoteException {
        SrwService locator = new SrwServiceLocator();
        SrwPort port = locator.getSrwPort();
        SearchRetrieveRequestType request = new SearchRetrieveRequestType();
        request.setVersion("1.1");
        request.setQuery("title=\"足尾\"");
        request.setStartRecord(1);
        request.setMaximumRecords(10);
        request.setRecordPacking("xml");
        request.setResultSetTTL(300);

        SearchRetrieveResponseType result = port.searchRetrieve(request);
        System.out.println(result.getNumberOfRecords());
        System.out.println(result.getRecords()[0].getRecordData());

    }
    
}
