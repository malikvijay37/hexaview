package vijay;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@WebServlet
@Controller
@RequestMapping("/")
public class MyServlet extends HttpServlet{

	@RequestMapping(value="url3", method=  RequestMethod.GET)
	public String process() {
		return "this is my servlet";
	}
	@RequestMapping(value="url1",method=  RequestMethod.GET)
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().println("My name is vijay");
	}
	
	@RequestMapping(value="url2",method=  RequestMethod.POST)
	@Override
	protected void doPost(HttpServletRequest reqest, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().println("My name is madhur");
	}
}
