import java.util.Scanner;

public class FilesiColumnes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEMANEM FILES I COLUMNES
        System.out.println("Digues quantes files i columnes vols i després els numeros que vols afegir-hi");
        int numFiles = sc.nextInt();
        int numColumnes = sc.nextInt();

        //CREEM STRING ARRAY BIDIMENSIONAL AMB NUM DE FILES I COLUMNES ESPECIFICATS
        //String bidimensional = int[][] arrBid = new int[aquí crea files][aquí crea columnes]
        int[][] taula = new int[numFiles][numColumnes];

        //EMPLENEM ARRAY BIDIMENSIONAL CREANT 1 FOR PER ESPECIFICAR LA FILA I UN SEGON A DINS PER AFEGIR VALORS
        //A LA FILA QUE FARAN DE COLUMNES
        for (int i = 0; i < numFiles; i++) {
            for (int j = 0; j < numColumnes; j++) {
                taula[i][j] = sc.nextInt();
            }
        }

        //AQUI MOSTREM LA TAULA CREADA TAMBE ACCEDINT PRIMER A LES FILES AMB UN FOR I DESPRES UN SEGON FOR
        //PER PODER MOSTRAR ELS VALORS ACCEDINT A LES COLUMNES
        for (int i = 0; i < numFiles; i++) {
            for (int j = 0; j < numColumnes; j++) {
                System.out.print(taula[i][j] + " ");
            }
            System.out.println("");
        }

        //CREEM STRING PER A QUE ESCOLLEIXI QUE VOL FER
        String eleccio;

        //DO WHILE PER A INDICAR-LI QUE MENTRE NO ESCRIGUI "STOP" SEGUEIXI DEMANANT QUE VOL FER
        do {
            System.out.println("Digues que vols mostrar ara: fila, sumaFila, columna, sumaColumna o element");
            eleccio = sc.next();

            //SI ESCOLLEIX FILA, LI DIGUEM QUE ESCRIGUI EL NUMERO DE LA FILA QUE VOL I AMB DOS FORS FEM QUE
            //ACCEDEIXI A LA FILA QUE ACABA DE INDICAR I QUE LA MOSTRI, I QUAN ARRIBA AL FINAL DE LA FILA
            //UN BREAK PER A QUE SURTI DEL FOR PERO NO S'ATURI DEL PROGRAMA, AIXI NO SEGUIRA MOSTRANT ALTRES FILES
            if (eleccio.equals("fila")) {

                System.out.println("Digues el numero de una fila");
                int numeroFila = sc.nextInt();

                for (int i = numeroFila; i < numFiles; i++) {
                    for (int j = 0; j < numColumnes; j++) {
                        System.out.print(taula[i][j] + " ");
                    }
                    System.out.println("");
                    break;
                }
            }else if (eleccio.equals("sumaFila")){
                System.out.println("Digues el numero de la fila que vols sumar");
                int numeroFilaPerSumar = sc.nextInt();
                int sumarFiles = 0;

                //DESPRES D'HABER ESPECIFICAT LA FILA QUE VOLEM SUMAR, SUMEM LES FILES I LA GUARDEM DINS LA VARIABLE
                for (int i = numeroFilaPerSumar; i < numFiles; i++) {
                    for (int j = 0; j < numColumnes; j++) {
                        //AMB LA VARIABLE QUE HEM CREAT FEM QUE ES SUMIN ELS NUMEROS DE L'ARRAY DE LA SEGUENT MANERA
                        //sumarFiles = 0 taula = 2 / 0 + 2 = 2 / sumarFiles = 2
                        //sumarFiles = 2 taula = 3 / 2 + 3 = 5 / sumarFiles = 5 i així successivament
                        sumarFiles = sumarFiles + taula[i][j];
                    }
                    System.out.print(sumarFiles);
                    System.out.println("");
                    break;
                }

                //INDIQUEM QUE SI ESCRIU COLUMNA, DEMANEM UNA VARIABLE PER A QUE INDIQUI QUINA COLUMNA VOL
                //I VAGI FILA PER FILA ACCEDINT A LA POSICIÓ DE LA COLUMNA QUE HAGI INDICAT MOSTRANT NOMÉS EL NUMERO
                //D'AQUELLA COLUMNA
            }else if(eleccio.equals("columna")) {

                System.out.println("Digues el numero de una columna");
                int numeroColumna = sc.nextInt();

                for (int i = 0; i < numFiles; i++) {
                    //Com que només volem mostrar un numero de la columna, fem que j sigui = a la columna que hagi
                    //especificat a la variable i que per a que vagi a la següent posició, només ha de mostrar 1 numero
                    //es a dir: j == valorQueHiHagiEnPosicioIndicada
                    for (int j = numeroColumna; j == numeroColumna; j++) {
                        System.out.println(taula[i][j]);
                    }
                }


            //CREEM UNA VARIABLE PER INDICAR LA COLUMNA I UNA ALTRE PER GUARDAR EL RESULTAT DE LA SUMA DELS VALORS
            //DE LA COLUMNA
            }else if(eleccio.equals("sumaColumna")){
                System.out.println("Digues una columna");
                int columnaPerSumar = sc.nextInt();
                int sumaColumnes = 0;

                //APROFITEM QUE GUARDA EL PRIMER VALOR DE L'ARRAY, (ja que variable = 0 + qualsevol valor d'array = valor d'array)
                //I DESPRES EL SUMA + EL SEGUENT, I GUARDA AQUEST ULTIM RESULTAT I EL SUMA + EL SEGUENT DE L'ARRAY I AIXÍ FINS QUE
                //ACABI L'ARRAY, GUARDANT EL RESULTAT DE L'ULTIMA SUMA
                for (int i = 0; i < numFiles; i++) {
                    for (int j = columnaPerSumar; j == columnaPerSumar; j++) {
                        sumaColumnes = sumaColumnes + taula[i][j];
                    }
                }
                System.out.println(sumaColumnes);

                //AQUI DEMANEM POSICIÓ FILA I POSICIÓ COLUMNA PER PODER ACCEDIR A ELLES I MOSTRAR VALORS
                //COM QUE NOMÉS HEM DE MOSTRAR UN VALOR NO CAL UN FOR SINÓ INDICAR LES POSICIONS AMB ELS VALORS
                //ESCOLLITS COM A POSICIÓ
            }else if(eleccio.equals("element")){

                System.out.println("Digues un valor de la taula");
                int trobarValorFila = sc.nextInt();
                int trobarValorColumna = sc.nextInt();

                //ACCEDIM A ELEMENT I EL MOSTREM
                System.out.println("element " + trobarValorFila + " " + trobarValorColumna + ": " + taula[trobarValorFila][trobarValorColumna]);

            }else if (eleccio.equals("diagonal")){
                if (numFiles == numColumnes){

                }
            }
            //QUAN ESCRIGUI stop SURT DEL DO WHILE, ES A DIR, S'ATURA EL PROGRAMA
        }while (!eleccio.equals("exit"));


        sc.close();
    }
}
