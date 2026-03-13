package com.fasterxml.jackson.core;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ObjectCodec extends TreeCodec {
    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException;
}
