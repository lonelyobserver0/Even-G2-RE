package com.mapbox.maps.text;

import androidx.annotation.Keep;
import com.stub.StubApp;
import java.text.Normalizer;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class StringUtils {
    @Keep
    public static String unaccent(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll(StubApp.getString2(14588), "");
    }
}
