package com.example.shane.criminallintent;

import android.content.Context;

/**
 * Created by Shane on 12/28/2015.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){

    }
}
