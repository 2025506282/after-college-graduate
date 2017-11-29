package util;

public class StringUtil {
	public static boolean isNull(String str) {
		if (str == null || str.equals("") || str.equals("null")) {
			return true;
		} else {
			return false;
		}
	}

}
