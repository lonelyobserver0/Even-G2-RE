package U8;

import android.app.Notification;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7480a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification f7481b;

    public a(int i3, Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.f7480a = i3;
        this.f7481b = notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7480a == aVar.f7480a && Intrinsics.areEqual(this.f7481b, aVar.f7481b);
    }

    public final int hashCode() {
        return this.f7481b.hashCode() + (Integer.hashCode(this.f7480a) * 31);
    }

    public final String toString() {
        return StubApp.getString2(6379) + this.f7480a + StubApp.getString2(6380) + this.f7481b + ')';
    }
}
