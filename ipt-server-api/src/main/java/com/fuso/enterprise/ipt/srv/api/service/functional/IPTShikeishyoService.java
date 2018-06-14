package com.fuso.enterprise.ipt.srv.api.service.functional;

import java.util.List;

import com.fuso.enterprise.ipt.srv.api.model.domain.ShikeishyoDetails;

public interface IPTShikeishyoService {

	void createOrUpdateShikeishyo(ShikeishyoDetails shikeishyoDetails);

    List<ShikeishyoDetails> getAllShikeishyoForUser(String userId);

}
