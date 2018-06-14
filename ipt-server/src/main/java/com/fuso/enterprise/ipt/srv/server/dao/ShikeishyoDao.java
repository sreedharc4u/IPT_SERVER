package com.fuso.enterprise.ipt.srv.server.dao;

import java.util.List;

import com.fuso.enterprise.ipt.srv.api.model.domain.ShikeishyoDetails;

public interface ShikeishyoDao {

    List<ShikeishyoDetails> getAllShikeishyoForUser(String userId);

}
