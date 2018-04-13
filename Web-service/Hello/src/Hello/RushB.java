package Hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class RushB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RushB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: </br>").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		out.println();
		out.println("--RushB No Stop--</br>");
		
		String player1 = request.getParameter("Player1");
		String player2 = request.getParameter("Player2");
		String player3 = request.getParameter("Player3");
		String player4 = request.getParameter("Player4");
		String player5 = request.getParameter("Player5");
		out.println("Player1 : "+ player1 + "</br>");
		out.println("Player2 : "+ player2 + "</br>");
		out.println("Player3 : "+ player3 + "</br>");
		out.println("Player4 : "+ player4 + "</br>");
		out.println("Player5 : "+ player5 + "</br>");
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
