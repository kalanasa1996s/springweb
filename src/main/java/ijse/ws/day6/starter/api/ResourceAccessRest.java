package ijse.ws.day6.starter.api;

import com.google.gson.Gson;
import ijse.ws.day6.starter.modal.Message;
import ijse.ws.day6.starter.modal.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

public class ResourceAccessRest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = req.getReader();
            while ((line = reader.readLine()) != null)
                jb.append(line);
        } catch (Exception e) {
            System.out.println(e);
        }

        String payloadString = jb.toString();
        Gson gson = new Gson();
        User user = gson.fromJson(payloadString, User.class);
        req.getSession().setAttribute("name", user.getName());

        req.getSession().setAttribute("session_key", System.nanoTime());
        System.out.println("Login_Session Key : " + req.getSession().getAttribute("session_key"));

        resp.getWriter().println("LoginName"+user);


    }

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        Message message = new Message("Test", "Message", new Date(),"Kavindu");
        Gson gson = new Gson();
        String json = gson.toJson(message);

        System.out.println("Session Key : " + req.getSession().getAttribute("session_key"));
        System.out.println("Application Scope Name " + req.getSession().getServletContext().getAttribute("name"));


        res.setContentType("application/json");
        res.setStatus(HttpServletResponse.SC_OK);
        res.getWriter().println(json);
    }

}
