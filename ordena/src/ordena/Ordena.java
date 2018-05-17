package ordena;



/**
 *
 * @author Gabriel
 */
public class Ordena {

    
    static int[] v = {5, 3, 6, 8, 9, 2, 10, 35, 33,40};


    public static void ordenacionShell(int[] v) {
        
        int largo = v.length;

        int grupo = largo;
        do {
            grupo = grupo / 2;
            for (int k = 0; k < grupo; k++) {
                for (int i = grupo + k; i < largo; i += grupo) {
                    int j = i;
                    while (j - grupo >= 0 && v[j] < v[j - grupo]) {
                        int tmp = v[j];
                        v[j] = v[j - grupo];
                        v[j - grupo] = tmp;
                        j = j - grupo;
                    }
                }
            }
        } while (grupo > 1);
    }

    

    public static void main(String[] args) {
        

        System.out.println("vector desordenado");
        for (int i = 0; i < v.length; i++) {

            System.out.print("[" + v[i] + "]");
        }
        System.out.println(" ");
        System.out.println("vector ordenado");
        ordenacionShell(v);
        for (int i = 0; i < v.length; i++) {
            int w = v[i];
            System.out.print("[" + w + "]");
        }
 

    }

}
