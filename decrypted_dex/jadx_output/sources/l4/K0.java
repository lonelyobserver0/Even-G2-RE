package l4;

import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import f4.C0879c;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class K0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f16123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P0 f16124c;

    public K0(P0 p02, Bundle bundle, int i3) {
        this.f16122a = i3;
        switch (i3) {
            case 1:
                this.f16123b = bundle;
                Objects.requireNonNull(p02);
                this.f16124c = p02;
                break;
            case 2:
                this.f16124c = p02;
                this.f16123b = bundle;
                break;
            default:
                this.f16123b = bundle;
                Objects.requireNonNull(p02);
                this.f16124c = p02;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.f16122a) {
            case 0:
                String string2 = StubApp.getString2(3132);
                P0 p02 = this.f16124c;
                p02.k();
                p02.l();
                Bundle bundle2 = this.f16123b;
                String string = bundle2.getString(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
                String string3 = bundle2.getString(StubApp.getString2(3353));
                S3.D.e(string);
                S3.D.e(string3);
                String string22 = StubApp.getString2(1061);
                S3.D.h(bundle2.get(string22));
                C1200n0 c1200n0 = (C1200n0) p02.f4728a;
                if (!c1200n0.d()) {
                    T t3 = c1200n0.f16541f;
                    C1200n0.l(t3);
                    t3.f16249p.b(StubApp.getString2(19948));
                    break;
                } else {
                    H1 h12 = new H1(bundle2.getLong(StubApp.getString2(12366)), bundle2.get(string22), string, string3);
                    try {
                        K1 k12 = c1200n0.j;
                        C1200n0.j(k12);
                        bundle2.getString(string2);
                        C1215v M5 = k12.M(bundle2.getString(StubApp.getString2("12360")), bundle2.getBundle(StubApp.getString2("12361")), string3, 0L, true);
                        C1200n0.j(k12);
                        bundle2.getString(string2);
                        C1215v M10 = k12.M(bundle2.getString(StubApp.getString2("12358")), bundle2.getBundle(StubApp.getString2("12359")), string3, 0L, true);
                        bundle2.getString(string2);
                        c1200n0.o().D(new C1172e(bundle2.getString(string2), string3, h12, bundle2.getLong(StubApp.getString2(3138)), false, bundle2.getString(StubApp.getString2(12356)), M10, bundle2.getLong(StubApp.getString2(12357)), M5, bundle2.getLong(StubApp.getString2(12362)), k12.M(bundle2.getString(StubApp.getString2("12363")), bundle2.getBundle(StubApp.getString2("12364")), string3, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 1:
                String string23 = StubApp.getString2(3138);
                String string24 = StubApp.getString2(3132);
                P0 p03 = this.f16124c;
                p03.k();
                p03.l();
                Bundle bundle3 = this.f16123b;
                String string4 = bundle3.getString(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
                S3.D.e(string4);
                C1200n0 c1200n02 = (C1200n0) p03.f4728a;
                if (!c1200n02.d()) {
                    T t10 = c1200n02.f16541f;
                    C1200n0.l(t10);
                    t10.f16249p.b(StubApp.getString2(19947));
                    break;
                } else {
                    H1 h13 = new H1(0L, null, string4, "");
                    try {
                        K1 k13 = c1200n02.j;
                        C1200n0.j(k13);
                        bundle3.getString(string24);
                        c1200n02.o().D(new C1172e(bundle3.getString(string24), "", h13, bundle3.getLong(string23), bundle3.getBoolean(StubApp.getString2(12365)), bundle3.getString(StubApp.getString2(12356)), null, bundle3.getLong(StubApp.getString2(12357)), null, bundle3.getLong(StubApp.getString2(12362)), k13.M(bundle3.getString(StubApp.getString2("12363")), bundle3.getBundle(StubApp.getString2("12364")), "", bundle3.getLong(string23), true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                P0 p04 = this.f16124c;
                p04.getClass();
                Bundle bundle4 = this.f16123b;
                boolean isEmpty = bundle4.isEmpty();
                C1200n0 c1200n03 = (C1200n0) p04.f4728a;
                if (isEmpty) {
                    bundle = bundle4;
                } else {
                    C1164b0 c1164b0 = c1200n03.f16540e;
                    C1200n0.j(c1164b0);
                    bundle = new Bundle(c1164b0.f16367B.M());
                    Iterator<String> it = bundle4.keySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        C0879c c0879c = p04.f16225z;
                        C1178g c1178g = c1200n03.f16539d;
                        T t11 = c1200n03.f16541f;
                        K1 k14 = c1200n03.j;
                        if (hasNext) {
                            String next = it.next();
                            Object obj = bundle4.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                C1200n0.j(k14);
                                if (K1.s0(obj)) {
                                    K1.A(c0879c, null, 27, null, null, 0);
                                }
                                C1200n0.l(t11);
                                t11.f16246l.d(StubApp.getString2(19943), next, obj);
                            } else if (K1.I(next)) {
                                C1200n0.l(t11);
                                t11.f16246l.c(next, StubApp.getString2(19944));
                            } else if (obj == null) {
                                bundle.remove(next);
                            } else {
                                C1200n0.j(k14);
                                c1178g.getClass();
                                if (k14.t0(StubApp.getString2(19945), next, 500, obj)) {
                                    k14.z(bundle, next, obj);
                                }
                            }
                        } else {
                            C1200n0.j(k14);
                            K1 k15 = ((C1200n0) c1178g.f4728a).j;
                            C1200n0.j(k15);
                            int i3 = k15.P(201500000) ? 100 : 25;
                            if (bundle.size() > i3) {
                                Iterator it2 = new TreeSet(bundle.keySet()).iterator();
                                int i10 = 0;
                                while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    i10++;
                                    if (i10 > i3) {
                                        bundle.remove(str);
                                    }
                                }
                                C1200n0.j(k14);
                                K1.A(c0879c, null, 26, null, null, 0);
                                C1200n0.l(t11);
                                t11.f16246l.b(StubApp.getString2(19946));
                            }
                        }
                    }
                }
                C1164b0 c1164b02 = c1200n03.f16540e;
                C1200n0.j(c1164b02);
                c1164b02.f16367B.O(bundle);
                if (bundle4.isEmpty()) {
                    if (!c1200n03.f16539d.u(null, AbstractC1148D.W0)) {
                    }
                }
                c1200n03.o().p(bundle);
                break;
        }
    }
}
