package com.aluracursos.desafioapilibros.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
