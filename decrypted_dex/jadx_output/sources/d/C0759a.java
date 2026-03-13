package d;

import N.AbstractC0172s;
import android.window.BackEvent;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0759a {

    /* renamed from: a, reason: collision with root package name */
    public final float f13046a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13047b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13048c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13049d;

    public C0759a(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        float k3 = AbstractC0172s.k(backEvent);
        float l9 = AbstractC0172s.l(backEvent);
        float h2 = AbstractC0172s.h(backEvent);
        int j = AbstractC0172s.j(backEvent);
        this.f13046a = k3;
        this.f13047b = l9;
        this.f13048c = h2;
        this.f13049d = j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(16410));
        sb2.append(this.f13046a);
        sb2.append(StubApp.getString2(16411));
        sb2.append(this.f13047b);
        sb2.append(StubApp.getString2(16412));
        sb2.append(this.f13048c);
        sb2.append(StubApp.getString2(16413));
        return com.mapbox.common.b.j(sb2, this.f13049d, '}');
    }
}
