package i2;

import android.app.Notification;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f14738a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14739b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f14740c;

    public h(int i3, Notification notification, int i10) {
        this.f14738a = i3;
        this.f14740c = notification;
        this.f14739b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f14738a == hVar.f14738a && this.f14739b == hVar.f14739b) {
            return this.f14740c.equals(hVar.f14740c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14740c.hashCode() + (((this.f14738a * 31) + this.f14739b) * 31);
    }

    public final String toString() {
        return StubApp.getString2(18469) + this.f14738a + StubApp.getString2(18470) + this.f14739b + StubApp.getString2(18471) + this.f14740c + '}';
    }
}
