package sg.com.Johji.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/top")
public class TopServlet extends CommonServlet {
	public static String version = System.getenv("HEROKU_RELEASE_VERSION");
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doProcess(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = "/WEB-INF/pages/top.jsp";
		fowardPage(path, req, res);
	}

}