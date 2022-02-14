package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import GPU.GPU;
import crud.Lab2CrudInterface;

/**
 * Servlet implementation class GPUServlet1
 */
public class GPUServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfigInterface servletConfig; 
    Lab2CrudInterface lab2Crud;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GPUServlet1() {
        super();
        // TODO Auto-generated constructor stub
        this.servletConfig=new ServletConfig();
        this.lab2Crud=servletConfig.getCrud();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		out.println("["+lab2Crud.readGPU()+"]");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		int price = Integer.parseInt(request.getParameter("price"));
		float width = Float.parseFloat(request.getParameter("width"));
		lab2Crud.updateGPU(new GPU(title,price,width));
		
		
	}

}
