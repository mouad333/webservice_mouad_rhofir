package webservice;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import webservice.BanqueService;
import webservice.BanqueServicePortBindingStub;
import webservice.BanqueWS;
import webservice.BanqueWSLocator;
public class Client {

	public static void main(String[] args) throws ServiceException, RemoteException {
		BanqueService ws = new BanqueWSLocator().getBanqueServicePort();
        System.out.println(ws.convert(7600));
	}

}
