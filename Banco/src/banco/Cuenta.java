package banco;

import javax.swing.JOptionPane;

public class Cuenta {
    public static int x=2;
    public static registro [] cuenta= new registro[100];        
     
    public class registro {
        String Cuenta;
	String  Titular;
	int  Saldo;
	String  NIP;        
    }
    
    public void Prellenar(){
        cuenta[1]=new registro();    
        cuenta[1].Cuenta="admon";
        cuenta[1].Titular="Administrador";
        cuenta[1].Saldo=0;
        cuenta[1].NIP="admon";        
    }
	     
    public void Crear(String NoCuenta,String nombre,int saldo, String nip) {    
        cuenta[x]=new registro();    
        cuenta[x].Cuenta=NoCuenta;
        cuenta[x].Titular=nombre;
        cuenta[x].Saldo=saldo;
        cuenta[x].NIP=nip; 
        
        //JOptionPane.showMessageDialog(null,"cuenta creada");
        //System.out.print("\nLa Cuenta con los siguientes Datos: \n\n");                                  
        //System.out.println("Cuenta  \t" +"Titular \t" +"Saldo \t" +"NIP");
        //System.out.println(cuenta[x].Cuenta + "\t" +cuenta[x].Titular + "\t" +cuenta[x].Saldo + "\t" +cuenta[x].NIP);    
        //System.out.print("\nHa sido creada satisfactoriamente, presione una tecla para continuar..."); 
        x++;   //Equivamente a x=x+1;    
    }
	
    public void Abonar(String Nocuenta, int deposito) {            
            for(int i=1;i<x;i++)    {                                       
                if (Nocuenta.equals(cuenta[i].Cuenta))   {    
                    cuenta[i].Saldo=cuenta[i].Saldo+deposito;
                    System.out.print("Operacion realizada exitosamente \nPresione una tecla para continuar");                    
                }        
            }    
	}
	
    public void Consultar(String Nocuenta ) {        
        boolean band=false;
        for(int i=1;i<x;i++)    {                                       
            if (Nocuenta.equals(cuenta[i].Cuenta))  {
                System.out.println("Cuenta  \t" +"Titular \t" +"Saldo");
                System.out.println(cuenta[i].Cuenta + "\t" +cuenta[i].Titular + "\t" +cuenta[i].Saldo);
                System.out.println("\nPresione una tecla para continuar..." ); 
                band=true;
            }
        }
            if (band==false)
                System.out.println("La cuenta " + Nocuenta + " no existe. \nPresione una tecla para continuar..." );           	
                
    }
    
    public boolean Validar(String Nocuenta, String NIP ) {        
        boolean band=false;
        for(int i=1;i<x;i++)    {                                       
            if (Nocuenta.equals(cuenta[i].Cuenta) && NIP.equals(cuenta[i].NIP))  {
                band=true; 
                break;
            }
        }                   
        return band;
    }
    
    
    public void Retirar(String Nocuenta, int retiro) {
        for(int i=1;i<x;i++)    {                                       
                if (Nocuenta.equals(cuenta[i].Cuenta))   {    
                    cuenta[i].Saldo=cuenta[i].Saldo-retiro;
                    System.out.print("Operacion realizada exitosamente \nPresione una tecla para continuar");                    
                }        
            }    

            }
}
