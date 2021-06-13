package Connect4;

import java.util.Arrays;
import java.util.Random;

public class Robot {
    private GamePlay g = new GamePlay();
    private int move = 0;
    private int score = 0;

    
    //  Função para criar uma copia de uma matriz para não alterar a original
    public int[][] clone(int[][] b) {
        int[][] newBoard = new int[b.length][];
        for (int i = 0; i < b.length; i++) {
            newBoard[i] = Arrays.copyOf(b[i], b[i].length);
        }
        return newBoard;
    }
    
    public Robot(){
        this(0, 0);
    }
    
    private Robot(int move, int score){
        this.move = move;
        this.score = score;
    }
    
    private int getScore(){
        return this.score;
    }
    
    public int getMove(){
        return this.move;
    }
 
    
    //Função para verificar 2 em linha 
    public boolean twoInRow(int[][] b, int player){
        for(int r = 0 ; r < 6 ; ++r){
            for(int c = 0 ; c <= 6 ; ++c){
                //verificar linhas 
                if(c <= 3){
                    if(b[r][c] == player && b[r][c+1] == player && b[r][c+2] == 0 && b[r][c+3] == 0){
                        return true;
                    }
                }
                if(c > 3){
                    // linhas a esquerda
                    if(b[r][c] == player && b[r][c-1] == player && b[r][c-2] == 0 && b[r][c-3] == 0){
                        return true;
                    }    
                }
                //verificar colunas 
                if(r < 3){
                    if(b[r][c] == 0 && b[r+1][c] == 0 && b[r+2][c] == player && b[r+3][c] == player){
                        return true;
                    } 
                    if(c <= 3){
                        //verificar diagonais principais
                        if( b[r][c] == player && b[r+1][c+1] == player && b[r+2][c+2] == 0 && b[r+3][c+3] == 0){
                            return true;
                        }
                    }
                }
            }
        }
        //verificar nas diagonais secundarias
        for(int r = 3 ; r < 6 ; ++r){
            for(int c = 0 ; c <= 3 ; ++c){
                if( b[r][c] == player && b[r-1][c+1] == player && b[r-2][c+2] == 0 && b[r-3][c+3] == 0){
                    return true;
                }
            }
        }
    return false;
    }
 
    //Função para verificar 3 em linha 
    public boolean threeInRow(int[][] b, int player){
        for(int r = 0 ; r < 6 ; ++r){
            for(int c = 0 ; c <= 6 ; ++c){
                //verificar linhas 
                if(c <= 3){
                    if(b[r][c] == player && b[r][c+1] == player && b[r][c+2] == player && b[r][c+3] == 0){
                        return true;
                    }
                }
                if(c > 3){
                    // linhas a esquerda
                    if(b[r][c] == player && b[r][c-1] == player && b[r][c-2] == player && b[r][c-3] == 0){
                        return true;
                    }    
                }
                //verificar colunas 
                if(r < 3){
                    if(b[r][c] == 0 && b[r+1][c] == player && b[r+2][c] == player && b[r+3][c] == player){
                        return true;
                    } 
                    
                    if(c <= 3){
                        //verificar diagonais principais
                        if( b[r][c] == player && b[r+1][c+1] == player && b[r+2][c+2] == player && b[r+3][c+3] == 0){
                            return true;
                        }
                    }
                }
            }
        }
        //verificar nas diagonais secundarias
        for(int r = 3 ; r < 6 ; ++r){
            for(int c = 0 ; c <= 3 ; ++c){
                if( b[r][c] == player && b[r-1][c+1] == player && b[r-2][c+2] == player && b[r-3][c+3] == 0){
                    return true;
                }
            }
        }
    return false;
    }
    
    //Função para calcular o score de cada posição do board
    public int calculateScore(int[][] b , int player){
        int opponent = 0, score = 0;
        if(player == 1){opponent = 2;}else{opponent = 1;}
        
        int centro = 0;
        for(int r = 0 ; r < 6 ; ++r){
            if(b[3][r] == player){
                ++centro;
            }
        }
        score += centro * 6;
        if(g.win(b) == player){
            score += 100;
        }
        if(threeInRow(b, player)){
            score += 10;
        }
        if(twoInRow(b, player)){
            score += 5;
        }

        if(threeInRow(b, opponent)){
            score -= 80;
        }
    return score;
    }
    
    //Função para escolher o melhor movimento apartir do Score
    public int bestMove(int[][] b , int player){
        int bestScore = Integer.MIN_VALUE;
        int move = g.posicoesVazias(b).get( new Random().nextInt(g.posicoesVazias(b).size() ));
        
        for (int col : g.posicoesVazias(b)){
            int[][] board = clone(b);
            g.move(col, board, player);
            int score = calculateScore(board, player); 
            System.out.println(score);
            if(score > bestScore){
                bestScore = score;
                move = col;
            }
        }
    return move;
    }
    
    public Robot minmax(int[][] b, int ply , int alpha , int beta , boolean isMaximizing){
        // verificar (vitória , derrota ou parar de procurar)
        if(g.gameOver(b)){
            int winner = g.win(b);
            switch(winner){
                case 1:
                    return new Robot(0, -1000000000);
                case 2:
                    return new Robot(0, 1000000000);
                default:
                    return new Robot(0, 0);
            }   
        }else if(ply == 0){
            return new Robot(0, calculateScore(b, 2));
        }
        
        //maximizar e minimizar 
        if(isMaximizing){
            int maxValue = Integer.MIN_VALUE;
            int bestMove = g.posicoesVazias(b).get( new Random().nextInt(g.posicoesVazias(b).size() ));
            
            for(int colunas : g.posicoesVazias(b)){
                int[][] board = clone(b);
                g.move(colunas, board, 2);
                int score = minmax(board, ply - 1, alpha, beta, false).getScore();
                if(score > maxValue){
                    maxValue = score;
                    bestMove = colunas;
                }
                alpha = Math.max(alpha, maxValue);
                if(alpha >= beta){
                    break;
                }
            }
        return new Robot(bestMove, maxValue);
        }else{
            int minValue = Integer.MAX_VALUE;
            int bestMove = g.posicoesVazias(b).get( new Random().nextInt(g.posicoesVazias(b).size() ));
            
            for(int colunas : g.posicoesVazias(b)){
                int[][] board = clone(b);
                g.move(colunas, board, 1);
                int score = minmax(board, ply - 1, alpha, beta, true).getScore();
                if(score < minValue){
                    minValue = score;
                    bestMove = colunas;
                }
                beta = Math.min(beta, minValue);
                if(alpha >= beta){
                    break;
                }
            }
        return new Robot(bestMove, minValue);   
        }
    }
}

