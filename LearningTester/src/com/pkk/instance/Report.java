package com.pkk.instance;

public class Report {

	private long instanceId;
	private String reportName;
	
	
	
	public Report(long instanceId, String reportName) {
		super();
		this.instanceId = instanceId;
		this.reportName = reportName;
	}
	public long getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(long instanceId) {
		this.instanceId = instanceId;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	
	
	
}
