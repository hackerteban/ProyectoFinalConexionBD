package com.jikansoftware.retrofitdemostracion.model;

import com.google.gson.annotations.SerializedName;

public class Contact {
    @SerializedName("nomInstitucion")
    private String nomInstitucion;
    @SerializedName("fecha")
    private String fecha;

    public String getNomInstitucion() {
        return nomInstitucion;
    }

    public String getFecha() {
        return fecha;
    }
}
