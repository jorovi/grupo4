/**
 * Ejemplo de código Java Repetido
 * 
 * @author      Paco Gomez <fjgomez@florida-uni.es>
 * @version     1.0 
 * @since       1.2          (the version of the package this class was first added to)
 */
public class Refactor01 {

    public static void main(String[] args) {
        float areaCuadrado = 0;
        float areaCirculo = 0;
        float areaRectangulo = 0;
        areas(areaCuadrado,areaCirculo,areaRectangulo);
    }
    
    public static void areas(float areaCuadrado,float areaCirculo, float areaRectangulo){
        //Cuadrado
                int lado=3;
                areaCuadrado=lado*lado;
                
        //Circulo
                float pi=3.14f;
                int radio=3;
                areaCirculo=pi*radio*radio;
                
        //Rectangulo
                int base=3;
                int altura=6;
                areaRectangulo=base*altura;
                
        System.out.println("------------ AREAS ------------");
        System.out.println("cuadrado: "+areaCuadrado+" Circulo: "+areaCirculo+" Rectangulo: "+areaRectangulo);
        System.out.println("-------------------------------");
        
    }
}