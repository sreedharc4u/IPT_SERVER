package com.fuso.enterprise.ipt.srv.rest.ws.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.validation.annotation.Validated;

import com.fuso.enterprise.ipt.srv.api.model.domain.UserDetails;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Validated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "ITPUsersV18_1Ws", description = "This service provides the operations for IPT users")
@Path("users")
public interface ITPUsersV18_1Ws {
	
	@GET
    @Path("/get-users-forapproval")
	@ApiOperation(value = "get-users-forapproval", notes = "This operation will give the list of user who requires approval for signup", response = UserDetails.class)
	@ApiResponses(value = { @ApiResponse(code = 0, message = "SUCCESS") })
	Response getUsersForApproval(@ApiParam(value = "userId", required = true) @NotNull @Valid @QueryParam("userId") String userId);
	
	@GET
    @Path("/user-Authenication")
	@ApiOperation(value = "user-Authenication", notes = "This operation is use to authenticatethe valid user", response = UserDetails.class)
	@ApiResponses(value = { @ApiResponse(code = 0, message = "SUCCESS") })
	Response userAuthenication(@ApiParam(value = "userId", required = true) @NotNull @Valid @QueryParam("userId") String userId);

}
