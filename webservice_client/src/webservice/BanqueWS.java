package webservice;


public interface BanqueWS extends javax.xml.rpc.Service {
    public java.lang.String getBanqueServicePortAddress();

    public webservice.BanqueService getBanqueServicePort() throws javax.xml.rpc.ServiceException;

    public webservice.BanqueService getBanqueServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}