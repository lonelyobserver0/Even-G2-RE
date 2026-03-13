package d0;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f13281a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f13282b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f13283c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b0[] f13284d;

    static {
        b0 b0Var = new b0(StubApp.getString2(207), 0);
        f13281a = b0Var;
        b0 b0Var2 = new b0(StubApp.getString2(16683), 1);
        f13282b = b0Var2;
        b0 b0Var3 = new b0(StubApp.getString2(16684), 2);
        f13283c = b0Var3;
        f13284d = new b0[]{b0Var, b0Var2, b0Var3};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f13284d.clone();
    }
}
