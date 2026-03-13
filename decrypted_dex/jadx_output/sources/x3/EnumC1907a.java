package x3;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC1907a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1907a f22838a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1907a f22839b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1907a f22840c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1907a[] f22841d;

    static {
        EnumC1907a enumC1907a = new EnumC1907a(StubApp.getString2(24153), 0);
        f22838a = enumC1907a;
        EnumC1907a enumC1907a2 = new EnumC1907a(StubApp.getString2(24154), 1);
        f22839b = enumC1907a2;
        EnumC1907a enumC1907a3 = new EnumC1907a(StubApp.getString2(15635), 2);
        f22840c = enumC1907a3;
        f22841d = new EnumC1907a[]{enumC1907a, enumC1907a2, enumC1907a3};
    }

    public static EnumC1907a valueOf(String str) {
        return (EnumC1907a) Enum.valueOf(EnumC1907a.class, str);
    }

    public static EnumC1907a[] values() {
        return (EnumC1907a[]) f22841d.clone();
    }
}
