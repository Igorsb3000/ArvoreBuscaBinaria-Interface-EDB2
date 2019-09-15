package br.com.waldson.aula11;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //esta errado, o certo eh arvorebuscabinaria
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        Random random = new Random();
        for(int i=0; i<30; i++){
            arvore.insert(new Node(random.nextInt() % 100));
        }
        arvore.insert(new Node(10));
        arvore.insert(11);
        arvore.insert(9);
        arvore.insert(20);
        arvore.insert(5);
        arvore.insert(8);
        arvore.insert(16);

        /*Node n = arvore.search(80);
        if (n != null) {
            System.out.println("Elemento encontrado");
        } else {
            System.out.println("Elemento não encontrado");
        }*/
        JFrame frame = new JFrame("Visualizador de ABB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JLabel label = new JLabel ("Hello World");
        JLabel labe2 = new JLabel ("Hello World 2");
        //frame.add(label);
        //frame.add(labe2);

        ArvoreBinariaBuscaView view = new ArvoreBinariaBuscaView(arvore);
        frame.add(view);
        frame.setVisible(true); //exibe o metodo na tela, deve ser sempre a ultima


    }
}
