package ra;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import oa.C1472e;
import oa.m;
import oa.p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d extends AbstractC1582a {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f20508e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20509f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20510g;

    public d(p pVar, C1472e c1472e) {
        super(new c(pVar.Z()));
        this.f20508e = null;
        this.f20501c = c1472e;
        int N3 = pVar.N(oa.j.f18561l2, null, -1);
        this.f20509f = N3;
        if (N3 == -1) {
            throw new IOException(StubApp.getString2(22853));
        }
        if (N3 < 0) {
            throw new IOException(u.p(N3, StubApp.getString2(22852)));
        }
        int N10 = pVar.N(oa.j.f18536e1, null, -1);
        this.f20510g = N10;
        if (N10 == -1) {
            throw new IOException(StubApp.getString2(22851));
        }
        if (N10 < 0) {
            throw new IOException(u.p(N10, StubApp.getString2(22850)));
        }
    }

    public final void w() {
        j jVar = this.f20500b;
        try {
            TreeMap treeMap = new TreeMap();
            long position = jVar.getPosition();
            int i3 = this.f20510g;
            long j = (position + i3) - 1;
            for (int i10 = 0; i10 < this.f20509f && jVar.getPosition() < j; i10++) {
                treeMap.put(Integer.valueOf((int) q()), Long.valueOf(r()));
            }
            this.f20508e = new ArrayList(treeMap.size());
            for (Map.Entry entry : treeMap.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                long position2 = jVar.getPosition();
                int i11 = intValue + i3;
                if (i11 > 0 && position2 < i11) {
                    jVar.z(i11 - ((int) position2));
                }
                m mVar = new m(l());
                mVar.f18631c = 0;
                mVar.f18630b = ((Long) entry.getValue()).longValue();
                this.f20508e.add(mVar);
            }
        } finally {
            jVar.close();
        }
    }
}
