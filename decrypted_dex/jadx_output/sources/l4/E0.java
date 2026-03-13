package l4;

import Kc.C0104k;
import T.InterfaceC0294j;
import Tb.InterfaceC0327h;
import android.content.Context;
import android.content.res.Resources;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.Surface;
import androidx.lifecycle.C0435j;
import androidx.lifecycle.InterfaceC0444t;
import com.google.android.gms.common.api.Status;
import com.mapbox.navigator.EventsMetadataInterface;
import com.stub.StubApp;
import f4.C0882f;
import io.flutter.plugin.common.EventChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import l4.E0;
import m8.C1285f;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1552m;
import rc.C1589d;
import t0.C1710j;
import tc.x;
import tc.z;
import vb.EnumC1846c;
import vb.InterfaceC1845b;
import wc.C1881F;
import wc.InterfaceC1887d;
import wc.InterfaceC1888e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class E0 implements InterfaceC1845b, E0.m, P0.q, K5.b, ReadOnlyProperty, InterfaceC1888e, EventsMetadataInterface, InterfaceC0327h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16036a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16037b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16038c;

    public /* synthetic */ E0(int i3, Object obj, Object obj2) {
        this.f16036a = i3;
        this.f16037b = obj;
        this.f16038c = obj2;
    }

    public static C1552m v() {
        return new C1552m();
    }

    public int A() {
        return ((int[]) this.f16038c).length - 1;
    }

    public Ab.e B() {
        if (((Ab.e) this.f16037b) == null) {
            this.f16037b = new Ab.e();
        }
        return (Ab.e) this.f16037b;
    }

    public M1.d C() {
        M1.d dVar;
        String key = StubApp.getString2(19641);
        Intrinsics.checkNotNullParameter(key, "key");
        C2.c cVar = (C2.c) this.f16037b;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (((u5.d) cVar.f1053f)) {
            Iterator it = ((LinkedHashMap) cVar.f1054g).entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                M1.d dVar2 = (M1.d) entry.getValue();
                if (Intrinsics.areEqual(str, key)) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public String D(String str) {
        String string2 = StubApp.getString2(983);
        String str2 = (String) this.f16038c;
        Resources resources = (Resources) this.f16037b;
        int identifier = resources.getIdentifier(str, string2, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public Object E(A9.a k3) {
        Object obj;
        Intrinsics.checkNotNullParameter(k3, "k");
        synchronized (((LruCache) this.f16038c)) {
            obj = ((LruCache) this.f16038c).get(k3);
            if (obj == null) {
                obj = k3.a((Function) this.f16037b);
                ((LruCache) this.f16038c).put(k3, obj);
            }
        }
        return obj;
    }

    public boolean F() {
        return ((int[]) this.f16038c)[0] == 0;
    }

    public E0 G(int i3) {
        V5.a aVar = (V5.a) this.f16037b;
        if (i3 == 0) {
            return aVar.f7755c;
        }
        if (i3 == 1) {
            return this;
        }
        int[] iArr = (int[]) this.f16038c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = aVar.b(iArr[i10], i3);
        }
        return new E0(aVar, iArr2);
    }

    public void H(Throwable th) {
        P0 p02 = (P0) this.f16038c;
        p02.k();
        p02.j = false;
        C1200n0 c1200n0 = (C1200n0) p02.f4728a;
        int i3 = 2;
        if (c1200n0.f16539d.u(null, AbstractC1148D.f15961T0)) {
            String message = th.getMessage();
            p02.f16216p = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains(StubApp.getString2(19642)) || th.getClass().getSimpleName().equals(StubApp.getString2(19643))) {
                    if (message.contains(StubApp.getString2(13357))) {
                        p02.f16216p = true;
                    }
                    i3 = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith(StubApp.getString2(19644))) {
                    i3 = 3;
                }
            }
        }
        int i10 = i3 - 1;
        u1 u1Var = (u1) this.f16037b;
        T t3 = c1200n0.f16541f;
        if (i10 == 0) {
            C1200n0.l(t3);
            t3.j.d(StubApp.getString2(19648), T.s(c1200n0.q().q()), T.s(th.toString()));
            p02.f16212k = 1;
            p02.H().add(u1Var);
            return;
        }
        if (i10 != 1) {
            C1200n0.l(t3);
            t3.f16242f.d(StubApp.getString2(19645), T.s(c1200n0.q().q()), th);
            O();
            p02.f16212k = 1;
            p02.I();
            return;
        }
        p02.H().add(u1Var);
        if (p02.f16212k > ((Integer) AbstractC1148D.f16025w0.a(null)).intValue()) {
            p02.f16212k = 1;
            C1200n0.l(t3);
            t3.j.d(StubApp.getString2(19646), T.s(c1200n0.q().q()), T.s(th.toString()));
            return;
        }
        C1200n0.l(t3);
        t3.j.e(StubApp.getString2(19647), T.s(c1200n0.q().q()), T.s(String.valueOf(p02.f16212k)), T.s(th.toString()));
        int i11 = p02.f16212k;
        if (p02.f16213l == null) {
            p02.f16213l = new D0(p02, c1200n0, 1);
        }
        p02.f16213l.b(i11 * 1000);
        int i12 = p02.f16212k;
        p02.f16212k = i12 + i12;
    }

    public void I(R8.I it) {
        Intrinsics.checkNotNullParameter(it, "result");
        Iterator it2 = ((CopyOnWriteArraySet) this.f16037b).iterator();
        while (it2.hasNext()) {
            m8.r this$0 = ((C1285f) it2.next()).f17168a;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            List listOf = CollectionsKt.listOf(it.f6271a.f6256a);
            ArrayList arrayList = it.f6272b;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((R8.C) it3.next()).f6256a);
            }
            this$0.h(CollectionsKt___CollectionsKt.plus((Collection) listOf, (Iterable) arrayList2), new m8.D((u8.h) it.f6271a.f6257b), null);
        }
    }

    public void J(final int i3, final int i10, final long j) {
        C1589d c1589d = ((Ab.i) this.f16038c).f288c;
        B().execute(new Runnable() { // from class: Ab.d
            @Override // java.lang.Runnable
            public final void run() {
                C1589d c1589d2 = ((i) E0.this.f16038c).f288c;
                int i11 = i10;
                long j3 = j;
                int i12 = i3;
                c1589d2.getClass();
                z zVar = new z(c1589d2.f20569e, new x(i12, i11, j3, C0104k.f3820d), 22);
                EventChannel.EventSink eventSink = c1589d2.f20566b.f21940a;
                if (eventSink != null) {
                    eventSink.success(zVar.a());
                }
            }
        });
    }

    public void K(String key, M1.d provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        C2.c cVar = (C2.c) this.f16037b;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (((u5.d) cVar.f1053f)) {
            if (((LinkedHashMap) cVar.f1054g).containsKey(key)) {
                throw new IllegalArgumentException(StubApp.getString2("19649"));
            }
            ((LinkedHashMap) cVar.f1054g).put(key, provider);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(1:(7:10|11|12|13|14|(3:16|(1:18)(1:20)|19)|21)(2:26|27))(3:28|29|30))(5:56|57|58|(1:60)|43)|31|32|33|(9:35|36|37|38|39|40|41|(5:44|13|14|(0)|21)|43)(2:52|53)))|64|6|(0)(0)|31|32|33|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bf, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #5 {all -> 0x00bf, blocks: (B:33:0x0072, B:35:0x007b, B:52:0x00b5, B:53:0x00be), top: B:32:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #5 {all -> 0x00bf, blocks: (B:33:0x0072, B:35:0x007b, B:52:0x00b5, B:53:0x00be), top: B:32:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(com.mapbox.api.directions.v5.models.VoiceInstructions r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.E0.L(com.mapbox.api.directions.v5.models.VoiceInstructions, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public void M() {
        Intrinsics.checkNotNullParameter(C0435j.class, StubApp.getString2(19651));
        if (!((C2.c) this.f16037b).f1050c) {
            throw new IllegalStateException(StubApp.getString2(16551));
        }
        M1.a aVar = (M1.a) this.f16038c;
        if (aVar == null) {
            aVar = new M1.a(this);
        }
        this.f16038c = aVar;
        try {
            C0435j.class.getDeclaredConstructor(new Class[0]);
            M1.a aVar2 = (M1.a) this.f16038c;
            if (aVar2 != null) {
                String className = C0435j.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "getName(...)");
                Intrinsics.checkNotNullParameter(className, "className");
                ((LinkedHashSet) aVar2.f4509b).add(className);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException(StubApp.getString2(3483) + C0435j.class.getSimpleName() + StubApp.getString2(3486), e10);
        }
    }

    public void N(boolean z2, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f16037b)) {
            hashMap = new HashMap((Map) this.f16037b);
        }
        synchronized (((Map) this.f16038c)) {
            hashMap2 = new HashMap((Map) this.f16038c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((q4.k) entry2.getKey()).c(new Q3.e(status));
            }
        }
    }

    public void O() {
        C1200n0 c1200n0 = (C1200n0) ((P0) this.f16038c).f4728a;
        C1164b0 c1164b0 = c1200n0.f16540e;
        C1200n0.j(c1164b0);
        SparseArray q10 = c1164b0.q();
        u1 u1Var = (u1) this.f16037b;
        q10.put(u1Var.f16637c, Long.valueOf(u1Var.f16636b));
        C1164b0 c1164b02 = c1200n0.f16540e;
        C1200n0.j(c1164b02);
        int[] iArr = new int[q10.size()];
        long[] jArr = new long[q10.size()];
        for (int i3 = 0; i3 < q10.size(); i3++) {
            iArr[i3] = q10.keyAt(i3);
            jArr[i3] = ((Long) q10.valueAt(i3)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray(StubApp.getString2(19652), iArr);
        bundle.putLongArray(StubApp.getString2(19653), jArr);
        c1164b02.f16378p.O(bundle);
    }

    @Override // E0.m
    public void a(int i3, u0.b bVar, long j, int i10) {
        ((MediaCodec) this.f16037b).queueSecureInputBuffer(i3, 0, bVar.f21393i, j, i10);
    }

    @Override // E0.m
    public void b(Bundle bundle) {
        ((MediaCodec) this.f16037b).setParameters(bundle);
    }

    @Override // E0.m
    public void c(int i3, int i10, long j, int i11) {
        ((MediaCodec) this.f16037b).queueInputBuffer(i3, 0, i10, j, i11);
    }

    @Override // P0.q
    public Object d(Uri uri, C1710j c1710j) {
        G0.a aVar = (G0.a) ((P0.q) this.f16037b).d(uri, c1710j);
        List list = (List) this.f16038c;
        return (list == null || list.isEmpty()) ? aVar : (G0.a) aVar.a(list);
    }

    @Override // E0.m
    public void e(int i3) {
        ((MediaCodec) this.f16037b).releaseOutputBuffer(i3, false);
    }

    @Override // E0.m
    public MediaFormat f() {
        return ((MediaCodec) this.f16037b).getOutputFormat();
    }

    @Override // E0.m
    public void flush() {
        ((MediaCodec) this.f16037b).flush();
    }

    @Override // E0.m
    public void g() {
        ((MediaCodec) this.f16037b).detachOutputSurface();
    }

    @Override // Pb.a
    public Object get() {
        switch (this.f16036a) {
            case 10:
                return new H5.N((CoroutineContext) ((K5.c) this.f16037b).f3721a, (InterfaceC0294j) ((Pb.a) this.f16038c).get());
            default:
                return new L5.j((L5.o) ((Pb.a) this.f16037b).get(), (L5.o) ((Pb.a) this.f16038c).get());
        }
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public Object getValue(Object thisRef, KProperty property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Lazy lazy = H8.b.f2941a;
        m8.r rVar = H8.b.a().a().f2950c;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException(StubApp.getString2(19654));
    }

    @Override // E0.m
    public void h(int i3, long j) {
        ((MediaCodec) this.f16037b).releaseOutputBuffer(i3, j);
    }

    @Override // vb.InterfaceC1845b
    public void i(Db.c cVar) {
        boolean z2 = cVar instanceof Db.b;
        Cb.d dVar = (Cb.d) this.f16038c;
        Mb.a aVar = (Mb.a) this.f16037b;
        if (z2) {
            Db.b bVar = (Db.b) cVar;
            if (bVar.f1531a == EnumC1846c.f21919k || bVar.f1532b != null) {
                aVar.h(dVar);
                return;
            }
        }
        aVar.i(dVar, cVar);
    }

    @Override // E0.m
    public int j() {
        return ((MediaCodec) this.f16037b).dequeueInputBuffer(0L);
    }

    @Override // E0.m
    public int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.f16037b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // E0.m
    public void l(R0.e eVar, Handler handler) {
        ((MediaCodec) this.f16037b).setOnFrameRenderedListener(new E0.b(this, eVar, 1), handler);
    }

    @Override // vb.InterfaceC1845b
    public void m(Hb.b bVar) {
        Cb.d.f1161a.c((Lb.a) bVar, StubApp.getString2(19655));
        ((Mb.a) this.f16037b).h((Cb.d) this.f16038c);
    }

    @Override // E0.m
    public void n(int i3) {
        ((MediaCodec) this.f16037b).setVideoScalingMode(i3);
    }

    @Override // E0.m
    public ByteBuffer o(int i3) {
        return ((MediaCodec) this.f16037b).getInputBuffer(i3);
    }

    @Override // wc.InterfaceC1888e
    public void onFailure(InterfaceC1887d call, IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        ((Jc.f) this.f16037b).c(e10, null);
    }

    @Override // wc.InterfaceC1888e
    public void onResponse(InterfaceC1887d interfaceC1887d, C1881F response) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        boolean equals6;
        Intrinsics.checkNotNullParameter(interfaceC1887d, StubApp.getString2(814));
        Intrinsics.checkNotNullParameter(response, "response");
        Ac.e eVar = response.f22336n;
        try {
            ((Jc.f) this.f16037b).a(response, eVar);
            Intrinsics.checkNotNull(eVar);
            Ac.n e10 = eVar.e();
            wc.s responseHeaders = response.f22330f;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            int i3 = 0;
            int i10 = 0;
            boolean z2 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            Integer num = null;
            Integer num2 = null;
            while (i10 < size) {
                int i11 = i10 + 1;
                equals = StringsKt__StringsJVMKt.equals(responseHeaders.b(i10), StubApp.getString2(13807), true);
                if (equals) {
                    String d8 = responseHeaders.d(i10);
                    int i12 = i3;
                    while (i12 < d8.length()) {
                        wc.s sVar = responseHeaders;
                        int g10 = xc.b.g(d8, ',', i12, i3, 4);
                        int e11 = xc.b.e(d8, ';', i12, g10);
                        String y10 = xc.b.y(i12, e11, d8);
                        int i13 = e11 + 1;
                        equals2 = StringsKt__StringsJVMKt.equals(y10, StubApp.getString2(13813), true);
                        if (equals2) {
                            if (z2) {
                                z12 = true;
                            }
                            i12 = i13;
                            while (i12 < g10) {
                                int e12 = xc.b.e(d8, ';', i12, g10);
                                int e13 = xc.b.e(d8, '=', i12, e12);
                                String y11 = xc.b.y(i12, e13, d8);
                                String removeSurrounding = e13 < e12 ? StringsKt__StringsKt.removeSurrounding(xc.b.y(e13 + 1, e12, d8), (CharSequence) "\"") : null;
                                int i14 = e12 + 1;
                                equals3 = StringsKt__StringsJVMKt.equals(y11, StubApp.getString2(19656), true);
                                if (equals3) {
                                    if (num != null) {
                                        z12 = true;
                                    }
                                    num = removeSurrounding == null ? null : StringsKt.toIntOrNull(removeSurrounding);
                                    if (num == null) {
                                        i12 = i14;
                                        z12 = true;
                                    } else {
                                        i12 = i14;
                                    }
                                } else {
                                    equals4 = StringsKt__StringsJVMKt.equals(y11, StubApp.getString2(19657), true);
                                    if (equals4) {
                                        if (z10) {
                                            z12 = true;
                                        }
                                        if (removeSurrounding != null) {
                                            z12 = true;
                                        }
                                        i12 = i14;
                                        z10 = true;
                                    } else {
                                        equals5 = StringsKt__StringsJVMKt.equals(y11, StubApp.getString2(19658), true);
                                        if (equals5) {
                                            if (num2 != null) {
                                                z12 = true;
                                            }
                                            num2 = removeSurrounding == null ? null : StringsKt.toIntOrNull(removeSurrounding);
                                            if (num2 != null) {
                                                i12 = i14;
                                            }
                                        } else {
                                            equals6 = StringsKt__StringsJVMKt.equals(y11, StubApp.getString2(19659), true);
                                            if (equals6) {
                                                if (z11) {
                                                    z12 = true;
                                                }
                                                if (removeSurrounding != null) {
                                                    z12 = true;
                                                }
                                                i12 = i14;
                                                z11 = true;
                                            }
                                        }
                                        i12 = i14;
                                        z12 = true;
                                    }
                                }
                            }
                            responseHeaders = sVar;
                            z2 = true;
                        } else {
                            i12 = i13;
                            responseHeaders = sVar;
                            z12 = true;
                        }
                        i3 = 0;
                    }
                }
                i10 = i11;
            }
            ((Jc.f) this.f16037b).f3489d = new Jc.g(z2, num, z10, num2, z11, z12);
            if (z12 || num != null || (num2 != null && !new IntRange(8, 15).contains(num2.intValue()))) {
                Jc.f fVar = (Jc.f) this.f16037b;
                synchronized (fVar) {
                    fVar.f3499o.clear();
                    fVar.b(1010, StubApp.getString2("19660"));
                }
            }
            try {
                ((Jc.f) this.f16037b).d(xc.b.f23184f + StubApp.getString2("19661") + ((wc.z) this.f16038c).f22493a.g(), e10);
                Jc.f fVar2 = (Jc.f) this.f16037b;
                fVar2.f3486a.onOpen(fVar2, response);
                ((Jc.f) this.f16037b).e();
            } catch (Exception e14) {
                ((Jc.f) this.f16037b).c(e14, null);
            }
        } catch (IOException e15) {
            if (eVar != null) {
                eVar.b(-1L, true, true, null);
            }
            ((Jc.f) this.f16037b).c(e15, response);
            xc.b.c(response);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    @Override // Tb.InterfaceC0327h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(Tb.InterfaceC0328i r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.E0.p(Tb.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // com.mapbox.navigator.EventsMetadataInterface
    public com.mapbox.navigator.EventsMetadata provideEventsMetadata() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.E0.provideEventsMetadata():com.mapbox.navigator.EventsMetadata");
    }

    @Override // E0.m
    public void q(Surface surface) {
        ((MediaCodec) this.f16037b).setOutputSurface(surface);
    }

    @Override // E0.m
    public ByteBuffer r(int i3) {
        return ((MediaCodec) this.f16037b).getOutputBuffer(i3);
    }

    @Override // E0.m, v6.InterfaceC1836b
    public void release() {
        Q2.g gVar = (Q2.g) this.f16038c;
        MediaCodec mediaCodec = (MediaCodec) this.f16037b;
        try {
            int i3 = AbstractC1560u.f20190a;
            if (i3 >= 30 && i3 < 33) {
                mediaCodec.stop();
            }
            if (i3 >= 35 && gVar != null) {
                gVar.S(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (AbstractC1560u.f20190a >= 35 && gVar != null) {
                gVar.S(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    public String toString() {
        switch (this.f16036a) {
            case 28:
                if (F()) {
                    return StubApp.getString2(824);
                }
                StringBuilder sb2 = new StringBuilder(A() * 8);
                for (int A4 = A(); A4 >= 0; A4--) {
                    int z2 = z(A4);
                    if (z2 != 0) {
                        if (z2 < 0) {
                            if (A4 == A()) {
                                sb2.append(StubApp.getString2(999));
                            } else {
                                sb2.append(StubApp.getString2(6618));
                            }
                            z2 = -z2;
                        } else if (sb2.length() > 0) {
                            sb2.append(StubApp.getString2(6619));
                        }
                        if (A4 == 0 || z2 != 1) {
                            V5.a aVar = (V5.a) this.f16037b;
                            if (z2 == 0) {
                                aVar.getClass();
                                throw new IllegalArgumentException();
                            }
                            int i3 = aVar.f7754b[z2];
                            if (i3 == 0) {
                                sb2.append('1');
                            } else if (i3 == 1) {
                                sb2.append('a');
                            } else {
                                sb2.append(StubApp.getString2(19663));
                                sb2.append(i3);
                            }
                        }
                        if (A4 != 0) {
                            if (A4 == 1) {
                                sb2.append('x');
                            } else {
                                sb2.append(StubApp.getString2(6620));
                                sb2.append(A4);
                            }
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public E0 u(E0 e02) {
        V5.a aVar = (V5.a) e02.f16037b;
        V5.a aVar2 = (V5.a) this.f16037b;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException(StubApp.getString2(19664));
        }
        if (F()) {
            return e02;
        }
        if (e02.F()) {
            return this;
        }
        int[] iArr = (int[]) this.f16038c;
        int length = iArr.length;
        int[] iArr2 = (int[]) e02.f16038c;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i3 = length2; i3 < iArr.length; i3++) {
            iArr3[i3] = iArr2[i3 - length2] ^ iArr[i3];
        }
        return new E0(aVar2, iArr3);
    }

    public Bundle w(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C2.c cVar = (C2.c) this.f16037b;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!cVar.f1049b) {
            throw new IllegalStateException(StubApp.getString2(19665));
        }
        Bundle source = (Bundle) cVar.f1055h;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle r8 = source.containsKey(key) ? Oc.a.r(key, source) : null;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        source.remove(key);
        Intrinsics.checkNotNullParameter(source, "source");
        if (source.isEmpty()) {
            cVar.f1055h = null;
        }
        return r8;
    }

    public int x(int i3) {
        if (i3 == 0) {
            return z(0);
        }
        int[] iArr = (int[]) this.f16038c;
        if (i3 != 1) {
            int i10 = iArr[0];
            int length = iArr.length;
            for (int i11 = 1; i11 < length; i11++) {
                i10 = ((V5.a) this.f16037b).b(i3, i10) ^ iArr[i11];
            }
            return i10;
        }
        int i12 = 0;
        for (int i13 : iArr) {
            V5.a aVar = V5.a.f7746h;
            i12 ^= i13;
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory y(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.E0.y(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public int z(int i3) {
        return ((int[]) this.f16038c)[(r0.length - 1) - i3];
    }

    public /* synthetic */ E0(int i3, boolean z2) {
        this.f16036a = i3;
    }

    public /* synthetic */ E0(Cb.e eVar, Mb.a aVar, int i3) {
        this.f16036a = i3;
        this.f16038c = eVar;
        this.f16037b = aVar;
    }

    public E0(int i3) {
        this.f16036a = i3;
        switch (i3) {
            case 20:
                this.f16037b = new CopyOnWriteArraySet();
                this.f16038c = new CopyOnWriteArraySet();
                break;
            default:
                this.f16037b = Collections.synchronizedMap(new WeakHashMap());
                this.f16038c = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public E0(IBinder iBinder) {
        this.f16036a = 16;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, StubApp.getString2(19636))) {
            this.f16037b = new Messenger(iBinder);
            this.f16038c = null;
        } else if (Objects.equals(interfaceDescriptor, StubApp.getString2(19637))) {
            this.f16038c = new P3.g(iBinder);
            this.f16037b = null;
        } else {
            Log.w(StubApp.getString2(3016), StubApp.getString2(19638).concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public E0(C0882f c0882f, V6.b bVar) {
        this.f16036a = 27;
        this.f16038c = bVar;
        c0882f.j(new U4.b(this));
        this.f16037b = new HashSet();
    }

    public E0(P0 p02, u1 u1Var) {
        this.f16036a = 0;
        this.f16037b = u1Var;
        Objects.requireNonNull(p02);
        this.f16038c = p02;
    }

    public E0(E0 observersManager) {
        this.f16036a = 21;
        Intrinsics.checkNotNullParameter(observersManager, "observersManager");
        this.f16037b = observersManager;
        this.f16038c = new LinkedHashSet();
    }

    public E0(Q2.g speechLoader, Z9.C speechFileProvider) {
        this.f16036a = 7;
        Intrinsics.checkNotNullParameter(speechLoader, "speechLoader");
        Intrinsics.checkNotNullParameter(speechFileProvider, "speechFileProvider");
        this.f16037b = speechLoader;
        this.f16038c = speechFileProvider;
    }

    public E0(Context context, S8.a lifecycleMonitor) {
        this.f16036a = 23;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleMonitor, "lifecycleMonitor");
        this.f16037b = context;
        this.f16038c = lifecycleMonitor;
    }

    public E0(C2.c impl) {
        this.f16036a = 15;
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f16037b = impl;
    }

    public E0(R0.n nVar, R0.r rVar) {
        this.f16036a = 17;
        this.f16037b = nVar;
        this.f16038c = rVar;
        new C1438m(new C1437l());
    }

    public E0(V5.a aVar, int[] iArr) {
        this.f16036a = 28;
        if (iArr.length != 0) {
            this.f16037b = aVar;
            int length = iArr.length;
            int i3 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i3 < length && iArr[i3] == 0) {
                    i3++;
                }
                if (i3 == length) {
                    this.f16038c = new int[]{0};
                    return;
                }
                int i10 = length - i3;
                int[] iArr2 = new int[i10];
                this.f16038c = iArr2;
                System.arraycopy(iArr, i3, iArr2, 0, i10);
                return;
            }
            this.f16038c = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public E0(InterfaceC0444t lifecycleOwner, H8.d dVar, Function0 function0) {
        this.f16036a = 11;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f16037b = dVar;
        this.f16038c = function0;
        H8.h hVar = new H8.h(this);
        Lazy lazy = H8.b.f2941a;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Lazy lazy2 = H8.b.f2941a;
        D9.l.d(StubApp.getString2(19639), StubApp.getString2(2972));
        H8.c a3 = H8.b.a();
        a3.getClass();
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        C8.c cVar = (C8.c) a3.f2944b.getValue();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        D9.l.f(StubApp.getString2(19640), StubApp.getString2(1196));
        lifecycleOwner.i().a(cVar.f1144h);
        lifecycleOwner.i().a(hVar);
    }

    public E0(Context context, int i3) {
        this.f16036a = i3;
        switch (i3) {
            case 22:
                S3.D.h(context);
                Resources resources = context.getResources();
                this.f16037b = resources;
                this.f16038c = resources.getResourcePackageName(2131755062);
                break;
            default:
                this.f16038c = null;
                this.f16037b = context;
                break;
        }
    }

    public E0(MediaCodec mediaCodec, Q2.g gVar) {
        boolean addMediaCodec;
        this.f16036a = 6;
        this.f16037b = mediaCodec;
        this.f16038c = gVar;
        if (AbstractC1560u.f20190a < 35 || gVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) gVar.f5713d;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        AbstractC1550k.g(((HashSet) gVar.f5711b).add(mediaCodec));
    }

    public E0(Function function, LruCache cache) {
        this.f16036a = 1;
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f16037b = function;
        this.f16038c = cache;
    }

    public E0(Ab.i iVar) {
        this.f16036a = 2;
        this.f16038c = iVar;
    }
}
