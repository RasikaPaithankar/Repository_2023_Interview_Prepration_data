package org.rasika.aspectDemo.service;

import org.rasika.aspectDemo.model.Alto;
import org.rasika.aspectDemo.model.Nano;
import org.rasika.aspectDemo.model.Slavia;

public class CarService {

	private Nano nano;
	private Alto alto;
	private Slavia slavia;
	public Nano getNano() {
		return nano;
	}
	public void setNano(Nano nano) {
		this.nano = nano;
	}
	public Alto getAlto() {
		return alto;
	}
	public void setAlto(Alto alto) {
		this.alto = alto;
	}
	public Slavia getSlavia() {
		return slavia;
	}
	public void setSlavia(Slavia slavia) {
		this.slavia = slavia;
	}
	@Override
	public String toString() {
		return "CarService [nano=" + nano + ", alto=" + alto + ", slavia=" + slavia + "]";
	}
}
