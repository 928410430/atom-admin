package com.atom.mvc.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSyslog<M extends BaseSyslog<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.String getId() {
		return get("id");
	}

	public M setIp(java.lang.String ip) {
		set("ip", ip);
		return (M)this;
	}

	public java.lang.String getIp() {
		return get("ip");
	}

	public M setStarttime(java.util.Date starttime) {
		set("starttime", starttime);
		return (M)this;
	}

	public java.util.Date getStarttime() {
		return get("starttime");
	}

	public M setEndtime(java.util.Date endtime) {
		set("endtime", endtime);
		return (M)this;
	}

	public java.util.Date getEndtime() {
		return get("endtime");
	}

	public M setCookie(java.lang.String cookie) {
		set("cookie", cookie);
		return (M)this;
	}

	public java.lang.String getCookie() {
		return get("cookie");
	}

	public M setToken(java.lang.String token) {
		set("token", token);
		return (M)this;
	}

	public java.lang.String getToken() {
		return get("token");
	}

	public M setMethod(java.lang.String method) {
		set("method", method);
		return (M)this;
	}

	public java.lang.String getMethod() {
		return get("method");
	}

	public M setUrl(java.lang.String url) {
		set("url", url);
		return (M)this;
	}

	public java.lang.String getUrl() {
		return get("url");
	}

	public M setAction(java.lang.String action) {
		set("action", action);
		return (M)this;
	}

	public java.lang.String getAction() {
		return get("action");
	}

	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public M setUseragent(java.lang.String useragent) {
		set("useragent", useragent);
		return (M)this;
	}

	public java.lang.String getUseragent() {
		return get("useragent");
	}

	public M setOptid(java.lang.Integer optid) {
		set("optid", optid);
		return (M)this;
	}

	public java.lang.Integer getOptid() {
		return get("optid");
	}

	public M setUserid(java.lang.Integer userid) {
		set("userid", userid);
		return (M)this;
	}

	public java.lang.Integer getUserid() {
		return get("userid");
	}

	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	public java.lang.String getContent() {
		return get("content");
	}

	public M setResponse(java.lang.String response) {
		set("response", response);
		return (M)this;
	}

	public java.lang.String getResponse() {
		return get("response");
	}

	public M setTrcode(java.lang.String trcode) {
		set("trcode", trcode);
		return (M)this;
	}

	public java.lang.String getTrcode() {
		return get("trcode");
	}

	public M setErrorCode(java.lang.String errorCode) {
		set("error_code", errorCode);
		return (M)this;
	}

	public java.lang.String getErrorCode() {
		return get("error_code");
	}

	public M setTrdate(java.util.Date trdate) {
		set("trdate", trdate);
		return (M)this;
	}

	public java.util.Date getTrdate() {
		return get("trdate");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

}