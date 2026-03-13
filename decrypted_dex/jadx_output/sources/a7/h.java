package a7;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f9323a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f9324b;

    /* JADX INFO: Fake field, exist only in values array */
    h EF0;

    static {
        h hVar = new h(StubApp.getString2(8561), 0);
        h hVar2 = new h(StubApp.getString2(8562), 1);
        h hVar3 = new h(StubApp.getString2(8563), 2);
        f9323a = hVar3;
        f9324b = new h[]{hVar, hVar2, hVar3, new h(StubApp.getString2(8564), 3)};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f9324b.clone();
    }
}
