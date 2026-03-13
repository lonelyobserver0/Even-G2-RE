package B0;

import L0.Y;
import com.stub.StubApp;
import java.util.Map;
import o0.C1404A;
import o0.C1435j;
import o0.C1437l;
import o0.C1438m;
import o0.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q extends Y {

    /* renamed from: H, reason: collision with root package name */
    public final Map f517H;

    /* renamed from: I, reason: collision with root package name */
    public C1435j f518I;

    public q(P0.e eVar, A0.j jVar, A0.f fVar, Map map) {
        super(eVar, jVar, fVar);
        this.f517H = map;
    }

    @Override // L0.Y
    public final C1438m k(C1438m c1438m) {
        C1435j c1435j;
        C1435j c1435j2 = this.f518I;
        if (c1435j2 == null) {
            c1435j2 = c1438m.f18220r;
        }
        if (c1435j2 != null && (c1435j = (C1435j) this.f517H.get(c1435j2.f18152c)) != null) {
            c1435j2 = c1435j;
        }
        C1404A c1404a = c1438m.f18214l;
        C1404A c1404a2 = null;
        if (c1404a != null) {
            z[] zVarArr = c1404a.f18017a;
            int length = zVarArr.length;
            int i3 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                z zVar = zVarArr[i10];
                if ((zVar instanceof h1.m) && StubApp.getString2(464).equals(((h1.m) zVar).f14457b)) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                if (length != 1) {
                    z[] zVarArr2 = new z[length - 1];
                    while (i3 < length) {
                        if (i3 != i10) {
                            zVarArr2[i3 < i10 ? i3 : i3 - 1] = zVarArr[i3];
                        }
                        i3++;
                    }
                    c1404a2 = new C1404A(zVarArr2);
                }
            }
            if (c1435j2 == c1438m.f18220r || c1404a != c1438m.f18214l) {
                C1437l a3 = c1438m.a();
                a3.f18181q = c1435j2;
                a3.f18175k = c1404a;
                c1438m = new C1438m(a3);
            }
            return super.k(c1438m);
        }
        c1404a = c1404a2;
        if (c1435j2 == c1438m.f18220r) {
        }
        C1437l a32 = c1438m.a();
        a32.f18181q = c1435j2;
        a32.f18175k = c1404a;
        c1438m = new C1438m(a32);
        return super.k(c1438m);
    }
}
