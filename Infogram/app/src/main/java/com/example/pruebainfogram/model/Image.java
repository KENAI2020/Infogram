package com.example.pruebainfogram.model;

public class Image {
    private String urlImagen;
    private String usernam;
    private String catidadDias;
    private String cantidadMeGusta;

    public Image(String urlImagen, String usernam, String catidadDias, String cantidadMeGusta) {
        this.setUrlImagen(urlImagen);
        this.setUsernam(usernam);
        this.setCatidadDias(catidadDias);
        this.setCantidadMeGusta(cantidadMeGusta);
    }


    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUsernam() {
        return usernam;
    }

    public void setUsernam(String usernam) {
        this.usernam = usernam;
    }

    public String getCatidadDias() {
        return catidadDias;
    }

    public void setCatidadDias(String catidadDias) {
        this.catidadDias = catidadDias;
    }

    public String getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public void setCantidadMeGusta(String cantidadMeGusta) {
        this.cantidadMeGusta = cantidadMeGusta;
    }
}
