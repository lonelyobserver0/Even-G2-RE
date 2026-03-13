package i5;

import Ac.s;
import B3.t;
import C3.e;
import H0.C0067j;
import I3.d;
import I4.g;
import I4.k;
import I4.q;
import I4.r;
import O0.l;
import Qb.InterfaceC0221t0;
import Qb.J;
import Qb.L;
import Tb.C0326g;
import Tb.Y;
import Tb.b0;
import Y.m;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.util.Log;
import c5.B;
import c5.C0568a;
import c5.RunnableC0567A;
import c5.i;
import c5.x;
import c5.y;
import com.google.android.gms.internal.measurement.D1;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.AccuracyLevel;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.IntervalSettings;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.LocationErrorCode;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.common.location.LocationService;
import com.mapbox.common.location.LocationServiceFactory;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.navigator.RouterInterface;
import com.stub.StubApp;
import d5.C0805e;
import e5.C0843b;
import e5.C0844c;
import e5.C0846e;
import e5.InterfaceC0845d;
import e5.f;
import e5.n;
import f5.C0883A;
import f5.C0884B;
import f5.C0888a0;
import f5.C0894d0;
import f5.C0896e0;
import f5.C0900g0;
import f5.C0902h0;
import f5.D0;
import f5.F;
import f5.K0;
import f5.O;
import f5.P;
import f5.Q;
import f5.S;
import f5.U;
import f5.V;
import f5.W;
import i2.o;
import j5.C1091a;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import l7.C1231a;
import l7.C1242l;
import n4.C1383a;
import p2.h;
import xb.C1946c;
import xb.C1950g;
import y3.C1970c;
import z3.C2005a;

