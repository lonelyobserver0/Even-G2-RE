package W9;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8206a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f8207b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f8208c;

    static {
        c cVar = new c(StubApp.getString2(6940), 0);
        f8206a = cVar;
        c cVar2 = new c(StubApp.getString2(6941), 1);
        f8207b = cVar2;
        f8208c = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f8208c.clone();
    }
}
