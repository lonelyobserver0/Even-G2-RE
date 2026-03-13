package A0;

import B0.v;
import D5.B;
import H0.C0063f;
import H0.C0064g;
import H0.E;
import H0.q;
import H0.r;
import H0.s;
import H0.t;
import H0.w;
import L0.X;
import P0.o;
import Qb.L;
import T.C0304u;
import Tb.InterfaceC0327h;
import Tb.InterfaceC0328i;
import Z9.AbstractC0368c;
import Z9.C;
import Z9.F;
import Z9.K;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.A;
import androidx.lifecycle.InterfaceC0444t;
import com.mapbox.navigator.ElectronicHorizonObserver;
import com.mapbox.navigator.ElectronicHorizonPosition;
import com.mapbox.navigator.RoadObjectEnterExitInfo;
import com.mapbox.navigator.RoadObjectPassInfo;
import com.stub.StubApp;
import d0.AbstractComponentCallbacksC0789t;
import d0.DialogInterfaceOnCancelListenerC0786p;
import d0.I;
import d0.M;
import ea.InterfaceC0856c;
import f.C0861a;
import f.InterfaceC0862b;
import java.io.IOException;
import java.net.BindException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l4.C1145A;
import o0.C1447v;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import s.C1590a;
import t8.C1739a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class c implements D3.b, P0.j, X, N0.c, Nc.b, Ka.a, InterfaceC0327h, ElectronicHorizonObserver, InterfaceC0856c, a5.a, A, InterfaceC0862b {

    /* renamed from: a, reason: collision with root package name */
    public Object f29a;

    public /* synthetic */ c(Object obj) {
        this.f29a = obj;
    }

    public static b g(Ec.d dVar) {
        new C1590a(3);
        dVar.getClass();
        new HashMap();
        throw null;
    }

    public static c h(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra(StubApp.getString2(4), false)) {
            arrayList.add(StubApp.getString2(5));
        }
        if (intent.getBooleanExtra(StubApp.getString2(6), false)) {
            arrayList.add(StubApp.getString2(7));
        }
        int intExtra = intent.getIntExtra(StubApp.getString2(8), 0);
        String string2 = StubApp.getString2(9);
        if (intExtra > 0) {
            arrayList.add(string2 + Integer.toString(intExtra));
        } else {
            int intExtra2 = intent.getIntExtra(StubApp.getString2(10), 0);
            if (intExtra2 > 0) {
                arrayList.add(string2 + Integer.toString(intExtra2));
            }
        }
        if (intent.getBooleanExtra(StubApp.getString2(11), false)) {
            arrayList.add(StubApp.getString2(12));
        }
        if (intent.getBooleanExtra(StubApp.getString2(13), false)) {
            arrayList.add(StubApp.getString2(14));
        }
        if (intent.getBooleanExtra(StubApp.getString2(15), false)) {
            arrayList.add(StubApp.getString2(16));
        }
        if (intent.getBooleanExtra(StubApp.getString2(17), false)) {
            arrayList.add(StubApp.getString2(18));
        }
        if (intent.getBooleanExtra(StubApp.getString2(19), false)) {
            arrayList.add(StubApp.getString2(20));
        }
        if (intent.getBooleanExtra(StubApp.getString2(21), false)) {
            arrayList.add(StubApp.getString2(22));
        }
        if (intent.getBooleanExtra(StubApp.getString2(23), false)) {
            arrayList.add(StubApp.getString2(24));
        }
        String stringExtra = intent.getStringExtra(StubApp.getString2(25));
        if (stringExtra != null) {
            arrayList.add(StubApp.getString2(26).concat(stringExtra));
        }
        if (intent.getBooleanExtra(StubApp.getString2(27), false)) {
            arrayList.add(StubApp.getString2(28));
        }
        String string22 = StubApp.getString2(29);
        if (intent.hasExtra(string22)) {
            arrayList.add(StubApp.getString2(30) + intent.getStringExtra(string22));
        }
        String string23 = StubApp.getString2(31);
        if (intent.hasExtra(string23)) {
            if (intent.getBooleanExtra(string23, false)) {
                arrayList.add(StubApp.getString2(32));
            } else {
                arrayList.add(StubApp.getString2(33));
            }
        }
        if (intent.getBooleanExtra(StubApp.getString2(34), false)) {
            arrayList.add(StubApp.getString2(35));
        }
        if (intent.getBooleanExtra(StubApp.getString2(36), false)) {
            arrayList.add(StubApp.getString2(37));
        }
        if (intent.getBooleanExtra(StubApp.getString2(38), false)) {
            arrayList.add(StubApp.getString2(39));
        }
        if (intent.getBooleanExtra(StubApp.getString2(40), false)) {
            arrayList.add(StubApp.getString2(41));
        }
        if (intent.getBooleanExtra(StubApp.getString2(42), false)) {
            arrayList.add(StubApp.getString2(43));
        }
        String string24 = StubApp.getString2(44);
        if (intent.hasExtra(string24)) {
            arrayList.add(StubApp.getString2(45) + intent.getStringExtra(string24));
        }
        c cVar = new c();
        cVar.f29a = new HashSet(arrayList);
        return cVar;
    }

    @Override // L0.X
    public void a() {
        t tVar = (t) this.f29a;
        tVar.f2627b.post(new q(tVar, 1));
    }

    @Override // Nc.b
    public FileChannel b() {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f29a;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException(StubApp.getString2(46) + parcelFileDescriptor);
    }

    @Override // androidx.lifecycle.A
    public void c(Object obj) {
        if (((InterfaceC0444t) obj) != null) {
            DialogInterfaceOnCancelListenerC0786p dialogInterfaceOnCancelListenerC0786p = (DialogInterfaceOnCancelListenerC0786p) this.f29a;
            if (dialogInterfaceOnCancelListenerC0786p.f13326t0) {
                View J10 = dialogInterfaceOnCancelListenerC0786p.J();
                if (J10.getParent() != null) {
                    throw new IllegalStateException(StubApp.getString2(50));
                }
                if (dialogInterfaceOnCancelListenerC0786p.f13330x0 != null) {
                    if (M.J(3)) {
                        Log.d(StubApp.getString2(49), StubApp.getString2(47) + this + StubApp.getString2(48) + dialogInterfaceOnCancelListenerC0786p.f13330x0);
                    }
                    dialogInterfaceOnCancelListenerC0786p.f13330x0.setContentView(J10);
                }
            }
        }
    }

    public void d(K1.a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        for (K1.a aVar : migrations) {
            int i3 = aVar.f3629a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f29a;
            Integer valueOf = Integer.valueOf(i3);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i10 = aVar.f3630b;
            if (treeMap.containsKey(Integer.valueOf(i10))) {
                Log.w(StubApp.getString2(53), StubApp.getString2(51) + treeMap.get(Integer.valueOf(i10)) + StubApp.getString2(52) + aVar);
            }
            treeMap.put(Integer.valueOf(i10), aVar);
        }
    }

    public void e(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f29a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // f.InterfaceC0862b
    public void f(Object obj) {
        C0861a c0861a = (C0861a) obj;
        M m4 = (M) this.f29a;
        I i3 = (I) m4.f13147F.pollFirst();
        String string2 = StubApp.getString2(49);
        if (i3 == null) {
            Log.w(string2, StubApp.getString2(54) + this);
            return;
        }
        B b2 = m4.f13160c;
        String str = i3.f13137a;
        AbstractComponentCallbacksC0789t z2 = b2.z(str);
        if (z2 != null) {
            z2.u(i3.f13138b, c0861a.f13685a, c0861a.f13686b);
        } else {
            Log.w(string2, StubApp.getString2(55) + str);
        }
    }

    @Override // Pb.a
    public Object get() {
        return new C3.d((Context) ((F5.c) this.f29a).f2238b, new I4.e(11), new C2.i());
    }

    public j i(C1447v c1447v) {
        c1447v.f18249b.getClass();
        c1447v.f18249b.getClass();
        return j.f36a;
    }

    public String j(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        e(sb2, it);
        return sb2.toString();
    }

    public void k(v vVar) {
        boolean z2 = vVar instanceof H0.v;
        t tVar = (t) this.f29a;
        if (!z2 || tVar.f2646y) {
            tVar.f2636m = vVar;
        } else {
            t.h(tVar);
        }
    }

    public void l(long j, M4.I i3) {
        C0063f c0063f;
        ArrayList arrayList = new ArrayList(i3.size());
        for (int i10 = 0; i10 < i3.size(); i10++) {
            String path = ((E) i3.get(i10)).f2488c.getPath();
            path.getClass();
            arrayList.add(path);
        }
        for (int i11 = 0; i11 < ((t) this.f29a).f2631f.size(); i11++) {
            if (!arrayList.contains(((r) ((t) this.f29a).f2631f.get(i11)).f2617b.f2544b.f2657b.getPath())) {
                w wVar = (w) ((t) this.f29a).f2632g.f9143b;
                wVar.f2652n = false;
                wVar.w();
                if (((t) this.f29a).i()) {
                    t tVar = (t) this.f29a;
                    tVar.f2641s = true;
                    tVar.f2638p = -9223372036854775807L;
                    tVar.f2637n = -9223372036854775807L;
                    tVar.f2639q = -9223372036854775807L;
                }
            }
        }
        for (int i12 = 0; i12 < i3.size(); i12++) {
            E e10 = (E) i3.get(i12);
            t tVar2 = (t) this.f29a;
            Uri uri = e10.f2488c;
            int i13 = 0;
            while (true) {
                ArrayList arrayList2 = tVar2.f2630e;
                if (i13 >= arrayList2.size()) {
                    c0063f = null;
                    break;
                }
                if (!((s) arrayList2.get(i13)).f2623d) {
                    r rVar = ((s) arrayList2.get(i13)).f2620a;
                    if (rVar.f2617b.f2544b.f2657b.equals(uri)) {
                        c0063f = rVar.f2617b;
                        break;
                    }
                }
                i13++;
            }
            if (c0063f != null) {
                long j3 = e10.f2486a;
                if (j3 != -9223372036854775807L) {
                    C0064g c0064g = c0063f.f2550h;
                    c0064g.getClass();
                    if (!c0064g.f2561h) {
                        c0063f.f2550h.f2562i = j3;
                    }
                }
                int i14 = e10.f2487b;
                C0064g c0064g2 = c0063f.f2550h;
                c0064g2.getClass();
                if (!c0064g2.f2561h) {
                    c0063f.f2550h.j = i14;
                }
                if (((t) this.f29a).i()) {
                    t tVar3 = (t) this.f29a;
                    if (tVar3.f2638p == tVar3.f2637n) {
                        long j10 = e10.f2486a;
                        c0063f.f2552l = j;
                        c0063f.f2553m = j10;
                    }
                }
            }
        }
        if (!((t) this.f29a).i()) {
            t tVar4 = (t) this.f29a;
            long j11 = tVar4.f2639q;
            if (j11 == -9223372036854775807L || !tVar4.f2646y) {
                return;
            }
            tVar4.k(j11);
            ((t) this.f29a).f2639q = -9223372036854775807L;
            return;
        }
        t tVar5 = (t) this.f29a;
        long j12 = tVar5.f2638p;
        long j13 = tVar5.f2637n;
        if (j12 == j13) {
            tVar5.f2638p = -9223372036854775807L;
            tVar5.f2637n = -9223372036854775807L;
        } else {
            tVar5.f2638p = -9223372036854775807L;
            tVar5.k(j13);
        }
    }

    @Override // a5.a
    public void m(Bundle bundle) {
        ((T4.b) ((T4.a) this.f29a)).a(StubApp.getString2(56), StubApp.getString2(57), bundle);
    }

    @Override // ea.InterfaceC0856c
    public K n(String str) {
        F f10 = (F) this.f29a;
        AbstractC0368c abstractC0368c = f10.f9125c;
        if (abstractC0368c.f9112a) {
            throw new IllegalStateException(StubApp.getString2(58));
        }
        Integer num = (Integer) abstractC0368c.f9115d.get(str);
        return f10.f(f10.f9125c.d(num == null ? 0 : num.intValue()), str);
    }

    @Override // P0.j
    public /* bridge */ /* synthetic */ void o(P0.l lVar, long j, long j3, boolean z2) {
    }

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public void onPositionUpdated(ElectronicHorizonPosition position, List distances) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(distances, "distances");
        B3.s sVar = (B3.s) this.f29a;
        L.j(((D9.f) sVar.f650b).f1513b, null, new W8.b(position, distances, sVar, null), 3);
    }

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public void onRoadObjectEnter(RoadObjectEnterExitInfo roadObjectInfo) {
        Intrinsics.checkNotNullParameter(roadObjectInfo, "roadObjectInfo");
        B3.s.a((B3.s) this.f29a, new W8.c(roadObjectInfo, null));
    }

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public void onRoadObjectExit(RoadObjectEnterExitInfo roadObjectInfo) {
        Intrinsics.checkNotNullParameter(roadObjectInfo, "roadObjectInfo");
        B3.s.a((B3.s) this.f29a, new W8.d(roadObjectInfo, null));
    }

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public void onRoadObjectPassed(RoadObjectPassInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        B3.s.a((B3.s) this.f29a, new W8.e(info, null));
    }

    @Override // Tb.InterfaceC0327h
    public Object p(InterfaceC0328i interfaceC0328i, Continuation continuation) {
        Object p8 = ((C) this.f29a).p(new C0304u(interfaceC0328i, 0), continuation);
        return p8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? p8 : Unit.INSTANCE;
    }

    public void q(String str, IOException iOException) {
        ((t) this.f29a).f2635l = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    @Override // P0.j
    public void r(P0.l lVar, long j, long j3) {
        C0063f c0063f = (C0063f) lVar;
        t tVar = (t) this.f29a;
        if (tVar.u() == 0) {
            if (tVar.f2646y) {
                return;
            }
            t.h(tVar);
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = tVar.f2630e;
            if (i3 >= arrayList.size()) {
                break;
            }
            s sVar = (s) arrayList.get(i3);
            if (sVar.f2620a.f2617b == c0063f) {
                sVar.a();
                break;
            }
            i3++;
        }
        tVar.f2629d.f2608q = 1;
    }

    @Override // P0.j
    public A1.g t(P0.l lVar, long j, long j3, IOException iOException, int i3) {
        C0063f c0063f = (C0063f) lVar;
        t tVar = (t) this.f29a;
        if (!tVar.f2643v) {
            tVar.f2635l = iOException;
        } else if (iOException.getCause() instanceof BindException) {
            int i10 = tVar.f2645x;
            tVar.f2645x = i10 + 1;
            if (i10 < 3) {
                return o.f5429d;
            }
        } else {
            tVar.f2636m = new v(c0063f.f2544b.f2657b.toString(), iOException);
        }
        return o.f5430e;
    }

    public void u(F7.g metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        ((C1739a) this.f29a).b(StubApp.getString2(68), StringsKt.trimIndent(StubApp.getString2(59) + metadata.f2299b + StubApp.getString2(60) + metadata.f2300c + StubApp.getString2(61) + metadata.f2301d + StubApp.getString2(62) + metadata.f2302e + StubApp.getString2(63) + metadata.f2303f + StubApp.getString2(64) + metadata.f2304g + StubApp.getString2(65) + metadata.f2305h + StubApp.getString2(66) + (SystemClock.elapsedRealtime() - metadata.f2298a) + StubApp.getString2(67)));
    }

    public void v(boolean z2) {
        ((WebSettingsBoundaryInterface) this.f29a).setPaymentRequestEnabled(z2);
    }

    public String[] w() {
        HashSet hashSet = (HashSet) this.f29a;
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public c(C1739a historyRecorder) {
        Intrinsics.checkNotNullParameter(historyRecorder, "historyRecorder");
        this.f29a = historyRecorder;
    }

    public c(int i3) {
        switch (i3) {
            case 1:
                this.f29a = new LinkedHashSet();
                break;
            case 2:
                this.f29a = new SparseArray();
                break;
            case 7:
                this.f29a = new LinkedHashMap();
                break;
            case 10:
                this.f29a = new C1145A(22);
                break;
            case 13:
                this.f29a = new CopyOnWriteArrayList();
                break;
            default:
                this.f29a = new Object();
                break;
        }
    }

    public c(String str) {
        str.getClass();
        this.f29a = str;
    }
}
