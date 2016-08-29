package persistent.prestige.platform.base.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回结果
 * 
 * @author dingwei2
 *
 */
public class ResponseResult implements Serializable {

	private String msg;

	/** 0:成功， 非0失败 */
	private Integer code;

	private Map data;

	public ResponseResult() {
	}

	public ResponseResult(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public void setCodeAndMsg(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getMsg() {
		return msg == null ? "" : msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Map getData() {
		return data == null ? (data = new HashMap()) : data;
	}

	public void setData(Map data) {
		this.data = data;
	}

}
