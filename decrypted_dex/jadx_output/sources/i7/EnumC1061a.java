package i7;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC1061a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1061a f14854a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1061a f14855b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1061a f14856c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1061a f14857d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1061a[] f14858e;

    static {
        EnumC1061a enumC1061a = new EnumC1061a(StubApp.getString2(18579), 0);
        f14854a = enumC1061a;
        EnumC1061a enumC1061a2 = new EnumC1061a(StubApp.getString2(2423), 1);
        f14855b = enumC1061a2;
        EnumC1061a enumC1061a3 = new EnumC1061a(StubApp.getString2(18580), 2);
        f14856c = enumC1061a3;
        EnumC1061a enumC1061a4 = new EnumC1061a(StubApp.getString2(18581), 3);
        f14857d = enumC1061a4;
        f14858e = new EnumC1061a[]{enumC1061a, enumC1061a2, enumC1061a3, enumC1061a4};
    }

    public static EnumC1061a valueOf(String str) {
        return (EnumC1061a) Enum.valueOf(EnumC1061a.class, str);
    }

    public static EnumC1061a[] values() {
        return (EnumC1061a[]) f14858e.clone();
    }
}
