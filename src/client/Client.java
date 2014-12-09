package client;

import service.HessianService;

import com.caucho.hessian.client.HessianProxyFactory;

import domain.TestDO;

public class Client {

	public static void main(String[] args) throws Exception {
		String url = "http://127.0.0.1:8080/HessianTest/test";

		HessianProxyFactory factory = new HessianProxyFactory();
		HessianService basic = (HessianService) factory.create(HessianService.class, url);
		TestDO testDO = basic.doOtherThing();

		System.out.println(testDO.getUserName());
	}

}
