package Pc;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5656a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f5657b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f5658c;

    static {
        b bVar = new b(StubApp.getString2(25439), 0);
        f5656a = bVar;
        b bVar2 = new b(StubApp.getString2(4627), 1);
        f5657b = bVar2;
        f5658c = new b[]{bVar, bVar2, new b(StubApp.getString2(22009), 2), new b(StubApp.getString2(25440), 3), new b(StubApp.getString2(4560), 4), new b(StubApp.getString2(4696), 5), new b(StubApp.getString2(4584), 6)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5658c.clone();
    }
}
