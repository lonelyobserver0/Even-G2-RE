package N7;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4934a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f4935b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f4936c;

    static {
        b bVar = new b(StubApp.getString2(3783), 0);
        f4934a = bVar;
        b bVar2 = new b(StubApp.getString2(3784), 1);
        f4935b = bVar2;
        f4936c = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4936c.clone();
    }
}
