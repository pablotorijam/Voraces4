import java.util.ArrayList;

public class main {

    public static boolean hayDivision(int[] valores){

        int[] solucion1 = new int[valores.length];
        int[] solucion2 = new int[valores.length];

        ArrayList<Integer> copia = new ArrayList<>();
        for(int i=0;i< valores.length;i++)
            copia.add(valores[i]);

        int candidato;
        int suma1=0,suma2=0,i1=0,i2=0;

        boolean sol = false;

        if(valores.length%2 == 0) {
            while (!copia.isEmpty()) {

                candidato = elegirMayor(copia);
                copia.remove(new Integer(candidato));

                suma1 = sumarVector(solucion1);
                suma2 = sumarVector(solucion2);

                if (suma1 > suma2) {
                    solucion2[i2] = candidato;
                    i2++;
                } else {
                    solucion1[i1] = candidato;
                    i1++;
                }
            }
            if (i1==i2) {
                if (solucion1.length == (valores.length / 2)) ;
                    sol= true;
            }
        }
        return sol;
    }

    public static int elegirMayor(ArrayList<Integer> valores){

        int mayor = valores.get(0);

        for(int i=1;i<valores.size();i++){
            if(valores.get(i)> mayor)
                mayor = valores.get(i);
        }
        return mayor;
    }

    public static int sumarVector(int[]vector){

        int suma=0;

        for(int i=0;i<vector.length;i++){
            suma += vector[i];
        }
        return suma;
    }

    public static void main(String[] args) {

        int[] valores= {5,8,7,1,3};

        boolean sol;

        sol= main.hayDivision(valores);

        System.out.println(sol);
    }
}
