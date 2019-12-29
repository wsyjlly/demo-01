package cn.wsyjlly.base;

/**
 * @author wsyjlly
 * @create 2019.09.02 - 15:34
 * 一个类的运行分为以下步骤：
 *
	装载
	连接
	初始化

	其中装载阶段又三个基本动作组成：
	通过类型的完全限定名，产生一个代表该类型的二进制数据流
	解析这个二进制数据流为方法区内的内部数据结构
	创建一个表示该类型的java.lang.Class类的实例
		另外如果一个类装载器在预先装载的时遇到缺失或错误的class文件，
		它需要等到程序首次主动使用该类时才报告错误。



	连接阶段又分为三部分：
	验证，确认类型符合Java语言的语义，检查各个类之间的二进制兼容性(比如final的类不用拥有子类等)，另外还需要进行符号引用的验证。
	准备，Java虚拟机为类变量分配内存，设置默认初始值。
	解析(可选的) ，在类型的常量池中寻找类，接口，字段和方法的符号引用，把这些符号引用替换成直接引用的过程。



	当一个类被主动使用时，Java虚拟就会对其初始化，如下六种情况为主动使用：
	当创建某个类的新实例时（如通过new或者反射，克隆，反序列化等）
	当调用某个类的静态方法时
	当使用某个类或接口的静态字段时
	当调用Java API中的某些反射方法时，比如类Class中的方法，或者java.lang.reflect中的类的方法时
	当初始化某个子类时
	当虚拟机启动某个被标明为启动类的类（即包含main方法的那个类）

	Java编译器会收集所有的类变量初始化语句和类型的静态初始化器，将这些放到一个特殊的方法中：clinit。
 **/
public class VariablesDefault {
	public static int STATICVAR;
	private Byte var1 = 1;
	private Short var2;
	private Integer var3;
	private Long var4;
	private Float var5;
	private Double var6;
	private Character var7;
	private Boolean var8;
	private byte var11;
	private short var22;
	private int var33;
	private long var44;
	private float var55;
	private double var66;
	private char var77;
	private boolean var88;

	/*
	 * 实例代码块
	 * */
	{
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var11);
		System.out.println(var22);
		System.out.println(var33);
		System.out.println(var44);
		System.out.println(var55);
		System.out.println(var66);
		System.out.println(var77);
		System.out.println(var88);
	}

	/*
	 * 静态代码块
	 * 静态代码块的执行时机：
	 * */
	static {
		System.out.println("VariablesDefault...static...");
	}


	public Byte getVar1() {
		return var1;
	}

	public void setVar1(Byte var1) {
		this.var1 = var1;
	}

	public Short getVar2() {
		return var2;
	}

	public void setVar2(Short var2) {
		this.var2 = var2;
	}

	public Integer getVar3() {
		return var3;
	}

	public void setVar3(Integer var3) {
		this.var3 = var3;
	}

	public Long getVar4() {
		return var4;
	}

	public void setVar4(Long var4) {
		this.var4 = var4;
	}

	public Float getVar5() {
		return var5;
	}

	public void setVar5(Float var5) {
		this.var5 = var5;
	}

	public Double getVar6() {
		return var6;
	}

	public void setVar6(Double var6) {
		this.var6 = var6;
	}

	public Character getVar7() {
		return var7;
	}

	public void setVar7(Character var7) {
		this.var7 = var7;
	}

	public Boolean getVar8() {
		return var8;
	}

	public void setVar8(Boolean var8) {
		this.var8 = var8;
	}

	public byte getVar11() {
		return var11;
	}

	public void setVar11(byte var11) {
		this.var11 = var11;
	}

	public short getVar22() {
		return var22;
	}

	public void setVar22(short var22) {
		this.var22 = var22;
	}

	public int getVar33() {
		return var33;
	}

	public void setVar33(int var33) {
		this.var33 = var33;
	}

	public long getVar44() {
		return var44;
	}

	public void setVar44(long var44) {
		this.var44 = var44;
	}

	public float getVar55() {
		return var55;
	}

	public void setVar55(float var55) {
		this.var55 = var55;
	}

	public double getVar66() {
		return var66;
	}

	public void setVar66(double var66) {
		this.var66 = var66;
	}

	public char getVar77() {
		return var77;
	}

	public void setVar77(char var77) {
		this.var77 = var77;
	}

	public boolean isVar88() {
		return var88;
	}

	public void setVar88(boolean var88) {
		this.var88 = var88;
	}
}
