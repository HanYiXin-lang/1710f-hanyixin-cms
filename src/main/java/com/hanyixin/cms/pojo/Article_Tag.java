package com.hanyixin.cms.pojo;

public class Article_Tag {

	/** 文章Id **/
	private Integer aid;
	/** 标签Id **/
	private Integer tid;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Article_Tag [aid=" + aid + ", tid=" + tid + "]";
	}

}
