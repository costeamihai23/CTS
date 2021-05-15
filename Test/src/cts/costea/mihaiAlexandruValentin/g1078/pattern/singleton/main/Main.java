package cts.costea.mihaiAlexandruValentin.g1078.pattern.singleton.main;

import cts.costea.mihaiAlexandruValentin.g1078.pattern.singleton.API;
import cts.costea.mihaiAlexandruValentin.g1078.pattern.singleton.IRobotSoftware;

public class Main {

		public static void main(String[] args) {
			 IRobotSoftware robotSoftware = API.getInstance();

		        IRobotSoftware robotSoftware2 = API.getInstance();

		        if(robotSoftware == robotSoftware2){
		            System.out.println("Sunt la fel ");
		        }
		}
}
