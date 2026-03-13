package c9;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c9.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EnumC0580d {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0580d f11047a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0580d f11048b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0580d f11049c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0580d[] f11050d;

    static {
        EnumC0580d enumC0580d = new EnumC0580d(StubApp.getString2(9637), 0);
        f11047a = enumC0580d;
        EnumC0580d enumC0580d2 = new EnumC0580d(StubApp.getString2(5766), 1);
        f11048b = enumC0580d2;
        EnumC0580d enumC0580d3 = new EnumC0580d(StubApp.getString2(9638), 2);
        f11049c = enumC0580d3;
        f11050d = new EnumC0580d[]{enumC0580d, enumC0580d2, enumC0580d3};
    }

    public static EnumC0580d valueOf(String str) {
        return (EnumC0580d) Enum.valueOf(EnumC0580d.class, str);
    }

    public static EnumC0580d[] values() {
        return (EnumC0580d[]) f11050d.clone();
    }
}
