package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddtionServlet01")
public class AddtionServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
/*
 * <html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Test.jsp</h1>
</body>
</html>       
 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 10;
		int num2 = 20;
		int add = num1 + num2;
		
		System.out.println("합 : " + add);
		
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		out.println(num1 + " + " + num2 + " = " + add);
		out.println("<br><b style='color: red'>hello<b>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
