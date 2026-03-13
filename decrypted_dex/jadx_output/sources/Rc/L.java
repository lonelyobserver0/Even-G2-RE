package Rc;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public static final L f6383a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ L[] f6384b;

    static {
        L l9 = new L(StubApp.getString2(25565), 0);
        f6383a = l9;
        f6384b = new L[]{l9, new L(StubApp.getString2(25566), 1), new L(StubApp.getString2(25567), 2)};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f6384b.clone();
    }
}
