package util;

import constant.CommmonConstant;
import exception.ParameterException;

public class FormatTransUtil {
	private static Integer newInteger = null;
	private static String newString = null;

	public static Integer transInteger(String str) throws ParameterException {
		try {
			if (StringUtil.isNull(str)) {
				newInteger = 0;
				
			} else {
				newInteger = Integer.valueOf(str);
			}
			
		} catch (Exception e) {
			throw new ParameterException(CommmonConstant.TRANSFORM_IS_WRONG);
		}
		return newInteger;
	}

	public static String transString(Integer integer) {
		try {

			newString = String.valueOf(integer);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return newString;
	}

	public static String transKeyWord(String str) {
		if (StringUtil.isNull(str)) {
			str = "%%";
		} else {
			str = "%" + str + "%";
		}
		return str;
	}

	public static String transSql(String str) {
		if (StringUtil.isNull(str)) {
			str = CommmonConstant.GENE;
		}
		str = "SELECT * FROM asthma WHERE " + str + " LIKE ?" + " ORDER BY id LIMIT ?,?";
		return str;
	}
}
