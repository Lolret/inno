package controllers.service;

import controllers.pojo.Mobile;
import controllers.repository.dao.MobileDao;
import controllers.repository.dao.MobileDaoJdbcImpl;

import java.util.List;

public class MobileServiceImpl implements MobileService {
    MobileDao mobileDao;

    public MobileServiceImpl() {
        mobileDao = new MobileDaoJdbcImpl();
    }

    @Override
    public List<Mobile> getMobilesByBrand(String brand) {
        return mobileDao.getMobileList(Integer.valueOf(brand));
    }
}
