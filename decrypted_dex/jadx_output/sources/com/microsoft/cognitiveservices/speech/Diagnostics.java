package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Diagnostics {
    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void dumpMemoryLog(String str, String str2, boolean z2, boolean z10) {
        Contracts.throwIfFail(logMemoryDump(str, str2, z2, z10));
    }

    public static void dumpMemoryLogOnExit(String str, String str2, boolean z2, boolean z10) {
        Contracts.throwIfFail(logMemoryDumpOnExit(str, str2, z2, z10));
    }

    private static final native long logConsoleStartLogging(boolean z2);

    private static final native long logConsoleStopLogging();

    private static final native long logFileStartLogging(String str, boolean z2);

    private static final native long logFileStopLogging();

    private static final native long logMemoryDump(String str, String str2, boolean z2, boolean z10);

    private static final native long logMemoryDumpOnExit(String str, String str2, boolean z2, boolean z10);

    private static final native long logMemoryStartLogging();

    private static final native long logMemoryStopLogging();

    public static void startConsoleLogging() {
        startConsoleLogging(true);
    }

    public static void startFileLogging(String str, boolean z2) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(15702));
        Contracts.throwIfFail(logFileStartLogging(str, z2));
    }

    public static void startMemoryLogging() {
        Contracts.throwIfFail(logMemoryStartLogging());
    }

    public static void stopConsoleLogging() {
        Contracts.throwIfFail(logConsoleStopLogging());
    }

    public static void stopFileLogging() {
        Contracts.throwIfFail(logFileStopLogging());
    }

    public static void stopMemoryLogging() {
        Contracts.throwIfFail(logMemoryStopLogging());
    }

    public static void startConsoleLogging(boolean z2) {
        Contracts.throwIfFail(logConsoleStartLogging(z2));
    }
}
