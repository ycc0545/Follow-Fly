package com.suixin.vy.model;

import java.io.Serializable;
import java.util.List;

public class BannerList implements Serializable{	private static final long serialVersionUID = 387609113L;	private String descInfo;	private String coverUrl;	private String content;	private long weight;	private String coverThumbUrl;	private long categoryId;	private String websiteCoverThumbUrl;	private String websiteCoverUrl;	private String title;	private long type;
	public String getDescInfo() {		return this.descInfo;	}
	public void setDescInfo(String descInfo) {		this.descInfo = descInfo;	}
	public String getCoverUrl() {		return this.coverUrl;	}
	public void setCoverUrl(String coverUrl) {		this.coverUrl = coverUrl;	}
	public String getContent() {		return this.content;	}
	public void setContent(String content) {		this.content = content;	}
	public long getWeight() {		return this.weight;	}
	public void setWeight(long weight) {		this.weight = weight;	}
	public String getCoverThumbUrl() {		return this.coverThumbUrl;	}
	public void setCoverThumbUrl(String coverThumbUrl) {		this.coverThumbUrl = coverThumbUrl;	}
	public long getCategoryId() {		return this.categoryId;	}
	public void setCategoryId(long categoryId) {		this.categoryId = categoryId;	}
	public String getWebsiteCoverThumbUrl() {		return this.websiteCoverThumbUrl;	}
	public void setWebsiteCoverThumbUrl(String websiteCoverThumbUrl) {		this.websiteCoverThumbUrl = websiteCoverThumbUrl;	}
	public String getWebsiteCoverUrl() {		return this.websiteCoverUrl;	}
	public void setWebsiteCoverUrl(String websiteCoverUrl) {		this.websiteCoverUrl = websiteCoverUrl;	}
	public String getTitle() {		return this.title;	}
	public void setTitle(String title) {		this.title = title;	}
	public long getType() {		return this.type;	}
	public void setType(long type) {		this.type = type;	}
	public BannerList() {}
	public BannerList(String descInfo, String coverUrl, String content, long weight, String coverThumbUrl, long categoryId, String websiteCoverThumbUrl, String websiteCoverUrl, String title, long type){
		super();		this.descInfo = descInfo;		this.coverUrl = coverUrl;		this.content = content;		this.weight = weight;		this.coverThumbUrl = coverThumbUrl;		this.categoryId = categoryId;		this.websiteCoverThumbUrl = websiteCoverThumbUrl;		this.websiteCoverUrl = websiteCoverUrl;		this.title = title;		this.type = type;
	}
	public String toString() {
		return "BannerList [descInfo = " + descInfo + ", coverUrl = " + coverUrl + ", content = " + content + ", weight = " + weight + ", coverThumbUrl = " + coverThumbUrl + ", categoryId = " + categoryId + ", websiteCoverThumbUrl = " + websiteCoverThumbUrl + ", websiteCoverUrl = " + websiteCoverUrl + ", title = " + title + ", type = " + type + "]";	}
}