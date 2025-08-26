package acciones;

public class calculadora {
    
    public static void sumar (int a, int b){
        System.out.println("el resultado es___________" + (a+b));         
    }
    public static void restar(int ab , int bc){
        System.out.println("el resultado es___________" + (ab-bc));      
    }
    public static void multi(int aa, int bb){
        System.out.println("el resultado es___________" + (aa*bb));   
    }
    public static void div(int an, int bn){
        System.out.println("el resultado es___________" + (an/bn));       
    }
    public static void pot(int av, int bv){
        System.out.println("el resultado es___________" + Math.pow(av, bv));    
    }
    public static void raiz(int ad){
        System.out.println("el resultado es___________" + Math.sqrt(ad));    
    }
}
