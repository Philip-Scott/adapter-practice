package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

/**
 * Created by felipe
 */
public class TacoAdapter implements Torta {
    Taco taco;

    public TacoAdapter (Taco taco){
        this.taco = taco;
    }


    public void cutByHalf () {

    }

    public void fill () {
        taco.fill ();

    }

    public void cover () {
        taco.fold ();

    }


    public void printDescription () {
        taco.printDescription();
    }
}
