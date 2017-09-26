package com.drive.service.domain.common;

import com.drive.service.domain.response.Response;

public class CommonResponse {

	//响应结果
	private Result result;

	private Response date;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Response getDate() {
		return date;
	}

	public void setDate(Response date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CommonResponse{" + "result=" + result + ", date=" + date + '}';
	}
}
