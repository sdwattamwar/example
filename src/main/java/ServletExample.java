/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.math.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author S D Wattamwar
 */
public class ServletExample extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        BigInteger em1,em2,m2,nsquare;
        BigInteger[] c1=new BigInteger[2];
        BigInteger[] c2=new BigInteger[2];
        BigInteger[] res_mul=new BigInteger[2];
        int op = Integer.parseInt(request.getParameter("op"));
        switch(op)
        {
            case 1:
                em1 = new BigInteger(request.getParameter("num1"));
                m2 = new BigInteger(request.getParameter("num2"));
                nsquare = new BigInteger(request.getParameter("n2"));
                BigInteger product_em1m2 = em1.multiply(m2).mod(nsquare);
                out.println(product_em1m2);     
                out.close();
                break;
            case 2:
                em1 = new BigInteger(request.getParameter("num1"));
                em2 = new BigInteger(request.getParameter("num2"));
                nsquare = new BigInteger(request.getParameter("n2"));
                BigInteger expo_em1em2 = em1.modPow(em2, nsquare);
                out.println(expo_em1em2);
                out.close();
                break;
            case 3:
                em1 = new BigInteger(request.getParameter("num1"));
                em2 = new BigInteger(request.getParameter("num2"));
                BigInteger product_em1em2 = em1.multiply(em2);
                out.println(product_em1em2);
                out.close();
                break;
            case 4:
                c1[0] = new BigInteger(request.getParameter("num11"));
                c1[1] = new BigInteger(request.getParameter("num12"));
                c2[0] = new BigInteger(request.getParameter("num21"));
                c2[1] = new BigInteger(request.getParameter("num22"));
                res_mul[0]=c1[0].multiply(c2[0]);
                res_mul[1]=c1[1].multiply(c2[1]);
                out.println(res_mul[0]);
                out.println(res_mul[1]);
                out.close();
                
                break;
            default: 
                out.println("Invalid Operation");
            
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
