package com.fuso.enterprise.ipt.srv.rest.ws.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.fuso.enterprise.ipt.srv.api.model.domain.ShikeishyoDetails;
import com.fuso.enterprise.ipt.srv.api.service.functional.IPTShikeishyoService;

@Validated
@Service
public class IPTShikeishyoResourceV18_1WsImpl implements IPTShikeishyoResourceV18_1Ws {

	@Inject
	private IPTShikeishyoService iptShikeishyoService;

	public Response createOrUpdateShikeishyo(ShikeishyoDetails shikeishyoDetails) {
		iptShikeishyoService.createOrUpdateShikeishyo(shikeishyoDetails);
		return Response.ok().build();
	}

    @Override
    public List<ShikeishyoDetails> getAllShikeishyoForUser(String userId) {
        return iptShikeishyoService.getAllShikeishyoForUser(userId);
    }

}
