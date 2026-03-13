package vb;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vb.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC1848e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1848e f21933a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1848e f21934b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1848e f21935c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1848e[] f21936d;

    static {
        EnumC1848e enumC1848e = new EnumC1848e(StubApp.getString2(23745), 0);
        f21933a = enumC1848e;
        EnumC1848e enumC1848e2 = new EnumC1848e(StubApp.getString2(23746), 1);
        f21934b = enumC1848e2;
        EnumC1848e enumC1848e3 = new EnumC1848e(StubApp.getString2(23747), 2);
        f21935c = enumC1848e3;
        f21936d = new EnumC1848e[]{enumC1848e, enumC1848e2, enumC1848e3};
    }

    public static EnumC1848e valueOf(String str) {
        return (EnumC1848e) Enum.valueOf(EnumC1848e.class, str);
    }

    public static EnumC1848e[] values() {
        return (EnumC1848e[]) f21936d.clone();
    }

    public final boolean a() {
        return this == f21934b || this == f21935c;
    }
}
