package controllers.controller;


import controllers.pojo.Brand;
import controllers.service.BrandService;
import controllers.service.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BrandServlet extends HttpServlet {
    BrandService brandService;

    public BrandServlet() {
        brandService = new BrandServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Brand> res = brandService.getBrandList();
        req.setAttribute("brands", res);
        req.getRequestDispatcher("/brands.jsp").forward(req, resp);
    }
}
