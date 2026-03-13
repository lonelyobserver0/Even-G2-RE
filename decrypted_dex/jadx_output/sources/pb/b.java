package pb;

import L0.A;
import L0.C0120p;
import M4.Z;
import android.content.Context;
import android.net.Uri;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l4.C1221y;
import o0.C1441p;
import o0.C1442q;
import o0.C1443r;
import o0.C1444s;
import o0.C1445t;
import o0.C1447v;
import o0.y;
import o1.C1453e;
import s.C1590a;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b extends q {

    /* renamed from: b, reason: collision with root package name */
    public final int f19770b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f19771c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19772d;

    public b(String str, int i3, HashMap hashMap, String str2) {
        super(str);
        this.f19770b = i3;
        this.f19771c = hashMap;
        this.f19772d = str2;
    }

    @Override // pb.q
    public final C1447v a() {
        T0.s sVar = new T0.s();
        new C1221y();
        List list = Collections.EMPTY_LIST;
        Z z2 = Z.f4578e;
        C1442q c1442q = new C1442q();
        C1445t c1445t = C1445t.f18247a;
        String str = this.f19796a;
        Uri parse = str == null ? null : Uri.parse(str);
        int c10 = AbstractC1856e.c(this.f19770b);
        String string2 = c10 != 1 ? c10 != 2 ? c10 != 3 ? null : StubApp.getString2(825) : StubApp.getString2(22160) : StubApp.getString2(22161);
        if (string2 == null) {
            string2 = null;
        }
        return new C1447v("", new C1441p(sVar), parse != null ? new C1444s(parse, string2, null, list, z2, -9223372036854775807L) : null, new C1443r(c1442q), y.f18281B, c1445t);
    }

    @Override // pb.q
    public final A b(Context context) {
        C1453e c1453e = new C1453e(1);
        HashMap hashMap = this.f19771c;
        c1453e.f18329e = this.f19772d;
        c1453e.f18327c = true;
        if (!hashMap.isEmpty()) {
            C1590a c1590a = (C1590a) c1453e.f18328d;
            synchronized (c1590a) {
                c1590a.f20575b = null;
                ((HashMap) c1590a.f20574a).clear();
                ((HashMap) c1590a.f20574a).putAll(hashMap);
            }
        }
        Y.m mVar = new Y.m(context, c1453e);
        C0120p c0120p = new C0120p(context);
        c0120p.f4116b = mVar;
        Ac.e eVar = c0120p.f4115a;
        if (mVar != ((Y.m) eVar.f318e)) {
            eVar.f318e = mVar;
            ((HashMap) eVar.f316c).clear();
            ((HashMap) eVar.f317d).clear();
        }
        return c0120p;
    }
}
