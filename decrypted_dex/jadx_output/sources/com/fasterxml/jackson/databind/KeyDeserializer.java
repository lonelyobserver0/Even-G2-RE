package com.fasterxml.jackson.databind;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class KeyDeserializer {

    public static abstract class None extends KeyDeserializer {
    }

    public abstract Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException;
}
