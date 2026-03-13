package V8;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f7802a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f7803b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ E[] f7804c;

    static {
        E e10 = new E(StubApp.getString2(5766), 0);
        f7802a = e10;
        E e11 = new E(StubApp.getString2(6649), 1);
        f7803b = e11;
        f7804c = new E[]{e10, e11};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f7804c.clone();
    }
}
