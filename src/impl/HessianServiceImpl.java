package impl;

import service.HessianService;
import domain.TestDO;

public class HessianServiceImpl implements HessianService {

	@Override
	public String doSomeThing() {
		return "服务端成功啦";
	}

	@Override
	public TestDO doOtherThing() {
		TestDO a = new TestDO();
		return a;
	}

}