/* renamed from: i5.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1059c implements D3.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f14842a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14843b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14844c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14845d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14846e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14847f;

    /* renamed from: g, reason: collision with root package name */
    public Object f14848g;

    public /* synthetic */ C1059c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f14842a = obj;
        this.f14843b = obj2;
        this.f14844c = obj3;
        this.f14845d = obj4;
        this.f14846e = obj5;
        this.f14847f = obj6;
        this.f14848g = obj7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r7 == r2) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00e5: INVOKE (r6 I:Sb.w), (r11 I:java.lang.Throwable) STATIC call: Oc.a.h(Sb.w, java.lang.Throwable):void A[MD:(Sb.w, java.lang.Throwable):void (m)], block:B:50:0x00e5 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0034, B:14:0x00aa, B:16:0x00ae, B:18:0x00b4, B:19:0x00b8, B:21:0x006a, B:27:0x007e, B:29:0x0086, B:31:0x0094, B:33:0x00c2, B:34:0x00da, B:35:0x00db, B:41:0x0053, B:44:0x0062), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0034, B:14:0x00aa, B:16:0x00ae, B:18:0x00b4, B:19:0x00b8, B:21:0x006a, B:27:0x007e, B:29:0x0086, B:31:0x0094, B:33:0x00c2, B:34:0x00da, B:35:0x00db, B:41:0x0053, B:44:0x0062), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r6v6, types: [Sb.w] */
    /* JADX WARN: Type inference failed for: r6v7, types: [Sb.w] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a7 -> B:14:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(i5.C1059c r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C1059c.a(i5.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:12:0x003e, B:15:0x00c4, B:17:0x00c8, B:19:0x00ee, B:20:0x00f2, B:21:0x00fc, B:23:0x0106, B:24:0x0112, B:25:0x0074, B:31:0x0088, B:33:0x0090, B:36:0x00a2, B:39:0x00a0, B:40:0x0125, B:44:0x010a, B:48:0x005f, B:51:0x006c), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0106 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:12:0x003e, B:15:0x00c4, B:17:0x00c8, B:19:0x00ee, B:20:0x00f2, B:21:0x00fc, B:23:0x0106, B:24:0x0112, B:25:0x0074, B:31:0x0088, B:33:0x0090, B:36:0x00a2, B:39:0x00a0, B:40:0x0125, B:44:0x010a, B:48:0x005f, B:51:0x006c), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:12:0x003e, B:15:0x00c4, B:17:0x00c8, B:19:0x00ee, B:20:0x00f2, B:21:0x00fc, B:23:0x0106, B:24:0x0112, B:25:0x0074, B:31:0x0088, B:33:0x0090, B:36:0x00a2, B:39:0x00a0, B:40:0x0125, B:44:0x010a, B:48:0x005f, B:51:0x006c), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:12:0x003e, B:15:0x00c4, B:17:0x00c8, B:19:0x00ee, B:20:0x00f2, B:21:0x00fc, B:23:0x0106, B:24:0x0112, B:25:0x0074, B:31:0x0088, B:33:0x0090, B:36:0x00a2, B:39:0x00a0, B:40:0x0125, B:44:0x010a, B:48:0x005f, B:51:0x006c), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:12:0x003e, B:15:0x00c4, B:17:0x00c8, B:19:0x00ee, B:20:0x00f2, B:21:0x00fc, B:23:0x0106, B:24:0x0112, B:25:0x0074, B:31:0x0088, B:33:0x0090, B:36:0x00a2, B:39:0x00a0, B:40:0x0125, B:44:0x010a, B:48:0x005f, B:51:0x006c), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r12v6, types: [Sb.w] */
    /* JADX WARN: Type inference failed for: r12v7, types: [Sb.w] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c0 -> B:14:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(i5.C1059c r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C1059c.b(i5.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static P c(P p8, f fVar, C1059c c1059c, Map map) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Map unmodifiableMap3;
        O a3 = p8.a();
        String c10 = ((InterfaceC0845d) fVar.f13615b).c();
        String string2 = StubApp.getString2(280);
        if (c10 != null) {
            a3.f13898e = new C0894d0(c10);
        } else if (Log.isLoggable(string2, 2)) {
            Log.v(string2, StubApp.getString2(18566), null);
        }
        boolean isEmpty = map.isEmpty();
        l lVar = (l) c1059c.f14845d;
        if (isEmpty) {
            C0846e c0846e = (C0846e) ((AtomicMarkableReference) lVar.f5143b).getReference();
            synchronized (c0846e) {
                unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(c0846e.f13610a));
            }
        } else {
            C0846e c0846e2 = (C0846e) ((AtomicMarkableReference) lVar.f5143b).getReference();
            synchronized (c0846e2) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(c0846e2.f13610a));
            }
            HashMap hashMap = new HashMap(unmodifiableMap);
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String a9 = C0846e.a(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(a9)) {
                    hashMap.put(a9, C0846e.a(1024, (String) entry.getValue()));
                } else {
                    i3++;
                }
            }
            if (i3 > 0) {
                Log.w(string2, StubApp.getString2(17286) + i3 + StubApp.getString2(18567), null);
            }
            unmodifiableMap2 = Collections.unmodifiableMap(hashMap);
        }
        List l9 = l(unmodifiableMap2);
        C0846e c0846e3 = (C0846e) ((AtomicMarkableReference) ((l) c1059c.f14846e).f5143b).getReference();
        synchronized (c0846e3) {
            unmodifiableMap3 = Collections.unmodifiableMap(new HashMap(c0846e3.f13610a));
        }
        List l10 = l(unmodifiableMap3);
        if (!l9.isEmpty() || !l10.isEmpty()) {
            Q q10 = p8.f13904c;
            a3.f13896c = new Q(q10.f13908a, l9, l10, q10.f13911d, q10.f13912e, q10.f13913f, q10.f13914g);
        }
        return a3.a();
    }

    public static K0 d(P p8, C1059c c1059c) {
        List unmodifiableList;
        s sVar = (s) c1059c.f14847f;
        synchronized (sVar) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(sVar.f387a));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < unmodifiableList.size(); i3++) {
            n nVar = (n) unmodifiableList.get(i3);
            nVar.getClass();
            C0896e0 c0896e0 = new C0896e0();
            C0843b c0843b = (C0843b) nVar;
            String str = c0843b.f13605e;
            if (str == null) {
                throw new NullPointerException(StubApp.getString2(17272));
            }
            String str2 = c0843b.f13602b;
            if (str2 == null) {
                throw new NullPointerException(StubApp.getString2(17275));
            }
            c0896e0.f14000a = new C0900g0(str2, str);
            String str3 = c0843b.f13603c;
            if (str3 == null) {
                throw new NullPointerException(StubApp.getString2(17274));
            }
            c0896e0.f14001b = str3;
            String str4 = c0843b.f13604d;
            if (str4 == null) {
                throw new NullPointerException(StubApp.getString2(17273));
            }
            c0896e0.f14002c = str4;
            c0896e0.f14003d = c0843b.f13606f;
            c0896e0.f14004e = (byte) (c0896e0.f14004e | 1);
            arrayList.add(c0896e0.a());
        }
        if (arrayList.isEmpty()) {
            return p8;
        }
        O a3 = p8.a();
        a3.f13899f = new C0902h0(arrayList);
        return a3.a();
    }

    public static String g(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C1059c h(Context context, y yVar, C1059c c1059c, B6.a aVar, f fVar, C1059c c1059c2, m mVar, A3.s sVar, V6.b bVar, i iVar, C0805e c0805e) {
        c5.s sVar2 = new c5.s(context, yVar, aVar, mVar, sVar);
        C1057a c1057a = new C1057a(c1059c, sVar, iVar);
        g5.c cVar = C1091a.f15325b;
        t.b(context);
        return new C1059c(sVar2, c1057a, new C1091a(new j5.b(t.a().c(new C2005a(C1091a.f15326c, C1091a.f15327d)).a(StubApp.getString2(18568), new C1970c(StubApp.getString2(2547)), C1091a.f15328e), sVar.h(), bVar)), fVar, c1059c2, yVar, c0805e);
    }

    public static List l(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException(StubApp.getString2(17791));
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException(StubApp.getString2(17790));
            }
            arrayList.add(new F(str, str2));
        }
        Collections.sort(arrayList, new C0067j(13));
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized void n(File file) {
        String string2 = StubApp.getString2(18569);
        String string22 = StubApp.getString2(18570);
        synchronized (C1059c.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = string22 + file + StubApp.getString2("18571");
                    if (Log.isLoggable(StubApp.getString2("280"), 3)) {
                        Log.d(StubApp.getString2("280"), str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e(StubApp.getString2("280"), string2 + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean o(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                o(file2);
            }
        }
        return file.delete();
    }

    public static List p(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void e(k kVar, float f10, RectF rectF, F5.c cVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        I4.s[] sVarArr;
        int i3;
        float[] fArr;
        char c10;
        C1059c c1059c = this;
        path.rewind();
        int i10 = 0;
        while (true) {
            matrixArr = (Matrix[]) c1059c.f14844c;
            matrixArr2 = (Matrix[]) c1059c.f14843b;
            sVarArr = (I4.s[]) c1059c.f14842a;
            i3 = 4;
            fArr = (float[]) c1059c.f14847f;
            if (i10 >= 4) {
                break;
            }
            I4.c cVar2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.f3188f : kVar.f3187e : kVar.f3190h : kVar.f3189g;
            D1 d12 = i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.f3184b : kVar.f3183a : kVar.f3186d : kVar.f3185c;
            I4.s sVar = sVarArr[i10];
            d12.getClass();
            d12.l(sVar, f10, cVar2.a(rectF));
            int i11 = i10 + 1;
            float f11 = i11 * 90;
            matrixArr2[i10].reset();
            PointF pointF = (PointF) c1059c.f14845d;
            if (i10 == 1) {
                c10 = 1;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i10 == 2) {
                c10 = 1;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i10 != 3) {
                c10 = 1;
                pointF.set(rectF.right, rectF.top);
            } else {
                c10 = 1;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f11);
            I4.s sVar2 = sVarArr[i10];
            fArr[0] = sVar2.f3212b;
            fArr[c10] = sVar2.f3213c;
            matrixArr2[i10].mapPoints(fArr);
            matrixArr[i10].reset();
            matrixArr[i10].setTranslate(fArr[0], fArr[c10]);
            matrixArr[i10].preRotate(f11);
            i10 = i11;
        }
        int i12 = 1;
        int i13 = 0;
        while (i13 < i3) {
            I4.s sVar3 = sVarArr[i13];
            sVar3.getClass();
            fArr[0] = 0.0f;
            fArr[i12] = sVar3.f3211a;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[0], fArr[i12]);
            } else {
                path.lineTo(fArr[0], fArr[i12]);
            }
            I4.s sVar4 = sVarArr[i13];
            Matrix matrix = matrixArr2[i13];
            ArrayList arrayList = sVar4.f3216f;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((q) arrayList.get(i14)).a(matrix, path);
            }
            if (cVar != null) {
                I4.s sVar5 = sVarArr[i13];
                Matrix matrix2 = matrixArr2[i13];
                r[] rVarArr = ((g) cVar.f2238b).f3152b;
                sVar5.a(sVar5.f3215e);
                rVarArr[i13] = new I4.l(new ArrayList(sVar5.f3217g), matrix2);
            }
            int i15 = i13 + 1;
            int i16 = i15 % 4;
            I4.s sVar6 = sVarArr[i13];
            fArr[0] = sVar6.f3212b;
            fArr[i12] = sVar6.f3213c;
            matrixArr2[i13].mapPoints(fArr);
            I4.s sVar7 = sVarArr[i16];
            sVar7.getClass();
            float[] fArr2 = (float[]) c1059c.f14848g;
            fArr2[0] = 0.0f;
            fArr2[i12] = sVar7.f3211a;
            matrixArr2[i16].mapPoints(fArr2);
            double d8 = fArr[0] - fArr2[0];
            float f12 = fArr[i12] - fArr2[i12];
            Matrix[] matrixArr3 = matrixArr;
            float max = Math.max(((float) Math.hypot(d8, f12)) - 0.001f, 0.0f);
            I4.s sVar8 = sVarArr[i13];
            fArr[0] = sVar8.f3212b;
            fArr[i12] = sVar8.f3213c;
            matrixArr2[i13].mapPoints(fArr);
            int i17 = i12;
            if (i13 == i17 || i13 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[i17]);
            }
            I4.s sVar9 = (I4.s) c1059c.f14846e;
            sVar9.c(0.0f, 270.0f, 0.0f);
            (i13 != 1 ? i13 != 2 ? i13 != 3 ? kVar.j : kVar.f3191i : kVar.f3193l : kVar.f3192k).getClass();
            sVar9.b(max, 0.0f);
            Matrix matrix3 = matrixArr3[i13];
            ArrayList arrayList2 = sVar9.f3216f;
            int size2 = arrayList2.size();
            for (int i18 = 0; i18 < size2; i18++) {
                ((q) arrayList2.get(i18)).a(matrix3, path);
            }
            if (cVar != null) {
                Matrix matrix4 = matrixArr3[i13];
                r[] rVarArr2 = ((g) cVar.f2238b).f3153c;
                sVar9.a(sVar9.f3215e);
                rVarArr2[i13] = new I4.l(new ArrayList(sVar9.f3217g), matrix4);
            }
            c1059c = this;
            matrixArr = matrixArr3;
            i13 = i15;
            i3 = 4;
            i12 = 1;
        }
        path.close();
    }

    public void f(String str) {
        File file = new File((File) this.f14843b, str);
        if (file.exists() && o(file)) {
            String str2 = StubApp.getString2(18572) + file.getPath();
            String string2 = StubApp.getString2(280);
            if (Log.isLoggable(string2, 3)) {
                Log.d(string2, str2, null);
            }
        }
    }

    @Override // Pb.a
    public Object get() {
        return new H3.i((Context) ((F5.c) this.f14842a).f2238b, (e) ((Pb.a) this.f14843b).get(), (d) ((Pb.a) this.f14844c).get(), (H3.d) ((Q2.g) this.f14845d).get(), (Executor) ((Pb.a) this.f14846e).get(), (J3.c) ((Pb.a) this.f14847f).get(), new I4.e(11), new C2.i(), (I3.c) ((Pb.a) this.f14848g).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(int r5, wb.e r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof xb.C1948e
            if (r0 == 0) goto L13
            r0 = r7
            xb.e r0 = (xb.C1948e) r0
            int r1 = r0.f23153g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23153g = r1
            goto L18
        L13:
            xb.e r0 = new xb.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f23151e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23153g
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L33
            int r5 = r0.f23150d
            Zb.e r6 = r0.f23149c
            wb.e r1 = r0.f23148b
            i5.c r0 = r0.f23147a
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            r6 = r1
            goto L59
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = 275(0x113, float:3.85E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        L40:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f23147a = r4
            r0.f23148b = r6
            java.lang.Object r7 = r4.f14848g
            Zb.e r7 = (Zb.e) r7
            r0.f23149c = r7
            r0.f23150d = r5
            r0.f23153g = r3
            java.lang.Object r0 = r7.e(r0)
            if (r0 != r1) goto L58
            return r1
        L58:
            r0 = r4
        L59:
            r1 = 0
            java.lang.Object r0 = r0.f14847f     // Catch: java.lang.Throwable -> L66
            wb.e[] r0 = (wb.e[]) r0     // Catch: java.lang.Throwable -> L66
            r2 = r0[r5]     // Catch: java.lang.Throwable -> L66
            r0[r5] = r6     // Catch: java.lang.Throwable -> L66
            r7.g(r1)
            return r2
        L66:
            r5 = move-exception
            r7.g(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C1059c.i(int, wb.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public RouterInterface j() {
        Object obj = ((AtomicReference) this.f14848g).get();
        Intrinsics.checkNotNullExpressionValue(obj, "routerRef.get()");
        return (RouterInterface) obj;
    }

    public File k(String str, String str2) {
        File file = new File((File) this.f14845d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void m(Throwable th, Thread thread, String str, C0844c c0844c, boolean z2) {
        m mVar;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b2;
        boolean equals = str.equals(StubApp.getString2(7530));
        c5.s sVar = (c5.s) this.f14842a;
        Context context = sVar.f10942a;
        int i3 = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        h hVar = null;
        while (true) {
            boolean isEmpty = stack.isEmpty();
            mVar = sVar.f10945d;
            if (isEmpty) {
                break;
            }
            Throwable th3 = (Throwable) stack.pop();
            hVar = new h(th3.getLocalizedMessage(), th3.getClass().getName(), mVar.d(th3.getStackTrace()), hVar);
        }
        O o5 = new O();
        o5.f13895b = str;
        o5.f13894a = c0844c.f13608b;
        o5.f13900g = (byte) (o5.f13900g | 1);
        D0 e10 = Z4.c.f8981b.e(context);
        int i10 = ((C0888a0) e10).f13957c;
        Boolean valueOf = i10 > 0 ? Boolean.valueOf(i10 != 100) : null;
        ArrayList d8 = Z4.c.d(context);
        byte b10 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hVar.f19673c;
        String name = thread.getName();
        String string2 = StubApp.getString2(9576);
        if (name == null) {
            throw new NullPointerException(string2);
        }
        Boolean bool = valueOf;
        byte b11 = (byte) 1;
        List d10 = c5.s.d(stackTraceElementArr, 4);
        String string22 = StubApp.getString2(9571);
        if (d10 == null) {
            throw new NullPointerException(string22);
        }
        String string23 = StubApp.getString2(17528);
        String string24 = StubApp.getString2(555);
        if (b11 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b11 == 0) {
                sb2.append(string23);
            }
            throw new IllegalStateException(Xa.h.r(sb2, string24));
        }
        arrayList.add(new W(4, name, d10));
        if (z2) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    b2 = b11;
                } else {
                    StackTraceElement[] d11 = mVar.d(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException(string2);
                    }
                    it = it2;
                    List d12 = c5.s.d(d11, 0);
                    if (d12 == null) {
                        throw new NullPointerException(string22);
                    }
                    if (b11 != 1) {
                        byte b12 = b11;
                        StringBuilder sb3 = new StringBuilder();
                        if (b12 == 0) {
                            sb3.append(string23);
                        }
                        throw new IllegalStateException(Xa.h.r(sb3, string24));
                    }
                    b2 = b11;
                    arrayList.add(new W(0, name2, d12));
                }
                it2 = it;
                b11 = b2;
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        U c10 = c5.s.c(hVar, 0);
        V e11 = c5.s.e();
        List a3 = sVar.a();
        if (a3 == null) {
            throw new NullPointerException(StubApp.getString2(9494));
        }
        S s10 = new S(unmodifiableList, c10, null, e11, a3);
        if (b10 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b10 == 0) {
                sb4.append(StubApp.getString2(9493));
            }
            throw new IllegalStateException(Xa.h.r(sb4, string24));
        }
        o5.f13896c = new Q(s10, null, null, bool, e10, d8, i3);
        o5.f13897d = sVar.b(i3);
        P a9 = o5.a();
        f fVar = (f) this.f14845d;
        C1059c c1059c = (C1059c) this.f14846e;
        K0 d13 = d(c(a9, fVar, c1059c, c0844c.f13609c), c1059c);
        if (z2) {
            ((C1057a) this.f14843b).d(d13, c0844c.f13607a, equals);
        } else {
            ((C0805e) this.f14848g).f13423b.a(new RunnableC0567A(0, this, d13, c0844c, equals));
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:? -> B:42:0x0159). Please report as a decompilation issue!!! */
    public q4.s q(Executor executor, String str) {
        C0568a c0568a;
        ArrayBlockingQueue arrayBlockingQueue;
        q4.k kVar;
        ArrayList b2 = ((C1057a) this.f14843b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                g5.c cVar = C1057a.f14834g;
                String e10 = C1057a.e(file);
                cVar.getClass();
                arrayList.add(new C0568a(g5.c.i(e10), file.getName(), file));
            } catch (IOException e11) {
                Log.w(StubApp.getString2(280), StubApp.getString2(18573) + file + StubApp.getString2(18574), e11);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0568a c0568a2 = (C0568a) it2.next();
            if (str == null || str.equals(c0568a2.f10860b)) {
                C1091a c1091a = (C1091a) this.f14844c;
                C0884B c0884b = c0568a2.f10859a;
                boolean z2 = true;
                if (c0884b.f13813f == null || c0884b.f13814g == null) {
                    x b10 = ((y) this.f14847f).b(true);
                    C0883A a3 = c0568a2.f10859a.a();
                    a3.f13801e = b10.f10964a;
                    C0883A a9 = a3.a().a();
                    a9.f13802f = b10.f10965b;
                    c0568a = new C0568a(a9.a(), c0568a2.f10860b, c0568a2.f10861c);
                } else {
                    c0568a = c0568a2;
                }
                boolean z10 = str != null;
                j5.b bVar = c1091a.f15329a;
                String string2 = StubApp.getString2(18575);
                String string22 = StubApp.getString2(18576);
                String string23 = StubApp.getString2(18577);
                String string24 = StubApp.getString2(18578);
                ArrayBlockingQueue arrayBlockingQueue2 = bVar.f15335f;
                synchronized (arrayBlockingQueue2) {
                    try {
                        kVar = new q4.k();
                        if (z10) {
                            ((AtomicInteger) bVar.f15338i.f7761b).getAndIncrement();
                            if (bVar.f15335f.size() >= bVar.f15334e) {
                                z2 = false;
                            }
                            if (z2) {
                                Z4.c cVar2 = Z4.c.f8980a;
                                cVar2.c(string24 + c0568a.f10860b);
                                cVar2.c(string23 + bVar.f15335f.size());
                                arrayBlockingQueue = arrayBlockingQueue2;
                                try {
                                    bVar.f15336g.execute(new K.m(6, bVar, c0568a, kVar, false));
                                    cVar2.c(string22 + c0568a.f10860b);
                                    kVar.d(c0568a);
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } else {
                                bVar.a();
                                String str2 = string2 + c0568a.f10860b;
                                if (Log.isLoggable(StubApp.getString2("280"), 3)) {
                                    Log.d(StubApp.getString2("280"), str2, null);
                                }
                                ((AtomicInteger) bVar.f15338i.f7762c).getAndIncrement();
                                kVar.d(c0568a);
                            }
                        } else {
                            bVar.b(c0568a, kVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        arrayBlockingQueue = arrayBlockingQueue2;
                        throw th;
                    }
                }
                arrayList2.add(kVar.f20051a.continueWith(executor, new B(this, 0)));
            }
        }
        return a4.f.A(arrayList2);
    }

    public void r(l7.r locationConsumer) {
        Intrinsics.checkNotNullParameter(locationConsumer, "locationConsumer");
        InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) ((ConcurrentHashMap) this.f14848g).remove(locationConsumer);
        if (interfaceC0221t0 != null) {
            interfaceC0221t0.d(null);
        }
    }

    public C1059c(String str, String str2, Set set) {
        C1383a c1383a = C1383a.f17803b;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f14843b = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f14845d = map;
        this.f14842a = str;
        this.f14846e = str2;
        this.f14847f = c1383a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw com.mapbox.common.b.e(it);
        }
        this.f14844c = Collections.unmodifiableSet(hashSet);
    }

    public C1059c(Handler handler) {
        this.f14842a = handler;
        Vb.f a3 = J.a(EmptyCoroutineContext.INSTANCE);
        this.f14843b = a3;
        this.f14844c = Ec.l.a(256, 0, 6);
        this.f14845d = Ec.l.a(256, 0, 6);
        this.f14846e = new o();
        this.f14847f = new wb.e[256];
        this.f14848g = Zb.f.a();
        L.j(a3, new C1950g(this), new C1946c(this, null), 2);
    }

    public C1059c(int i3) {
        switch (i3) {
            case 6:
                this.f14842a = new AtomicBoolean();
                this.f14843b = null;
                this.f14844c = new HashMap(16, 1.0f);
                this.f14845d = new HashMap(16, 1.0f);
                this.f14846e = new HashMap(16, 1.0f);
                this.f14847f = new HashMap(16, 1.0f);
                this.f14848g = null;
                break;
            default:
                this.f14842a = new I4.s[4];
                this.f14843b = new Matrix[4];
                this.f14844c = new Matrix[4];
                this.f14845d = new PointF();
                this.f14846e = new I4.s();
                this.f14847f = new float[2];
                this.f14848g = new float[2];
                for (int i10 = 0; i10 < 4; i10++) {
                    ((I4.s[]) this.f14842a)[i10] = new I4.s();
                    ((Matrix[]) this.f14843b)[i10] = new Matrix();
                    ((Matrix[]) this.f14844c)[i10] = new Matrix();
                }
                break;
        }
    }

    public C1059c(RouterInterface router, D9.h threadController, J7.o routeParsingManager, A0.c routeParsingTracking) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(threadController, "threadController");
        Intrinsics.checkNotNullParameter(routeParsingManager, "routeParsingManager");
        Intrinsics.checkNotNullParameter(routeParsingTracking, "routeParsingTracking");
        this.f14842a = threadController;
        this.f14843b = routeParsingManager;
        this.f14844c = routeParsingTracking;
        this.f14845d = new LinkedHashMap();
        this.f14846e = new LinkedHashMap();
        this.f14847f = LazyKt.lazy(new Ac.m(this, 1));
        this.f14848g = new AtomicReference(router);
    }

    public C1059c(Context context, int i3) {
        Object obj;
        String string2;
        String replaceAll;
        switch (i3) {
            case 8:
                Intrinsics.checkNotNullParameter(context, "context");
                Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(origApplicationContext, "context.applicationContext");
                l7.o locationCompassEngine = new l7.o(origApplicationContext);
                LocationService locationService = LocationServiceFactory.getOrCreate();
                Intrinsics.checkNotNullExpressionValue(locationService, "getOrCreate()");
                Xb.d dVar = Qb.W.f5838a;
                Rb.d mainCoroutineDispatcher = Vb.q.f7968a.f6359c;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(locationCompassEngine, "locationCompassEngine");
                Intrinsics.checkNotNullParameter(locationService, "locationService");
                Intrinsics.checkNotNullParameter(mainCoroutineDispatcher, "mainCoroutineDispatcher");
                this.f14842a = locationCompassEngine;
                this.f14843b = mainCoroutineDispatcher;
                Vb.f a3 = J.a(CoroutineContext.Element.DefaultImpls.plus(L.b(), mainCoroutineDispatcher));
                this.f14845d = new b0(X6.s.f8473b);
                this.f14846e = Tb.Q.m(Tb.Q.e(new C1242l(this, null)), a3, new Y());
                this.f14848g = new ConcurrentHashMap();
                Expected<LocationError, DeviceLocationProvider> deviceLocationProvider = locationService.getDeviceLocationProvider(new LocationProviderRequest.Builder().accuracy(AccuracyLevel.HIGH).interval(new IntervalSettings.Builder().minimumInterval(1000L).interval(1000L).build()).displacement(Float.valueOf(0.1f)).build());
                if (deviceLocationProvider.isValue()) {
                    Context origApplicationContext2 = StubApp.getOrigApplicationContext(context.getApplicationContext());
                    DeviceLocationProvider value = deviceLocationProvider.getValue();
                    Intrinsics.checkNotNull(value);
                    obj = Tb.Q.m(Tb.Q.e(new C1231a(origApplicationContext2, value, this, null)), a3, new Y());
                } else {
                    LocationError error = deviceLocationProvider.getError();
                    Intrinsics.checkNotNull(error);
                    MapboxLogger.logE(StubApp.getString2(18561), StubApp.getString2(18560) + error);
                    this.f14844c = new LocationError(LocationErrorCode.NOT_AVAILABLE, StubApp.getString2(18562));
                    obj = C0326g.f7360b;
                }
                this.f14847f = obj;
                break;
            default:
                String str = ((C0888a0) Z4.c.f8981b.e(context)).f13955a;
                this.f14842a = str;
                File filesDir = context.getFilesDir();
                this.f14843b = filesDir;
                if (!str.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder(StubApp.getString2(18554));
                    sb2.append(File.separator);
                    if (str.length() > 40) {
                        replaceAll = c5.f.h(str);
                    } else {
                        replaceAll = str.replaceAll(StubApp.getString2(18555), StubApp.getString2(4956));
                    }
                    sb2.append(replaceAll);
                    string2 = sb2.toString();
                } else {
                    string2 = StubApp.getString2(9504);
                }
                File file = new File(filesDir, string2);
                n(file);
                this.f14844c = file;
                File file2 = new File(file, StubApp.getString2(18556));
                n(file2);
                this.f14845d = file2;
                File file3 = new File(file, StubApp.getString2(18557));
                n(file3);
                this.f14846e = file3;
                File file4 = new File(file, StubApp.getString2(18558));
                n(file4);
                this.f14847f = file4;
                File file5 = new File(file, StubApp.getString2(18559));
                n(file5);
                this.f14848g = file5;
                break;
        }
    }

    public C1059c(String str, C1059c c1059c, C0805e c0805e) {
        this.f14845d = new l(this, false);
        this.f14846e = new l(this, true);
        this.f14847f = new s();
        this.f14848g = new AtomicMarkableReference(null, false);
        this.f14842a = str;
        this.f14843b = new e5.h(c1059c);
        this.f14844c = c0805e;
    }
}
