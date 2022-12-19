package com.nis.mx.util;

import com.nis.mx.model.response.ModelResponseData;

/**
 * Clase con utilidades  para los procesos en el proyecto
 * 
 * @since 15/12/2022
 * @author Lex.Mendez
 */
public class Utils {
    
    public static void obtieneRespuestaExito(ModelResponseData response) {
		response.setCode(Constantes.CODIGO_200);
		response.setStatus(Constantes.ESTATUS_EXITO);
		response.setMessage(Constantes.MSG_EXITO);
	}
	
	public static void obtieneRespuestaError(ModelResponseData response) {
		response.setCode(Constantes.CODIGO_500);
		response.setStatus(Constantes.ESTATUS_ERROR);
		response.setMessage(Constantes.MSG_ERROR);

	}

	public static void obtieneRespuestaErrorCustom(ModelResponseData response, String message) {
		response.setCode(Constantes.CODIGO_500);
		response.setStatus(Constantes.ESTATUS_ERROR);
		response.setMessage(message);

	}

}
