package controllers.service;


import controllers.pojo.Brand;
import controllers.repository.dao.BrandDao;
import controllers.repository.dao.BrandDaoImpl;

import java.util.List;

public class BrandServiceImpl implements BrandService {
    BrandDao brandDao;

    public BrandServiceImpl() {
        this.brandDao = new BrandDaoImpl();
    }

    @Override
    public List<Brand> getBrandList() {
        return brandDao.getBrandList();
    }



}
