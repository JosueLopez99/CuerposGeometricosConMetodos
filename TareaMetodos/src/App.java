import java.util.Scanner;
public class App {
    static Scanner x = new Scanner(System.in);
    static int maxIntentos = 3;

     public static void main(String[] args) throws Exception {
        char o;

        System.out.println("Seleccione el cuerpo Geometrico a calcular");
        System.out.println("-----------------------------------------------");
        System.out.println("a.Prisma");
        System.out.println("b.Cilindro");
        System.out.println("c.Piramide");
        System.out.println("d.Cono");
        System.out.println("e.Esfera");
        System.out.println("f.Zona Esferica");
        System.out.println("g.Casquete Esferico");
        System.out.println("h.Huso Esferico y Cuña Esferica"); 
        System.out.println("--------------------------------------------");
        System.out.println("i.Ortoedro");
        System.out.println("j.Tetraedro");
        System.out.println("k.Hexaedro");
        System.out.println("l.Octaedro");
        System.out.println("m.Dodecaedro");
        System.out.println("n.Icosaedro");
        System.out.println("o.Tronco de Cono");
        System.out.println("p.Tronco de la piramide"); 
        o = x.next().charAt(0);

        int intentos = 0;
        while (intentos < maxIntentos) {
            System.out.print("Introduzca su elección: ");
            o = x.next().charAt(0);

            if (o >= 'a' && o <= 'p') {

        switch (o) {
            case 'a':
            Prisma();
                break;
        
                 case 'b':
                 Cilindro();
                break;

                 case 'c':
                 Piramide();
                break;

                 case 'd':
                 Cono();
                break;

                 case 'e':
                 Esfera();
                break;

                 case 'f':
                ZonaEsferica();

                break;

                 case 'g':
                CasqueteEsferico();

                break;

                 case 'h':
                Huso_CuñaEsferica();
                 
                break;

                 case 'i':
                 Ortoedro();

                break;

                 case 'j':
                 Tetraedro();
                  
                break;

                 case 'k':
                Hexaedro();

                break;

                 case 'l':
                Octaedro();

                break;

                 case 'm':
                Dodecaedro();

                break;

                 case 'n':
                Icosaedro();

                break;

                 case 'o':
                 TroncoCono();
                  
                break;

                 case 'p':
                 TroncoPiramide();
                break;

            default:
            System.out.println("Usted ha sido vetado de este programa");
                break;
        
            }
            }else{
                System.out.println("Opción no válida, intente de nuevo.");
                intentos++;
            
            }
            }
            if(intentos == maxIntentos){
            System.out.println("Ya no pudes entrar al programa");
            }
            
    }

     public static char leerCaracter() {
        String input = x.next().toLowerCase();
        if (input.length() != 1 || (input.charAt(0) < 'a' || input.charAt(0) > 'p')) {
            System.out.println("Entrada inválida. Saliendo del programa.");
            return 'z'; 
        }
        return input.charAt(0);
    }
    
   

