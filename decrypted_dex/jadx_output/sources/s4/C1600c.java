package s4;

import android.animation.TimeInterpolator;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: s4.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1600c {

    /* renamed from: a, reason: collision with root package name */
    public long f20752a;

    /* renamed from: b, reason: collision with root package name */
    public long f20753b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f20754c;

    /* renamed from: d, reason: collision with root package name */
    public int f20755d;

    /* renamed from: e, reason: collision with root package name */
    public int f20756e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f20754c;
        return timeInterpolator != null ? timeInterpolator : AbstractC1598a.f20747b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1600c)) {
            return false;
        }
        C1600c c1600c = (C1600c) obj;
        if (this.f20752a == c1600c.f20752a && this.f20753b == c1600c.f20753b && this.f20755d == c1600c.f20755d && this.f20756e == c1600c.f20756e) {
            return a().getClass().equals(c1600c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f20752a;
        long j3 = this.f20753b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f20755d) * 31) + this.f20756e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3692));
        sb2.append(C1600c.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(StubApp.getString2(23124));
        sb2.append(this.f20752a);
        sb2.append(StubApp.getString2(23125));
        sb2.append(this.f20753b);
        sb2.append(StubApp.getString2(23126));
        sb2.append(a().getClass());
        sb2.append(StubApp.getString2(23127));
        sb2.append(this.f20755d);
        sb2.append(StubApp.getString2(23128));
        return AbstractC1482f.f(this.f20756e, StubApp.getString2(20170), sb2);
    }
}
