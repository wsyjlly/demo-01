package cn.wsyjlly.base;

import java.util.Arrays;

/**
 * @author wsyjlly
 * @create 2019.09.02 - 15:29
 **/
public class StaticStatement {


	public static void main(String[] args) {
		System.out.println("main...");
		System.out.println(VariablesDefault.STATICVAR);
//		new VariablesDefault();
		try {
			Class<?> aClass = Class.forName("cn.wsyjlly.base.VariablesDefault");
			aClass.newInstance();
			VariablesDefault variablesDefault = (VariablesDefault) aClass.newInstance();
			System.out.println("variablesDefault="+variablesDefault.getVar1());
			System.out.println(aClass.getName());
			System.out.println(aClass.getSimpleName());

			System.out.println(Arrays.toString(aClass.getMethods()));
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
	}
}
