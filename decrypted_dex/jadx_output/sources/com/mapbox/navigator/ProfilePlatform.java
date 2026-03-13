package com.mapbox.navigator;

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
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ProfilePlatform {
    private static final /* synthetic */ ProfilePlatform[] $VALUES;
    public static final ProfilePlatform ANDROID;
    public static final ProfilePlatform CUSTOM = new ProfilePlatform(StubApp.getString2(1140), 0, StubApp.getString2(15164));
    public static final ProfilePlatform IOS;
    private String str;

    private static /* synthetic */ ProfilePlatform[] $values() {
        return new ProfilePlatform[]{CUSTOM, IOS, ANDROID};
    }

    static {
        String string2 = StubApp.getString2(1877);
        IOS = new ProfilePlatform(string2, 1, string2);
        ANDROID = new ProfilePlatform(StubApp.getString2(1876), 2, StubApp.getString2(13258));
        $VALUES = $values();
    }

    private ProfilePlatform(String str, int i3, String str2) {
        this.str = str2;
    }

    private int getValue() {
        return ordinal();
    }

    public static ProfilePlatform valueOf(String str) {
        return (ProfilePlatform) Enum.valueOf(ProfilePlatform.class, str);
    }

    public static ProfilePlatform[] values() {
        return (ProfilePlatform[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
