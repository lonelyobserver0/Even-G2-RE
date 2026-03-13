package com.mapbox.navigator;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NN' uses external variables
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
public final class GetRouteOrigin {
    private static final /* synthetic */ GetRouteOrigin[] $VALUES;
    public static final GetRouteOrigin CUSTOMER;
    public static final GetRouteOrigin NN;
    public static final GetRouteOrigin PLATFORM_SDK = new GetRouteOrigin(StubApp.getString2(14999), 0, StubApp.getString2(14998));
    private String str;

    private static /* synthetic */ GetRouteOrigin[] $values() {
        return new GetRouteOrigin[]{PLATFORM_SDK, NN, CUSTOMER};
    }

    static {
        String string2 = StubApp.getString2(15000);
        NN = new GetRouteOrigin(string2, 1, string2);
        CUSTOMER = new GetRouteOrigin(StubApp.getString2(15002), 2, StubApp.getString2(15001));
        $VALUES = $values();
    }

    private GetRouteOrigin(String str, int i3, String str2) {
        this.str = str2;
    }

    private int getValue() {
        return ordinal();
    }

    public static GetRouteOrigin valueOf(String str) {
        return (GetRouteOrigin) Enum.valueOf(GetRouteOrigin.class, str);
    }

    public static GetRouteOrigin[] values() {
        return (GetRouteOrigin[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
