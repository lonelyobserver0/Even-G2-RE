package pb;

import H0.w;
import I4.e;
import L0.A;
import L0.AbstractC0105a;
import L0.C0120p;
import M4.Z;
import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import l4.C1221y;
import o0.C1441p;
import o0.C1442q;
import o0.C1443r;
import o0.C1444s;
import o0.C1445t;
import o0.C1447v;
import o0.y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i3) {
        super(str);
        this.f19773b = i3;
    }

    @Override // pb.q
    public final C1447v a() {
        switch (this.f19773b) {
            case 0:
                T0.s sVar = new T0.s();
                new C1221y();
                List list = Collections.EMPTY_LIST;
                Z z2 = Z.f4578e;
                C1442q c1442q = new C1442q();
                C1445t c1445t = C1445t.f18247a;
                String str = this.f19796a;
                Uri parse = str == null ? null : Uri.parse(str);
                return new C1447v("", new C1441p(sVar), parse != null ? new C1444s(parse, null, null, list, z2, -9223372036854775807L) : null, new C1443r(c1442q), y.f18281B, c1445t);
            default:
                T0.s sVar2 = new T0.s();
                new C1221y();
                List list2 = Collections.EMPTY_LIST;
                Z z10 = Z.f4578e;
                C1442q c1442q2 = new C1442q();
                C1445t c1445t2 = C1445t.f18247a;
                String str2 = this.f19796a;
                Uri parse2 = str2 == null ? null : Uri.parse(str2);
                return new C1447v("", new C1441p(sVar2), parse2 != null ? new C1444s(parse2, null, null, list2, z10, -9223372036854775807L) : null, new C1443r(c1442q2), y.f18281B, c1445t2);
        }
    }

    @Override // pb.q
    public final A b(Context context) {
        switch (this.f19773b) {
            case 0:
                return new C0120p(context);
            default:
                return new A() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory

                    /* renamed from: a, reason: collision with root package name */
                    public final SocketFactory f9977a = SocketFactory.getDefault();

                    @Override // L0.A
                    public final AbstractC0105a c(C1447v c1447v) {
                        c1447v.f18249b.getClass();
                        return new w(c1447v, new e(8), this.f9977a);
                    }
                };
        }
    }
}
