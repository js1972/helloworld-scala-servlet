import javax.servlet.http._
import javax.servlet.annotation.WebServlet


/**
 * From https://github.com/schmmd/helloworld-scala-servlet/
 * When running with embedded Tomcat or Jetty we must have a web.xml even though
 * its not needed when using servlet 3.0 annotations.
 */
@WebServlet(urlPatterns = Array("/*"))
class HelloWorld extends HttpServlet {
	override def doGet(req: HttpServletRequest, resp: HttpServletResponse) =
		resp.getWriter().print("Hello World!")
}
