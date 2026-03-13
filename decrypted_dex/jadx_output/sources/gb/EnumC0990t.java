package gb;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: gb.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC0990t {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0990t f14369a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0990t[] f14370b;

    static {
        EnumC0990t enumC0990t = new EnumC0990t(StubApp.getString2(18035), 0);
        f14369a = enumC0990t;
        f14370b = new EnumC0990t[]{enumC0990t};
    }

    public static EnumC0990t a(String str) {
        for (EnumC0990t enumC0990t : values()) {
            enumC0990t.getClass();
            if (StubApp.getString2(625).equals(str)) {
                return enumC0990t;
            }
        }
        throw new NoSuchFieldException(E1.a.j(StubApp.getString2(18036), str));
    }

    public static EnumC0990t valueOf(String str) {
        return (EnumC0990t) Enum.valueOf(EnumC0990t.class, str);
    }

    public static EnumC0990t[] values() {
        return (EnumC0990t[]) f14370b.clone();
    }
}
