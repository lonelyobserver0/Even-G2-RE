package E8;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1932a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f1933b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f1934c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f1935d;

    static {
        b bVar = new b(StubApp.getString2(1882), 0);
        f1932a = bVar;
        b bVar2 = new b(StubApp.getString2(1883), 1);
        f1933b = bVar2;
        b bVar3 = new b(StubApp.getString2(1884), 2);
        f1934c = bVar3;
        f1935d = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1935d.clone();
    }
}
