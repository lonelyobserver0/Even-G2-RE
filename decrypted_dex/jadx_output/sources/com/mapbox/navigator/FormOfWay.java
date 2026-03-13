package com.mapbox.navigator;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NA' uses external variables
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
public final class FormOfWay {
    private static final /* synthetic */ FormOfWay[] $VALUES;
    public static final FormOfWay NA;
    private String str;
    public final int value;
    public static final FormOfWay UNKNOWN = new FormOfWay(StubApp.getString2(343), 0, 0, StubApp.getString2(2164));
    public static final FormOfWay FREEWAY = new FormOfWay(StubApp.getString2(14957), 1, 1, StubApp.getString2(14956));
    public static final FormOfWay MULTIPLE_CARRIAGEWAY = new FormOfWay(StubApp.getString2(14959), 2, 2, StubApp.getString2(14958));
    public static final FormOfWay SINGLE_CARRIAGEWAY = new FormOfWay(StubApp.getString2(14961), 3, 3, StubApp.getString2(14960));
    public static final FormOfWay ROUNDABOUT_CIRCLE = new FormOfWay(StubApp.getString2(14963), 4, 4, StubApp.getString2(14962));
    public static final FormOfWay TRAFFIC_SQUARE = new FormOfWay(StubApp.getString2(14965), 5, 5, StubApp.getString2(14964));
    public static final FormOfWay SLIP_ROAD = new FormOfWay(StubApp.getString2(14967), 6, 6, StubApp.getString2(14966));
    public static final FormOfWay PARALLEL_ROAD = new FormOfWay(StubApp.getString2(14969), 7, 8, StubApp.getString2(14968));
    public static final FormOfWay RAMP_ON_FREEWAY = new FormOfWay(StubApp.getString2(14971), 8, 9, StubApp.getString2(14970));
    public static final FormOfWay RAMP = new FormOfWay(StubApp.getString2(14973), 9, 10, StubApp.getString2(14972));
    public static final FormOfWay SERVICE_ROAD = new FormOfWay(StubApp.getString2(14975), 10, 11, StubApp.getString2(14974));
    public static final FormOfWay CAR_PARK_ENTRANCE = new FormOfWay(StubApp.getString2(14977), 11, 12, StubApp.getString2(14976));
    public static final FormOfWay SERVICE_ENTRANCE = new FormOfWay(StubApp.getString2(14979), 12, 13, StubApp.getString2(14978));
    public static final FormOfWay PEDESTRIAN_ZONE = new FormOfWay(StubApp.getString2(14981), 13, 14, StubApp.getString2(14980));

    private static /* synthetic */ FormOfWay[] $values() {
        return new FormOfWay[]{UNKNOWN, FREEWAY, MULTIPLE_CARRIAGEWAY, SINGLE_CARRIAGEWAY, ROUNDABOUT_CIRCLE, TRAFFIC_SQUARE, SLIP_ROAD, PARALLEL_ROAD, RAMP_ON_FREEWAY, RAMP, SERVICE_ROAD, CAR_PARK_ENTRANCE, SERVICE_ENTRANCE, PEDESTRIAN_ZONE, NA};
    }

    static {
        String string2 = StubApp.getString2(4615);
        NA = new FormOfWay(string2, 14, 15, string2);
        $VALUES = $values();
    }

    private FormOfWay(String str, int i3, int i10, String str2) {
        this.value = i10;
        this.str = str2;
    }

    private int getValue() {
        return this.value;
    }

    public static FormOfWay valueOf(String str) {
        return (FormOfWay) Enum.valueOf(FormOfWay.class, str);
    }

    public static FormOfWay[] values() {
        return (FormOfWay[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
