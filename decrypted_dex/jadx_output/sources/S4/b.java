package S4;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6585a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f6586b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f6587c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f6588d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f6589e;

    static {
        b bVar = new b(StubApp.getString2(6009), 0);
        f6585a = bVar;
        b bVar2 = new b(StubApp.getString2(6010), 1);
        f6586b = bVar2;
        b bVar3 = new b(StubApp.getString2(6011), 2);
        f6587c = bVar3;
        b bVar4 = new b(StubApp.getString2(6012), 3);
        f6588d = bVar4;
        f6589e = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6589e.clone();
    }
}
