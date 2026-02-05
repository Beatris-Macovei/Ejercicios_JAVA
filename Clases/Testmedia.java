public class Testmedia {
  public static void main(String[]args) {
    Media julio = new Media();
    indiceGlucemico azucar = new indiceGlucemico();
    
    double cuello = julio.media();
    System.out.println(cuello);
    
    double resultado = azucar.indiceGlucemico();
    System.out.println(resultado);
  }
}
