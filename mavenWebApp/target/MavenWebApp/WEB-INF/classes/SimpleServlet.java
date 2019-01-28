

	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import org.springframework.stereotype.*;
    import org.springframework.web.bind.annotation.*;
    
	
	@Controller
	public class SimpleServlet extends HttpServlet{
		private static final long serialversion=1L;
	
		@RequestMapping("/hello")
		protected void doGet(HttpServletRequest req,HttpServletResponse rep)
						throws ServletException,IOException{
			rep.setContentType("text/plain");
			rep.getWriter().write("Hello World! Maven app Project");
		}

	}


