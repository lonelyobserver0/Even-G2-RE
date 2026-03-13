package C0;

import L0.C0123t;
import P0.r;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1560u;
import t0.C1725y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements P0.j {

    /* renamed from: q, reason: collision with root package name */
    public static final A1.a f907q = new A1.a(3);

    /* renamed from: a, reason: collision with root package name */
    public final Z9.q f908a;

    /* renamed from: b, reason: collision with root package name */
    public final p f909b;

    /* renamed from: c, reason: collision with root package name */
    public final I4.e f910c;

    /* renamed from: f, reason: collision with root package name */
    public A0.f f913f;

    /* renamed from: g, reason: collision with root package name */
    public P0.o f914g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f915h;
    public B0.l j;

    /* renamed from: k, reason: collision with root package name */
    public l f916k;

    /* renamed from: l, reason: collision with root package name */
    public Uri f917l;

    /* renamed from: m, reason: collision with root package name */
    public i f918m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f919n;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f912e = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f911d = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public long f920p = -9223372036854775807L;

    public c(Z9.q qVar, I4.e eVar, p pVar) {
        this.f908a = qVar;
        this.f909b = pVar;
        this.f910c = eVar;
    }

    public final i a(boolean z2, Uri uri) {
        HashMap hashMap = this.f911d;
        i iVar = ((b) hashMap.get(uri)).f899d;
        if (iVar != null && z2) {
            if (!uri.equals(this.f917l)) {
                List list = this.f916k.f972e;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((k) list.get(i3)).f964a)) {
                        i iVar2 = this.f918m;
                        if (iVar2 == null || !iVar2.f953o) {
                            this.f917l = uri;
                            b bVar = (b) hashMap.get(uri);
                            i iVar3 = bVar.f899d;
                            if (iVar3 == null || !iVar3.f953o) {
                                bVar.e(b(uri));
                            } else {
                                this.f918m = iVar3;
                                this.j.x(iVar3);
                            }
                        }
                    } else {
                        i3++;
                    }
                }
            }
            b bVar2 = (b) hashMap.get(uri);
            i iVar4 = bVar2.f899d;
            if (!bVar2.f905l) {
                bVar2.f905l = true;
                if (iVar4 != null && !iVar4.f953o) {
                    bVar2.c(true);
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.f918m;
        if (iVar == null || !iVar.f960v.f942e || (eVar = (e) iVar.f958t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter(StubApp.getString2(818), String.valueOf(eVar.f924b));
        int i3 = eVar.f925c;
        if (i3 != -1) {
            buildUpon.appendQueryParameter(StubApp.getString2(819), String.valueOf(i3));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i3;
        b bVar = (b) this.f911d.get(uri);
        if (bVar.f899d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, AbstractC1560u.V(bVar.f899d.f959u));
        i iVar = bVar.f899d;
        return iVar.f953o || (i3 = iVar.f943d) == 2 || i3 == 1 || bVar.f900e + max > elapsedRealtime;
    }

    @Override // P0.j
    public final void o(P0.l lVar, long j, long j3, boolean z2) {
        r rVar = (r) lVar;
        long j10 = rVar.f5435a;
        C1725y c1725y = rVar.f5438d;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        this.f910c.getClass();
        this.f913f.c(c0123t, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // P0.j
    public final void r(P0.l lVar, long j, long j3) {
        l lVar2;
        r rVar = (r) lVar;
        m mVar = (m) rVar.f5440f;
        boolean z2 = mVar instanceof i;
        if (z2) {
            String str = mVar.f980a;
            l lVar3 = l.f970n;
            Uri parse = Uri.parse(str);
            C1437l c1437l = new C1437l();
            c1437l.f18166a = StubApp.getString2(824);
            c1437l.f18176l = AbstractC1405B.m(StubApp.getString2(825));
            List singletonList = Collections.singletonList(new k(parse, new C1438m(c1437l), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            lVar2 = new l("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            lVar2 = (l) mVar;
        }
        this.f916k = lVar2;
        this.f917l = ((k) lVar2.f972e.get(0)).f964a;
        this.f912e.add(new a(this));
        List list2 = lVar2.f971d;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            Uri uri = (Uri) list2.get(i3);
            this.f911d.put(uri, new b(this, uri));
        }
        C1725y c1725y = rVar.f5438d;
        Uri uri2 = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        b bVar = (b) this.f911d.get(this.f917l);
        if (z2) {
            bVar.f((i) mVar, c0123t);
        } else {
            bVar.c(false);
        }
        this.f910c.getClass();
        this.f913f.d(c0123t, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    @Override // P0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A1.g t(P0.l r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            r6 = 0
            P0.r r5 = (P0.r) r5
            L0.t r7 = new L0.t
            long r0 = r5.f5435a
            t0.y r0 = r5.f5438d
            android.net.Uri r1 = r0.f21125c
            java.util.Map r0 = r0.f21126d
            r7.<init>(r0, r8)
            I4.e r8 = r4.f910c
            r8.getClass()
            boolean r8 = r10 instanceof o0.C1406C
            r9 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L4e
            boolean r8 = r10 instanceof java.io.FileNotFoundException
            if (r8 != 0) goto L4e
            boolean r8 = r10 instanceof t0.C1718r
            if (r8 != 0) goto L4e
            boolean r8 = r10 instanceof P0.n
            if (r8 != 0) goto L4e
            int r8 = t0.C1709i.f21069b
            r8 = r10
        L2e:
            if (r8 == 0) goto L43
            boolean r2 = r8 instanceof t0.C1709i
            if (r2 == 0) goto L3e
            r2 = r8
            t0.i r2 = (t0.C1709i) r2
            int r2 = r2.f21070a
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r2 != r3) goto L3e
            goto L4e
        L3e:
            java.lang.Throwable r8 = r8.getCause()
            goto L2e
        L43:
            int r11 = r11 - r9
            int r11 = r11 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r8 = java.lang.Math.min(r11, r8)
            long r2 = (long) r8
            goto L4f
        L4e:
            r2 = r0
        L4f:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L54
            goto L55
        L54:
            r9 = r6
        L55:
            A0.f r8 = r4.f913f
            int r5 = r5.f5437c
            r8.g(r7, r5, r10, r9)
            if (r9 == 0) goto L61
            A1.g r5 = P0.o.f5431f
            return r5
        L61:
            A1.g r5 = new A1.g
            r5.<init>(r6, r2, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.c.t(P0.l, long, long, java.io.IOException, int):A1.g");
    }
}
