package com.entity;

public class Result<T>
{
    private String code;
    private String message;
    private T data;

    public Result()
    {
    }

    private Result(ResultCode resultCode,T data)
    {
        this.data = data;
        this.code = resultCode.getCode();
        this.message = resultCode.getMsg();
    }
    public Result(String code, String message, T data)
    {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public static Result success(Object data){
        return new Result(ResultCode.SUCCESS, data);
    }
    public static Result error(){
        return new Result(ResultCode.ERROR, null);
    }
    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
    public enum ResultCode{
        SUCCESS("200","访问成功"),
        ERROR("444","访问失败");


        private String code;
        private String msg;

        ResultCode(String code, String msg)
        {
            this.code = code;
            this.msg = msg;
        }

        public String getCode()
        {
            return code;
        }
        public String getMsg()
        {
            return msg;
        }

    }
}
