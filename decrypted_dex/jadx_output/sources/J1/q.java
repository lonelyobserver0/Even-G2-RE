package J1;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f3360a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f3361b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f3362c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f3363d;

    static {
        q qVar = new q(StubApp.getString2(2940), 0);
        f3360a = qVar;
        q qVar2 = new q(StubApp.getString2(2941), 1);
        f3361b = qVar2;
        q qVar3 = new q(StubApp.getString2(2942), 2);
        f3362c = qVar3;
        f3363d = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f3363d.clone();
    }
}
