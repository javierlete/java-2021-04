package com.ipartek.formacion.holamundoarquitectura;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException
    {
    	Fabrica fabrica = new Fabrica();
    	
    	ProveedorEntrada pe = fabrica.getProveedorEntrada();
    	ProveedorSalida ps = fabrica.getProveedorSalida();
        
    	ps.enviar( pe.getTexto() );
    }
}
