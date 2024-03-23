package com.mil.ms.proyectos.exception;

/*
 * Exception que se lanza
 */
public class IlegalOperationException extends Exception {
private static final long serialVersionUID = 1L;

public IlegalOperationException(String message) {
	super (message);
}
}