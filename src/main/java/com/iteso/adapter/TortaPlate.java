package com.iteso.adapter;

import java.util.ArrayList;

/**
 * Created by felipe.
 */
public class TortaPlate {
    private ArrayList<Torta> tortas;

    public TortaPlate(){
        tortas = new ArrayList<Torta>();
    }

    public void add(Torta torta){
       tortas.add(torta);
   }

    public void servePlate(){
        for (int i = 0; i < tortas.size(); i++){
            Torta torta = tortas.get(i);
            torta.cutByHalf ();
            torta.fill ();
            torta.cover ();
            torta.printDescription ();
        }
    }
}
