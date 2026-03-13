package a4;

import F7.k;
import N.N;
import N.O;
import N.P;
import N.Q;
import N.c0;
import S3.D;
import Z9.C0366a;
import a.AbstractC0378a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import c2.C0560l;
import c2.C0561m;
import c2.C0563o;
import c2.InterfaceC0562n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.C0601d;
import com.google.android.gms.internal.measurement.C0606e;
import com.google.android.gms.internal.measurement.C0616g;
import com.google.android.gms.internal.measurement.C0636k;
import com.google.android.gms.internal.measurement.C0641l;
import com.google.android.gms.internal.measurement.C0666q;
import com.google.android.gms.internal.measurement.EnumC0695w;
import com.google.android.gms.internal.measurement.InterfaceC0651n;
import com.google.android.gms.internal.measurement.L1;
import com.google.android.gms.internal.measurement.r;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.StylePropertyValue;
import com.stub.StubApp;
import g2.C0953a;
import io.flutter.plugin.editing.FlutterTextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l4.O0;
import q4.l;
import q4.m;
import q4.s;
import r9.p;
import tb.InterfaceC1749b;
import tb.InterfaceC1750c;
import wc.C1891h;
import wc.EnumC1883H;
import wc.y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f9272a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f9273b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f9274c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f9275d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f9276e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f9277f;

    public f() {
        new ConcurrentHashMap();
    }

    public static s A(List list) {
        if (list == null || list.isEmpty()) {
            return m(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((q4.j) it.next()) == null) {
                throw new NullPointerException(StubApp.getString2(8389));
            }
        }
        s sVar = new s();
        m mVar = new m(list.size(), sVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            q4.j jVar = (q4.j) it2.next();
            T4.d dVar = l.f20053b;
            jVar.addOnSuccessListener(dVar, mVar);
            jVar.addOnFailureListener(dVar, mVar);
            jVar.addOnCanceledListener(dVar, mVar);
        }
        return sVar;
    }

    public static void B(Parcel parcel, int i3, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int I10 = I(parcel, i3);
        parcel.writeBundle(bundle);
        N(parcel, I10);
    }

    public static void C(Parcel parcel, int i3, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int I10 = I(parcel, i3);
        parcel.writeStrongBinder(iBinder);
        N(parcel, I10);
    }

    public static void D(Parcel parcel, int i3, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int I10 = I(parcel, i3);
        parcel.writeIntArray(iArr);
        N(parcel, I10);
    }

    public static void E(Parcel parcel, int i3, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int I10 = I(parcel, i3);
        parcelable.writeToParcel(parcel, i10);
        N(parcel, I10);
    }

    public static void F(Parcel parcel, int i3, String str) {
        if (str == null) {
            return;
        }
        int I10 = I(parcel, i3);
        parcel.writeString(str);
        N(parcel, I10);
    }

    public static void G(Parcel parcel, int i3, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int I10 = I(parcel, i3);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        N(parcel, I10);
    }

    public static void H(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int I10 = I(parcel, i3);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        N(parcel, I10);
    }

    public static int I(Parcel parcel, int i3) {
        parcel.writeInt(i3 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bc, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader J() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.J():java.lang.ClassLoader");
    }

    public static Object K(q4.j jVar) {
        if (jVar.isSuccessful()) {
            return jVar.getResult();
        }
        if (jVar.isCanceled()) {
            throw new CancellationException(StubApp.getString2(8395));
        }
        throw new ExecutionException(jVar.getException());
    }

    public static void L(int i3, String str, List list) {
        if (list.size() == i3) {
            return;
        }
        throw new IllegalArgumentException(str + StubApp.getString2(8396) + i3 + StubApp.getString2(8397) + list.size());
    }

    public static void M(int i3, String str, List list) {
        if (list.size() >= i3) {
            return;
        }
        throw new IllegalArgumentException(str + StubApp.getString2(8398) + i3 + StubApp.getString2(8397) + list.size());
    }

    public static void N(Parcel parcel, int i3) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i3 - 4);
        parcel.writeInt(dataPosition - i3);
        parcel.setDataPosition(dataPosition);
    }

    public static void O(int i3, int i10) {
        String I10;
        if (i3 < 0 || i3 >= i10) {
            String string2 = StubApp.getString2(8110);
            if (i3 < 0) {
                I10 = android.support.v4.media.session.b.I(StubApp.getString2(8401), string2, Integer.valueOf(i3));
            } else {
                if (i10 < 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
                    sb2.append(StubApp.getString2(8399));
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                I10 = android.support.v4.media.session.b.I(StubApp.getString2(8400), string2, Integer.valueOf(i3), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(I10);
        }
    }

    public static void P(Parcel parcel, int i3, int i10) {
        parcel.writeInt(i3 | (i10 << 16));
    }

    public static void Q(String str, int i3, ArrayList arrayList) {
        if (arrayList.size() <= i3) {
            return;
        }
        throw new IllegalArgumentException(str + StubApp.getString2(8402) + i3 + StubApp.getString2(8397) + arrayList.size());
    }

    public static boolean R(InterfaceC0651n interfaceC0651n) {
        if (interfaceC0651n == null) {
            return false;
        }
        Double d8 = interfaceC0651n.d();
        return !d8.isNaN() && d8.doubleValue() >= 0.0d && d8.equals(Double.valueOf(Math.floor(d8.doubleValue())));
    }

    public static EnumC0695w S(String str) {
        EnumC0695w enumC0695w = null;
        if (str != null && !str.isEmpty()) {
            enumC0695w = (EnumC0695w) EnumC0695w.f11693F0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC0695w != null) {
            return enumC0695w;
        }
        throw new IllegalArgumentException(E1.a.j(StubApp.getString2(8403), str));
    }

    public static void T(int i3, int i10, int i11) {
        String U5;
        if (i3 < 0 || i10 < i3 || i10 > i11) {
            if (i3 < 0 || i3 > i11) {
                U5 = U(i3, i11, StubApp.getString2(8406));
            } else if (i10 < 0 || i10 > i11) {
                U5 = U(i10, i11, StubApp.getString2(8405));
            } else {
                U5 = android.support.v4.media.session.b.I(StubApp.getString2(8404), Integer.valueOf(i10), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(U5);
        }
    }

    public static String U(int i3, int i10, String str) {
        if (i3 < 0) {
            return android.support.v4.media.session.b.I(StubApp.getString2(8401), str, Integer.valueOf(i3));
        }
        if (i10 >= 0) {
            return android.support.v4.media.session.b.I(StubApp.getString2(8407), str, Integer.valueOf(i3), Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb2.append(StubApp.getString2(8399));
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean V(InterfaceC0651n interfaceC0651n, InterfaceC0651n interfaceC0651n2) {
        if (!interfaceC0651n.getClass().equals(interfaceC0651n2.getClass())) {
            return false;
        }
        if ((interfaceC0651n instanceof r) || (interfaceC0651n instanceof C0641l)) {
            return true;
        }
        if (!(interfaceC0651n instanceof C0616g)) {
            return interfaceC0651n instanceof C0666q ? interfaceC0651n.b().equals(interfaceC0651n2.b()) : interfaceC0651n instanceof C0606e ? interfaceC0651n.a().equals(interfaceC0651n2.a()) : interfaceC0651n == interfaceC0651n2;
        }
        if (Double.isNaN(interfaceC0651n.d().doubleValue()) || Double.isNaN(interfaceC0651n2.d().doubleValue())) {
            return false;
        }
        return interfaceC0651n.d().equals(interfaceC0651n2.d());
    }

    public static int W(double d8) {
        if (Double.isNaN(d8) || Double.isInfinite(d8) || d8 == 0.0d) {
            return 0;
        }
        return (int) (((d8 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d8))) % 4.294967296E9d);
    }

    public static double X(double d8) {
        if (Double.isNaN(d8)) {
            return 0.0d;
        }
        if (Double.isInfinite(d8) || d8 == 0.0d || d8 == 0.0d) {
            return d8;
        }
        return (d8 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d8));
    }

    public static Object Y(InterfaceC0651n interfaceC0651n) {
        if (InterfaceC0651n.f11620V.equals(interfaceC0651n)) {
            return null;
        }
        if (InterfaceC0651n.f11619U.equals(interfaceC0651n)) {
            return "";
        }
        if (interfaceC0651n instanceof C0636k) {
            return Z((C0636k) interfaceC0651n);
        }
        if (!(interfaceC0651n instanceof C0601d)) {
            return !interfaceC0651n.d().isNaN() ? interfaceC0651n.d() : interfaceC0651n.b();
        }
        ArrayList arrayList = new ArrayList();
        C0601d c0601d = (C0601d) interfaceC0651n;
        c0601d.getClass();
        int i3 = 0;
        while (i3 < c0601d.p()) {
            if (i3 >= c0601d.p()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 21);
                sb2.append(StubApp.getString2(8408));
                sb2.append(i3);
                throw new NoSuchElementException(sb2.toString());
            }
            int i10 = i3 + 1;
            Object Y5 = Y(c0601d.q(i3));
            if (Y5 != null) {
                arrayList.add(Y5);
            }
            i3 = i10;
        }
        return arrayList;
    }

    public static HashMap Z(C0636k c0636k) {
        HashMap hashMap = new HashMap();
        Iterator it = new ArrayList(c0636k.f11596a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object Y5 = Y(c0636k.f(str));
            if (Y5 != null) {
                hashMap.put(str, Y5);
            }
        }
        return hashMap;
    }

    public static final ScreenCoordinate a(MotionEvent motionEvent) {
        return new ScreenCoordinate(motionEvent.getX(), motionEvent.getY());
    }

    public static void a0(p2.h hVar) {
        String string2 = StubApp.getString2(1302);
        int W10 = W(hVar.q(string2).d().doubleValue() + 1.0d);
        if (W10 > 1000000) {
            throw new IllegalStateException(StubApp.getString2(8409));
        }
        hVar.o(string2, new C0616g(Double.valueOf(W10)));
    }

    public static Object b(q4.j jVar) {
        D.g(StubApp.getString2(8410));
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), StubApp.getString2(5629))) {
            throw new IllegalStateException(StubApp.getString2(8411));
        }
        D.i(jVar, StubApp.getString2(8412));
        if (jVar.isComplete()) {
            return K(jVar);
        }
        C0366a c0366a = new C0366a(23);
        Executor executor = l.f20053b;
        jVar.addOnSuccessListener(executor, c0366a);
        jVar.addOnFailureListener(executor, c0366a);
        jVar.addOnCanceledListener(executor, c0366a);
        ((CountDownLatch) c0366a.f9105b).await();
        return K(jVar);
    }

    public static Object c(q4.j jVar, long j, TimeUnit timeUnit) {
        D.g(StubApp.getString2(8410));
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), StubApp.getString2(5629))) {
            throw new IllegalStateException(StubApp.getString2(8411));
        }
        D.i(jVar, StubApp.getString2(8412));
        D.i(timeUnit, StubApp.getString2(8413));
        if (jVar.isComplete()) {
            return K(jVar);
        }
        C0366a c0366a = new C0366a(23);
        Executor executor = l.f20053b;
        jVar.addOnSuccessListener(executor, c0366a);
        jVar.addOnFailureListener(executor, c0366a);
        jVar.addOnCanceledListener(executor, c0366a);
        if (((CountDownLatch) c0366a.f9105b).await(j, timeUnit)) {
            return K(jVar);
        }
        throw new TimeoutException(StubApp.getString2(8414));
    }

    public static void d(Context context, InterfaceC1749b interfaceC1749b) {
        Rect rect;
        c0 _windowInsetsCompat;
        WindowMetrics maximumWindowMetrics;
        Activity context2 = o(context);
        if (context2 != null) {
            InterfaceC0562n.f10810a.getClass();
            C0560l c0560l = C0561m.f10809b;
            C0563o it = C0563o.f10811b;
            c0560l.getClass();
            Intrinsics.checkNotNullParameter(it, "it");
            Intrinsics.checkNotNullParameter(context2, "activity");
            Intrinsics.checkNotNullParameter(context2, "context");
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                Intrinsics.checkNotNullParameter(context2, "context");
                maximumWindowMetrics = ((WindowManager) context2.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                Intrinsics.checkNotNullExpressionValue(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = context2.getSystemService(StubApp.getString2(526));
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                Intrinsics.checkNotNullExpressionValue(display, "display");
                Intrinsics.checkNotNullParameter(display, "display");
                Point point = new Point();
                Intrinsics.checkNotNullParameter(display, "display");
                Intrinsics.checkNotNullParameter(point, "point");
                display.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i3 >= 30) {
                Intrinsics.checkNotNullParameter(context2, "context");
                if (i3 < 30) {
                    throw new Exception(StubApp.getString2(8415));
                }
                _windowInsetsCompat = C0953a.f14214a.a(context2);
            } else {
                _windowInsetsCompat = (i3 >= 34 ? new Q() : i3 >= 30 ? new P() : i3 >= 29 ? new O() : new N()).b();
                Intrinsics.checkNotNullExpressionValue(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            }
            Z1.b _bounds = new Z1.b(rect);
            Intrinsics.checkNotNullParameter(_bounds, "_bounds");
            Intrinsics.checkNotNullParameter(_windowInsetsCompat, "_windowInsetsCompat");
            ((Ya.c) interfaceC1749b).f8861a.updateDisplayMetrics(0, _bounds.a().width(), _bounds.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static s e(Executor executor, Callable callable) {
        D.i(executor, StubApp.getString2(5645));
        s sVar = new s();
        executor.execute(new O0(16, sVar, callable));
        return sVar;
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static s l(Exception exc) {
        s sVar = new s();
        sVar.a(exc);
        return sVar;
    }

    public static s m(Object obj) {
        s sVar = new s();
        sVar.b(obj);
        return sVar;
    }

    public static wc.r n(SSLSession sSLSession) {
        List emptyList;
        Intrinsics.checkNotNullParameter(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException(StubApp.getString2(8418));
        }
        if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException(Intrinsics.stringPlus("cipherSuite == ", cipherSuite));
        }
        C1891h c10 = C1891h.f22373b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException(StubApp.getString2(8417));
        }
        if (Intrinsics.areEqual("NONE", protocol)) {
            throw new IOException(StubApp.getString2(8416));
        }
        EnumC1883H m4 = L1.m(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            emptyList = peerCertificates != null ? xc.b.l(Arrays.copyOf(peerCertificates, peerCertificates.length)) : CollectionsKt.emptyList();
        } catch (SSLPeerUnverifiedException unused) {
            emptyList = CollectionsKt.emptyList();
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new wc.r(m4, c10, localCertificates != null ? xc.b.l(Arrays.copyOf(localCertificates, localCertificates.length)) : CollectionsKt.emptyList(), new p(1, emptyList));
    }

    public static Activity o(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final com.mapbox.navigation.base.route.a p(Z8.i iVar, com.mapbox.navigation.base.route.g route) {
        Object obj;
        String string2;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        int max = Math.max(1, iVar.f9067b.getNextWaypointIndex());
        Intrinsics.checkNotNullParameter(route, "<this>");
        Iterator it = CollectionsKt.drop(route.f12508l, max).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (W.a.q((k) obj)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar == null) {
            return null;
        }
        int i3 = kVar.f2322g;
        if (i3 == 1) {
            string2 = StubApp.getString2(8422);
        } else if (i3 == 3) {
            string2 = StubApp.getString2(8421);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException(kVar + StubApp.getString2(8420));
            }
            string2 = StubApp.getString2(FlutterTextUtils.COMBINING_ENCLOSING_KEYCAP);
        }
        String type = string2;
        com.mapbox.geojson.Point location = kVar.f2316a;
        Intrinsics.checkNotNullParameter(location, "location");
        String name = kVar.f2317b;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new com.mapbox.navigation.base.route.a(location, name, kVar.f2318c, type, kVar.f2320e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0 >= 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int q(mb.n r5) {
        /*
            java.lang.Long r5 = r5.f17336c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L9
            goto L14
        L9:
            r1 = 30
            if (r0 < r1) goto L19
            int r0 = c5.z.a()
            r1 = 2
            if (r0 < r1) goto L19
        L14:
            int r0 = D2.b.a()
            goto L1c
        L19:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L1c:
            if (r5 == 0) goto L30
            long r1 = r5.longValue()
            long r3 = (long) r0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L30
            long r0 = r5.longValue()
            int r5 = java.lang.Math.toIntExact(r0)
            return r5
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.q(mb.n):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 V8.b, still in use, count: 3, list:
          (r3v1 V8.b) from 0x0178: MOVE (r18v0 V8.b) = (r3v1 V8.b)
          (r3v1 V8.b) from 0x0116: MOVE (r18v2 V8.b) = (r3v1 V8.b)
          (r3v1 V8.b) from 0x00f2: MOVE (r18v4 V8.b) = (r3v1 V8.b)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final V8.C0350b r(Z8.i r21, com.mapbox.common.location.Location r22, java.util.ArrayList r23, M7.a r24) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.r(Z8.i, com.mapbox.common.location.Location, java.util.ArrayList, M7.a):V8.b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x02cd, code lost:
    
        if (r3 == null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v25, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final P7.b s(com.mapbox.navigation.base.route.g r38, com.mapbox.navigator.NavigationStatus r39, int r40, com.mapbox.api.directions.v5.models.BannerInstructions r41, java.lang.Integer r42, com.mapbox.api.directions.v5.models.VoiceInstructions r43, java.util.ArrayList r44, com.mapbox.navigation.base.route.a r45) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.s(com.mapbox.navigation.base.route.g, com.mapbox.navigator.NavigationStatus, int, com.mapbox.api.directions.v5.models.BannerInstructions, java.lang.Integer, com.mapbox.api.directions.v5.models.VoiceInstructions, java.util.ArrayList, com.mapbox.navigation.base.route.a):P7.b");
    }

    public static P1.c t(P1.d refHolder, SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(refHolder, "refHolder");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        P1.c cVar = refHolder.f5458a;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            if (Intrinsics.areEqual(cVar.f5457a, sqLiteDatabase)) {
                return cVar;
            }
        }
        P1.c cVar2 = new P1.c(sqLiteDatabase);
        refHolder.f5458a = cVar2;
        return cVar2;
    }

    public static Bc.i u(String statusLine) {
        int i3;
        String str;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        boolean O7 = StringsKt.O(statusLine, StubApp.getString2(8432));
        y yVar = y.f22485b;
        String string2 = StubApp.getString2(8433);
        if (O7) {
            i3 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException(Intrinsics.stringPlus(string2, statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException(Intrinsics.stringPlus(string2, statusLine));
                }
                yVar = y.f22486c;
            }
        } else {
            if (!StringsKt.O(statusLine, StubApp.getString2(8434))) {
                throw new ProtocolException(Intrinsics.stringPlus(string2, statusLine));
            }
            i3 = 4;
        }
        int i10 = i3 + 3;
        if (statusLine.length() < i10) {
            throw new ProtocolException(Intrinsics.stringPlus(string2, statusLine));
        }
        try {
            String substring = statusLine.substring(i3, i10);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (statusLine.length() <= i10) {
                str = "";
            } else {
                if (statusLine.charAt(i10) != ' ') {
                    throw new ProtocolException(Intrinsics.stringPlus(string2, statusLine));
                }
                str = statusLine.substring(i3 + 4);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
            }
            return new Bc.i(yVar, parseInt, str);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(Intrinsics.stringPlus(string2, statusLine));
        }
    }

    public static void v(Status status, Object obj, q4.k kVar) {
        if (status.f11170a <= 0) {
            kVar.b(obj);
        } else {
            kVar.a(status.f11172c != null ? new Q3.m(status) : new Q3.e(status));
        }
    }

    public static boolean w(View view, InterfaceC1750c interfaceC1750c) {
        if (view != null) {
            if (interfaceC1750c.b(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    if (w(viewGroup.getChildAt(i3), interfaceC1750c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final Object x(StylePropertyValue stylePropertyValue) {
        V6.c cVar;
        Intrinsics.checkNotNullParameter(stylePropertyValue, "<this>");
        Intrinsics.checkNotNullParameter(String.class, "clazz");
        int i3 = W6.c.f8169a[stylePropertyValue.getKind().ordinal()];
        String string2 = StubApp.getString2(8435);
        String string22 = StubApp.getString2(8436);
        if (i3 == 1) {
            Value value = stylePropertyValue.getValue();
            Intrinsics.checkNotNullExpressionValue(value, string22);
            Intrinsics.checkNotNullParameter(value, "<this>");
            Intrinsics.checkNotNullParameter(String.class, "clazz");
            Serializable y10 = y(value);
            if (String.class.isInstance(y10)) {
                return y10;
            }
            throw new UnsupportedOperationException(string2.concat(y10.getClass().getSimpleName()));
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new IllegalArgumentException(StubApp.getString2(8439));
                }
                throw new UnsupportedOperationException(StubApp.getString2(8437) + stylePropertyValue.getKind() + StubApp.getString2(8438));
            }
            Value value2 = stylePropertyValue.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, string22);
            N6.d z2 = z(value2);
            if (String.class.isInstance(z2)) {
                return z2;
            }
            throw new IllegalArgumentException(string2.concat(N6.d.class.getSimpleName()));
        }
        Value value3 = stylePropertyValue.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, string22);
        Intrinsics.checkNotNullParameter(value3, "<this>");
        Object contents = value3.getContents();
        boolean z10 = contents instanceof HashMap;
        String string23 = StubApp.getString2(8440);
        if (z10) {
            V6.b bVar = new V6.b(0, false);
            HashMap hashMap = (HashMap) contents;
            Value value4 = (Value) hashMap.get(StubApp.getString2(8278));
            if (value4 != null) {
                Object contents2 = value4.getContents();
                Intrinsics.checkNotNull(contents2, string23);
                Long l9 = (Long) contents2;
                l9.getClass();
                bVar.f7762c = l9;
            }
            Value value5 = (Value) hashMap.get(StubApp.getString2(2091));
            if (value5 != null) {
                Object contents3 = value5.getContents();
                Intrinsics.checkNotNull(contents3, string23);
                Long l10 = (Long) contents3;
                l10.getClass();
                bVar.f7761b = l10;
            }
            cVar = new V6.c(bVar);
        } else {
            if (!(contents instanceof List)) {
                throw new UnsupportedOperationException(StubApp.getString2(8441) + value3);
            }
            List list = (List) contents;
            V6.b bVar2 = new V6.b(0, false);
            Object contents4 = ((Value) list.get(0)).getContents();
            Intrinsics.checkNotNull(contents4, string23);
            Long l11 = (Long) contents4;
            l11.getClass();
            bVar2.f7761b = l11;
            Object contents5 = ((Value) list.get(1)).getContents();
            Intrinsics.checkNotNull(contents5, string23);
            Long l12 = (Long) contents5;
            l12.getClass();
            bVar2.f7762c = l12;
            cVar = new V6.c(bVar2);
        }
        if (String.class.isInstance(cVar)) {
            return cVar;
        }
        throw new IllegalArgumentException(string2.concat(V6.c.class.getSimpleName()));
    }

    public static final Serializable y(Value value) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        Object contents = value.getContents();
        if (!(contents instanceof Double) && !(contents instanceof Long) && !(contents instanceof Boolean) && !(contents instanceof String) && !(contents instanceof double[]) && !(contents instanceof long[]) && !(contents instanceof boolean[])) {
            if (contents instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) contents).iterator();
                while (it.hasNext()) {
                    arrayList.add(y((Value) it.next()));
                }
                return arrayList;
            }
            if (!(contents instanceof HashMap)) {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(8442));
                Object contents2 = value.getContents();
                sb2.append(contents2 != null ? contents2.getClass().getSimpleName() : null);
                throw new UnsupportedOperationException(sb2.toString());
            }
            HashMap hashMap = (HashMap) contents;
            HashMap hashMap2 = new HashMap();
            Set<String> keySet = hashMap.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "valueMap.keys");
            for (String key : keySet) {
                Value value2 = (Value) hashMap.get(key);
                if (value2 != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    Intrinsics.checkNotNullExpressionValue(value2, "value");
                    hashMap2.put(key, y(value2));
                }
            }
            return hashMap2;
        }
        return (Serializable) contents;
    }

    public static final N6.d z(Value value) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        Object contents = value.getContents();
        if (contents instanceof Double) {
            return new N6.d(((Number) contents).doubleValue());
        }
        if (contents instanceof Long) {
            return new N6.d(((Number) contents).longValue());
        }
        if (contents instanceof Boolean) {
            Boolean bool = (Boolean) contents;
            N6.d dVar = new N6.d(bool.booleanValue());
            dVar.f4930a = bool;
            return dVar;
        }
        boolean z2 = contents instanceof String;
        String string2 = StubApp.getString2(1061);
        if (z2) {
            String str = (String) contents;
            Intrinsics.checkNotNullParameter(str, string2);
            return new N6.d(str);
        }
        if (!(contents instanceof List)) {
            if (contents instanceof HashMap) {
                return new N6.d((HashMap) contents);
            }
            throw new UnsupportedOperationException(StubApp.getString2(8443) + value);
        }
        List list = (List) contents;
        Object contents2 = ((Value) CollectionsKt.first(list)).getContents();
        String str2 = contents2 instanceof String ? (String) contents2 : null;
        if (str2 == null) {
            return new N6.d(list);
        }
        if (Intrinsics.areEqual("literal", str2)) {
            Object contents3 = ((Value) CollectionsKt.last(list)).getContents();
            if (contents3 instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) contents3).iterator();
                while (it.hasNext()) {
                    arrayList.add(z((Value) it.next()));
                }
                N6.a aVar = new N6.a("literal");
                aVar.a(new N6.d(arrayList));
                return aVar.b();
            }
            if (contents3 instanceof HashMap) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((HashMap) contents3).entrySet()) {
                    hashMap.put((String) entry.getKey(), z((Value) entry.getValue()));
                }
                Intrinsics.checkNotNullParameter(hashMap, string2);
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    hashMap2.put((String) entry2.getKey(), AbstractC0378a.H(entry2.getValue()));
                }
                N6.a aVar2 = new N6.a("literal");
                aVar2.a(new N6.d(hashMap2));
                return aVar2.b();
            }
        } else if (Intrinsics.areEqual("image", str2)) {
            N6.b bVar = new N6.b("image");
            Iterator it2 = CollectionsKt.drop(list, 1).iterator();
            while (it2.hasNext()) {
                bVar.a(z((Value) it2.next()));
            }
            return bVar.b();
        }
        List drop = CollectionsKt.drop(list, 1);
        N6.a aVar3 = new N6.a(str2);
        Iterator it3 = drop.iterator();
        while (it3.hasNext()) {
            aVar3.a(z((Value) it3.next()));
        }
        return aVar3.b();
    }

    public abstract Typeface g(Context context, E.e eVar, Resources resources, int i3);

    public abstract Typeface h(Context context, K.j[] jVarArr, int i3);

    public Typeface i(Context context, List list, int i3) {
        throw new IllegalStateException(StubApp.getString2(8444));
    }

    public Typeface j(Context context, Resources resources, int i3, String str, int i10) {
        File r8 = android.support.v4.media.session.b.r(context);
        if (r8 == null) {
            return null;
        }
        try {
            if (android.support.v4.media.session.b.k(r8, resources, i3)) {
                return Typeface.createFromFile(r8.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            r8.delete();
        }
    }

    public K.j k(K.j[] jVarArr, int i3) {
        new I4.e(7);
        int i10 = (i3 & 1) == 0 ? 400 : 700;
        boolean z2 = (i3 & 2) != 0;
        K.j jVar = null;
        int i11 = IntCompanionObject.MAX_VALUE;
        for (K.j jVar2 : jVarArr) {
            int abs = (Math.abs(jVar2.f3566c - i10) * 2) + (jVar2.f3567d == z2 ? 0 : 1);
            if (jVar == null || i11 > abs) {
                jVar = jVar2;
                i11 = abs;
            }
        }
        return jVar;
    }
}
