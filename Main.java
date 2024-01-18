public class Main {
    public static void main(String[] args) {

        String[][] bada = new String[9][3];

        for(int i =0 ; i<bada.length;i++){
            for(int de = 0 ; de<bada[de].length;de++){
                if(de == 0|| de == 2||de == 1){
                    bada[i][de] = " * ";
                    if(de == 1){
                        if(i == 5 ||i ==4 || i ==6 || i==7 ||i == 1 ||i == 2){
                            bada[i][de] = "  ";
                        }
                }
                    if(de == 2){
                        if(i == 0 || i ==3 || i==8){
                            bada[i][de] = "  ";
                        }
                    }

                }
           //     else if(||de ==2 && i == 1 && i == 2 && i == 4 && i == 5&& i ==6 && i ==7){
             //       bada[i][de] = " * ";
               // }

            }
        }


        for(String[] delta: bada){
            for(String don:delta){
                System.out.print(don);
            }
            System.out.println();
        }
    }
}