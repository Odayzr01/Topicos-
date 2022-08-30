/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;

/**
 *
 * @author oscar
 */
public class CDia {
    
    private int mesA[]={0,3,3,6,1,4,6,2,5,0,3,5};
    private int mesB[]={6,2,3,6,1,4,6,2,5,0,3,5};
    private String dias[]={"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
    private int Ks[]={6,4,2,0};
    private int dia, mes, anio;
    
    public CDia(int dia, int mes, int anio)
    {
        this.dia = dia;
        this.anio = anio;
        this.mes = mes;
    }
    


    public void setDia(int dia) throws CDiaEx
	{
            if (dia>31 || dia<0)
            {
                throw new CDiaEx("Ese dia no existe");
            }
            else if(mes == 2 && dia>29)
            {
                throw new CDiaEx("En febrero no puede haber mas de 29 dias");
            }
            else 
            {            
                this.dia=dia;
            }
        }

    public void setMes(int mes) throws CDiaEx
	{
            if (mes>12 || mes<0)
            {
                throw new CDiaEx("No existe ese mes");
            }
            else 
            {            
                this.mes=mes;
            }
        }

    public void setAnio(int anio) throws CDiaEx
	{
            if (anio<0)
            {
                throw new CDiaEx("No hay años negativos");
            }
            else 
            {            
                this.anio=anio;
            }
        }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    public String regresaDia()
	{
        String cadena = "";	
        int di1,m = 0,a,a4,ks1 = 0,unidad,decena,centena,um,ks;
        unidad = anio%10;
        anio = anio/10;
        decena = anio%10;
        anio = anio/10;
        centena = anio%10;
        anio = anio/10;
        um = anio%10;
        anio = anio/10;
        
        if (anio%4==0)
        {
            m = mesA[mes-1];
            
        }
        if (anio%4!=0)
        {
            m = mesB[mes-1];
            
        }
        
        a = unidad + (decena*10);
        a4 = a/4;
       
        ks = centena + (um*10);
        int a16 = 16;
        if (ks == 0 || ks ==4 ||ks == 8 || ks ==12 || ks == 16 || ks ==20 || ks == 24 || ks ==28 ||ks == 32 || ks ==36 || ks == 40 || ks ==44)
        {
            ks1 = 6;
        }
        if (ks == 1 || ks ==5 ||ks == 9 || ks ==13 || ks == 17 || ks ==21 || ks == 25 || ks ==29 ||ks == 33 || ks ==37 || ks == 41 || ks ==45)
        {
            ks1 = 4;
        }
        if (ks == 2 || ks ==6 ||ks == 10 || ks ==14 || ks == 18 || ks ==22 || ks == 26 || ks ==30 ||ks == 34 || ks ==38 || ks == 42 || ks ==48)
        {
            ks1 = 2;
        }
        if (ks == 3 || ks ==7 ||ks == 1 || ks ==15 || ks == 19 || ks ==23 || ks == 27 || ks ==31 ||ks == 35 || ks ==39 || ks == 43 || ks ==49)
        {
            ks1 = 0;
        }
        
        di1 = (dia+m+a+a4+ks1)%7;

        cadena = cadena + dias[di1];        
	return cadena;
	}
    
    public int biciesto(){
        
        int bi=0;
        if (anio==2022)
        {
            bi=1;
        }
        return bi;     
    }
    public int diasDelMes(){
        int diasM=0;
        
        if(mes==1 || mes==3 || mes==5 || mes ==7 || mes==8 || mes==10 || mes==12)
        {
            diasM=31;
        }    
        else if(mes==4 || mes==6||mes==9||mes==11)
        {
            diasM=30;
        }
        else if(mes == 2)
        {
            if(anio%4 ==0)
            {
                diasM=29;
            }
            else
            {
                diasM=28;
            }
        }
        return diasM;
    }
        
    
}