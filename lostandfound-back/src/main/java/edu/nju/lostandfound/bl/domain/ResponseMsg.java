package edu.nju.lostandfound.bl.domain;
import java.io.Serializable;


/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/8/2 9:37
 * @Description Json请求响应数据
 */



public class ResponseMsg implements Serializable{

    public static final Boolean STATUS_SUCCESS = true;  //成功
    public static final Boolean STATUS_FAILED = false;	//失败

    /**状态编码*/
    private Boolean success=true;
    /**返回消息*/
    private String errorCode;
    /**返回数据*/
    private Object data;
    /**返回信息*/
    private String msg = "请求接口成功";

    public ResponseMsg() {
    }
    public ResponseMsg(Object data) {
        setData(data);
    }

    public ResponseMsg(Boolean success, String errorCode){
        setSuccess(success);
        setErrorCode(errorCode);
    }

    public ResponseMsg(Object data, Boolean success) {
        setData(data);
        setSuccess(success);
    }

    public void failed(String errorCode, String msg)
    {
        this.setSuccess(STATUS_FAILED);
        this.setErrorCode(errorCode);
        this.setMsg(msg);
    }

    public void succeeded(String errorCode, String msg)
    {
        this.setSuccess(STATUS_SUCCESS);
        this.setErrorCode(errorCode);
        this.setMsg(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }



}
