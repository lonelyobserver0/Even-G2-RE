package a5;

import E.l;
import J1.v;
import J1.x;
import O0.u;
import Qb.C0203k;
import S3.C0279m;
import S3.C0282p;
import S3.C0283q;
import T0.B;
import T0.H;
import T0.q;
import Xa.AbstractActivityC0364d;
import Y.m;
import Y6.r;
import Z6.d;
import Z9.A;
import Z9.C0366a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.lifecycle.AbstractServiceC0447w;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0438m;
import androidx.work.impl.WorkDatabase_Impl;
import c2.C0558j;
import com.google.android.gms.internal.measurement.C0591b;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.internal.measurement.L1;
import com.google.android.material.datepicker.i;
import com.google.gson.Gson;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpResponseData;
import com.mapbox.common.UploadOptions;
import com.mapbox.common.UploadStatus;
import com.mapbox.common.UploadStatusCallback;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.navigation.copilot.work.HistoryUploadWorker;
import com.stub.StubApp;
import da.C0815e;
import da.InterfaceC0813c;
import e6.h;
import f2.j;
import f4.C0879c;
import i.E;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import k9.C1118b;
import k9.g;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l4.C1200n0;
import l4.C1221y;
import l4.C1223z;
import l4.G1;
import l4.R0;
import l4.U;
import l8.AbstractC1246c;
import n.C1318T;
import n.C1365u;
import oa.C1471d;
import oa.n;
import ob.C1474a;
import ob.e;
import ob.f;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import p0.AbstractC1482f;
import q.AbstractC1500a;
import q.AbstractC1501b;
import q.AbstractC1502c;
import r2.C1565c;
import r4.AbstractC1567a;
import r5.C1568a;
import ra.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements b, a, InterfaceC0813c, R0, U, UploadStatusCallback, e, q {

    /* renamed from: e, reason: collision with root package name */
    public static c f9279e;

    /* renamed from: f, reason: collision with root package name */
    public static c f9280f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9281a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9282b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9283c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9284d;

    public /* synthetic */ c(int i3, boolean z2) {
        this.f9281a = i3;
    }

    public static void B(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static c E(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public static String h(String str, HashMap hashMap) {
        String string2;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        String string22 = StubApp.getString2(2359);
        sb2.append(string22);
        Object value = entry.getValue();
        String string23 = StubApp.getString2(640);
        sb2.append(value != null ? URLEncoder.encode((String) entry.getValue(), string23) : "");
        while (true) {
            boolean hasNext = it.hasNext();
            string2 = StubApp.getString2(4965);
            if (!hasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append(string2);
            sb2.append((String) entry2.getKey());
            sb2.append(string22);
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), string23) : "");
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        String string24 = StubApp.getString2(DilithiumEngine.DilithiumPolyT1PackedBytes);
        if (!str.contains(string24)) {
            return AbstractC1482f.h(str, string24, sb3);
        }
        if (!str.endsWith(string2)) {
            sb3 = string2.concat(sb3);
        }
        return AbstractC1482f.g(str, sb3);
    }

    public static Bundle n(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static int o(int i3, int i10, T5.a aVar) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (aVar.a(i3 + i12)) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public boolean A(int i3) {
        int i10;
        int i11 = i3 + 1;
        T5.a aVar = (T5.a) this.f9282b;
        if (i11 > aVar.f7182b) {
            return false;
        }
        for (int i12 = 0; i12 < 5 && (i10 = i12 + i3) < aVar.f7182b; i12++) {
            if (i12 == 2) {
                if (!aVar.a(i3 + 2)) {
                    return false;
                }
            } else if (aVar.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public void C(int i3, long j) {
        this.f9283c = new k();
        ((HashMap) this.f9282b).put(Long.valueOf(j), (k) this.f9283c);
        ((k) this.f9283c).getClass();
    }

    @Override // T0.q
    public void D(B b2) {
        ((q) this.f9282b).D(b2);
    }

    public void F(Activity activity, C0558j newLayoutInfo) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayout");
        ReentrantLock reentrantLock = (ReentrantLock) this.f9283c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f9284d;
        try {
            if (Intrinsics.areEqual(newLayoutInfo, (C0558j) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            C0366a c0366a = (C0366a) this.f9282b;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayout");
            Iterator it = ((f2.k) c0366a.f9105b).f13733b.iterator();
            while (it.hasNext()) {
                j this$0 = (j) it.next();
                if (Intrinsics.areEqual(this$0.f13727a, activity)) {
                    Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
                    this$0.f13729c = newLayoutInfo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
                    this$0.f13728b.accept(newLayoutInfo);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Boolean G(String str, Boolean bool, f fVar, C1474a c1474a) {
        ActivityOptions activityOptions;
        if (((AbstractActivityC0364d) this.f9284d) == null) {
            throw new ob.b();
        }
        Bundle n10 = n(fVar.f18650c);
        boolean booleanValue = bool.booleanValue();
        String string2 = StubApp.getString2(8448);
        if (booleanValue) {
            Iterator it = fVar.f18650c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    char c10 = 65535;
                    switch (lowerCase.hashCode()) {
                        case -1423461112:
                            if (!lowerCase.equals(StubApp.getString2(8452))) {
                                break;
                            } else {
                                c10 = 0;
                                break;
                            }
                        case -1229727188:
                            if (!lowerCase.equals(StubApp.getString2(8451))) {
                                break;
                            } else {
                                c10 = 1;
                                break;
                            }
                        case 785670158:
                            if (!lowerCase.equals(StubApp.getString2(8450))) {
                                break;
                            } else {
                                c10 = 2;
                                break;
                            }
                        case 802785917:
                            if (!lowerCase.equals(StubApp.getString2(8449))) {
                                break;
                            } else {
                                c10 = 3;
                                break;
                            }
                    }
                    switch (c10) {
                    }
                } else {
                    Uri parse = Uri.parse(str);
                    AbstractActivityC0364d abstractActivityC0364d = (AbstractActivityC0364d) this.f9284d;
                    Intent intent = new Intent(StubApp.getString2(5111));
                    intent.putExtra(StubApp.getString2(8453), c1474a.f18643a.booleanValue() ? 1 : 0);
                    String string22 = StubApp.getString2(8454);
                    if (!intent.hasExtra(string22)) {
                        Bundle bundle = new Bundle();
                        bundle.putBinder(string22, null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtra(StubApp.getString2(8455), true);
                    intent.putExtras(new Bundle());
                    intent.putExtra(StubApp.getString2(8456), 0);
                    int i3 = Build.VERSION.SDK_INT;
                    String a3 = AbstractC1501b.a();
                    if (!TextUtils.isEmpty(a3)) {
                        Bundle bundleExtra = intent.hasExtra(string2) ? intent.getBundleExtra(string2) : new Bundle();
                        String string23 = StubApp.getString2(8457);
                        if (!bundleExtra.containsKey(string23)) {
                            bundleExtra.putString(string23, a3);
                            intent.putExtra(string2, bundleExtra);
                        }
                    }
                    if (i3 >= 34) {
                        activityOptions = AbstractC1500a.a();
                        AbstractC1502c.a(activityOptions, false);
                    } else {
                        activityOptions = null;
                    }
                    Bundle bundle2 = activityOptions != null ? activityOptions.toBundle() : null;
                    intent.putExtra(string2, n10);
                    try {
                        intent.setData(parse);
                        abstractActivityC0364d.startActivity(intent, bundle2);
                        return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        AbstractActivityC0364d abstractActivityC0364d2 = (AbstractActivityC0364d) this.f9284d;
        boolean booleanValue2 = fVar.f18648a.booleanValue();
        boolean booleanValue3 = fVar.f18649b.booleanValue();
        int i10 = WebViewActivity.f15094e;
        try {
            ((AbstractActivityC0364d) this.f9284d).startActivity(new Intent(abstractActivityC0364d2, (Class<?>) WebViewActivity.class).putExtra(StubApp.getString2(1904), str).putExtra(StubApp.getString2(8458), booleanValue2).putExtra(StubApp.getString2(8459), booleanValue3).putExtra(string2, n10));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused2) {
            return Boolean.FALSE;
        }
    }

    public void H(EnumC0438m enumC0438m) {
        Nb.f fVar = (Nb.f) this.f9284d;
        if (fVar != null) {
            fVar.run();
        }
        Nb.f fVar2 = new Nb.f((C0446v) this.f9282b, enumC0438m);
        this.f9284d = fVar2;
        Handler handler = (Handler) this.f9283c;
        Intrinsics.checkNotNull(fVar2);
        handler.postAtFrontOfQueue(fVar2);
    }

    public void I() {
        ((TypedArray) this.f9283c).recycle();
    }

    public void J(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9282b;
        workDatabase_Impl.b();
        Q2.e eVar = (Q2.e) this.f9284d;
        P1.k a3 = eVar.a();
        if (str == null) {
            a3.x(1);
        } else {
            a3.g(1, str);
        }
        workDatabase_Impl.c();
        try {
            a3.d();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            eVar.d(a3);
        }
    }

    public void K(long j) {
        k kVar = (k) this.f9284d;
        String string2 = StubApp.getString2(948);
        if (kVar != null) {
            Log.w(string2, StubApp.getString2(8460));
            return;
        }
        k kVar2 = new k();
        this.f9284d = kVar2;
        kVar2.f20547a = new C1471d();
        HashMap hashMap = (HashMap) this.f9282b;
        k kVar3 = (k) hashMap.get(Long.valueOf(j));
        ArrayList arrayList = new ArrayList();
        if (kVar3 == null) {
            Log.w(string2, StubApp.getString2(8461) + j);
            arrayList.addAll(hashMap.keySet());
            Collections.sort(arrayList);
        } else {
            ((k) this.f9284d).getClass();
            arrayList.add(Long.valueOf(j));
            while (true) {
                C1471d c1471d = kVar3.f20547a;
                if (c1471d == null) {
                    break;
                }
                long P10 = c1471d.P(oa.j.f18468K2);
                if (P10 == -1) {
                    break;
                }
                kVar3 = (k) hashMap.get(Long.valueOf(P10));
                if (kVar3 == null) {
                    Log.w(string2, StubApp.getString2(8462) + P10);
                    break;
                } else {
                    arrayList.add(Long.valueOf(P10));
                    if (arrayList.size() >= hashMap.size()) {
                        break;
                    }
                }
            }
            Collections.reverse(arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar4 = (k) hashMap.get((Long) it.next());
            C1471d c1471d2 = kVar4.f20547a;
            if (c1471d2 != null) {
                ((k) this.f9284d).f20547a.a(c1471d2);
            }
            ((k) this.f9284d).f20548b.putAll(kVar4.f20548b);
        }
    }

    public void L(n nVar, long j) {
        k kVar = (k) this.f9283c;
        if (kVar != null) {
            if (kVar.f20548b.containsKey(nVar)) {
                return;
            }
            ((k) this.f9283c).f20548b.put(nVar, Long.valueOf(j));
        } else {
            Log.w(StubApp.getString2(948), StubApp.getString2(8463) + nVar.f18633a + StubApp.getString2(8464));
        }
    }

    public Boolean M() {
        String str;
        List list = Collections.EMPTY_LIST;
        PackageManager packageManager = ((Context) this.f9282b).getPackageManager();
        List arrayList = list == null ? new ArrayList() : list;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent(StubApp.getString2(5111), Uri.parse(StubApp.getString2(8465))), 0);
        if (resolveActivity != null) {
            String str2 = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent(StubApp.getString2(8466));
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w(StubApp.getString2(8467), StubApp.getString2(8468));
                }
                str = null;
            }
        }
        return Boolean.valueOf(str != null);
    }

    public AnimatorSet N(CameraOptions cameraOptions, g transitionOptions) {
        long j;
        Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
        Intrinsics.checkNotNullParameter(transitionOptions, "transitionOptions");
        Y6.a aVar = (Y6.a) this.f9283c;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        r rVar = ((Y6.j) aVar).f8785z;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsFactory");
            rVar = null;
        }
        MapboxMap mapboxMap = (MapboxMap) this.f9282b;
        CameraState cameraState = mapboxMap.getCameraState();
        Point currentPoint = cameraState.getCenter();
        Intrinsics.checkNotNullExpressionValue(currentPoint, "currentMapCameraState.center");
        double zoom = cameraState.getZoom();
        Point targetPoint = cameraOptions.getCenter();
        Double zoom2 = cameraOptions.getZoom();
        d[] animators = rVar.a(cameraOptions, StubApp.getString2(8469));
        if (targetPoint == null || zoom2 == null) {
            j = 0;
        } else {
            double doubleValue = zoom2.doubleValue();
            Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
            Intrinsics.checkNotNullParameter(currentPoint, "currentPoint");
            Intrinsics.checkNotNullParameter(targetPoint, "targetPoint");
            j = (long) ((Math.log((((Math.abs(zoom - doubleValue) * 80) + Math.hypot(mapboxMap.project(currentPoint, doubleValue).getX() - mapboxMap.project(targetPoint, doubleValue).getX(), mapboxMap.project(targetPoint, doubleValue).getY() - mapboxMap.project(targetPoint, doubleValue).getY())) / 1000.0d) + 0.24d) + 2.1d) * 1000.0d);
        }
        long min = Math.min(j, transitionOptions.f15509a);
        Intrinsics.checkNotNullParameter(animators, "animators");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether((Animator[]) Arrays.copyOf(animators, animators.length));
        AnimatorSet duration = animatorSet.setDuration(min);
        Intrinsics.checkNotNullExpressionValue(duration, "createAnimatorSetWith(an…   .setDuration(duration)");
        return duration;
    }

    public synchronized void O(int i3, int i10, long j, long j3) {
        ((C1200n0) this.f9282b).f16545l.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f9284d;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((U3.c) this.f9283c).e(new C0282p(0, Arrays.asList(new C0279m(36301, i3, 0, j, j3, null, null, 0, i10)))).addOnFailureListener(new Cc.a(this, elapsedRealtime, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    @Override // l4.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r9, java.io.IOException r10, byte[] r11) {
        /*
            r8 = this;
            java.lang.Object r11 = r8.f9282b
            l4.P0 r11 = (l4.P0) r11
            r11.k()
            java.lang.Object r0 = r8.f9284d
            l4.x1 r0 = (l4.x1) r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 == r1) goto L18
            r1 = 204(0xcc, float:2.86E-43)
            if (r9 == r1) goto L18
            r1 = 304(0x130, float:4.26E-43)
            if (r9 != r1) goto L38
            r9 = r1
        L18:
            if (r10 != 0) goto L38
            java.lang.Object r9 = r11.f4728a
            l4.n0 r9 = (l4.C1200n0) r9
            l4.T r9 = r9.f16541f
            l4.C1200n0.l(r9)
            Ac.b r9 = r9.f16249p
            long r1 = r0.f16659a
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            r1 = 8470(0x2116, float:1.1869E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r9.c(r10, r1)
            l4.V0 r9 = l4.V0.f16259c
            goto L7e
        L38:
            java.lang.Object r1 = r11.f4728a
            l4.n0 r1 = (l4.C1200n0) r1
            l4.T r1 = r1.f16541f
            l4.C1200n0.l(r1)
            Ac.b r1 = r1.j
            long r2 = r0.f16659a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r4 = 8471(0x2117, float:1.187E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r1.e(r4, r2, r3, r10)
            l4.C r10 = l4.AbstractC1148D.f16020u
            r1 = 0
            java.lang.Object r10 = r10.a(r1)
            java.lang.String r10 = (java.lang.String) r10
            r1 = 321(0x141, float:4.5E-43)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String[] r10 = r10.split(r1)
            java.util.List r10 = java.util.Arrays.asList(r10)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L7c
            l4.V0 r9 = l4.V0.f16261e
            goto L7e
        L7c:
            l4.V0 r9 = l4.V0.f16260d
        L7e:
            java.lang.Object r10 = r8.f9283c
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10
            java.lang.Object r1 = r11.f4728a
            l4.n0 r1 = (l4.C1200n0) r1
            l4.j1 r1 = r1.o()
            l4.d r2 = new l4.d
            long r3 = r0.f16659a
            int r5 = r9.f16263a
            long r6 = r0.f16664f
            r2.<init>(r3, r5, r6)
            r1.k()
            r1.l()
            r0 = 1
            l4.M1 r0 = r1.A(r0)
            K.m r5 = new K.m
            r6 = 15
            r5.<init>(r1, r0, r2, r6)
            r1.y(r5)
            java.lang.Object r11 = r11.f4728a
            l4.n0 r11 = (l4.C1200n0) r11
            l4.T r11 = r11.f16541f
            l4.C1200n0.l(r11)
            Ac.b r11 = r11.f16249p
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = 8472(0x2118, float:1.1872E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r11.d(r1, r0, r9)
            monitor-enter(r10)
            r10.set(r9)     // Catch: java.lang.Throwable -> Lcc
            r10.notifyAll()     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lcc
            return
        Lcc:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lcc
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.c.a(int, java.io.IOException, byte[]):void");
    }

    @Override // da.InterfaceC0813c
    public ArrayList c(int i3) {
        Integer num = (Integer) ((da.n) this.f9283c).j.get(Integer.valueOf(i3));
        if (num == null) {
            Log.w(StubApp.getString2(948), StubApp.getString2(8473) + i3);
        } else {
            i3 = num.intValue();
        }
        return ((C0815e) this.f9282b).c(i3);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f9281a) {
            case 2:
                c cVar = new c(((C0591b) this.f9282b).clone());
                Iterator it = ((ArrayList) this.f9284d).iterator();
                while (it.hasNext()) {
                    ((ArrayList) cVar.f9284d).add(((C0591b) it.next()).clone());
                }
                return cVar;
            default:
                return super.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
    @Override // l4.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.String r8, int r9, java.io.IOException r10, byte[] r11, java.util.Map r12) {
        /*
            r7 = this;
            int r8 = r7.f9281a
            switch(r8) {
                case 16: goto Lb5;
                default: goto L5;
            }
        L5:
            java.lang.Object r8 = r7.f9284d
            l4.F1 r8 = (l4.F1) r8
            l4.k0 r12 = r8.b()
            r12.k()
            r8.k0()
            r12 = 0
            if (r11 != 0) goto L1d
            byte[] r11 = new byte[r12]     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            goto Laf
        L1d:
            java.lang.Object r0 = r7.f9283c
            l4.G1 r0 = (l4.G1) r0
            r1 = 200(0xc8, float:2.8E-43)
            long r2 = r0.f16084a
            java.lang.Object r0 = r7.f9282b
            java.lang.String r0 = (java.lang.String) r0
            if (r9 == r1) goto L30
            r1 = 204(0xcc, float:2.86E-43)
            if (r9 != r1) goto L6f
            r9 = r1
        L30:
            if (r10 != 0) goto L6f
            l4.n r10 = r8.f16061c     // Catch: java.lang.Throwable -> L19
            l4.F1.S(r10)     // Catch: java.lang.Throwable -> L19
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            r10.r(r11)     // Catch: java.lang.Throwable -> L19
            l4.T r10 = r8.a()     // Catch: java.lang.Throwable -> L19
            Ac.b r10 = r10.f16249p     // Catch: java.lang.Throwable -> L19
            java.lang.String r11 = "8474"
            java.lang.String r11 = com.stub.StubApp.getString2(r11)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L19
            r10.d(r11, r0, r9)     // Catch: java.lang.Throwable -> L19
            l4.W r9 = r8.f16060b     // Catch: java.lang.Throwable -> L19
            l4.F1.S(r9)     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.E()     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L6b
            l4.n r9 = r8.f16061c     // Catch: java.lang.Throwable -> L19
            l4.F1.S(r9)     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.q(r0)     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L6b
            r8.t(r0)     // Catch: java.lang.Throwable -> L19
            goto La9
        L6b:
            r8.L()     // Catch: java.lang.Throwable -> L19
            goto La9
        L6f:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L19
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L19
            r1.<init>(r11, r4)     // Catch: java.lang.Throwable -> L19
            int r11 = r1.length()     // Catch: java.lang.Throwable -> L19
            r4 = 32
            int r11 = java.lang.Math.min(r4, r11)     // Catch: java.lang.Throwable -> L19
            java.lang.String r11 = r1.substring(r12, r11)     // Catch: java.lang.Throwable -> L19
            l4.T r1 = r8.a()     // Catch: java.lang.Throwable -> L19
            Ac.b r1 = r1.f16246l     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = "8475"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L19
            if (r10 != 0) goto L97
            r10 = r11
        L97:
            r1.e(r4, r0, r9, r10)     // Catch: java.lang.Throwable -> L19
            l4.n r9 = r8.f16061c     // Catch: java.lang.Throwable -> L19
            l4.F1.S(r9)     // Catch: java.lang.Throwable -> L19
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            r9.w(r10)     // Catch: java.lang.Throwable -> L19
            r8.L()     // Catch: java.lang.Throwable -> L19
        La9:
            r8.f16078x = r12
            r8.M()
            return
        Laf:
            r8.f16078x = r12
            r8.M()
            throw r9
        Lb5:
            java.lang.Object r8 = r7.f9283c
            r6 = r8
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r8 = r7.f9284d
            r0 = r8
            l4.F1 r0 = (l4.F1) r0
            r1 = 1
            java.lang.Object r8 = r7.f9282b
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            r2 = r9
            r3 = r10
            r4 = r11
            r0.x(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.c.d(java.lang.String, int, java.io.IOException, byte[], java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    @Override // da.InterfaceC0813c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(int r18) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.c.e(int):int");
    }

    public void f(x layer) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (((String) this.f9283c) != null) {
            layer.b((MapboxStyleManager) this.f9282b, new LayerPosition((String) this.f9283c, null, null));
        } else if (((String) this.f9284d) != null) {
            layer.b((MapboxStyleManager) this.f9282b, new LayerPosition(null, (String) this.f9284d, null));
        } else {
            layer.b((MapboxStyleManager) this.f9282b, null);
        }
    }

    public Boolean g(String str) {
        Intent intent = new Intent(StubApp.getString2(5111));
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(((Context) ((c5.B) this.f9283c).f10833b).getPackageManager());
        return (resolveActivity == null ? null : resolveActivity.toShortString()) == null ? Boolean.FALSE : Boolean.valueOf(!StubApp.getString2(8483).equals(r3));
    }

    public String i(StringBuilder sb2, int i3) {
        String str = null;
        while (true) {
            h j = j(i3, str);
            String a3 = e6.k.a(j.f13640c);
            if (a3 != null) {
                sb2.append(a3);
            }
            String valueOf = j.f13642e ? String.valueOf(j.f13641d) : null;
            int i10 = j.f3376b;
            if (i3 == i10) {
                return sb2.toString();
            }
            i3 = i10;
            str = valueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0212, code lost:
    
        if (r5 <= r6.f7182b) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0215, code lost:
    
        if (r3 >= r5) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x021b, code lost:
    
        if (r6.a(r3) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0237, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023a, code lost:
    
        r1.f9069b += 3;
        r1.f9070c = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0245, code lost:
    
        r3 = new aa.C0398e(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0223, code lost:
    
        if (A(r1.f9069b) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0225, code lost:
    
        r3 = r1.f9069b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0229, code lost:
    
        if ((r3 + 5) >= r12) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x022b, code lost:
    
        r1.f9069b = r3 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0234, code lost:
    
        r1.f9070c = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0231, code lost:
    
        r1.f9069b = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e6.h j(int r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.c.j(int, java.lang.String):e6.h");
    }

    public void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        HashMap hashMap = (HashMap) this.f9283c;
        HashMap hashMap2 = (HashMap) this.f9282b;
        s5.f fVar = new s5.f(byteArrayOutputStream, hashMap2, hashMap, (C1568a) this.f9284d);
        p5.d dVar = (p5.d) hashMap2.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new p5.b(StubApp.getString2(8485) + obj.getClass());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public I9.a l() {
        /*
            r8 = this;
            r0 = 280(0x118, float:3.92E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 8486(0x2126, float:1.1891E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            d.y r2 = new d.y
            r3 = 3
            r2.<init>(r3)
            d5.c r3 = d5.C0803c.f13418c
            d5.C0804d.a(r2, r3)
            r2 = 0
            java.lang.Object r3 = r8.f9282b     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object r4 = r8.f9283c     // Catch: java.lang.Throwable -> Ld7
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = h(r3, r4)     // Catch: java.lang.Throwable -> Ld2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld2
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Ld2
            r4.append(r3)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Ld2
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L40
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L3d
            goto L40
        L3d:
            r0 = move-exception
            goto Ld5
        L40:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Ld2
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Ld2
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Ld2
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Ld2
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L84
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "595"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Throwable -> L84
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r1 = r8.f9284d     // Catch: java.lang.Throwable -> L84
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L84
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L84
        L68:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L86
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L84
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L84
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L84
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L84
            goto L68
        L84:
            r1 = move-exception
            goto Ld9
        L86:
            r0.connect()     // Catch: java.lang.Throwable -> L84
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L84
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto Lc0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lbd
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r5 = "640"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Throwable -> Lbd
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lbd
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lbd
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r5.<init>()     // Catch: java.lang.Throwable -> Lbd
        Lac:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> Lbd
            r7 = -1
            if (r6 == r7) goto Lb8
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> Lbd
            goto Lac
        Lb8:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> Lbd
            goto Lc0
        Lbd:
            r1 = move-exception
            r2 = r3
            goto Ld9
        Lc0:
            if (r3 == 0) goto Lc5
            r3.close()
        Lc5:
            r0.disconnect()
            I9.a r0 = new I9.a
            r0.<init>()
            r0.f3236a = r1
            r0.f3237b = r2
            return r0
        Ld2:
            r1 = move-exception
        Ld3:
            r0 = r2
            goto Ld9
        Ld5:
            r1 = r0
            goto Ld3
        Ld7:
            r0 = move-exception
            goto Ld5
        Ld9:
            if (r2 == 0) goto Lde
            r2.close()
        Lde:
            if (r0 == 0) goto Le3
            r0.disconnect()
        Le3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.c.l():I9.a");
    }

    @Override // a5.a
    public void m(Bundle bundle) {
        String string2 = StubApp.getString2(8487);
        synchronized (this.f9283c) {
            try {
                Z4.c cVar = Z4.c.f8980a;
                cVar.f(string2 + bundle);
                this.f9284d = new CountDownLatch(1);
                ((A0.c) this.f9282b).m(bundle);
                cVar.f(StubApp.getString2("8488"));
                try {
                    if (((CountDownLatch) this.f9284d).await(500, TimeUnit.MILLISECONDS)) {
                        cVar.f(StubApp.getString2("8489"));
                    } else {
                        cVar.g(StubApp.getString2("8490"), null);
                    }
                } catch (InterruptedException unused) {
                    Log.e(StubApp.getString2("280"), StubApp.getString2("8491"), null);
                }
                this.f9284d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ColorStateList p(int i3) {
        int resourceId;
        ColorStateList j;
        TypedArray typedArray = (TypedArray) this.f9283c;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (j = D1.j((Context) this.f9282b, resourceId)) == null) ? typedArray.getColorStateList(i3) : j;
    }

    @Override // T0.q
    public void q() {
        ((q) this.f9282b).q();
    }

    public Drawable r(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f9283c;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : D1.m((Context) this.f9282b, resourceId);
    }

    @Override // com.mapbox.common.UploadStatusCallback
    public void run(UploadStatus uploadStatus) {
        Expected<HttpRequestError, HttpResponseData> onError;
        HttpResponseData value;
        Intrinsics.checkNotNullParameter(uploadStatus, "uploadStatus");
        int i3 = AbstractC1246c.f16829a[uploadStatus.getState().ordinal()];
        HistoryUploadWorker historyUploadWorker = (HistoryUploadWorker) this.f9282b;
        if (i3 == 1) {
            historyUploadWorker.k(StubApp.getString2(8498));
            return;
        }
        if (i3 == 2) {
            historyUploadWorker.k(StubApp.getString2(8497) + uploadStatus.getTotalSentBytes() + '/' + uploadStatus.getTotalBytes() + StubApp.getString2(693));
            return;
        }
        C0203k c0203k = (C0203k) this.f9283c;
        UploadOptions uploadOptions = (UploadOptions) this.f9284d;
        Integer num = null;
        num = null;
        if (i3 == 3) {
            Expected<HttpRequestError, HttpResponseData> httpResult = uploadStatus.getHttpResult();
            if (httpResult != null && (value = httpResult.getValue()) != null) {
                num = Integer.valueOf(value.getCode());
            }
            historyUploadWorker.k(StubApp.getString2(8496) + num);
            Expected<HttpRequestError, HttpResponseData> httpResult2 = uploadStatus.getHttpResult();
            if (httpResult2 != null && (onError = httpResult2.onError(new C0879c(uploadOptions))) != null) {
                onError.onValue(new V6.b(25, historyUploadWorker, uploadOptions));
            }
            Result.Companion companion = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(Boolean.valueOf(num != null && new IntRange(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 299).contains(num.intValue()))));
            return;
        }
        if (i3 != 4) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(8492));
        sb2.append(uploadStatus.getError());
        sb2.append(StubApp.getString2(8493));
        Expected<HttpRequestError, HttpResponseData> httpResult3 = uploadStatus.getHttpResult();
        sb2.append(httpResult3 != null ? httpResult3.getValue() : null);
        HistoryUploadWorker.j(historyUploadWorker, sb2.toString());
        Gson gson = j8.d.f15378b;
        StringBuilder sb3 = new StringBuilder(StubApp.getString2(6616));
        sb3.append(uploadOptions.getFilePath());
        sb3.append(StubApp.getString2(8494));
        sb3.append(uploadStatus.getError());
        sb3.append(StubApp.getString2(8495));
        Expected<HttpRequestError, HttpResponseData> httpResult4 = uploadStatus.getHttpResult();
        sb3.append(httpResult4 != null ? httpResult4.getValue() : null);
        c7.f.f(sb3.toString());
        Result.Companion companion2 = Result.INSTANCE;
        c0203k.resumeWith(Result.m40constructorimpl(Boolean.FALSE));
    }

    public Drawable s(int i3) {
        int resourceId;
        Drawable d8;
        if (!((TypedArray) this.f9283c).hasValue(i3) || (resourceId = ((TypedArray) this.f9283c).getResourceId(i3, 0)) == 0) {
            return null;
        }
        C1365u a3 = C1365u.a();
        Context context = (Context) this.f9282b;
        synchronized (a3) {
            d8 = a3.f17620a.d(context, resourceId, true);
        }
        return d8;
    }

    public Typeface t(int i3, int i10, C1318T c1318t) {
        int resourceId = ((TypedArray) this.f9283c).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f9284d) == null) {
            this.f9284d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f9284d;
        ThreadLocal threadLocal = l.f1716a;
        Context context = (Context) this.f9282b;
        if (context.isRestricted()) {
            return null;
        }
        return l.a(context, resourceId, typedValue, i10, c1318t, true);
    }

    public C1565c u(String str) {
        v e10 = v.e(1, StubApp.getString2(8499));
        if (str == null) {
            e10.x(1);
        } else {
            e10.g(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9282b;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            return u2.moveToFirst() ? new C1565c(u2.getString(D1.k(StubApp.getString2("4816"), u2)), u2.getInt(D1.k(StubApp.getString2("4832"), u2))) : null;
        } finally {
            u2.close();
            e10.h();
        }
    }

    public File v(Context context) {
        ((C1223z) this.f9283c).getClass();
        return new File(context.getDir(StubApp.getString2(8500), 0), System.mapLibraryName(StubApp.getString2(3040)));
    }

    @Override // T0.q
    public H w(int i3, int i10) {
        q qVar = (q) this.f9282b;
        if (i10 != 3) {
            return qVar.w(i3, i10);
        }
        SparseArray sparseArray = (SparseArray) this.f9284d;
        q1.n nVar = (q1.n) sparseArray.get(i3);
        if (nVar != null) {
            return nVar;
        }
        q1.n nVar2 = new q1.n(qVar.w(i3, i10), (q1.j) this.f9283c);
        sparseArray.put(i3, nVar2);
        return nVar2;
    }

    public void x(String str, String str2) {
        ((HashMap) this.f9284d).put(str, str2);
    }

    @Override // a5.b
    public void y(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f9284d;
        if (countDownLatch != null && StubApp.getString2(57).equals(str)) {
            countDownLatch.countDown();
        }
    }

    public void z(C1565c c1565c) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9282b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((Q2.c) this.f9283c).g(c1565c);
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i3) {
        this.f9281a = i3;
        this.f9282b = obj;
        this.f9283c = obj2;
        this.f9284d = obj3;
    }

    public c(int i3) {
        this.f9281a = i3;
        switch (i3) {
            case 24:
                C1223z c1223z = new C1223z(21);
                C1221y c1221y = new C1221y(21);
                this.f9282b = new HashSet();
                this.f9283c = c1223z;
                this.f9284d = c1221y;
                break;
            case 28:
                this.f9282b = new HashMap();
                this.f9283c = null;
                this.f9284d = null;
                break;
            default:
                this.f9282b = new C0591b("", 0L, null);
                this.f9283c = new C0591b("", 0L, null);
                this.f9284d = new ArrayList();
                break;
        }
    }

    public c(Context context, C1200n0 c1200n0) {
        this.f9281a = 14;
        this.f9284d = new AtomicLong(-1L);
        this.f9283c = new U3.c(context, null, U3.c.f7452i, new C0283q(StubApp.getString2(8447)), Q3.g.f5719b);
        this.f9282b = c1200n0;
    }

    public c(l4.F1 f12, String str, ArrayList arrayList) {
        this.f9281a = 16;
        this.f9282b = str;
        this.f9283c = arrayList;
        Objects.requireNonNull(f12);
        this.f9284d = f12;
    }

    public c(l4.F1 f12, String str, G1 g12) {
        this.f9281a = 17;
        this.f9282b = str;
        this.f9283c = g12;
        Objects.requireNonNull(f12);
        this.f9284d = f12;
    }

    public c(C0591b c0591b) {
        this.f9281a = 2;
        this.f9282b = c0591b;
        this.f9283c = c0591b.clone();
        this.f9284d = new ArrayList();
    }

    public c(m stateTransition, Y6.a cameraAnimationsPlugin, MapboxMap mapboxMap) {
        this.f9281a = 10;
        Intrinsics.checkNotNullParameter(stateTransition, "stateTransition");
        Intrinsics.checkNotNullParameter(cameraAnimationsPlugin, "cameraAnimationsPlugin");
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        this.f9282b = stateTransition;
        this.f9283c = cameraAnimationsPlugin;
        this.f9284d = mapboxMap;
    }

    public c(WorkDatabase_Impl database, int i3) {
        this.f9281a = i3;
        switch (i3) {
            case 27:
                this.f9282b = database;
                Intrinsics.checkNotNullParameter(database, "database");
                new Q2.c(database, 5);
                this.f9283c = new Q2.e(database, 2);
                this.f9284d = new Q2.e(database, 3);
                break;
            default:
                this.f9282b = database;
                Intrinsics.checkNotNullParameter(database, "database");
                this.f9283c = new Q2.c(database, 3);
                this.f9284d = new Q2.e(database, 1);
                break;
        }
    }

    public c(AbstractServiceC0447w provider) {
        this.f9281a = 1;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f9282b = new C0446v(provider);
        this.f9283c = new Handler();
    }

    public c(MapboxMap mapboxMap, Y6.a cameraPlugin) {
        this.f9281a = 11;
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(cameraPlugin, "cameraPlugin");
        C1118b updateFrame = new C1118b(cameraPlugin);
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(cameraPlugin, "cameraPlugin");
        Intrinsics.checkNotNullParameter(updateFrame, "updateFrame");
        this.f9282b = mapboxMap;
        this.f9283c = cameraPlugin;
        this.f9284d = updateFrame;
    }

    public c(String str, HashMap hashMap) {
        this.f9281a = 7;
        this.f9282b = str;
        this.f9283c = hashMap;
        this.f9284d = new HashMap();
    }

    public c(T5.a aVar) {
        this.f9281a = 5;
        A a3 = new A(2);
        a3.f9069b = 0;
        a3.f9070c = 1;
        this.f9283c = a3;
        this.f9284d = new StringBuilder();
        this.f9282b = aVar;
    }

    public c(A0.c cVar) {
        this.f9281a = 0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f9283c = new Object();
        this.f9282b = cVar;
    }

    public c(q qVar, q1.j jVar) {
        this.f9281a = 25;
        this.f9282b = qVar;
        this.f9283c = jVar;
        this.f9284d = new SparseArray();
    }

    public c(Context context, TypedArray typedArray) {
        this.f9281a = 22;
        this.f9282b = context;
        this.f9283c = typedArray;
    }

    public c(Context context, LocationManager locationManager) {
        this.f9281a = 8;
        this.f9284d = new E();
        this.f9282b = context;
        this.f9283c = locationManager;
    }

    public c(Context context, int i3) {
        this.f9281a = i3;
        switch (i3) {
            case 23:
                c5.B b2 = new c5.B(context, 21);
                this.f9282b = context;
                this.f9283c = b2;
                break;
            default:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(F1.w(context, 2130903709, i.class.getCanonicalName()), AbstractC1567a.f20330i);
                u.b(context, obtainStyledAttributes.getResourceId(3, 0));
                this.f9284d = u.b(context, obtainStyledAttributes.getResourceId(1, 0));
                u.b(context, obtainStyledAttributes.getResourceId(2, 0));
                u.b(context, obtainStyledAttributes.getResourceId(4, 0));
                ColorStateList o5 = L1.o(context, obtainStyledAttributes, 5);
                this.f9282b = u.b(context, obtainStyledAttributes.getResourceId(7, 0));
                u.b(context, obtainStyledAttributes.getResourceId(6, 0));
                this.f9283c = u.b(context, obtainStyledAttributes.getResourceId(8, 0));
                new Paint().setColor(o5.getDefaultColor());
                obtainStyledAttributes.recycle();
                break;
        }
    }

    public c(io.flutter.plugins.firebase.messaging.a aVar) {
        this.f9281a = 12;
        this.f9284d = aVar;
        this.f9282b = Executors.newSingleThreadExecutor();
        this.f9283c = new Handler(Looper.getMainLooper());
    }

    public c(C0366a callbackInterface) {
        this.f9281a = 6;
        Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
        this.f9282b = callbackInterface;
        this.f9283c = new ReentrantLock();
        this.f9284d = new WeakHashMap();
    }
}
