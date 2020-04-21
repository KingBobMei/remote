package com.mei.hermes.message;
/*
 * 响应类
 * @author Mei
 */
public class Response<T> {

	private boolean status;
	
	private String code;
	
	private String message;
	
	private T data;
	
	/*
	 * 服务调用成功状态码
	 */
	private static final boolean STATUS_TRUE = true;
	/*
	 * 服务调用失败状态码
	 */
	private static final boolean STATUS_FALSE = false;
	/*
	 * 服务调用成功默认的CODE
	 */
	private static final String SUCCESS_CODE = "2000";
	/*
	 * 服务调用失败默认的CODE
	 */
	private static final String ERROR_CODE = "-1001";
	/*
	 * 服务调用成功默认的MSG
	 */
	private static final String SUCCESS_MSG = "success";
	
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
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

	@Override
	public String toString() {
		return "Response [status=" + status + ", code=" + code + ", message=" + message + ", data=" + data + "]";
	}
	
	public Response() {

    }

    private Response(boolean status, String code, String message, T data) {
        this.setStatus(status);
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    public static <T> Response<T> success() {
        return new Response<T>(STATUS_TRUE, SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static <T> Response<T> success(String message) {
        return new Response<T>(STATUS_TRUE, SUCCESS_CODE, SUCCESS_MSG, (T) message);
    }

    public static <T> Response<T> success(T data) {
        return new Response<T>(STATUS_TRUE, SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static <T> Response<T> success(String message, T data) {
        return new Response<T>(STATUS_TRUE, SUCCESS_CODE, message, data);
    }

    public static <T> Response<T> success(String code, String message, T data) {
        return new Response<T>(STATUS_TRUE, code, message, data);
    }

    public static <T> Response<T> success(String code, String message) {
        return new Response<T>(STATUS_TRUE, code, message, null);
    }

    public static <T> Response<T> error() {
        return new Response<T>(STATUS_FALSE, ERROR_CODE, null, null);
    }
    
    public static <T> Response<T> error(String message) {
        return new Response<T>(STATUS_FALSE, ERROR_CODE, message, null);
    }

    public static <T> Response<T> error(String message, T data) {
        return new Response<T>(STATUS_FALSE, ERROR_CODE, message, data);
    }

    public static <T> Response<T> error(String code, String message, T data) {
        return new Response<T>(STATUS_FALSE, code, message, data);
    }

    public static <T> Response<T> error(String code, String message) {
        return new Response<T>(STATUS_FALSE, code, message, null);
    }
	
}
