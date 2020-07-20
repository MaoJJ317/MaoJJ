package com.xiaoshu.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class GoodsVo extends Goods {

	private String typename;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endtime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date starttime;

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}
}
