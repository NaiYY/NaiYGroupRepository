package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Date;

@TableName("bbs_topic_info")
public class BbsTopicInfo  {
	@TableId(type = IdType.AUTO)
	private Integer tId;
	private Integer tSId;
	private Integer tUId;
	private String tTopic;
	private String tContents;
	private Integer tReplyCount;
	private Integer tClickCount;
	private Date tPublishTime;
	private Date tModifyTime;

	public Integer getTId() {
		return tId;
	}

	public void setTId(Integer tId) {
		this.tId = tId;
	}

	public Integer getTSId() {
		return tSId;
	}

	public void setTSId(Integer tSId) {
		this.tSId = tSId;
	}

	public Integer getTUId() {
		return tUId;
	}

	public void setTUId(Integer tUId) {
		this.tUId = tUId;
	}

	public String getTTopic() {
		return tTopic;
	}

	public void setTTopic(String tTopic) {
		this.tTopic = tTopic;
	}

	public String getTContents() {
		return tContents;
	}

	public void setTContents(String tContents) {
		this.tContents = tContents;
	}

	public Integer getTReplyCount() {
		return tReplyCount;
	}

	public void setTReplyCount(Integer tReplyCount) {
		this.tReplyCount = tReplyCount;
	}

	public Integer getTClickCount() {
		return tClickCount;
	}

	public void setTClickCount(Integer tClickCount) {
		this.tClickCount = tClickCount;
	}

	public Date getTPublishTime() {
		return tPublishTime;
	}

	public void setTPublishTime(Date tPublishTime) {
		this.tPublishTime = tPublishTime;
	}

	public Date getTModifyTime() {
		return tModifyTime;
	}

	public void setTModifyTime(Date tModifyTime) {
		this.tModifyTime = tModifyTime;
	}

	@Override
	public String toString() {
		return "BbsTopicInfo{" +
				"tId=" + tId +
				", tSId=" + tSId +
				", tUId=" + tUId +
				", tTopic='" + tTopic + '\'' +
				", tContents='" + tContents + '\'' +
				", tReplyCount=" + tReplyCount +
				", tClickCount=" + tClickCount +
				", tPublishTime=" + tPublishTime +
				", tModifyTime=" + tModifyTime +
				'}';
	}
}