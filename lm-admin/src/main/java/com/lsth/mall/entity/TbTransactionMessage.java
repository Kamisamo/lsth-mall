package com.lsth.mall.entity;

import java.io.Serializable;
import java.util.Date;

public class TbTransactionMessage implements Serializable {
    private String id;

    private Integer version;

    private String editor;

    private String creater;

    private Date editTime;

    private Date createTime;

    private String messageId;

    private String messageDataType;

    private String consumerQueue;

    private Short messageSendTimes;

    private String areadlyDead;

    private String status;

    private String remark;

    private String field1;

    private String field2;

    private String field3;

    private String messageBody;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageDataType() {
        return messageDataType;
    }

    public void setMessageDataType(String messageDataType) {
        this.messageDataType = messageDataType;
    }

    public String getConsumerQueue() {
        return consumerQueue;
    }

    public void setConsumerQueue(String consumerQueue) {
        this.consumerQueue = consumerQueue;
    }

    public Short getMessageSendTimes() {
        return messageSendTimes;
    }

    public void setMessageSendTimes(Short messageSendTimes) {
        this.messageSendTimes = messageSendTimes;
    }

    public String getAreadlyDead() {
        return areadlyDead;
    }

    public void setAreadlyDead(String areadlyDead) {
        this.areadlyDead = areadlyDead;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", editor=").append(editor);
        sb.append(", creater=").append(creater);
        sb.append(", editTime=").append(editTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", messageId=").append(messageId);
        sb.append(", messageDataType=").append(messageDataType);
        sb.append(", consumerQueue=").append(consumerQueue);
        sb.append(", messageSendTimes=").append(messageSendTimes);
        sb.append(", areadlyDead=").append(areadlyDead);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", messageBody=").append(messageBody);
        sb.append("]");
        return sb.toString();
    }
}