package y3;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f23506a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f23507b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f23508c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f23509d;

    static {
        d dVar = new d(StubApp.getString2(208), 0);
        f23506a = dVar;
        d dVar2 = new d(StubApp.getString2(24643), 1);
        f23507b = dVar2;
        d dVar3 = new d(StubApp.getString2(13600), 2);
        f23508c = dVar3;
        f23509d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f23509d.clone();
    }
}
