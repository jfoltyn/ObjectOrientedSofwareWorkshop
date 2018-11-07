package com.jfoltyn.serializer;

import java.util.Map;

public interface SerializerWriter {
   String write(Map<String, Object> map);
}
