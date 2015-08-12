package com.jinlei.spring.test.springAOP.app;

import org.springframework.stereotype.Component;

@Component("camera")
public class Camera implements ICamera {
	
	//@Deprecated
	/* (non-Javadoc)
	 * @see com.jinlei.spring.test.springAOP.app.ICamera#snap()
	 */
	@Override
	public void snap() throws Exception {
		System.out.println("snap");
		throw new Exception("bye bye!");
	}
	
	/* (non-Javadoc)
	 * @see com.jinlei.spring.test.springAOP.app.ICamera#snap(int)
	 */
	@Override
	public void snap(int exposure) {
		System.out.println("snap! exposure: " + exposure);
	}
	
	public void snap(int exposure, double aperture) {
		System.out.println("snap! exposure: " + exposure + ", aperture: " + aperture);
	}
	
	/* (non-Javadoc)
	 * @see com.jinlei.spring.test.springAOP.app.ICamera#snap(java.lang.String)
	 */
	@Override
	public void snap(String name) {
		System.out.println("snap! name: " + name);
	}

	/* (non-Javadoc)
	 * @see com.jinlei.spring.test.springAOP.app.ICamera#snapNightTime()
	 */
	@Override
	public void snapNightTime() {
		// TODO Auto-generated method stub
		System.out.println("night time");
	}
	
	
	/* (non-Javadoc)
	 * @see com.jinlei.spring.test.springAOP.app.ICamera#snapCar(com.jinlei.spring.test.springAOP.app.Car)
	 */
	@Override
	public void snapCar(Car car) {
		System.out.println("snapping car!");
	}
}