 public static void Prisma(){

  double Perimetrobase,altura, AreaLateral, AreaBase, AreaTotal, Volumen;

   
  System.out.println("Inserte el Perimetro de la base");
    Perimetrobase = x.nextDouble();
  
    System.out.println("Inserte la altura");
    altura = x.nextDouble();
 
    AreaLateral = (Perimetrobase * altura);

    System.out.print("El area lateral es : " + AreaLateral);

    //=================================================

    System.out.println("Inserte el area de la base ");
    AreaBase = x.nextDouble();

    AreaTotal = AreaLateral + (AreaBase * 2);

    System.out.println("El area total es " + AreaTotal);
//=======================================================

System.out.println("Inserte el Volumen");
Volumen = x.nextDouble();

Volumen = (AreaBase * altura);

System.out.println("EL volumen es " + Volumen);
}

//////////////////////////////////////////////
public static void Cilindro(){

     double Perimetrobase,altura, AreaLateral, AreaBase, AreaTotal, Volumen;

     System.out.println("Inserte el Perimetro de la base");
    Perimetrobase = x.nextDouble();
  
    System.out.println("Inserte la altura");
    altura = x.nextDouble();
 
    AreaLateral = (Perimetrobase * altura);

    System.out.println("El area lateral es : " + AreaLateral);

    //=================================================

    System.out.println("Inserte el area de la base ");
    AreaBase = x.nextDouble();

    AreaTotal = AreaLateral + (AreaBase * 2);

    System.out.println("El area total es " + AreaTotal);
//=======================================================

System.out.println("Inserte el Volumen");
Volumen = x.nextDouble();

Volumen = (AreaBase * altura);

System.out.println("EL volumen es " + Volumen);

}

public static void Piramide(){

 double Perimetrobase,altura, AreaLateral, AreaBase, AreaTotal, Volumen,ApotemaP;

  System.out.println("Ingrese el perimetro de base");
    
    Perimetrobase = x.nextDouble();

    System.out.println("Ingrese el apotema de la piramide");
    ApotemaP = x.nextDouble();

    AreaLateral = (Perimetrobase * ApotemaP)/2;

    System.out.println("El area lateral es " + AreaLateral);

   //==============================================================
   
   System.out.println("Ingrese el area de la base");
   AreaBase = x.nextDouble();

   AreaTotal = (AreaLateral + AreaBase);

   System.out.println("El area total es " + AreaTotal);

   //============================================================

   System.out.println("inserte la altura");
   altura = x.nextDouble();

   Volumen = (AreaBase * altura)/3;

   System.out.println("EL volumen es " + Volumen);
}

//===============================================

public static void Cono(){

 double Perimetrobase,altura, AreaLateral, AreaBase, AreaTotal, Volumen,generatriz;

 System.out.println("Ingrese el perimetro de base");
    
    Perimetrobase = x.nextDouble();

    System.out.println("Ingrese la generatriz");
    generatriz = x.nextDouble();

    AreaLateral = (Perimetrobase * generatriz)/2;

    System.out.println("El area lateral es " + AreaLateral);

   //==============================================================
   
   System.out.println("Ingrese el area de la base");
   AreaBase = x.nextDouble();

   AreaTotal = (AreaLateral + AreaBase);

   System.out.println("El area total es " + AreaTotal);

   //============================================================

   System.out.println("inserte la altura");
   altura = x.nextDouble();

   Volumen = (AreaBase * altura)/3;

   System.out.println("EL volumen es " + Volumen);

}

public static void Esfera(){

    double Volumen,radio,area;

    System.out.println("Ingrese el radio");
        radio = x.nextDouble();

        area = (4 * 3.14)*(radio * radio);

       System.out.println("EL valor de area es " + area);

       //===================================================

      Volumen = (4/3 * 3.14) * (radio * radio * radio);

      System.out.println("El valor de volumen es " + Volumen);
}

public static void ZonaEsferica(){

 double Volumen,radio,area,RadioEsfera,altura;

System.out.println("Ingrese el radio de la esfera");
RadioEsfera = x.nextDouble();

System.out.println("Ingrese la altura");
altura = x.nextDouble();

area = (2*3.14) * (RadioEsfera * altura);

System.out.println("El Area es " + area);

//=======================================
 System.out.println("Ingrese el radio");
 radio = x.nextDouble();

 Volumen = (3.14*altura) *  + (altura*altura+6+radio*radio*radio*radio)/6;

 System.out.println("El volumen " + Volumen);

 }

public static void CasqueteEsferico(){

double Volumen,area,RadioEsfera,altura;

 System.out.println("Ingrese el radio de la esfera");
RadioEsfera = x.nextDouble();

System.out.println("Ingrese la altura");
altura = x.nextDouble();

area = (2*3.14) * (RadioEsfera * altura);

System.out.println("El Area es " + area);

//===============================================

Volumen = (3.14*altura) * (3*RadioEsfera - altura)/3;
 
System.out.println("El volumen es " + Volumen);

}

public static void Huso_CuñaEsferica(){

double Volumen,radio,area,numgrados;

System.out.println("Ingrese el radio");
        radio = x.nextDouble();

        System.out.println("Ingrese el numero de grados");
        numgrados = x.nextDouble();

        area = (4*3.14) * (radio*radio)*(numgrados)/360;

    System.out.println("El Area del Huso Esferico es " + area);

    //========================================================

    Volumen = (4/3) * (3.14*(radio*radio*radio)*numgrados)/360;
    System.out.println("El Volumen de la cuña Esferica es " + Volumen);
}

public static void Ortoedro(){

double Volumen,altura,longitud,profundidad,area;

 System.out.println("Ingrese la altura");
         altura = x.nextDouble();

        System.out.println("Ingrese la longitud");
        longitud = x.nextDouble();

        System.out.println("Ingrese la profundidad");
        profundidad = x.nextDouble();

        area = 2*(altura*longitud+altura*profundidad+longitud*profundidad);

    System.out.println("El Area es " + area);

    //========================================================
    Volumen = (altura*longitud*profundidad);
    System.out.println("El volumen es " + Volumen);
}

public static void Tetraedro(){

double Volumen,altura,area;

 System.out.println("Ingrese la altura");
    altura = x.nextDouble();

    area = (altura*altura)*1.73;
    System.out.println("El area es " + area);
    
    //======================================

    Volumen = (1.41/12)*(altura*altura*altura);
    System.out.println("El volumen es " + Volumen);
}

public static void Hexaedro(){

double altura,area,Volumen;

System.out.println("Ingrese la altura");
        altura = x.nextDouble();


        area = 6*(altura*altura);

        Volumen = (altura*altura*altura);

        
        System.out.println("El area es " + area);

        System.out.println("EL volumen es " + Volumen);

}

public static void Octaedro(){

double altura,area,Volumen;

    System.out.println("Ingrese la altura");
    altura = x.nextDouble();

    area = 2*(altura*altura)*Math.sqrt(3);
    System.out.println("El area es " + area);
    
    //======================================

    Volumen = Math.sqrt(2)/3*(altura*altura*altura);
    System.out.println("El volumen es " + Volumen);
}

public static void Dodecaedro(){

    double altura,area,Volumen;

    System.out.println("Ingrese la altura");
    altura = x.nextDouble();

    area = 3*(altura*altura)*Math.sqrt(35*Math.sqrt(5));
    System.out.println("El area es " + area);

    //======================
    Volumen = (1/4*15+7*Math.sqrt(5))*(altura*altura*altura);
    System.out.println("El volumen es " + Volumen);

}

public static void Icosaedro(){

  double altura,area,Volumen;

   System.out.println("Ingrese la altura");
    altura = x.nextDouble();

    area = (altura*altura)*1.73;
    System.out.println("El area es " + area);

    area = 5*(altura*altura)*Math.sqrt(3);
    System.out.println("El area es " + area);

    //===================================
    Volumen = 5/12*3+Math.sqrt(5)*altura*altura*altura;
    System.out.println("El Volumen es " + Volumen);
}

public static void TroncoCono(){

 double generatriz,RadioMayor,radio,altura,AreaBaseMayor,AreaBaseMenor,AreaLateral,AreaTotal,Volumen;
 
    System.out.println("Ingrese la generatriz");
        generatriz = x.nextDouble();

    System.out.println("Ingrese el radio mayor");
    RadioMayor = x.nextDouble();

    System.out.println("Ingrese el radio");
    radio = x.nextDouble();

     System.out.println("Ingrese la altura");
    altura= x.nextDouble();

    System.out.println("Ingrese el Area Base Mayor");
    AreaBaseMayor = x.nextDouble();

     System.out.println("Ingrese el Area Base Menor");
    AreaBaseMenor = x.nextDouble();

    AreaLateral = (3.14*generatriz)*(RadioMayor+radio);

    System.out.println("El area lateral es " + AreaLateral);

    //=========================================================
    AreaTotal = AreaLateral + AreaBaseMayor + AreaBaseMenor;

    System.out.println("El area total es " + AreaTotal);

    //====================================================
    

    Volumen = (1/3)*3.14*altura*(RadioMayor*RadioMayor)+(radio*radio)+RadioMayor*radio;

    System.out.println("El volumen es " +  Volumen);
}

public static void TroncoPiramide(){

double altura,AreaBaseMayor,AreaBaseMenor,AreaLateral,AreaTotal,Volumen;
double PerimetroBaseMayor,ApotemaP;

System.out.println("Ingrese el Perimetro Base Mayor");
      PerimetroBaseMayor = x.nextDouble();

    System.out.println("Ingrese el Apotema de la Piramide");
    ApotemaP = x.nextDouble();

     System.out.println("Ingrese la altura");
    altura= x.nextDouble();

    System.out.println("Ingrese el Area Base Mayor");
    AreaBaseMayor = x.nextDouble();

     System.out.println("Ingrese el Area Base Menor");
    AreaBaseMenor = x.nextDouble();

    AreaLateral = (PerimetroBaseMayor + PerimetroBaseMayor)/2*ApotemaP;

    System.out.println("El area lateral es " + AreaLateral);

    //=========================================================
    AreaTotal = AreaLateral + AreaBaseMayor + AreaBaseMenor;

    System.out.println("El area total es " + AreaTotal);

    //====================================================
    

    Volumen = (1/3)*altura*(AreaBaseMayor + AreaBaseMenor )+ Math.sqrt(AreaBaseMayor)*Math.sqrt(AreaBaseMenor);

    System.out.println("El volumen es " +  Volumen);
}

}
