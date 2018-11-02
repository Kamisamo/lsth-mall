package com.lsth.mall.entity;

import java.io.Serializable;
import java.util.Date;

public class TbHotWords implements Serializable {
    private Long id;

    private String category;

    private String name;

    private String url;

    private Byte search;

    private Date created;

    private Date updated;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public Byte getSearch() {
        return search;
    }

    public void setSearch(Byte search) {
        this.search = search;
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
        sb.append(", category=").append(category);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", search=").append(search);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append("]");
        return sb.toString();
    }
}