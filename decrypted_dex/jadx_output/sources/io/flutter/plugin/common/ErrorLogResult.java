package io.flutter.plugin.common;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ErrorLogResult implements MethodChannel.Result {
    private int level;
    private String tag;

    public ErrorLogResult(String str) {
        this(str, 5);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(String str, String str2, Object obj) {
        if (obj != null) {
            new StringBuilder(StubApp.getString2(18665)).append(obj);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(Object obj) {
    }

    public ErrorLogResult(String str, int i3) {
        this.tag = str;
        this.level = i3;
    }
}
