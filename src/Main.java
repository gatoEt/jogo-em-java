import java.util.Scanner;
import java.util.Random;

class Main{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        Random rand = new Random();

        String[][] mapa = new String[10][10];
        int l = ler.nextInt();
        int c = ler.nextInt();



        while(true){

            if(l < 10 && l >= 0 && c < 10 && c >= 0){
                for(int i = 0; i < 10; i++){
                    for(int j = 0; j < 10; j++){
                        if(i == l && j == c){
                            mapa[i][j] = "P";
                        }
                        else{
                            mapa[i][j] = "[]";
                        }
                    }

                }

                for(int i = 0; i < 10; i++){
                    for(int j = 0; j < 10; j++){
                        IO.print(mapa[i][j]+" ");
                    }
                    System.out.println();
                }
                char d = ler.next().charAt(0);
                if (d == 'd'){

                    c++;
                }
                else if(d == 'a'){
                    c--;
                }
                else if (d == 'w'){
                    l--;
                }
                else if( d == 's'){
                    l++;
                }

            }

        }
    }

}