package com.mapbox.navigator;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'HMM' uses external variables
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
public final class OffRoadStateProvider {
    private static final /* synthetic */ OffRoadStateProvider[] $VALUES;
    public static final OffRoadStateProvider BAD_SIGNAL;
    public static final OffRoadStateProvider HMM;
    public static final OffRoadStateProvider PARALLEL_MOVEMENT;
    public static final OffRoadStateProvider PARKING_AISLE;
    public static final OffRoadStateProvider PARKING_GARAGE;
    public static final OffRoadStateProvider SIMPLE;
    public static final OffRoadStateProvider SYNTHETIC_LOCATION;
    public static final OffRoadStateProvider TUNNEL;
    private String str;
    public static final OffRoadStateProvider UNKNOWN = new OffRoadStateProvider(StubApp.getString2(343), 0, StubApp.getString2(2164));
    public static final OffRoadStateProvider DEAD_RECKONING = new OffRoadStateProvider(StubApp.getString2(15138), 1, StubApp.getString2(15137));
    public static final OffRoadStateProvider FALLBACK = new OffRoadStateProvider(StubApp.getString2(15140), 2, StubApp.getString2(15139));

    private static /* synthetic */ OffRoadStateProvider[] $values() {
        return new OffRoadStateProvider[]{UNKNOWN, DEAD_RECKONING, FALLBACK, HMM, PARALLEL_MOVEMENT, PARKING_AISLE, SIMPLE, SYNTHETIC_LOCATION, TUNNEL, BAD_SIGNAL, PARKING_GARAGE};
    }

    static {
        String string2 = StubApp.getString2(15141);
        HMM = new OffRoadStateProvider(string2, 3, string2);
        PARALLEL_MOVEMENT = new OffRoadStateProvider(StubApp.getString2(15143), 4, StubApp.getString2(15142));
        PARKING_AISLE = new OffRoadStateProvider(StubApp.getString2(15145), 5, StubApp.getString2(15144));
        SIMPLE = new OffRoadStateProvider(StubApp.getString2(15147), 6, StubApp.getString2(15146));
        SYNTHETIC_LOCATION = new OffRoadStateProvider(StubApp.getString2(15149), 7, StubApp.getString2(15148));
        TUNNEL = new OffRoadStateProvider(StubApp.getString2(15151), 8, StubApp.getString2(15150));
        BAD_SIGNAL = new OffRoadStateProvider(StubApp.getString2(15153), 9, StubApp.getString2(15152));
        PARKING_GARAGE = new OffRoadStateProvider(StubApp.getString2(15155), 10, StubApp.getString2(15154));
        $VALUES = $values();
    }

    private OffRoadStateProvider(String str, int i3, String str2) {
        this.str = str2;
    }

    private int getValue() {
        return ordinal();
    }

    public static OffRoadStateProvider valueOf(String str) {
        return (OffRoadStateProvider) Enum.valueOf(OffRoadStateProvider.class, str);
    }

    public static OffRoadStateProvider[] values() {
        return (OffRoadStateProvider[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
