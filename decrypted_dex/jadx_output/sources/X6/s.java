package X6;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f8472a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f8473b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s[] f8474c;

    static {
        s sVar = new s(StubApp.getString2(7285), 0);
        f8472a = sVar;
        s sVar2 = new s(StubApp.getString2(7286), 1);
        f8473b = sVar2;
        f8474c = new s[]{sVar, sVar2};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f8474c.clone();
    }
}
