package com.microsoft.cognitiveservices.speech.diagnostics.logging;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Level {
    public static final Level Error;
    public static final Level Info;
    public static final Level Verbose;
    public static final Level Warning;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Level[] f12570a;

    static {
        Level level = new Level(StubApp.getString2(3997), 0);
        Error = level;
        Level level2 = new Level(StubApp.getString2(13367), 1);
        Warning = level2;
        Level level3 = new Level(StubApp.getString2(13365), 2);
        Info = level3;
        Level level4 = new Level(StubApp.getString2(16021), 3);
        Verbose = level4;
        f12570a = new Level[]{level, level2, level3, level4};
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) f12570a.clone();
    }
}
