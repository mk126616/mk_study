package com.entity;

public class PaymentEntity
{
    private int id;

    /**
     * 订单号
     */
    private String serialNo;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getSerialNo()
    {
        return serialNo;
    }

    public void setSerialNo(String serialNo)
    {
        this.serialNo = serialNo;
    }
}
