package P7;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5579a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f5580b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f5581c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f5582d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f5583e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f5584f;

    static {
        c cVar = new c(StubApp.getString2(5010), 0);
        f5579a = cVar;
        c cVar2 = new c(StubApp.getString2(5011), 1);
        f5580b = cVar2;
        c cVar3 = new c(StubApp.getString2(5012), 2);
        f5581c = cVar3;
        c cVar4 = new c(StubApp.getString2(5013), 3);
        f5582d = cVar4;
        c cVar5 = new c(StubApp.getString2(5014), 4);
        f5583e = cVar5;
        f5584f = new c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5584f.clone();
    }
}
