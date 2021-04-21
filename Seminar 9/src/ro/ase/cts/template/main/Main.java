package ro.ase.cts.template.main;
import ro.ase.cts.template.MasaInBar;
import ro.ase.cts.template.TemplateOcupareMasa;
import ro.ase.cts.template.OcupareMasa;
public class Main {
	
	public static void main(String[] args) {
		TemplateOcupareMasa masa=new OcupareMasa(22);
		masa.ocupaMasa();
		TemplateOcupareMasa masa2=new MasaInBar(25);
		masa.aseazaTacamuri();
		
		
	}
}
