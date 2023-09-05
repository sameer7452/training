package com.ey.adapter;

public class SpeedAdapter implements NItro {
	
	private Turbo car;
	
	

	public SpeedAdapter(Turbo car) {
		
		this.car=car;
	}



	@Override
	public double getSpeedKms() {
		
		return car.getSpeed()*1.6;
	}

}
