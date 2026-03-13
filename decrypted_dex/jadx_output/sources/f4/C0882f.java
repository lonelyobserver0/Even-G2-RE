package f4;

import N.AbstractC0179z;
import N.I;
import N.InterfaceC0167m;
import N.N;
import N.O;
import N.P;
import N.Q;
import N.S;
import N.c0;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import cb.C0585c;
import com.google.android.gms.internal.measurement.BinderC0642l0;
import com.google.android.gms.internal.measurement.C0592b0;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.android.gms.internal.measurement.F1;
import com.mapbox.navigator.Experimental;
import com.stub.StubApp;
import ga.C0968a;
import i4.C1046j;
import i4.C1051o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import l4.C1164b0;
import l4.C1200n0;
import l4.C1224z0;
import l4.EnumC1218w0;
import l4.P0;
import l4.T;
import l4.q1;
import m.SubMenuC1257D;
import n.C1345k;
import n.W0;
import n.d1;
import vb.C1847d;
import vb.EnumC1848e;

/* renamed from: f4.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C0882f implements R3.n, InterfaceC0167m, W0, m.w, P0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13747a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13748b;

    public /* synthetic */ C0882f(int i3, boolean z2) {
        this.f13747a = i3;
    }

    public static void l(File file, ArrayList arrayList) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (!file2.isDirectory()) {
                    String lowerCase = file2.getName().toLowerCase(Locale.US);
                    if ((lowerCase.endsWith(StubApp.getString2(17470)) || lowerCase.endsWith(StubApp.getString2(17471)) || lowerCase.endsWith(StubApp.getString2(17472)) || lowerCase.endsWith(StubApp.getString2(17473))) && !lowerCase.startsWith(StubApp.getString2(17474))) {
                        arrayList.add(file2.toURI());
                    }
                } else if (!file2.getName().startsWith(StubApp.getString2(1))) {
                    l(file2, arrayList);
                }
            }
        }
    }

    public static C0882f p(String str) {
        return new C0882f((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC1218w0.f16645b : C1224z0.e(str.charAt(0)), 7);
    }

    @Override // P0.p
    public void a() {
        y0.g gVar = (y0.g) this.f13748b;
        gVar.f23376D.a();
        B0.v vVar = gVar.f23378F;
        if (vVar != null) {
            throw vVar;
        }
    }

    @Override // R3.n
    public void accept(Object obj, Object obj2) {
        q4.k kVar = (q4.k) obj2;
        p pVar = (p) obj;
        switch (this.f13747a) {
            case 0:
                pVar.B((C1046j) this.f13748b, kVar);
                break;
            default:
                C1051o c1051o = (C1051o) this.f13748b;
                F f10 = (F) pVar.t();
                j jVar = new j(0, kVar);
                Parcel g10 = f10.g();
                g.b(g10, c1051o);
                g10.writeStrongBinder(jVar);
                g10.writeString(null);
                f10.L(g10, 63);
                break;
        }
    }

    @Override // m.w
    public void b(m.l lVar, boolean z2) {
        if (lVar instanceof SubMenuC1257D) {
            ((SubMenuC1257D) lVar).f16860z.k().c(false);
        }
        m.w wVar = ((C1345k) this.f13748b).f17536e;
        if (wVar != null) {
            wVar.b(lVar, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0477 A[LOOP:21: B:146:0x0246->B:188:0x0477, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x040f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ac.f c(O0.l r38, java.util.EnumMap r39) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C0882f.c(O0.l, java.util.EnumMap):Ac.f");
    }

    @Override // N.InterfaceC0167m
    public c0 d(View view, c0 c0Var) {
        int i3;
        boolean z2;
        c0 c0Var2;
        boolean z10;
        int d8 = c0Var.d();
        i.v vVar = (i.v) this.f13748b;
        vVar.getClass();
        int d10 = c0Var.d();
        ActionBarContextView actionBarContextView = vVar.f14693y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i3 = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vVar.f14693y.getLayoutParams();
            if (vVar.f14693y.isShown()) {
                if (vVar.f14690w0 == null) {
                    vVar.f14690w0 = new Rect();
                    vVar.f14692x0 = new Rect();
                }
                Rect rect = vVar.f14690w0;
                Rect rect2 = vVar.f14692x0;
                rect.set(c0Var.b(), c0Var.d(), c0Var.c(), c0Var.a());
                ViewGroup viewGroup = vVar.f14652D;
                if (Build.VERSION.SDK_INT >= 29) {
                    d1.a(viewGroup, rect, rect2);
                } else {
                    boolean z11 = F1.f11265c;
                    String string2 = StubApp.getString2(17475);
                    if (!z11) {
                        F1.f11265c = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod(StubApp.getString2("17476"), Rect.class, Rect.class);
                            F1.f11266d = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                F1.f11266d.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d(string2, StubApp.getString2(17477));
                        }
                    }
                    Method method = F1.f11266d;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e10) {
                            Log.d(string2, StubApp.getString2(17478), e10);
                        }
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = vVar.f14652D;
                WeakHashMap weakHashMap = I.f4732a;
                c0 a3 = N.C.a(viewGroup2);
                int b2 = a3 == null ? 0 : a3.b();
                int c10 = a3 == null ? 0 : a3.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z10 = true;
                }
                Context context = vVar.f14669l;
                if (i10 <= 0 || vVar.f14654F != null) {
                    View view2 = vVar.f14654F;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c10;
                            vVar.f14654F.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    vVar.f14654F = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c10;
                    vVar.f14652D.addView(vVar.f14654F, -1, layoutParams);
                }
                View view4 = vVar.f14654F;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = vVar.f14654F;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(2131034118) : context.getColor(2131034117));
                }
                if (!vVar.f14659L && r11) {
                    d10 = 0;
                }
                z2 = r11;
                r11 = z10;
                i3 = 0;
            } else {
                i3 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = false;
                } else {
                    z2 = false;
                    r11 = false;
                }
            }
            if (r11) {
                vVar.f14693y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = vVar.f14654F;
        if (view6 != null) {
            view6.setVisibility(z2 ? i3 : 8);
        }
        if (d8 != d10) {
            int b10 = c0Var.b();
            int c11 = c0Var.c();
            int a9 = c0Var.a();
            int i15 = Build.VERSION.SDK_INT;
            S q10 = i15 >= 34 ? new Q(c0Var) : i15 >= 30 ? new P(c0Var) : i15 >= 29 ? new O(c0Var) : new N(c0Var);
            q10.d(F.c.a(b10, d10, c11, a9));
            c0Var2 = q10.b();
        } else {
            c0Var2 = c0Var;
        }
        WeakHashMap weakHashMap2 = I.f4732a;
        WindowInsets f10 = c0Var2.f();
        if (f10 == null) {
            return c0Var2;
        }
        WindowInsets b11 = AbstractC0179z.b(view, f10);
        return !b11.equals(f10) ? c0.g(b11, view) : c0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[Catch: c | e -> 0x005f, TryCatch #2 {c | e -> 0x005f, blocks: (B:14:0x001e, B:15:0x002f, B:17:0x0037, B:18:0x003a, B:20:0x003e, B:22:0x0048, B:24:0x004e, B:29:0x0053), top: B:13:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ac.f e(T5.b r9, java.util.EnumMap r10) {
        /*
            r8 = this;
            O0.l r0 = new O0.l
            r0.<init>()
            int r1 = r9.f7184b
            r2 = 21
            if (r1 < r2) goto L63
            r1 = r1 & 3
            r2 = 1
            if (r1 != r2) goto L63
            r0.f5143b = r9
            r9 = 0
            Ac.f r9 = r8.c(r0, r10)     // Catch: N5.c -> L18 N5.e -> L1c
            return r9
        L18:
            r1 = move-exception
            r2 = r1
            r1 = r9
            goto L1e
        L1c:
            r1 = move-exception
            r2 = r9
        L1e:
            r0.i()     // Catch: java.lang.Throwable -> L5f
            r0.f5144c = r9     // Catch: java.lang.Throwable -> L5f
            r0.f5145d = r9     // Catch: java.lang.Throwable -> L5f
            r9 = 1
            r0.f5142a = r9     // Catch: java.lang.Throwable -> L5f
            r0.h()     // Catch: java.lang.Throwable -> L5f
            r0.g()     // Catch: java.lang.Throwable -> L5f
            r9 = 0
        L2f:
            java.lang.Object r3 = r0.f5143b     // Catch: java.lang.Throwable -> L5f
            T5.b r3 = (T5.b) r3     // Catch: java.lang.Throwable -> L5f
            int r4 = r3.f7183a     // Catch: java.lang.Throwable -> L5f
            if (r9 >= r4) goto L53
            int r4 = r9 + 1
            r5 = r4
        L3a:
            int r6 = r3.f7184b     // Catch: java.lang.Throwable -> L5f
            if (r5 >= r6) goto L51
            boolean r6 = r3.b(r9, r5)     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r3.b(r5, r9)     // Catch: java.lang.Throwable -> L5f
            if (r6 == r7) goto L4e
            r3.a(r5, r9)     // Catch: java.lang.Throwable -> L5f
            r3.a(r9, r5)     // Catch: java.lang.Throwable -> L5f
        L4e:
            int r5 = r5 + 1
            goto L3a
        L51:
            r9 = r4
            goto L2f
        L53:
            Ac.f r9 = r8.c(r0, r10)     // Catch: java.lang.Throwable -> L5f
            k6.e r10 = new k6.e     // Catch: java.lang.Throwable -> L5f
            r10.<init>()     // Catch: java.lang.Throwable -> L5f
            r9.j = r10     // Catch: java.lang.Throwable -> L5f
            return r9
        L5f:
            if (r1 == 0) goto L62
            throw r1
        L62:
            throw r2
        L63:
            N5.e r9 = N5.e.a()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C0882f.e(T5.b, java.util.EnumMap):Ac.f");
    }

    public void f(int i3, int i10, int i11) {
        pa.c cVar = (pa.c) this.f13748b;
        for (int i12 = 0; i12 < i3; i12++) {
            int i13 = i3 - 1;
            boolean z2 = ((i10 >> (i13 - i12)) & 1) == 1;
            pa.c cVar2 = z2 ? cVar.f19726b : cVar.f19725a;
            if (cVar2 == null) {
                cVar2 = new pa.c();
                if (i12 == i13) {
                    cVar2.f19727c = i11;
                    cVar2.f19729e = true;
                }
                if (i10 == 0) {
                    cVar2.f19728d = true;
                }
                if (z2) {
                    cVar.f19726b = cVar2;
                } else {
                    cVar.f19725a = cVar2;
                }
            } else if (cVar2.f19729e) {
                throw new IOException(StubApp.getString2(17479));
            }
            cVar = cVar2;
        }
    }

    public void g(int i3, pa.c cVar) {
        pa.c cVar2 = (pa.c) this.f13748b;
        int i10 = 0;
        while (i10 < 12) {
            boolean z2 = ((i3 >> (11 - i10)) & 1) == 1;
            pa.c cVar3 = z2 ? cVar2.f19726b : cVar2.f19725a;
            if (cVar3 == null) {
                cVar3 = i10 == 11 ? cVar : new pa.c();
                if (i3 == 0) {
                    cVar3.f19728d = true;
                }
                if (z2) {
                    cVar2.f19726b = cVar3;
                } else {
                    cVar2.f19725a = cVar3;
                }
            } else if (cVar3.f19729e) {
                throw new IOException(StubApp.getString2(17479));
            }
            cVar2 = cVar3;
            i10++;
        }
    }

    public ArrayList h() {
        Object c0585c;
        if (((ga.b) this.f13748b) == null) {
            if (System.getProperty(StubApp.getString2(17480)).equals(StubApp.getString2(15901))) {
                c0585c = new C0968a(0);
            } else {
                String property = System.getProperty(StubApp.getString2(9653));
                c0585c = property.startsWith(StubApp.getString2(9660)) ? new C0585c(5) : property.startsWith(StubApp.getString2(17481)) ? new C0968a(1) : property.startsWith(StubApp.getString2(17482)) ? new C0968a(2) : new C0968a(3);
            }
            this.f13748b = c0585c;
        }
        ArrayList b2 = ((ga.b) this.f13748b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            l((File) it.next(), arrayList);
        }
        return arrayList;
    }

    public boolean i(C0882f c0882f, byte[] bArr, int i3) {
        c0882f.getClass();
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c0882f.f13748b;
        if (bArr != null) {
            int length = bArr.length;
            if (bArr.length >= 0) {
                byteArrayOutputStream.write(bArr, 0, Math.min(bArr.length, length));
            }
        }
        if (i3 == 0) {
            if (bArr == null) {
                return true;
            }
            try {
                EnumC1848e enumC1848e = EnumC1848e.f21933a;
                org.slf4j.a aVar = Hb.b.f3014b;
                if (enumC1848e.a()) {
                    throw new UnsupportedOperationException(StubApp.getString2("17484"));
                }
                if (bArr.length < 8) {
                    throw new IOException(StubApp.getString2("17483"));
                }
                this.f13748b = Integer.valueOf(C1847d.a(Arrays.copyOf(bArr, 8)).f21929d + 8);
            } catch (IOException unused) {
                return true;
            }
        }
        return byteArrayOutputStream.size() == ((Integer) this.f13748b).intValue();
    }

    public void j(U4.b bVar) {
        C0657o0 c0657o0 = (C0657o0) this.f13748b;
        c0657o0.getClass();
        ArrayList arrayList = c0657o0.f11637c;
        synchronized (arrayList) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i3)).first)) {
                        Log.w(StubApp.getString2("11932"), StubApp.getString2("17485"));
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC0642l0 binderC0642l0 = new BinderC0642l0(bVar);
            arrayList.add(new Pair(bVar, binderC0642l0));
            if (c0657o0.f11640f != null) {
                try {
                    c0657o0.f11640f.registerOnMeasurementEventListener(binderC0642l0);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(StubApp.getString2(11932), StubApp.getString2(17486));
                }
            }
            c0657o0.a(new C0592b0(c0657o0, binderC0642l0));
        }
    }

    public void k(ArrayList arrayList, String str, String str2) {
        SharedPreferences.Editor edit = ((Activity) this.f13748b).getSharedPreferences(StubApp.getString2(17487), 0).edit();
        if (arrayList != null) {
            edit.putStringSet(StubApp.getString2(17488), new HashSet(arrayList));
        }
        if (str != null) {
            edit.putString(StubApp.getString2(17489), str);
        }
        if (str2 != null) {
            edit.putString(StubApp.getString2(17490), str2);
        }
        edit.apply();
    }

    @Override // m.w
    public boolean m(m.l lVar) {
        C1345k c1345k = (C1345k) this.f13748b;
        if (lVar == c1345k.f17534c) {
            return false;
        }
        ((SubMenuC1257D) lVar).f16859A.getClass();
        c1345k.getClass();
        m.w wVar = c1345k.f17536e;
        if (wVar != null) {
            return wVar.m(lVar);
        }
        return false;
    }

    public void n() {
        q1 q1Var = (q1) this.f13748b;
        q1Var.k();
        C1200n0 c1200n0 = (C1200n0) q1Var.f4728a;
        C1164b0 c1164b0 = c1200n0.f16540e;
        C1200n0.j(c1164b0);
        W3.a aVar = c1200n0.f16545l;
        aVar.getClass();
        if (c1164b0.u(System.currentTimeMillis())) {
            C1164b0 c1164b02 = c1200n0.f16540e;
            C1200n0.j(c1164b02);
            c1164b02.f16376m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.f16249p.b(StubApp.getString2(17491));
                aVar.getClass();
                q(System.currentTimeMillis());
            }
        }
    }

    public void o(long j) {
        q1 q1Var = (q1) this.f13748b;
        q1Var.k();
        q1Var.o();
        C1200n0 c1200n0 = (C1200n0) q1Var.f4728a;
        C1164b0 c1164b0 = c1200n0.f16540e;
        C1200n0.j(c1164b0);
        boolean u2 = c1164b0.u(j);
        C1164b0 c1164b02 = c1200n0.f16540e;
        if (u2) {
            C1200n0.j(c1164b02);
            c1164b02.f16376m.b(true);
            c1200n0.q().p();
        }
        C1200n0.j(c1164b02);
        c1164b02.f16380r.h(j);
        if (c1164b02.f16376m.a()) {
            q(j);
        }
    }

    public void q(long j) {
        q1 q1Var = (q1) this.f13748b;
        q1Var.k();
        C1200n0 c1200n0 = (C1200n0) q1Var.f4728a;
        if (c1200n0.d()) {
            C1164b0 c1164b0 = c1200n0.f16540e;
            C1200n0.j(c1164b0);
            c1164b0.f16380r.h(j);
            c1200n0.f16545l.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16249p.c(Long.valueOf(elapsedRealtime), StubApp.getString2(17492));
            long j3 = j / 1000;
            Long valueOf = Long.valueOf(j3);
            P0 p02 = c1200n0.f16547n;
            C1200n0.k(p02);
            p02.v(j, valueOf, StubApp.getString2(3305), StubApp.getString2(17493));
            C1200n0.j(c1164b0);
            c1164b0.f16381s.h(j3);
            c1164b0.f16376m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong(StubApp.getString2(17493), j3);
            C1200n0.k(p02);
            p02.s(j, bundle, StubApp.getString2(3305), StubApp.getString2(6361));
            String k3 = c1164b0.f16386y.k();
            if (TextUtils.isEmpty(k3)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(StubApp.getString2(17494), k3);
            C1200n0.k(p02);
            p02.s(j, bundle2, StubApp.getString2(3305), StubApp.getString2(17495));
        }
    }

    public /* synthetic */ C0882f(Object obj, int i3) {
        this.f13747a = i3;
        this.f13748b = obj;
    }

    public C0882f(q1 q1Var) {
        this.f13747a = 8;
        Objects.requireNonNull(q1Var);
        this.f13748b = q1Var;
    }

    public C0882f(Experimental experimental) {
        this.f13747a = 10;
        Intrinsics.checkNotNullParameter(experimental, "experimental");
        this.f13748b = experimental;
    }

    public C0882f(int i3) {
        this.f13747a = i3;
        switch (i3) {
            case 14:
                this.f13748b = new ByteArrayOutputStream();
                break;
            case 15:
                this.f13748b = new pa.c();
                break;
            default:
                this.f13748b = new s2.d(V5.a.f7749l, 19);
                break;
        }
    }

    public C0882f(xc.a threadFactory) {
        this.f13747a = 20;
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.f13748b = new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }
}
