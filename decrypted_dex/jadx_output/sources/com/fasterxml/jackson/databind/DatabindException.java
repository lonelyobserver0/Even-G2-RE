package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DatabindException extends JsonProcessingException {
    public DatabindException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
    }

    public abstract void prependPath(Object obj, String str);

    public DatabindException(String str) {
        super(str);
    }

    public DatabindException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    public DatabindException(String str, Throwable th) {
        this(str, null, th);
    }
}
