package ka;

import android.graphics.Path;
import android.graphics.PointF;
import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import la.C1249a;
import la.C1250b;
import la.C1251c;
import ma.C1290a;
import oa.AbstractC1469b;
import oa.j;
import oa.p;
import pa.i;
import sa.d;
import sa.f;
import ta.C1747g;
import za.AbstractC2020c;

/* renamed from: ka.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1121b {

    /* renamed from: b, reason: collision with root package name */
    public Ia.b f15511b;

    /* renamed from: c, reason: collision with root package name */
    public Ia.b f15512c;

    /* renamed from: e, reason: collision with root package name */
    public f f15514e;

    /* renamed from: f, reason: collision with root package name */
    public d f15515f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15510a = new HashMap(80);

    /* renamed from: d, reason: collision with root package name */
    public Deque f15513d = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public int f15516g = 0;

    public final void a(C1249a c1249a) {
        String string2;
        c1249a.f16834a = this;
        HashMap hashMap = this.f15510a;
        switch (c1249a.f16835b) {
            case 0:
                string2 = StubApp.getString2(19150);
                break;
            case 1:
                string2 = StubApp.getString2(19149);
                break;
            case 2:
                string2 = StubApp.getString2(4921);
                break;
            case 3:
                string2 = StubApp.getString2(1573);
                break;
            case 4:
                string2 = StubApp.getString2(19148);
                break;
            case 5:
                string2 = StubApp.getString2(19147);
                break;
            case 6:
                string2 = StubApp.getString2(4735);
                break;
            case 7:
                string2 = StubApp.getString2(4702);
                break;
            case 8:
                string2 = StubApp.getString2(19146);
                break;
            case 9:
                string2 = StubApp.getString2(4562);
                break;
            case 10:
                string2 = StubApp.getString2(19145);
                break;
            case 11:
                string2 = StubApp.getString2(19144);
                break;
            case 12:
                string2 = StubApp.getString2(19143);
                break;
            case 13:
                string2 = StubApp.getString2(19142);
                break;
            case 14:
                string2 = StubApp.getString2(4558);
                break;
            case 15:
                string2 = StubApp.getString2(19141);
                break;
            case 16:
                string2 = StubApp.getString2(19140);
                break;
            case 17:
                string2 = StubApp.getString2(19139);
                break;
            case 18:
                string2 = StubApp.getString2(19138);
                break;
            case 19:
                string2 = StubApp.getString2(4559);
                break;
            case 20:
                string2 = StubApp.getString2(620);
                break;
            default:
                string2 = StubApp.getString2(2123);
                break;
        }
        hashMap.put(string2, c1249a);
    }

    public final void b(C1747g c1747g) {
        if (c1747g != null) {
            Ea.b d8 = d();
            Ia.b bVar = d8.f2121d;
            float a3 = c1747g.a();
            float b2 = c1747g.b();
            float c10 = c1747g.c();
            float d10 = c1747g.d();
            PointF j = bVar.j(a3, b2);
            PointF j3 = bVar.j(c10, b2);
            PointF j10 = bVar.j(c10, d10);
            PointF j11 = bVar.j(a3, d10);
            Path path = new Path();
            path.moveTo(j.x, j.y);
            path.lineTo(j3.x, j3.y);
            path.lineTo(j10.x, j10.y);
            path.lineTo(j11.x, j11.y);
            path.close();
            if (!d8.f2118a) {
                d8.f2119b = new ArrayList(d8.f2119b);
                d8.f2118a = true;
            }
            d8.f2119b.add(new Path(path));
        }
    }

    public final void c() {
        int i3 = this.f15516g - 1;
        this.f15516g = i3;
        if (i3 < 0) {
            Log.e(StubApp.getString2(948), StubApp.getString2(19151) + this.f15516g);
        }
    }

    public final Ea.b d() {
        return (Ea.b) this.f15513d.peek();
    }

    public final void e(C1251c c1251c, List list) {
        C1249a c1249a = (C1249a) this.f15510a.get(c1251c.f16837a);
        if (c1249a != null) {
            c1249a.f16834a = this;
            try {
                c1249a.a(c1251c, list);
            } catch (IOException e10) {
                boolean z2 = e10 instanceof C1250b;
                String string2 = StubApp.getString2(948);
                if (z2 || (e10 instanceof i)) {
                    Log.e(string2, e10.getMessage());
                    return;
                }
                if (e10 instanceof C1290a) {
                    Log.w(string2, e10.getMessage());
                    return;
                }
                if (!c1251c.f16837a.equals(StubApp.getString2(19150))) {
                    throw e10;
                }
                Log.w(string2, e10.getMessage());
            }
        }
    }

    public final void f(InterfaceC1120a interfaceC1120a) {
        f h2 = h(interfaceC1120a);
        Deque deque = this.f15513d;
        ArrayDeque arrayDeque = new ArrayDeque(1);
        this.f15513d = arrayDeque;
        arrayDeque.add(((Ea.b) deque.peek()).clone());
        Ea.b d8 = d();
        Ia.b bVar = d8.f2121d;
        Ia.b a3 = interfaceC1120a.a();
        bVar.getClass();
        a3.i(bVar, bVar);
        d8.f2121d.clone();
        b(interfaceC1120a.b());
        try {
            g(interfaceC1120a);
        } finally {
            this.f15513d = deque;
            this.f15514e = h2;
        }
    }

    public final void g(InterfaceC1120a interfaceC1120a) {
        ArrayList arrayList = new ArrayList();
        ra.f fVar = new ra.f(interfaceC1120a);
        for (Object w10 = fVar.w(); w10 != null; w10 = fVar.w()) {
            if (w10 instanceof C1251c) {
                e((C1251c) w10, arrayList);
                arrayList.clear();
            } else {
                arrayList.add((AbstractC1469b) w10);
            }
        }
    }

    public final f h(InterfaceC1120a interfaceC1120a) {
        f fVar = this.f15514e;
        f d8 = interfaceC1120a.d();
        if (d8 != null) {
            this.f15514e = d8;
            return fVar;
        }
        if (this.f15514e == null) {
            f d10 = this.f15515f.d();
            this.f15514e = d10;
            if (d10 == null) {
                this.f15514e = new f();
            }
        }
        return fVar;
    }

    public final void i(Ba.a aVar) {
        if (this.f15515f == null) {
            throw new IllegalStateException(StubApp.getString2(19153));
        }
        if (((p) aVar.f23633a.f21257b).f18638d) {
            throw new IllegalStateException(StubApp.getString2(19152));
        }
        if (r0.N(j.f18495R1, null, 0) > 0) {
            f(aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0466  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(byte[] r35) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.AbstractC1121b.j(byte[]):void");
    }

    public final void k(Ba.b bVar) {
        if (this.f15515f == null) {
            throw new IllegalStateException(StubApp.getString2(19153));
        }
        f h2 = h(bVar);
        Deque deque = this.f15513d;
        ArrayDeque arrayDeque = new ArrayDeque(1);
        this.f15513d = arrayDeque;
        arrayDeque.add(((Ea.b) deque.peek()).clone());
        Ea.b d8 = d();
        d8.f2121d.clone();
        Ia.b bVar2 = d8.f2121d;
        Ia.b a3 = bVar.a();
        bVar2.getClass();
        a3.i(bVar2, bVar2);
        HashMap hashMap = AbstractC2020c.f24136a;
        b(bVar.b());
        try {
            g(bVar);
        } finally {
            this.f15513d = deque;
            this.f15514e = h2;
        }
    }
}
