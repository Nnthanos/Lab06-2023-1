package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){

        int p = inicio;
        int l = p + 1;

        if (inicio < fim){
            int pivo = array[inicio];

            for (int i = p + 1; i <= fim; i++){
                if ( array[i]< array[p]){
                    int aux =  array[l];
                    array[l] = array[i];
                    array[i] = aux;
                    l++;
                }
            }
        array[p] = array[l-1];
        array[l-1] = pivo;
        p = l - 1;
        }
        return p;
    }
    
}
