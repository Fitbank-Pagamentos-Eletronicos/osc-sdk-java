package br.com.fitbank.utils;

import br.com.fitbank.utils.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.Instant;

public class JSON {

    public static Gson getGson(){
        GsonBuilder build = new GsonBuilder();
        build.registerTypeAdapter(Instant.class, new InstantDeSerializer());
        return build.create();
    }

}
