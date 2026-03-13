package D5;

import H5.C0084q;
import H5.c0;
import Qb.C0;
import Qb.InterfaceC0221t0;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC0440o;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.C0616g;
import com.google.android.gms.internal.measurement.C0646m;
import com.google.android.gms.internal.measurement.C0656o;
import com.google.android.gms.internal.measurement.C0680t;
import com.google.android.gms.internal.measurement.C0708y2;
import com.google.android.gms.internal.measurement.CallableC0622h0;
import com.google.android.gms.internal.measurement.InterfaceC0651n;
import com.google.android.gms.internal.measurement.P3;
import com.google.android.gms.internal.measurement.r4;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import d0.AbstractComponentCallbacksC0789t;
import d0.P;
import d0.U;
import i0.AbstractC1030c;
import i0.C1031d;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import l4.AbstractC1148D;
import l4.C1164b0;
import l4.C1200n0;
import l4.E0;
import l4.T;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r0.C1553n;
import t.C1697j;
import t1.C1727a;
import u3.C1773b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B implements K5.b, V9.d, l7.t, q1.l {

    /* renamed from: e, reason: collision with root package name */
    public static B f1339e;

    /* renamed from: a, reason: collision with root package name */
    public Object f1340a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1341b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1342c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1343d;

    public B(C1164b0 c1164b0, String str) {
        Objects.requireNonNull(c1164b0);
        this.f1343d = c1164b0;
        S3.D.e(str);
        this.f1340a = str;
        this.f1341b = new Bundle();
    }

    public static synchronized B D() {
        B b2;
        synchronized (B.class) {
            try {
                if (f1339e == null) {
                    f1339e = new B(0);
                }
                b2 = f1339e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(D5.B r4, com.mapbox.api.directions.v5.models.VoiceInstructions r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof E9.c
            if (r0 == 0) goto L16
            r0 = r6
            E9.c r0 = (E9.c) r0
            int r1 = r0.f2060e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2060e = r1
            goto L1b
        L16:
            E9.c r0 = new E9.c
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f2058c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2060e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L30
            com.mapbox.api.directions.v5.models.VoiceInstructions r5 = r0.f2057b
            D5.B r4 = r0.f2056a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L51
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 275(0x113, float:3.85E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f2056a = r4
            r0.f2057b = r5
            r0.f2060e = r3
            java.lang.Object r6 = r4.f1343d
            l4.E0 r6 = (l4.E0) r6
            java.lang.Object r6 = r6.L(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            F9.i r6 = (F9.i) r6
            boolean r0 = r6 instanceof F9.h
            r1 = 1303(0x517, float:1.826E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            if (r0 == 0) goto L84
            java.lang.String r4 = r5.announcement()
            java.lang.String r5 = r5.ssmlAnnouncement()
            F9.d r0 = new F9.d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            F9.h r6 = (F9.h) r6
            java.io.File r6 = r6.f2343a
            F9.b r1 = new F9.b
            r1.<init>(r4, r5, r6)
            r0.<init>(r1)
            com.mapbox.bindgen.Expected r4 = com.mapbox.bindgen.ExpectedFactory.createValue(r0)
            java.lang.String r5 = "createValue(\n           …     ),\n                )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
        L84:
            boolean r0 = r6 instanceof F9.g
            if (r0 == 0) goto Ld5
            r4.getClass()
            java.lang.String r4 = "voiceInstructions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            java.lang.String r4 = r5.announcement()
            java.lang.String r0 = r5.ssmlAnnouncement()
            com.mapbox.bindgen.Expected r4 = a.AbstractC0378a.s(r4, r0)
            java.lang.Object r4 = r4.getError()
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 != 0) goto Lcb
            java.lang.String r4 = r5.announcement()
            java.lang.String r5 = r5.ssmlAnnouncement()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            F9.b r0 = new F9.b
            r1 = 0
            r0.<init>(r4, r5, r1)
            F9.c r4 = new F9.c
            F9.g r6 = (F9.g) r6
            java.lang.String r5 = r6.f2342a
            r4.<init>(r5, r0)
            com.mapbox.bindgen.Expected r4 = com.mapbox.bindgen.ExpectedFactory.createError(r4)
            java.lang.String r5 = "createError(speechError)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
        Lcb:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
        Ld5:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.B.s(D5.B, com.mapbox.api.directions.v5.models.VoiceInstructions, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public ArrayList A() {
        ArrayList arrayList = new ArrayList();
        for (U u2 : ((HashMap) this.f1341b).values()) {
            if (u2 != null) {
                arrayList.add(u2);
            }
        }
        return arrayList;
    }

    public ArrayList B() {
        ArrayList arrayList = new ArrayList();
        for (U u2 : ((HashMap) this.f1341b).values()) {
            if (u2 != null) {
                arrayList.add(u2.f13216c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List C() {
        ArrayList arrayList;
        if (((ArrayList) this.f1340a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1340a)) {
            arrayList = new ArrayList((ArrayList) this.f1340a);
        }
        return arrayList;
    }

    public S E(KClass modelClass, String key) {
        S viewModel;
        S b2;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (((c5.C) this.f1343d)) {
            try {
                V v2 = (V) this.f1340a;
                v2.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                viewModel = (S) v2.f9900a.get(key);
                if (modelClass.isInstance(viewModel)) {
                    androidx.lifecycle.U u2 = (androidx.lifecycle.U) this.f1341b;
                    if (u2 instanceof androidx.lifecycle.O) {
                        androidx.lifecycle.O o5 = (androidx.lifecycle.O) u2;
                        Intrinsics.checkNotNull(viewModel);
                        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                        AbstractC0440o abstractC0440o = o5.f9892d;
                        if (abstractC0440o != null) {
                            E0 e02 = o5.f9893e;
                            Intrinsics.checkNotNull(e02);
                            Intrinsics.checkNotNull(abstractC0440o);
                            androidx.lifecycle.L.a(viewModel, e02, abstractC0440o);
                        }
                    }
                    Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    C1031d extras = new C1031d((AbstractC1030c) this.f1342c);
                    extras.b(androidx.lifecycle.L.f9883d, key);
                    androidx.lifecycle.U factory = (androidx.lifecycle.U) this.f1341b;
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    Intrinsics.checkNotNullParameter(extras, "extras");
                    try {
                        try {
                            b2 = factory.n(modelClass, extras);
                        } catch (AbstractMethodError unused) {
                            b2 = factory.f(JvmClassMappingKt.getJavaClass(modelClass), extras);
                        }
                    } catch (AbstractMethodError unused2) {
                        b2 = factory.b(JvmClassMappingKt.getJavaClass(modelClass));
                    }
                    viewModel = b2;
                    V v8 = (V) this.f1340a;
                    v8.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                    S s10 = (S) v8.f9900a.put(key, viewModel);
                    if (s10 != null) {
                        s10.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewModel;
    }

    public boolean F(Context context) {
        if (((Boolean) this.f1342c) == null) {
            this.f1342c = Boolean.valueOf(context.checkCallingOrSelfPermission(StubApp.getString2(1007)) == 0);
        }
        if (!((Boolean) this.f1341b).booleanValue()) {
            String string2 = StubApp.getString2(493);
            if (Log.isLoggable(string2, 3)) {
                Log.d(string2, StubApp.getString2(1304));
            }
        }
        return ((Boolean) this.f1342c).booleanValue();
    }

    public boolean G(Context context) {
        if (((Boolean) this.f1341b) == null) {
            this.f1341b = Boolean.valueOf(context.checkCallingOrSelfPermission(StubApp.getString2(1305)) == 0);
        }
        if (!((Boolean) this.f1341b).booleanValue()) {
            String string2 = StubApp.getString2(493);
            if (Log.isLoggable(string2, 3)) {
                Log.d(string2, StubApp.getString2(1306));
            }
        }
        return ((Boolean) this.f1341b).booleanValue();
    }

    public void H() {
        synchronized (this.f1343d) {
            while (((PriorityQueue) this.f1341b).size() + ((PriorityQueue) this.f1340a).size() >= 120 && !((PriorityQueue) this.f1340a).isEmpty()) {
                try {
                    ((C1773b) ((PriorityQueue) this.f1340a).poll()).f21434b.recycle();
                } catch (Throwable th) {
                    throw th;
                }
            }
            while (((PriorityQueue) this.f1341b).size() + ((PriorityQueue) this.f1340a).size() >= 120 && !((PriorityQueue) this.f1341b).isEmpty()) {
                ((C1773b) ((PriorityQueue) this.f1341b).poll()).f21434b.recycle();
            }
        }
    }

    public void I(U u2) {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = u2.f13216c;
        String str = abstractComponentCallbacksC0789t.f13368e;
        HashMap hashMap = (HashMap) this.f1341b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0789t.f13368e, u2);
        if (d0.M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(1307) + abstractComponentCallbacksC0789t);
        }
    }

    public void J(U u2) {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = u2.f13216c;
        if (abstractComponentCallbacksC0789t.f13350E) {
            ((P) this.f1343d).f(abstractComponentCallbacksC0789t);
        }
        HashMap hashMap = (HashMap) this.f1341b;
        if (hashMap.get(abstractComponentCallbacksC0789t.f13368e) == u2 && ((U) hashMap.put(abstractComponentCallbacksC0789t.f13368e, null)) != null && d0.M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(1308) + abstractComponentCallbacksC0789t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #1 {all -> 0x0082, blocks: (B:25:0x006e, B:27:0x007a, B:30:0x0086), top: B:24:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x0082, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0082, blocks: (B:25:0x006e, B:27:0x007a, B:30:0x0086), top: B:24:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [Zb.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof T.W
            if (r0 == 0) goto L13
            r0 = r7
            T.W r0 = (T.W) r0
            int r1 = r0.f6819e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6819e = r1
            goto L18
        L13:
            T.W r0 = new T.W
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f6817c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6819e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L41
            if (r2 != r3) goto L34
            Zb.a r1 = r0.f6816b
            D5.B r0 = r0.f6815a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L31
            goto L95
        L31:
            r7 = move-exception
            goto La4
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r7.<init>(r0)
            throw r7
        L41:
            Zb.a r2 = r0.f6816b
            D5.B r4 = r0.f6815a
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r2
            goto L6e
        L4a:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f1341b
            Qb.q r7 = (Qb.C0215q) r7
            java.lang.Object r7 = r7.E()
            boolean r7 = r7 instanceof Qb.InterfaceC0212o0
            if (r7 != 0) goto L5c
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L5c:
            r0.f6815a = r6
            java.lang.Object r7 = r6.f1340a
            Zb.e r7 = (Zb.e) r7
            r0.f6816b = r7
            r0.f6819e = r4
            java.lang.Object r2 = r7.e(r0)
            if (r2 != r1) goto L6d
            goto L92
        L6d:
            r4 = r6
        L6e:
            java.lang.Object r2 = r4.f1341b     // Catch: java.lang.Throwable -> L82
            Qb.q r2 = (Qb.C0215q) r2     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = r2.E()     // Catch: java.lang.Throwable -> L82
            boolean r2 = r2 instanceof Qb.InterfaceC0212o0     // Catch: java.lang.Throwable -> L82
            if (r2 != 0) goto L86
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L82
            Zb.e r7 = (Zb.e) r7
            r7.g(r5)
            return r0
        L82:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto La4
        L86:
            r0.f6815a = r4     // Catch: java.lang.Throwable -> L82
            r0.f6816b = r7     // Catch: java.lang.Throwable -> L82
            r0.f6819e = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = r4.x(r0)     // Catch: java.lang.Throwable -> L82
            if (r0 != r1) goto L93
        L92:
            return r1
        L93:
            r1 = r7
            r0 = r4
        L95:
            java.lang.Object r7 = r0.f1341b     // Catch: java.lang.Throwable -> L31
            Qb.q r7 = (Qb.C0215q) r7     // Catch: java.lang.Throwable -> L31
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L31
            r7.L(r0)     // Catch: java.lang.Throwable -> L31
            Zb.e r1 = (Zb.e) r1
            r1.g(r5)
            return r0
        La4:
            Zb.e r1 = (Zb.e) r1
            r1.g(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.B.K(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public Bundle L(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f1342c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public Bundle M() {
        char c10;
        if (((Bundle) this.f1342c) == null) {
            C1164b0 c1164b0 = (C1164b0) this.f1343d;
            SharedPreferences o5 = c1164b0.o();
            C1200n0 c1200n0 = (C1200n0) c1164b0.f4728a;
            String string = o5.getString((String) this.f1340a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i3);
                            String string2 = jSONObject.getString(StubApp.getString2("1309"));
                            String string3 = jSONObject.getString(StubApp.getString2("1310"));
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals(StubApp.getString2(1315))) {
                                    c10 = 1;
                                }
                                c10 = 65535;
                            } else if (hashCode == 108) {
                                if (string3.equals(StubApp.getString2(1314))) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            } else if (hashCode == 115) {
                                if (string3.equals(StubApp.getString2(1313))) {
                                    c10 = 0;
                                }
                                c10 = 65535;
                            } else if (hashCode != 3352) {
                                if (hashCode == 3445 && string3.equals(StubApp.getString2(1311))) {
                                    c10 = 4;
                                }
                                c10 = 65535;
                            } else {
                                if (string3.equals(StubApp.getString2(1312))) {
                                    c10 = 3;
                                }
                                c10 = 65535;
                            }
                            String string22 = StubApp.getString2(1316);
                            if (c10 == 0) {
                                bundle.putString(string2, jSONObject.getString(string22));
                            } else if (c10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(string22)));
                            } else if (c10 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString(string22)));
                            } else if (c10 == 3) {
                                P3.a();
                                if (c1200n0.f16539d.u(null, AbstractC1148D.f15955Q0)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString(string22));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i10 = 0; i10 < length; i10++) {
                                        iArr[i10] = jSONArray2.optInt(i10);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (c10 != 4) {
                                T t3 = c1200n0.f16541f;
                                C1200n0.l(t3);
                                t3.f16242f.c(string3, StubApp.getString2("1317"));
                            } else {
                                P3.a();
                                if (c1200n0.f16539d.u(null, AbstractC1148D.f15955Q0)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString(string22));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i11 = 0; i11 < length2; i11++) {
                                        jArr[i11] = jSONArray3.optLong(i11);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            T t10 = c1200n0.f16541f;
                            C1200n0.l(t10);
                            t10.f16242f.b(StubApp.getString2("1318"));
                        }
                    }
                    this.f1342c = bundle;
                } catch (JSONException unused2) {
                    T t11 = c1200n0.f16541f;
                    C1200n0.l(t11);
                    t11.f16242f.b(StubApp.getString2(1319));
                }
            }
            if (((Bundle) this.f1342c) == null) {
                this.f1342c = (Bundle) this.f1341b;
            }
        }
        Bundle bundle2 = (Bundle) this.f1342c;
        S3.D.h(bundle2);
        return new Bundle(bundle2);
    }

    public InterfaceC0651n N(p2.h hVar, A1... a1Arr) {
        InterfaceC0651n interfaceC0651n = InterfaceC0651n.f11619U;
        for (A1 a1 : a1Arr) {
            interfaceC0651n = android.support.v4.media.session.b.J(a1);
            a4.f.a0((p2.h) this.f1342c);
            if ((interfaceC0651n instanceof C0656o) || (interfaceC0651n instanceof C0646m)) {
                interfaceC0651n = ((C0680t) this.f1340a).c(hVar, interfaceC0651n);
            }
        }
        return interfaceC0651n;
    }

    public void O(Bundle bundle) {
        Iterator<String> it;
        JSONObject jSONObject;
        boolean u2;
        String string2;
        String string22;
        String string23;
        String string24;
        String string25;
        T t3;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C1164b0 c1164b0 = (C1164b0) this.f1343d;
        SharedPreferences o5 = c1164b0.o();
        C1200n0 c1200n0 = (C1200n0) c1164b0.f4728a;
        SharedPreferences.Editor edit = o5.edit();
        int size = bundle2.size();
        String str = (String) this.f1340a;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Object obj = bundle2.get(next);
                if (obj != null) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put(StubApp.getString2("1309"), next);
                        P3.a();
                        u2 = c1200n0.f16539d.u(null, AbstractC1148D.f15955Q0);
                        string2 = StubApp.getString2(1315);
                        string22 = StubApp.getString2(1314);
                        string23 = StubApp.getString2(1313);
                        string24 = StubApp.getString2(1316);
                        string25 = StubApp.getString2(1310);
                        t3 = c1200n0.f16541f;
                    } catch (JSONException e10) {
                        e = e10;
                        it = it2;
                    }
                    if (u2) {
                        it = it2;
                        try {
                        } catch (JSONException e11) {
                            e = e11;
                            T t10 = c1200n0.f16541f;
                            C1200n0.l(t10);
                            t10.f16242f.c(e, StubApp.getString2(1320));
                            it2 = it;
                        }
                        if (obj instanceof String) {
                            jSONObject.put(string24, obj.toString());
                            jSONObject.put(string25, string23);
                        } else if (obj instanceof Long) {
                            jSONObject.put(string24, obj.toString());
                            jSONObject.put(string25, string22);
                        } else if (obj instanceof int[]) {
                            jSONObject.put(string24, Arrays.toString((int[]) obj));
                            jSONObject.put(string25, StubApp.getString2("1312"));
                        } else if (obj instanceof long[]) {
                            jSONObject.put(string24, Arrays.toString((long[]) obj));
                            jSONObject.put(string25, StubApp.getString2("1311"));
                        } else if (obj instanceof Double) {
                            jSONObject.put(string24, obj.toString());
                            jSONObject.put(string25, string2);
                        } else {
                            C1200n0.l(t3);
                            t3.f16242f.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                        it2 = it;
                    } else {
                        it = it2;
                        jSONObject.put(string24, obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put(string25, string23);
                        } else if (obj instanceof Long) {
                            jSONObject.put(string25, string22);
                        } else if (obj instanceof Double) {
                            jSONObject.put(string25, string2);
                        } else {
                            C1200n0.l(t3);
                            t3.f16242f.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                        it2 = it;
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f1342c = bundle2;
    }

    @Override // l7.t
    public void a(int i3, int i10) {
        float[] l9 = Oc.a.l(i3);
        float[] l10 = Oc.a.l(i10);
        ArrayList expression = Oc.a.g(l9);
        ArrayList expression2 = Oc.a.g(l10);
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(expression, "expression");
        sVar.e(StubApp.getString2(1321), new Value((List<Value>) expression));
        Intrinsics.checkNotNullParameter(expression2, "expression");
        sVar.e(StubApp.getString2(1322), new Value((List<Value>) expression2));
    }

    @Override // l7.t
    public void b(Value topImageSizeExpression) {
        Intrinsics.checkNotNullParameter(topImageSizeExpression, "scaleExpression");
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(topImageSizeExpression, "shadowImageSizeExpression");
        sVar.e(StubApp.getString2(1323), topImageSizeExpression);
        Intrinsics.checkNotNullParameter(topImageSizeExpression, "bearingImageSizeExpression");
        sVar.e(StubApp.getString2(1324), topImageSizeExpression);
        Intrinsics.checkNotNullParameter(topImageSizeExpression, "topImageSizeExpression");
        sVar.e(StubApp.getString2(1325), topImageSizeExpression);
    }

    @Override // l7.t
    public boolean c() {
        MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) this.f1343d;
        if (mapboxStyleManager != null) {
            return mapboxStyleManager.styleLayerExists(StubApp.getString2(1326));
        }
        return false;
    }

    @Override // V9.d
    public void d(Serializable serializable) {
        this.f1341b = serializable;
    }

    @Override // l7.t
    public void e(int i3, float f10, Float f11) {
        float[] l9 = Oc.a.l(i3);
        l9[3] = f11.floatValue();
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        sVar.e(StubApp.getString2(1327), new Value(f10));
        ArrayList emphasisCircleColorExpression = Oc.a.g(l9);
        Intrinsics.checkNotNullParameter(emphasisCircleColorExpression, "emphasisCircleColorExpression");
        sVar.e(StubApp.getString2(1328), new Value((List<Value>) emphasisCircleColorExpression));
    }

    @Override // l7.t
    public void f(double d8) {
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        sVar.e(StubApp.getString2(1329), new Value(d8));
    }

    @Override // Pb.a
    public Object get() {
        return new C0084q((R4.h) ((K5.c) this.f1340a).f3721a, (L5.j) ((Pb.a) this.f1341b).get(), (CoroutineContext) ((K5.c) this.f1342c).f3721a, (c0) ((Pb.a) this.f1343d).get());
    }

    @Override // l7.t
    public void h(MapboxMap style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f1343d = style;
        X6.d dVar = (X6.d) this.f1340a;
        ImageHolder imageHolder = dVar.f8424a;
        String topImage = StubApp.getString2(1330);
        u(style, topImage, imageHolder);
        ImageHolder imageHolder2 = dVar.f8425b;
        String bearingImage = StubApp.getString2(1331);
        u(style, bearingImage, imageHolder2);
        ImageHolder imageHolder3 = dVar.f8426c;
        String shadowImage = StubApp.getString2(1332);
        u(style, shadowImage, imageHolder3);
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(topImage, "topImage");
        sVar.e(StubApp.getString2(1333), new Value(topImage));
        Intrinsics.checkNotNullParameter(bearingImage, "bearingImage");
        sVar.e(StubApp.getString2(1334), new Value(bearingImage));
        Intrinsics.checkNotNullParameter(shadowImage, "shadowImage");
        sVar.e(StubApp.getString2(1335), new Value(shadowImage));
        sVar.e(StubApp.getString2(1336), new Value(dVar.f8428e));
    }

    @Override // l7.t
    public void hide() {
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        sVar.e(StubApp.getString2(1338), new Value(StubApp.getString2(1337)));
    }

    @Override // l7.t
    public void i(Point latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        List location = CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(latLng.latitude()), Double.valueOf(latLng.longitude()), Double.valueOf(0.0d)});
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList arrayList = new ArrayList(CollectionsKt.f(location));
        Iterator it = location.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((Number) it.next()).doubleValue()));
        }
        sVar.e("location", new Value((List<Value>) arrayList));
    }

    @Override // l7.t
    public void j(String str) {
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        if (str == null) {
            str = "";
        }
        sVar.e(StubApp.getString2(1339), new Value(str));
    }

    @Override // l7.t
    public void k() {
        MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) this.f1343d;
        if (mapboxStyleManager != null) {
            mapboxStyleManager.removeStyleLayer((String) ((l7.s) this.f1342c).f3392a);
        }
    }

    @Override // l7.t
    public void l(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f1343d = style;
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(style, "style");
        sVar.f3394c = style;
    }

    @Override // V9.d
    public void m(String str, HashMap hashMap) {
        this.f1340a = StubApp.getString2(1340);
        this.f1342c = str;
        this.f1343d = hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        r8.F(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        r9.reset();
        r6.E(r8.f20178c, r8.f20176a);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    @Override // q1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(byte[] r39, int r40, int r41, q1.k r42, r0.InterfaceC1542c r43) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.B.n(byte[], int, int, q1.k, r0.c):void");
    }

    @Override // l7.t
    public void o() {
        MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) this.f1343d;
        if (mapboxStyleManager != null) {
            mapboxStyleManager.removeStyleImage(StubApp.getString2(1330));
        }
        MapboxStyleManager mapboxStyleManager2 = (MapboxStyleManager) this.f1343d;
        if (mapboxStyleManager2 != null) {
            mapboxStyleManager2.removeStyleImage(StubApp.getString2(1331));
        }
        MapboxStyleManager mapboxStyleManager3 = (MapboxStyleManager) this.f1343d;
        if (mapboxStyleManager3 != null) {
            mapboxStyleManager3.removeStyleImage(StubApp.getString2(1332));
        }
    }

    @Override // q1.l
    public int p() {
        return 2;
    }

    @Override // l7.t
    public void q(float f10) {
        double d8 = f10;
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        sVar.e(StubApp.getString2(1341), new Value(d8));
    }

    @Override // l7.t
    public void r(a5.c positionManager) {
        Intrinsics.checkNotNullParameter(positionManager, "positionManager");
        positionManager.f((l7.s) this.f1342c);
    }

    @Override // l7.t
    public void show() {
        l7.s sVar = (l7.s) this.f1342c;
        sVar.getClass();
        sVar.e(StubApp.getString2(1338), new Value(StubApp.getString2(1342)));
    }

    public void t(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        if (((ArrayList) this.f1340a).contains(abstractComponentCallbacksC0789t)) {
            throw new IllegalStateException(StubApp.getString2(1343) + abstractComponentCallbacksC0789t);
        }
        synchronized (((ArrayList) this.f1340a)) {
            ((ArrayList) this.f1340a).add(abstractComponentCallbacksC0789t);
        }
        abstractComponentCallbacksC0789t.f13374l = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(com.mapbox.maps.MapboxMap r8, java.lang.String r9, com.mapbox.maps.ImageHolder r10) {
        /*
            r7 = this;
            if (r10 == 0) goto Lc
            android.graphics.Bitmap r0 = r10.getBitmap()
            if (r0 == 0) goto Lc
            r8.addImage(r9, r0)
            return
        Lc:
            java.lang.Object r0 = r7.f1341b
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 1344(0x540, float:1.883E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            if (r0 == 0) goto La8
            if (r10 == 0) goto L8a
            java.lang.Integer r10 = r10.getDrawableId()
            if (r10 == 0) goto L8a
            int r10 = r10.intValue()
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            android.graphics.drawable.Drawable r10 = com.google.android.gms.internal.measurement.D1.m(r0, r10)
            r0 = 0
            if (r10 != 0) goto L39
        L37:
            r10 = r0
            goto L80
        L39:
            boolean r2 = r10 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L44
            android.graphics.drawable.BitmapDrawable r10 = (android.graphics.drawable.BitmapDrawable) r10
            android.graphics.Bitmap r10 = r10.getBitmap()
            goto L80
        L44:
            android.graphics.drawable.Drawable$ConstantState r10 = r10.getConstantState()
            if (r10 != 0) goto L4b
            goto L37
        L4b:
            android.graphics.drawable.Drawable r10 = r10.newDrawable()
            android.graphics.drawable.Drawable r10 = r10.mutate()
            java.lang.String r2 = "constantState.newDrawable().mutate()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            int r2 = r10.getIntrinsicWidth()
            int r3 = r10.getIntrinsicHeight()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            java.lang.String r3 = "createBitmap(\n        dr….Config.ARGB_8888\n      )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            r6 = 0
            r10.setBounds(r6, r6, r4, r5)
            r10.draw(r3)
            r10 = r2
        L80:
            if (r10 == 0) goto L86
            com.mapbox.bindgen.Expected r0 = r8.addImage(r9, r10)
        L86:
            if (r0 != 0) goto L89
            goto L8a
        L89:
            return
        L8a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r10 = 1345(0x541, float:1.885E-42)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            r8.<init>(r10)
            r8.append(r9)
            r9 = 33
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.mapbox.maps.MapboxLogger.logE(r1, r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return
        La8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r10 = 1346(0x542, float:1.886E-42)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            r8.<init>(r10)
            r8.append(r9)
            r9 = 1347(0x543, float:1.888E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.mapbox.maps.MapboxLogger.logE(r1, r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.B.u(com.mapbox.maps.MapboxMap, java.lang.String, com.mapbox.maps.ImageHolder):void");
    }

    public void v() {
        Iterator it = SequencesKt.sequence(new C0(((D9.f) ((Lazy) this.f1341b).getValue()).f1512a, null)).iterator();
        while (it.hasNext()) {
            ((InterfaceC0221t0) it.next()).d(null);
        }
        Qb.L.e(((D9.f) ((Lazy) ((Z9.C) ((E0) this.f1343d).f16038c).f9078c).getValue()).f1512a);
    }

    public void w(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException(StubApp.getString2(1348));
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C1697j) this.f1341b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                w(arrayList2.get(i3), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof T.C0295k
            if (r0 == 0) goto L13
            r0 = r7
            T.k r0 = (T.C0295k) r0
            int r1 = r0.f6867d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6867d = r1
            goto L18
        L13:
            T.k r0 = new T.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f6865b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6867d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L2e
            D5.B r0 = r0.f6864a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r7.<init>(r0)
            throw r7
        L3b:
            D5.B r0 = r0.f6864a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L7e
        L41:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f1342c
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f1343d
            T.Q r2 = (T.Q) r2
            if (r7 == 0) goto L71
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L58
            goto L71
        L58:
            T.d0 r7 = r2.g()
            T.n r4 = new T.n
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f6864a = r6
            r0.f6867d = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L6d
            goto L7c
        L6d:
            r0 = r6
        L6e:
            T.d r7 = (T.C0288d) r7
            goto L80
        L71:
            r0.f6864a = r6
            r0.f6867d = r4
            r7 = 0
            java.lang.Object r7 = T.Q.f(r2, r7, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r0 = r6
        L7e:
            T.d r7 = (T.C0288d) r7
        L80:
            java.lang.Object r0 = r0.f1343d
            T.Q r0 = (T.Q) r0
            Z9.q r0 = r0.f6805h
            r0.K(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.B.x(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public AbstractComponentCallbacksC0789t y(String str) {
        U u2 = (U) ((HashMap) this.f1341b).get(str);
        if (u2 != null) {
            return u2.f13216c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0789t z(String str) {
        for (U u2 : ((HashMap) this.f1341b).values()) {
            if (u2 != null) {
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = u2.f13216c;
                if (!str.equals(abstractComponentCallbacksC0789t.f13368e)) {
                    abstractComponentCallbacksC0789t = abstractComponentCallbacksC0789t.f13386x.f13160c.z(str);
                }
                if (abstractComponentCallbacksC0789t != null) {
                    return abstractComponentCallbacksC0789t;
                }
            }
        }
        return null;
    }

    public B(V store, androidx.lifecycle.U factory, AbstractC1030c defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.f1340a = store;
        this.f1341b = factory;
        this.f1342c = defaultExtras;
        this.f1343d = new c5.C(7);
    }

    public B(int i3) {
        switch (i3) {
            case 1:
                this.f1340a = new M.b(10);
                this.f1341b = new C1697j(0);
                this.f1342c = new ArrayList();
                this.f1343d = new HashSet();
                break;
            case 7:
                C0680t c0680t = new C0680t(0);
                this.f1340a = c0680t;
                p2.h hVar = new p2.h((p2.h) null, c0680t);
                this.f1342c = hVar;
                this.f1341b = hVar.m();
                C0708y2 c0708y2 = new C0708y2(1);
                this.f1343d = c0708y2;
                hVar.o(StubApp.getString2(1300), new r4(c0708y2));
                ((HashMap) c0708y2.f11771a).put(StubApp.getString2(1301), CallableC0622h0.f11578a);
                hVar.o(StubApp.getString2(1302), new C0616g(Double.valueOf(0.0d)));
                break;
            case 8:
                this.f1340a = new ArrayList();
                this.f1341b = new HashMap();
                this.f1342c = new HashMap();
                break;
            case 12:
                this.f1343d = new Object();
                A.i iVar = new A.i(9);
                this.f1341b = new PriorityQueue(120, iVar);
                this.f1340a = new PriorityQueue(120, iVar);
                this.f1342c = new ArrayList();
                break;
            case 13:
                this.f1340a = new C1553n();
                this.f1341b = new C1553n();
                this.f1342c = new C1727a();
                break;
            default:
                this.f1340a = null;
                this.f1341b = null;
                this.f1342c = null;
                this.f1343d = new ArrayDeque();
                break;
        }
    }
}
