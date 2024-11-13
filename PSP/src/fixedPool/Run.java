package fixedPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

	public static void main(String[] args) {
		Lanzabolas lan1 = new Lanzabolas("Herrero");
		Lanzabolas lan2 = new Lanzabolas("Javi");
		Lanzabolas lan3 = new Lanzabolas("Josemanue");
		
		ExecutorService a = Executors.newFixedThreadPool(1);
		ExecutorService b = Executors.newFixedThreadPool(3);
		ExecutorService c = Executors.newFixedThreadPool(6);
		
		//a
		
		b.execute(lan1);
		b.execute(lan2);
		b.execute(lan3);
		
		//b
		
		a.execute(lan1);
		a.execute(lan2);
		a.execute(lan3);
		
		c.execute(lan1);
		c.execute(lan2);
		c.execute(lan3);
		
		
		
	}

}
