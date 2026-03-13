package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class StreamWriteException extends JsonProcessingException {
    protected transient JsonGenerator _processor;

    public StreamWriteException(String str, JsonGenerator jsonGenerator) {
        super(str, null);
        this._processor = jsonGenerator;
    }
}
