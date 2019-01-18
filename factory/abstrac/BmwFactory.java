package factory.abstrac;

import factory.Bmw;
import factory.Car;
/**
 * 专门生产奥迪的工厂
 * @author Pop酱
 *
 */
public class BmwFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}
