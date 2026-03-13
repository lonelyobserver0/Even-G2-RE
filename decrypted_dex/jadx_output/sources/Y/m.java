package Y;

import N.AbstractC0179z;
import N.I;
import N.L;
import S3.D;
import T0.z;
import Tb.b0;
import Ub.AbstractC0347c;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.recyclerview.widget.l0;
import androidx.recyclerview.widget.o0;
import androidx.work.impl.WorkDatabase_Impl;
import c2.C0550b;
import c2.InterfaceC0556h;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.location.LocationRequest;
import com.google.gson.JsonElement;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.mapbox.common.ResultCallback;
import com.mapbox.maps.MapboxMap;
import com.mapbox.navigation.copilot.work.HistoryUploadWorker;
import com.stub.StubApp;
import e1.C0836a;
import f4.C0874B;
import f4.C0877a;
import f4.C0879c;
import f4.F;
import g6.C0957b;
import i4.C1040d;
import i4.x;
import i5.C1059c;
import i7.AbstractC1062b;
import i7.EnumC1061a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import k5.C1107b;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import l.AbstractC1130a;
import l.C1134e;
import l4.C1145A;
import l4.q1;
import l5.InterfaceC1225a;
import m.MenuC1254A;
import m6.C1274b;
import m6.InterfaceC1273a;
import o1.C1453e;
import t.C1697j;
import t0.C1712l;
import t0.InterfaceC1707g;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class m implements n, InterfaceC0556h, q4.i, R3.n, f4.m, InterfaceC1225a, ResultCallback, InterfaceC1273a, InterfaceC1707g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8673a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8674b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8675c;

    public /* synthetic */ m(int i3, Object obj, Object obj2) {
        this.f8673a = i3;
        this.f8674b = obj;
        this.f8675c = obj2;
    }

    public static N5.o r(N5.o oVar, float f10, float f11) {
        float f12 = oVar.f4926a;
        float f13 = f12 < f10 ? f12 - 1.0f : f12 + 1.0f;
        float f14 = oVar.f4927b;
        return new N5.o(f13, f14 < f11 ? f14 - 1.0f : f14 + 1.0f);
    }

    public static N5.o y(N5.o oVar, N5.o oVar2, int i3) {
        float f10 = oVar2.f4926a;
        float f11 = oVar.f4926a;
        float f12 = i3 + 1;
        float f13 = oVar2.f4927b;
        float f14 = oVar.f4927b;
        return new N5.o(f11 + ((f10 - f11) / f12), f14 + ((f13 - f14) / f12));
    }

    @Override // f4.m
    public R3.l a() {
        return (R3.l) this.f8674b;
    }

    @Override // R3.n
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.common.d dVar;
        switch (this.f8673a) {
            case 11:
                C0877a c0877a = new C0877a((q4.k) obj2);
                C1040d c1040d = (C1040d) this.f8674b;
                PendingIntent pendingIntent = (PendingIntent) this.f8675c;
                D.i(pendingIntent, StubApp.getString2(7477));
                R3.o oVar = new R3.o(c0877a);
                F f10 = (F) ((C0874B) obj).t();
                Parcel g10 = f10.g();
                f4.g.b(g10, c1040d);
                f4.g.b(g10, pendingIntent);
                g10.writeStrongBinder(oVar);
                f10.L(g10, 72);
                break;
            case 12:
                C0877a c0877a2 = new C0877a((q4.k) obj2);
                x xVar = (x) this.f8674b;
                PendingIntent pendingIntent2 = (PendingIntent) this.f8675c;
                D.i(pendingIntent2, StubApp.getString2(7477));
                R3.o oVar2 = new R3.o(c0877a2);
                F f11 = (F) ((C0874B) obj).t();
                Parcel g11 = f11.g();
                f4.g.b(g11, xVar);
                f4.g.b(g11, pendingIntent2);
                g11.writeStrongBinder(oVar2);
                f11.L(g11, 70);
                break;
            default:
                q4.k kVar = (q4.k) obj2;
                f4.p pVar = (f4.p) obj;
                com.google.android.gms.common.d[] k3 = pVar.k();
                PendingIntent pendingIntent3 = (PendingIntent) this.f8674b;
                LocationRequest locationRequest = (LocationRequest) this.f8675c;
                if (k3 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < k3.length) {
                            dVar = k3[i3];
                            if (!StubApp.getString2(6601).equals(dVar.f11182a)) {
                                i3++;
                            }
                        } else {
                            dVar = null;
                        }
                    }
                    if (dVar != null && dVar.d() >= 1) {
                        ((F) pVar.t()).O(new f4.r(3, null, null, pendingIntent3, null), locationRequest, new f4.l(null, kVar));
                        break;
                    }
                }
                F f12 = (F) pVar.t();
                f4.s sVar = new f4.s(locationRequest, null, false, false, false, false, LongCompanionObject.MAX_VALUE);
                f4.i iVar = new f4.i((Boolean) null, kVar);
                int hashCode = pendingIntent3.hashCode();
                StringBuilder sb2 = new StringBuilder(String.valueOf(hashCode).length() + 14);
                sb2.append(StubApp.getString2(7476));
                sb2.append(hashCode);
                f12.N(new f4.t(1, sVar, null, null, pendingIntent3, iVar, sb2.toString()));
                break;
        }
    }

    @Override // f4.m
    public void b() {
        ((q4.k) this.f8675c).d(null);
    }

    @Override // f4.m
    public void c(R3.l lVar) {
        throw new IllegalStateException();
    }

    @Override // l5.InterfaceC1225a
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        InterfaceC1225a[] interfaceC1225aArr = (InterfaceC1225a[]) this.f8674b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i3 = 0; i3 < 1; i3++) {
            InterfaceC1225a interfaceC1225a = interfaceC1225aArr[i3];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = interfaceC1225a.d(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((C1145A) this.f8675c).d(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // Y.n
    public boolean e(CharSequence charSequence, int i3, int i10, u uVar) {
        if ((uVar.f8700c & 4) > 0) {
            return true;
        }
        if (((w) this.f8674b) == null) {
            this.f8674b = new w(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((u5.d) this.f8675c).getClass();
        ((w) this.f8674b).setSpan(new v(uVar), i3, i10, 33);
        return true;
    }

    @Override // m6.InterfaceC1273a
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            N5.o oVar = (N5.o) it.next();
            ViewfinderView viewfinderView = ((DecoratedBarcodeView) this.f8675c).f12261b;
            if (viewfinderView.f12270g.size() < 20) {
                viewfinderView.f12270g.add(oVar);
            }
        }
    }

    @Override // t0.InterfaceC1707g
    public InterfaceC1708h g() {
        return new C1712l((Context) this.f8674b, ((C1453e) this.f8675c).g());
    }

    @Override // Y.n
    public Object getResult() {
        return (w) this.f8674b;
    }

    @Override // m6.InterfaceC1273a
    public void h(C1274b c1274b) {
        ((C0879c) this.f8674b).h(c1274b);
    }

    public void i() {
        String str = (String) this.f8674b;
        try {
            C1059c c1059c = (C1059c) this.f8675c;
            c1059c.getClass();
            new File((File) c1059c.f14844c, str).createNewFile();
        } catch (IOException e10) {
            Log.e(StubApp.getString2(280), StubApp.getString2(7478).concat(str), e10);
        }
    }

    public HashMap j(Map initialData) {
        String str;
        Intrinsics.checkNotNullParameter(initialData, "initialData");
        b0 b0Var = (b0) this.f8674b;
        b0Var.getClass();
        F5.c cVar = AbstractC0347c.f7577b;
        Object obj = b0.f7345f.get(b0Var);
        if (obj == cVar) {
            obj = null;
        }
        HashMap hashMap = new HashMap(new HashMap((Map) obj));
        hashMap.remove(StubApp.getString2(7479));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : (Set) this.f8675c) {
            JsonElement jsonElement = (JsonElement) initialData.get(str2);
            if (jsonElement != null) {
                try {
                    str = jsonElement.getAsString();
                } catch (Throwable unused) {
                    str = null;
                }
                if (str != null) {
                    linkedHashMap.put(str2, str);
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (!hashMap.keySet().contains(str3)) {
                hashMap.put(str3, str4);
            }
        }
        return hashMap;
    }

    @Override // q4.i
    public q4.j k(Object obj) {
        if (((C1107b) obj) == null) {
            Log.w(StubApp.getString2(280), StubApp.getString2(7480), null);
            return a4.f.m(null);
        }
        c5.j jVar = (c5.j) this.f8675c;
        c5.l lVar = jVar.f10888f;
        return a4.f.A(Arrays.asList(c5.l.a(lVar), lVar.f10904m.q(lVar.f10897e.f13422a, jVar.f10887e ? (String) this.f8674b : null)));
    }

    public byte[] l(C0836a c0836a) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f8674b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f8675c;
        try {
            dataOutputStream.writeBytes(c0836a.f13574a);
            dataOutputStream.writeByte(0);
            String str = c0836a.f13575b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c0836a.f13576c);
            dataOutputStream.writeLong(c0836a.f13577d);
            dataOutputStream.write(c0836a.f13578e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void m(int i3) {
        int[] iArr = (int[]) this.f8674b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i3, 10) + 1];
            this.f8674b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i3 >= iArr.length) {
            int length = iArr.length;
            while (length <= i3) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f8674b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f8674b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public o0 n(int i3) {
        o0 o0Var;
        o0 o0Var2;
        o0[] o0VarArr = (o0[]) this.f8675c;
        o0 o0Var3 = o0VarArr[p(i3)];
        if (o0Var3 != null) {
            return o0Var3;
        }
        for (int i10 = 1; i10 < 5; i10++) {
            int p8 = p(i3) - i10;
            if (p8 >= 0 && (o0Var2 = o0VarArr[p8]) != null) {
                return o0Var2;
            }
            int p9 = p(i3) + i10;
            if (p9 < o0VarArr.length && (o0Var = o0VarArr[p9]) != null) {
                return o0Var;
            }
        }
        return null;
    }

    public ArrayList o(String str) {
        J1.v e10 = J1.v.e(1, StubApp.getString2(7481));
        if (str == null) {
            e10.x(1);
        } else {
            e10.g(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8674b;
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

    public int p(int i3) {
        return i3 - ((C0957b) this.f8674b).f14226h;
    }

    public boolean q(N5.o oVar) {
        float f10 = oVar.f4926a;
        if (f10 < 0.0f) {
            return false;
        }
        T5.b bVar = (T5.b) this.f8674b;
        if (f10 > bVar.f7183a - 1) {
            return false;
        }
        float f11 = oVar.f4927b;
        return f11 > 0.0f && f11 <= ((float) (bVar.f7184b - 1));
    }

    @Override // com.mapbox.common.ResultCallback
    public void run(boolean z2) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(7482));
        Throwable th = (Throwable) this.f8675c;
        sb2.append(th != null ? th.getMessage() : null);
        ((HistoryUploadWorker) this.f8674b).k(sb2.toString());
    }

    public void s(int i3, int i10) {
        int[] iArr = (int[]) this.f8674b;
        if (iArr == null || i3 >= iArr.length) {
            return;
        }
        int i11 = i3 + i10;
        m(i11);
        int[] iArr2 = (int[]) this.f8674b;
        System.arraycopy(iArr2, i3, iArr2, i11, (iArr2.length - i3) - i10);
        Arrays.fill((int[]) this.f8674b, i3, i11, -1);
        ArrayList arrayList = (ArrayList) this.f8675c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l0 l0Var = (l0) ((ArrayList) this.f8675c).get(size);
            int i12 = l0Var.f10209a;
            if (i12 >= i3) {
                l0Var.f10209a = i12 + i10;
            }
        }
    }

    public void t(int i3, int i10) {
        int[] iArr = (int[]) this.f8674b;
        if (iArr == null || i3 >= iArr.length) {
            return;
        }
        int i11 = i3 + i10;
        m(i11);
        int[] iArr2 = (int[]) this.f8674b;
        System.arraycopy(iArr2, i11, iArr2, i3, (iArr2.length - i3) - i10);
        int[] iArr3 = (int[]) this.f8674b;
        Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f8675c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l0 l0Var = (l0) ((ArrayList) this.f8675c).get(size);
            int i12 = l0Var.f10209a;
            if (i12 >= i3) {
                if (i12 < i11) {
                    ((ArrayList) this.f8675c).remove(size);
                } else {
                    l0Var.f10209a = i12 - i10;
                }
            }
        }
    }

    public String toString() {
        switch (this.f8673a) {
            case 9:
                return E1.a.k(StubApp.getString2(7485), (String) this.f8674b, StubApp.getString2(511));
            case 15:
                Formatter formatter = new Formatter();
                try {
                    int i3 = 0;
                    for (o0 o0Var : (o0[]) this.f8675c) {
                        if (o0Var == null) {
                            formatter.format(StubApp.getString2("7483"), Integer.valueOf(i3));
                            i3++;
                        } else {
                            formatter.format(StubApp.getString2("7484"), Integer.valueOf(i3), Integer.valueOf(o0Var.f10267f), Integer.valueOf(o0Var.f10266e));
                            i3++;
                        }
                    }
                    String formatter2 = formatter.toString();
                    formatter.close();
                    return formatter2;
                } catch (Throwable th) {
                    try {
                        formatter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                return super.toString();
        }
    }

    public void u(AbstractC1130a abstractC1130a) {
        p2.h hVar = (p2.h) this.f8674b;
        ((ActionMode.Callback) hVar.f19671a).onDestroyActionMode(hVar.c(abstractC1130a));
        i.v vVar = (i.v) this.f8675c;
        if (vVar.f14695z != null) {
            vVar.f14671m.getDecorView().removeCallbacks(vVar.f14648A);
        }
        if (vVar.f14693y != null) {
            L l9 = vVar.f14650B;
            if (l9 != null) {
                l9.b();
            }
            L a3 = I.a(vVar.f14693y);
            a3.a(0.0f);
            vVar.f14650B = a3;
            a3.d(new i.n(this, 2));
        }
        vVar.f14691x = null;
        ViewGroup viewGroup = vVar.f14652D;
        WeakHashMap weakHashMap = I.f4732a;
        AbstractC0179z.c(viewGroup);
        vVar.I();
    }

    public boolean v(AbstractC1130a abstractC1130a, m.l lVar) {
        ViewGroup viewGroup = ((i.v) this.f8675c).f14652D;
        WeakHashMap weakHashMap = I.f4732a;
        AbstractC0179z.c(viewGroup);
        p2.h hVar = (p2.h) this.f8674b;
        C1134e c10 = hVar.c(abstractC1130a);
        C1697j c1697j = (C1697j) hVar.f19674d;
        Menu menu = (Menu) c1697j.get(lVar);
        if (menu == null) {
            menu = new MenuC1254A((Context) hVar.f19672b, lVar);
            c1697j.put(lVar, menu);
        }
        return ((ActionMode.Callback) hVar.f19671a).onPrepareActionMode(c10, menu);
    }

    public void w(EnumC1061a gesture) {
        Intrinsics.checkNotNullParameter(gesture, "gesture");
        Boolean bool = (Boolean) ((LinkedHashMap) this.f8675c).remove(gesture);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int i3 = AbstractC1062b.f14859a[gesture.ordinal()];
            B6.a aVar = (B6.a) this.f8674b;
            B6.i iVar = i3 == 1 ? (B6.j) aVar.f671e : (B6.d) aVar.f674h;
            iVar.f681g = booleanValue;
            if (booleanValue || !iVar.f709q) {
                return;
            }
            iVar.f710r = true;
        }
    }

    public void x(EnumC1061a gesture) {
        Intrinsics.checkNotNullParameter(gesture, "gesture");
        int i3 = AbstractC1062b.f14859a[gesture.ordinal()];
        B6.a aVar = (B6.a) this.f8674b;
        B6.i iVar = i3 == 1 ? (B6.j) aVar.f671e : (B6.d) aVar.f674h;
        ((LinkedHashMap) this.f8675c).put(gesture, Boolean.valueOf(iVar.f681g));
        iVar.f681g = false;
        if (iVar.f709q) {
            iVar.f710r = true;
        }
    }

    public int z(N5.o oVar, N5.o oVar2) {
        int i3 = (int) oVar.f4926a;
        int i10 = (int) oVar.f4927b;
        int i11 = (int) oVar2.f4926a;
        T5.b bVar = (T5.b) this.f8674b;
        int min = Math.min(bVar.f7184b - 1, (int) oVar2.f4927b);
        int i12 = 0;
        boolean z2 = Math.abs(min - i10) > Math.abs(i11 - i3);
        if (z2) {
            i3 = i10;
            i10 = i3;
            i11 = min;
            min = i11;
        }
        int abs = Math.abs(i11 - i3);
        int abs2 = Math.abs(min - i10);
        int i13 = (-abs) / 2;
        int i14 = i10 < min ? 1 : -1;
        int i15 = i3 >= i11 ? -1 : 1;
        boolean b2 = bVar.b(z2 ? i10 : i3, z2 ? i3 : i10);
        while (i3 != i11) {
            boolean b10 = bVar.b(z2 ? i10 : i3, z2 ? i3 : i10);
            if (b10 != b2) {
                i12++;
                b2 = b10;
            }
            i13 += abs2;
            if (i13 > 0) {
                if (i10 == min) {
                    return i12;
                }
                i10 += i14;
                i13 -= abs;
            }
            i3 += i15;
        }
        return i12;
    }

    public /* synthetic */ m(int i3, boolean z2) {
        this.f8673a = i3;
    }

    public /* synthetic */ m(Object obj, int i3) {
        this.f8673a = i3;
        this.f8674b = obj;
        this.f8675c = null;
    }

    public /* synthetic */ m(Object obj, Object obj2, int i3, boolean z2) {
        this.f8673a = i3;
        this.f8675c = obj;
        this.f8674b = obj2;
    }

    public m(q1 q1Var) {
        this.f8673a = 21;
        Objects.requireNonNull(q1Var);
        this.f8675c = q1Var;
    }

    public m(B6.a gesturesManager) {
        this.f8673a = 17;
        Intrinsics.checkNotNullParameter(gesturesManager, "gesturesManager");
        this.f8674b = gesturesManager;
        this.f8675c = new LinkedHashMap();
    }

    public m(MapboxMap mapboxMap, Y6.a cameraPlugin) {
        this.f8673a = 19;
        a5.c navigationCameraTransition = new a5.c(mapboxMap, cameraPlugin);
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(cameraPlugin, "cameraPlugin");
        Intrinsics.checkNotNullParameter(navigationCameraTransition, "navigationCameraTransition");
        this.f8674b = mapboxMap;
        this.f8675c = navigationCameraTransition;
    }

    public m(WorkDatabase_Impl database, int i3) {
        this.f8673a = i3;
        switch (i3) {
            case 27:
                this.f8674b = database;
                Intrinsics.checkNotNullParameter(database, "database");
                this.f8675c = new Q2.c(database, 4);
                break;
            default:
                this.f8674b = database;
                Intrinsics.checkNotNullParameter(database, "database");
                this.f8675c = new Q2.c(database, 1);
                break;
        }
    }

    public m(InterfaceC1225a[] interfaceC1225aArr) {
        this.f8673a = 22;
        this.f8674b = interfaceC1225aArr;
        this.f8675c = new C1145A(17);
    }

    public m(C0957b c0957b) {
        this.f8673a = 15;
        this.f8674b = new C0957b(c0957b);
        this.f8675c = new o0[(c0957b.f14227i - c0957b.f14226h) + 1];
    }

    public m(int i3) {
        this.f8673a = i3;
        switch (i3) {
            case 10:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f8674b = byteArrayOutputStream;
                this.f8675c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 28:
                Object emptyMap = MapsKt.emptyMap();
                this.f8674b = new b0(emptyMap == null ? AbstractC0347c.f7577b : emptyMap);
                this.f8675c = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(7472), StubApp.getString2(7473), StubApp.getString2(7474), StubApp.getString2(7475)});
                break;
            default:
                this.f8674b = new ReentrantLock();
                this.f8675c = new LinkedHashMap();
                break;
        }
    }

    public m(T5.b bVar) {
        this.f8673a = 1;
        this.f8674b = bVar;
        this.f8675c = new z(bVar);
    }

    public m(C0550b tracker) {
        this.f8673a = 5;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        m mVar = new m(3);
        this.f8674b = tracker;
        this.f8675c = mVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        this(context, new C1453e(1));
        this.f8673a = 29;
    }

    public m(Context context, C1453e c1453e) {
        this.f8673a = 29;
        this.f8674b = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f8675c = c1453e;
    }

    public m(Animator animator) {
        this.f8673a = 8;
        this.f8674b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f8675c = animatorSet;
        animatorSet.play(animator);
    }
}
