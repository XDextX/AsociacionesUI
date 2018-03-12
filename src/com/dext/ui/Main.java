package com.dext.ui;
import com.dext.gestor.GestorComputadoras;
import com.dext.gestor.GestorEmpleados;

import java.io.*;

public class Main {
    public  static GestorComputadoras gC=new GestorComputadoras();
    public static GestorEmpleados gE=new GestorEmpleados();
    public static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out=System.out;
    public static void main(String args[]){
    gC.nuevaComputadora("222","toshiba");
    gE.nuevoEmpleado("pedro","345");
    out.print(gC.listarComputadoras());
    gE.listarRepresentantes();
    }
}
