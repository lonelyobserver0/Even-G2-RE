package com.google.gson;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ToNumberStrategy {
    Number readNumber(JsonReader jsonReader) throws IOException;
}
