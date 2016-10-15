/**
 * 
 */
package com.training2016.examples.submarine;

import java.lang.annotation.Documented;


@Documented
@interface Author {
	String author();
	String group();
	String created();
}


@Documented
@interface Warning {
	String message();
}


@Author(author="Alexandr",
		group="JavaTraining",
		created="12-10-2016")
public class AtomicSubmarine {
	private Engine engine;


	@Author(author="Alexandr",
			group="JavaTraining",
			created="12-10-2016")
	private class Engine {
		public final int POWER_MIN = 5;
		public final int POWER_FULL = 100;
		private boolean onEngine;
		private int power;

		public Engine() {
			this.onEngine = false;
			this.power = 0;
		}
		
		public void on() {
			if (!onEngine) this.onEngine = true;
			power = POWER_MIN;
			System.out.println("Engine on! Power " + power + "%");
		}
		
		public void off() {
			this.onEngine = false;
			power = 0;
			System.out.println("Engine off !");
		}
		
		public void addPower(int percent) {
			int power = getPower();
			power += percent;
			System.out.println("Added " + percent + "% power.");
			if (power >= POWER_FULL) {
				System.out.println("Attention! Power Full!");
				this.power = POWER_FULL;
			}
			else {
				System.out.println("Now power " + power + "%");
			}
		}

		public int getPower() {
			return power;
		}
	}

	public AtomicSubmarine() {
		engine = new Engine();
	}

	public void start() {
		engine.on();
		System.out.println("Submarine started!");
	}

	
	public void addPower(int percent) {
		engine.addPower(percent);
	}
	
	@Warning(message="Attention! Used this method in extremis.")
	public void fullForward() {
		engine.addPower(engine.POWER_FULL);
	}
	
	
	
	public void stop() {
		engine.off();
	}
		

	public static void main(String[] args) {
		AtomicSubmarine submarine = new AtomicSubmarine();
		submarine.start();
		submarine.addPower(20);
		submarine.fullForward();
		submarine.stop();
		

	}

}
