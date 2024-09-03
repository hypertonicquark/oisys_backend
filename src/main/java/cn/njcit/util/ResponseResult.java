package cn.njcit.util;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class ResponseResult extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public ResponseResult() {
		this.put("code", 0);
	}

	public static ResponseResult create(boolean flag){
		return flag ? ok():error();
	}
	public static ResponseResult crate(int ret){
		return ret>0?ok():error();
	}
	
	public static ResponseResult error() {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
	}
	
	public static ResponseResult error(String msg) {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
	}
	
	public static ResponseResult error(int code, String msg) {
		ResponseResult r = new ResponseResult();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static ResponseResult ok(String msg) {
		ResponseResult r = new ResponseResult();
		r.put("msg", msg);
		return r;
	}
	
	public static ResponseResult ok(Map<String, Object> map) {
		ResponseResult r = new ResponseResult();
		r.putAll(map);
		return r;
	}
	
	public static ResponseResult ok() {
		return new ResponseResult();
	}

	public ResponseResult put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
