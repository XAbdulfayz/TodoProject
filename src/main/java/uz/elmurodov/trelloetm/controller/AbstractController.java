package uz.elmurodov.trelloetm.controller;

public abstract class AbstractController<T> {
    protected final T service;

    protected AbstractController(T service) {
        this.service = service;
    }
}