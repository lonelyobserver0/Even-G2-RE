package com.microsoft.cognitiveservices.speech.diagnostics.logging;

import com.microsoft.cognitiveservices.speech.Diagnostics;
import com.microsoft.cognitiveservices.speech.diagnostics.logging.Logger;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class FileLogger {
    public static void setFilters() {
        Logger.a(new String[0]);
    }

    public static void setLevel(Level level) {
        Contracts.throwIfNull(level, StubApp.getString2(9577));
        Logger.g(Logger.Type.File, level);
    }

    public static void start(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(6265));
        start(str, false);
    }

    public static void stop() {
        Diagnostics.stopFileLogging();
    }

    public static void setFilters(String[] strArr) {
        Contracts.throwIfNull(strArr, StubApp.getString2(16020));
        Logger.a(strArr);
    }

    public static void start(String str, boolean z2) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(6265));
        Diagnostics.startFileLogging(str, z2);
    }
}
