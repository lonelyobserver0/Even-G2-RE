package Z9;

import L0.C0123t;
import R3.InterfaceC0242k;
import a0.C0379a;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import b5.InterfaceC0520a;
import cb.C0585c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.common.BillingService;
import com.stub.StubApp;
import d0.AbstractComponentCallbacksC0789t;
import d0.C0767E;
import d0.M;
import ea.InterfaceC0856c;
import f.C0861a;
import f.InterfaceC0862b;
import j9.C1096a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import k5.C1107b;
import k5.InterfaceC1108c;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.C1145A;
import l4.C1179g0;
import l4.C1200n0;
import l4.EnumC1181h;
import l4.EnumC1222y0;
import l4.T;
import n.C1345k;
import n.InterfaceC1301D0;
import o0.C1406C;
import org.json.JSONException;
import org.json.JSONObject;
import q4.InterfaceC1522c;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1725y;
import x9.C1924c;
import z0.C1987c;

/* renamed from: Z9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0366a implements InterfaceC0856c, a5.b, InterfaceC0520a, InterfaceC0862b, InterfaceC0242k, m.w, InterfaceC1301D0, m.j, q4.f, q4.e, InterfaceC1522c, P0.j, y0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9104a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9105b;

    public /* synthetic */ C0366a(int i3, boolean z2) {
        this.f9104a = i3;
    }

    public static String G(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), str);
        jSONObject.put(StubApp.getString2(3808), jSONObject2);
        return jSONObject.toString();
    }

    @Override // y0.h
    public long A(long j) {
        return 1L;
    }

    @Override // y0.h
    public long B(long j, long j3) {
        return 1L;
    }

    @Override // q4.e
    public void C(Exception exc) {
        ((CountDownLatch) this.f9105b).countDown();
    }

    public C1107b D(JSONObject jSONObject) {
        InterfaceC1108c c10;
        int i3 = jSONObject.getInt(StubApp.getString2(8141));
        if (i3 != 3) {
            Log.e(StubApp.getString2(280), StubApp.getString2(8142) + i3 + StubApp.getString2(8143), null);
            c10 = new C0585c(7);
        } else {
            c10 = new c5.C(8);
        }
        return c10.c((c5.C) this.f9105b, jSONObject);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 int, still in use, count: 2, list:
          (r11v2 int) from 0x003b: IF  (r11v2 int) < (100 int)  -> B:9:0x0040 A[HIDDEN]
          (r11v2 int) from 0x0040: PHI (r11v1 int) = (r11v2 int) binds: [B:8:0x003b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6 A[Catch: IOException -> 0x0139, TRY_LEAVE, TryCatch #0 {IOException -> 0x0139, blocks: (B:10:0x0040, B:16:0x005e, B:18:0x006f, B:20:0x0084, B:24:0x0091, B:31:0x00c0, B:36:0x00ed, B:40:0x00f6, B:43:0x0134, B:48:0x0119, B:49:0x00da, B:50:0x00e0, B:52:0x00e4, B:54:0x00e8, B:58:0x00a7, B:60:0x00af, B:61:0x00ba, B:42:0x010a), top: B:9:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4 A[Catch: IOException -> 0x0139, TryCatch #0 {IOException -> 0x0139, blocks: (B:10:0x0040, B:16:0x005e, B:18:0x006f, B:20:0x0084, B:24:0x0091, B:31:0x00c0, B:36:0x00ed, B:40:0x00f6, B:43:0x0134, B:48:0x0119, B:49:0x00da, B:50:0x00e0, B:52:0x00e4, B:54:0x00e8, B:58:0x00a7, B:60:0x00af, B:61:0x00ba, B:42:0x010a), top: B:9:0x0040, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String E(java.lang.String r24, java.lang.Double r25, java.lang.Double r26, int r27) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.C0366a.E(java.lang.String, java.lang.Double, java.lang.Double, int):java.lang.String");
    }

    public File F(Bitmap bitmap, Double d8, Double d10, int i3, String str) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, d8.intValue(), d10.intValue(), false);
        String j = E1.a.j(StubApp.getString2(8146), str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = createScaledBitmap.hasAlpha();
        if (hasAlpha) {
            Log.d(StubApp.getString2(8145), StubApp.getString2(8147));
        }
        createScaledBitmap.compress(hasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
        File file = new File(((Activity) this.f9105b).getCacheDir(), j);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        return file;
    }

    public void H(int i3, String str, List list, boolean z2, boolean z10) {
        Ac.b bVar;
        int i10 = i3 - 1;
        C1179g0 c1179g0 = (C1179g0) this.f9105b;
        if (i10 == 0) {
            T t3 = ((C1200n0) c1179g0.f4728a).f16541f;
            C1200n0.l(t3);
            bVar = t3.f16248n;
        } else if (i10 != 1) {
            if (i10 == 3) {
                T t10 = ((C1200n0) c1179g0.f4728a).f16541f;
                C1200n0.l(t10);
                bVar = t10.f16249p;
            } else if (i10 != 4) {
                T t11 = ((C1200n0) c1179g0.f4728a).f16541f;
                C1200n0.l(t11);
                bVar = t11.f16247m;
            } else if (z2) {
                T t12 = ((C1200n0) c1179g0.f4728a).f16541f;
                C1200n0.l(t12);
                bVar = t12.f16245k;
            } else if (z10) {
                T t13 = ((C1200n0) c1179g0.f4728a).f16541f;
                C1200n0.l(t13);
                bVar = t13.j;
            } else {
                T t14 = ((C1200n0) c1179g0.f4728a).f16541f;
                C1200n0.l(t14);
                bVar = t14.f16246l;
            }
        } else if (z2) {
            T t15 = ((C1200n0) c1179g0.f4728a).f16541f;
            C1200n0.l(t15);
            bVar = t15.f16243g;
        } else if (z10) {
            T t16 = ((C1200n0) c1179g0.f4728a).f16541f;
            C1200n0.l(t16);
            bVar = t16.f16242f;
        } else {
            T t17 = ((C1200n0) c1179g0.f4728a).f16541f;
            C1200n0.l(t17);
            bVar = t17.f16244h;
        }
        int size = list.size();
        if (size == 1) {
            bVar.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            bVar.d(str, list.get(0), list.get(1));
        } else if (size != 3) {
            bVar.b(str);
        } else {
            bVar.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void I(EnumC1222y0 enumC1222y0, int i3) {
        EnumC1181h enumC1181h = EnumC1181h.f16446b;
        if (i3 != -30) {
            if (i3 != -20) {
                if (i3 == -10) {
                    enumC1181h = EnumC1181h.f16449e;
                } else if (i3 != 0) {
                    if (i3 == 30) {
                        enumC1181h = EnumC1181h.f16450f;
                    }
                }
            }
            enumC1181h = EnumC1181h.f16451g;
        } else {
            enumC1181h = EnumC1181h.f16452h;
        }
        ((EnumMap) this.f9105b).put((EnumMap) enumC1222y0, (EnumC1222y0) enumC1181h);
    }

    public void J(EnumC1222y0 enumC1222y0, EnumC1181h enumC1181h) {
        ((EnumMap) this.f9105b).put((EnumMap) enumC1222y0, (EnumC1222y0) enumC1181h);
    }

    @Override // y0.h
    public long a(long j) {
        return 0L;
    }

    @Override // m.w
    public void b(m.l lVar, boolean z2) {
        i.u uVar;
        m.l k3 = lVar.k();
        int i3 = 0;
        boolean z10 = k3 != lVar;
        if (z10) {
            lVar = k3;
        }
        i.v vVar = (i.v) this.f9105b;
        i.u[] uVarArr = vVar.f14663T;
        int length = uVarArr != null ? uVarArr.length : 0;
        while (true) {
            if (i3 < length) {
                uVar = uVarArr[i3];
                if (uVar != null && uVar.f14637h == lVar) {
                    break;
                } else {
                    i3++;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar != null) {
            if (!z10) {
                vVar.s(uVar, z2);
            } else {
                vVar.p(uVar.f14630a, uVar, k3);
                vVar.s(uVar, true);
            }
        }
    }

    @Override // q4.InterfaceC1522c
    public void c() {
        ((CountDownLatch) this.f9105b).countDown();
    }

    @Override // y0.h
    public long d(long j, long j3) {
        return j3;
    }

    @Override // n.InterfaceC1301D0
    public void e(m.l lVar, m.n nVar) {
        m.f fVar = (m.f) this.f9105b;
        fVar.f16890f.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f16892h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (lVar == ((m.e) arrayList.get(i3)).f16881b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i10 = i3 + 1;
        fVar.f16890f.postAtTime(new N9.c(this, i10 < arrayList.size() ? (m.e) arrayList.get(i10) : null, nVar, lVar), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // f.InterfaceC0862b
    public void f(Object obj) {
        C0861a c0861a = (C0861a) obj;
        M m4 = (M) this.f9105b;
        d0.I i3 = (d0.I) m4.f13147F.pollLast();
        String string2 = StubApp.getString2(49);
        if (i3 == null) {
            Log.w(string2, StubApp.getString2(8148) + this);
            return;
        }
        D5.B b2 = m4.f13160c;
        String str = i3.f13137a;
        AbstractComponentCallbacksC0789t z2 = b2.z(str);
        if (z2 != null) {
            z2.u(i3.f13138b, c0861a.f13685a, c0861a.f13686b);
        } else {
            Log.w(string2, StubApp.getString2(8149) + str);
        }
    }

    @Override // y0.h
    public long g(long j, long j3) {
        return 0L;
    }

    @Override // m.j
    public void h(m.l lVar) {
        Toolbar toolbar = (Toolbar) this.f9105b;
        C1345k c1345k = toolbar.f9576a.f9482w;
        if (c1345k == null || !c1345k.k()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f9570K.f5712c).iterator();
            while (it.hasNext()) {
                ((C0767E) it.next()).f13132a.t();
            }
        }
        C0379a c0379a = toolbar.f9587l0;
        if (c0379a != null) {
            c0379a.h(lVar);
        }
    }

    @Override // q4.f
    public void i(Object obj) {
        ((CountDownLatch) this.f9105b).countDown();
    }

    @Override // y0.h
    public long j(long j, long j3) {
        return -9223372036854775807L;
    }

    @Override // y0.h
    public z0.j k(long j) {
        return (z0.j) this.f9105b;
    }

    @Override // R3.InterfaceC0242k
    public /* synthetic */ void l(Object obj) {
        ((f4.n) this.f9105b).f13760f.b();
    }

    @Override // m.w
    public boolean m(m.l lVar) {
        Window.Callback callback;
        if (lVar != lVar.k()) {
            return true;
        }
        i.v vVar = (i.v) this.f9105b;
        if (!vVar.f14657I || (callback = vVar.f14671m.getCallback()) == null || vVar.f14668k0) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // ea.InterfaceC0856c
    public K n(String str) {
        return ((C0367b) this.f9105b).f(0);
    }

    @Override // P0.j
    public void o(P0.l lVar, long j, long j3, boolean z2) {
        ((y0.g) this.f9105b).y((P0.r) lVar, j3);
    }

    @Override // y0.h
    public long p(long j, long j3) {
        return 0L;
    }

    @Override // m.j
    public boolean q(m.l lVar, MenuItem menuItem) {
        C0379a c0379a = ((Toolbar) this.f9105b).f9587l0;
        return false;
    }

    @Override // P0.j
    public void r(P0.l lVar, long j, long j3) {
        long j10;
        P0.r rVar = (P0.r) lVar;
        y0.g gVar = (y0.g) this.f9105b;
        gVar.getClass();
        long j11 = rVar.f5435a;
        C1725y c1725y = rVar.f5438d;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        gVar.f23395n.getClass();
        gVar.f23399s.d(c0123t, rVar.f5437c);
        C1987c c1987c = (C1987c) rVar.f5440f;
        C1987c c1987c2 = gVar.f23383L;
        int size = c1987c2 == null ? 0 : c1987c2.f23657m.size();
        long j12 = c1987c.b(0).f23679b;
        int i3 = 0;
        while (i3 < size && gVar.f23383L.b(i3).f23679b < j12) {
            i3++;
        }
        if (c1987c.f23649d) {
            if (size - i3 > c1987c.f23657m.size()) {
                AbstractC1550k.w(StubApp.getString2(8150), StubApp.getString2(8151));
            } else {
                long j13 = gVar.f23389Y;
                j10 = -9223372036854775807L;
                if (j13 == -9223372036854775807L || c1987c.f23653h * 1000 > j13) {
                    gVar.f23388X = 0;
                } else {
                    AbstractC1550k.w(StubApp.getString2(8150), StubApp.getString2(8152) + c1987c.f23653h + StubApp.getString2(81) + gVar.f23389Y);
                }
            }
            int i10 = gVar.f23388X;
            gVar.f23388X = i10 + 1;
            if (i10 < gVar.f23395n.t(rVar.f5437c)) {
                gVar.f23379G.postDelayed(gVar.f23404y, Math.min((gVar.f23388X - 1) * 1000, 5000));
                return;
            } else {
                gVar.f23378F = new B0.v();
                return;
            }
        }
        j10 = -9223372036854775807L;
        gVar.f23383L = c1987c;
        gVar.f23384O = c1987c.f23649d & gVar.f23384O;
        gVar.f23385P = j - j3;
        gVar.f23386R = j;
        gVar.f23390Z += i3;
        synchronized (gVar.f23402w) {
            try {
                if (rVar.f5436b.f21077a == gVar.f23381I) {
                    Uri uri2 = gVar.f23383L.f23655k;
                    if (uri2 == null) {
                        uri2 = rVar.f5438d.f21125c;
                    }
                    gVar.f23381I = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1987c c1987c3 = gVar.f23383L;
        if (!c1987c3.f23649d || gVar.f23387T != j10) {
            gVar.A(true);
            return;
        }
        Z4.b bVar = c1987c3.f23654i;
        if (bVar == null) {
            gVar.x();
            return;
        }
        String str = bVar.f8978b;
        int i11 = AbstractC1560u.f20190a;
        if (Objects.equals(str, StubApp.getString2(8153)) || Objects.equals(str, StubApp.getString2(8154))) {
            try {
                gVar.f23387T = AbstractC1560u.M(bVar.f8979c) - gVar.f23386R;
                gVar.A(true);
                return;
            } catch (C1406C e10) {
                gVar.z(e10);
                return;
            }
        }
        if (Objects.equals(str, StubApp.getString2(8155)) || Objects.equals(str, StubApp.getString2(8156))) {
            P0.r rVar2 = new P0.r(gVar.f23375C, Uri.parse(bVar.f8979c), 5, new y0.f());
            gVar.f23376D.f(rVar2, new y0.d(gVar), 1);
            gVar.f23399s.h(new C0123t(rVar2.f5436b), rVar2.f5437c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (Objects.equals(str, StubApp.getString2(8157)) || Objects.equals(str, StubApp.getString2(8158))) {
            P0.r rVar3 = new P0.r(gVar.f23375C, Uri.parse(bVar.f8979c), 5, new C1924c());
            gVar.f23376D.f(rVar3, new y0.d(gVar), 1);
            gVar.f23399s.h(new C0123t(rVar3.f5436b), rVar3.f5437c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (Objects.equals(str, StubApp.getString2(8159)) || Objects.equals(str, StubApp.getString2(8160))) {
            gVar.x();
        } else {
            gVar.z(new IOException(StubApp.getString2(8161)));
        }
    }

    @Override // n.InterfaceC1301D0
    public void s(m.l lVar, m.n nVar) {
        ((m.f) this.f9105b).f16890f.removeCallbacksAndMessages(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    @Override // P0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public A1.g t(P0.l r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            r6 = 0
            P0.r r5 = (P0.r) r5
            java.lang.Object r7 = r4.f9105b
            y0.g r7 = (y0.g) r7
            r7.getClass()
            L0.t r0 = new L0.t
            long r1 = r5.f5435a
            t0.y r1 = r5.f5438d
            android.net.Uri r2 = r1.f21125c
            java.util.Map r1 = r1.f21126d
            r0.<init>(r1, r8)
            I4.e r8 = r7.f23395n
            r8.getClass()
            boolean r8 = r10 instanceof o0.C1406C
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L55
            boolean r8 = r10 instanceof java.io.FileNotFoundException
            if (r8 != 0) goto L55
            boolean r8 = r10 instanceof t0.C1718r
            if (r8 != 0) goto L55
            boolean r8 = r10 instanceof P0.n
            if (r8 != 0) goto L55
            int r8 = t0.C1709i.f21069b
            r8 = r10
        L34:
            if (r8 == 0) goto L49
            boolean r9 = r8 instanceof t0.C1709i
            if (r9 == 0) goto L44
            r9 = r8
            t0.i r9 = (t0.C1709i) r9
            int r9 = r9.f21070a
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r9 != r3) goto L44
            goto L55
        L44:
            java.lang.Throwable r8 = r8.getCause()
            goto L34
        L49:
            int r11 = r11 + (-1)
            int r11 = r11 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r8 = java.lang.Math.min(r11, r8)
            long r8 = (long) r8
            goto L56
        L55:
            r8 = r1
        L56:
            int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r11 != 0) goto L5d
            A1.g r6 = P0.o.f5431f
            goto L63
        L5d:
            A1.g r11 = new A1.g
            r11.<init>(r6, r8, r6)
            r6 = r11
        L63:
            boolean r8 = r6.a()
            r8 = r8 ^ 1
            A0.f r7 = r7.f23399s
            int r5 = r5.f5437c
            r7.g(r0, r5, r10, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.C0366a.t(P0.l, long, long, java.io.IOException, int):A1.g");
    }

    public String toString() {
        switch (this.f9104a) {
            case 13:
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(878));
                for (EnumC1222y0 enumC1222y0 : EnumC1222y0.values()) {
                    EnumC1181h enumC1181h = (EnumC1181h) ((EnumMap) this.f9105b).get(enumC1222y0);
                    if (enumC1181h == null) {
                        enumC1181h = EnumC1181h.f16446b;
                    }
                    sb2.append(enumC1181h.f16455a);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // b5.InterfaceC0520a
    public void u(c5.q qVar) {
        this.f9105b = qVar;
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(8162), null);
        }
    }

    @Override // y0.h
    public boolean v() {
        return true;
    }

    public void w() {
        synchronized (((m6.l) this.f9105b).f17116h) {
            try {
                m6.l lVar = (m6.l) this.f9105b;
                if (lVar.f17110b) {
                    lVar.f17109a.obtainMessage(2131231188).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y0.h
    public long x() {
        return 0L;
    }

    @Override // a5.b
    public void y(String str, Bundle bundle) {
        String string2 = StubApp.getString2(8163);
        c5.q qVar = (c5.q) this.f9105b;
        if (qVar != null) {
            try {
                String str2 = string2 + G(str, bundle);
                c5.r rVar = qVar.f10924a;
                rVar.getClass();
                rVar.f10939p.f13422a.a(new c5.n(rVar, System.currentTimeMillis() - rVar.f10928d, str2, 1));
            } catch (JSONException unused) {
                Log.w(StubApp.getString2(280), StubApp.getString2(8164), null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    public void z(List routes) {
        ?? r10;
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f9105b = new HashMap();
        int i3 = 0;
        for (Object obj : routes) {
            int i10 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            HashMap hashMap = (HashMap) this.f9105b;
            String str = ((com.mapbox.navigation.base.route.g) routes.get(i3)).f12506i;
            DirectionsRoute directionsRoute = ((com.mapbox.navigation.base.route.g) obj).f12498a;
            List<RouteLeg> legs = directionsRoute.legs();
            List list = null;
            if (legs != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.f(legs));
                Iterator it = legs.iterator();
                while (it.hasNext()) {
                    List<LegStep> steps = ((RouteLeg) it.next()).steps();
                    if (steps != null) {
                        Intrinsics.checkNotNullExpressionValue(steps, "steps()");
                        r10 = new ArrayList(CollectionsKt.f(steps));
                        int i11 = 0;
                        for (LegStep step : steps) {
                            Intrinsics.checkNotNullExpressionValue(step, "step");
                            int size = i8.d.e(directionsRoute, step).size();
                            m9.f fVar = new m9.f(i11, size);
                            i11 += size - 1;
                            r10.add(fVar);
                        }
                    } else {
                        r10 = 0;
                    }
                    if (r10 == 0) {
                        r10 = CollectionsKt.emptyList();
                    }
                    arrayList.add(r10);
                }
                list = arrayList;
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            hashMap.put(str, list);
            i3 = i10;
        }
    }

    public /* synthetic */ C0366a(Object obj, int i3) {
        this.f9104a = i3;
        this.f9105b = obj;
    }

    public C0366a(C1179g0 c1179g0) {
        this.f9104a = 14;
        Objects.requireNonNull(c1179g0);
        this.f9105b = c1179g0;
    }

    public C0366a(EnumMap enumMap) {
        this.f9104a = 13;
        EnumMap enumMap2 = new EnumMap(EnumC1222y0.class);
        this.f9105b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public C0366a(Y.m evDynamicDataHolder) {
        this.f9104a = 24;
        Intrinsics.checkNotNullParameter(evDynamicDataHolder, "evDynamicDataHolder");
        this.f9105b = evDynamicDataHolder;
    }

    public C0366a(BillingService billingService) {
        this.f9104a = 21;
        Intrinsics.checkNotNullParameter(billingService, "billingService");
        this.f9105b = billingService;
    }

    public C0366a(Activity activity, C1145A c1145a) {
        this.f9104a = 19;
        this.f9105b = activity;
    }

    public C0366a(int i3) {
        this.f9104a = i3;
        switch (i3) {
            case 13:
                this.f9105b = new EnumMap(EnumC1222y0.class);
                break;
            case 23:
                this.f9105b = new CountDownLatch(1);
                break;
            default:
                this.f9105b = new C1096a();
                break;
        }
    }
}
