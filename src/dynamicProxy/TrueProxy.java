package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TrueProxy implements InvocationHandler {

	@Override
	public Object invoke(Object obj, Method method, Object[] aobj) throws Throwable {
		System.out.println(method.getName());
		System.out.println();
		return "lalala";
	}

}
