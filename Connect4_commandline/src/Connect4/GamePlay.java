package Connect4;
import java.util.ArrayList;

public class GamePlay {
    //saber em que local ele vai jogar e ocupar esse lugar
    public int move(int resp, int[][] board, int token){
        int c = resp, lugarVazio = -1;
        for(int r = 0 ; r < 6 ; ++r){
            //ver que linha mais abaixo esta livre
            if( board[r][c] == 0 ){
                ++lugarVazio;
            }
        }
        //ocupar o lugar vazio encontrado se tiver algum
        if(lugarVazio != -1){
            board[lugarVazio][c] = token;
            return 1;
        }
        return 0;
    }
    //end move
    public int vez(int token){
        if(token == 1){
            token = 2;
            return token;
        }else {
            token = 1;
            return token; 
        }
    }
    //end vez
        
   //verificar se o board esta totalmente vazio
    public boolean isEmpty(int[][] b){
        int i = 0;
        for(int r = 0; r < 6 ; ++r){
            for(int c = 0; c <= 6; ++c){
                if(b[r][c] == 0){
                        ++i;
                }
            }
        }
        return (i == 42);
    }
   //end isEmpty
    
    // verificar se o board esta completamente cheio
    public boolean isFull(int[][] b){
        int i = 0;
        for(int r = 0; r < 6 ; ++r){
            for(int c = 0; c <= 6; ++c){
                if(b[r][c] == 0){
                        ++i;
                }
            }
        }
        return (i == 0);
    }
    
    public int win(int[][] b){
        //verificar nas linhas
        for(int r = 0 ; r < 6 ; ++r){
            for(int c = 0 ; c <= 3 ; ++c){
                if(b[r][c] != 0){
                    if(b[r][c] == b[r][c+1] && b[r][c+1] == b[r][c+2] && b[r][c+2] == b[r][c+3]){
                        return b[r][c];
                    }
                }
            }
        }
  
        //verificar vitoria nas colunas 
        for(int r = 0 ; r < 3 ; ++r){
            for(int c = 0 ; c <= 6 ; ++c){
                if(b[r][c] != 0){
                    if(b[r][c] == b[r+1][c] && b[r+1][c] == b[r+2][c] && b[r+2][c] == b[r+3][c]){
                        return b[r][c];
                    }
                }
            }
        }
        
        //verificar nas diagonais principais
        for(int r = 0 ; r < 3 ; ++r){
            for(int c = 0 ; c <= 3 ; ++c){
                if( b[r][c] != 0 ){
                    if( b[r][c] == b[r+1][c+1] && b[r+1][c+1] == b[r+2][c+2] && b[r+2][c+2] == b[r+3][c+3]){
                        return b[r][c];
                    }
                }
            }
        }
        
        //verificar nas diagonais secundarias
        for(int r = 3 ; r < 6 ; ++r){
            for(int c = 0 ; c <= 3 ; ++c){
                if( b[r][c] != 0 ){
                    if( b[r][c] == b[r-1][c+1] && b[r-1][c+1] == b[r-2][c+2] && b[r-2][c+2] == b[r-3][c+3]){
                        return b[r][c];
                    }
                }
            }
        }
        
        return 0;
    }
    public boolean gameOver(int[][] b){
        if(isFull(b)){
            return true;
        }else if(win(b) != 0){
            return true;
        }
    
    return false;
    }
    
    public int nextOpenRow(int[][] b, int coluna){
        int lugarVazio = -1;
        for(int r = 0 ; r < 6 ; ++r){
            //ver que linha mais abaixo esta livre
            if( b[r][coluna] == 0 ){
                ++lugarVazio;
            }
        }
        return lugarVazio;
    }
    
    public boolean posicaoValida(int[][] b, int coluna){
        if(nextOpenRow(b, coluna) != -1){//significa que a uma linha aberta 
            return true;
        }
        return false;
    }
    
    public ArrayList<Integer> posicoesVazias(int b[][]){
        ArrayList<Integer> p = new ArrayList<Integer>();
        for(int c = 0; c <= 6 ; ++c){
            if(posicaoValida(b, c)){
                p.add(c); //pegando todas a colunas com posiçoes vazias
            }
        }
        return p;
    }
   
}
