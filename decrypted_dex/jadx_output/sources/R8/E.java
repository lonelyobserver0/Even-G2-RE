package R8;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f6264a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f6265b;

    /* renamed from: c, reason: collision with root package name */
    public static final E f6266c;

    /* renamed from: d, reason: collision with root package name */
    public static final E f6267d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ E[] f6268e;

    static {
        E e10 = new E(StubApp.getString2(5759), 0);
        f6264a = e10;
        E e11 = new E(StubApp.getString2(5760), 1);
        f6265b = e11;
        E e12 = new E(StubApp.getString2(5761), 2);
        f6266c = e12;
        E e13 = new E(StubApp.getString2(5762), 3);
        f6267d = e13;
        f6268e = new E[]{e10, e11, e12, e13};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f6268e.clone();
    }
}
