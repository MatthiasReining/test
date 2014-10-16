package edu.fhws.fsfba;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "my-servlet", urlPatterns = {"/my-servlet"})
public class MyServlet extends HttpServlet {
    
    public MyServlet() {
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String payload = req.getParameter("payload");
        
        int length = calculateLength(payload);
        resp.getWriter().println("Payload has " + length + " characters.");
        
    }
    
    int calculateLength(String payload) {
        if (payload == null) return 0;
        
        return payload.length();        
    }
    
    
}
