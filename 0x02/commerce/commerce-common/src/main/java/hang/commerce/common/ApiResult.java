package hang.commerce.common;

/**
 * API返回值对象
 * @param <T> 返回的数据类型
 */
public class ApiResult<T> {

	/**
	 * 状态码
	 */
	private ApiResultCode code;

	/**
	 * 返回的消息字符串
	 */
	private String message;

	/**
	 * 返回的数据
	 */
	private T data;

	/**
	 * 异常名称
	 */
	private String exception;

	/**
	 * 访问路径
	 */
	private String path;

	public ApiResultCode getCode() {
		return code;
	}

	public void setCode(ApiResultCode code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
