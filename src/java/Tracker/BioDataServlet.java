/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tracker;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Sanket MIttal
 */
@WebServlet("/BioDataServlet")
public class BioDataServlet extends HttpServlet {
 
 public double Height; 
 public double Weight; 
 int Age;
 
 @Override 
    public void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {          
            
              Data info = new Data();
        
              Height = Double.parseDouble(request.getParameter("Height"));
             
              Weight = Double.parseDouble(request.getParameter("Weight"));
           //   Weight = Integer.parseInt(request.getParameter("Weight"));
             
              Age = Integer.parseInt(request.getParameter("Age"));
              
              String Gender[] = request.getParameterValues("gender");
                 if (Gender != null) {
                    for (String gen : Gender) {
                      if ("m".equals(gen)) info.setMale(true);
                      else info.setFemale(true); 
                    }
                }
              
               String Measurement[] = request.getParameterValues("measurement");
                 if (Measurement != null) {
                    for (String measure : Measurement) {
                      if ("Imp".equals(measure)) info.setImperial(true);
                      else info.setImperial(false); 
                    }
                }
              
             
              
               info.setHeight(Height); 
               info.setWeight(Weight);
               info.setAge(Age); 
                          
             getBodyFat bodyfat = new getBodyFat();
             double BF = bodyfat.Calculate(); 
             
             PrintWriter out = response.getWriter();
             response.setContentType("text/html");
             out.print("<html><body><center>");
             out.print("<h2> Your Bodyfat is estimated to be: ");
             out.println(BF+ "</h2>");
             out.print("<br/>");
             out.print("<table style=width:18%>");
             out.print("<tr>");
             out.print("<th>  </th>");
             out.print("<th> Women </th>");
             out.print("<th> Men </th>");
             out.print("</tr>");
             out.print("<tr><td>Essential fat: </td> <td>10-12% <t/d> <td> 2-4%</td></tr>");
             out.print("<tr><td>Athletes:</td> <td>14-20%</td>  <td>6-13%</td></tr>");
             out.print("<tr><td>Fitness:</td> <td>21-24%</td>   <td>14-17%</td></tr>");
             out.print("<td>Acceptable:</td> <td>25-31%</td>  <td>18-25%</td></tr>");
             out.print("<td>Obese:</td> <td>32% +</td>      <td>26% +</td></p>");
             out.print("</main></center></body></html>");
    }
 }

