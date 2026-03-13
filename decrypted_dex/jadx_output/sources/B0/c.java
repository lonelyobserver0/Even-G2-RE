package B0;

import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.LongCompanionObject;
import l4.C1145A;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f411c = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a, reason: collision with root package name */
    public C1145A f412a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f413b;

    public static void a(int i3, ArrayList arrayList) {
        if (android.support.v4.media.session.b.s(f411c, i3, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i3))) {
            return;
        }
        arrayList.add(Integer.valueOf(i3));
    }

    public final C1438m b(C1438m c1438m) {
        if (!this.f413b || !this.f412a.c(c1438m)) {
            return c1438m;
        }
        C1437l a3 = c1438m.a();
        a3.f18177m = AbstractC1405B.m(StubApp.getString2(462));
        a3.f18162H = this.f412a.b(c1438m);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c1438m.f18216n);
        String str = c1438m.f18213k;
        sb2.append(str != null ? StubApp.getString2(397).concat(str) : "");
        a3.j = sb2.toString();
        a3.f18182r = LongCompanionObject.MAX_VALUE;
        return new C1438m(a3);
    }
}
