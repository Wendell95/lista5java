/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioslista71;

/**
 *
 * @author PC
 */
public class Administrativo extends Assistente{
    private String turno;
    private double adicionalnoturno;
    private String numeromatricula;
    public Administrativo(String numeromatricula, String turno, double adicionalnoturno){
        super(numeromatricula);
        this.turno=turno;
        this.adicionalnoturno=adicionalnoturno;
        this.numeromatricula=numeromatricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalnoturno() {
        return adicionalnoturno;
    }

    public void setAdicionalnoturno(double adicionalnoturno) {
        this.adicionalnoturno = adicionalnoturno;
    }

    public String getNumeromatricula() {
        return numeromatricula;
    }

    public void setNumeromatricula(String numeromatricula) {
        this.numeromatricula = numeromatricula;
    }
}
