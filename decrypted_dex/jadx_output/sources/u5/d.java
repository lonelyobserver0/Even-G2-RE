package u5;

import Kc.AbstractC0095b;
import Kc.C0104k;
import P0.l;
import P0.p;
import R0.u;
import T.C0286b;
import T.InterfaceC0287c;
import T0.B;
import T0.H;
import T0.n;
import T0.q;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.stub.StubApp;
import i0.C1031d;
import i0.InterfaceC1029b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import q4.i;
import q4.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class d implements C1.a, E6.b, D3.b, H1.c, p, l, u, q, InterfaceC0287c, a4.c, InterfaceC1029b, U, i {

    /* renamed from: b, reason: collision with root package name */
    public static d f21450b;

    /* renamed from: c, reason: collision with root package name */
    public static d f21451c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21452a;

    public /* synthetic */ d(int i3) {
        this.f21452a = i3;
    }

    public static C0104k p(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(23565).concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i10 = i3 * 2;
            bArr[i3] = (byte) (Lc.b.a(str.charAt(i10 + 1)) + (Lc.b.a(str.charAt(i10)) << 4));
        }
        return new C0104k(bArr);
    }

    public static C0104k r(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        C0104k c0104k = new C0104k(bytes);
        c0104k.f3823c = str;
        return c0104k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(a0.C0381c r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.d.s(a0.c, android.text.Editable, int, int, boolean):boolean");
    }

    public static C0104k t(byte[] bArr) {
        C0104k c0104k = C0104k.f3820d;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        AbstractC0095b.f(bArr.length, 0, length);
        return new C0104k(ArraysKt.copyOfRange(bArr, 0, length));
    }

    @Override // T0.q
    public void D(B b2) {
    }

    @Override // P0.p
    public void a() {
    }

    public S b(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String string2 = StubApp.getString2(23566);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNull(newInstance);
            return (S) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(string2 + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(string2 + modelClass, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(string2 + modelClass, e12);
        }
    }

    @Override // H1.c
    public void c(int i3, Serializable serializable) {
    }

    @Override // a4.c
    public R0.d d(Context context, String str, a4.b bVar) {
        int c10;
        switch (this.f21452a) {
            case 25:
                R0.d dVar = new R0.d();
                int c11 = bVar.c(context, str, true);
                dVar.f5936c = c11;
                if (c11 != 0) {
                    dVar.f5937d = 1;
                } else {
                    int j = bVar.j(context, str);
                    dVar.f5935b = j;
                    if (j != 0) {
                        dVar.f5937d = -1;
                    }
                }
                return dVar;
            default:
                R0.d dVar2 = new R0.d();
                int j3 = bVar.j(context, str);
                dVar2.f5935b = j3;
                int i3 = 1;
                int i10 = 0;
                if (j3 != 0) {
                    c10 = bVar.c(context, str, false);
                    dVar2.f5936c = c10;
                } else {
                    c10 = bVar.c(context, str, true);
                    dVar2.f5936c = c10;
                }
                int i11 = dVar2.f5935b;
                if (i11 != 0) {
                    i10 = i11;
                } else if (c10 == 0) {
                    i3 = 0;
                    dVar2.f5937d = i3;
                    return dVar2;
                }
                if (i10 >= c10) {
                    i3 = -1;
                }
                dVar2.f5937d = i3;
                return dVar2;
        }
    }

    @Override // R0.u
    public void e() {
    }

    public S f(Class modelClass, C1031d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return b(modelClass);
    }

    @Override // H1.c
    public void g() {
    }

    @Override // Pb.a
    public Object get() {
        I4.e eVar = new I4.e(11);
        HashMap hashMap = new HashMap();
        y3.d dVar = y3.d.f23506a;
        Set set = Collections.EMPTY_SET;
        String string2 = StubApp.getString2(23567);
        if (set == null) {
            throw new NullPointerException(string2);
        }
        hashMap.put(dVar, new H3.c(30000L, 86400000L, set));
        y3.d dVar2 = y3.d.f23508c;
        if (set == null) {
            throw new NullPointerException(string2);
        }
        hashMap.put(dVar2, new H3.c(1000L, 86400000L, set));
        y3.d dVar3 = y3.d.f23507b;
        if (set == null) {
            throw new NullPointerException(string2);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(H3.e.f2711b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException(string2);
        }
        hashMap.put(dVar3, new H3.c(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < y3.d.values().length) {
            throw new IllegalStateException(StubApp.getString2(23568));
        }
        new HashMap();
        return new H3.b(eVar, hashMap);
    }

    @Override // C1.a
    public CharSequence h(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return listPreference.f9986a.getString(2131755216);
        }
        return null;
    }

    @Override // E6.b
    public Object i(String str) {
        switch (this.f21452a) {
            case 5:
                return str;
            default:
                if (str.equalsIgnoreCase(StubApp.getString2(6547))) {
                    return Boolean.TRUE;
                }
                if (str.equalsIgnoreCase(StubApp.getString2(9372))) {
                    return Boolean.FALSE;
                }
                throw new RuntimeException(StubApp.getString2(23569).concat(str));
        }
    }

    @Override // T.InterfaceC0287c
    public Object j(C0286b c0286b) {
        throw c0286b;
    }

    @Override // q4.i
    public j k(Object obj) {
        return a4.f.m(Boolean.TRUE);
    }

    @Override // P0.l
    public void l() {
        synchronized (Q0.b.f5689a) {
            Object obj = Q0.b.f5690b;
            synchronized (obj) {
                if (Q0.b.f5691c) {
                    return;
                }
                long a3 = Q0.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    Q0.b.f5692d = a3;
                    Q0.b.f5691c = true;
                }
            }
        }
    }

    @Override // R0.u
    public void m() {
    }

    @Override // androidx.lifecycle.U
    public S n(KClass modelClass, C1031d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return f(JvmClassMappingKt.getJavaClass(modelClass), extras);
    }

    @Override // P0.l
    public void o() {
    }

    @Override // T0.q
    public void q() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(java.util.List r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof L8.a
            if (r0 == 0) goto L13
            r0 = r7
            L8.a r0 = (L8.a) r0
            int r1 = r0.f4297c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4297c = r1
            goto L18
        L13:
            L8.a r0 = new L8.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f4295a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4297c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = 275(0x113, float:3.85E-43)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            Xb.d r7 = D9.h.f1516d
            L8.b r2 = new L8.b
            r4 = 0
            r2.<init>(r6, r4)
            r0.f4297c = r3
            java.lang.Object r7 = Qb.L.n(r7, r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r6 = "routes: List<NavigationR…,\n            )\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.d.u(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // T0.q
    public H w(int i3, int i10) {
        return new n();
    }
}
