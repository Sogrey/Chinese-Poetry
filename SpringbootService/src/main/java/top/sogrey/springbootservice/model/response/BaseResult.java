package top.sogrey.springbootservice.model.response;

/**
 * 请求响应基类
 * @author Sogrey
 *
 */
public class BaseResult {
	/*
	 * 0 成功 1失敗
	 */
	private int code = 0; 
	/**
	 * 失敗原因
	 */
	private String message = "";

	public BaseResult(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "BaseResult [code=" + code + ", message=" + message + "]";
	}
}
