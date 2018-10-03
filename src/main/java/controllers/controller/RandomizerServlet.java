package controllers.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

public class RandomizerServlet extends HttpServlet {
    Random random = new Random();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("/random.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String rnd;
        try {
            rnd = String.valueOf(new Random().nextInt(Integer.parseInt(req.getParameter("count"))) + 1);
        } catch (NumberFormatException e) {
            rnd = "Not a number was typed";
        }


        req.setAttribute("enemy", rnd);
        req.getRequestDispatcher("/random.jsp").forward(req, resp);
    }


}
