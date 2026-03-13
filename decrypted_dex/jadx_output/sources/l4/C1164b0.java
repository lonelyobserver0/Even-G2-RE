package l4;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.stub.StubApp;

/* renamed from: l4.b0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1164b0 extends AbstractC1214u0 {

    /* renamed from: C, reason: collision with root package name */
    public static final Pair f16365C = new Pair("", 0L);

    /* renamed from: A, reason: collision with root package name */
    public final C1161a0 f16366A;

    /* renamed from: B, reason: collision with root package name */
    public final D5.B f16367B;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f16368c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f16369d;

    /* renamed from: e, reason: collision with root package name */
    public R8.B f16370e;

    /* renamed from: f, reason: collision with root package name */
    public final C1161a0 f16371f;

    /* renamed from: g, reason: collision with root package name */
    public final O0.l f16372g;

    /* renamed from: h, reason: collision with root package name */
    public String f16373h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f16374k;

    /* renamed from: l, reason: collision with root package name */
    public final C1161a0 f16375l;

    /* renamed from: m, reason: collision with root package name */
    public final Z f16376m;

    /* renamed from: n, reason: collision with root package name */
    public final O0.l f16377n;

    /* renamed from: p, reason: collision with root package name */
    public final D5.B f16378p;

    /* renamed from: q, reason: collision with root package name */
    public final Z f16379q;

    /* renamed from: r, reason: collision with root package name */
    public final C1161a0 f16380r;

    /* renamed from: s, reason: collision with root package name */
    public final C1161a0 f16381s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16382t;

    /* renamed from: v, reason: collision with root package name */
    public final Z f16383v;

    /* renamed from: w, reason: collision with root package name */
    public final Z f16384w;

    /* renamed from: x, reason: collision with root package name */
    public final C1161a0 f16385x;

    /* renamed from: y, reason: collision with root package name */
    public final O0.l f16386y;

    /* renamed from: z, reason: collision with root package name */
    public final O0.l f16387z;

    public C1164b0(C1200n0 c1200n0) {
        super(c1200n0);
        this.f16375l = new C1161a0(this, StubApp.getString2(20328), 1800000L);
        this.f16376m = new Z(this, StubApp.getString2(20329), true);
        this.f16380r = new C1161a0(this, StubApp.getString2(20330), 0L);
        this.f16381s = new C1161a0(this, StubApp.getString2(19432), 0L);
        this.f16377n = new O0.l(this, StubApp.getString2(19562));
        this.f16378p = new D5.B(this, StubApp.getString2(20331));
        this.f16379q = new Z(this, StubApp.getString2(20332), false);
        this.f16371f = new C1161a0(this, StubApp.getString2(19554), 0L);
        S3.D.e(StubApp.getString2(20333));
        this.f16372g = new O0.l(this, StubApp.getString2(20190));
        this.f16383v = new Z(this, StubApp.getString2(20334), false);
        this.f16384w = new Z(this, StubApp.getString2(20335), false);
        this.f16385x = new C1161a0(this, StubApp.getString2(20336), 0L);
        this.f16386y = new O0.l(this, StubApp.getString2(19472));
        this.f16387z = new O0.l(this, StubApp.getString2(20337));
        this.f16366A = new C1161a0(this, StubApp.getString2(20338), 0L);
        this.f16367B = new D5.B(this, StubApp.getString2(20339));
    }

    @Override // l4.AbstractC1214u0
    public final boolean l() {
        return true;
    }

    public final SharedPreferences o() {
        k();
        m();
        S3.D.h(this.f16368c);
        return this.f16368c;
    }

    public final SharedPreferences p() {
        k();
        m();
        if (this.f16369d == null) {
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            String valueOf = String.valueOf(c1200n0.f16536a.getPackageName());
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            String concat = valueOf.concat(StubApp.getString2(20340));
            t3.f16249p.c(concat, StubApp.getString2(20341));
            this.f16369d = c1200n0.f16536a.getSharedPreferences(concat, 0);
        }
        return this.f16369d;
    }

    public final SparseArray q() {
        Bundle M5 = this.f16378p.M();
        int[] intArray = M5.getIntArray(StubApp.getString2(19652));
        long[] longArray = M5.getLongArray(StubApp.getString2(19653));
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(20342));
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = 0; i3 < intArray.length; i3++) {
            sparseArray.put(intArray[i3], Long.valueOf(longArray[i3]));
        }
        return sparseArray;
    }

    public final C1224z0 r() {
        k();
        return C1224z0.c(o().getInt(StubApp.getString2(5206), 100), o().getString(StubApp.getString2(19788), StubApp.getString2(20343)));
    }

    public final boolean s(r1 r1Var) {
        k();
        SharedPreferences o5 = o();
        String string2 = StubApp.getString2(20115);
        String string = o5.getString(string2, "");
        String a3 = r1Var.a();
        if (a3.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = o().edit();
        edit.putString(string2, a3);
        edit.apply();
        return true;
    }

    public final void t(boolean z2) {
        k();
        T t3 = ((C1200n0) this.f4728a).f16541f;
        C1200n0.l(t3);
        t3.f16249p.c(Boolean.valueOf(z2), StubApp.getString2(20344));
        SharedPreferences.Editor edit = o().edit();
        edit.putBoolean(StubApp.getString2(5226), z2);
        edit.apply();
    }

    public final boolean u(long j) {
        return j - this.f16375l.g() > this.f16380r.g();
    }
}
