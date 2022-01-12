package com.mama100.lotteryweb.util;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * Description: O
 * 
 * @author Moss Zeng
 * @date 2017年10月19日下午3:25:34
 */
public class NumberUtil {
	private static String pattern = "yyMMddHHmmssSSS";
	private static DecimalFormat df = new DecimalFormat("#########0.00");

	/**
	 * 获取指定位数的随机数
	 * 
	 * @param size
	 *            int 位数
	 * @return 指定位数的随机数 long
	 */
	public static long getRandom(int size) {
		Double value = (Math.random() * Math.pow(10, size));
		return value.longValue();
	}

	public static String genSeqNo() {
		return DateFormatUtils.format(new Date(), pattern) + getRandom(4);
	}

	public static String genSeqNo(String code) {
		return (StringUtils.isNotBlank(code) ? code : Constant.EMPTY) + DateFormatUtils.format(new Date(), pattern)
				+ getRandom(4);
	}

	public static String formatNumber(Number value) {
		return df.format(value);
	}

	public static BigDecimal add(Number... numbers) {
		int length = numbers.length;
		switch (length) {
		case 0:
			return new BigDecimal(Constant.ZERO);
		case 1:
			return new BigDecimal(numbers[0].toString());
		default:
			BigDecimal sum = new BigDecimal(numbers[0].toString());
			for (int i = 1; i < length; i++) {
				sum = sum.add(new BigDecimal(numbers[i].toString()));
			}
			return sum;
		}
	}

	public static BigDecimal subtract(Number one, Number two) {
		return new BigDecimal(one.toString()).subtract(new BigDecimal(two.toString()));
	}

	public static BigDecimal multiply(Number... numbers) {
		int length = numbers.length;
		switch (length) {
		case 0:
			return new BigDecimal(Constant.ZERO);
		case 1:
			return new BigDecimal(numbers[0].toString());
		default:
			BigDecimal sum = new BigDecimal(numbers[0].toString());
			for (int i = 1; i < length; i++) {
				sum = sum.multiply(new BigDecimal(numbers[i].toString()));
			}
			return sum;
		}
	}

	public static BigDecimal divide(Number one, Number two) {
		return new BigDecimal(one.toString()).divide(new BigDecimal(two.toString()));
	}

}
