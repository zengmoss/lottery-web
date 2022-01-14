package com.mama100.lotteryweb.po;

import com.mama100.lotteryweb.util.Constant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Description:
 *
 * 出参基本参数
 *
 * @author Moss Zeng
 * @date 2017年10月20日上午9:21:59
 */
@ApiModel(value = "出参基本参数")
public class BaseRes {
	// 序列号
	@ApiModelProperty(value = "请求序列号")
	private String seqNo;
	// 返回编码
	@ApiModelProperty(value = "100代表成功，其它为错误")
	private String code = "100";
	// 返回描述
	@ApiModelProperty(value = "返回描述")
	private String desc = "成功";

	public String getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public BaseRes error(String desc) {
		return this.error(Constant.BUSINESS_ERROR, desc);
	}

	public BaseRes error(String code, String desc) {
		this.setCode(code);
		this.setDesc(desc);
		return this;
	}

	public boolean success() {
		return Constant.SUCCESS.equals(code);
	}
	public final static BaseRes buildError(String desc) {
		return buildError(Constant.BUSINESS_ERROR, desc);
	}

	public final static BaseRes buildError(String code, String desc) {
		return baseResBuilder().code(code).desc(desc).build();
	}

	public static BaseResBuilder baseResBuilder() {
		return new BaseResBuilder();
	}

	public static class BaseResBuilder {
		private BaseRes baseRes = new BaseRes();

		public BaseRes build() {
			return baseRes;
		}

		public BaseResBuilder seqNo(String seqNo) {
			baseRes.setSeqNo(seqNo);
			return this;
		}

		public BaseResBuilder code(String code) {
			baseRes.setCode(code);
			return this;
		}

		public BaseResBuilder desc(String desc) {
			baseRes.setDesc(desc);
			return this;
		}
	}

}
