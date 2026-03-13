package A0;

import D5.C0043g;
import L0.B;
import L0.C0123t;
import L0.D;
import L0.E;
import L0.F;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.C1438m;
import r0.AbstractC1560u;
import r0.InterfaceC1542c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f32a;

    /* renamed from: b, reason: collision with root package name */
    public final B f33b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f34c;

    public /* synthetic */ f(CopyOnWriteArrayList copyOnWriteArrayList, int i3, B b2) {
        this.f34c = copyOnWriteArrayList;
        this.f32a = i3;
        this.f33b = b2;
    }

    public void a(InterfaceC1542c interfaceC1542c) {
        Iterator it = this.f34c.iterator();
        while (it.hasNext()) {
            F f10 = (F) it.next();
            AbstractC1560u.N(f10.f3895a, new Ab.b(10, interfaceC1542c, f10.f3896b));
        }
    }

    public void b(int i3, C1438m c1438m, int i10, Object obj, long j) {
        a(new C0043g(8, this, new I0.g(1, i3, c1438m, i10, obj, AbstractC1560u.V(j), -9223372036854775807L)));
    }

    public void c(C0123t c0123t, int i3, int i10, C1438m c1438m, int i11, Object obj, long j, long j3) {
        a(new D(this, c0123t, new I0.g(i3, i10, c1438m, i11, obj, AbstractC1560u.V(j), AbstractC1560u.V(j3)), 2));
    }

    public void d(C0123t c0123t, int i3) {
        e(c0123t, i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void e(C0123t c0123t, int i3, int i10, C1438m c1438m, int i11, Object obj, long j, long j3) {
        a(new D(this, c0123t, new I0.g(i3, i10, c1438m, i11, obj, AbstractC1560u.V(j), AbstractC1560u.V(j3)), 1));
    }

    public void f(C0123t c0123t, int i3, int i10, C1438m c1438m, int i11, Object obj, long j, long j3, IOException iOException, boolean z2) {
        a(new E(this, c0123t, new I0.g(i3, i10, c1438m, i11, obj, AbstractC1560u.V(j), AbstractC1560u.V(j3)), iOException, z2));
    }

    public void g(C0123t c0123t, int i3, IOException iOException, boolean z2) {
        f(c0123t, i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z2);
    }

    public void h(C0123t c0123t, int i3, int i10, C1438m c1438m, int i11, Object obj, long j, long j3) {
        a(new D(this, c0123t, new I0.g(i3, i10, c1438m, i11, obj, AbstractC1560u.V(j), AbstractC1560u.V(j3)), 0));
    }
}
