package N7;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4937a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f4938b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f4939c;

    static {
        c cVar = new c(StubApp.getString2(3785), 0);
        f4937a = cVar;
        c cVar2 = new c(StubApp.getString2(3786), 1);
        f4938b = cVar2;
        f4939c = new c[]{cVar, cVar2, new c(StubApp.getString2(3787), 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f4939c.clone();
    }
}
