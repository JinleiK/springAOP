package com.jinlei.spring.test.springAOP.app;

public interface ICamera {

	//@Deprecated
	public abstract void snap() throws Exception;

	public abstract void snap(int exposure);

	public abstract void snap(String name);

	public abstract void snapNightTime();

	public abstract void snapCar(Car car);

	public abstract void snap(int i, double d);

}