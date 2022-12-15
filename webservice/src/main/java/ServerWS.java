import jakarta.xml.ws.Endpoint;
import webservice.BanqueService;

public class ServerWS {

	public static void main(String[] args) {
	  //0.0.0.0 quelque soit l'adr ip
      Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
	  System.out.println("web service déployé sur l'adr : http://0.0.0.0:9191/");
	}

}
