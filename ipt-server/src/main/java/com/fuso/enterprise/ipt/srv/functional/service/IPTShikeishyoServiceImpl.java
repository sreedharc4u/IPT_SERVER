
package com.fuso.enterprise.ipt.srv.functional.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fuso.enterprise.ipt.srv.api.model.domain.ShikeishyoDetails;
import com.fuso.enterprise.ipt.srv.api.service.functional.IPTShikeishyoService;
import com.fuso.enterprise.ipt.srv.server.dao.ShikeishyoDao;
import com.fuso.enterprise.ipt.srv.server.dao.TmpShikeishyoDao;
import com.fuso.enterprise.ipt.srv.server.model.entity.TmpShikeisho;

@Service
@Transactional
public class IPTShikeishyoServiceImpl implements IPTShikeishyoService {

    private TmpShikeishyoDao tmpShikeishyoDao;

    private ShikeishyoDao shikeishyoDao;

    @Inject
    public IPTShikeishyoServiceImpl(TmpShikeishyoDao tmpShikeishyoDao, ShikeishyoDao shikeishyoDao) {
        this.tmpShikeishyoDao = tmpShikeishyoDao;
        this.shikeishyoDao = shikeishyoDao;
    }

    public void createOrUpdateShikeishyo(ShikeishyoDetails shikeishyoDetails) {
        TmpShikeisho readShikeishyo = tmpShikeishyoDao.readShikeishyo(shikeishyoDetails.getShikeisyoNo());
        tmpShikeishyoDao.createOrUpdateShikeishyo(shikeishyoDetails, readShikeishyo == null);
    }

    @Override
    public List<ShikeishyoDetails> getAllShikeishyoForUser(String userId) {
        return shikeishyoDao.getAllShikeishyoForUser(userId);
    }

}
