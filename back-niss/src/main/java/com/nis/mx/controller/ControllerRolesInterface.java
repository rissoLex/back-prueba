package com.nis.mx.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nis.mx.model.request.ModelRequestRoles;
import com.nis.mx.model.response.ModelResponseData;

@RestController
@RequestMapping(path = "/ws", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public interface ControllerRolesInterface {
    
    @PostMapping(path = "/saveRol", consumes = "application/json", produces = "application/json")
	public @ResponseBody ModelResponseData saveRol(@RequestBody @Valid ModelRequestRoles dtoRequest);

    @PostMapping(path = "/obtainRoles", consumes = "application/json", produces = "application/json")
	public @ResponseBody ModelResponseData obtainRoles(@RequestBody @Valid ModelRequestRoles dtoRequest);

    @PostMapping(path = "/updateRol", consumes = "application/json", produces = "application/json")
	public @ResponseBody ModelResponseData updateRol(@RequestBody @Valid ModelRequestRoles dtoRequest);

    @PostMapping(path = "/deleteRol", consumes = "application/json", produces = "application/json")
	public @ResponseBody ModelResponseData deleteRol(@RequestBody @Valid ModelRequestRoles dtoRequest);

}
