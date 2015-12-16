package com.xc.wt.view;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.View;

import com.google.gson.Gson;

/***/
public class DataView implements View {
	/** @return "application/json" */
	@Override
	public String getContentType() {
		return "application/json";
	}

	/** renders model.data to response */
	@Override
	public void render(final Map<String, ?> model,
			final HttpServletRequest request, final HttpServletResponse response)
			throws IOException {
		response.getWriter().write(new Gson().toJson(model.get("data")));
	}

}
