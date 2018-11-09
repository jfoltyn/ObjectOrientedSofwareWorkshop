package com.jfoltyn.deserializer;

import java.util.Map;

public interface SerializerReader {
   Map<String, String> read(String object);
}
