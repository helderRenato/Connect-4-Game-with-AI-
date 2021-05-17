package connect4_commandline;
import java.util.Scanner;
public class Connect4_commandline {
    int token = 2;
    public static void main(String[] args) {
        Connect4_commandline c = new Connect4_commandline();
        
        Scanner ler = new Scanner(System.in);//variavel de leitura
        int resp = 0 ; //variavel que aloca em que [r][c] o user vai jogar
        int[][] board = new int[6][7]; //matriz de controlo
        
        boolean win = false;
        while( win == false){
            c.board(board);
            System.out.println("> ");
            resp = ler.nextInt();
            if(resp >= 0 && resp <= 6){
                c.move(resp, board);
                win = c.win(board);
            }
        }
        
    }
    
    //Criar o tabuleiro
    public void board(int[][] board){
        System.out.println("0 1 2 3 4 5 6");
        System.out.println("=============");
        for(int r = 0 ; r < 6 ; ++r){
            for(int c = 0 ; c <= 6 ; ++c){
                System.out.print(board[r][c]+" ");   
            }
            System.out.println("");
        }
    }
    //end criartabuleiro
    
    //saber em que local ele vai jogar e ocupar esse lugar
    public void move(int resp, int[][] board){
        int c = resp, lugarVazio = -1;
        for(int r = 0 ; r < 6 ; ++r){
            //ver que linha mais abaixo esta livre
            if( board[r][c] == 0 ){
                ++lugarVazio;
            }
        }
        //ocupar o lugar vazio encontrado se tiver algum
        if(lugarVazio != -1){
            board[lugarVazio][c] = vez();
        }
    }
    //end move
    
    public int vez(){
        if(token == 1){
            token = 2;
            return token;
        }else{
            token = 1;
            return token; 
        }
    }
    //end vez
    
    public boolean win(int[][] b){
        //verificar nas linhas
        for(int r = 0 ; r < 6 ; ++r){
            for(int c = 0 ; c <= 3 ; ++c){
                if(b[r][c] != 0){
                    if(b[r][c] == b[r][c+1] && b[r][c+1] == b[r][c+2] && b[r][c+2] == b[r][c+3]){
                        return true;
                    }
                }
            }
        }
  
        //verificar vitoria nas colunas 
        for(int r = 0 ; r < 3 ; ++r){
            for(int c = 0 ; c <= 6 ; ++c){
                if(b[r][c] != 0){
                    if(b[r][c] == b[r+1][c] && b[r+1][c] == b[r+2][c] && b[r+2][c] == b[r+3][c]){
                        return true;
                    }
                }
            }
        }
        
        //verificar nas diagonais principais
        for(int r = 0 ; r < 3 ; ++r){
            for(int c = 0 ; c <= 3 ; ++c){
                if( b[r][c] != 0 ){
                    if( b[r][c] == b[r+1][c+1] && b[r+1][c+1] == b[r+2][c+2] && b[r+2][c+2] == b[r+3][c+3]){
                        return true;
                    }
                }
            }
        }
        
        //verificar nas diagonais secundarias
        for(int r = 3 ; r < 6 ; ++r){
            for(int c = 0 ; c <= 3 ; ++c){
                if( b[r][c] != 0 ){
                    if( b[r][c] == b[r-1][c+1] && b[r-1][c+1] == b[r-2][c+2] && b[r-2][c+2] == b[r-3][c+3]){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}
