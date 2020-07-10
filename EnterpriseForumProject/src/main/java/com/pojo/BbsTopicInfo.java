package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Date;
import java.sql.Timestamp;

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
	private Timestamp tPublishTime;
	private Timestamp tModifyTime;

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

	public Timestamp getTPublishTime() {
		return tPublishTime;
	}

	public void setTPublishTime(Timestamp tPublishTime) {
		this.tPublishTime = tPublishTime;
	}

	public Timestamp getTModifyTime() {
		return tModifyTime;
	}

	public void setTModifyTime(Timestamp tModifyTime) {
		this.tModifyTime = tModifyTime;
	}

}