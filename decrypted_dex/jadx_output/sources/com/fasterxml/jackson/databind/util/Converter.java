package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface Converter<IN, OUT> {

    public static abstract class None implements Converter<Object, Object> {
    }

    OUT convert(IN in);

    JavaType getInputType(TypeFactory typeFactory);

    JavaType getOutputType(TypeFactory typeFactory);
}
