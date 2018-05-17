package seleccion;

import java.util.Arrays;

public class Seleccion {

    public static void main(String[] args) {
        Integer[] v = {46, 57, 14, 44, 96, 20, 8, 70};
        Seleccion s = new Seleccion();
        s.Seleccion(v);
    }

    public void Seleccion(Integer[] v) {

        for (int i = 0; i < v.length; i++) {
            int p=i;
            for (int j =i+1; j < v.length; j++) {
                if(v[j]<v[p]){
                    p=j;
                }
            }
           
            int temp=v[i];
            v[i]=v[p];
            v[p]=temp;
            System.out.println(Arrays.deepToString(v));
        }
        
    }
}
