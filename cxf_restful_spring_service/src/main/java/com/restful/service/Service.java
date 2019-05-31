package com.restful.service;

import com.restful.pojo.User;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService
@Path("user")
public interface Service {

    @GET //指定请求方式
    @Path("/queryn/{callback}")
    @Produces({MediaType.APPLICATION_JSON}) //返回给客户的数据格式
    User queryByName(@PathParam("callback") String callback);

    @GET //指定请求方式
    @Path("/queryi/{callback}")
    @Produces({MediaType.APPLICATION_JSON})  //返回给客户的数据格式
    User queryById(@PathParam("callback") String callback);
}
