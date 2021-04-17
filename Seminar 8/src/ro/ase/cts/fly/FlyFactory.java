package ro.ase.cts.fly;
import java.util.HashMap;
public class FlyFactory {
	private HashMap<String, Client> map;
	
	public FlyFactory(){
		this.map=new HashMap<>();
	}
	public Client getClient(String nrTelefon) {
		Client client = map.get(nrTelefon);
		if (client != null) {
			return client;
		}
		else {
			Client clientNou = new Client("Andrei", nrTelefon, "andrei@gmail.com");
			this.map.put(nrTelefon, clientNou);
			return clientNou;
		}
	}}

