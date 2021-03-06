package com.hiveview.entity.recommend;

import java.sql.Timestamp;

public class SubjectContent{
	
	//columns START
	private Integer seq;
	private Long subjectId;
	private Long contentId;
	private String contentName;
	private Integer contentType;
	private String contentDesc;
	private Timestamp createdTime;
	private Timestamp updatedTime;
	private Long isEffective;
	private String contentImg;
	private String videosetImg;
	private String videosetTvImg;
	//columns END
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public Long getContentId() {
		return contentId;
	}
	public void setContentId(Long contentId) {
		this.contentId = contentId;
	}
	public String getContentName() {
		return contentName;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	public Integer getContentType() {
		return contentType;
	}
	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}
	public String getContentDesc() {
		return contentDesc;
	}
	public void setContentDesc(String contentDesc) {
		this.contentDesc = contentDesc;
	}
	public Timestamp getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}
	public Timestamp getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}
	public Long getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Long isEffective) {
		this.isEffective = isEffective;
	}
	public String getContentImg() {
		return contentImg;
	}
	public void setContentImg(String contentImg) {
		this.contentImg = contentImg;
	}
	public String getVideosetImg() {
		return videosetImg;
	}
	public void setVideosetImg(String videosetImg) {
		this.videosetImg = videosetImg;
	}
	public String getVideosetTvImg() {
		return videosetTvImg;
	}
	public void setVideosetTvImg(String videosetTvImg) {
		this.videosetTvImg = videosetTvImg;
	}
	
}

