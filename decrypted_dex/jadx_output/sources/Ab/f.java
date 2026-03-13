package Ab;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f269a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f270b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f271c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f272d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f273e;

    static {
        f fVar = new f(StubApp.getString2(442), 0);
        f269a = fVar;
        f fVar2 = new f(StubApp.getString2(443), 1);
        f270b = fVar2;
        f fVar3 = new f(StubApp.getString2(444), 2);
        f271c = fVar3;
        f fVar4 = new f(StubApp.getString2(207), 3);
        f272d = fVar4;
        f273e = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f273e.clone();
    }
}
