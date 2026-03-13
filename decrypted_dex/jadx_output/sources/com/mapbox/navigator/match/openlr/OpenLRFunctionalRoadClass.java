package com.mapbox.navigator.match.openlr;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FRC0' uses external variables
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
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class OpenLRFunctionalRoadClass {
    private static final /* synthetic */ OpenLRFunctionalRoadClass[] $VALUES;
    public static final OpenLRFunctionalRoadClass FRC0;
    public static final OpenLRFunctionalRoadClass FRC1;
    public static final OpenLRFunctionalRoadClass FRC2;
    public static final OpenLRFunctionalRoadClass FRC3;
    public static final OpenLRFunctionalRoadClass FRC4;
    public static final OpenLRFunctionalRoadClass FRC5;
    public static final OpenLRFunctionalRoadClass FRC6;
    public static final OpenLRFunctionalRoadClass FRC7;
    private String str;
    public final int value;

    private static /* synthetic */ OpenLRFunctionalRoadClass[] $values() {
        return new OpenLRFunctionalRoadClass[]{FRC0, FRC1, FRC2, FRC3, FRC4, FRC5, FRC6, FRC7};
    }

    static {
        String string2 = StubApp.getString2(15620);
        FRC0 = new OpenLRFunctionalRoadClass(string2, 0, 0, string2);
        String string22 = StubApp.getString2(15621);
        FRC1 = new OpenLRFunctionalRoadClass(string22, 1, 1, string22);
        String string23 = StubApp.getString2(15622);
        FRC2 = new OpenLRFunctionalRoadClass(string23, 2, 2, string23);
        String string24 = StubApp.getString2(15623);
        FRC3 = new OpenLRFunctionalRoadClass(string24, 3, 3, string24);
        String string25 = StubApp.getString2(15624);
        FRC4 = new OpenLRFunctionalRoadClass(string25, 4, 4, string25);
        String string26 = StubApp.getString2(15625);
        FRC5 = new OpenLRFunctionalRoadClass(string26, 5, 5, string26);
        String string27 = StubApp.getString2(15626);
        FRC6 = new OpenLRFunctionalRoadClass(string27, 6, 6, string27);
        String string28 = StubApp.getString2(15627);
        FRC7 = new OpenLRFunctionalRoadClass(string28, 7, 7, string28);
        $VALUES = $values();
    }

    private OpenLRFunctionalRoadClass(String str, int i3, int i10, String str2) {
        this.value = i10;
        this.str = str2;
    }

    private int getValue() {
        return this.value;
    }

    public static OpenLRFunctionalRoadClass valueOf(String str) {
        return (OpenLRFunctionalRoadClass) Enum.valueOf(OpenLRFunctionalRoadClass.class, str);
    }

    public static OpenLRFunctionalRoadClass[] values() {
        return (OpenLRFunctionalRoadClass[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
