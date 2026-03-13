package com.mapbox.navigator;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JCT' uses external variables
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
public final class BannerComponentSubType {
    private static final /* synthetic */ BannerComponentSubType[] $VALUES;
    public static final BannerComponentSubType AFTERTOLL;
    public static final BannerComponentSubType CITYREAL;
    public static final BannerComponentSubType DIRECTIONBOARD;
    public static final BannerComponentSubType ENT;
    public static final BannerComponentSubType EXIT;
    public static final BannerComponentSubType JCT;
    public static final BannerComponentSubType SAPA;
    public static final BannerComponentSubType SAPAGUIDEMAP;
    public static final BannerComponentSubType SIGNBOARD;
    public static final BannerComponentSubType TOLLBRANCH;
    private String str;

    private static /* synthetic */ BannerComponentSubType[] $values() {
        return new BannerComponentSubType[]{JCT, SIGNBOARD, SAPAGUIDEMAP, SAPA, AFTERTOLL, CITYREAL, ENT, EXIT, TOLLBRANCH, DIRECTIONBOARD};
    }

    static {
        String string2 = StubApp.getString2(14910);
        JCT = new BannerComponentSubType(string2, 0, string2);
        SIGNBOARD = new BannerComponentSubType(StubApp.getString2(14912), 1, StubApp.getString2(14911));
        SAPAGUIDEMAP = new BannerComponentSubType(StubApp.getString2(14914), 2, StubApp.getString2(14913));
        SAPA = new BannerComponentSubType(StubApp.getString2(14916), 3, StubApp.getString2(14915));
        AFTERTOLL = new BannerComponentSubType(StubApp.getString2(14918), 4, StubApp.getString2(14917));
        CITYREAL = new BannerComponentSubType(StubApp.getString2(14920), 5, StubApp.getString2(14919));
        ENT = new BannerComponentSubType(StubApp.getString2(14922), 6, StubApp.getString2(14921));
        EXIT = new BannerComponentSubType(StubApp.getString2(14924), 7, StubApp.getString2(14923));
        TOLLBRANCH = new BannerComponentSubType(StubApp.getString2(14926), 8, StubApp.getString2(14925));
        DIRECTIONBOARD = new BannerComponentSubType(StubApp.getString2(14928), 9, StubApp.getString2(14927));
        $VALUES = $values();
    }

    private BannerComponentSubType(String str, int i3, String str2) {
        this.str = str2;
    }

    private int getValue() {
        return ordinal();
    }

    public static BannerComponentSubType valueOf(String str) {
        return (BannerComponentSubType) Enum.valueOf(BannerComponentSubType.class, str);
    }

    public static BannerComponentSubType[] values() {
        return (BannerComponentSubType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
