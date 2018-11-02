package com.lsth.mall.entity;

import java.io.Serializable;
import java.util.Date;

public class TbCategoryImage implements Serializable {
    private Long id;

    private String cid;

    private String name;

    private String url;

    private Integer littleOrBig;

    private Integer status;

    private String imageUrl;

    private Integer sortOrder;

    private Date created;

    private Date updated;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLittleOrBig() {
        return littleOrBig;
    }

    public void setLittleOrBig(Integer littleOrBig) {
        this.littleOrBig = littleOrBig;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cid=").append(cid);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", littleOrBig=").append(littleOrBig);
        sb.append(", status=").append(status);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append("]");
        return sb.toString();
    }
}