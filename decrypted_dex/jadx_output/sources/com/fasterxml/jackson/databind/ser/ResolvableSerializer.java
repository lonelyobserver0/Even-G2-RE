package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ResolvableSerializer {
    void resolve(SerializerProvider serializerProvider) throws JsonMappingException;
}
