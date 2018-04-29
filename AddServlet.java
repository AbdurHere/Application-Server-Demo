

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sda.AddLogic;



@WebServlet(urlPatterns = {"/AddServlet"})
public class AddServlet extends HttpServlet 
{

    /**
     *
     * @param req
     * @param res
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        try {
            PrintWriter out = res.getWriter();
            String x = req.getParameter("text1");
                        AddLogic obj = new AddLogic();

         
            String h = "NA";
            obj.setX(x);
            obj.setH(h);
      
            obj.WillUpdate();

            
            out.println(obj.getH());
            out.println("\n\r \n\r \n\r From LenntLetter.com");

        } catch (ParseException ex) {
            Logger.getLogger(AddServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
             
 
    }
 
}
