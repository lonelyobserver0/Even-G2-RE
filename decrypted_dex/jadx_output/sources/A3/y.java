package A3;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f216a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y[] f217b;

    /* JADX INFO: Fake field, exist only in values array */
    y EF0;

    static {
        y yVar = new y(StubApp.getString2(343), 0);
        y yVar2 = new y(StubApp.getString2(344), 1);
        f216a = yVar2;
        f217b = new y[]{yVar, yVar2};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f217b.clone();
    }
}
