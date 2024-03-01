/*
 * Hacer un seguimiento (prueba de escritorio) del siguiente grupo de instrucciones: 
INICIO 
  SUMA = 0 
  X = 20 
  SUMA = SUMA + X 
  Y = 40
  X = X + Y ** 2 
  SUMA = SUMA + X / Y 
  ESCRIBA: “EL VALOR DE LA SUMA ES:”, SUMA 
FIN_INICIO

 */
package segundoejercicio;

public class SegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double resultadoSuma = 0;
        int variableX = 20;
        int variableY = 40;
        System.out.println(" ");
        System.out.println("suma = "+ resultadoSuma);
        System.out.println("X = " + variableX);
        System.out.println("Y = " + variableY);
        
        System.out.println(" ");
        System.out.println("paso uno");
        System.out.println("Resultado de la Suma: " + resultadoSuma);
        System.out.println("Variable X: " + variableX);
        System.out.println("Variable Y: " + variableY);
        
        System.out.println(" ");
        System.out.println("paso dos");
        resultadoSuma = resultadoSuma + variableX;
        System.out.println("Nuevo resultado de la Suma: " + resultadoSuma);
        
        System.out.println(" ");
        System.out.println("paso tres");
        variableX = variableX + (int) (variableY * variableY);
        System.out.println("Nuevo valor variable d X: " + variableX);
        
        
        System.out.println(" ");
        System.out.println("paso cuatro");
        resultadoSuma = resultadoSuma + (double) (variableX / variableY);
        System.out.println("Nuevo resultado final de la Suma: " + resultadoSuma);
        
        System.out.println("Fin del Proceso");
    }
    
}
