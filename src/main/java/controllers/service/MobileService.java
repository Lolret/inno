package controllers.service;

import controllers.pojo.Mobile;

import java.util.List;

public interface MobileService {
    List<Mobile> getMobilesByBrand(String brand);
}
