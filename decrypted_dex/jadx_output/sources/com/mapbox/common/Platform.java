package com.mapbox.common;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IOS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Platform {
    private static final /* synthetic */ Platform[] $VALUES;
    public static final Platform ANDROID;
    public static final Platform IOS;
    public static final Platform LINUX = new Platform(StubApp.getString2(13419), 0, StubApp.getString2(13418));
    public static final Platform MAC_OS;
    private String str;

    private static /* synthetic */ Platform[] $values() {
        return new Platform[]{LINUX, IOS, ANDROID, MAC_OS};
    }

    static {
        String string2 = StubApp.getString2(1877);
        IOS = new Platform(string2, 1, string2);
        ANDROID = new Platform(StubApp.getString2(1876), 2, StubApp.getString2(13258));
        MAC_OS = new Platform(StubApp.getString2(13421), 3, StubApp.getString2(13420));
        $VALUES = $values();
    }

    private Platform(String str, int i3, String str2) {
        this.str = str2;
    }

    private int getValue() {
        return ordinal();
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
