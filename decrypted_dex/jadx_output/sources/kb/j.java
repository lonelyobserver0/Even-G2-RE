package kb;

import android.content.Intent;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f15549a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugins.firebase.messaging.a f15551c;

    public j(io.flutter.plugins.firebase.messaging.a aVar, Intent intent, int i3) {
        this.f15551c = aVar;
        this.f15549a = intent;
        this.f15550b = i3;
    }

    @Override // kb.k
    public final void a() {
        this.f15551c.stopSelf(this.f15550b);
    }

    @Override // kb.k
    public final Intent getIntent() {
        return this.f15549a;
    }
}
