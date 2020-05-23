package org.allVehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	
	public void VehicleNecessery() {
		System.out.println("Vehicle Running");
	}
	
	public static void main (String [] args) {
		
		Vehicle v = new Vehicle();
			v.VehicleNecessery();
		TwoWheeler t = new TwoWheeler();
			t.Bike();
			t.cycle();
		ThreeWheeler w = new ThreeWheeler();
			w.Auto();
		FourWheeler f = new FourWheeler();
			f.car();
			f.lorry();
			f.bus();
	}
}
