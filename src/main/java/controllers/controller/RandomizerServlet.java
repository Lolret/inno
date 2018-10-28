package controllers.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizerServlet extends HttpServlet {
    Random random = new Random();

    String[] Participants = {
            "Alexander Adamov",
            "Ramil Gaisin",
            "Alexey Gerasimov",
            "Olga Harisova",
            "Pavel Komar",
            "Maxim Kovalenko",
            "Denis Nurimanshin",
            "Andrei Poponin",
            "Dmitry Shmelev",
            "Grigory Sostavkin",
            "Vadim Spiridonov",
            "Elvira Temirkhanova",
            "Lyudmila Voronaya",
            "Igor Yakovlev"};


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {



        req.setAttribute("Test", "Testing");
        System.out.println(req.getAttribute("Test"));
        req.getRequestDispatcher("/random.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String rndString;
        Integer rndInt;

        List<Integer> excluded = parseExcludeString(req.getParameter("excluded"));
        try {
            int i =0;
            do {
                i++;
                rndInt = new Random().nextInt(Integer.parseInt(req.getParameter("count"))) + 1;
                rndString = String.valueOf(rndInt);
            } while (excluded.stream().anyMatch(rndInt::equals) && i <30);
        } catch (NumberFormatException e) {
            rndString = "Not a number was typed";
        }


        req.setAttribute("enemy", rndString);
        req.getRequestDispatcher("/random.jsp").forward(req, resp);
    }

    private static List<Integer> parseExcludeString(String s) {

        String[] integerStrings = s.split(" ");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        for (String splited : integerStrings) {
            try {
                integerList.add(Integer.parseInt(splited));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return integerList;
    }
}

