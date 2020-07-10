package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Date;

@TableName("bbs_section_info")
public class BbsSectionInfo  {
	@TableId(type = IdType.AUTO)
	private Integer sId;
	private String sName;
	private Integer sTopicCount;
	private Integer sMasterId;
	private Integer sParentId;

	public Integer getSId() {
		return sId;
	}

	public void setSId(Integer sId) {
		this.sId = sId;
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String sName) {
		this.sName = sName;
	}

	public Integer getSTopicCount() {
		return sTopicCount;
	}

	public void setSTopicCount(Integer sTopicCount) {
		this.sTopicCount = sTopicCount;
	}

	public Integer getSMasterId() {
		return sMasterId;
	}

	public void setSMasterId(Integer sMasterId) {
		this.sMasterId = sMasterId;
	}

	public Integer getSParentId() {
		return sParentId;
	}

	public void setSParentId(Integer sParentId) {
		this.sParentId = sParentId;
	}

}