package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class L implements U {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f9715n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f9716o = h0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f9717a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9718b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9719c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9720d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0420u f9721e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9722f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f9723g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9724h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9725i;
    public final N j;

    /* renamed from: k, reason: collision with root package name */
    public final A f9726k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f9727l;

    /* renamed from: m, reason: collision with root package name */
    public final H f9728m;

    public L(int[] iArr, Object[] objArr, int i3, int i10, AbstractC0420u abstractC0420u, int[] iArr2, int i11, int i12, N n10, A a3, c0 c0Var, C0414n c0414n, H h2) {
        this.f9717a = iArr;
        this.f9718b = objArr;
        this.f9719c = i3;
        this.f9720d = i10;
        this.f9722f = Objects.nonNull(abstractC0420u);
        this.f9723g = iArr2;
        this.f9724h = i11;
        this.f9725i = i12;
        this.j = n10;
        this.f9726k = a3;
        this.f9727l = c0Var;
        this.f9721e = abstractC0420u;
        this.f9728m = h2;
    }

    public static long A(long j, Object obj) {
        return ((Long) h0.f9794c.h(j, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder l9 = com.mapbox.common.b.l("Field ", str, " for ");
            Xa.h.w(cls, l9, " not found. Known fields are ");
            l9.append(Arrays.toString(declaredFields));
            throw new RuntimeException(l9.toString());
        }
    }

    public static int L(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0420u) {
            return ((AbstractC0420u) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.L x(androidx.datastore.preferences.protobuf.T r34, androidx.datastore.preferences.protobuf.N r35, androidx.datastore.preferences.protobuf.A r36, androidx.datastore.preferences.protobuf.c0 r37, androidx.datastore.preferences.protobuf.C0414n r38, androidx.datastore.preferences.protobuf.H r39) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.x(androidx.datastore.preferences.protobuf.T, androidx.datastore.preferences.protobuf.N, androidx.datastore.preferences.protobuf.A, androidx.datastore.preferences.protobuf.c0, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.H):androidx.datastore.preferences.protobuf.L");
    }

    public static long y(int i3) {
        return i3 & 1048575;
    }

    public static int z(long j, Object obj) {
        return ((Integer) h0.f9794c.h(j, obj)).intValue();
    }

    public final int B(int i3) {
        if (i3 >= this.f9719c && i3 <= this.f9720d) {
            int[] iArr = this.f9717a;
            int length = (iArr.length / 3) - 1;
            int i10 = 0;
            while (i10 <= length) {
                int i11 = (length + i10) >>> 1;
                int i12 = i11 * 3;
                int i13 = iArr[i12];
                if (i3 == i13) {
                    return i12;
                }
                if (i3 < i13) {
                    length = i11 - 1;
                } else {
                    i10 = i11 + 1;
                }
            }
        }
        return -1;
    }

    public final void C(Object obj, long j, Ab.g gVar, U u2, C0413m c0413m) {
        int v2;
        this.f9726k.getClass();
        InterfaceC0421v a3 = A.a(j, obj);
        int i3 = gVar.f275b;
        if ((i3 & 7) != 3) {
            throw C0424y.b();
        }
        do {
            AbstractC0420u d8 = u2.d();
            gVar.c(d8, u2, c0413m);
            u2.b(d8);
            ((S) a3).add(d8);
            AbstractC0410j abstractC0410j = (AbstractC0410j) gVar.f278e;
            if (abstractC0410j.d() || gVar.f277d != 0) {
                return;
            } else {
                v2 = abstractC0410j.v();
            }
        } while (v2 == i3);
        gVar.f277d = v2;
    }

    public final void D(Object obj, int i3, Ab.g gVar, U u2, C0413m c0413m) {
        int v2;
        this.f9726k.getClass();
        InterfaceC0421v a3 = A.a(i3 & 1048575, obj);
        int i10 = gVar.f275b;
        if ((i10 & 7) != 2) {
            throw C0424y.b();
        }
        do {
            AbstractC0420u d8 = u2.d();
            gVar.e(d8, u2, c0413m);
            u2.b(d8);
            ((S) a3).add(d8);
            AbstractC0410j abstractC0410j = (AbstractC0410j) gVar.f278e;
            if (abstractC0410j.d() || gVar.f277d != 0) {
                return;
            } else {
                v2 = abstractC0410j.v();
            }
        } while (v2 == i10);
        gVar.f277d = v2;
    }

    public final void E(int i3, Ab.g gVar, Object obj) {
        if ((536870912 & i3) != 0) {
            gVar.R(2);
            h0.o(obj, i3 & 1048575, ((AbstractC0410j) gVar.f278e).u());
        } else if (!this.f9722f) {
            h0.o(obj, i3 & 1048575, gVar.i());
        } else {
            gVar.R(2);
            h0.o(obj, i3 & 1048575, ((AbstractC0410j) gVar.f278e).t());
        }
    }

    public final void F(int i3, Ab.g gVar, Object obj) {
        boolean z2 = (536870912 & i3) != 0;
        A a3 = this.f9726k;
        if (z2) {
            a3.getClass();
            gVar.J(A.a(i3 & 1048575, obj), true);
        } else {
            a3.getClass();
            gVar.J(A.a(i3 & 1048575, obj), false);
        }
    }

    public final void H(int i3, Object obj) {
        int i10 = this.f9717a[i3 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        h0.m((1 << (i10 >>> 20)) | h0.f9794c.f(j, obj), j, obj);
    }

    public final void I(int i3, int i10, Object obj) {
        h0.m(i3, this.f9717a[i10 + 2] & 1048575, obj);
    }

    public final void J(Object obj, int i3, AbstractC0401a abstractC0401a) {
        f9716o.putObject(obj, M(i3) & 1048575, abstractC0401a);
        H(i3, obj);
    }

    public final void K(Object obj, int i3, int i10, AbstractC0401a abstractC0401a) {
        f9716o.putObject(obj, M(i10) & 1048575, abstractC0401a);
        I(i3, i10, obj);
    }

    public final int M(int i3) {
        return this.f9717a[i3 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void N(Object obj, D d8) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        L l9 = this;
        int i15 = 2;
        int[] iArr = l9.f9717a;
        int length = iArr.length;
        Unsafe unsafe = f9716o;
        int i16 = 1048575;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            int M5 = l9.M(i18);
            int i20 = iArr[i18];
            int L10 = L(M5);
            if (L10 <= 17) {
                int i21 = iArr[i18 + 2];
                i3 = 1;
                int i22 = i21 & i16;
                if (i22 != i17) {
                    i19 = i22 == i16 ? 0 : unsafe.getInt(obj, i22);
                    i17 = i22;
                }
                i10 = M5;
                i11 = 1 << (i21 >>> 20);
            } else {
                i3 = 1;
                i10 = M5;
                i11 = 0;
            }
            int i23 = i15;
            long j = i10 & i16;
            switch (L10) {
                case 0:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        double d10 = h0.f9794c.d(j, obj);
                        C0411k c0411k = (C0411k) d8.f9705a;
                        c0411k.getClass();
                        c0411k.c0(i20, Double.doubleToRawLongBits(d10));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        float e10 = h0.f9794c.e(j, obj);
                        C0411k c0411k2 = (C0411k) d8.f9705a;
                        c0411k2.getClass();
                        c0411k2.a0(i20, Float.floatToRawIntBits(e10));
                    }
                    l9 = this;
                    break;
                case 2:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).m0(i20, unsafe.getLong(obj, j));
                    }
                    l9 = this;
                    break;
                case 3:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).m0(i20, unsafe.getLong(obj, j));
                    }
                    l9 = this;
                    break;
                case 4:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).e0(i20, unsafe.getInt(obj, j));
                    }
                    l9 = this;
                    break;
                case 5:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).c0(i20, unsafe.getLong(obj, j));
                    }
                    l9 = this;
                    break;
                case 6:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).a0(i20, unsafe.getInt(obj, j));
                    }
                    l9 = this;
                    break;
                case 7:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).X(i20, h0.f9794c.c(j, obj));
                    }
                    l9 = this;
                    break;
                case 8:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C0411k) d8.f9705a).h0(i20, (String) object);
                        } else {
                            ((C0411k) d8.f9705a).Y(i20, (C0407g) object);
                        }
                    }
                    l9 = this;
                    break;
                case 9:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).g0(i20, (AbstractC0401a) unsafe.getObject(obj, j), l9.m(i18));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).Y(i20, (C0407g) unsafe.getObject(obj, j));
                    }
                    l9 = this;
                    break;
                case 11:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).k0(i20, unsafe.getInt(obj, j));
                    }
                    l9 = this;
                    break;
                case 12:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).e0(i20, unsafe.getInt(obj, j));
                    }
                    l9 = this;
                    break;
                case 13:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).a0(i20, unsafe.getInt(obj, j));
                    }
                    l9 = this;
                    break;
                case 14:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        ((C0411k) d8.f9705a).c0(i20, unsafe.getLong(obj, j));
                    }
                    l9 = this;
                    break;
                case 15:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        int i24 = unsafe.getInt(obj, j);
                        ((C0411k) d8.f9705a).k0(i20, (i24 >> 31) ^ (i24 << 1));
                        l9 = this;
                        break;
                    }
                    l9 = this;
                case 16:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        long j3 = unsafe.getLong(obj, j);
                        ((C0411k) d8.f9705a).m0(i20, (j3 >> 63) ^ (j3 << 1));
                    }
                    l9 = this;
                    break;
                case 17:
                    if (l9.o(obj, i18, i17, i19, i11)) {
                        d8.a(i20, unsafe.getObject(obj, j), l9.m(i18));
                    }
                    break;
                case 18:
                    i12 = i17;
                    V.n(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 19:
                    i12 = i17;
                    V.r(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 20:
                    i12 = i17;
                    V.t(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 21:
                    i12 = i17;
                    V.z(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 22:
                    i12 = i17;
                    V.s(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 23:
                    i12 = i17;
                    V.q(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 24:
                    i12 = i17;
                    V.p(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 25:
                    i12 = i17;
                    V.m(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 26:
                    i13 = i17;
                    int i25 = iArr[i18];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = V.f9744a;
                    if (list != null && !list.isEmpty()) {
                        d8.getClass();
                        for (int i26 = 0; i26 < list.size(); i26++) {
                            ((C0411k) d8.f9705a).h0(i25, (String) list.get(i26));
                        }
                    }
                    i17 = i13;
                    break;
                case 27:
                    i13 = i17;
                    int i27 = iArr[i18];
                    List list2 = (List) unsafe.getObject(obj, j);
                    U m4 = l9.m(i18);
                    Class cls2 = V.f9744a;
                    if (list2 != null && !list2.isEmpty()) {
                        d8.getClass();
                        for (int i28 = 0; i28 < list2.size(); i28++) {
                            ((C0411k) d8.f9705a).g0(i27, (AbstractC0401a) list2.get(i28), m4);
                        }
                    }
                    i17 = i13;
                    break;
                case 28:
                    i13 = i17;
                    int i29 = iArr[i18];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = V.f9744a;
                    if (list3 != null && !list3.isEmpty()) {
                        d8.getClass();
                        for (int i30 = 0; i30 < list3.size(); i30++) {
                            ((C0411k) d8.f9705a).Y(i29, (C0407g) list3.get(i30));
                        }
                    }
                    i17 = i13;
                    break;
                case 29:
                    i12 = i17;
                    V.y(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 30:
                    i12 = i17;
                    V.o(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 31:
                    i12 = i17;
                    V.u(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 32:
                    i12 = i17;
                    V.v(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 33:
                    i12 = i17;
                    V.w(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 34:
                    i12 = i17;
                    V.x(iArr[i18], (List) unsafe.getObject(obj, j), d8, false);
                    i17 = i12;
                    break;
                case 35:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.n(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.r(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.t(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.z(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.s(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case 40:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.q(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.p(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.m(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.y(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.o(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.u(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case 46:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.v(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.w(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case 48:
                    i14 = i17;
                    z2 = i3 == true ? 1 : 0;
                    V.x(iArr[i18], (List) unsafe.getObject(obj, j), d8, z2);
                    i17 = i14;
                    break;
                case 49:
                    i14 = i17;
                    int i31 = iArr[i18];
                    List list4 = (List) unsafe.getObject(obj, j);
                    U m10 = l9.m(i18);
                    Class cls4 = V.f9744a;
                    if (list4 != null && !list4.isEmpty()) {
                        d8.getClass();
                        for (int i32 = 0; i32 < list4.size(); i32++) {
                            d8.a(i31, list4.get(i32), m10);
                        }
                    }
                    z2 = true;
                    i17 = i14;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object obj2 = l9.f9718b[(i18 / 3) * i23];
                        l9.f9728m.getClass();
                        E e11 = ((F) obj2).f9709a;
                        C0411k c0411k3 = (C0411k) d8.f9705a;
                        c0411k3.getClass();
                        for (Map.Entry entry : ((G) object2).entrySet()) {
                            c0411k3.j0(i20, i23);
                            c0411k3.l0(F.a(e11, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0416p.b(c0411k3, e11.f9706a, i3, key);
                            i23 = 2;
                            C0416p.b(c0411k3, e11.f9707b, 2, value);
                            i17 = i17;
                            i3 = 1;
                        }
                    }
                    i13 = i17;
                    i17 = i13;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (l9.q(i20, i18, obj)) {
                        double doubleValue = ((Double) h0.f9794c.h(j, obj)).doubleValue();
                        C0411k c0411k4 = (C0411k) d8.f9705a;
                        c0411k4.getClass();
                        c0411k4.c0(i20, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (l9.q(i20, i18, obj)) {
                        float floatValue = ((Float) h0.f9794c.h(j, obj)).floatValue();
                        C0411k c0411k5 = (C0411k) d8.f9705a;
                        c0411k5.getClass();
                        c0411k5.a0(i20, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case EACTags.SEX /* 53 */:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).m0(i20, A(j, obj));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).m0(i20, A(j, obj));
                    }
                    break;
                case 55:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).e0(i20, z(j, obj));
                    }
                    break;
                case 56:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).c0(i20, A(j, obj));
                    }
                    break;
                case 57:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).a0(i20, z(j, obj));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).X(i20, ((Boolean) h0.f9794c.h(j, obj)).booleanValue());
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (l9.q(i20, i18, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((C0411k) d8.f9705a).h0(i20, (String) object3);
                        } else {
                            ((C0411k) d8.f9705a).Y(i20, (C0407g) object3);
                        }
                    }
                    break;
                case 60:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).g0(i20, (AbstractC0401a) unsafe.getObject(obj, j), l9.m(i18));
                    }
                    break;
                case 61:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).Y(i20, (C0407g) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).k0(i20, z(j, obj));
                    }
                    break;
                case 63:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).e0(i20, z(j, obj));
                    }
                    break;
                case 64:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).a0(i20, z(j, obj));
                    }
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (l9.q(i20, i18, obj)) {
                        ((C0411k) d8.f9705a).c0(i20, A(j, obj));
                    }
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (l9.q(i20, i18, obj)) {
                        int z10 = z(j, obj);
                        ((C0411k) d8.f9705a).k0(i20, (z10 >> 31) ^ (z10 << 1));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (l9.q(i20, i18, obj)) {
                        long A4 = A(j, obj);
                        ((C0411k) d8.f9705a).m0(i20, (A4 << (i3 == true ? 1L : 0L)) ^ (A4 >> 63));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (l9.q(i20, i18, obj)) {
                        d8.a(i20, unsafe.getObject(obj, j), l9.m(i18));
                    }
                    break;
            }
            i18 += 3;
            i15 = i23;
            i16 = 1048575;
        }
        l9.f9727l.getClass();
        ((AbstractC0420u) obj).unknownFields.d(d8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.U
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException(Xa.h.m(obj, "Mutating immutable message: "));
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f9717a;
            if (i3 >= iArr.length) {
                V.k(this.f9727l, obj, obj2);
                return;
            }
            int M5 = M(i3);
            long j = 1048575 & M5;
            int i10 = iArr[i3];
            switch (L(M5)) {
                case 0:
                    if (n(i3, obj2)) {
                        g0 g0Var = h0.f9794c;
                        obj3 = obj;
                        g0Var.l(obj3, j, g0Var.d(j, obj2));
                        H(i3, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i3, obj2)) {
                        g0 g0Var2 = h0.f9794c;
                        g0Var2.m(obj, j, g0Var2.e(j, obj2));
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i3, obj2)) {
                        h0.n(obj, j, h0.f9794c.g(j, obj2));
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i3, obj2)) {
                        h0.n(obj, j, h0.f9794c.g(j, obj2));
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i3, obj2)) {
                        h0.m(h0.f9794c.f(j, obj2), j, obj);
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i3, obj2)) {
                        h0.n(obj, j, h0.f9794c.g(j, obj2));
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i3, obj2)) {
                        h0.m(h0.f9794c.f(j, obj2), j, obj);
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i3, obj2)) {
                        g0 g0Var3 = h0.f9794c;
                        g0Var3.j(obj, j, g0Var3.c(j, obj2));
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i3, obj2)) {
                        h0.o(obj, j, h0.f9794c.h(j, obj2));
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    t(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i3, obj2)) {
                        h0.o(obj, j, h0.f9794c.h(j, obj2));
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i3, obj2)) {
                        h0.m(h0.f9794c.f(j, obj2), j, obj);
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i3, obj2)) {
                        h0.m(h0.f9794c.f(j, obj2), j, obj);
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i3, obj2)) {
                        h0.m(h0.f9794c.f(j, obj2), j, obj);
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i3, obj2)) {
                        h0.n(obj, j, h0.f9794c.g(j, obj2));
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i3, obj2)) {
                        h0.m(h0.f9794c.f(j, obj2), j, obj);
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i3, obj2)) {
                        h0.n(obj, j, h0.f9794c.g(j, obj2));
                        H(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    t(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                case 40:
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                case EACTags.CURRENCY_CODE /* 42 */:
                case EACTags.DATE_OF_BIRTH /* 43 */:
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                case 46:
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                case 48:
                case 49:
                    this.f9726k.getClass();
                    g0 g0Var4 = h0.f9794c;
                    InterfaceC0421v interfaceC0421v = (InterfaceC0421v) g0Var4.h(j, obj);
                    InterfaceC0421v interfaceC0421v2 = (InterfaceC0421v) g0Var4.h(j, obj2);
                    S s10 = (S) interfaceC0421v;
                    int i11 = s10.f9739c;
                    int i12 = ((S) interfaceC0421v2).f9739c;
                    if (i11 > 0 && i12 > 0) {
                        if (!((AbstractC0402b) interfaceC0421v).f9763a) {
                            interfaceC0421v = s10.c(i12 + i11);
                        }
                        ((AbstractC0402b) interfaceC0421v).addAll(interfaceC0421v2);
                    }
                    if (i11 > 0) {
                        interfaceC0421v2 = interfaceC0421v;
                    }
                    h0.o(obj, j, interfaceC0421v2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = V.f9744a;
                    g0 g0Var5 = h0.f9794c;
                    Object h2 = g0Var5.h(j, obj);
                    Object h4 = g0Var5.h(j, obj2);
                    this.f9728m.getClass();
                    h0.o(obj, j, H.a(h2, h4));
                    obj3 = obj;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                case EACTags.SEX /* 53 */:
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                case 55:
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (q(i10, i3, obj2)) {
                        h0.o(obj, j, h0.f9794c.h(j, obj2));
                        I(i10, i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    u(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (q(i10, i3, obj2)) {
                        h0.o(obj, j, h0.f9794c.h(j, obj2));
                        I(i10, i3, obj);
                    }
                    obj3 = obj;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    u(i3, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i3 += 3;
            obj = obj3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0420u) {
                AbstractC0420u abstractC0420u = (AbstractC0420u) obj;
                abstractC0420u.k(IntCompanionObject.MAX_VALUE);
                abstractC0420u.memoizedHashCode = 0;
                abstractC0420u.h();
            }
            int[] iArr = this.f9717a;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int M5 = M(i3);
                long j = 1048575 & M5;
                int L10 = L(M5);
                if (L10 != 9) {
                    if (L10 != 60 && L10 != 68) {
                        switch (L10) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                            case 40:
                            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                            case EACTags.CURRENCY_CODE /* 42 */:
                            case EACTags.DATE_OF_BIRTH /* 43 */:
                            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                            case 46:
                            case EACTags.PIN_USAGE_POLICY /* 47 */:
                            case 48:
                            case 49:
                                this.f9726k.getClass();
                                AbstractC0402b abstractC0402b = (AbstractC0402b) ((InterfaceC0421v) h0.f9794c.h(j, obj));
                                if (abstractC0402b.f9763a) {
                                    abstractC0402b.f9763a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = f9716o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f9728m.getClass();
                                    ((G) object).f9711a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i3], i3, obj)) {
                        m(i3).b(f9716o.getObject(obj, j));
                    }
                }
                if (n(i3, obj)) {
                    m(i3).b(f9716o.getObject(obj, j));
                }
            }
            this.f9727l.getClass();
            b0 b0Var = ((AbstractC0420u) obj).unknownFields;
            if (b0Var.f9769e) {
                b0Var.f9769e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean c(Object obj) {
        int i3;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f9724h) {
            int i15 = this.f9723g[i14];
            int[] iArr = this.f9717a;
            int i16 = iArr[i15];
            int M5 = M(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f9716o.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i13;
                i3 = i18;
            } else {
                int i20 = i13;
                i3 = i12;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & M5) == 0 || o(obj, i10, i3, i11, i19)) {
                int L10 = L(M5);
                if (L10 == 9 || L10 == 17) {
                    if (o(obj, i10, i3, i11, i19)) {
                        if (!m(i10).c(h0.f9794c.h(M5 & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i3;
                    i13 = i11;
                } else {
                    if (L10 != 27) {
                        if (L10 == 60 || L10 == 68) {
                            if (q(i16, i10, obj)) {
                                if (!m(i10).c(h0.f9794c.h(M5 & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i3;
                            i13 = i11;
                        } else if (L10 != 49) {
                            if (L10 != 50) {
                                continue;
                            } else {
                                Object h2 = h0.f9794c.h(M5 & 1048575, obj);
                                this.f9728m.getClass();
                                G g10 = (G) h2;
                                if (g10.isEmpty()) {
                                    continue;
                                } else {
                                    if (((F) this.f9718b[(i10 / 3) * 2]).f9709a.f9707b.f9830a != q0.MESSAGE) {
                                        continue;
                                    } else {
                                        U u2 = null;
                                        for (Object obj2 : g10.values()) {
                                            if (u2 == null) {
                                                u2 = Q.f9734c.a(obj2.getClass());
                                            }
                                            if (!u2.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i14++;
                            i12 = i3;
                            i13 = i11;
                        }
                    }
                    List list = (List) h0.f9794c.h(M5 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        U m4 = m(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (m4.c(list.get(i21))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i3;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final AbstractC0420u d() {
        this.j.getClass();
        return this.f9721e.i();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void e(Object obj, D d8) {
        d8.getClass();
        N(obj, d8);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void f(Object obj, Ab.g gVar, C0413m c0413m) {
        c0413m.getClass();
        if (!p(obj)) {
            throw new IllegalArgumentException(Xa.h.m(obj, "Mutating immutable message: "));
        }
        r(this.f9727l, obj, gVar, c0413m);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.U
    public final int g(AbstractC0420u abstractC0420u) {
        int i3;
        int i10;
        int Q10;
        int Q11;
        int Q12;
        int S5;
        int Q13;
        int S10;
        int Q14;
        int Q15;
        int O7;
        int Q16;
        int size;
        int i11;
        int Q17;
        int Q18;
        int size2;
        int Q19;
        int R10;
        int i12;
        int Q20;
        int Q21;
        int Q22;
        int S11;
        int Q23;
        int S12;
        int Q24;
        int R11;
        L l9 = this;
        AbstractC0420u abstractC0420u2 = abstractC0420u;
        int i13 = 1;
        Unsafe unsafe = f9716o;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (true) {
            int[] iArr = l9.f9717a;
            if (i14 >= iArr.length) {
                l9.f9727l.getClass();
                return abstractC0420u2.unknownFields.b() + i16;
            }
            int M5 = l9.M(i14);
            int L10 = L(M5);
            int i18 = iArr[i14];
            int i19 = iArr[i14 + 2];
            int i20 = i19 & 1048575;
            if (L10 <= 17) {
                if (i20 != i17) {
                    i15 = i20 == 1048575 ? 0 : unsafe.getInt(abstractC0420u2, i20);
                    i17 = i20;
                }
                i3 = i13 << (i19 >>> 20);
            } else {
                i3 = 0;
            }
            long j = M5 & 1048575;
            if (L10 >= EnumC0417q.f9832b.f9837a) {
                int i21 = EnumC0417q.f9833c.f9837a;
            }
            switch (L10) {
                case 0:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        Q10 = C0411k.Q(i18) + 8;
                        i16 += Q10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        Q11 = C0411k.Q(i18);
                        Q15 = Q11 + 4;
                        i16 += Q15;
                    }
                    l9 = this;
                    abstractC0420u2 = abstractC0420u;
                    break;
                case 2:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        long j3 = unsafe.getLong(abstractC0420u2, j);
                        Q12 = C0411k.Q(i18);
                        S5 = C0411k.S(j3);
                        i16 += S5 + Q12;
                    }
                    l9 = this;
                    break;
                case 3:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        long j10 = unsafe.getLong(abstractC0420u2, j);
                        Q12 = C0411k.Q(i18);
                        S5 = C0411k.S(j10);
                        i16 += S5 + Q12;
                    }
                    l9 = this;
                    break;
                case 4:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        int i22 = unsafe.getInt(abstractC0420u2, j);
                        Q13 = C0411k.Q(i18);
                        S10 = C0411k.S(i22);
                        O7 = S10 + Q13;
                        i16 += O7;
                    }
                    l9 = this;
                    break;
                case 5:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        Q14 = C0411k.Q(i18);
                        Q15 = Q14 + 8;
                        i16 += Q15;
                    }
                    l9 = this;
                    abstractC0420u2 = abstractC0420u;
                    break;
                case 6:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        Q11 = C0411k.Q(i18);
                        Q15 = Q11 + 4;
                        i16 += Q15;
                    }
                    l9 = this;
                    abstractC0420u2 = abstractC0420u;
                    break;
                case 7:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        Q15 = C0411k.Q(i18) + 1;
                        i16 += Q15;
                    }
                    l9 = this;
                    abstractC0420u2 = abstractC0420u;
                    break;
                case 8:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        Object object = unsafe.getObject(abstractC0420u2, j);
                        i16 = (object instanceof C0407g ? C0411k.O(i18, (C0407g) object) : C0411k.P((String) object) + C0411k.Q(i18)) + i16;
                    }
                    l9 = this;
                    break;
                case 9:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        Object object2 = unsafe.getObject(abstractC0420u2, j);
                        U m4 = l9.m(i14);
                        Class cls = V.f9744a;
                        int Q25 = C0411k.Q(i18);
                        int a3 = ((AbstractC0401a) object2).a(m4);
                        i16 += C0411k.R(a3) + a3 + Q25;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        O7 = C0411k.O(i18, (C0407g) unsafe.getObject(abstractC0420u2, j));
                        i16 += O7;
                    }
                    l9 = this;
                    break;
                case 11:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        int i23 = unsafe.getInt(abstractC0420u2, j);
                        Q13 = C0411k.Q(i18);
                        S10 = C0411k.R(i23);
                        O7 = S10 + Q13;
                        i16 += O7;
                    }
                    l9 = this;
                    break;
                case 12:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        int i24 = unsafe.getInt(abstractC0420u2, j);
                        Q13 = C0411k.Q(i18);
                        S10 = C0411k.S(i24);
                        O7 = S10 + Q13;
                        i16 += O7;
                    }
                    l9 = this;
                    break;
                case 13:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        Q11 = C0411k.Q(i18);
                        Q15 = Q11 + 4;
                        i16 += Q15;
                    }
                    l9 = this;
                    abstractC0420u2 = abstractC0420u;
                    break;
                case 14:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        Q14 = C0411k.Q(i18);
                        Q15 = Q14 + 8;
                        i16 += Q15;
                    }
                    l9 = this;
                    abstractC0420u2 = abstractC0420u;
                    break;
                case 15:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        int i25 = unsafe.getInt(abstractC0420u2, j);
                        Q13 = C0411k.Q(i18);
                        S10 = C0411k.R((i25 >> 31) ^ (i25 << 1));
                        O7 = S10 + Q13;
                        i16 += O7;
                    }
                    l9 = this;
                    break;
                case 16:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        long j11 = unsafe.getLong(abstractC0420u2, j);
                        Q12 = C0411k.Q(i18);
                        S5 = C0411k.S((j11 >> 63) ^ (j11 << i10));
                        i16 += S5 + Q12;
                    }
                    l9 = this;
                    break;
                case 17:
                    i10 = i13;
                    if (l9.o(abstractC0420u2, i14, i17, i15, i3)) {
                        Q10 = ((AbstractC0401a) unsafe.getObject(abstractC0420u2, j)).a(l9.m(i14)) + (C0411k.Q(i18) * 2);
                        i16 += Q10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i10 = i13;
                    Q10 = V.c(i18, (List) unsafe.getObject(abstractC0420u2, j));
                    i16 += Q10;
                    break;
                case 19:
                    i10 = i13;
                    Q10 = V.b(i18, (List) unsafe.getObject(abstractC0420u2, j));
                    i16 += Q10;
                    break;
                case 20:
                    i10 = i13;
                    List list = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls2 = V.f9744a;
                    if (list.size() != 0) {
                        Q16 = (C0411k.Q(i18) * list.size()) + V.e(list);
                        i16 += Q16;
                        break;
                    }
                    Q16 = 0;
                    i16 += Q16;
                case 21:
                    i10 = i13;
                    List list2 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls3 = V.f9744a;
                    size = list2.size();
                    if (size != 0) {
                        i11 = V.i(list2);
                        Q17 = C0411k.Q(i18);
                        Q16 = (Q17 * size) + i11;
                        i16 += Q16;
                        break;
                    }
                    Q16 = 0;
                    i16 += Q16;
                case 22:
                    i10 = i13;
                    List list3 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls4 = V.f9744a;
                    size = list3.size();
                    if (size != 0) {
                        i11 = V.d(list3);
                        Q17 = C0411k.Q(i18);
                        Q16 = (Q17 * size) + i11;
                        i16 += Q16;
                        break;
                    }
                    Q16 = 0;
                    i16 += Q16;
                case 23:
                    i10 = i13;
                    Q10 = V.c(i18, (List) unsafe.getObject(abstractC0420u2, j));
                    i16 += Q10;
                    break;
                case 24:
                    i10 = i13;
                    Q10 = V.b(i18, (List) unsafe.getObject(abstractC0420u2, j));
                    i16 += Q10;
                    break;
                case 25:
                    i10 = i13;
                    List list4 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls5 = V.f9744a;
                    int size3 = list4.size();
                    i16 += size3 == 0 ? 0 : (C0411k.Q(i18) + 1) * size3;
                    break;
                case 26:
                    i10 = i13;
                    List list5 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls6 = V.f9744a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        Q16 = C0411k.Q(i18) * size4;
                        for (int i26 = 0; i26 < size4; i26++) {
                            Object obj = list5.get(i26);
                            if (obj instanceof C0407g) {
                                int size5 = ((C0407g) obj).size();
                                Q16 = C0411k.R(size5) + size5 + Q16;
                            } else {
                                Q16 = C0411k.P((String) obj) + Q16;
                            }
                        }
                        i16 += Q16;
                        break;
                    }
                    Q16 = 0;
                    i16 += Q16;
                case 27:
                    i10 = i13;
                    List list6 = (List) unsafe.getObject(abstractC0420u2, j);
                    U m10 = l9.m(i14);
                    Class cls7 = V.f9744a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        Q18 = 0;
                    } else {
                        Q18 = C0411k.Q(i18) * size6;
                        for (int i27 = 0; i27 < size6; i27++) {
                            int a9 = ((AbstractC0401a) list6.get(i27)).a(m10);
                            Q18 += C0411k.R(a9) + a9;
                        }
                    }
                    i16 += Q18;
                    break;
                case 28:
                    i10 = i13;
                    List list7 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls8 = V.f9744a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        Q16 = C0411k.Q(i18) * size7;
                        for (int i28 = 0; i28 < list7.size(); i28++) {
                            int size8 = ((C0407g) list7.get(i28)).size();
                            Q16 += C0411k.R(size8) + size8;
                        }
                        i16 += Q16;
                        break;
                    }
                    Q16 = 0;
                    i16 += Q16;
                case 29:
                    i10 = i13;
                    List list8 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls9 = V.f9744a;
                    size = list8.size();
                    if (size != 0) {
                        i11 = V.h(list8);
                        Q17 = C0411k.Q(i18);
                        Q16 = (Q17 * size) + i11;
                        i16 += Q16;
                        break;
                    }
                    Q16 = 0;
                    i16 += Q16;
                case 30:
                    i10 = i13;
                    List list9 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls10 = V.f9744a;
                    size = list9.size();
                    if (size != 0) {
                        i11 = V.a(list9);
                        Q17 = C0411k.Q(i18);
                        Q16 = (Q17 * size) + i11;
                        i16 += Q16;
                        break;
                    }
                    Q16 = 0;
                    i16 += Q16;
                case 31:
                    i10 = i13;
                    Q10 = V.b(i18, (List) unsafe.getObject(abstractC0420u2, j));
                    i16 += Q10;
                    break;
                case 32:
                    i10 = i13;
                    Q10 = V.c(i18, (List) unsafe.getObject(abstractC0420u2, j));
                    i16 += Q10;
                    break;
                case 33:
                    i10 = i13;
                    List list10 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls11 = V.f9744a;
                    size = list10.size();
                    if (size != 0) {
                        i11 = V.f(list10);
                        Q17 = C0411k.Q(i18);
                        Q16 = (Q17 * size) + i11;
                        i16 += Q16;
                        break;
                    }
                    Q16 = 0;
                    i16 += Q16;
                case 34:
                    i10 = i13;
                    List list11 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls12 = V.f9744a;
                    size = list11.size();
                    if (size != 0) {
                        i11 = V.g(list11);
                        Q17 = C0411k.Q(i18);
                        Q16 = (Q17 * size) + i11;
                        i16 += Q16;
                        break;
                    }
                    Q16 = 0;
                    i16 += Q16;
                case 35:
                    i10 = i13;
                    List list12 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls13 = V.f9744a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                    i10 = i13;
                    List list13 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls14 = V.f9744a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i10 = i13;
                    size2 = V.e((List) unsafe.getObject(abstractC0420u2, j));
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i10 = i13;
                    size2 = V.i((List) unsafe.getObject(abstractC0420u2, j));
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i10 = i13;
                    size2 = V.d((List) unsafe.getObject(abstractC0420u2, j));
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    i10 = i13;
                    List list14 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls15 = V.f9744a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i10 = i13;
                    List list15 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls16 = V.f9744a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_CODE /* 42 */:
                    i10 = i13;
                    List list16 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls17 = V.f9744a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i10 = i13;
                    size2 = V.h((List) unsafe.getObject(abstractC0420u2, j));
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i10 = i13;
                    size2 = V.a((List) unsafe.getObject(abstractC0420u2, j));
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i10 = i13;
                    List list17 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls18 = V.f9744a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i10 = i13;
                    List list18 = (List) unsafe.getObject(abstractC0420u2, j);
                    Class cls19 = V.f9744a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    i10 = i13;
                    size2 = V.f((List) unsafe.getObject(abstractC0420u2, j));
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    i10 = i13;
                    size2 = V.g((List) unsafe.getObject(abstractC0420u2, j));
                    if (size2 > 0) {
                        Q19 = C0411k.Q(i18);
                        R10 = C0411k.R(size2);
                        i16 += R10 + Q19 + size2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    i10 = i13;
                    List list19 = (List) unsafe.getObject(abstractC0420u2, j);
                    U m11 = l9.m(i14);
                    Class cls20 = V.f9744a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i29 = 0; i29 < size9; i29++) {
                            i12 += ((AbstractC0401a) list19.get(i29)).a(m11) + (C0411k.Q(i18) * 2);
                        }
                    }
                    i16 += i12;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0420u2, j);
                    Object obj2 = l9.f9718b[(i14 / 3) * 2];
                    l9.f9728m.getClass();
                    G g10 = (G) object3;
                    F f10 = (F) obj2;
                    if (g10.isEmpty()) {
                        Q18 = 0;
                    } else {
                        Q18 = 0;
                        for (Map.Entry entry : g10.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            f10.getClass();
                            int Q26 = C0411k.Q(i18);
                            int i30 = i13;
                            int a10 = F.a(f10.f9709a, key, value);
                            Q18 += C0411k.R(a10) + a10 + Q26;
                            i13 = i30;
                        }
                    }
                    i10 = i13;
                    i16 += Q18;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Q20 = C0411k.Q(i18);
                        Q24 = Q20 + 8;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Q21 = C0411k.Q(i18);
                        Q24 = Q21 + 4;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case EACTags.SEX /* 53 */:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        long A4 = A(j, abstractC0420u2);
                        Q22 = C0411k.Q(i18);
                        S11 = C0411k.S(A4);
                        R11 = S11 + Q22;
                        i16 += R11;
                    }
                    i10 = i13;
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        long A5 = A(j, abstractC0420u2);
                        Q22 = C0411k.Q(i18);
                        S11 = C0411k.S(A5);
                        R11 = S11 + Q22;
                        i16 += R11;
                    }
                    i10 = i13;
                    break;
                case 55:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        int z2 = z(j, abstractC0420u2);
                        Q23 = C0411k.Q(i18);
                        S12 = C0411k.S(z2);
                        Q24 = S12 + Q23;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case 56:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Q20 = C0411k.Q(i18);
                        Q24 = Q20 + 8;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case 57:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Q21 = C0411k.Q(i18);
                        Q24 = Q21 + 4;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Q24 = C0411k.Q(i18) + i13;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Object object4 = unsafe.getObject(abstractC0420u2, j);
                        i16 = (object4 instanceof C0407g ? C0411k.O(i18, (C0407g) object4) : C0411k.P((String) object4) + C0411k.Q(i18)) + i16;
                    }
                    i10 = i13;
                    break;
                case 60:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Object object5 = unsafe.getObject(abstractC0420u2, j);
                        U m12 = l9.m(i14);
                        Class cls21 = V.f9744a;
                        int Q27 = C0411k.Q(i18);
                        int a11 = ((AbstractC0401a) object5).a(m12);
                        R11 = C0411k.R(a11) + a11 + Q27;
                        i16 += R11;
                    }
                    i10 = i13;
                    break;
                case 61:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Q24 = C0411k.O(i18, (C0407g) unsafe.getObject(abstractC0420u2, j));
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case 62:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        int z10 = z(j, abstractC0420u2);
                        Q23 = C0411k.Q(i18);
                        S12 = C0411k.R(z10);
                        Q24 = S12 + Q23;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case 63:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        int z11 = z(j, abstractC0420u2);
                        Q23 = C0411k.Q(i18);
                        S12 = C0411k.S(z11);
                        Q24 = S12 + Q23;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case 64:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Q21 = C0411k.Q(i18);
                        Q24 = Q21 + 4;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Q20 = C0411k.Q(i18);
                        Q24 = Q20 + 8;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        int z12 = z(j, abstractC0420u2);
                        Q23 = C0411k.Q(i18);
                        S12 = C0411k.R((z12 >> 31) ^ (z12 << 1));
                        Q24 = S12 + Q23;
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        long A7 = A(j, abstractC0420u2);
                        Q22 = C0411k.Q(i18);
                        S11 = C0411k.S((A7 << i13) ^ (A7 >> 63));
                        R11 = S11 + Q22;
                        i16 += R11;
                    }
                    i10 = i13;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (l9.q(i18, i14, abstractC0420u2)) {
                        Q24 = ((AbstractC0401a) unsafe.getObject(abstractC0420u2, j)).a(l9.m(i14)) + (C0411k.Q(i18) * 2);
                        i16 += Q24;
                    }
                    i10 = i13;
                    break;
                default:
                    i10 = i13;
                    break;
            }
            i14 += 3;
            i13 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.datastore.preferences.protobuf.AbstractC0420u r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.h(androidx.datastore.preferences.protobuf.u):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.V.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.V.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.V.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.V.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.V.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(androidx.datastore.preferences.protobuf.AbstractC0420u r12, androidx.datastore.preferences.protobuf.AbstractC0420u r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.i(androidx.datastore.preferences.protobuf.u, androidx.datastore.preferences.protobuf.u):boolean");
    }

    public final boolean j(AbstractC0420u abstractC0420u, AbstractC0420u abstractC0420u2, int i3) {
        return n(i3, abstractC0420u) == n(i3, abstractC0420u2);
    }

    public final void k(int i3, Object obj, Object obj2) {
        int i10 = this.f9717a[i3];
        if (h0.f9794c.h(M(i3) & 1048575, obj) == null) {
            return;
        }
        l(i3);
    }

    public final void l(int i3) {
        if (this.f9718b[((i3 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final U m(int i3) {
        int i10 = (i3 / 3) * 2;
        Object[] objArr = this.f9718b;
        U u2 = (U) objArr[i10];
        if (u2 != null) {
            return u2;
        }
        U a3 = Q.f9734c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a3;
        return a3;
    }

    public final boolean n(int i3, Object obj) {
        int i10 = this.f9717a[i3 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int M5 = M(i3);
            long j3 = M5 & 1048575;
            switch (L(M5)) {
                case 0:
                    if (Double.doubleToRawLongBits(h0.f9794c.d(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(h0.f9794c.e(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (h0.f9794c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (h0.f9794c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (h0.f9794c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (h0.f9794c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (h0.f9794c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return h0.f9794c.c(j3, obj);
                case 8:
                    Object h2 = h0.f9794c.h(j3, obj);
                    if (h2 instanceof String) {
                        return !((String) h2).isEmpty();
                    }
                    if (h2 instanceof C0407g) {
                        return !C0407g.f9780c.equals(h2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (h0.f9794c.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0407g.f9780c.equals(h0.f9794c.h(j3, obj));
                case 11:
                    if (h0.f9794c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (h0.f9794c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (h0.f9794c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (h0.f9794c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (h0.f9794c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (h0.f9794c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (h0.f9794c.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & h0.f9794c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i3, int i10, int i11, int i12) {
        return i10 == 1048575 ? n(i3, obj) : (i11 & i12) != 0;
    }

    public final boolean q(int i3, int i10, Object obj) {
        return h0.f9794c.f((long) (this.f9717a[i10 + 2] & 1048575), obj) == i3;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void r(androidx.datastore.preferences.protobuf.c0 r19, java.lang.Object r20, Ab.g r21, androidx.datastore.preferences.protobuf.C0413m r22) {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.r(androidx.datastore.preferences.protobuf.c0, java.lang.Object, Ab.g, androidx.datastore.preferences.protobuf.m):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0413m r12, Ab.g r13) {
        /*
            r8 = this;
            int r10 = r8.M(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.g0 r10 = androidx.datastore.preferences.protobuf.h0.f9794c
            java.lang.Object r10 = r10.h(r0, r9)
            androidx.datastore.preferences.protobuf.H r2 = r8.f9728m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.G r10 = androidx.datastore.preferences.protobuf.G.f9710b
            androidx.datastore.preferences.protobuf.G r10 = r10.b()
            androidx.datastore.preferences.protobuf.h0.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.G r3 = (androidx.datastore.preferences.protobuf.G) r3
            boolean r3 = r3.f9711a
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.G r3 = androidx.datastore.preferences.protobuf.G.f9710b
            androidx.datastore.preferences.protobuf.G r3 = r3.b()
            androidx.datastore.preferences.protobuf.H.a(r3, r10)
            androidx.datastore.preferences.protobuf.h0.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.G r10 = (androidx.datastore.preferences.protobuf.G) r10
            androidx.datastore.preferences.protobuf.F r11 = (androidx.datastore.preferences.protobuf.F) r11
            androidx.datastore.preferences.protobuf.E r9 = r11.f9709a
            r11 = 2
            r13.R(r11)
            java.lang.Object r0 = r13.f278e
            androidx.datastore.preferences.protobuf.j r0 = (androidx.datastore.preferences.protobuf.AbstractC0410j) r0
            int r1 = r0.w()
            int r1 = r0.f(r1)
            java.lang.String r2 = ""
            W.i r3 = r9.f9708c
            r4 = r3
        L55:
            int r5 = r13.b()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.d()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.S()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0423x -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.y r5 = new androidx.datastore.preferences.protobuf.y     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0423x -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0423x -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0423x -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.n0 r5 = r9.f9707b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0423x -> L8e
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0423x -> L8e
            java.lang.Object r4 = r13.q(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0423x -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.l0 r5 = r9.f9706a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0423x -> L8e
            r6 = 0
            java.lang.Object r2 = r13.q(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0423x -> L8e
            goto L55
        L8e:
            boolean r5 = r13.S()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.y r9 = new androidx.datastore.preferences.protobuf.y     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            r0.e(r1)
            return
        La2:
            r0.e(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.s(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.m, Ab.g):void");
    }

    public final void t(int i3, Object obj, Object obj2) {
        if (n(i3, obj2)) {
            long M5 = M(i3) & 1048575;
            Unsafe unsafe = f9716o;
            Object object = unsafe.getObject(obj2, M5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f9717a[i3] + " is present but null: " + obj2);
            }
            U m4 = m(i3);
            if (!n(i3, obj)) {
                if (p(object)) {
                    AbstractC0420u d8 = m4.d();
                    m4.a(d8, object);
                    unsafe.putObject(obj, M5, d8);
                } else {
                    unsafe.putObject(obj, M5, object);
                }
                H(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M5);
            if (!p(object2)) {
                AbstractC0420u d10 = m4.d();
                m4.a(d10, object2);
                unsafe.putObject(obj, M5, d10);
                object2 = d10;
            }
            m4.a(object2, object);
        }
    }

    public final void u(int i3, Object obj, Object obj2) {
        int[] iArr = this.f9717a;
        int i10 = iArr[i3];
        if (q(i10, i3, obj2)) {
            long M5 = M(i3) & 1048575;
            Unsafe unsafe = f9716o;
            Object object = unsafe.getObject(obj2, M5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2);
            }
            U m4 = m(i3);
            if (!q(i10, i3, obj)) {
                if (p(object)) {
                    AbstractC0420u d8 = m4.d();
                    m4.a(d8, object);
                    unsafe.putObject(obj, M5, d8);
                } else {
                    unsafe.putObject(obj, M5, object);
                }
                I(i10, i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M5);
            if (!p(object2)) {
                AbstractC0420u d10 = m4.d();
                m4.a(d10, object2);
                unsafe.putObject(obj, M5, d10);
                object2 = d10;
            }
            m4.a(object2, object);
        }
    }

    public final Object v(int i3, Object obj) {
        U m4 = m(i3);
        long M5 = M(i3) & 1048575;
        if (!n(i3, obj)) {
            return m4.d();
        }
        Object object = f9716o.getObject(obj, M5);
        if (p(object)) {
            return object;
        }
        AbstractC0420u d8 = m4.d();
        if (object != null) {
            m4.a(d8, object);
        }
        return d8;
    }

    public final Object w(int i3, int i10, Object obj) {
        U m4 = m(i10);
        if (!q(i3, i10, obj)) {
            return m4.d();
        }
        Object object = f9716o.getObject(obj, M(i10) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0420u d8 = m4.d();
        if (object != null) {
            m4.a(d8, object);
        }
        return d8;
    }
}
