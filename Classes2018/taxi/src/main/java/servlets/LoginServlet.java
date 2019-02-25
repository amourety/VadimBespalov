package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by amour on 18.09.2018.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("<form action = 'https://localhost/login' method='post'>");
        writer.write("<input type ='text' name= 'login' placeholder='Логин'>");
        writer.write("<input type ='password' name= 'password' placeholder='Пароль'>");
        writer.write("<input type ='submit' name ='' value = 'Войти!'>");
        writer.write("</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
