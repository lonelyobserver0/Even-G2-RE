package V6;

import C2.d;
import J1.v;
import Qb.C0203k;
import R3.C0241j;
import R3.n;
import Xa.x;
import Z9.C0366a;
import a0.C0379a;
import a0.C0380b;
import a0.C0388j;
import a4.f;
import aa.C0398e;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.K;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.o0;
import androidx.work.impl.WorkDatabase_Impl;
import b3.C0498N;
import ba.C0533a;
import c5.B;
import c5.l;
import c5.u;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.gson.Gson;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.HttpResponseData;
import com.mapbox.common.UploadOptions;
import com.mapbox.navigation.base.route.j;
import com.mapbox.navigation.copilot.work.HistoryUploadWorker;
import com.mapbox.navigator.RefreshRouteCallback;
import com.stub.StubApp;
import d0.AbstractComponentCallbacksC0789t;
import d5.C0805e;
import ea.C0855b;
import ea.C0857d;
import f4.C0878b;
import f4.p;
import gb.C0978g;
import h6.C1009a;
import i.AbstractActivityC1027h;
import i2.o;
import i2.q;
import i2.s;
import i2.t;
import i4.C1055s;
import i5.C1057a;
import i5.C1059c;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k5.C1107b;
import kc.C1129f;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l4.C1179g0;
import l6.C1226a;
import l6.C1227b;
import l6.C1228c;
import org.bouncycastle.asn1.x509.DisplayText;
import org.json.JSONObject;
import q4.g;
import q4.i;
import q4.k;
import r2.C1564b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements x, RefreshRouteCallback, j, i, n, g, t, Expected.Action {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7760a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7761b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7762c;

    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        this.f7760a = i3;
        this.f7761b = obj;
        this.f7762c = obj2;
    }

    public static int E(int i3, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            i11++;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = 1;
            }
        }
        return i11 + 1 > i10 ? i12 + 1 : i12;
    }

    public static ArrayList e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() - 1;
        for (int i3 = 1; i3 < size; i3++) {
            C0855b c0855b = (C0855b) arrayList.get(i3);
            int i10 = c0855b.f13673c;
            if (i10 == 5) {
                arrayList2.add(Float.valueOf(Float.parseFloat(c0855b.f13671a)));
            } else {
                if (i10 != 6) {
                    throw new IOException(StubApp.getString2(6512) + c0855b + StubApp.getString2(6513) + i3);
                }
                arrayList2.add(Integer.valueOf(c0855b.a()));
            }
        }
        return arrayList2;
    }

    public static byte[] h(byte[] bArr, int i3, int i10) {
        if (i10 == -1) {
            return bArr;
        }
        if (bArr.length == 0 || i10 > bArr.length) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length - i10];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int i12 = bArr[i11] & 255;
            int i13 = (i3 >> 8) ^ i12;
            if (i11 >= i10) {
                bArr2[i11 - i10] = (byte) i13;
            }
            i3 = 65535 & (((i12 + i3) * 52845) + 22719);
        }
        return bArr2;
    }

    public View A(int i3, int i10, int i11, int i12) {
        View u2;
        K k3 = (K) this.f7761b;
        int d8 = k3.d();
        int c10 = k3.c();
        int i13 = i10 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i10) {
            switch (k3.f10017a) {
                case 0:
                    u2 = ((M) k3.f10018b).u(i3);
                    break;
                default:
                    u2 = ((M) k3.f10018b).u(i3);
                    break;
            }
            int b2 = k3.b(u2);
            int a3 = k3.a(u2);
            o0 o0Var = (o0) this.f7762c;
            o0Var.f10264c = d8;
            o0Var.f10265d = c10;
            o0Var.f10266e = b2;
            o0Var.f10267f = a3;
            if (i11 != 0) {
                o0Var.f10263b = i11;
                if (o0Var.a()) {
                    return u2;
                }
            }
            if (i12 != 0) {
                o0Var.f10263b = i12;
                if (o0Var.a()) {
                    view = u2;
                }
            }
            i3 += i13;
        }
        return view;
    }

    public int B(int i3) {
        return ((int[]) this.f7762c)[(r0.length - 1) - i3];
    }

    public int C() {
        return ((int[]) this.f7762c).length - 1;
    }

    public Long D(String str) {
        v e10 = v.e(1, StubApp.getString2(6514));
        e10.g(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7761b;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            Long l9 = null;
            if (u2.moveToFirst() && !u2.isNull(0)) {
                l9 = Long.valueOf(u2.getLong(0));
            }
            return l9;
        } finally {
            u2.close();
            e10.h();
        }
    }

    public ArrayList F(String str) {
        v e10 = v.e(1, StubApp.getString2(6515));
        if (str == null) {
            e10.x(1);
        } else {
            e10.g(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7761b;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            ArrayList arrayList = new ArrayList(u2.getCount());
            while (u2.moveToNext()) {
                arrayList.add(u2.getString(0));
            }
            return arrayList;
        } finally {
            u2.close();
            e10.h();
        }
    }

    public void G(C1564b c1564b) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7761b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((Q2.c) this.f7762c).g(c1564b);
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public void H() {
        ((SparseIntArray) this.f7761b).clear();
    }

    public boolean I(View view) {
        K k3 = (K) this.f7761b;
        int d8 = k3.d();
        int c10 = k3.c();
        int b2 = k3.b(view);
        int a3 = k3.a(view);
        o0 o0Var = (o0) this.f7762c;
        o0Var.f10264c = d8;
        o0Var.f10265d = c10;
        o0Var.f10266e = b2;
        o0Var.f10267f = a3;
        o0Var.f10263b = 24579;
        return o0Var.a();
    }

    public boolean J() {
        return ((int[]) this.f7762c)[0] == 0;
    }

    public b K(int i3) {
        C1009a c1009a = (C1009a) this.f7761b;
        if (i3 == 0) {
            return c1009a.f14467c;
        }
        if (i3 == 1) {
            return this;
        }
        int[] iArr = (int[]) this.f7762c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = c1009a.c(iArr[i10], i3);
        }
        return new b(c1009a, iArr2);
    }

    public b L(b bVar) {
        C1009a c1009a = (C1009a) bVar.f7761b;
        C1009a c1009a2 = (C1009a) this.f7761b;
        if (!c1009a2.equals(c1009a)) {
            throw new IllegalArgumentException(StubApp.getString2(6516));
        }
        if (J() || bVar.J()) {
            return c1009a2.f14467c;
        }
        int[] iArr = (int[]) this.f7762c;
        int length = iArr.length;
        int[] iArr2 = (int[]) bVar.f7762c;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i3 = 0; i3 < length; i3++) {
            int i10 = iArr[i3];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = i3 + i11;
                iArr3[i12] = c1009a2.a(iArr3[i12], c1009a2.c(i10, iArr2[i11]));
            }
        }
        return new b(c1009a2, iArr3);
    }

    public void M(int i3, Bundle bundle) {
        Locale locale = Locale.US;
        String str = StubApp.getString2(6517) + i3 + StubApp.getString2(6518) + bundle;
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 2)) {
            Log.v(string2, str, null);
        }
        String string = bundle.getString(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        if (string != null) {
            Bundle bundle2 = bundle.getBundle(StubApp.getString2(6368));
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            a5.b bVar = StubApp.getString2(56).equals(bundle2.getString(StubApp.getString2(6519))) ? (a5.c) this.f7761b : (C0366a) this.f7762c;
            if (bVar == null) {
                return;
            }
            bVar.y(string, bundle2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ea.C0857d N(byte[] r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.b.N(byte[], byte[]):ea.d");
    }

    public void O(byte[] bArr) {
        String string2;
        String string22;
        C0855b c0855b;
        if (bArr.length == 0) {
            throw new IOException(StubApp.getString2(6582));
        }
        if (bArr.length < 2 || !(bArr[0] == 37 || bArr[1] == 33)) {
            throw new IOException(StubApp.getString2(6581));
        }
        Bc.i iVar = new Bc.i(bArr);
        this.f7761b = iVar;
        String str = ((C0855b) iVar.f768d).f13671a;
        String string23 = StubApp.getString2(6552);
        if (string23.equals(str)) {
            Q(3, string23);
            P(4);
            Q(3, StubApp.getString2(6553));
            P(9);
            T();
            P(9);
            T();
            Q(3, StubApp.getString2(6554));
        }
        int a3 = P(6).a();
        Q(3, StubApp.getString2(6521));
        String string24 = StubApp.getString2(6522);
        S(string24);
        Q(3, StubApp.getString2(6523));
        int i3 = 0;
        while (true) {
            string2 = StubApp.getString2(6550);
            string22 = StubApp.getString2(6555);
            if (i3 >= a3 || (c0855b = (C0855b) ((Bc.i) this.f7761b).f768d) == null) {
                break;
            }
            if (c0855b.f13673c == 3) {
                String str2 = c0855b.f13671a;
                if (str2.equals(string22)) {
                    break;
                } else if (str2.equals(string2)) {
                    break;
                }
            }
            String str3 = P(4).f13671a;
            if (str3.equals(StubApp.getString2(6556)) || str3.equals(StubApp.getString2(6557))) {
                for (Map.Entry entry : V().entrySet()) {
                    String str4 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (str4.equals(StubApp.getString2(2155))) {
                        C0857d c0857d = (C0857d) this.f7762c;
                        ((C0855b) list.get(0)).getClass();
                        c0857d.getClass();
                    } else if (str4.equals(StubApp.getString2(6571))) {
                        C0857d c0857d2 = (C0857d) this.f7762c;
                        ((C0855b) list.get(0)).getClass();
                        c0857d2.getClass();
                    } else if (str4.equals(StubApp.getString2(6572))) {
                        ((C0857d) this.f7762c).f13678e = ((C0855b) list.get(0)).f13671a;
                    } else if (str4.equals(StubApp.getString2(6573))) {
                        C0857d c0857d3 = (C0857d) this.f7762c;
                        String str5 = ((C0855b) list.get(0)).f13671a;
                        c0857d3.getClass();
                    } else if (str4.equals(StubApp.getString2(6574))) {
                        C0857d c0857d4 = (C0857d) this.f7762c;
                        String str6 = ((C0855b) list.get(0)).f13671a;
                        c0857d4.getClass();
                    } else if (str4.equals(StubApp.getString2(6575))) {
                        C0857d c0857d5 = (C0857d) this.f7762c;
                        Float.parseFloat(((C0855b) list.get(0)).f13671a);
                        c0857d5.getClass();
                    } else if (str4.equals(StubApp.getString2(6576))) {
                        C0857d c0857d6 = (C0857d) this.f7762c;
                        ((C0855b) list.get(0)).f13671a.equals(StubApp.getString2(6547));
                        c0857d6.getClass();
                    } else if (str4.equals(StubApp.getString2(6577))) {
                        C0857d c0857d7 = (C0857d) this.f7762c;
                        Float.parseFloat(((C0855b) list.get(0)).f13671a);
                        c0857d7.getClass();
                    } else if (str4.equals(StubApp.getString2(6578))) {
                        C0857d c0857d8 = (C0857d) this.f7762c;
                        Float.parseFloat(((C0855b) list.get(0)).f13671a);
                        c0857d8.getClass();
                    }
                }
            } else if (str3.equals(StubApp.getString2(6558))) {
                V();
            } else if (str3.equals(StubApp.getString2(6559))) {
                boolean n10 = ((Bc.i) this.f7761b).n(3);
                String string25 = StubApp.getString2(6532);
                String string26 = StubApp.getString2(6530);
                if (n10) {
                    String str7 = ((Bc.i) this.f7761b).m().f13671a;
                    if (!str7.equals(StubApp.getString2(6560))) {
                        throw new IOException(StubApp.getString2(6561).concat(str7));
                    }
                    ((C0857d) this.f7762c).f13675b = ba.c.f10730d;
                    S(string26);
                    Q(3, string25);
                } else {
                    P(6).a();
                    S(StubApp.getString2(986));
                    while (true) {
                        if (!((Bc.i) this.f7761b).n(3) || (!((C0855b) ((Bc.i) this.f7761b).f768d).f13671a.equals(string24) && !((C0855b) ((Bc.i) this.f7761b).f768d).f13671a.equals(string26) && !((C0855b) ((Bc.i) this.f7761b).f768d).f13671a.equals(string25))) {
                            ((Bc.i) this.f7761b).m();
                        }
                    }
                    HashMap hashMap = new HashMap();
                    while (((Bc.i) this.f7761b).n(3) && ((C0855b) ((Bc.i) this.f7761b).f768d).f13671a.equals(string24)) {
                        Q(3, string24);
                        int a9 = P(6).a();
                        C0855b P10 = P(4);
                        Q(3, StubApp.getString2(6562));
                        hashMap.put(Integer.valueOf(a9), P10.f13671a);
                    }
                    C0857d c0857d9 = (C0857d) this.f7762c;
                    C0533a c0533a = new C0533a();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        c0533a.c(((Integer) entry2.getKey()).intValue(), (String) entry2.getValue());
                    }
                    c0857d9.f13675b = c0533a;
                    S(string26);
                    Q(3, string25);
                }
            } else {
                ArrayList W10 = W();
                R();
                if (str3.equals(StubApp.getString2(6563))) {
                    ((C0857d) this.f7762c).f13674a = ((C0855b) W10.get(0)).f13671a;
                } else if (str3.equals(StubApp.getString2(6564))) {
                    C0857d c0857d10 = (C0857d) this.f7762c;
                    ((C0855b) W10.get(0)).a();
                    c0857d10.getClass();
                } else if (str3.equals(StubApp.getString2(6565))) {
                    C0857d c0857d11 = (C0857d) this.f7762c;
                    ((C0855b) W10.get(0)).a();
                    c0857d11.getClass();
                } else if (str3.equals(StubApp.getString2(6566))) {
                    ((C0857d) this.f7762c).f13676c = e(W10);
                } else if (str3.equals(StubApp.getString2(6567))) {
                    ((C0857d) this.f7762c).f13677d = e(W10);
                } else if (str3.equals(StubApp.getString2(6568))) {
                    C0857d c0857d12 = (C0857d) this.f7762c;
                    ((C0855b) W10.get(0)).a();
                    c0857d12.getClass();
                } else if (str3.equals(StubApp.getString2(6569))) {
                    C0857d c0857d13 = (C0857d) this.f7762c;
                    Float.parseFloat(((C0855b) W10.get(0)).f13671a);
                    c0857d13.getClass();
                } else if (str3.equals(StubApp.getString2(6570))) {
                    C0857d c0857d14 = (C0857d) this.f7762c;
                    ((C0855b) W10.get(0)).getClass();
                    c0857d14.getClass();
                }
            }
            i3++;
        }
        S(string22);
        Q(3, string2);
        Q(3, StubApp.getString2(6579));
        Q(3, StubApp.getString2(6580));
    }

    public C0855b P(int i3) {
        C0855b m4 = ((Bc.i) this.f7761b).m();
        if (m4 != null && m4.f13673c == i3) {
            return m4;
        }
        throw new IOException(StubApp.getString2(6583) + m4 + StubApp.getString2(6584) + com.mapbox.common.b.x(i3));
    }

    public void Q(int i3, String str) {
        C0855b P10 = P(i3);
        String str2 = P10.f13671a;
        if (str2 == null || !str2.equals(str)) {
            throw new IOException(StubApp.getString2(6583) + P10 + StubApp.getString2(6584) + str);
        }
    }

    public void R() {
        S(StubApp.getString2(6530));
        String string2 = StubApp.getString2(6529);
        S(string2);
        C0855b P10 = P(3);
        String str = P10.f13671a;
        if (str.equals(StubApp.getString2(6528)) || str.equals(StubApp.getString2(6585))) {
            return;
        }
        if (str.equals(string2)) {
            P10 = P(3);
        }
        if (P10.f13671a.equals(StubApp.getString2(6532))) {
            return;
        }
        throw new IOException(StubApp.getString2(6583) + P10 + StubApp.getString2(6586));
    }

    public C0855b S(String str) {
        if (((Bc.i) this.f7761b).n(3) && ((C0855b) ((Bc.i) this.f7761b).f768d).f13671a.equals(str)) {
            return ((Bc.i) this.f7761b).m();
        }
        return null;
    }

    public void T() {
        int i3 = 1;
        while (true) {
            Bc.i iVar = (Bc.i) this.f7761b;
            if (((C0855b) iVar.f768d) == null) {
                throw new IOException(StubApp.getString2(6587));
            }
            if (iVar.n(9)) {
                i3++;
            }
            if (((Bc.i) this.f7761b).m().f13673c == 10 && i3 - 1 == 0) {
                S(StubApp.getString2(6531));
                return;
            }
        }
    }

    public void U() {
        S(StubApp.getString2(6530));
        C0855b P10 = P(3);
        String str = P10.f13671a;
        if (str.equals(StubApp.getString2(4607)) || str.equals(StubApp.getString2(4851))) {
            return;
        }
        if (str.equals(StubApp.getString2(6529))) {
            P10 = P(3);
        }
        if (P10.f13671a.equals(StubApp.getString2(6562))) {
            return;
        }
        throw new IOException(StubApp.getString2(6583) + P10 + StubApp.getString2(6588));
    }

    public HashMap V() {
        String string2;
        HashMap hashMap = new HashMap();
        int a3 = P(6).a();
        Q(3, StubApp.getString2(6521));
        S(StubApp.getString2(6522));
        Q(3, StubApp.getString2(6523));
        int i3 = 0;
        while (true) {
            string2 = StubApp.getString2(6550);
            if (i3 >= a3) {
                break;
            }
            Bc.i iVar = (Bc.i) this.f7761b;
            if (((C0855b) iVar.f768d) == null) {
                break;
            }
            if (iVar.n(3) && !((C0855b) ((Bc.i) this.f7761b).f768d).f13671a.equals(string2)) {
                P(3);
            }
            Bc.i iVar2 = (Bc.i) this.f7761b;
            if (((C0855b) iVar2.f768d) == null || (iVar2.n(3) && ((C0855b) ((Bc.i) this.f7761b).f768d).f13671a.equals(string2))) {
                break;
            }
            C0855b P10 = P(4);
            ArrayList W10 = W();
            R();
            hashMap.put(P10.f13671a, W10);
            i3++;
        }
        Q(3, string2);
        S(StubApp.getString2(6530));
        Q(3, StubApp.getString2(6532));
        return hashMap;
    }

    public ArrayList W() {
        ArrayList arrayList = new ArrayList();
        C0855b m4 = ((Bc.i) this.f7761b).m();
        if (((C0855b) ((Bc.i) this.f7761b).f768d) != null) {
            arrayList.add(m4);
            int i3 = m4.f13673c;
            int i10 = 1;
            if (i3 == 7) {
                while (true) {
                    Bc.i iVar = (Bc.i) this.f7761b;
                    if (((C0855b) iVar.f768d) == null) {
                        break;
                    }
                    if (iVar.n(7)) {
                        i10++;
                    }
                    C0855b m10 = ((Bc.i) this.f7761b).m();
                    arrayList.add(m10);
                    if (m10.f13673c == 8 && i10 - 1 == 0) {
                        break;
                    }
                }
            } else if (i3 == 9) {
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    Bc.i iVar2 = (Bc.i) this.f7761b;
                    if (((C0855b) iVar2.f768d) == null) {
                        throw new IOException(StubApp.getString2(6587));
                    }
                    if (iVar2.n(9)) {
                        i10++;
                    }
                    C0855b m11 = ((Bc.i) this.f7761b).m();
                    arrayList2.add(m11);
                    if (m11.f13673c == 10 && i10 - 1 == 0) {
                        C0855b S5 = S(StubApp.getString2(6531));
                        if (S5 != null) {
                            arrayList2.add(S5);
                        }
                        arrayList.addAll(arrayList2);
                    }
                }
            } else if (i3 == 11) {
                P(12);
                return arrayList;
            }
            C0855b c0855b = (C0855b) ((Bc.i) this.f7761b).f768d;
            if (c0855b == null) {
                throw new IOException(StubApp.getString2(6593));
            }
            String str = c0855b.f13671a;
            String string2 = StubApp.getString2(6589);
            if (string2.equals(str)) {
                Q(3, string2);
                Q(4, StubApp.getString2(6590));
                Q(3, StubApp.getString2(6553));
                P(9);
                T();
                P(9);
                T();
                Q(3, StubApp.getString2(6554));
                P(9);
                Q(3, StubApp.getString2(6591));
                arrayList.clear();
                arrayList.addAll(W());
                P(10);
                Q(3, StubApp.getString2(6592));
            }
        }
        return arrayList;
    }

    public void X(W.a aVar) {
        ((z) this.f7761b).d(aVar);
        boolean z2 = aVar instanceof s;
        t2.j jVar = (t2.j) this.f7762c;
        if (z2) {
            jVar.j((s) aVar);
        } else if (aVar instanceof q) {
            jVar.k(((q) aVar).f14750b);
        }
    }

    public float Y(int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        b bVar;
        int i19;
        int i20 = 1;
        boolean z2 = Math.abs(i12 - i10) > Math.abs(i11 - i3);
        if (z2) {
            i14 = i3;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i3;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i21 = 2;
        int i22 = (-abs) / 2;
        int i23 = i13 < i15 ? 1 : -1;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 + i23;
        int i26 = i13;
        int i27 = i14;
        int i28 = 0;
        while (true) {
            if (i26 == i25) {
                i17 = i21;
                break;
            }
            int i29 = z2 ? i27 : i26;
            int i30 = z2 ? i26 : i27;
            boolean z10 = z2;
            if (i28 == i20) {
                i18 = i20;
                i19 = abs;
                bVar = this;
            } else {
                i18 = 0;
                bVar = this;
                i19 = abs;
            }
            if (i18 == ((T5.b) bVar.f7761b).b(i29, i30)) {
                if (i28 == 2) {
                    return AbstractC0624h2.g(i26, i27, i13, i14);
                }
                i28++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i27 == i16) {
                    i17 = 2;
                    break;
                }
                i27 += i24;
                i22 -= i19;
            }
            i26 += i23;
            abs = i19;
            z2 = z10;
            i20 = 1;
            i21 = 2;
        }
        if (i28 == i17) {
            return AbstractC0624h2.g(i25, i16, i13, i14);
        }
        return Float.NaN;
    }

    public float Z(int i3, int i10, int i11, int i12) {
        float f10;
        float f11;
        float Y5 = Y(i3, i10, i11, i12);
        int i13 = i3 - (i11 - i3);
        T5.b bVar = (T5.b) this.f7761b;
        int i14 = 0;
        if (i13 < 0) {
            f10 = i3 / (i3 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.f7183a;
            if (i13 >= i15) {
                float f12 = ((i15 - 1) - i3) / (i13 - i3);
                int i16 = i15 - 1;
                f10 = f12;
                i13 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f13 = i10;
        int i17 = (int) (f13 - ((i12 - i10) * f10));
        if (i17 < 0) {
            f11 = f13 / (i10 - i17);
        } else {
            int i18 = bVar.f7184b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (Y(i3, i10, (int) (((i13 - i3) * f11) + i3), i14) + Y5) - 1.0f;
    }

    @Override // Xa.x
    public void a(KeyEvent keyEvent, C0398e c0398e) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            c0398e.o(false);
            return;
        }
        Character a3 = ((o) this.f7762c).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        d dVar = new d(c0398e, 25);
        C0978g c0978g = (C0978g) this.f7761b;
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(660), z2 ? StubApp.getString2(6594) : StubApp.getString2(6595));
        hashMap.put(StubApp.getString2(6596), StubApp.getString2(3400));
        hashMap.put(StubApp.getString2(658), Integer.valueOf(keyEvent.getFlags()));
        hashMap.put(StubApp.getString2(6597), Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put(StubApp.getString2(6598), Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put(StubApp.getString2(653), Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put(StubApp.getString2(657), Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put(StubApp.getString2(655), Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put(StubApp.getString2(6599), a3.toString());
        hashMap.put(StubApp.getString2(376), Integer.valueOf(keyEvent.getSource()));
        hashMap.put(StubApp.getString2(656), Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put(StubApp.getString2(654), Integer.valueOf(keyEvent.getRepeatCount()));
        c0978g.f14344a.send(hashMap, new B(dVar, 16));
    }

    public b a0(b bVar) {
        if (!((C1009a) this.f7761b).equals((C1009a) bVar.f7761b)) {
            throw new IllegalArgumentException(StubApp.getString2(6516));
        }
        if (bVar.J()) {
            return this;
        }
        int[] iArr = (int[]) bVar.f7762c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i3 = 0;
        while (true) {
            C1009a c1009a = (C1009a) bVar.f7761b;
            if (i3 >= length) {
                return b(new b(c1009a, iArr2));
            }
            int i10 = iArr[i3];
            c1009a.getClass();
            iArr2[i3] = (929 - i10) % 929;
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
    @Override // R3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.b.accept(java.lang.Object, java.lang.Object):void");
    }

    public b b(b bVar) {
        C1009a c1009a = (C1009a) bVar.f7761b;
        C1009a c1009a2 = (C1009a) this.f7761b;
        if (!c1009a2.equals(c1009a)) {
            throw new IllegalArgumentException(StubApp.getString2(6516));
        }
        if (J()) {
            return bVar;
        }
        if (bVar.J()) {
            return this;
        }
        int[] iArr = (int[]) this.f7762c;
        int length = iArr.length;
        int[] iArr2 = (int[]) bVar.f7762c;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i3 = length2; i3 < iArr.length; i3++) {
            iArr3[i3] = c1009a2.a(iArr2[i3 - length2], iArr[i3]);
        }
        return new b(c1009a2, iArr3);
    }

    @Override // q4.g
    public /* synthetic */ void c() {
        try {
            ((p) this.f7761b).D((C0241j) this.f7762c, true, new k());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.mapbox.navigation.base.route.j
    public void d(ArrayList routes, String routerOrigin) {
        Double distance;
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) CollectionsKt.firstOrNull((List) routes);
        Long l9 = null;
        DirectionsRoute directionsRoute = gVar != null ? gVar.f12498a : null;
        Long valueOf = (directionsRoute == null || (distance = directionsRoute.distance()) == null) ? null : Long.valueOf((long) distance.doubleValue());
        if (directionsRoute != null) {
            List<RouteLeg> legs = directionsRoute.legs();
            if (legs == null || legs.isEmpty()) {
                Double duration = directionsRoute.duration();
                if (duration != null) {
                    l9 = Long.valueOf((long) duration.doubleValue());
                }
            } else {
                Iterator<T> it = legs.iterator();
                long j = 0;
                while (it.hasNext()) {
                    Double duration2 = ((RouteLeg) it.next()).duration();
                    j += duration2 != null ? (long) duration2.doubleValue() : 0L;
                }
                l9 = Long.valueOf(j);
            }
        }
        ((C0498N) this.f7761b).f10571d.n(new X2.i((X2.j) this.f7762c, l9, valueOf));
    }

    public float f(C1228c c1228c, C1228c c1228c2) {
        int i3 = (int) c1228c.f4926a;
        int i10 = (int) c1228c.f4927b;
        int i11 = (int) c1228c2.f4926a;
        int i12 = (int) c1228c2.f4927b;
        float Z10 = Z(i3, i10, i11, i12);
        float Z11 = Z((int) c1228c2.f4926a, i12, (int) c1228c.f4926a, i10);
        return Float.isNaN(Z10) ? Z11 / 7.0f : Float.isNaN(Z11) ? Z10 / 7.0f : (Z10 + Z11) / 14.0f;
    }

    @Override // com.mapbox.navigation.base.route.j
    public void g(RouteOptions routeOptions, String routerOrigin) {
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        ((C0498N) this.f7761b).getClass();
        R2.c.f(StubApp.getString2(103), StubApp.getString2(6606) + ((X2.j) this.f7762c));
    }

    public void i(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.i(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void j(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        d0.M m4 = (d0.M) this.f7761b;
        AbstractActivityC1027h abstractActivityC1027h = m4.f13179w.f13392b;
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = m4.f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.j(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v33, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Z9.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [long] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    @Override // q4.i
    public q4.j k(Object obj) {
        FileWriter fileWriter;
        switch (this.f7760a) {
            case 8:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                String string2 = StubApp.getString2(280);
                l lVar = (l) this.f7762c;
                if (booleanValue) {
                    if (Log.isLoggable(string2, 3)) {
                        Log.d(string2, StubApp.getString2(6613), null);
                    }
                    boolean booleanValue2 = bool.booleanValue();
                    u uVar = lVar.f10894b;
                    if (!booleanValue2) {
                        uVar.getClass();
                        throw new IllegalStateException(StubApp.getString2(6614));
                    }
                    uVar.f10959h.d(null);
                    return ((q4.s) this.f7761b).onSuccessTask(lVar.f10897e.f13422a, new C0379a(this, 1));
                }
                if (Log.isLoggable(string2, 2)) {
                    Log.v(string2, StubApp.getString2(6612), null);
                }
                Iterator it = C1059c.p(((File) lVar.f10899g.f14844c).listFiles(l.f10891t)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                C1059c c1059c = ((C1057a) lVar.f10904m.f14843b).f14838b;
                C1057a.a(C1059c.p(((File) c1059c.f14846e).listFiles()));
                C1057a.a(C1059c.p(((File) c1059c.f14847f).listFiles()));
                C1057a.a(C1059c.p(((File) c1059c.f14848g).listFiles()));
                lVar.f10909r.d(null);
                return f.m(null);
            default:
                ?? r10 = (JSONObject) ((C0805e) this.f7761b).f13424c.f13414a.submit(new c5.p(this, 1)).get();
                Closeable closeable = null;
                if (r10 != 0) {
                    A3.s sVar = (A3.s) this.f7762c;
                    C1107b D6 = ((C0366a) sVar.f191c).D(r10);
                    ?? r32 = D6.f15439c;
                    C0379a c0379a = (C0379a) sVar.f193e;
                    c0379a.getClass();
                    String string22 = StubApp.getString2(6607);
                    String string23 = StubApp.getString2(280);
                    if (Log.isLoggable(string23, 2)) {
                        Log.v(string23, StubApp.getString2(6608), null);
                    }
                    try {
                        try {
                            try {
                                r10.put(StubApp.getString2("6609"), r32);
                                try {
                                    fileWriter = new FileWriter((File) c0379a.f9233b);
                                } catch (Exception e10) {
                                    e = e10;
                                    fileWriter = null;
                                    Log.e(string23, StubApp.getString2("6610"), e);
                                    r32 = fileWriter;
                                    c5.f.b(r32, string22);
                                    A3.s.m(r10, StubApp.getString2(6611));
                                    String str = ((k5.d) sVar.f190b).f15448f;
                                    SharedPreferences.Editor edit = ((Context) sVar.f189a).getSharedPreferences(StubApp.getString2(1000), 0).edit();
                                    edit.putString(StubApp.getString2(1001), str);
                                    edit.apply();
                                    ((AtomicReference) sVar.f196h).set(D6);
                                    ((k) ((AtomicReference) sVar.f197i).get()).d(D6);
                                    return f.m(null);
                                }
                            } catch (Exception e11) {
                                e = e11;
                            }
                            try {
                                fileWriter.write(r10.toString());
                                fileWriter.flush();
                                r32 = fileWriter;
                            } catch (Exception e12) {
                                e = e12;
                                Log.e(string23, StubApp.getString2("6610"), e);
                                r32 = fileWriter;
                                c5.f.b(r32, string22);
                                A3.s.m(r10, StubApp.getString2(6611));
                                String str2 = ((k5.d) sVar.f190b).f15448f;
                                SharedPreferences.Editor edit2 = ((Context) sVar.f189a).getSharedPreferences(StubApp.getString2(1000), 0).edit();
                                edit2.putString(StubApp.getString2(1001), str2);
                                edit2.apply();
                                ((AtomicReference) sVar.f196h).set(D6);
                                ((k) ((AtomicReference) sVar.f197i).get()).d(D6);
                                return f.m(null);
                            }
                            c5.f.b(r32, string22);
                            A3.s.m(r10, StubApp.getString2(6611));
                            String str22 = ((k5.d) sVar.f190b).f15448f;
                            SharedPreferences.Editor edit22 = ((Context) sVar.f189a).getSharedPreferences(StubApp.getString2(1000), 0).edit();
                            edit22.putString(StubApp.getString2(1001), str22);
                            edit22.apply();
                            ((AtomicReference) sVar.f196h).set(D6);
                            ((k) ((AtomicReference) sVar.f197i).get()).d(D6);
                        } catch (Throwable th) {
                            th = th;
                            closeable = r32;
                            c5.f.b(closeable, string22);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c5.f.b(closeable, string22);
                        throw th;
                    }
                }
                return f.m(null);
        }
    }

    public void l(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.l(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void m(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.m(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void n(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.n(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void o(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.o(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void p(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        d0.M m4 = (d0.M) this.f7761b;
        AbstractActivityC1027h abstractActivityC1027h = m4.f13179w.f13392b;
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = m4.f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.p(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.mapbox.navigation.base.route.j
    public void q(List reasons, RouteOptions routeOptions) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        ((C0498N) this.f7761b).getClass();
        R2.c.f(StubApp.getString2(103), StubApp.getString2(6615) + ((X2.j) this.f7762c) + StubApp.getString2(994) + ((com.mapbox.navigation.base.route.o) CollectionsKt.last(reasons)).f12518d + StubApp.getString2(397) + ((com.mapbox.navigation.base.route.o) CollectionsKt.last(reasons)).f12517c);
    }

    public void r(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.r(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        HttpResponseData value = (HttpResponseData) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int code = value.getCode();
        ((HistoryUploadWorker) this.f7761b).getClass();
        if (new IntRange(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 299).contains(code)) {
            return;
        }
        Gson gson = j8.d.f15378b;
        c7.f.f(StubApp.getString2(6616) + ((UploadOptions) this.f7762c).getFilePath() + StubApp.getString2(6617) + value);
    }

    public void s(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.s(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void t(AbstractComponentCallbacksC0789t f10, Bundle outState, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.t(f10, outState, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f7760a) {
            case 11:
                return E1.a.k(StubApp.getString2(6621), (String) this.f7761b, StubApp.getString2(511));
            case 17:
                StringBuilder sb2 = new StringBuilder(C() * 8);
                for (int C10 = C(); C10 >= 0; C10--) {
                    int B7 = B(C10);
                    if (B7 != 0) {
                        if (B7 < 0) {
                            sb2.append(StubApp.getString2(6618));
                            B7 = -B7;
                        } else if (sb2.length() > 0) {
                            sb2.append(StubApp.getString2(6619));
                        }
                        if (C10 == 0 || B7 != 1) {
                            sb2.append(B7);
                        }
                        if (C10 != 0) {
                            if (C10 == 1) {
                                sb2.append('x');
                            } else {
                                sb2.append(StubApp.getString2(6620));
                                sb2.append(C10);
                            }
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.u(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void v(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.v(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void w(AbstractComponentCallbacksC0789t f10, View v2, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(v2, "v");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.w(f10, v2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void x(AbstractComponentCallbacksC0789t f10, boolean z2) {
        Intrinsics.checkNotNullParameter(f10, "f");
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((d0.M) this.f7761b).f13181y;
        if (abstractComponentCallbacksC0789t != null) {
            d0.M o5 = abstractComponentCallbacksC0789t.o();
            Intrinsics.checkNotNullExpressionValue(o5, "parent.getParentFragmentManager()");
            o5.f13171o.x(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7762c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public int y(int i3) {
        if (i3 == 0) {
            return B(0);
        }
        C1009a c1009a = (C1009a) this.f7761b;
        int[] iArr = (int[]) this.f7762c;
        if (i3 == 1) {
            int i10 = 0;
            for (int i11 : iArr) {
                i10 = c1009a.a(i10, i11);
            }
            return i10;
        }
        int i12 = iArr[0];
        int length = iArr.length;
        for (int i13 = 1; i13 < length; i13++) {
            i12 = c1009a.a(c1009a.c(i3, i12), iArr[i13]);
        }
        return i12;
    }

    public C1226a z(float f10, int i3, int i10, float f11) {
        T5.b bVar;
        C1226a b2;
        C1226a b10;
        int i11 = (int) (f11 * f10);
        int max = Math.max(0, i3 - i11);
        T5.b bVar2 = (T5.b) this.f7761b;
        int min = Math.min(bVar2.f7183a - 1, i3 + i11) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw N5.i.a();
        }
        int max2 = Math.max(0, i10 - i11);
        int min2 = Math.min(bVar2.f7184b - 1, i10 + i11) - max2;
        if (min2 < f12) {
            throw N5.i.a();
        }
        C1227b c1227b = new C1227b((T5.b) this.f7761b, max, max2, min, min2, f10, (N5.p) this.f7762c);
        int i12 = c1227b.f16718e;
        int i13 = c1227b.f16716c;
        int i14 = i12 + i13;
        int i15 = c1227b.f16719f;
        int i16 = (i15 / 2) + c1227b.f16717d;
        int[] iArr = new int[3];
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = ((i17 & 1) == 0 ? (i17 + 1) / 2 : -((i17 + 1) / 2)) + i16;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i19 = i13;
            while (true) {
                bVar = c1227b.f16714a;
                if (i19 >= i14 || bVar.b(i19, i18)) {
                    break;
                }
                i19++;
            }
            int i20 = 0;
            while (i19 < i14) {
                if (!bVar.b(i19, i18)) {
                    if (i20 == 1) {
                        i20++;
                    }
                    iArr[i20] = iArr[i20] + 1;
                } else if (i20 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i20 != 2) {
                    i20++;
                    iArr[i20] = iArr[i20] + 1;
                } else {
                    if (c1227b.a(iArr) && (b10 = c1227b.b(i18, i19, iArr)) != null) {
                        return b10;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i20 = 1;
                }
                i19++;
            }
            if (c1227b.a(iArr) && (b2 = c1227b.b(i18, i14, iArr)) != null) {
                return b2;
            }
        }
        ArrayList arrayList = c1227b.f16715b;
        if (arrayList.isEmpty()) {
            throw N5.i.a();
        }
        return (C1226a) arrayList.get(0);
    }

    public /* synthetic */ b(int i3, boolean z2) {
        this.f7760a = i3;
    }

    public /* synthetic */ b(C0878b c0878b, PendingIntent pendingIntent, C1055s c1055s) {
        this.f7760a = 13;
        this.f7761b = pendingIntent;
        this.f7762c = c1055s;
    }

    public /* synthetic */ b(Object obj, Object obj2, int i3, boolean z2) {
        this.f7760a = i3;
        this.f7762c = obj;
        this.f7761b = obj2;
    }

    public b(AppMeasurementDynamiteService appMeasurementDynamiteService, Q q10) {
        this.f7760a = 23;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f7762c = appMeasurementDynamiteService;
        this.f7761b = q10;
    }

    public b(C1179g0 c1179g0, String str) {
        this.f7760a = 22;
        this.f7761b = str;
        Objects.requireNonNull(c1179g0);
        this.f7762c = c1179g0;
    }

    public b(Application application, C1129f callback) {
        this.f7760a = 21;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f7761b = application;
        this.f7762c = callback;
    }

    @Override // com.mapbox.navigator.RefreshRouteCallback
    public void run(Expected it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((E9.q) this.f7761b).invoke((C0203k) this.f7762c, it);
    }

    public b(WorkDatabase_Impl database, int i3) {
        this.f7760a = i3;
        switch (i3) {
            case 29:
                this.f7761b = database;
                Intrinsics.checkNotNullParameter(database, "database");
                this.f7762c = new Q2.c(database, 7);
                break;
            default:
                this.f7761b = database;
                Intrinsics.checkNotNullParameter(database, "database");
                this.f7762c = new Q2.c(database, 2);
                break;
        }
    }

    public b(d0.M fragmentManager) {
        this.f7760a = 10;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f7761b = fragmentManager;
        this.f7762c = new CopyOnWriteArrayList();
    }

    public b(C0978g c0978g) {
        this.f7760a = 1;
        this.f7762c = new o();
        this.f7761b = c0978g;
    }

    public b(C1009a c1009a, int[] iArr) {
        this.f7760a = 17;
        if (iArr.length != 0) {
            this.f7761b = c1009a;
            int length = iArr.length;
            int i3 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i3 < length && iArr[i3] == 0) {
                    i3++;
                }
                if (i3 == length) {
                    this.f7762c = new int[]{0};
                    return;
                }
                int i10 = length - i3;
                int[] iArr2 = new int[i10];
                this.f7762c = iArr2;
                System.arraycopy(iArr, i3, iArr2, 0, i10);
                return;
            }
            this.f7762c = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public b(T5.b bVar) {
        this.f7760a = 24;
        this.f7761b = bVar;
    }

    public b(K k3) {
        this.f7760a = 6;
        this.f7761b = k3;
        o0 o0Var = new o0();
        o0Var.f10263b = 0;
        this.f7762c = o0Var;
    }

    public b(EditText editText) {
        this.f7760a = 4;
        this.f7761b = editText;
        C0388j c0388j = new C0388j(editText);
        this.f7762c = c0388j;
        editText.addTextChangedListener(c0388j);
        if (C0380b.f9235b == null) {
            synchronized (C0380b.f9234a) {
                try {
                    if (C0380b.f9235b == null) {
                        C0380b c0380b = new C0380b();
                        try {
                            C0380b.f9236c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0380b.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0380b.f9235b = c0380b;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0380b.f9235b);
    }

    public b(int i3) {
        this.f7760a = i3;
        switch (i3) {
            case 9:
                this.f7761b = new AtomicInteger();
                this.f7762c = new AtomicInteger();
                break;
            case 18:
                List list = Collections.EMPTY_LIST;
                this.f7761b = list;
                this.f7762c = list;
                break;
            case 19:
                this.f7761b = new z();
                this.f7762c = new t2.j();
                X(t.f14752i0);
                break;
            default:
                this.f7761b = new SparseIntArray();
                this.f7762c = new SparseIntArray();
                break;
        }
    }
}
