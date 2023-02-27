package br.com.fitbank.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.time.Instant;

public class InstantDeSerializer implements JsonDeserializer<Instant> {

    @Override
    public Instant deserialize(JsonElement jelement, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        return Instant.parse(jelement.getAsString());
    }

}