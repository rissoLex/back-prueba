package com.nis.mx.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nis.mx.model.request.ModelRequestLogin;
import com.nis.mx.model.request.ModelRequestUsuarios;
import com.nis.mx.model.response.ModelResponseData;

@RestController
@RequestMapping(path = "/ws", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public interface ControllerUsuariosInterface {
    
    @PostMapping(path = "/saveUsuario", consumes = "application/json", produces = "application/json")
	public @ResponseBody ModelResponseData saveUsuario(@RequestBody @Valid ModelRequestUsuarios dtoRequest);

    @PostMapping(path = "/obtainUsuarios", consumes = "application/json", produces = "application/json")
	public @ResponseBody ModelResponseData obtainUsuarios(@RequestBody @Valid ModelRequestUsuarios dtoRequest);

    @PostMapping(path = "/updateUsuario", consumes = "application/json", produces = "application/json")
	public @ResponseBody ModelResponseData updateUsuario(@RequestBody @Valid ModelRequestUsuarios dtoRequest);

    @PostMapping(path = "/deleteUsuario", consumes = "application/json", produces = "application/json")
	public @ResponseBody ModelResponseData deleteUsuario(@RequestBody @Valid ModelRequestUsuarios dtoRequest);

    @PostMapping(path = "/loginUser", consumes = "application/json", produces = "application/json")
	public @ResponseBody ModelResponseData loginUser(@RequestBody @Valid ModelRequestLogin dtoRequest);



}
