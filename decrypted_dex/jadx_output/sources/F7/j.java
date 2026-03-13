package F7;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2311a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f2312b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f2313c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f2314d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f2315e;

    static {
        j jVar = new j(StubApp.getString2(2143), 0);
        f2311a = jVar;
        j jVar2 = new j(StubApp.getString2(2144), 1);
        f2312b = jVar2;
        j jVar3 = new j(StubApp.getString2(2145), 2);
        f2313c = jVar3;
        j jVar4 = new j(StubApp.getString2(2146), 3);
        f2314d = jVar4;
        f2315e = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f2315e.clone();
    }
}
