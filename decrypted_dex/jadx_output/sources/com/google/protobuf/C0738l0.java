package com.google.protobuf;

import com.stub.StubApp;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import q8.AbstractC1526a;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.l0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0738l0 implements u0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f12176n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f12177o = G0.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f12178a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f12179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12180c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12181d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0732i0 f12182e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12183f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f12184g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12185h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12186i;
    public final C0742n0 j;

    /* renamed from: k, reason: collision with root package name */
    public final Z f12187k;

    /* renamed from: l, reason: collision with root package name */
    public final y0 f12188l;

    /* renamed from: m, reason: collision with root package name */
    public final C0724e0 f12189m;

    public C0738l0(int[] iArr, Object[] objArr, int i3, int i10, InterfaceC0732i0 interfaceC0732i0, int[] iArr2, int i11, int i12, C0742n0 c0742n0, Z z2, y0 y0Var, C0751v c0751v, C0724e0 c0724e0) {
        this.f12178a = iArr;
        this.f12179b = objArr;
        this.f12180c = i3;
        this.f12181d = i10;
        this.f12183f = interfaceC0732i0 instanceof F;
        this.f12184g = iArr2;
        this.f12185h = i11;
        this.f12186i = i12;
        this.j = c0742n0;
        this.f12187k = z2;
        this.f12188l = y0Var;
        this.f12182e = interfaceC0732i0;
        this.f12189m = c0724e0;
    }

    public static C0738l0 B(t0 t0Var, C0742n0 c0742n0, Z z2, y0 y0Var, C0751v c0751v, C0724e0 c0724e0) {
        if (t0Var instanceof t0) {
            return C(t0Var, c0742n0, z2, y0Var, c0751v, c0724e0);
        }
        t0Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.protobuf.C0738l0 C(com.google.protobuf.t0 r34, com.google.protobuf.C0742n0 r35, com.google.protobuf.Z r36, com.google.protobuf.y0 r37, com.google.protobuf.C0751v r38, com.google.protobuf.C0724e0 r39) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0738l0.C(com.google.protobuf.t0, com.google.protobuf.n0, com.google.protobuf.Z, com.google.protobuf.y0, com.google.protobuf.v, com.google.protobuf.e0):com.google.protobuf.l0");
    }

    public static long D(int i3) {
        return i3 & 1048575;
    }

    public static int E(long j, Object obj) {
        return ((Integer) G0.f12099c.k(j, obj)).intValue();
    }

    public static long F(long j, Object obj) {
        return ((Long) G0.f12099c.k(j, obj)).longValue();
    }

    public static Field O(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(11633), str, StubApp.getString2(6035));
            Xa.h.w(cls, l9, StubApp.getString2(11634));
            l9.append(Arrays.toString(declaredFields));
            throw new RuntimeException(l9.toString());
        }
    }

    public static int U(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (!t(obj)) {
            throw new IllegalArgumentException(Xa.h.m(obj, StubApp.getString2(11635)));
        }
    }

    public static x0 q(Object obj) {
        F f10 = (F) obj;
        x0 x0Var = f10.unknownFields;
        if (x0Var != x0.f12241f) {
            return x0Var;
        }
        x0 x0Var2 = new x0();
        f10.unknownFields = x0Var2;
        return x0Var2;
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof F) {
            return ((F) obj).isMutable();
        }
        return true;
    }

    public final Object A(int i3, int i10, Object obj) {
        u0 p8 = p(i10);
        if (!u(i3, i10, obj)) {
            return p8.d();
        }
        Object object = f12177o.getObject(obj, V(i10) & 1048575);
        if (t(object)) {
            return object;
        }
        Object d8 = p8.d();
        if (object != null) {
            p8.a(d8, object);
        }
        return d8;
    }

    public final void G(int i3, long j, Object obj) {
        Unsafe unsafe = f12177o;
        Object o5 = o(i3);
        Object object = unsafe.getObject(obj, j);
        this.f12189m.getClass();
        if (!((C0722d0) object).f12146a) {
            C0722d0 c10 = C0722d0.f12145b.c();
            C0724e0.a(c10, object);
            unsafe.putObject(obj, j, c10);
        }
        Xa.h.x(o5);
        throw null;
    }

    public final int H(Object obj, byte[] bArr, int i3, int i10, int i11, D0.g gVar) {
        int i12;
        Unsafe unsafe;
        Object obj2;
        int i13;
        Object obj3;
        C0738l0 c0738l0;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Unsafe unsafe2;
        Object obj4;
        byte[] bArr2;
        int i20;
        int i21;
        int n10;
        Object obj5;
        D0.g gVar2;
        int i22;
        Unsafe unsafe3;
        byte[] bArr3;
        int i23;
        int i24;
        D0.g gVar3;
        Unsafe unsafe4;
        byte[] bArr4;
        int n11;
        int i25;
        Unsafe unsafe5;
        int i26;
        int i27;
        D0.g gVar4;
        byte[] bArr5;
        int i28;
        int i29;
        D0.g gVar5;
        byte[] bArr6;
        int i30;
        int i31;
        Object obj6;
        int i32;
        int i33;
        int I10;
        C0738l0 c0738l02 = this;
        Object obj7 = obj;
        byte[] bArr7 = bArr;
        int i34 = i10;
        D0.g gVar6 = gVar;
        l(obj7);
        Unsafe unsafe6 = f12177o;
        int i35 = i3;
        int i36 = -1;
        int i37 = 0;
        int i38 = 1048575;
        int i39 = 0;
        int i40 = 0;
        int i41 = 1048575;
        while (true) {
            if (i35 < i34) {
                int i42 = i35 + 1;
                int i43 = bArr7[i35];
                if (i43 < 0) {
                    i42 = AbstractC1526a.m(i43, bArr7, i42, gVar6);
                    i43 = gVar6.f1244a;
                }
                int i44 = i42;
                i40 = i43;
                i35 = i44;
                int i45 = i40 >>> 3;
                int i46 = i37;
                int i47 = i40 & 7;
                int i48 = c0738l02.f12181d;
                int i49 = c0738l02.f12180c;
                if (i45 > i36) {
                    i15 = (i45 < i49 || i45 > i48) ? -1 : c0738l02.R(i45, i46 / 3);
                    i14 = 0;
                } else if (i45 < i49 || i45 > i48) {
                    i14 = 0;
                    i15 = -1;
                } else {
                    i14 = 0;
                    i15 = c0738l02.R(i45, 0);
                }
                int i50 = i15;
                if (i50 == -1) {
                    unsafe = unsafe6;
                    obj2 = obj7;
                    i13 = i38;
                    i36 = i45;
                    i37 = i14;
                    i16 = i40;
                    obj3 = null;
                    i12 = i11;
                } else {
                    int[] iArr = c0738l02.f12178a;
                    int i51 = iArr[i50 + 1];
                    int U5 = U(i51);
                    long j = i51 & i41;
                    if (U5 <= 17) {
                        int i52 = iArr[i50 + 2];
                        int i53 = 1 << (i52 >>> 20);
                        int i54 = i52 & i41;
                        if (i54 != i38) {
                            int i55 = i41;
                            if (i38 != i55) {
                                unsafe6.putInt(obj7, i38, i39);
                                i55 = 1048575;
                            }
                            if (i54 == i55) {
                                i17 = i47;
                                i31 = 0;
                            } else {
                                i17 = i47;
                                i31 = unsafe6.getInt(obj7, i54);
                            }
                            i19 = i54;
                            i18 = i31;
                        } else {
                            i17 = i47;
                            i18 = i39;
                            i19 = i38;
                        }
                        switch (U5) {
                            case 0:
                                unsafe5 = unsafe6;
                                i23 = i45;
                                i26 = i35;
                                D0.g gVar7 = gVar6;
                                if (i17 == 1) {
                                    G0.f12099c.o(obj7, j, Double.longBitsToDouble(AbstractC1526a.i(i26, bArr)));
                                    i35 = i26 + 8;
                                    i34 = i10;
                                    bArr7 = bArr;
                                    gVar6 = gVar7;
                                    i37 = i50;
                                    i38 = i19;
                                    i36 = i23;
                                    i41 = 1048575;
                                    i39 = i18 | i53;
                                    obj7 = obj7;
                                    unsafe6 = unsafe5;
                                    break;
                                } else {
                                    obj4 = obj7;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 1:
                                unsafe5 = unsafe6;
                                i23 = i45;
                                i26 = i35;
                                i27 = 1048575;
                                gVar4 = gVar6;
                                bArr5 = bArr;
                                if (i17 == 5) {
                                    G0.f12099c.p(obj7, j, Float.intBitsToFloat(AbstractC1526a.h(i26, bArr5)));
                                    i35 = i26 + 4;
                                    i28 = i18 | i53;
                                    i34 = i10;
                                    bArr7 = bArr5;
                                    gVar6 = gVar4;
                                    i37 = i50;
                                    i38 = i19;
                                    i36 = i23;
                                    i41 = i27;
                                    i39 = i28;
                                    unsafe6 = unsafe5;
                                    break;
                                } else {
                                    obj4 = obj7;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 2:
                            case 3:
                                i23 = i45;
                                i26 = i35;
                                i27 = 1048575;
                                gVar4 = gVar6;
                                bArr5 = bArr;
                                if (i17 == 0) {
                                    int p8 = AbstractC1526a.p(bArr5, i26, gVar4);
                                    unsafe6.putLong(obj7, j, gVar4.f1245b);
                                    unsafe5 = unsafe6;
                                    i28 = i18 | i53;
                                    i34 = i10;
                                    i35 = p8;
                                    bArr7 = bArr5;
                                    gVar6 = gVar4;
                                    i37 = i50;
                                    i38 = i19;
                                    i36 = i23;
                                    i41 = i27;
                                    i39 = i28;
                                    unsafe6 = unsafe5;
                                    break;
                                } else {
                                    unsafe5 = unsafe6;
                                    obj4 = obj7;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 4:
                            case 11:
                                i23 = i45;
                                i26 = i35;
                                i29 = 1048575;
                                gVar5 = gVar6;
                                bArr6 = bArr;
                                if (i17 == 0) {
                                    i35 = AbstractC1526a.n(bArr6, i26, gVar5);
                                    unsafe6.putInt(obj7, j, gVar5.f1244a);
                                    i34 = i10;
                                    i37 = i50;
                                    i38 = i19;
                                    i36 = i23;
                                    i41 = i29;
                                    i39 = i18 | i53;
                                    bArr7 = bArr6;
                                    gVar6 = gVar5;
                                    break;
                                } else {
                                    unsafe5 = unsafe6;
                                    obj4 = obj7;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 5:
                            case 14:
                                Object obj8 = obj7;
                                D0.g gVar8 = gVar6;
                                i23 = i45;
                                i29 = 1048575;
                                Unsafe unsafe7 = unsafe6;
                                if (i17 == 1) {
                                    bArr6 = bArr;
                                    unsafe6 = unsafe7;
                                    obj7 = obj8;
                                    gVar5 = gVar8;
                                    unsafe6.putLong(obj7, j, AbstractC1526a.i(i35, bArr));
                                    i35 += 8;
                                    i34 = i10;
                                    i37 = i50;
                                    i38 = i19;
                                    i36 = i23;
                                    i41 = i29;
                                    i39 = i18 | i53;
                                    bArr7 = bArr6;
                                    gVar6 = gVar5;
                                    break;
                                } else {
                                    unsafe6 = unsafe7;
                                    i26 = i35;
                                    obj7 = obj8;
                                    unsafe5 = unsafe6;
                                    obj4 = obj7;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 6:
                            case 13:
                                obj5 = obj7;
                                gVar2 = gVar6;
                                i23 = i45;
                                i22 = i35;
                                i30 = 1048575;
                                unsafe3 = unsafe6;
                                bArr3 = bArr;
                                if (i17 == 5) {
                                    unsafe3.putInt(obj5, j, AbstractC1526a.h(i22, bArr3));
                                    i35 = i22 + 4;
                                    bArr7 = bArr3;
                                    unsafe6 = unsafe3;
                                    gVar6 = gVar2;
                                    int i56 = i19;
                                    i39 = i18 | i53;
                                    obj7 = obj5;
                                    i38 = i56;
                                    i34 = i10;
                                    i37 = i50;
                                    i36 = i23;
                                    i41 = i30;
                                    break;
                                } else {
                                    unsafe5 = unsafe3;
                                    obj4 = obj5;
                                    i26 = i22;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 7:
                                obj5 = obj7;
                                gVar2 = gVar6;
                                i22 = i35;
                                i21 = 1048575;
                                unsafe3 = unsafe6;
                                bArr3 = bArr;
                                if (i17 == 0) {
                                    int p9 = AbstractC1526a.p(bArr3, i22, gVar2);
                                    G0.f12099c.m(obj5, j, gVar2.f1245b != 0);
                                    i24 = i18 | i53;
                                    bArr7 = bArr3;
                                    unsafe6 = unsafe3;
                                    gVar6 = gVar2;
                                    i35 = p9;
                                    obj7 = obj5;
                                    i37 = i50;
                                    i38 = i19;
                                    i36 = i45;
                                    i41 = i21;
                                    i39 = i24;
                                    i34 = i10;
                                    break;
                                } else {
                                    i23 = i45;
                                    unsafe5 = unsafe3;
                                    obj4 = obj5;
                                    i26 = i22;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 8:
                                obj5 = obj7;
                                gVar3 = gVar6;
                                i22 = i35;
                                i21 = 1048575;
                                unsafe4 = unsafe6;
                                bArr4 = bArr;
                                if (i17 == 2) {
                                    if ((536870912 & i51) != 0) {
                                        n11 = AbstractC1526a.n(bArr4, i22, gVar3);
                                        i25 = gVar3.f1244a;
                                        if (i25 < 0) {
                                            throw T.e();
                                        }
                                        if (i25 == 0) {
                                            gVar3.f1246c = "";
                                            unsafe4.putObject(obj5, j, gVar3.f1246c);
                                            i24 = i18 | i53;
                                            D0.g gVar9 = gVar3;
                                            bArr7 = bArr4;
                                            unsafe6 = unsafe4;
                                            gVar6 = gVar9;
                                            i35 = n11;
                                            obj7 = obj5;
                                            i36 = i45;
                                            i37 = i50;
                                            i38 = i19;
                                            i41 = i21;
                                            i39 = i24;
                                        } else {
                                            gVar3.f1246c = J0.f12106a.g(n11, i25, bArr4);
                                            n11 += i25;
                                            unsafe4.putObject(obj5, j, gVar3.f1246c);
                                            i24 = i18 | i53;
                                            D0.g gVar92 = gVar3;
                                            bArr7 = bArr4;
                                            unsafe6 = unsafe4;
                                            gVar6 = gVar92;
                                            i35 = n11;
                                            obj7 = obj5;
                                            i36 = i45;
                                            i37 = i50;
                                            i38 = i19;
                                            i41 = i21;
                                            i39 = i24;
                                        }
                                    } else {
                                        n11 = AbstractC1526a.n(bArr4, i22, gVar3);
                                        i25 = gVar3.f1244a;
                                        if (i25 < 0) {
                                            throw T.e();
                                        }
                                        if (i25 == 0) {
                                            gVar3.f1246c = "";
                                            unsafe4.putObject(obj5, j, gVar3.f1246c);
                                            i24 = i18 | i53;
                                            D0.g gVar922 = gVar3;
                                            bArr7 = bArr4;
                                            unsafe6 = unsafe4;
                                            gVar6 = gVar922;
                                            i35 = n11;
                                            obj7 = obj5;
                                            i36 = i45;
                                            i37 = i50;
                                            i38 = i19;
                                            i41 = i21;
                                            i39 = i24;
                                        } else {
                                            gVar3.f1246c = new String(bArr4, n11, i25, Q.f12119a);
                                            n11 += i25;
                                            unsafe4.putObject(obj5, j, gVar3.f1246c);
                                            i24 = i18 | i53;
                                            D0.g gVar9222 = gVar3;
                                            bArr7 = bArr4;
                                            unsafe6 = unsafe4;
                                            gVar6 = gVar9222;
                                            i35 = n11;
                                            obj7 = obj5;
                                            i36 = i45;
                                            i37 = i50;
                                            i38 = i19;
                                            i41 = i21;
                                            i39 = i24;
                                        }
                                    }
                                    i34 = i10;
                                    break;
                                } else {
                                    unsafe5 = unsafe4;
                                    i23 = i45;
                                    obj4 = obj5;
                                    i26 = i22;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 9:
                                Object obj9 = obj7;
                                Unsafe unsafe8 = unsafe6;
                                i21 = 1048575;
                                if (i17 == 2) {
                                    Object z2 = c0738l02.z(i50, obj9);
                                    obj5 = obj9;
                                    D0.g gVar10 = gVar6;
                                    unsafe4 = unsafe8;
                                    n11 = AbstractC1526a.E(z2, c0738l02.p(i50), bArr, i35, i10, gVar10);
                                    bArr4 = bArr;
                                    gVar3 = gVar10;
                                    c0738l02.S(i50, obj5, z2);
                                    i24 = i18 | i53;
                                    D0.g gVar92222 = gVar3;
                                    bArr7 = bArr4;
                                    unsafe6 = unsafe4;
                                    gVar6 = gVar92222;
                                    i35 = n11;
                                    obj7 = obj5;
                                    i36 = i45;
                                    i37 = i50;
                                    i38 = i19;
                                    i41 = i21;
                                    i39 = i24;
                                    i34 = i10;
                                    break;
                                } else {
                                    obj5 = obj9;
                                    bArr4 = bArr;
                                    D0.g gVar11 = gVar6;
                                    unsafe4 = unsafe8;
                                    i22 = i35;
                                    gVar3 = gVar11;
                                    unsafe5 = unsafe4;
                                    i23 = i45;
                                    obj4 = obj5;
                                    i26 = i22;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 10:
                                Object obj10 = obj7;
                                unsafe2 = unsafe6;
                                obj4 = obj10;
                                bArr2 = bArr;
                                i20 = i35;
                                i21 = 1048575;
                                if (i17 == 2) {
                                    n10 = AbstractC1526a.g(bArr2, i20, gVar6);
                                    unsafe2.putObject(obj4, j, gVar6.f1246c);
                                    i24 = i18 | i53;
                                    Unsafe unsafe9 = unsafe2;
                                    obj7 = obj4;
                                    unsafe6 = unsafe9;
                                    i35 = n10;
                                    bArr7 = bArr2;
                                    i36 = i45;
                                    i37 = i50;
                                    i38 = i19;
                                    i41 = i21;
                                    i39 = i24;
                                    i34 = i10;
                                    break;
                                } else {
                                    unsafe5 = unsafe2;
                                    i23 = i45;
                                    i26 = i20;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 12:
                                Object obj11 = obj7;
                                unsafe2 = unsafe6;
                                obj4 = obj11;
                                bArr2 = bArr;
                                i20 = i35;
                                i21 = 1048575;
                                if (i17 == 0) {
                                    n10 = AbstractC1526a.n(bArr2, i20, gVar6);
                                    int i57 = gVar6.f1244a;
                                    L n12 = c0738l02.n(i50);
                                    if ((i51 & Integer.MIN_VALUE) != 0 && n12 != null && !n12.isInRange(i57)) {
                                        q(obj4).f(i40, Long.valueOf(i57));
                                        obj7 = obj4;
                                        unsafe6 = unsafe2;
                                        i34 = i10;
                                        i35 = n10;
                                        bArr7 = bArr2;
                                        i36 = i45;
                                        i37 = i50;
                                        i38 = i19;
                                        i41 = 1048575;
                                        i39 = i18;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj4, j, i57);
                                        i24 = i18 | i53;
                                        Unsafe unsafe92 = unsafe2;
                                        obj7 = obj4;
                                        unsafe6 = unsafe92;
                                        i35 = n10;
                                        bArr7 = bArr2;
                                        i36 = i45;
                                        i37 = i50;
                                        i38 = i19;
                                        i41 = i21;
                                        i39 = i24;
                                        i34 = i10;
                                        break;
                                    }
                                } else {
                                    unsafe5 = unsafe2;
                                    i23 = i45;
                                    i26 = i20;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                                break;
                            case 15:
                                Object obj12 = obj7;
                                unsafe2 = unsafe6;
                                obj4 = obj12;
                                bArr2 = bArr;
                                i20 = i35;
                                i21 = 1048575;
                                if (i17 == 0) {
                                    n10 = AbstractC1526a.n(bArr2, i20, gVar6);
                                    unsafe2.putInt(obj4, j, AbstractC0741n.b(gVar6.f1244a));
                                    i24 = i18 | i53;
                                    Unsafe unsafe922 = unsafe2;
                                    obj7 = obj4;
                                    unsafe6 = unsafe922;
                                    i35 = n10;
                                    bArr7 = bArr2;
                                    i36 = i45;
                                    i37 = i50;
                                    i38 = i19;
                                    i41 = i21;
                                    i39 = i24;
                                    i34 = i10;
                                    break;
                                } else {
                                    unsafe5 = unsafe2;
                                    i23 = i45;
                                    i26 = i20;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 16:
                                bArr2 = bArr;
                                i20 = i35;
                                i30 = 1048575;
                                if (i17 == 0) {
                                    int p10 = AbstractC1526a.p(bArr2, i20, gVar6);
                                    unsafe6.putLong(obj7, j, AbstractC0741n.c(gVar6.f1245b));
                                    obj7 = obj7;
                                    unsafe6 = unsafe6;
                                    int i58 = i19;
                                    i39 = i18 | i53;
                                    bArr7 = bArr2;
                                    i38 = i58;
                                    i34 = i10;
                                    i35 = p10;
                                    i36 = i45;
                                    i37 = i50;
                                    i41 = i30;
                                    break;
                                } else {
                                    Object obj13 = obj7;
                                    unsafe2 = unsafe6;
                                    obj4 = obj13;
                                    unsafe5 = unsafe2;
                                    i23 = i45;
                                    i26 = i20;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            case 17:
                                if (i17 == 3) {
                                    Object z10 = c0738l02.z(i50, obj7);
                                    int D6 = AbstractC1526a.D(z10, c0738l02.p(i50), bArr, i35, i10, (i45 << 3) | 4, gVar6);
                                    c0738l02.S(i50, obj7, z10);
                                    int i59 = i19;
                                    i39 = i18 | i53;
                                    bArr7 = bArr;
                                    i38 = i59;
                                    i35 = D6;
                                    i36 = i45;
                                    i37 = i50;
                                    i41 = 1048575;
                                    i34 = i10;
                                    break;
                                } else {
                                    unsafe5 = unsafe6;
                                    obj4 = obj7;
                                    i23 = i45;
                                    i26 = i35;
                                    i12 = i11;
                                    obj2 = obj4;
                                    i35 = i26;
                                    unsafe = unsafe5;
                                    i37 = i50;
                                    i13 = i19;
                                    i16 = i40;
                                    i36 = i23;
                                    i39 = i18;
                                    obj3 = null;
                                    break;
                                }
                            default:
                                unsafe5 = unsafe6;
                                obj4 = obj7;
                                i23 = i45;
                                i26 = i35;
                                i12 = i11;
                                obj2 = obj4;
                                i35 = i26;
                                unsafe = unsafe5;
                                i37 = i50;
                                i13 = i19;
                                i16 = i40;
                                i36 = i23;
                                i39 = i18;
                                obj3 = null;
                                break;
                        }
                    } else {
                        Object obj14 = obj7;
                        Unsafe unsafe10 = unsafe6;
                        int i60 = i41;
                        D0.g gVar12 = gVar6;
                        if (U5 != 27) {
                            i16 = i40;
                            if (U5 <= 49) {
                                unsafe = unsafe10;
                                i13 = i38;
                                i32 = i39;
                                obj3 = null;
                                i36 = i45;
                                I10 = c0738l02.J(obj, bArr, i35, i10, i16, i36, i47, i50, i51, U5, j, gVar);
                                i16 = i16;
                                i50 = i50;
                                if (I10 != i35) {
                                    bArr7 = bArr;
                                    i34 = i10;
                                    gVar6 = gVar;
                                    i40 = i16;
                                    i35 = I10;
                                    i37 = i50;
                                    i38 = i13;
                                    i39 = i32;
                                    i41 = 1048575;
                                    obj7 = obj;
                                    unsafe6 = unsafe;
                                } else {
                                    i12 = i11;
                                    c0738l0 = c0738l02;
                                    obj2 = obj;
                                }
                            } else {
                                obj6 = obj;
                                i13 = i38;
                                unsafe = unsafe10;
                                i32 = i39;
                                obj3 = null;
                                i36 = i45;
                                i33 = i35;
                                if (U5 == 50) {
                                    if (i47 == 2) {
                                        c0738l02.G(i50, j, obj6);
                                        throw null;
                                    }
                                    i12 = i11;
                                    c0738l0 = c0738l02;
                                    obj2 = obj6;
                                    i35 = i33;
                                    i37 = i50;
                                    i39 = i32;
                                } else {
                                    I10 = c0738l02.I(obj6, bArr, i33, i10, i16, i36, i47, i51, U5, j, i50, gVar);
                                    c0738l0 = c0738l02;
                                    obj2 = obj6;
                                    i16 = i16;
                                    if (I10 != i33) {
                                        bArr7 = bArr;
                                        i34 = i10;
                                        i40 = i16;
                                        i35 = I10;
                                        c0738l02 = c0738l0;
                                        obj7 = obj2;
                                        i37 = i50;
                                        i38 = i13;
                                        i39 = i32;
                                        unsafe6 = unsafe;
                                        i41 = 1048575;
                                        gVar6 = gVar;
                                    } else {
                                        i12 = i11;
                                    }
                                }
                            }
                            i35 = I10;
                            i37 = i50;
                            i39 = i32;
                        } else if (i47 == 2) {
                            P p11 = (P) unsafe10.getObject(obj14, j);
                            if (!((AbstractC0721d) p11).f12144a) {
                                int size = p11.size();
                                p11 = p11.e(size == 0 ? 10 : size * 2);
                                unsafe10.putObject(obj14, j, p11);
                            }
                            int k3 = AbstractC1526a.k(c0738l02.p(i50), i40, bArr, i35, i10, p11, gVar12);
                            bArr7 = bArr;
                            i34 = i10;
                            i35 = k3;
                            unsafe6 = unsafe10;
                            i37 = i50;
                            i36 = i45;
                            i41 = i60;
                            obj7 = obj;
                            gVar6 = gVar;
                        } else {
                            obj6 = obj;
                            i13 = i38;
                            unsafe = unsafe10;
                            i32 = i39;
                            i16 = i40;
                            i36 = i45;
                            i33 = i35;
                            obj3 = null;
                            i12 = i11;
                            c0738l0 = c0738l02;
                            obj2 = obj6;
                            i35 = i33;
                            i37 = i50;
                            i39 = i32;
                        }
                        if (i16 == i12 || i12 == 0) {
                            int i61 = i16;
                            int l9 = AbstractC1526a.l(i61, bArr, i35, i10, q(obj2), gVar);
                            i34 = i10;
                            bArr7 = bArr;
                            i40 = i61;
                            c0738l02 = c0738l0;
                            i38 = i13;
                            unsafe6 = unsafe;
                            i41 = 1048575;
                            i35 = l9;
                            obj7 = obj2;
                            gVar6 = gVar;
                        } else {
                            i34 = i10;
                            i40 = i16;
                        }
                    }
                }
                c0738l0 = c0738l02;
                if (i16 == i12) {
                }
                int i612 = i16;
                int l92 = AbstractC1526a.l(i612, bArr, i35, i10, q(obj2), gVar);
                i34 = i10;
                bArr7 = bArr;
                i40 = i612;
                c0738l02 = c0738l0;
                i38 = i13;
                unsafe6 = unsafe;
                i41 = 1048575;
                i35 = l92;
                obj7 = obj2;
                gVar6 = gVar;
            } else {
                i12 = i11;
                unsafe = unsafe6;
                obj2 = obj7;
                i13 = i38;
                obj3 = null;
                c0738l0 = c0738l02;
            }
        }
        int i62 = i13;
        if (i62 != 1048575) {
            unsafe.putInt(obj2, i62, i39);
        }
        for (int i63 = c0738l0.f12185h; i63 < c0738l0.f12186i; i63++) {
            c0738l0.m(c0738l0.f12184g[i63], obj2, obj3);
        }
        if (i12 == 0) {
            if (i35 != i34) {
                throw T.f();
            }
        } else if (i35 > i34 || i40 != i12) {
            throw T.f();
        }
        return i35;
    }

    public final int I(Object obj, byte[] bArr, int i3, int i10, int i11, int i12, int i13, int i14, int i15, long j, int i16, D0.g gVar) {
        Unsafe unsafe = f12177o;
        long j3 = this.f12178a[i16 + 2] & 1048575;
        switch (i15) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i13 != 1) {
                    return i3;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC1526a.i(i3, bArr))));
                int i17 = i3 + 8;
                unsafe.putInt(obj, j3, i12);
                return i17;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i13 != 5) {
                    return i3;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC1526a.h(i3, bArr))));
                int i18 = i3 + 4;
                unsafe.putInt(obj, j3, i12);
                return i18;
            case EACTags.SEX /* 53 */:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                if (i13 != 0) {
                    return i3;
                }
                int p8 = AbstractC1526a.p(bArr, i3, gVar);
                unsafe.putObject(obj, j, Long.valueOf(gVar.f1245b));
                unsafe.putInt(obj, j3, i12);
                return p8;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i3;
                }
                int n10 = AbstractC1526a.n(bArr, i3, gVar);
                unsafe.putObject(obj, j, Integer.valueOf(gVar.f1244a));
                unsafe.putInt(obj, j3, i12);
                return n10;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i13 != 1) {
                    return i3;
                }
                unsafe.putObject(obj, j, Long.valueOf(AbstractC1526a.i(i3, bArr)));
                int i19 = i3 + 8;
                unsafe.putInt(obj, j3, i12);
                return i19;
            case 57:
            case 64:
                if (i13 != 5) {
                    return i3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(AbstractC1526a.h(i3, bArr)));
                int i20 = i3 + 4;
                unsafe.putInt(obj, j3, i12);
                return i20;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i13 != 0) {
                    return i3;
                }
                int p9 = AbstractC1526a.p(bArr, i3, gVar);
                unsafe.putObject(obj, j, Boolean.valueOf(gVar.f1245b != 0));
                unsafe.putInt(obj, j3, i12);
                return p9;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i13 != 2) {
                    return i3;
                }
                int n11 = AbstractC1526a.n(bArr, i3, gVar);
                int i21 = gVar.f1244a;
                if (i21 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i14 & PKIFailureInfo.duplicateCertReq) != 0) {
                        if (!J0.f12106a.n(n11, n11 + i21, bArr)) {
                            throw T.b();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, n11, i21, Q.f12119a));
                    n11 += i21;
                }
                unsafe.putInt(obj, j3, i12);
                return n11;
            case 60:
                if (i13 != 2) {
                    return i3;
                }
                Object A4 = A(i12, i16, obj);
                int E10 = AbstractC1526a.E(A4, p(i16), bArr, i3, i10, gVar);
                T(i12, i16, obj, A4);
                return E10;
            case 61:
                if (i13 != 2) {
                    return i3;
                }
                int g10 = AbstractC1526a.g(bArr, i3, gVar);
                unsafe.putObject(obj, j, gVar.f1246c);
                unsafe.putInt(obj, j3, i12);
                return g10;
            case 63:
                if (i13 != 0) {
                    return i3;
                }
                int n12 = AbstractC1526a.n(bArr, i3, gVar);
                int i22 = gVar.f1244a;
                L n13 = n(i16);
                if (n13 != null && !n13.isInRange(i22)) {
                    q(obj).f(i11, Long.valueOf(i22));
                    return n12;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i22));
                unsafe.putInt(obj, j3, i12);
                return n12;
            case EACTags.ADDRESS /* 66 */:
                if (i13 != 0) {
                    return i3;
                }
                int n14 = AbstractC1526a.n(bArr, i3, gVar);
                unsafe.putObject(obj, j, Integer.valueOf(AbstractC0741n.b(gVar.f1244a)));
                unsafe.putInt(obj, j3, i12);
                return n14;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i13 != 0) {
                    return i3;
                }
                int p10 = AbstractC1526a.p(bArr, i3, gVar);
                unsafe.putObject(obj, j, Long.valueOf(AbstractC0741n.c(gVar.f1245b)));
                unsafe.putInt(obj, j3, i12);
                return p10;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i13 == 3) {
                    Object A5 = A(i12, i16, obj);
                    int D6 = AbstractC1526a.D(A5, p(i16), bArr, i3, i10, (i11 & (-8)) | 4, gVar);
                    T(i12, i16, obj, A5);
                    return D6;
                }
                break;
        }
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int J(Object obj, byte[] bArr, int i3, int i10, int i11, int i12, int i13, int i14, long j, int i15, long j3, D0.g gVar) {
        int o5;
        Unsafe unsafe = f12177o;
        P p8 = (P) unsafe.getObject(obj, j3);
        if (!((AbstractC0721d) p8).f12144a) {
            int size = p8.size();
            p8 = p8.e(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j3, p8);
        }
        P p9 = p8;
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    r rVar = (r) p9;
                    int n10 = AbstractC1526a.n(bArr, i3, gVar);
                    int i16 = gVar.f1244a + n10;
                    while (n10 < i16) {
                        rVar.b(Double.longBitsToDouble(AbstractC1526a.i(n10, bArr)));
                        n10 += 8;
                    }
                    if (n10 == i16) {
                        return n10;
                    }
                    throw T.g();
                }
                if (i13 == 1) {
                    r rVar2 = (r) p9;
                    rVar2.b(Double.longBitsToDouble(AbstractC1526a.i(i3, bArr)));
                    int i17 = i3 + 8;
                    while (i17 < i10) {
                        int n11 = AbstractC1526a.n(bArr, i17, gVar);
                        if (i11 != gVar.f1244a) {
                            return i17;
                        }
                        rVar2.b(Double.longBitsToDouble(AbstractC1526a.i(n11, bArr)));
                        i17 = n11 + 8;
                    }
                    return i17;
                }
                return i3;
            case 19:
            case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                if (i13 == 2) {
                    C0754y c0754y = (C0754y) p9;
                    int n12 = AbstractC1526a.n(bArr, i3, gVar);
                    int i18 = gVar.f1244a + n12;
                    while (n12 < i18) {
                        c0754y.b(Float.intBitsToFloat(AbstractC1526a.h(n12, bArr)));
                        n12 += 4;
                    }
                    if (n12 == i18) {
                        return n12;
                    }
                    throw T.g();
                }
                if (i13 == 5) {
                    C0754y c0754y2 = (C0754y) p9;
                    c0754y2.b(Float.intBitsToFloat(AbstractC1526a.h(i3, bArr)));
                    int i19 = i3 + 4;
                    while (i19 < i10) {
                        int n13 = AbstractC1526a.n(bArr, i19, gVar);
                        if (i11 != gVar.f1244a) {
                            return i19;
                        }
                        c0754y2.b(Float.intBitsToFloat(AbstractC1526a.h(n13, bArr)));
                        i19 = n13 + 4;
                    }
                    return i19;
                }
                return i3;
            case 20:
            case 21:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                if (i13 == 2) {
                    C0716a0 c0716a0 = (C0716a0) p9;
                    int n14 = AbstractC1526a.n(bArr, i3, gVar);
                    int i20 = gVar.f1244a + n14;
                    while (n14 < i20) {
                        n14 = AbstractC1526a.p(bArr, n14, gVar);
                        c0716a0.b(gVar.f1245b);
                    }
                    if (n14 == i20) {
                        return n14;
                    }
                    throw T.g();
                }
                if (i13 == 0) {
                    C0716a0 c0716a02 = (C0716a0) p9;
                    int p10 = AbstractC1526a.p(bArr, i3, gVar);
                    c0716a02.b(gVar.f1245b);
                    while (p10 < i10) {
                        int n15 = AbstractC1526a.n(bArr, p10, gVar);
                        if (i11 != gVar.f1244a) {
                            return p10;
                        }
                        p10 = AbstractC1526a.p(bArr, n15, gVar);
                        c0716a02.b(gVar.f1245b);
                    }
                    return p10;
                }
                return i3;
            case 22:
            case 29:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
                if (i13 != 2) {
                    if (i13 == 0) {
                        return AbstractC1526a.o(i11, bArr, i3, i10, p9, gVar);
                    }
                    return i3;
                }
                G g10 = (G) p9;
                int n16 = AbstractC1526a.n(bArr, i3, gVar);
                int i21 = gVar.f1244a + n16;
                while (n16 < i21) {
                    n16 = AbstractC1526a.n(bArr, n16, gVar);
                    g10.b(gVar.f1244a);
                }
                if (n16 == i21) {
                    return n16;
                }
                throw T.g();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    C0716a0 c0716a03 = (C0716a0) p9;
                    int n17 = AbstractC1526a.n(bArr, i3, gVar);
                    int i22 = gVar.f1244a + n17;
                    while (n17 < i22) {
                        c0716a03.b(AbstractC1526a.i(n17, bArr));
                        n17 += 8;
                    }
                    if (n17 == i22) {
                        return n17;
                    }
                    throw T.g();
                }
                if (i13 == 1) {
                    C0716a0 c0716a04 = (C0716a0) p9;
                    c0716a04.b(AbstractC1526a.i(i3, bArr));
                    int i23 = i3 + 8;
                    while (i23 < i10) {
                        int n18 = AbstractC1526a.n(bArr, i23, gVar);
                        if (i11 != gVar.f1244a) {
                            return i23;
                        }
                        c0716a04.b(AbstractC1526a.i(n18, bArr));
                        i23 = n18 + 8;
                    }
                    return i23;
                }
                return i3;
            case 24:
            case 31:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                if (i13 == 2) {
                    G g11 = (G) p9;
                    int n19 = AbstractC1526a.n(bArr, i3, gVar);
                    int i24 = gVar.f1244a + n19;
                    while (n19 < i24) {
                        g11.b(AbstractC1526a.h(n19, bArr));
                        n19 += 4;
                    }
                    if (n19 == i24) {
                        return n19;
                    }
                    throw T.g();
                }
                if (i13 == 5) {
                    G g12 = (G) p9;
                    g12.b(AbstractC1526a.h(i3, bArr));
                    int i25 = i3 + 4;
                    while (i25 < i10) {
                        int n20 = AbstractC1526a.n(bArr, i25, gVar);
                        if (i11 != gVar.f1244a) {
                            return i25;
                        }
                        g12.b(AbstractC1526a.h(n20, bArr));
                        i25 = n20 + 4;
                    }
                    return i25;
                }
                return i3;
            case 25:
            case EACTags.CURRENCY_CODE /* 42 */:
                if (i13 == 2) {
                    C0725f c0725f = (C0725f) p9;
                    int n21 = AbstractC1526a.n(bArr, i3, gVar);
                    int i26 = gVar.f1244a + n21;
                    while (n21 < i26) {
                        n21 = AbstractC1526a.p(bArr, n21, gVar);
                        c0725f.b(gVar.f1245b != 0);
                    }
                    if (n21 == i26) {
                        return n21;
                    }
                    throw T.g();
                }
                if (i13 == 0) {
                    C0725f c0725f2 = (C0725f) p9;
                    int p11 = AbstractC1526a.p(bArr, i3, gVar);
                    c0725f2.b(gVar.f1245b != 0);
                    while (p11 < i10) {
                        int n22 = AbstractC1526a.n(bArr, p11, gVar);
                        if (i11 != gVar.f1244a) {
                            return p11;
                        }
                        p11 = AbstractC1526a.p(bArr, n22, gVar);
                        c0725f2.b(gVar.f1245b != 0);
                    }
                    return p11;
                }
                return i3;
            case 26:
                if (i13 == 2) {
                    if ((j & 536870912) == 0) {
                        int n23 = AbstractC1526a.n(bArr, i3, gVar);
                        int i27 = gVar.f1244a;
                        if (i27 < 0) {
                            throw T.e();
                        }
                        if (i27 == 0) {
                            p9.add("");
                        } else {
                            p9.add(new String(bArr, n23, i27, Q.f12119a));
                            n23 += i27;
                        }
                        while (n23 < i10) {
                            int n24 = AbstractC1526a.n(bArr, n23, gVar);
                            if (i11 != gVar.f1244a) {
                                return n23;
                            }
                            n23 = AbstractC1526a.n(bArr, n24, gVar);
                            int i28 = gVar.f1244a;
                            if (i28 < 0) {
                                throw T.e();
                            }
                            if (i28 == 0) {
                                p9.add("");
                            } else {
                                p9.add(new String(bArr, n23, i28, Q.f12119a));
                                n23 += i28;
                            }
                        }
                        return n23;
                    }
                    int n25 = AbstractC1526a.n(bArr, i3, gVar);
                    int i29 = gVar.f1244a;
                    if (i29 < 0) {
                        throw T.e();
                    }
                    if (i29 == 0) {
                        p9.add("");
                    } else {
                        int i30 = n25 + i29;
                        if (!J0.f12106a.n(n25, i30, bArr)) {
                            throw T.b();
                        }
                        p9.add(new String(bArr, n25, i29, Q.f12119a));
                        n25 = i30;
                    }
                    while (n25 < i10) {
                        int n26 = AbstractC1526a.n(bArr, n25, gVar);
                        if (i11 != gVar.f1244a) {
                            return n25;
                        }
                        n25 = AbstractC1526a.n(bArr, n26, gVar);
                        int i31 = gVar.f1244a;
                        if (i31 < 0) {
                            throw T.e();
                        }
                        if (i31 == 0) {
                            p9.add("");
                        } else {
                            int i32 = n25 + i31;
                            if (!J0.f12106a.n(n25, i32, bArr)) {
                                throw T.b();
                            }
                            p9.add(new String(bArr, n25, i31, Q.f12119a));
                            n25 = i32;
                        }
                    }
                    return n25;
                }
                return i3;
            case 27:
                if (i13 == 2) {
                    return AbstractC1526a.k(p(i14), i11, bArr, i3, i10, p9, gVar);
                }
                return i3;
            case 28:
                if (i13 == 2) {
                    int n27 = AbstractC1526a.n(bArr, i3, gVar);
                    int i33 = gVar.f1244a;
                    if (i33 < 0) {
                        throw T.e();
                    }
                    if (i33 > bArr.length - n27) {
                        throw T.g();
                    }
                    if (i33 == 0) {
                        p9.add(AbstractC0733j.f12158b);
                    } else {
                        p9.add(AbstractC0733j.c(n27, i33, bArr));
                        n27 += i33;
                    }
                    while (n27 < i10) {
                        int n28 = AbstractC1526a.n(bArr, n27, gVar);
                        if (i11 != gVar.f1244a) {
                            return n27;
                        }
                        n27 = AbstractC1526a.n(bArr, n28, gVar);
                        int i34 = gVar.f1244a;
                        if (i34 < 0) {
                            throw T.e();
                        }
                        if (i34 > bArr.length - n27) {
                            throw T.g();
                        }
                        if (i34 == 0) {
                            p9.add(AbstractC0733j.f12158b);
                        } else {
                            p9.add(AbstractC0733j.c(n27, i34, bArr));
                            n27 += i34;
                        }
                    }
                    return n27;
                }
                return i3;
            case 30:
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                if (i13 != 2) {
                    if (i13 == 0) {
                        o5 = AbstractC1526a.o(i11, bArr, i3, i10, p9, gVar);
                    }
                    return i3;
                }
                G g13 = (G) p9;
                o5 = AbstractC1526a.n(bArr, i3, gVar);
                int i35 = gVar.f1244a + o5;
                while (o5 < i35) {
                    o5 = AbstractC1526a.n(bArr, o5, gVar);
                    g13.b(gVar.f1244a);
                }
                if (o5 != i35) {
                    throw T.g();
                }
                v0.j(obj, i12, p9, n(i14), null, this.f12188l);
                return o5;
            case 33:
            case EACTags.PIN_USAGE_POLICY /* 47 */:
                if (i13 == 2) {
                    G g14 = (G) p9;
                    int n29 = AbstractC1526a.n(bArr, i3, gVar);
                    int i36 = gVar.f1244a + n29;
                    while (n29 < i36) {
                        n29 = AbstractC1526a.n(bArr, n29, gVar);
                        g14.b(AbstractC0741n.b(gVar.f1244a));
                    }
                    if (n29 == i36) {
                        return n29;
                    }
                    throw T.g();
                }
                if (i13 == 0) {
                    G g15 = (G) p9;
                    int n30 = AbstractC1526a.n(bArr, i3, gVar);
                    g15.b(AbstractC0741n.b(gVar.f1244a));
                    while (n30 < i10) {
                        int n31 = AbstractC1526a.n(bArr, n30, gVar);
                        if (i11 != gVar.f1244a) {
                            return n30;
                        }
                        n30 = AbstractC1526a.n(bArr, n31, gVar);
                        g15.b(AbstractC0741n.b(gVar.f1244a));
                    }
                    return n30;
                }
                return i3;
            case 34:
            case 48:
                if (i13 == 2) {
                    C0716a0 c0716a05 = (C0716a0) p9;
                    int n32 = AbstractC1526a.n(bArr, i3, gVar);
                    int i37 = gVar.f1244a + n32;
                    while (n32 < i37) {
                        n32 = AbstractC1526a.p(bArr, n32, gVar);
                        c0716a05.b(AbstractC0741n.c(gVar.f1245b));
                    }
                    if (n32 == i37) {
                        return n32;
                    }
                    throw T.g();
                }
                if (i13 == 0) {
                    C0716a0 c0716a06 = (C0716a0) p9;
                    int p12 = AbstractC1526a.p(bArr, i3, gVar);
                    c0716a06.b(AbstractC0741n.c(gVar.f1245b));
                    while (p12 < i10) {
                        int n33 = AbstractC1526a.n(bArr, p12, gVar);
                        if (i11 != gVar.f1244a) {
                            return p12;
                        }
                        p12 = AbstractC1526a.p(bArr, n33, gVar);
                        c0716a06.b(AbstractC0741n.c(gVar.f1245b));
                    }
                    return p12;
                }
                return i3;
            case 49:
                if (i13 == 3) {
                    u0 p13 = p(i14);
                    int i38 = (i11 & (-8)) | 4;
                    int j10 = AbstractC1526a.j(p13, bArr, i3, i10, i38, gVar);
                    u0 u0Var = p13;
                    p9.add(gVar.f1246c);
                    while (j10 < i10) {
                        int n34 = AbstractC1526a.n(bArr, j10, gVar);
                        if (i11 != gVar.f1244a) {
                            return j10;
                        }
                        u0 u0Var2 = u0Var;
                        j10 = AbstractC1526a.j(u0Var2, bArr, n34, i10, i38, gVar);
                        p9.add(gVar.f1246c);
                        u0Var = u0Var2;
                    }
                    return j10;
                }
                return i3;
            default:
                return i3;
        }
    }

    public final void K(Object obj, long j, Ab.g gVar, u0 u0Var, C0750u c0750u) {
        int z2;
        List c10 = this.f12187k.c(j, obj);
        int i3 = gVar.f275b;
        if ((i3 & 7) != 3) {
            throw T.c();
        }
        do {
            Object d8 = u0Var.d();
            gVar.d(d8, u0Var, c0750u);
            u0Var.b(d8);
            c10.add(d8);
            AbstractC0741n abstractC0741n = (AbstractC0741n) gVar.f278e;
            if (abstractC0741n.e() || gVar.f277d != 0) {
                return;
            } else {
                z2 = abstractC0741n.z();
            }
        } while (z2 == i3);
        gVar.f277d = z2;
    }

    public final void L(Object obj, int i3, Ab.g gVar, u0 u0Var, C0750u c0750u) {
        int z2;
        List c10 = this.f12187k.c(i3 & 1048575, obj);
        int i10 = gVar.f275b;
        if ((i10 & 7) != 2) {
            throw T.c();
        }
        do {
            Object d8 = u0Var.d();
            gVar.f(d8, u0Var, c0750u);
            u0Var.b(d8);
            c10.add(d8);
            AbstractC0741n abstractC0741n = (AbstractC0741n) gVar.f278e;
            if (abstractC0741n.e() || gVar.f277d != 0) {
                return;
            } else {
                z2 = abstractC0741n.z();
            }
        } while (z2 == i10);
        gVar.f277d = z2;
    }

    public final void M(int i3, Ab.g gVar, Object obj) {
        if ((536870912 & i3) != 0) {
            gVar.R(2);
            G0.p(obj, i3 & 1048575, ((AbstractC0741n) gVar.f278e).y());
        } else if (!this.f12183f) {
            G0.p(obj, i3 & 1048575, gVar.j());
        } else {
            gVar.R(2);
            G0.p(obj, i3 & 1048575, ((AbstractC0741n) gVar.f278e).x());
        }
    }

    public final void N(int i3, Ab.g gVar, Object obj) {
        boolean z2 = (536870912 & i3) != 0;
        Z z10 = this.f12187k;
        if (z2) {
            gVar.K(z10.c(i3 & 1048575, obj), true);
        } else {
            gVar.K(z10.c(i3 & 1048575, obj), false);
        }
    }

    public final void P(int i3, Object obj) {
        int i10 = this.f12178a[i3 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        G0.n((1 << (i10 >>> 20)) | G0.f12099c.i(j, obj), j, obj);
    }

    public final void Q(int i3, int i10, Object obj) {
        G0.n(i3, this.f12178a[i10 + 2] & 1048575, obj);
    }

    public final int R(int i3, int i10) {
        int[] iArr = this.f12178a;
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

    public final void S(int i3, Object obj, Object obj2) {
        f12177o.putObject(obj, V(i3) & 1048575, obj2);
        P(i3, obj);
    }

    public final void T(int i3, int i10, Object obj, Object obj2) {
        f12177o.putObject(obj, V(i10) & 1048575, obj2);
        Q(i3, i10, obj);
    }

    public final int V(int i3) {
        return this.f12178a[i3 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    public final void W(Object obj, C0720c0 c0720c0) {
        int i3;
        int i10;
        boolean z2;
        C0738l0 c0738l0 = this;
        int i11 = 1;
        int[] iArr = c0738l0.f12178a;
        int length = iArr.length;
        Unsafe unsafe = f12177o;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int V10 = c0738l0.V(i14);
            int i16 = iArr[i14];
            int U5 = U(V10);
            if (U5 <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i3 = V10;
                i10 = i11 << (i17 >>> 20);
            } else {
                i3 = V10;
                i10 = 0;
            }
            ?? r15 = i11;
            int[] iArr2 = iArr;
            long j = i3 & i12;
            switch (U5) {
                case 0:
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        double g10 = G0.f12099c.g(j, obj);
                        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
                        abstractC0747q.getClass();
                        abstractC0747q.a0(i16, Double.doubleToRawLongBits(g10));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 1:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        float h2 = G0.f12099c.h(j, obj);
                        AbstractC0747q abstractC0747q2 = (AbstractC0747q) c0720c0.f12143a;
                        abstractC0747q2.getClass();
                        abstractC0747q2.Y(i16, Float.floatToRawIntBits(h2));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 2:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).j0(i16, unsafe.getLong(obj, j));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 3:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).j0(i16, unsafe.getLong(obj, j));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 4:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).c0(i16, unsafe.getInt(obj, j));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 5:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).a0(i16, unsafe.getLong(obj, j));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 6:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).Y(i16, unsafe.getInt(obj, j));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 7:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).W(i16, G0.f12099c.d(j, obj));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 8:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((AbstractC0747q) c0720c0.f12143a).f0(i16, (String) object);
                            r15 = r15;
                        } else {
                            ((AbstractC0747q) c0720c0.f12143a).X(i16, (AbstractC0733j) object);
                            r15 = r15;
                        }
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 9:
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).e0(i16, (InterfaceC0732i0) unsafe.getObject(obj, j), c0738l0.p(i14));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 10:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).X(i16, (AbstractC0733j) unsafe.getObject(obj, j));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 11:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).h0(i16, unsafe.getInt(obj, j));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 12:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).c0(i16, unsafe.getInt(obj, j));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 13:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).Y(i16, unsafe.getInt(obj, j));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 14:
                    r15 = r15;
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        ((AbstractC0747q) c0720c0.f12143a).a0(i16, unsafe.getLong(obj, j));
                        r15 = r15;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 15:
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        int i19 = unsafe.getInt(obj, j);
                        r15 = 1;
                        ((AbstractC0747q) c0720c0.f12143a).h0(i16, (i19 >> 31) ^ (i19 << 1));
                        c0738l0 = this;
                        i14 += 3;
                        i11 = r15;
                        iArr = iArr2;
                        i12 = 1048575;
                    }
                    r15 = 1;
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 16:
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        long j3 = unsafe.getLong(obj, j);
                        ((AbstractC0747q) c0720c0.f12143a).j0(i16, (j3 << 1) ^ (j3 >> 63));
                    }
                    r15 = 1;
                    c0738l0 = this;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 17:
                    if (c0738l0.s(obj, i14, i13, i15, i10)) {
                        c0720c0.a(i16, unsafe.getObject(obj, j), c0738l0.p(i14));
                    }
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 18:
                    v0.o(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 19:
                    v0.s(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 20:
                    v0.u(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 21:
                    v0.A(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 22:
                    v0.t(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 23:
                    v0.r(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 24:
                    v0.q(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 25:
                    v0.n(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 26:
                    int i20 = iArr2[i14];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = v0.f12230a;
                    if (list != null && !list.isEmpty()) {
                        c0720c0.getClass();
                        boolean z10 = list instanceof W;
                        AbstractC0747q abstractC0747q3 = (AbstractC0747q) c0720c0.f12143a;
                        if (z10) {
                            W w10 = (W) list;
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                Object C10 = w10.C(i21);
                                if (C10 instanceof String) {
                                    abstractC0747q3.f0(i20, (String) C10);
                                } else {
                                    abstractC0747q3.X(i20, (AbstractC0733j) C10);
                                }
                            }
                        } else {
                            for (int i22 = 0; i22 < list.size(); i22++) {
                                abstractC0747q3.f0(i20, (String) list.get(i22));
                            }
                        }
                    }
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 27:
                    int i23 = iArr2[i14];
                    List list2 = (List) unsafe.getObject(obj, j);
                    u0 p8 = c0738l0.p(i14);
                    Class cls2 = v0.f12230a;
                    if (list2 != null && !list2.isEmpty()) {
                        c0720c0.getClass();
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            ((AbstractC0747q) c0720c0.f12143a).e0(i23, (InterfaceC0732i0) list2.get(i24), p8);
                        }
                    }
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 28:
                    int i25 = iArr2[i14];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = v0.f12230a;
                    if (list3 != null && !list3.isEmpty()) {
                        c0720c0.getClass();
                        for (int i26 = 0; i26 < list3.size(); i26++) {
                            ((AbstractC0747q) c0720c0.f12143a).X(i25, (AbstractC0733j) list3.get(i26));
                        }
                    }
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 29:
                    z2 = false;
                    v0.z(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 30:
                    z2 = false;
                    v0.p(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 31:
                    z2 = false;
                    v0.v(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 32:
                    z2 = false;
                    v0.w(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 33:
                    z2 = false;
                    v0.x(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 34:
                    z2 = false;
                    v0.y(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, false);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 35:
                    v0.o(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    r15 = 1;
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                    v0.s(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    v0.u(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    v0.A(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    v0.t(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 40:
                    v0.r(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    v0.q(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.CURRENCY_CODE /* 42 */:
                    v0.n(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    v0.z(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    v0.p(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    v0.v(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 46:
                    v0.w(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    v0.x(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 48:
                    v0.y(iArr2[i14], (List) unsafe.getObject(obj, j), c0720c0, r15);
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 49:
                    int i27 = iArr2[i14];
                    List list4 = (List) unsafe.getObject(obj, j);
                    u0 p9 = c0738l0.p(i14);
                    Class cls4 = v0.f12230a;
                    if (list4 != null && !list4.isEmpty()) {
                        c0720c0.getClass();
                        for (int i28 = 0; i28 < list4.size(); i28 += r15 == true ? 1 : 0) {
                            c0720c0.a(i27, list4.get(i28), p9);
                        }
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object o5 = c0738l0.o(i14);
                        c0738l0.f12189m.getClass();
                        Xa.h.x(o5);
                        throw null;
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (c0738l0.u(i16, i14, obj)) {
                        double doubleValue = ((Double) G0.f12099c.k(j, obj)).doubleValue();
                        AbstractC0747q abstractC0747q4 = (AbstractC0747q) c0720c0.f12143a;
                        abstractC0747q4.getClass();
                        abstractC0747q4.a0(i16, Double.doubleToRawLongBits(doubleValue));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (c0738l0.u(i16, i14, obj)) {
                        float floatValue = ((Float) G0.f12099c.k(j, obj)).floatValue();
                        AbstractC0747q abstractC0747q5 = (AbstractC0747q) c0720c0.f12143a;
                        abstractC0747q5.getClass();
                        abstractC0747q5.Y(i16, Float.floatToRawIntBits(floatValue));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.SEX /* 53 */:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).j0(i16, F(j, obj));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).j0(i16, F(j, obj));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 55:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).c0(i16, E(j, obj));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 56:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).a0(i16, F(j, obj));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 57:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).Y(i16, E(j, obj));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).W(i16, ((Boolean) G0.f12099c.k(j, obj)).booleanValue());
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (c0738l0.u(i16, i14, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((AbstractC0747q) c0720c0.f12143a).f0(i16, (String) object2);
                        } else {
                            ((AbstractC0747q) c0720c0.f12143a).X(i16, (AbstractC0733j) object2);
                        }
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 60:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).e0(i16, (InterfaceC0732i0) unsafe.getObject(obj, j), c0738l0.p(i14));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 61:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).X(i16, (AbstractC0733j) unsafe.getObject(obj, j));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 62:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).h0(i16, E(j, obj));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 63:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).c0(i16, E(j, obj));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case 64:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).Y(i16, E(j, obj));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (c0738l0.u(i16, i14, obj)) {
                        ((AbstractC0747q) c0720c0.f12143a).a0(i16, F(j, obj));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.ADDRESS /* 66 */:
                    if (c0738l0.u(i16, i14, obj)) {
                        int E10 = E(j, obj);
                        ((AbstractC0747q) c0720c0.f12143a).h0(i16, (E10 >> 31) ^ (E10 << 1));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (c0738l0.u(i16, i14, obj)) {
                        long F3 = F(j, obj);
                        ((AbstractC0747q) c0720c0.f12143a).j0(i16, (F3 << (r15 == true ? 1L : 0L)) ^ (F3 >> 63));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (c0738l0.u(i16, i14, obj)) {
                        c0720c0.a(i16, unsafe.getObject(obj, j), c0738l0.p(i14));
                    }
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
                default:
                    i14 += 3;
                    i11 = r15;
                    iArr = iArr2;
                    i12 = 1048575;
            }
        }
        c0738l0.f12188l.getClass();
        ((F) obj).unknownFields.g(c0720c0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.u0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f12178a;
            if (i3 >= iArr.length) {
                v0.k(this.f12188l, obj, obj2);
                return;
            }
            int V10 = V(i3);
            long j = 1048575 & V10;
            int i10 = iArr[i3];
            switch (U(V10)) {
                case 0:
                    if (r(i3, obj2)) {
                        F0 f02 = G0.f12099c;
                        obj3 = obj;
                        f02.o(obj3, j, f02.g(j, obj2));
                        P(i3, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (r(i3, obj2)) {
                        F0 f03 = G0.f12099c;
                        f03.p(obj, j, f03.h(j, obj2));
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (r(i3, obj2)) {
                        G0.o(obj, j, G0.f12099c.j(j, obj2));
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (r(i3, obj2)) {
                        G0.o(obj, j, G0.f12099c.j(j, obj2));
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (r(i3, obj2)) {
                        G0.n(G0.f12099c.i(j, obj2), j, obj);
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (r(i3, obj2)) {
                        G0.o(obj, j, G0.f12099c.j(j, obj2));
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (r(i3, obj2)) {
                        G0.n(G0.f12099c.i(j, obj2), j, obj);
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (r(i3, obj2)) {
                        F0 f04 = G0.f12099c;
                        f04.m(obj, j, f04.d(j, obj2));
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (r(i3, obj2)) {
                        G0.p(obj, j, G0.f12099c.k(j, obj2));
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    x(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (r(i3, obj2)) {
                        G0.p(obj, j, G0.f12099c.k(j, obj2));
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (r(i3, obj2)) {
                        G0.n(G0.f12099c.i(j, obj2), j, obj);
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (r(i3, obj2)) {
                        G0.n(G0.f12099c.i(j, obj2), j, obj);
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (r(i3, obj2)) {
                        G0.n(G0.f12099c.i(j, obj2), j, obj);
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (r(i3, obj2)) {
                        G0.o(obj, j, G0.f12099c.j(j, obj2));
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (r(i3, obj2)) {
                        G0.n(G0.f12099c.i(j, obj2), j, obj);
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (r(i3, obj2)) {
                        G0.o(obj, j, G0.f12099c.j(j, obj2));
                        P(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    x(i3, obj, obj2);
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
                    this.f12187k.b(obj, j, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = v0.f12230a;
                    F0 f05 = G0.f12099c;
                    Object k3 = f05.k(j, obj);
                    Object k4 = f05.k(j, obj2);
                    this.f12189m.getClass();
                    G0.p(obj, j, C0724e0.a(k3, k4));
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
                    if (u(i10, i3, obj2)) {
                        G0.p(obj, j, G0.f12099c.k(j, obj2));
                        Q(i10, i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    y(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (u(i10, i3, obj2)) {
                        G0.p(obj, j, G0.f12099c.k(j, obj2));
                        Q(i10, i3, obj);
                    }
                    obj3 = obj;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    y(i3, obj, obj2);
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

    @Override // com.google.protobuf.u0
    public final void b(Object obj) {
        if (t(obj)) {
            if (obj instanceof F) {
                F f10 = (F) obj;
                f10.clearMemoizedSerializedSize();
                f10.clearMemoizedHashCode();
                f10.markImmutable();
            }
            int[] iArr = this.f12178a;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int V10 = V(i3);
                long j = 1048575 & V10;
                int U5 = U(V10);
                if (U5 != 9) {
                    if (U5 != 60 && U5 != 68) {
                        switch (U5) {
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
                                this.f12187k.a(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f12177o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f12189m.getClass();
                                    ((C0722d0) object).f12146a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (u(iArr[i3], i3, obj)) {
                        p(i3).b(f12177o.getObject(obj, j));
                    }
                }
                if (r(i3, obj)) {
                    p(i3).b(f12177o.getObject(obj, j));
                }
            }
            this.f12188l.getClass();
            x0 x0Var = ((F) obj).unknownFields;
            if (x0Var.f12246e) {
                x0Var.f12246e = false;
            }
        }
    }

    @Override // com.google.protobuf.u0
    public final boolean c(Object obj) {
        int i3;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f12185h) {
            int i15 = this.f12184g[i14];
            int[] iArr = this.f12178a;
            int i16 = iArr[i15];
            int V10 = V(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f12177o.getInt(obj, i18);
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
            if ((268435456 & V10) == 0 || s(obj, i10, i3, i11, i19)) {
                int U5 = U(V10);
                if (U5 == 9 || U5 == 17) {
                    if (s(obj, i10, i3, i11, i19)) {
                        if (!p(i10).c(G0.f12099c.k(V10 & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i3;
                    i13 = i11;
                } else {
                    if (U5 != 27) {
                        if (U5 == 60 || U5 == 68) {
                            if (u(i16, i10, obj)) {
                                if (!p(i10).c(G0.f12099c.k(V10 & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (U5 != 49) {
                            if (U5 != 50) {
                                continue;
                            } else {
                                Object k3 = G0.f12099c.k(V10 & 1048575, obj);
                                this.f12189m.getClass();
                                if (!((C0722d0) k3).isEmpty()) {
                                    Xa.h.x(o(i10));
                                    throw null;
                                }
                            }
                        }
                        i14++;
                        i12 = i3;
                        i13 = i11;
                    }
                    List list = (List) G0.f12099c.k(V10 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        u0 p8 = p(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (p8.c(list.get(i21))) {
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

    @Override // com.google.protobuf.u0
    public final Object d() {
        this.j.getClass();
        return ((F) this.f12182e).newMutableInstance();
    }

    @Override // com.google.protobuf.u0
    public final void e(Object obj, C0720c0 c0720c0) {
        c0720c0.getClass();
        W(obj, c0720c0);
    }

    @Override // com.google.protobuf.u0
    public final void f(Object obj, byte[] bArr, int i3, int i10, D0.g gVar) {
        H(obj, bArr, i3, i10, 0, gVar);
    }

    @Override // com.google.protobuf.u0
    public final void g(Object obj, Ab.g gVar, C0750u c0750u) {
        c0750u.getClass();
        l(obj);
        v(this.f12188l, obj, gVar, c0750u);
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
    @Override // com.google.protobuf.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.protobuf.F r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0738l0.h(com.google.protobuf.F):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.u0
    public final int i(F f10) {
        int i3;
        int i10;
        int R10;
        int R11;
        int R12;
        int T7;
        int R13;
        int P10;
        int R14;
        int R15;
        int N3;
        int R16;
        int size;
        int i11;
        int R17;
        int R18;
        int size2;
        int R19;
        int S5;
        int i12;
        int R20;
        int R21;
        int R22;
        int T10;
        int R23;
        int P11;
        int R24;
        int S10;
        C0738l0 c0738l0 = this;
        F f11 = f10;
        int i13 = 1;
        Unsafe unsafe = f12177o;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (true) {
            int[] iArr = c0738l0.f12178a;
            if (i14 >= iArr.length) {
                c0738l0.f12188l.getClass();
                return f11.unknownFields.c() + i16;
            }
            int V10 = c0738l0.V(i14);
            int U5 = U(V10);
            int i18 = iArr[i14];
            int i19 = iArr[i14 + 2];
            int i20 = i19 & 1048575;
            if (U5 <= 17) {
                if (i20 != i17) {
                    i15 = i20 == 1048575 ? 0 : unsafe.getInt(f11, i20);
                    i17 = i20;
                }
                i3 = i13 << (i19 >>> 20);
            } else {
                i3 = 0;
            }
            long j = V10 & 1048575;
            if (U5 >= EnumC0753x.f12235b.f12240a) {
                int i21 = EnumC0753x.f12236c.f12240a;
            }
            switch (U5) {
                case 0:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        R10 = AbstractC0747q.R(i18) + 8;
                        i16 += R10;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case 1:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        R11 = AbstractC0747q.R(i18);
                        R15 = R11 + 4;
                        i16 += R15;
                    }
                    c0738l0 = this;
                    f11 = f10;
                    i14 += 3;
                    i13 = i10;
                case 2:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        long j3 = unsafe.getLong(f11, j);
                        R12 = AbstractC0747q.R(i18);
                        T7 = AbstractC0747q.T(j3);
                        i16 += T7 + R12;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i13 = i10;
                case 3:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        long j10 = unsafe.getLong(f11, j);
                        R12 = AbstractC0747q.R(i18);
                        T7 = AbstractC0747q.T(j10);
                        i16 += T7 + R12;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i13 = i10;
                case 4:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        int i22 = unsafe.getInt(f11, j);
                        R13 = AbstractC0747q.R(i18);
                        P10 = AbstractC0747q.P(i22);
                        N3 = P10 + R13;
                        i16 += N3;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i13 = i10;
                case 5:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        R14 = AbstractC0747q.R(i18);
                        R15 = R14 + 8;
                        i16 += R15;
                    }
                    c0738l0 = this;
                    f11 = f10;
                    i14 += 3;
                    i13 = i10;
                case 6:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        R11 = AbstractC0747q.R(i18);
                        R15 = R11 + 4;
                        i16 += R15;
                    }
                    c0738l0 = this;
                    f11 = f10;
                    i14 += 3;
                    i13 = i10;
                case 7:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        R15 = AbstractC0747q.R(i18) + 1;
                        i16 += R15;
                    }
                    c0738l0 = this;
                    f11 = f10;
                    i14 += 3;
                    i13 = i10;
                case 8:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        Object object = unsafe.getObject(f11, j);
                        i16 = (object instanceof AbstractC0733j ? AbstractC0747q.N(i18, (AbstractC0733j) object) : AbstractC0747q.Q((String) object) + AbstractC0747q.R(i18)) + i16;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i13 = i10;
                case 9:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        Object object2 = unsafe.getObject(f11, j);
                        u0 p8 = c0738l0.p(i14);
                        Class cls = v0.f12230a;
                        int R25 = AbstractC0747q.R(i18);
                        int serializedSize = ((AbstractC0719c) ((InterfaceC0732i0) object2)).getSerializedSize(p8);
                        i16 += AbstractC0747q.S(serializedSize) + serializedSize + R25;
                    }
                    i14 += 3;
                    i13 = i10;
                case 10:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        N3 = AbstractC0747q.N(i18, (AbstractC0733j) unsafe.getObject(f11, j));
                        i16 += N3;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i13 = i10;
                case 11:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        int i23 = unsafe.getInt(f11, j);
                        R13 = AbstractC0747q.R(i18);
                        P10 = AbstractC0747q.S(i23);
                        N3 = P10 + R13;
                        i16 += N3;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i13 = i10;
                case 12:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        int i24 = unsafe.getInt(f11, j);
                        R13 = AbstractC0747q.R(i18);
                        P10 = AbstractC0747q.P(i24);
                        N3 = P10 + R13;
                        i16 += N3;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i13 = i10;
                case 13:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        R11 = AbstractC0747q.R(i18);
                        R15 = R11 + 4;
                        i16 += R15;
                    }
                    c0738l0 = this;
                    f11 = f10;
                    i14 += 3;
                    i13 = i10;
                case 14:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        R14 = AbstractC0747q.R(i18);
                        R15 = R14 + 8;
                        i16 += R15;
                    }
                    c0738l0 = this;
                    f11 = f10;
                    i14 += 3;
                    i13 = i10;
                case 15:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        int i25 = unsafe.getInt(f11, j);
                        R13 = AbstractC0747q.R(i18);
                        P10 = AbstractC0747q.S((i25 >> 31) ^ (i25 << 1));
                        N3 = P10 + R13;
                        i16 += N3;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i13 = i10;
                case 16:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        long j11 = unsafe.getLong(f11, j);
                        R12 = AbstractC0747q.R(i18);
                        T7 = AbstractC0747q.T((j11 >> 63) ^ (j11 << i10));
                        i16 += T7 + R12;
                    }
                    c0738l0 = this;
                    i14 += 3;
                    i13 = i10;
                case 17:
                    i10 = i13;
                    if (c0738l0.s(f11, i14, i17, i15, i3)) {
                        R10 = ((AbstractC0719c) ((InterfaceC0732i0) unsafe.getObject(f11, j))).getSerializedSize(c0738l0.p(i14)) + (AbstractC0747q.R(i18) * 2);
                        i16 += R10;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case 18:
                    i10 = i13;
                    R10 = v0.c(i18, (List) unsafe.getObject(f11, j));
                    i16 += R10;
                    i14 += 3;
                    i13 = i10;
                case 19:
                    i10 = i13;
                    R10 = v0.b(i18, (List) unsafe.getObject(f11, j));
                    i16 += R10;
                    i14 += 3;
                    i13 = i10;
                case 20:
                    i10 = i13;
                    List list = (List) unsafe.getObject(f11, j);
                    Class cls2 = v0.f12230a;
                    if (list.size() != 0) {
                        R16 = (AbstractC0747q.R(i18) * list.size()) + v0.e(list);
                        i16 += R16;
                        i14 += 3;
                        i13 = i10;
                    }
                    R16 = 0;
                    i16 += R16;
                    i14 += 3;
                    i13 = i10;
                case 21:
                    i10 = i13;
                    List list2 = (List) unsafe.getObject(f11, j);
                    Class cls3 = v0.f12230a;
                    size = list2.size();
                    if (size != 0) {
                        i11 = v0.i(list2);
                        R17 = AbstractC0747q.R(i18);
                        R16 = (R17 * size) + i11;
                        i16 += R16;
                        i14 += 3;
                        i13 = i10;
                    }
                    R16 = 0;
                    i16 += R16;
                    i14 += 3;
                    i13 = i10;
                case 22:
                    i10 = i13;
                    List list3 = (List) unsafe.getObject(f11, j);
                    Class cls4 = v0.f12230a;
                    size = list3.size();
                    if (size != 0) {
                        i11 = v0.d(list3);
                        R17 = AbstractC0747q.R(i18);
                        R16 = (R17 * size) + i11;
                        i16 += R16;
                        i14 += 3;
                        i13 = i10;
                    }
                    R16 = 0;
                    i16 += R16;
                    i14 += 3;
                    i13 = i10;
                case 23:
                    i10 = i13;
                    R10 = v0.c(i18, (List) unsafe.getObject(f11, j));
                    i16 += R10;
                    i14 += 3;
                    i13 = i10;
                case 24:
                    i10 = i13;
                    R10 = v0.b(i18, (List) unsafe.getObject(f11, j));
                    i16 += R10;
                    i14 += 3;
                    i13 = i10;
                case 25:
                    i10 = i13;
                    List list4 = (List) unsafe.getObject(f11, j);
                    Class cls5 = v0.f12230a;
                    int size3 = list4.size();
                    i16 += size3 == 0 ? 0 : (AbstractC0747q.R(i18) + 1) * size3;
                    i14 += 3;
                    i13 = i10;
                case 26:
                    i10 = i13;
                    List list5 = (List) unsafe.getObject(f11, j);
                    Class cls6 = v0.f12230a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        R16 = AbstractC0747q.R(i18) * size4;
                        if (list5 instanceof W) {
                            W w10 = (W) list5;
                            for (int i26 = 0; i26 < size4; i26++) {
                                Object C10 = w10.C(i26);
                                R16 = (C10 instanceof AbstractC0733j ? AbstractC0747q.O((AbstractC0733j) C10) : AbstractC0747q.Q((String) C10)) + R16;
                            }
                        } else {
                            for (int i27 = 0; i27 < size4; i27++) {
                                Object obj = list5.get(i27);
                                R16 = (obj instanceof AbstractC0733j ? AbstractC0747q.O((AbstractC0733j) obj) : AbstractC0747q.Q((String) obj)) + R16;
                            }
                        }
                        i16 += R16;
                        i14 += 3;
                        i13 = i10;
                    }
                    R16 = 0;
                    i16 += R16;
                    i14 += 3;
                    i13 = i10;
                case 27:
                    i10 = i13;
                    List list6 = (List) unsafe.getObject(f11, j);
                    u0 p9 = c0738l0.p(i14);
                    Class cls7 = v0.f12230a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        R18 = 0;
                    } else {
                        R18 = AbstractC0747q.R(i18) * size5;
                        for (int i28 = 0; i28 < size5; i28++) {
                            int serializedSize2 = ((AbstractC0719c) ((InterfaceC0732i0) list6.get(i28))).getSerializedSize(p9);
                            R18 += AbstractC0747q.S(serializedSize2) + serializedSize2;
                        }
                    }
                    i16 += R18;
                    i14 += 3;
                    i13 = i10;
                case 28:
                    i10 = i13;
                    List list7 = (List) unsafe.getObject(f11, j);
                    Class cls8 = v0.f12230a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        R16 = AbstractC0747q.R(i18) * size6;
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            R16 += AbstractC0747q.O((AbstractC0733j) list7.get(i29));
                        }
                        i16 += R16;
                        i14 += 3;
                        i13 = i10;
                    }
                    R16 = 0;
                    i16 += R16;
                    i14 += 3;
                    i13 = i10;
                case 29:
                    i10 = i13;
                    List list8 = (List) unsafe.getObject(f11, j);
                    Class cls9 = v0.f12230a;
                    size = list8.size();
                    if (size != 0) {
                        i11 = v0.h(list8);
                        R17 = AbstractC0747q.R(i18);
                        R16 = (R17 * size) + i11;
                        i16 += R16;
                        i14 += 3;
                        i13 = i10;
                    }
                    R16 = 0;
                    i16 += R16;
                    i14 += 3;
                    i13 = i10;
                case 30:
                    i10 = i13;
                    List list9 = (List) unsafe.getObject(f11, j);
                    Class cls10 = v0.f12230a;
                    size = list9.size();
                    if (size != 0) {
                        i11 = v0.a(list9);
                        R17 = AbstractC0747q.R(i18);
                        R16 = (R17 * size) + i11;
                        i16 += R16;
                        i14 += 3;
                        i13 = i10;
                    }
                    R16 = 0;
                    i16 += R16;
                    i14 += 3;
                    i13 = i10;
                case 31:
                    i10 = i13;
                    R10 = v0.b(i18, (List) unsafe.getObject(f11, j));
                    i16 += R10;
                    i14 += 3;
                    i13 = i10;
                case 32:
                    i10 = i13;
                    R10 = v0.c(i18, (List) unsafe.getObject(f11, j));
                    i16 += R10;
                    i14 += 3;
                    i13 = i10;
                case 33:
                    i10 = i13;
                    List list10 = (List) unsafe.getObject(f11, j);
                    Class cls11 = v0.f12230a;
                    size = list10.size();
                    if (size != 0) {
                        i11 = v0.f(list10);
                        R17 = AbstractC0747q.R(i18);
                        R16 = (R17 * size) + i11;
                        i16 += R16;
                        i14 += 3;
                        i13 = i10;
                    }
                    R16 = 0;
                    i16 += R16;
                    i14 += 3;
                    i13 = i10;
                case 34:
                    i10 = i13;
                    List list11 = (List) unsafe.getObject(f11, j);
                    Class cls12 = v0.f12230a;
                    size = list11.size();
                    if (size != 0) {
                        i11 = v0.g(list11);
                        R17 = AbstractC0747q.R(i18);
                        R16 = (R17 * size) + i11;
                        i16 += R16;
                        i14 += 3;
                        i13 = i10;
                    }
                    R16 = 0;
                    i16 += R16;
                    i14 += 3;
                    i13 = i10;
                case 35:
                    i10 = i13;
                    List list12 = (List) unsafe.getObject(f11, j);
                    Class cls13 = v0.f12230a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                    i10 = i13;
                    List list13 = (List) unsafe.getObject(f11, j);
                    Class cls14 = v0.f12230a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i10 = i13;
                    size2 = v0.e((List) unsafe.getObject(f11, j));
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i10 = i13;
                    size2 = v0.i((List) unsafe.getObject(f11, j));
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i10 = i13;
                    size2 = v0.d((List) unsafe.getObject(f11, j));
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case 40:
                    i10 = i13;
                    List list14 = (List) unsafe.getObject(f11, j);
                    Class cls15 = v0.f12230a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i10 = i13;
                    List list15 = (List) unsafe.getObject(f11, j);
                    Class cls16 = v0.f12230a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case EACTags.CURRENCY_CODE /* 42 */:
                    i10 = i13;
                    List list16 = (List) unsafe.getObject(f11, j);
                    Class cls17 = v0.f12230a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i10 = i13;
                    size2 = v0.h((List) unsafe.getObject(f11, j));
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i10 = i13;
                    size2 = v0.a((List) unsafe.getObject(f11, j));
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i10 = i13;
                    List list17 = (List) unsafe.getObject(f11, j);
                    Class cls18 = v0.f12230a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case 46:
                    i10 = i13;
                    List list18 = (List) unsafe.getObject(f11, j);
                    Class cls19 = v0.f12230a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    i10 = i13;
                    size2 = v0.f((List) unsafe.getObject(f11, j));
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case 48:
                    i10 = i13;
                    size2 = v0.g((List) unsafe.getObject(f11, j));
                    if (size2 > 0) {
                        R19 = AbstractC0747q.R(i18);
                        S5 = AbstractC0747q.S(size2);
                        i16 += S5 + R19 + size2;
                        i14 += 3;
                        i13 = i10;
                    } else {
                        i14 += 3;
                        i13 = i10;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(f11, j);
                    u0 p10 = c0738l0.p(i14);
                    Class cls20 = v0.f12230a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i12 = 0;
                    } else {
                        int i30 = 0;
                        i12 = 0;
                        while (i30 < size7) {
                            i12 += ((AbstractC0719c) ((InterfaceC0732i0) list19.get(i30))).getSerializedSize(p10) + (AbstractC0747q.R(i18) * 2);
                            i30++;
                            i13 = i13;
                        }
                    }
                    i10 = i13;
                    i16 += i12;
                    i14 += 3;
                    i13 = i10;
                case 50:
                    Object object3 = unsafe.getObject(f11, j);
                    Object o5 = c0738l0.o(i14);
                    c0738l0.f12189m.getClass();
                    C0722d0 c0722d0 = (C0722d0) object3;
                    if (o5 != null) {
                        throw new ClassCastException();
                    }
                    if (!c0722d0.isEmpty()) {
                        Iterator it = c0722d0.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (c0738l0.u(i18, i14, f11)) {
                        R20 = AbstractC0747q.R(i18);
                        R24 = R20 + 8;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (c0738l0.u(i18, i14, f11)) {
                        R21 = AbstractC0747q.R(i18);
                        R24 = R21 + 4;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case EACTags.SEX /* 53 */:
                    if (c0738l0.u(i18, i14, f11)) {
                        long F3 = F(j, f11);
                        R22 = AbstractC0747q.R(i18);
                        T10 = AbstractC0747q.T(F3);
                        S10 = T10 + R22;
                        i16 += S10;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (c0738l0.u(i18, i14, f11)) {
                        long F10 = F(j, f11);
                        R22 = AbstractC0747q.R(i18);
                        T10 = AbstractC0747q.T(F10);
                        S10 = T10 + R22;
                        i16 += S10;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case 55:
                    if (c0738l0.u(i18, i14, f11)) {
                        int E10 = E(j, f11);
                        R23 = AbstractC0747q.R(i18);
                        P11 = AbstractC0747q.P(E10);
                        R24 = P11 + R23;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case 56:
                    if (c0738l0.u(i18, i14, f11)) {
                        R20 = AbstractC0747q.R(i18);
                        R24 = R20 + 8;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case 57:
                    if (c0738l0.u(i18, i14, f11)) {
                        R21 = AbstractC0747q.R(i18);
                        R24 = R21 + 4;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (c0738l0.u(i18, i14, f11)) {
                        R24 = AbstractC0747q.R(i18) + i13;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (c0738l0.u(i18, i14, f11)) {
                        Object object4 = unsafe.getObject(f11, j);
                        i16 = (object4 instanceof AbstractC0733j ? AbstractC0747q.N(i18, (AbstractC0733j) object4) : AbstractC0747q.Q((String) object4) + AbstractC0747q.R(i18)) + i16;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case 60:
                    if (c0738l0.u(i18, i14, f11)) {
                        Object object5 = unsafe.getObject(f11, j);
                        u0 p11 = c0738l0.p(i14);
                        Class cls21 = v0.f12230a;
                        int R26 = AbstractC0747q.R(i18);
                        int serializedSize3 = ((AbstractC0719c) ((InterfaceC0732i0) object5)).getSerializedSize(p11);
                        S10 = AbstractC0747q.S(serializedSize3) + serializedSize3 + R26;
                        i16 += S10;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case 61:
                    if (c0738l0.u(i18, i14, f11)) {
                        R24 = AbstractC0747q.N(i18, (AbstractC0733j) unsafe.getObject(f11, j));
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case 62:
                    if (c0738l0.u(i18, i14, f11)) {
                        int E11 = E(j, f11);
                        R23 = AbstractC0747q.R(i18);
                        P11 = AbstractC0747q.S(E11);
                        R24 = P11 + R23;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case 63:
                    if (c0738l0.u(i18, i14, f11)) {
                        int E12 = E(j, f11);
                        R23 = AbstractC0747q.R(i18);
                        P11 = AbstractC0747q.P(E12);
                        R24 = P11 + R23;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case 64:
                    if (c0738l0.u(i18, i14, f11)) {
                        R21 = AbstractC0747q.R(i18);
                        R24 = R21 + 4;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (c0738l0.u(i18, i14, f11)) {
                        R20 = AbstractC0747q.R(i18);
                        R24 = R20 + 8;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case EACTags.ADDRESS /* 66 */:
                    if (c0738l0.u(i18, i14, f11)) {
                        int E13 = E(j, f11);
                        R23 = AbstractC0747q.R(i18);
                        P11 = AbstractC0747q.S((E13 >> 31) ^ (E13 << 1));
                        R24 = P11 + R23;
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (c0738l0.u(i18, i14, f11)) {
                        long F11 = F(j, f11);
                        R22 = AbstractC0747q.R(i18);
                        T10 = AbstractC0747q.T((F11 << i13) ^ (F11 >> 63));
                        S10 = T10 + R22;
                        i16 += S10;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (c0738l0.u(i18, i14, f11)) {
                        R24 = ((AbstractC0719c) ((InterfaceC0732i0) unsafe.getObject(f11, j))).getSerializedSize(c0738l0.p(i14)) + (AbstractC0747q.R(i18) * 2);
                        i16 += R24;
                    }
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
                default:
                    i10 = i13;
                    i14 += 3;
                    i13 = i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.protobuf.v0.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.protobuf.v0.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.protobuf.v0.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.protobuf.v0.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.d(r7, r12) == r5.d(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.h(r7, r12)) == java.lang.Float.floatToIntBits(r5.h(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.g(r7, r12)) == java.lang.Double.doubleToLongBits(r5.g(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.protobuf.v0.l(r9.k(r7, r12), r9.k(r7, r13)) != false) goto L105;
     */
    @Override // com.google.protobuf.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(com.google.protobuf.F r12, com.google.protobuf.F r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0738l0.j(com.google.protobuf.F, com.google.protobuf.F):boolean");
    }

    public final boolean k(F f10, F f11, int i3) {
        return r(i3, f10) == r(i3, f11);
    }

    public final void m(int i3, Object obj, Object obj2) {
        int i10 = this.f12178a[i3];
        Object k3 = G0.f12099c.k(V(i3) & 1048575, obj);
        if (k3 == null || n(i3) == null) {
            return;
        }
        this.f12189m.getClass();
        Xa.h.x(o(i3));
        throw null;
    }

    public final L n(int i3) {
        return (L) this.f12179b[((i3 / 3) * 2) + 1];
    }

    public final Object o(int i3) {
        return this.f12179b[(i3 / 3) * 2];
    }

    public final u0 p(int i3) {
        int i10 = (i3 / 3) * 2;
        Object[] objArr = this.f12179b;
        u0 u0Var = (u0) objArr[i10];
        if (u0Var != null) {
            return u0Var;
        }
        u0 a3 = r0.f12216c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a3;
        return a3;
    }

    public final boolean r(int i3, Object obj) {
        int i10 = this.f12178a[i3 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int V10 = V(i3);
            long j3 = V10 & 1048575;
            switch (U(V10)) {
                case 0:
                    if (Double.doubleToRawLongBits(G0.f12099c.g(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(G0.f12099c.h(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (G0.f12099c.j(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (G0.f12099c.j(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (G0.f12099c.i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (G0.f12099c.j(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (G0.f12099c.i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return G0.f12099c.d(j3, obj);
                case 8:
                    Object k3 = G0.f12099c.k(j3, obj);
                    if (k3 instanceof String) {
                        return !((String) k3).isEmpty();
                    }
                    if (k3 instanceof AbstractC0733j) {
                        return !AbstractC0733j.f12158b.equals(k3);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (G0.f12099c.k(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC0733j.f12158b.equals(G0.f12099c.k(j3, obj));
                case 11:
                    if (G0.f12099c.i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (G0.f12099c.i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (G0.f12099c.i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (G0.f12099c.j(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (G0.f12099c.i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (G0.f12099c.j(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (G0.f12099c.k(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & G0.f12099c.i(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean s(Object obj, int i3, int i10, int i11, int i12) {
        return i10 == 1048575 ? r(i3, obj) : (i11 & i12) != 0;
    }

    public final boolean u(int i3, int i10, Object obj) {
        return G0.f12099c.i((long) (this.f12178a[i10 + 2] & 1048575), obj) == i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0043, code lost:
    
        ((com.google.protobuf.F) r2).unknownFields = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x06ac A[Catch: all -> 0x04eb, TryCatch #3 {all -> 0x04eb, blocks: (B:38:0x06a7, B:40:0x06ac, B:41:0x06b1, B:113:0x0293, B:117:0x02a2, B:118:0x02b2, B:119:0x02c2, B:160:0x03fc, B:161:0x0409, B:164:0x041e, B:175:0x043c, B:178:0x0441, B:179:0x0453, B:180:0x0465, B:181:0x0477, B:182:0x0489, B:183:0x049b, B:184:0x04ad, B:185:0x04bf, B:186:0x04d1, B:187:0x04ee, B:188:0x0507, B:189:0x0520, B:190:0x0539, B:191:0x0552, B:193:0x0566, B:196:0x056d, B:197:0x0573, B:198:0x057f, B:199:0x0598, B:200:0x05ad, B:201:0x05c8, B:202:0x05d5, B:203:0x05f0, B:204:0x0609, B:205:0x0622, B:206:0x063b, B:207:0x0654, B:208:0x066d, B:209:0x0687), top: B:37:0x06a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x06b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x06d8 A[LOOP:3: B:55:0x06d6->B:56:0x06d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x06e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.google.protobuf.y0 r20, java.lang.Object r21, Ab.g r22, com.google.protobuf.C0750u r23) {
        /*
            Method dump skipped, instructions count: 1914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0738l0.v(com.google.protobuf.y0, java.lang.Object, Ab.g, com.google.protobuf.u):void");
    }

    public final void w(int i3, Object obj, Object obj2) {
        long V10 = V(i3) & 1048575;
        Object k3 = G0.f12099c.k(V10, obj);
        C0724e0 c0724e0 = this.f12189m;
        if (k3 != null) {
            c0724e0.getClass();
            if (!((C0722d0) k3).f12146a) {
                C0722d0 c10 = C0722d0.f12145b.c();
                C0724e0.a(c10, k3);
                G0.p(obj, V10, c10);
                k3 = c10;
            }
        } else {
            c0724e0.getClass();
            k3 = C0722d0.f12145b.c();
            G0.p(obj, V10, k3);
        }
        c0724e0.getClass();
        Xa.h.x(obj2);
        throw null;
    }

    public final void x(int i3, Object obj, Object obj2) {
        if (r(i3, obj2)) {
            long V10 = V(i3) & 1048575;
            Unsafe unsafe = f12177o;
            Object object = unsafe.getObject(obj2, V10);
            if (object == null) {
                throw new IllegalStateException(StubApp.getString2(11637) + this.f12178a[i3] + StubApp.getString2(11638) + obj2);
            }
            u0 p8 = p(i3);
            if (!r(i3, obj)) {
                if (t(object)) {
                    Object d8 = p8.d();
                    p8.a(d8, object);
                    unsafe.putObject(obj, V10, d8);
                } else {
                    unsafe.putObject(obj, V10, object);
                }
                P(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, V10);
            if (!t(object2)) {
                Object d10 = p8.d();
                p8.a(d10, object2);
                unsafe.putObject(obj, V10, d10);
                object2 = d10;
            }
            p8.a(object2, object);
        }
    }

    public final void y(int i3, Object obj, Object obj2) {
        int[] iArr = this.f12178a;
        int i10 = iArr[i3];
        if (u(i10, i3, obj2)) {
            long V10 = V(i3) & 1048575;
            Unsafe unsafe = f12177o;
            Object object = unsafe.getObject(obj2, V10);
            if (object == null) {
                throw new IllegalStateException(StubApp.getString2(11637) + iArr[i3] + StubApp.getString2(11638) + obj2);
            }
            u0 p8 = p(i3);
            if (!u(i10, i3, obj)) {
                if (t(object)) {
                    Object d8 = p8.d();
                    p8.a(d8, object);
                    unsafe.putObject(obj, V10, d8);
                } else {
                    unsafe.putObject(obj, V10, object);
                }
                Q(i10, i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, V10);
            if (!t(object2)) {
                Object d10 = p8.d();
                p8.a(d10, object2);
                unsafe.putObject(obj, V10, d10);
                object2 = d10;
            }
            p8.a(object2, object);
        }
    }

    public final Object z(int i3, Object obj) {
        u0 p8 = p(i3);
        long V10 = V(i3) & 1048575;
        if (!r(i3, obj)) {
            return p8.d();
        }
        Object object = f12177o.getObject(obj, V10);
        if (t(object)) {
            return object;
        }
        Object d8 = p8.d();
        if (object != null) {
            p8.a(d8, object);
        }
        return d8;
    }
}
