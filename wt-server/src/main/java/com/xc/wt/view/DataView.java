package com.xc.wt.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.View;

import com.google.gson.Gson;

public class DataView implements View {

	@Override
	public String getContentType() {
		return "application/json";
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.getWriter().write(new Gson().toJson(model));
	}

}
