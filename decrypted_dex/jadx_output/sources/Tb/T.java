package Tb;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public static final T f7315a;

    /* renamed from: b, reason: collision with root package name */
    public static final T f7316b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ T[] f7317c;

    static {
        T t3 = new T(StubApp.getString2(25672), 0);
        f7315a = t3;
        T t10 = new T(StubApp.getString2(23487), 1);
        T t11 = new T(StubApp.getString2(25673), 2);
        f7316b = t11;
        f7317c = new T[]{t3, t10, t11};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) f7317c.clone();
    }
}
