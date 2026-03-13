package Z1;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f8962a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f8963b;

    /* JADX INFO: Fake field, exist only in values array */
    h EF0;

    static {
        h hVar = new h(StubApp.getString2(7607), 0);
        h hVar2 = new h(StubApp.getString2(7608), 1);
        h hVar3 = new h(StubApp.getString2(7609), 2);
        f8962a = hVar3;
        f8963b = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f8963b.clone();
    }
}
