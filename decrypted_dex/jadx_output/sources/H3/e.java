package H3;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2710a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f2711b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f2712c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f2713d;

    static {
        e eVar = new e(StubApp.getString2(2535), 0);
        f2710a = eVar;
        e eVar2 = new e(StubApp.getString2(2536), 1);
        f2711b = eVar2;
        e eVar3 = new e(StubApp.getString2(2537), 2);
        f2712c = eVar3;
        f2713d = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2713d.clone();
    }
}
