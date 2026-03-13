package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class InvalidFormatException extends MismatchedInputException {
    protected final Object _value;

    public InvalidFormatException(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        super(jsonParser, str, cls);
        this._value = obj;
    }

    public static InvalidFormatException from(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        return new InvalidFormatException(jsonParser, str, obj, cls);
    }
}
