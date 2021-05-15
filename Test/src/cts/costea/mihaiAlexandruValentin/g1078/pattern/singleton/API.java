package cts.costea.mihaiAlexandruValentin.g1078.pattern.singleton;


public class API implements IRobotSoftware {

    private int id;

    private static API robotSoftware;


    private API(int id){
        this.id = id;
    }

    public static synchronized API getInstance()
    {
        if (robotSoftware == null)
        {
            int id = (int) Math.random();
            robotSoftware = new API(id);
        }
        return robotSoftware;
    }



    @Override
    public void trimiteCerere(String denumire) {
        System.out.println("Cerere " + denumire + " trimisa");
    }

    @Override
    public String getInformatii(String categorie) {
        return "Secretariat indisponibil";
    }

    @Override
    public void prelucrareCerere(String tip) {
        System.out.println("Cerere " + tip  + " prelucrata");
    }

    @Override
    public int getIdRobot() {
        return this.id;
    }
}
