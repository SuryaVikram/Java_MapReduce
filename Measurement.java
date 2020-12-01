package assignment1;

import java.io.Serializable;

public class Measurement implements Serializable {

	int time;
	double temperature;
	private static long serialVersionUID=1L;

	Measurement(int time, double temperature) {
		this.time = time;
		this.temperature = temperature;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

}
