package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        if (array != null){
            int max = array[0];
            for (int i : array) {
                if(i > max){
                    max = i;
                }
            }
            boolean[] arrayAux = new boolean[max+1];

            for (int j : array) {
                arrayAux[j] = true;
            }
            int k = 0;
            for (int l = 0; l < arrayAux.length; l++ ){
                if (arrayAux[l] == true){
                    array[k] = l;
                    k += 1;
                }
            }
            }
        return array;
    }
    
}
