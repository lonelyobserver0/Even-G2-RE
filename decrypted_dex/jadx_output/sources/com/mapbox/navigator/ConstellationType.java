package com.mapbox.navigator;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
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
public final class ConstellationType {
    private static final /* synthetic */ ConstellationType[] $VALUES;
    public static final ConstellationType BEIDOU;
    public static final ConstellationType GALILEO;
    public static final ConstellationType GLONASS;
    public static final ConstellationType GPS;
    public static final ConstellationType IRNSS;
    public static final ConstellationType QZSS;
    public static final ConstellationType SBAS;
    public static final ConstellationType UNKNOWN;
    private String str;

    private static /* synthetic */ ConstellationType[] $values() {
        return new ConstellationType[]{UNKNOWN, GPS, SBAS, GLONASS, QZSS, BEIDOU, GALILEO, IRNSS};
    }

    static {
        String string2 = StubApp.getString2(343);
        UNKNOWN = new ConstellationType(string2, 0, string2);
        String string22 = StubApp.getString2(14930);
        GPS = new ConstellationType(string22, 1, string22);
        String string23 = StubApp.getString2(14931);
        SBAS = new ConstellationType(string23, 2, string23);
        String string24 = StubApp.getString2(14932);
        GLONASS = new ConstellationType(string24, 3, string24);
        String string25 = StubApp.getString2(14933);
        QZSS = new ConstellationType(string25, 4, string25);
        String string26 = StubApp.getString2(14934);
        BEIDOU = new ConstellationType(string26, 5, string26);
        String string27 = StubApp.getString2(14935);
        GALILEO = new ConstellationType(string27, 6, string27);
        String string28 = StubApp.getString2(14936);
        IRNSS = new ConstellationType(string28, 7, string28);
        $VALUES = $values();
    }

    private ConstellationType(String str, int i3, String str2) {
        this.str = str2;
    }

    private int getValue() {
        return ordinal();
    }

    public static ConstellationType valueOf(String str) {
        return (ConstellationType) Enum.valueOf(ConstellationType.class, str);
    }

    public static ConstellationType[] values() {
        return (ConstellationType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
