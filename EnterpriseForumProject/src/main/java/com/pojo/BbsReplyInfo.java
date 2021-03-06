package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Date;

@TableName("bbs_reply_info")
public class BbsReplyInfo  {
	@TableId(type = IdType.AUTO)
	private Integer rId;
	private Integer rTId;
	private Integer rSId;
	private Integer rUId;
	private String rTopic;
	private String rContents;
	private Date rPublishTime;
	private Date rModifyTime;

	public Integer getRId() {
		return rId;
	}

	public void setRId(Integer rId) {
		this.rId = rId;
	}

	public Integer getRTId() {
		return rTId;
	}

	public void setRTId(Integer rTId) {
		this.rTId = rTId;
	}

	public Integer getRSId() {
		return rSId;
	}

	public void setRSId(Integer rSId) {
		this.rSId = rSId;
	}

	public Integer getRUId() {
		return rUId;
	}

	public void setRUId(Integer rUId) {
		this.rUId = rUId;
	}

	public String getRTopic() {
		return rTopic;
	}

	public void setRTopic(String rTopic) {
		this.rTopic = rTopic;
	}

	public String getRContents() {
		return rContents;
	}

	public void setRContents(String rContents) {
		this.rContents = rContents;
	}

	public Date getRPublishTime() {
		return rPublishTime;
	}

	public void setRPublishTime(Date rPublishTime) {
		this.rPublishTime = rPublishTime;
	}

	public Date getRModifyTime() {
		return rModifyTime;
	}

	public void setRModifyTime(Date rModifyTime) {
		this.rModifyTime = rModifyTime;
	}

	@Override
	public String toString() {
		return "BbsReplyInfo{" +
				"rId=" + rId +
				", rTId=" + rTId +
				", rSId=" + rSId +
				", rUId=" + rUId +
				", rTopic='" + rTopic + '\'' +
				", rContents='" + rContents + '\'' +
				", rPublishTime=" + rPublishTime +
				", rModifyTime=" + rModifyTime +
				'}';
	}
}