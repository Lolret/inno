package controllers.repository.dao;


import controllers.pojo.Mobile;

import java.util.List;

public interface MobileDao {
    boolean addMobile(Mobile mobile);

    Mobile getMobileById(Integer id);

    List<Mobile> getMobileList(Integer brandId);

    boolean updateMobileById(Mobile mobile);

    boolean deleteMobileById(Integer id);
}
