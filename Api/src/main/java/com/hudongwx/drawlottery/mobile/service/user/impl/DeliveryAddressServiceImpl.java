package com.hudongwx.drawlottery.mobile.service.user.impl;

import com.hudongwx.drawlottery.mobile.entitys.DeliveryAddress;
import com.hudongwx.drawlottery.mobile.mappers.DeliveryAddressMapper;
import com.hudongwx.drawlottery.mobile.service.user.IDeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author origin
 * @version 1.0, 2016/12/16 0016 <br/>
 * @desc <p>
 * <p>
 * 创建　origin　2016/12/16 0016　<br/>
 * <p>
 * *******
 * <p>
 * @email 294786949@qq.com
 */
@Service
public class DeliveryAddressServiceImpl implements IDeliveryAddressService {
    @Autowired
    DeliveryAddressMapper damapper;

    public boolean insert(DeliveryAddress address) {
        if(damapper.addDeliveryAddress(address)==1){
            return true;
        }
        return false;
    }

    public boolean delete(String id) {
        return false;
    }

    @Override
    public boolean update(DeliveryAddress address) {
        return false;
    }

    public List<DeliveryAddress> selectAll() {
        return null;
    }

    @Override
    public List<DeliveryAddress> selectAllByUserId(String accountId) {
        if(accountId.equals("1000")){
            List<DeliveryAddress> daList =new ArrayList<>();
            for (int i=0; i<10;i++) {
                DeliveryAddress address = new DeliveryAddress();
                address.setId(1000+i);
                daList.add(address);
            }
            return daList;
        }
        return null;
    }

    @Override
    public DeliveryAddress selectById(String id) {
        return null;
    }

    public DeliveryAddress selectById() {
        return null;
    }
}
