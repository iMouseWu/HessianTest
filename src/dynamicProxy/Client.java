package dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		TrueProxy trueProxy = new TrueProxy();

		ProxyService a = (ProxyService) Proxy.newProxyInstance(ProxyService.class.getClassLoader(), new Class[] { ProxyService.class }, trueProxy);
		a.sayYes();
		a.sayHello();
	}
}
