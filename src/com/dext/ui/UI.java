package com.dext.ui;

//import com.dext.gestor.GestorComputadoras;
//import com.dext.gestor.GestorEmpleados;
//import com.dext.gestor.;
import com.dext.gestor.GestorComputadoras;
import com.dext.gestor.GestorEmpleados;

import java.io.*;

public class UI {
    public static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out=System.out;
    public static GestorComputadoras gc=new GestorComputadoras();
    public static GestorEmpleados ge=new GestorEmpleados();


    public static void main(String args[])throws IOException{
        menu();
    }
    public static void menu() throws IOException {
        String acciones[]={
                "Registrar equipo",
                "Registrar empleado",
                "Listar equipos",
                "Listar empleados",
                "Asignar empleado",
                "Listar responsables",
                "Listar sin equipos",
                "Listar sin responsables"

        };
        int respuesta;
        boolean continuar=true;
        do {
            out.println("Digite una le las siguientes opciones:\n");
            for (int i=0;i<acciones.length;i++){
                out.println((i+1)+"."+acciones[i]);
            }
            out.println("0.Salir");
            respuesta=Integer.parseInt(in.readLine());
            switch (respuesta){
                case 1:
                    registrarEquipo();
                    break;
                case 2:
                    registrarEmpleado();
                    break;
                case 3:
                    listarEquipos();
                    break;
                case 4:
//                    listarEmpleados();
                    break;
                case 5:
//                    asignarEmpleado();
                    break;
                case 6:
//                    listarResponsables();
                    break;
                case 7:
//                    listarSinEquipo();
                    break;

                case 8:
//                    listarSinResp()
                    break;
                case 9:
                    break;
                case 0:
                    continuar=false;
                    break;
                default:
                    break;
            }
        }while (continuar);
    }
    public static void registrarEquipo()throws IOException{
        String serie,marca,nombre,cedula,respuesta;
        out.println("digite la serie del equipo");
        serie=in.readLine();
        out.println("digite la marca del equipo");
        marca=in.readLine();
        out.println("¿Desea registrar el responsable? S/N");
        respuesta=in.readLine();
        if (respuesta.toUpperCase().charAt(0)=='S'){
            out.println("digite el nombre del responsable");
            nombre=in.readLine();
            out.println("digite lacedula del representante");
            cedula=in.readLine();
            gc.nuevaComputadora(serie,marca,nombre,cedula);
        }else {
            gc.nuevaComputadora(serie,marca);
        }
        out.println("usuario registrado");
    }
    public  static void registrarEmpleado()throws IOException{
        String nombre,cedula;

        out.println("Digite el nombre del empleado");
        nombre=in.readLine();
        out.println("Digite el la cedula delempleado");
        cedula=in.readLine();
        ge.nuevoEmpleado(nombre,cedula);
    }
    public static void listarEquipos(){
        for (String var:gc.listarComputadoras()){
            out.println(var);
        }
    }
    public static void asignaResponsable()throws IOException{
        String serie,cedula;
        out.println("digite las serie del equipo");
        serie=in.readLine();


    }
}

