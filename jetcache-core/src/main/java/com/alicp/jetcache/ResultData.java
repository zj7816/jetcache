package com.alicp.jetcache;

/**
 * Created on 2017/5/2.
 *
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public class ResultData {
    private CacheResultCode resultCode;
    private String message;
    private Object data;

    public ResultData(Throwable e) {
        this.resultCode = CacheResultCode.FAIL;
        this.message = "Ex : " + e.getClass() + ", " + e.getMessage();
    }

    public ResultData(CacheResultCode resultCode, String message, Object data) {
        this.resultCode = resultCode;
        this.message = message;
        this.data = data;
    }

    public CacheResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(CacheResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
