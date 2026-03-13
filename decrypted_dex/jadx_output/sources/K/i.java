package K;

import com.stub.StubApp;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1540a;
import r0.C1552m;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3562a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3563b;

    public i(int i3, List list) {
        this.f3562a = i3;
        this.f3563b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z1.InterfaceC1995G a(int r5, r0.C1552m r6) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K.i.a(int, r0.m):z1.G");
    }

    public List b(C1552m c1552m) {
        String string2;
        int i3;
        List list;
        boolean c10 = c(32);
        List list2 = this.f3563b;
        if (c10) {
            return list2;
        }
        C1553n c1553n = new C1553n((byte[]) c1552m.f20172d);
        while (c1553n.a() > 0) {
            int u2 = c1553n.u();
            int u10 = c1553n.f20177b + c1553n.u();
            if (u2 == 134) {
                ArrayList arrayList = new ArrayList();
                int u11 = c1553n.u() & 31;
                for (int i10 = 0; i10 < u11; i10++) {
                    String s10 = c1553n.s(3, StandardCharsets.UTF_8);
                    int u12 = c1553n.u();
                    boolean z2 = (u12 & 128) != 0;
                    if (z2) {
                        i3 = u12 & 63;
                        string2 = StubApp.getString2(503);
                    } else {
                        string2 = StubApp.getString2(467);
                        i3 = 1;
                    }
                    byte u13 = (byte) c1553n.u();
                    c1553n.H(1);
                    if (z2) {
                        boolean z10 = (u13 & 64) != 0;
                        byte[] bArr = AbstractC1540a.f20137a;
                        list = Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C1437l c1437l = new C1437l();
                    c1437l.f18177m = AbstractC1405B.m(string2);
                    c1437l.f18169d = s10;
                    c1437l.f18161G = i3;
                    c1437l.f18180p = list;
                    arrayList.add(new C1438m(c1437l));
                }
                list2 = arrayList;
            }
            c1553n.G(u10);
        }
        return list2;
    }

    public boolean c(int i3) {
        return (i3 & this.f3562a) != 0;
    }

    public i() {
        this.f3562a = 1;
        this.f3563b = Collections.singletonList(null);
    }

    public i(ArrayList arrayList) {
        this.f3562a = 0;
        this.f3563b = arrayList;
    }
}
