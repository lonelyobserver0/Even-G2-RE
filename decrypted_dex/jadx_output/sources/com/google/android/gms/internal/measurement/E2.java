package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.eac.EACTags;
import p0.AbstractC1482f;
import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E2 implements L2 {
    public static final int[] j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f11251k = U2.k();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f11252a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f11253b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11254c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11255d;

    /* renamed from: e, reason: collision with root package name */
    public final V1 f11256e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f11257f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11258g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11259h;

    /* renamed from: i, reason: collision with root package name */
    public final C0629i2 f11260i;

    public E2(int[] iArr, Object[] objArr, int i3, int i10, V1 v12, int[] iArr2, int i11, int i12, C0629i2 c0629i2, C0629i2 c0629i22) {
        this.f11252a = iArr;
        this.f11253b = objArr;
        this.f11254c = i3;
        this.f11255d = i10;
        this.f11257f = iArr2;
        this.f11258g = i11;
        this.f11259h = i12;
        this.f11260i = c0629i2;
        this.f11256e = v12;
    }

    public static int F(int i3) {
        return (i3 >>> 20) & 255;
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0639k2) {
            return ((AbstractC0639k2) obj).e();
        }
        return true;
    }

    public static int k(long j3, Object obj) {
        return ((Integer) U2.i(j3, obj)).intValue();
    }

    public static long l(long j3, Object obj) {
        return ((Long) U2.i(j3, obj)).longValue();
    }

    public static final int s(byte[] bArr, int i3, int i10, X2 x22, Class cls, Y1 y12) {
        X2 x23 = X2.f11408c;
        switch (x22.ordinal()) {
            case 0:
                int i11 = i3 + 8;
                y12.f11419c = Double.valueOf(Double.longBitsToDouble(D1.z(i3, bArr)));
                return i11;
            case 1:
                int i12 = i3 + 4;
                y12.f11419c = Float.valueOf(Float.intBitsToFloat(D1.y(i3, bArr)));
                return i12;
            case 2:
            case 3:
                int x7 = D1.x(bArr, i3, y12);
                y12.f11419c = Long.valueOf(y12.f11418b);
                return x7;
            case 4:
            case 12:
            case 13:
                int v2 = D1.v(bArr, i3, y12);
                y12.f11419c = Integer.valueOf(y12.f11417a);
                return v2;
            case 5:
            case 15:
                int i13 = i3 + 8;
                y12.f11419c = Long.valueOf(D1.z(i3, bArr));
                return i13;
            case 6:
            case 14:
                int i14 = i3 + 4;
                y12.f11419c = Integer.valueOf(D1.y(i3, bArr));
                return i14;
            case 7:
                int x10 = D1.x(bArr, i3, y12);
                y12.f11419c = Boolean.valueOf(y12.f11418b != 0);
                return x10;
            case 8:
                return D1.A(bArr, i3, y12);
            case 9:
            default:
                throw new RuntimeException(StubApp.getString2(449));
            case 10:
                L2 a3 = I2.f11287c.a(cls);
                AbstractC0639k2 a9 = a3.a();
                int C10 = D1.C(a9, a3, bArr, i3, i10, y12);
                a3.f(a9);
                y12.f11419c = a9;
                return C10;
            case 11:
                return D1.B(bArr, i3, y12);
            case 16:
                int v8 = D1.v(bArr, i3, y12);
                y12.f11419c = Integer.valueOf(L1.G(y12.f11417a));
                return v8;
            case 17:
                int x11 = D1.x(bArr, i3, y12);
                y12.f11419c = Long.valueOf(L1.H(y12.f11418b));
                return x11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.E2 u(com.google.android.gms.internal.measurement.K2 r34, com.google.android.gms.internal.measurement.C0629i2 r35, com.google.android.gms.internal.measurement.C0629i2 r36) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.E2.u(com.google.android.gms.internal.measurement.K2, com.google.android.gms.internal.measurement.i2, com.google.android.gms.internal.measurement.i2):com.google.android.gms.internal.measurement.E2");
    }

    public static Field v(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            E1.a.v(sb2, StubApp.getString2(11633), str, StubApp.getString2(6035), name);
            throw new RuntimeException(AbstractC1482f.k(sb2, StubApp.getString2(11634), arrays), e10);
        }
    }

    public final Object A(int i3, Object obj) {
        L2 y10 = y(i3);
        int E10 = E(i3) & 1048575;
        if (!o(i3, obj)) {
            return y10.a();
        }
        Object object = f11251k.getObject(obj, E10);
        if (j(object)) {
            return object;
        }
        AbstractC0639k2 a3 = y10.a();
        if (object != null) {
            y10.c(a3, object);
        }
        return a3;
    }

    public final void B(int i3, Object obj, Object obj2) {
        f11251k.putObject(obj, E(i3) & 1048575, obj2);
        p(i3, obj);
    }

    public final Object C(int i3, int i10, Object obj) {
        L2 y10 = y(i10);
        if (!q(i3, i10, obj)) {
            return y10.a();
        }
        Object object = f11251k.getObject(obj, E(i10) & 1048575);
        if (j(object)) {
            return object;
        }
        AbstractC0639k2 a3 = y10.a();
        if (object != null) {
            y10.c(a3, object);
        }
        return a3;
    }

    public final void D(int i3, int i10, Object obj, Object obj2) {
        f11251k.putObject(obj, E(i10) & 1048575, obj2);
        U2.f(i3, this.f11252a[i10 + 2] & 1048575, obj);
    }

    public final int E(int i3) {
        return this.f11252a[i3 + 1];
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final AbstractC0639k2 a() {
        return (AbstractC0639k2) ((AbstractC0639k2) this.f11256e).o(4);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final int b(AbstractC0639k2 abstractC0639k2) {
        int i3;
        int T7;
        int C10;
        int i10;
        int T10;
        int size;
        int r8;
        int T11;
        int T12;
        int T13;
        int i11;
        int T14;
        int C11;
        E2 e22 = this;
        AbstractC0639k2 abstractC0639k22 = abstractC0639k2;
        Unsafe unsafe = f11251k;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = e22.f11252a;
            if (i14 >= iArr.length) {
                return abstractC0639k22.zzc.c() + i16;
            }
            int E10 = e22.E(i14);
            int F3 = F(E10);
            int i17 = iArr[i14];
            int i18 = iArr[i14 + 2];
            int i19 = i18 & i12;
            if (F3 <= 17) {
                if (i19 != i13) {
                    i15 = i19 == i12 ? 0 : unsafe.getInt(abstractC0639k22, i19);
                    i13 = i19;
                }
                i3 = 1 << (i18 >>> 20);
            } else {
                i3 = 0;
            }
            int i20 = E10 & i12;
            if (F3 >= EnumC0619g2.f11570b.f11574a) {
                EnumC0619g2.f11571c.getClass();
            }
            long j3 = i20;
            switch (F3) {
                case 0:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        i16 = Xa.h.d(i17 << 3, 8, i16);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        i16 = Xa.h.d(i17 << 3, 4, i16);
                    }
                    abstractC0639k22 = abstractC0639k2;
                    break;
                case 2:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        long j10 = unsafe.getLong(abstractC0639k22, j3);
                        T7 = C0599c2.T(i17 << 3);
                        C10 = C0599c2.C(j10);
                        i10 = C10 + T7;
                        i16 += i10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        long j11 = unsafe.getLong(abstractC0639k22, j3);
                        T7 = C0599c2.T(i17 << 3);
                        C10 = C0599c2.C(j11);
                        i10 = C10 + T7;
                        i16 += i10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        long j12 = unsafe.getInt(abstractC0639k22, j3);
                        T7 = C0599c2.T(i17 << 3);
                        C10 = C0599c2.C(j12);
                        i10 = C10 + T7;
                        i16 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        i16 = Xa.h.d(i17 << 3, 8, i16);
                    }
                    abstractC0639k22 = abstractC0639k2;
                    break;
                case 6:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        i16 = Xa.h.d(i17 << 3, 4, i16);
                    }
                    abstractC0639k22 = abstractC0639k2;
                    break;
                case 7:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        i16 = Xa.h.d(i17 << 3, 1, i16);
                    }
                    abstractC0639k22 = abstractC0639k2;
                    break;
                case 8:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        int i21 = i17 << 3;
                        Object object = unsafe.getObject(abstractC0639k22, j3);
                        if (object instanceof C0594b2) {
                            int T15 = C0599c2.T(i21);
                            int c10 = ((C0594b2) object).c();
                            i16 = Xa.h.e(c10, c10, T15, i16);
                            break;
                        } else {
                            T7 = C0599c2.T(i21);
                            C10 = C0599c2.D((String) object);
                            i10 = C10 + T7;
                            i16 += i10;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        Object object2 = unsafe.getObject(abstractC0639k22, j3);
                        L2 y10 = e22.y(i14);
                        C0629i2 c0629i2 = M2.f11311a;
                        int T16 = C0599c2.T(i17 << 3);
                        int b2 = ((V1) object2).b(y10);
                        i16 = Xa.h.e(b2, b2, T16, i16);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        C0594b2 c0594b2 = (C0594b2) unsafe.getObject(abstractC0639k22, j3);
                        int T17 = C0599c2.T(i17 << 3);
                        int c11 = c0594b2.c();
                        i16 = Xa.h.e(c11, c11, T17, i16);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        i16 = Xa.h.d(unsafe.getInt(abstractC0639k22, j3), C0599c2.T(i17 << 3), i16);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        long j13 = unsafe.getInt(abstractC0639k22, j3);
                        T7 = C0599c2.T(i17 << 3);
                        C10 = C0599c2.C(j13);
                        i10 = C10 + T7;
                        i16 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        i16 = Xa.h.d(i17 << 3, 4, i16);
                    }
                    abstractC0639k22 = abstractC0639k2;
                    break;
                case 14:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        i16 = Xa.h.d(i17 << 3, 8, i16);
                    }
                    abstractC0639k22 = abstractC0639k2;
                    break;
                case 15:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        int i22 = unsafe.getInt(abstractC0639k22, j3);
                        i16 = Xa.h.d((i22 >> 31) ^ (i22 + i22), C0599c2.T(i17 << 3), i16);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        long j14 = unsafe.getLong(abstractC0639k22, j3);
                        T7 = C0599c2.T(i17 << 3);
                        C10 = C0599c2.C((j14 >> 63) ^ (j14 + j14));
                        i10 = C10 + T7;
                        i16 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (e22.n(abstractC0639k22, i14, i13, i15, i3)) {
                        V1 v12 = (V1) unsafe.getObject(abstractC0639k22, j3);
                        L2 y11 = e22.y(i14);
                        int T18 = C0599c2.T(i17 << 3);
                        i10 = v12.b(y11) + T18 + T18;
                        i16 += i10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i10 = M2.y(i17, (List) unsafe.getObject(abstractC0639k22, j3));
                    i16 += i10;
                    break;
                case 19:
                    i10 = M2.x(i17, (List) unsafe.getObject(abstractC0639k22, j3));
                    i16 += i10;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i22 = M2.f11311a;
                    if (list.size() != 0) {
                        T10 = (C0599c2.T(i17 << 3) * list.size()) + M2.q(list);
                        i16 += T10;
                        break;
                    }
                    T10 = 0;
                    i16 += T10;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i23 = M2.f11311a;
                    size = list2.size();
                    if (size != 0) {
                        r8 = M2.r(list2);
                        T11 = C0599c2.T(i17 << 3);
                        T12 = (T11 * size) + r8;
                        i16 += T12;
                        break;
                    }
                    T12 = 0;
                    i16 += T12;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i24 = M2.f11311a;
                    size = list3.size();
                    if (size != 0) {
                        r8 = M2.u(list3);
                        T11 = C0599c2.T(i17 << 3);
                        T12 = (T11 * size) + r8;
                        i16 += T12;
                        break;
                    }
                    T12 = 0;
                    i16 += T12;
                case 23:
                    i10 = M2.y(i17, (List) unsafe.getObject(abstractC0639k22, j3));
                    i16 += i10;
                    break;
                case 24:
                    i10 = M2.x(i17, (List) unsafe.getObject(abstractC0639k22, j3));
                    i16 += i10;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i25 = M2.f11311a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        T10 = (C0599c2.T(i17 << 3) + 1) * size2;
                        i16 += T10;
                        break;
                    }
                    T10 = 0;
                    i16 += T10;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i26 = M2.f11311a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        T12 = C0599c2.T(i17 << 3) * size3;
                        for (int i23 = 0; i23 < size3; i23++) {
                            Object obj = list5.get(i23);
                            if (obj instanceof C0594b2) {
                                int c12 = ((C0594b2) obj).c();
                                T12 = Xa.h.d(c12, c12, T12);
                            } else {
                                T12 = C0599c2.D((String) obj) + T12;
                            }
                        }
                        i16 += T12;
                        break;
                    }
                    T12 = 0;
                    i16 += T12;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC0639k22, j3);
                    L2 y12 = e22.y(i14);
                    C0629i2 c0629i27 = M2.f11311a;
                    int size4 = list6.size();
                    if (size4 != 0) {
                        T13 = C0599c2.T(i17 << 3) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            int b10 = ((V1) list6.get(i24)).b(y12);
                            T13 = Xa.h.d(b10, b10, T13);
                        }
                        i16 += T13;
                        break;
                    }
                    T13 = 0;
                    i16 += T13;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i28 = M2.f11311a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        T12 = C0599c2.T(i17 << 3) * size5;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int c13 = ((C0594b2) list7.get(i25)).c();
                            T12 = Xa.h.d(c13, c13, T12);
                        }
                        i16 += T12;
                        break;
                    }
                    T12 = 0;
                    i16 += T12;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i29 = M2.f11311a;
                    size = list8.size();
                    if (size != 0) {
                        r8 = M2.v(list8);
                        T11 = C0599c2.T(i17 << 3);
                        T12 = (T11 * size) + r8;
                        i16 += T12;
                        break;
                    }
                    T12 = 0;
                    i16 += T12;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i210 = M2.f11311a;
                    size = list9.size();
                    if (size != 0) {
                        r8 = M2.t(list9);
                        T11 = C0599c2.T(i17 << 3);
                        T12 = (T11 * size) + r8;
                        i16 += T12;
                        break;
                    }
                    T12 = 0;
                    i16 += T12;
                case 31:
                    i10 = M2.x(i17, (List) unsafe.getObject(abstractC0639k22, j3));
                    i16 += i10;
                    break;
                case 32:
                    i10 = M2.y(i17, (List) unsafe.getObject(abstractC0639k22, j3));
                    i16 += i10;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i211 = M2.f11311a;
                    size = list10.size();
                    if (size != 0) {
                        r8 = M2.w(list10);
                        T11 = C0599c2.T(i17 << 3);
                        T12 = (T11 * size) + r8;
                        i16 += T12;
                        break;
                    }
                    T12 = 0;
                    i16 += T12;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i212 = M2.f11311a;
                    size = list11.size();
                    if (size != 0) {
                        r8 = M2.s(list11);
                        T11 = C0599c2.T(i17 << 3);
                        T12 = (T11 * size) + r8;
                        i16 += T12;
                        break;
                    }
                    T12 = 0;
                    i16 += T12;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i213 = M2.f11311a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i16 = Xa.h.e(size6, C0599c2.T(i17 << 3), size6, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i214 = M2.f11311a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i16 = Xa.h.e(size7, C0599c2.T(i17 << 3), size7, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    int q10 = M2.q((List) unsafe.getObject(abstractC0639k22, j3));
                    if (q10 > 0) {
                        i16 = Xa.h.e(q10, C0599c2.T(i17 << 3), q10, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    int r10 = M2.r((List) unsafe.getObject(abstractC0639k22, j3));
                    if (r10 > 0) {
                        i16 = Xa.h.e(r10, C0599c2.T(i17 << 3), r10, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    int u2 = M2.u((List) unsafe.getObject(abstractC0639k22, j3));
                    if (u2 > 0) {
                        i16 = Xa.h.e(u2, C0599c2.T(i17 << 3), u2, i16);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i215 = M2.f11311a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i16 = Xa.h.e(size8, C0599c2.T(i17 << 3), size8, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i216 = M2.f11311a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i16 = Xa.h.e(size9, C0599c2.T(i17 << 3), size9, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_CODE /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i217 = M2.f11311a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i16 = Xa.h.e(size10, C0599c2.T(i17 << 3), size10, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    int v2 = M2.v((List) unsafe.getObject(abstractC0639k22, j3));
                    if (v2 > 0) {
                        i16 = Xa.h.e(v2, C0599c2.T(i17 << 3), v2, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    int t3 = M2.t((List) unsafe.getObject(abstractC0639k22, j3));
                    if (t3 > 0) {
                        i16 = Xa.h.e(t3, C0599c2.T(i17 << 3), t3, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i218 = M2.f11311a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i16 = Xa.h.e(size11, C0599c2.T(i17 << 3), size11, i16);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0639k22, j3);
                    C0629i2 c0629i219 = M2.f11311a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i16 = Xa.h.e(size12, C0599c2.T(i17 << 3), size12, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    int w10 = M2.w((List) unsafe.getObject(abstractC0639k22, j3));
                    if (w10 > 0) {
                        i16 = Xa.h.e(w10, C0599c2.T(i17 << 3), w10, i16);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int s10 = M2.s((List) unsafe.getObject(abstractC0639k22, j3));
                    if (s10 > 0) {
                        i16 = Xa.h.e(s10, C0599c2.T(i17 << 3), s10, i16);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0639k22, j3);
                    L2 y13 = e22.y(i14);
                    C0629i2 c0629i220 = M2.f11311a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                        for (int i26 = 0; i26 < size13; i26++) {
                            V1 v13 = (V1) list19.get(i26);
                            int T19 = C0599c2.T(i17 << 3);
                            i11 += v13.b(y13) + T19 + T19;
                        }
                    }
                    i16 += i11;
                    break;
                case 50:
                    int i27 = i14 / 3;
                    A2 a22 = (A2) unsafe.getObject(abstractC0639k22, j3);
                    C0713z2 c0713z2 = (C0713z2) e22.f11253b[i27 + i27];
                    if (!a22.isEmpty()) {
                        T13 = 0;
                        for (Map.Entry entry : a22.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c0713z2.getClass();
                            int T20 = C0599c2.T(i17 << 3);
                            int b11 = C0713z2.b(c0713z2.f11772a, key, value);
                            T13 = Xa.h.e(b11, b11, T20, T13);
                        }
                        i16 += T13;
                        break;
                    }
                    T13 = 0;
                    i16 += T13;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        i16 = Xa.h.d(i17 << 3, 8, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        i16 = Xa.h.d(i17 << 3, 4, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        long l9 = l(j3, abstractC0639k22);
                        T14 = C0599c2.T(i17 << 3);
                        C11 = C0599c2.C(l9);
                        i16 += C11 + T14;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        long l10 = l(j3, abstractC0639k22);
                        T14 = C0599c2.T(i17 << 3);
                        C11 = C0599c2.C(l10);
                        i16 += C11 + T14;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        long k3 = k(j3, abstractC0639k22);
                        T14 = C0599c2.T(i17 << 3);
                        C11 = C0599c2.C(k3);
                        i16 += C11 + T14;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        i16 = Xa.h.d(i17 << 3, 8, i16);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        i16 = Xa.h.d(i17 << 3, 4, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        i16 = Xa.h.d(i17 << 3, 1, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        int i28 = i17 << 3;
                        Object object3 = unsafe.getObject(abstractC0639k22, j3);
                        if (object3 instanceof C0594b2) {
                            int T21 = C0599c2.T(i28);
                            int c14 = ((C0594b2) object3).c();
                            i16 = Xa.h.e(c14, c14, T21, i16);
                            break;
                        } else {
                            T14 = C0599c2.T(i28);
                            C11 = C0599c2.D((String) object3);
                            i16 += C11 + T14;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        Object object4 = unsafe.getObject(abstractC0639k22, j3);
                        L2 y14 = e22.y(i14);
                        C0629i2 c0629i221 = M2.f11311a;
                        int T22 = C0599c2.T(i17 << 3);
                        int b12 = ((V1) object4).b(y14);
                        i16 = Xa.h.e(b12, b12, T22, i16);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        C0594b2 c0594b22 = (C0594b2) unsafe.getObject(abstractC0639k22, j3);
                        int T23 = C0599c2.T(i17 << 3);
                        int c15 = c0594b22.c();
                        i16 = Xa.h.e(c15, c15, T23, i16);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        i16 = Xa.h.d(k(j3, abstractC0639k22), C0599c2.T(i17 << 3), i16);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        long k4 = k(j3, abstractC0639k22);
                        T14 = C0599c2.T(i17 << 3);
                        C11 = C0599c2.C(k4);
                        i16 += C11 + T14;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        i16 = Xa.h.d(i17 << 3, 4, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        i16 = Xa.h.d(i17 << 3, 8, i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        int k10 = k(j3, abstractC0639k22);
                        i16 = Xa.h.d((k10 >> 31) ^ (k10 + k10), C0599c2.T(i17 << 3), i16);
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        long l11 = l(j3, abstractC0639k22);
                        T14 = C0599c2.T(i17 << 3);
                        C11 = C0599c2.C((l11 >> 63) ^ (l11 + l11));
                        i16 += C11 + T14;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (e22.q(i17, i14, abstractC0639k22)) {
                        V1 v14 = (V1) unsafe.getObject(abstractC0639k22, j3);
                        L2 y15 = e22.y(i14);
                        int T24 = C0599c2.T(i17 << 3);
                        i10 = v14.b(y15) + T24 + T24;
                        i16 += i10;
                        break;
                    } else {
                        break;
                    }
            }
            i14 += 3;
            i12 = 1048575;
            e22 = this;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.L2
    public final void c(Object obj, Object obj2) {
        Object obj3;
        if (!j(obj)) {
            throw new IllegalArgumentException(StubApp.getString2(11635).concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f11252a;
            if (i3 >= iArr.length) {
                M2.b(obj, obj2);
                return;
            }
            int E10 = E(i3);
            int i10 = E10 & 1048575;
            int F3 = F(E10);
            int i11 = iArr[i3];
            long j3 = i10;
            switch (F3) {
                case 0:
                    if (o(i3, obj2)) {
                        T2 t22 = U2.f11388c;
                        obj3 = obj;
                        t22.g(obj3, j3, t22.f(j3, obj2));
                        p(i3, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (o(i3, obj2)) {
                        T2 t23 = U2.f11388c;
                        t23.e(obj, j3, t23.d(j3, obj2));
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(i3, obj2)) {
                        U2.h(obj, j3, U2.g(j3, obj2));
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(i3, obj2)) {
                        U2.h(obj, j3, U2.g(j3, obj2));
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(i3, obj2)) {
                        U2.f(U2.e(j3, obj2), j3, obj);
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (o(i3, obj2)) {
                        U2.h(obj, j3, U2.g(j3, obj2));
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (o(i3, obj2)) {
                        U2.f(U2.e(j3, obj2), j3, obj);
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (o(i3, obj2)) {
                        T2 t24 = U2.f11388c;
                        t24.c(obj, j3, t24.b(j3, obj2));
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (o(i3, obj2)) {
                        U2.j(obj, j3, U2.i(j3, obj2));
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    w(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (o(i3, obj2)) {
                        U2.j(obj, j3, U2.i(j3, obj2));
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (o(i3, obj2)) {
                        U2.f(U2.e(j3, obj2), j3, obj);
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (o(i3, obj2)) {
                        U2.f(U2.e(j3, obj2), j3, obj);
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (o(i3, obj2)) {
                        U2.f(U2.e(j3, obj2), j3, obj);
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (o(i3, obj2)) {
                        U2.h(obj, j3, U2.g(j3, obj2));
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (o(i3, obj2)) {
                        U2.f(U2.e(j3, obj2), j3, obj);
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (o(i3, obj2)) {
                        U2.h(obj, j3, U2.g(j3, obj2));
                        p(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    w(i3, obj, obj2);
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
                    InterfaceC0669q2 interfaceC0669q2 = (InterfaceC0669q2) U2.i(j3, obj);
                    InterfaceC0669q2 interfaceC0669q22 = (InterfaceC0669q2) U2.i(j3, obj2);
                    int size = interfaceC0669q2.size();
                    int size2 = interfaceC0669q22.size();
                    if (size > 0 && size2 > 0) {
                        if (!((W1) interfaceC0669q2).f11400a) {
                            interfaceC0669q2 = interfaceC0669q2.A(size2 + size);
                        }
                        interfaceC0669q2.addAll(interfaceC0669q22);
                    }
                    if (size > 0) {
                        interfaceC0669q22 = interfaceC0669q2;
                    }
                    U2.j(obj, j3, interfaceC0669q22);
                    obj3 = obj;
                    break;
                case 50:
                    C0629i2 c0629i2 = M2.f11311a;
                    U2.j(obj, j3, C0629i2.c(U2.i(j3, obj), U2.i(j3, obj2)));
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
                    if (q(i11, i3, obj2)) {
                        U2.j(obj, j3, U2.i(j3, obj2));
                        U2.f(i11, iArr[i3 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    x(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (q(i11, i3, obj2)) {
                        U2.j(obj, j3, U2.i(j3, obj2));
                        U2.f(i11, iArr[i3 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    x(i3, obj, obj2);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.L2
    public final void d(Object obj, C0708y2 c0708y2) {
        int[] iArr;
        int i3;
        int i10;
        boolean z2;
        E2 e22 = this;
        int i11 = 2;
        Unsafe unsafe = f11251k;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr2 = e22.f11252a;
            if (i14 >= iArr2.length) {
                ((AbstractC0639k2) obj).zzc.b(c0708y2);
                return;
            }
            int E10 = e22.E(i14);
            int F3 = F(E10);
            int i16 = iArr2[i14];
            if (F3 <= 17) {
                int i17 = iArr2[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                iArr = iArr2;
                i3 = 1 << (i17 >>> 20);
            } else {
                iArr = iArr2;
                i3 = 0;
            }
            int[] iArr3 = iArr;
            long j3 = E10 & i12;
            switch (F3) {
                case 0:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).J(i16, Double.doubleToRawLongBits(U2.f11388c.f(j3, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).H(i16, Float.floatToRawIntBits(U2.f11388c.d(j3, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).I(i16, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).I(i16, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).F(i16, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).J(i16, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).H(i16, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        boolean b2 = U2.f11388c.b(j3, obj);
                        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
                        c0599c2.N(i16 << 3);
                        c0599c2.L(b2 ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            C0599c2 c0599c22 = (C0599c2) c0708y2.f11771a;
                            c0599c22.N((i16 << 3) | 2);
                            c0599c22.S((String) object);
                            break;
                        } else {
                            C0599c2 c0599c23 = (C0599c2) c0708y2.f11771a;
                            c0599c23.N((i16 << 3) | 2);
                            c0599c23.K((C0594b2) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        c0708y2.d(i16, unsafe.getObject(obj, j3), e22.y(i14));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        C0594b2 c0594b2 = (C0594b2) unsafe.getObject(obj, j3);
                        C0599c2 c0599c24 = (C0599c2) c0708y2.f11771a;
                        c0599c24.N((i16 << 3) | 2);
                        c0599c24.K(c0594b2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).G(i16, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).F(i16, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).H(i16, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        ((C0599c2) c0708y2.f11771a).J(i16, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        int i19 = unsafe.getInt(obj, j3);
                        ((C0599c2) c0708y2.f11771a).G(i16, (i19 >> 31) ^ (i19 + i19));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        long j10 = unsafe.getLong(obj, j3);
                        ((C0599c2) c0708y2.f11771a).I(i16, (j10 + j10) ^ (j10 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i10 = i11;
                    if (e22.n(obj, i14, i13, i15, i3)) {
                        c0708y2.e(i16, unsafe.getObject(obj, j3), e22.y(i14));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i10 = i11;
                    M2.c(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 19:
                    i10 = i11;
                    M2.d(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 20:
                    i10 = i11;
                    M2.e(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 21:
                    i10 = i11;
                    M2.f(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 22:
                    i10 = i11;
                    M2.j(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 23:
                    i10 = i11;
                    M2.h(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 24:
                    i10 = i11;
                    M2.m(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 25:
                    i10 = i11;
                    M2.p(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 26:
                    i10 = i11;
                    int i20 = iArr3[i14];
                    List list = (List) unsafe.getObject(obj, j3);
                    C0629i2 c0629i2 = M2.f11311a;
                    if (list != null && !list.isEmpty()) {
                        c0708y2.getClass();
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            String str = (String) list.get(i21);
                            C0599c2 c0599c25 = (C0599c2) c0708y2.f11771a;
                            c0599c25.N((i20 << 3) | 2);
                            c0599c25.S(str);
                        }
                    }
                    break;
                case 27:
                    i10 = i11;
                    int i22 = iArr3[i14];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    L2 y10 = e22.y(i14);
                    C0629i2 c0629i22 = M2.f11311a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            c0708y2.d(i22, list2.get(i23), y10);
                        }
                    }
                    break;
                case 28:
                    i10 = i11;
                    int i24 = iArr3[i14];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    C0629i2 c0629i23 = M2.f11311a;
                    if (list3 != null && !list3.isEmpty()) {
                        c0708y2.getClass();
                        for (int i25 = 0; i25 < list3.size(); i25++) {
                            C0594b2 c0594b22 = (C0594b2) list3.get(i25);
                            C0599c2 c0599c26 = (C0599c2) c0708y2.f11771a;
                            c0599c26.N((i24 << 3) | 2);
                            c0599c26.K(c0594b22);
                        }
                    }
                    break;
                case 29:
                    i10 = i11;
                    z2 = false;
                    M2.k(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 30:
                    i10 = i11;
                    z2 = false;
                    M2.o(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 31:
                    i10 = i11;
                    z2 = false;
                    M2.n(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 32:
                    i10 = i11;
                    z2 = false;
                    M2.i(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 33:
                    i10 = i11;
                    z2 = false;
                    M2.l(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 34:
                    i10 = i11;
                    z2 = false;
                    M2.g(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, false);
                    break;
                case 35:
                    i10 = i11;
                    M2.c(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                    i10 = i11;
                    M2.d(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i10 = i11;
                    M2.e(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i10 = i11;
                    M2.f(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i10 = i11;
                    M2.j(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case 40:
                    i10 = i11;
                    M2.h(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i10 = i11;
                    M2.m(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    i10 = i11;
                    M2.p(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i10 = i11;
                    M2.k(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i10 = i11;
                    M2.o(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i10 = i11;
                    M2.n(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case 46:
                    i10 = i11;
                    M2.i(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    i10 = i11;
                    M2.l(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case 48:
                    i10 = i11;
                    M2.g(iArr3[i14], (List) unsafe.getObject(obj, j3), c0708y2, true);
                    break;
                case 49:
                    i10 = i11;
                    int i26 = iArr3[i14];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    L2 y11 = e22.y(i14);
                    C0629i2 c0629i24 = M2.f11311a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            c0708y2.e(i26, list4.get(i27), y11);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j3);
                    if (object2 != null) {
                        int i28 = i14 / 3;
                        C0680t c0680t = ((C0713z2) e22.f11253b[i28 + i28]).f11772a;
                        c0708y2.getClass();
                        for (Map.Entry entry : ((A2) object2).entrySet()) {
                            C0599c2 c0599c27 = (C0599c2) c0708y2.f11771a;
                            c0599c27.E(i16, i11);
                            c0599c27.N(C0713z2.b(c0680t, entry.getKey(), entry.getValue()));
                            C0713z2.a(c0599c27, c0680t, entry.getKey(), entry.getValue());
                            i11 = i11;
                        }
                    }
                    i10 = i11;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).J(i16, Double.doubleToRawLongBits(((Double) U2.i(j3, obj)).doubleValue()));
                    }
                    i10 = i11;
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).H(i16, Float.floatToRawIntBits(((Float) U2.i(j3, obj)).floatValue()));
                    }
                    i10 = i11;
                    break;
                case EACTags.SEX /* 53 */:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).I(i16, l(j3, obj));
                    }
                    i10 = i11;
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).I(i16, l(j3, obj));
                    }
                    i10 = i11;
                    break;
                case 55:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).F(i16, k(j3, obj));
                    }
                    i10 = i11;
                    break;
                case 56:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).J(i16, l(j3, obj));
                    }
                    i10 = i11;
                    break;
                case 57:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).H(i16, k(j3, obj));
                    }
                    i10 = i11;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (e22.q(i16, i14, obj)) {
                        boolean booleanValue = ((Boolean) U2.i(j3, obj)).booleanValue();
                        C0599c2 c0599c28 = (C0599c2) c0708y2.f11771a;
                        c0599c28.N(i16 << 3);
                        c0599c28.L(booleanValue ? (byte) 1 : (byte) 0);
                    }
                    i10 = i11;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (e22.q(i16, i14, obj)) {
                        Object object3 = unsafe.getObject(obj, j3);
                        if (object3 instanceof String) {
                            C0599c2 c0599c29 = (C0599c2) c0708y2.f11771a;
                            c0599c29.N((i16 << 3) | i11);
                            c0599c29.S((String) object3);
                        } else {
                            C0599c2 c0599c210 = (C0599c2) c0708y2.f11771a;
                            c0599c210.N((i16 << 3) | i11);
                            c0599c210.K((C0594b2) object3);
                        }
                    }
                    i10 = i11;
                    break;
                case 60:
                    if (e22.q(i16, i14, obj)) {
                        c0708y2.d(i16, unsafe.getObject(obj, j3), e22.y(i14));
                    }
                    i10 = i11;
                    break;
                case 61:
                    if (e22.q(i16, i14, obj)) {
                        C0594b2 c0594b23 = (C0594b2) unsafe.getObject(obj, j3);
                        C0599c2 c0599c211 = (C0599c2) c0708y2.f11771a;
                        c0599c211.N((i16 << 3) | i11);
                        c0599c211.K(c0594b23);
                    }
                    i10 = i11;
                    break;
                case 62:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).G(i16, k(j3, obj));
                    }
                    i10 = i11;
                    break;
                case 63:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).F(i16, k(j3, obj));
                    }
                    i10 = i11;
                    break;
                case 64:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).H(i16, k(j3, obj));
                    }
                    i10 = i11;
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (e22.q(i16, i14, obj)) {
                        ((C0599c2) c0708y2.f11771a).J(i16, l(j3, obj));
                    }
                    i10 = i11;
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (e22.q(i16, i14, obj)) {
                        int k3 = k(j3, obj);
                        ((C0599c2) c0708y2.f11771a).G(i16, (k3 >> 31) ^ (k3 + k3));
                    }
                    i10 = i11;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (e22.q(i16, i14, obj)) {
                        long l9 = l(j3, obj);
                        ((C0599c2) c0708y2.f11771a).I(i16, (l9 + l9) ^ (l9 >> 63));
                    }
                    i10 = i11;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (e22.q(i16, i14, obj)) {
                        c0708y2.e(i16, unsafe.getObject(obj, j3), e22.y(i14));
                    }
                    i10 = i11;
                    break;
                default:
                    i10 = i11;
                    break;
            }
            i14 += 3;
            i12 = 1048575;
            e22 = this;
            i11 = i10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final boolean e(Object obj) {
        int i3;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f11258g) {
            int i15 = this.f11257f[i13];
            int[] iArr = this.f11252a;
            int i16 = iArr[i15];
            int E10 = E(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f11251k.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i12;
                i3 = i18;
            } else {
                int i20 = i12;
                i3 = i14;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & E10) == 0 || n(obj, i10, i3, i11, i19)) {
                int F3 = F(E10);
                if (F3 == 9 || F3 == 17) {
                    if (n(obj, i10, i3, i11, i19) && !y(i10).e(U2.i(E10 & 1048575, obj))) {
                    }
                    i13++;
                    i14 = i3;
                    i12 = i11;
                } else {
                    if (F3 != 27) {
                        if (F3 == 60 || F3 == 68) {
                            if (q(i16, i10, obj) && !y(i10).e(U2.i(E10 & 1048575, obj))) {
                            }
                            i13++;
                            i14 = i3;
                            i12 = i11;
                        } else if (F3 != 49) {
                            if (F3 != 50) {
                                continue;
                            } else {
                                A2 a22 = (A2) U2.i(E10 & 1048575, obj);
                                if (a22.isEmpty()) {
                                    continue;
                                } else {
                                    int i21 = i10 / 3;
                                    if (((X2) ((C0713z2) this.f11253b[i21 + i21]).f11772a.f11661b).f11411a == Y2.j) {
                                        L2 l22 = null;
                                        for (Object obj2 : a22.values()) {
                                            if (l22 == null) {
                                                l22 = I2.f11287c.a(obj2.getClass());
                                            }
                                            if (!l22.e(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i13++;
                            i14 = i3;
                            i12 = i11;
                        }
                    }
                    List list = (List) U2.i(E10 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        L2 y10 = y(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (y10.e(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i3;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void f(Object obj) {
        if (!j(obj)) {
            return;
        }
        if (obj instanceof AbstractC0639k2) {
            AbstractC0639k2 abstractC0639k2 = (AbstractC0639k2) obj;
            abstractC0639k2.j();
            abstractC0639k2.zza = 0;
            abstractC0639k2.f();
        }
        int i3 = 0;
        while (true) {
            int[] iArr = this.f11252a;
            if (i3 >= iArr.length) {
                this.f11260i.getClass();
                P2 p22 = ((AbstractC0639k2) obj).zzc;
                if (p22.f11346e) {
                    p22.f11346e = false;
                    return;
                }
                return;
            }
            int E10 = E(i3);
            int i10 = 1048575 & E10;
            int F3 = F(E10);
            long j3 = i10;
            if (F3 != 9) {
                if (F3 != 60 && F3 != 68) {
                    switch (F3) {
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
                            W1 w12 = (W1) ((InterfaceC0669q2) U2.i(j3, obj));
                            if (!w12.f11400a) {
                                break;
                            } else {
                                w12.f11400a = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = f11251k;
                            Object object = unsafe.getObject(obj, j3);
                            if (object == null) {
                                break;
                            } else {
                                ((A2) object).f11231a = false;
                                unsafe.putObject(obj, j3, object);
                                break;
                            }
                    }
                } else if (q(iArr[i3], i3, obj)) {
                    y(i3).f(f11251k.getObject(obj, j3));
                }
                i3 += 3;
            }
            if (o(i3, obj)) {
                y(i3).f(f11251k.getObject(obj, j3));
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final boolean g(AbstractC0639k2 abstractC0639k2, AbstractC0639k2 abstractC0639k22) {
        boolean a3;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f11252a;
            if (i3 < iArr.length) {
                int E10 = E(i3);
                long j3 = E10 & 1048575;
                switch (F(E10)) {
                    case 0:
                        if (!m(abstractC0639k2, abstractC0639k22, i3)) {
                            break;
                        } else {
                            T2 t22 = U2.f11388c;
                            if (Double.doubleToLongBits(t22.f(j3, abstractC0639k2)) != Double.doubleToLongBits(t22.f(j3, abstractC0639k22))) {
                                break;
                            } else {
                                continue;
                                i3 += 3;
                            }
                        }
                    case 1:
                        if (!m(abstractC0639k2, abstractC0639k22, i3)) {
                            break;
                        } else {
                            T2 t23 = U2.f11388c;
                            if (Float.floatToIntBits(t23.d(j3, abstractC0639k2)) != Float.floatToIntBits(t23.d(j3, abstractC0639k22))) {
                                break;
                            } else {
                                continue;
                                i3 += 3;
                            }
                        }
                    case 2:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.g(j3, abstractC0639k2) == U2.g(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 3:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.g(j3, abstractC0639k2) == U2.g(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 4:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.e(j3, abstractC0639k2) == U2.e(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 5:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.g(j3, abstractC0639k2) == U2.g(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 6:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.e(j3, abstractC0639k2) == U2.e(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 7:
                        if (!m(abstractC0639k2, abstractC0639k22, i3)) {
                            break;
                        } else {
                            T2 t24 = U2.f11388c;
                            if (t24.b(j3, abstractC0639k2) != t24.b(j3, abstractC0639k22)) {
                                break;
                            } else {
                                continue;
                                i3 += 3;
                            }
                        }
                    case 8:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && M2.a(U2.i(j3, abstractC0639k2), U2.i(j3, abstractC0639k22))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 9:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && M2.a(U2.i(j3, abstractC0639k2), U2.i(j3, abstractC0639k22))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 10:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && M2.a(U2.i(j3, abstractC0639k2), U2.i(j3, abstractC0639k22))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 11:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.e(j3, abstractC0639k2) == U2.e(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 12:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.e(j3, abstractC0639k2) == U2.e(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 13:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.e(j3, abstractC0639k2) == U2.e(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 14:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.g(j3, abstractC0639k2) == U2.g(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 15:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.e(j3, abstractC0639k2) == U2.e(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 16:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && U2.g(j3, abstractC0639k2) == U2.g(j3, abstractC0639k22)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 17:
                        if (m(abstractC0639k2, abstractC0639k22, i3) && M2.a(U2.i(j3, abstractC0639k2), U2.i(j3, abstractC0639k22))) {
                            continue;
                            i3 += 3;
                        }
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
                        a3 = M2.a(U2.i(j3, abstractC0639k2), U2.i(j3, abstractC0639k22));
                        break;
                    case 50:
                        a3 = M2.a(U2.i(j3, abstractC0639k2), U2.i(j3, abstractC0639k22));
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
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case EACTags.ELEMENT_LIST /* 65 */:
                    case EACTags.ADDRESS /* 66 */:
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        long j10 = iArr[i3 + 2] & 1048575;
                        if (U2.e(j10, abstractC0639k2) == U2.e(j10, abstractC0639k22) && M2.a(U2.i(j3, abstractC0639k2), U2.i(j3, abstractC0639k22))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    default:
                        i3 += 3;
                }
                if (a3) {
                    i3 += 3;
                }
            } else if (abstractC0639k2.zzc.equals(abstractC0639k22.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void h(Object obj, byte[] bArr, int i3, int i10, Y1 y12) {
        t(obj, bArr, i3, i10, 0, y12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    @Override // com.google.android.gms.internal.measurement.L2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.gms.internal.measurement.AbstractC0639k2 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.E2.i(com.google.android.gms.internal.measurement.k2):int");
    }

    public final boolean m(AbstractC0639k2 abstractC0639k2, AbstractC0639k2 abstractC0639k22, int i3) {
        return o(i3, abstractC0639k2) == o(i3, abstractC0639k22);
    }

    public final boolean n(Object obj, int i3, int i10, int i11, int i12) {
        return i10 == 1048575 ? o(i3, obj) : (i11 & i12) != 0;
    }

    public final boolean o(int i3, Object obj) {
        int i10 = this.f11252a[i3 + 2];
        long j3 = i10 & 1048575;
        if (j3 == 1048575) {
            int E10 = E(i3);
            long j10 = E10 & 1048575;
            switch (F(E10)) {
                case 0:
                    if (Double.doubleToRawLongBits(U2.f11388c.f(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(U2.f11388c.d(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (U2.g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (U2.g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (U2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (U2.g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (U2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return U2.f11388c.b(j10, obj);
                case 8:
                    Object i11 = U2.i(j10, obj);
                    if (i11 instanceof String) {
                        if (((String) i11).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(i11 instanceof C0594b2)) {
                            throw new IllegalArgumentException();
                        }
                        if (C0594b2.f11453c.equals(i11)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (U2.i(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (C0594b2.f11453c.equals(U2.i(j10, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (U2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (U2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (U2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (U2.g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (U2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (U2.g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (U2.i(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & U2.e(j3, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void p(int i3, Object obj) {
        int i10 = this.f11252a[i3 + 2];
        long j3 = 1048575 & i10;
        if (j3 == 1048575) {
            return;
        }
        U2.f((1 << (i10 >>> 20)) | U2.e(j3, obj), j3, obj);
    }

    public final boolean q(int i3, int i10, Object obj) {
        return U2.e((long) (this.f11252a[i10 + 2] & 1048575), obj) == i3;
    }

    public final int r(int i3, int i10) {
        int[] iArr = this.f11252a;
        int length = (iArr.length / 3) - 1;
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
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int t(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.measurement.Y1 r45) {
        /*
            Method dump skipped, instructions count: 4528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.E2.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.Y1):int");
    }

    public final void w(int i3, Object obj, Object obj2) {
        if (o(i3, obj2)) {
            int E10 = E(i3) & 1048575;
            Unsafe unsafe = f11251k;
            long j3 = E10;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                int i10 = this.f11252a[i3];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 38 + obj3.length());
                sb2.append(StubApp.getString2(11637));
                sb2.append(i10);
                sb2.append(StubApp.getString2(11638));
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            L2 y10 = y(i3);
            if (!o(i3, obj)) {
                if (j(object)) {
                    AbstractC0639k2 a3 = y10.a();
                    y10.c(a3, object);
                    unsafe.putObject(obj, j3, a3);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                p(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!j(object2)) {
                AbstractC0639k2 a9 = y10.a();
                y10.c(a9, object2);
                unsafe.putObject(obj, j3, a9);
                object2 = a9;
            }
            y10.c(object2, object);
        }
    }

    public final void x(int i3, Object obj, Object obj2) {
        int[] iArr = this.f11252a;
        int i10 = iArr[i3];
        if (q(i10, i3, obj2)) {
            int E10 = E(i3) & 1048575;
            Unsafe unsafe = f11251k;
            long j3 = E10;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                int i11 = iArr[i3];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + obj3.length());
                sb2.append(StubApp.getString2(11637));
                sb2.append(i11);
                sb2.append(StubApp.getString2(11638));
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            L2 y10 = y(i3);
            if (!q(i10, i3, obj)) {
                if (j(object)) {
                    AbstractC0639k2 a3 = y10.a();
                    y10.c(a3, object);
                    unsafe.putObject(obj, j3, a3);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                U2.f(i10, iArr[i3 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!j(object2)) {
                AbstractC0639k2 a9 = y10.a();
                y10.c(a9, object2);
                unsafe.putObject(obj, j3, a9);
                object2 = a9;
            }
            y10.c(object2, object);
        }
    }

    public final L2 y(int i3) {
        int i10 = i3 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f11253b;
        L2 l22 = (L2) objArr[i11];
        if (l22 != null) {
            return l22;
        }
        L2 a3 = I2.f11287c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a3;
        return a3;
    }

    public final InterfaceC0654n2 z(int i3) {
        int i10 = i3 / 3;
        return (InterfaceC0654n2) this.f11253b[i10 + i10 + 1];
    }
}
