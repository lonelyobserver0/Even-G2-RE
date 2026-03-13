package X6;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f8475a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f8476b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f8477c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t[] f8478d;

    static {
        t tVar = new t(StubApp.getString2(7287), 0);
        f8475a = tVar;
        t tVar2 = new t(StubApp.getString2(7288), 1);
        f8476b = tVar2;
        t tVar3 = new t(StubApp.getString2(7289), 2);
        f8477c = tVar3;
        f8478d = new t[]{tVar, tVar2, tVar3};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f8478d.clone();
    }
}
