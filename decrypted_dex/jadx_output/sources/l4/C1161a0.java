package l4;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Objects;
import o0.C1408E;
import r0.AbstractC1560u;
import r0.C1555p;

/* renamed from: l4.a0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1161a0 implements v0.J {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16342a;

    /* renamed from: b, reason: collision with root package name */
    public long f16343b;

    /* renamed from: c, reason: collision with root package name */
    public long f16344c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16345d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16346e;

    public C1161a0(C1164b0 c1164b0, String str, long j) {
        Objects.requireNonNull(c1164b0);
        this.f16346e = c1164b0;
        S3.D.e(str);
        this.f16345d = str;
        this.f16343b = j;
    }

    @Override // v0.J
    public long a() {
        long j = this.f16343b;
        if (!this.f16342a) {
            return j;
        }
        ((C1555p) this.f16345d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f16344c;
        return ((C1408E) this.f16346e).f18026a == 1.0f ? AbstractC1560u.J(elapsedRealtime) + j : (elapsedRealtime * r4.f18028c) + j;
    }

    @Override // v0.J
    public void b(C1408E c1408e) {
        if (this.f16342a) {
            d(a());
        }
        this.f16346e = c1408e;
    }

    public void d(long j) {
        this.f16343b = j;
        if (this.f16342a) {
            ((C1555p) this.f16345d).getClass();
            this.f16344c = SystemClock.elapsedRealtime();
        }
    }

    @Override // v0.J
    public C1408E e() {
        return (C1408E) this.f16346e;
    }

    public void f() {
        if (this.f16342a) {
            return;
        }
        ((C1555p) this.f16345d).getClass();
        this.f16344c = SystemClock.elapsedRealtime();
        this.f16342a = true;
    }

    public long g() {
        if (!this.f16342a) {
            this.f16342a = true;
            this.f16344c = ((C1164b0) this.f16346e).o().getLong((String) this.f16345d, this.f16343b);
        }
        return this.f16344c;
    }

    public void h(long j) {
        SharedPreferences.Editor edit = ((C1164b0) this.f16346e).o().edit();
        edit.putLong((String) this.f16345d, j);
        edit.apply();
        this.f16344c = j;
    }

    public C1161a0(C1555p c1555p) {
        this.f16345d = c1555p;
        this.f16346e = C1408E.f18025d;
    }
}
