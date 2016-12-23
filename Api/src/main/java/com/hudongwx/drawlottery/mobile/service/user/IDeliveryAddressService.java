package com.hudongwx.drawlottery.mobile.service.user;

import com.hudongwx.drawlottery.mobile.entitys.DeliveryAddress;

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
public interface IDeliveryAddressService {

    public boolean addDA(DeliveryAddress address);

    public boolean deleteDA(String id);

    public boolean updateDA(DeliveryAddress address);

    public List<DeliveryAddress> selectAll();

    public List<DeliveryAddress> selectAllByUserId(Long accountId);

    public DeliveryAddress selectById(String id);

}
