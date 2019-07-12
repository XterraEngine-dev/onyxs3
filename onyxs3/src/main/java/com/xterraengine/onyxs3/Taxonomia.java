package com.xterraengine.onyxs3;

public class Taxonomia {

    public String firma(String nombreapp, String usuario, String operacion, String uid, String timestamp){
        return nombreapp+"_"+operacion+"_"+usuario+"_"+"firma"+"_"+uid+"_"+timestamp;
    }
    public String foto(String usuario, String uid, String timestamp){
        return usuario+"_"+"foto"+"_"+uid+"_"+timestamp;
    }


}
