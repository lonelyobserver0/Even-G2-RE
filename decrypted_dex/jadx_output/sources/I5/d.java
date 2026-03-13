package I5;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3230a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f3231b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f3232c;

    static {
        d dVar = new d(StubApp.getString2(2872), 0);
        f3230a = dVar;
        d dVar2 = new d(StubApp.getString2(2873), 1);
        f3231b = dVar2;
        f3232c = new d[]{dVar, dVar2, new d(StubApp.getString2(2874), 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3232c.clone();
    }
}
