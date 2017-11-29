package test;

import java.io.File;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class TestFilePath {
	public static void main(String[] args) throws Exception {

		System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));

		System.out.println(TestFilePath.class.getClassLoader().getResource(""));

		System.out.println(ClassLoader.getSystemResource(""));
		System.out.println(TestFilePath.class.getResource(""));
		System.out.println(TestFilePath.class.getResource("/")); // Class文件所在路径
		System.out.println(new File("/").getAbsolutePath());
		System.out.println(System.getProperty("user.dir"));
	}

}
