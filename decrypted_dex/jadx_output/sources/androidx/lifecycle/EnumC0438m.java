package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EnumC0438m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC0438m[] $VALUES;
    public static final C0436k Companion;
    public static final EnumC0438m ON_ANY;
    public static final EnumC0438m ON_CREATE;
    public static final EnumC0438m ON_DESTROY;
    public static final EnumC0438m ON_PAUSE;
    public static final EnumC0438m ON_RESUME;
    public static final EnumC0438m ON_START;
    public static final EnumC0438m ON_STOP;

    static {
        EnumC0438m enumC0438m = new EnumC0438m("ON_CREATE", 0);
        ON_CREATE = enumC0438m;
        EnumC0438m enumC0438m2 = new EnumC0438m("ON_START", 1);
        ON_START = enumC0438m2;
        EnumC0438m enumC0438m3 = new EnumC0438m("ON_RESUME", 2);
        ON_RESUME = enumC0438m3;
        EnumC0438m enumC0438m4 = new EnumC0438m("ON_PAUSE", 3);
        ON_PAUSE = enumC0438m4;
        EnumC0438m enumC0438m5 = new EnumC0438m("ON_STOP", 4);
        ON_STOP = enumC0438m5;
        EnumC0438m enumC0438m6 = new EnumC0438m("ON_DESTROY", 5);
        ON_DESTROY = enumC0438m6;
        EnumC0438m enumC0438m7 = new EnumC0438m("ON_ANY", 6);
        ON_ANY = enumC0438m7;
        EnumC0438m[] enumC0438mArr = {enumC0438m, enumC0438m2, enumC0438m3, enumC0438m4, enumC0438m5, enumC0438m6, enumC0438m7};
        $VALUES = enumC0438mArr;
        $ENTRIES = EnumEntriesKt.enumEntries(enumC0438mArr);
        Companion = new C0436k();
    }

    public static EnumC0438m valueOf(String str) {
        return (EnumC0438m) Enum.valueOf(EnumC0438m.class, str);
    }

    public static EnumC0438m[] values() {
        return (EnumC0438m[]) $VALUES.clone();
    }

    public final EnumC0439n a() {
        switch (AbstractC0437l.f9912a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0439n.f9915c;
            case 3:
            case 4:
                return EnumC0439n.f9916d;
            case 5:
                return EnumC0439n.f9917e;
            case 6:
                return EnumC0439n.f9913a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
