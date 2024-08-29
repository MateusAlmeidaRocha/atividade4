
public class Main {
  public static void main(String[] args) {
    int[] lista = {7,9,3,1,2,12};
    int aux;
    for(int i = 1; i < lista.length; i++){
      aux = lista[i];
      int j = i - 1;
      while(j >= 0 && lista[j] > aux){
        lista[j+1] = lista[j];
        j = j - 1;
      }
      lista[j+1] = aux;
    }
    for(int i = 0; i < lista.length; i++){
      System.out.println(lista[i]);
    }
  }

 
}