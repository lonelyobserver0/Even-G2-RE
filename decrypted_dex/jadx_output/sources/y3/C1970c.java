package y3;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1970c {

    /* renamed from: a, reason: collision with root package name */
    public final String f23505a;

    public C1970c(String str) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(24640));
        }
        this.f23505a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1970c)) {
            return false;
        }
        return this.f23505a.equals(((C1970c) obj).f23505a);
    }

    public final int hashCode() {
        return this.f23505a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(24641)), this.f23505a, StubApp.getString2(24642));
    }
}
