package com.mapbox.common;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SDK' uses external variables
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
public final class MovementModeProvider {
    private static final /* synthetic */ MovementModeProvider[] $VALUES;
    public static final MovementModeProvider SDK;
    public static final MovementModeProvider SYSTEM = new MovementModeProvider(StubApp.getString2(13404), 0, StubApp.getString2(13403));
    public static final MovementModeProvider UNKNOWN;
    private String str;

    private static /* synthetic */ MovementModeProvider[] $values() {
        return new MovementModeProvider[]{SYSTEM, SDK, UNKNOWN};
    }

    static {
        String string2 = StubApp.getString2(1880);
        SDK = new MovementModeProvider(string2, 1, string2);
        UNKNOWN = new MovementModeProvider(StubApp.getString2(343), 2, StubApp.getString2(2164));
        $VALUES = $values();
    }

    private MovementModeProvider(String str, int i3, String str2) {
        this.str = str2;
    }

    private int getValue() {
        return ordinal();
    }

    public static MovementModeProvider valueOf(String str) {
        return (MovementModeProvider) Enum.valueOf(MovementModeProvider.class, str);
    }

    public static MovementModeProvider[] values() {
        return (MovementModeProvider[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
