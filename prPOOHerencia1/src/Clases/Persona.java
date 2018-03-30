/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


        
        
public class Persona {

//Propiedades

private String nombres;
private String apellidos;
private String documentos;
private String tipo;



public Persona() 
{
    }
 public Persona(String nombres, String apellidos, String documentos, String tipo) 
 {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documentos = documentos;
        this.tipo = tipo;
    }
   //Metodos setter and getter


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumentos() {
        return documentos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
}
