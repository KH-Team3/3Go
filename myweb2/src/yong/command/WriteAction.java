package yong.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WriteAction implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String result="command pattern을 적용한 글쓰기 기능";
		req.setAttribute("result", result);
		return "/write.jsp";
	}
}
