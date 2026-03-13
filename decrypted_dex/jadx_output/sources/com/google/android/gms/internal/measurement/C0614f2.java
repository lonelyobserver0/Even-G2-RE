package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0614f2 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11561c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final N2 f11562a = new N2();

    /* renamed from: b, reason: collision with root package name */
    public boolean f11563b;

    static {
        new C0614f2(0);
    }

    public C0614f2() {
    }

    public static void b(C0599c2 c0599c2, X2 x22, int i3, Object obj) {
        if (x22 == X2.f11409d) {
            Charset charset = AbstractC0673r2.f11652a;
            c0599c2.E(i3, 3);
            ((AbstractC0639k2) ((V1) obj)).d(c0599c2);
            c0599c2.E(i3, 4);
            return;
        }
        c0599c2.E(i3, x22.f11412b);
        Y2 y22 = Y2.f11421a;
        switch (x22.ordinal()) {
            case 0:
                c0599c2.Q(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0599c2.O(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0599c2.P(((Long) obj).longValue());
                break;
            case 3:
                c0599c2.P(((Long) obj).longValue());
                break;
            case 4:
                c0599c2.M(((Integer) obj).intValue());
                break;
            case 5:
                c0599c2.Q(((Long) obj).longValue());
                break;
            case 6:
                c0599c2.O(((Integer) obj).intValue());
                break;
            case 7:
                c0599c2.L(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0594b2)) {
                    c0599c2.S((String) obj);
                    break;
                } else {
                    c0599c2.K((C0594b2) obj);
                    break;
                }
            case 9:
                ((AbstractC0639k2) ((V1) obj)).d(c0599c2);
                break;
            case 10:
                c0599c2.getClass();
                AbstractC0639k2 abstractC0639k2 = (AbstractC0639k2) ((V1) obj);
                c0599c2.N(abstractC0639k2.k());
                abstractC0639k2.d(c0599c2);
                break;
            case 11:
                if (!(obj instanceof C0594b2)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0599c2.N(length);
                    c0599c2.R(length, bArr);
                    break;
                } else {
                    c0599c2.K((C0594b2) obj);
                    break;
                }
            case 12:
                c0599c2.N(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC0649m2)) {
                    c0599c2.M(((Integer) obj).intValue());
                    break;
                } else {
                    c0599c2.M(((InterfaceC0649m2) obj).a());
                    break;
                }
            case 14:
                c0599c2.O(((Integer) obj).intValue());
                break;
            case 15:
                c0599c2.Q(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0599c2.N((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0599c2.P((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final void a() {
        if (this.f11563b) {
            return;
        }
        N2 n22 = this.f11562a;
        int i3 = n22.f11317b;
        for (int i10 = 0; i10 < i3; i10++) {
            Object obj = n22.a(i10).f11324b;
            if (obj instanceof AbstractC0639k2) {
                ((AbstractC0639k2) obj).g();
            }
        }
        Iterator it = n22.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC0639k2) {
                ((AbstractC0639k2) value).g();
            }
        }
        if (!n22.f11319d) {
            if (n22.f11317b > 0) {
                n22.a(0).f11323a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = n22.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!n22.f11319d) {
            n22.f11318c = n22.f11318c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(n22.f11318c);
            n22.f11321f = n22.f11321f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(n22.f11321f);
            n22.f11319d = true;
        }
        this.f11563b = true;
    }

    public final Object clone() {
        C0614f2 c0614f2 = new C0614f2();
        N2 n22 = this.f11562a;
        if (n22.f11317b > 0) {
            O2 a3 = n22.a(0);
            if (a3.f11323a != null) {
                throw new ClassCastException();
            }
            Object obj = a3.f11324b;
            throw null;
        }
        Iterator it = n22.b().iterator();
        if (!it.hasNext()) {
            return c0614f2;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0614f2) {
            return this.f11562a.equals(((C0614f2) obj).f11562a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11562a.hashCode();
    }

    public C0614f2(int i3) {
        a();
        a();
    }
}
