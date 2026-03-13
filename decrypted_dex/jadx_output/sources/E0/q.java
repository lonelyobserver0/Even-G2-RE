package E0;

import com.stub.StubApp;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f1786a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1787b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1788c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1789d;

    public q(C1438m c1438m, v vVar, boolean z2, int i3) {
        this(StubApp.getString2(1645) + i3 + StubApp.getString2(1646) + c1438m, vVar, c1438m.f18216n, z2, null, StubApp.getString2(1648) + (i3 < 0 ? StubApp.getString2(1647) : "") + Math.abs(i3));
    }

    public q(String str, Throwable th, String str2, boolean z2, p pVar, String str3) {
        super(str, th);
        this.f1786a = str2;
        this.f1787b = z2;
        this.f1788c = pVar;
        this.f1789d = str3;
    }
}
