package com.microsoft.cognitiveservices.speech.diagnostics.logging;

import com.microsoft.cognitiveservices.speech.Diagnostics;
import com.microsoft.cognitiveservices.speech.diagnostics.logging.Logger;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class MemoryLogger {
    public static List<String> dump() {
        ArrayList arrayList = new ArrayList();
        long c10 = Logger.c();
        for (long d8 = Logger.d(); d8 < c10; d8++) {
            arrayList.add(Logger.b(d8));
        }
        return arrayList;
    }

    public static void setFilters() {
        Logger.h(new String[0]);
    }

    public static void setLevel(Level level) {
        Contracts.throwIfNull(level, StubApp.getString2(9577));
        Logger.g(Logger.Type.Memory, level);
    }

    public static void start() {
        Diagnostics.startMemoryLogging();
    }

    public static void stop() {
        Diagnostics.stopMemoryLogging();
    }

    public static void dump(OutputStream outputStream) throws IOException {
        Contracts.throwIfNull(outputStream, StubApp.getString2(16025));
        long c10 = Logger.c();
        for (long d8 = Logger.d(); d8 < c10; d8++) {
            outputStream.write(Logger.b(d8).getBytes());
        }
    }

    public static void setFilters(String[] strArr) {
        Contracts.throwIfNull(strArr, StubApp.getString2(16020));
        Logger.h(strArr);
    }

    public static void dump(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(6265));
        Diagnostics.dumpMemoryLog(str, "", false, false);
    }
}
