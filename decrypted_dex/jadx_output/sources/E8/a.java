package E8;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1929a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f1930b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f1931c;

    static {
        a aVar = new a(StubApp.getString2(1880), 0);
        f1929a = aVar;
        a aVar2 = new a(StubApp.getString2(1881), 1);
        f1930b = aVar2;
        f1931c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1931c.clone();
    }
}
