/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.testes.infra;


/**
 *
 * @author joao
 */
public class Teste {
    
    public static void main(String[] args){
        //int[] A= {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
        int[] A= {-3, -3};
        System.out.println(solution(A));
    }
    
    public static int solution(int[] A) {
        // write your code in Java SE 8
        //N = segmentos
        //A = altura de cada segmento
        
        int N = A.length;
        int contadorDeCastelos = 0;
        int alturaSegmentoAnterior = 0;
        boolean houveElevacao = false;
        boolean houveDiminuicao = false;
        for(int i = 0; i < N; i++){
            int alturaSegmento = A[i];
            if(i == 0){
                alturaSegmentoAnterior = alturaSegmento;
            } else {
                if(alturaSegmentoAnterior == alturaSegmento){
                    //não faz nada
                } else if(alturaSegmentoAnterior < alturaSegmento){
                    if(!houveElevacao == !houveDiminuicao){
                        contadorDeCastelos++;
                    }
                    houveElevacao = true;
                    if(houveDiminuicao){
                        contadorDeCastelos++;
                        houveDiminuicao = false;
                    }
                } else if(alturaSegmentoAnterior > alturaSegmento){
                    if(!houveElevacao == !houveDiminuicao){
                        contadorDeCastelos++;
                    }
                    houveDiminuicao = true;
                    if(houveElevacao){
                        contadorDeCastelos++;
                        houveElevacao = false;
                    }
                }
            }
            if(i == N-1){
                contadorDeCastelos++;
            }
        }
        return contadorDeCastelos;
    }
    
}
