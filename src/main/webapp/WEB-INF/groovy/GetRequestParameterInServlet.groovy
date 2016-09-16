import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// https://examples.javacodegeeks.com/enterprise-java/servlet/get-request-parameter-in-servlet/
// https://examples.javacodegeeks.com/enterprise-java/servlet/get-all-request-parameters-in-servlet/
// servlet3.0 spec:http://stackoverflow.com/questions/2422468/how-to-upload-files-to-server-using-jsp-servlet/2424824#2424824
public class GetRequestParameterInServlet extends HttpServlet {

	private static final long serialVersionUID = -2128122335811219481L;

	public static void main(String[] args)
	{
		println "thats all folks";
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		handleRequest(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		handleRequest(req, res);
	}

	public void handleRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {

		PrintWriter out = res.getWriter();
		res.setContentType("text/plain");

		String paramName = "name";
		String paramValue = req.getParameter(paramName);

		out.write(paramName);
		out.write(" = ");
		out.write(paramValue);
		out.write("n");

		paramName = "UNKNOWN";
		paramValue = req.getParameter(paramName);

		if (paramValue==null) {
			out.write("Parameter " + paramName + " not found");
		}

		out.close();

	}

}