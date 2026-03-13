package io.flutter.plugin.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class FlutterException extends RuntimeException {
    private static final String TAG = StubApp.getString2(18672);
    public final String code;
    public final Object details;

    public FlutterException(String str, String str2, Object obj) {
        super(str2);
        this.code = str;
        this.details = obj;
    }
}
