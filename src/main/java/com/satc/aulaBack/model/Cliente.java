package com.satc.aulaBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author gustavo.437413
 */
@Entity
public class Cliente extends Pessoa {

    @Column(name = "cpf", nullable = true)
    private String cpf;
    @Column(name = "rg", nullable = true)
    private String rg;

    public Cliente() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String getDocumentoPrincipal() {
        return this.getCpf();
    }
}
