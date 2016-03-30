package com.example.umibiox.appet_proto.Clases;

import java.util.Date;

/**
 * Created by william on 30/03/2016.
 */
public class Usuario extends Persona {
    private String username;
    private String password;
    private Date fechareg;
    private Date fechamod;
    private String estado;
    private String tipousuario;

    public Usuario() {

    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaReg() {
        return fechareg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechareg = fechaReg;
    }

    public Date getFechaMod() {
        return fechamod;
    }

    public void setFechaMod(Date fechaMod) {
        this.fechamod = fechaMod;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoUsuario() {
        return tipousuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipousuario = tipoUsuario;
    }
}
