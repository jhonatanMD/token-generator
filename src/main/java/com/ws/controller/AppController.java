package com.ws.controller;

import com.ws.model.JwtResponse;
import com.ws.service.IJwtService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1")
public class AppController {

    @Inject
    private IJwtService jwtService;

    @GET
    @Path("/jwt")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response generateJwt() {
        return Response.ok(new JwtResponse(jwtService.jwt())).build();
    }
}