package com.mapbox.navigator;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CF' uses external variables
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
public final class BillingProductType {
    private static final /* synthetic */ BillingProductType[] $VALUES;
    public static final BillingProductType CF;
    public static final BillingProductType UXF;
    private String str;

    private static /* synthetic */ BillingProductType[] $values() {
        return new BillingProductType[]{CF, UXF};
    }

    static {
        String string2 = StubApp.getString2(4729);
        CF = new BillingProductType(string2, 0, string2);
        String string22 = StubApp.getString2(14929);
        UXF = new BillingProductType(string22, 1, string22);
        $VALUES = $values();
    }

    private BillingProductType(String str, int i3, String str2) {
        this.str = str2;
    }

    private int getValue() {
        return ordinal();
    }

    public static BillingProductType valueOf(String str) {
        return (BillingProductType) Enum.valueOf(BillingProductType.class, str);
    }

    public static BillingProductType[] values() {
        return (BillingProductType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
