package s5;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f20759a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f20760b;

    static {
        d dVar = new d(StubApp.getString2(208), 0);
        f20759a = dVar;
        f20760b = new d[]{dVar, new d(StubApp.getString2(23131), 1), new d(StubApp.getString2(23132), 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f20760b.clone();
    }
}
