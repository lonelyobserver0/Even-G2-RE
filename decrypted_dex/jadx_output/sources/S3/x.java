package S3;

import android.os.Bundle;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f6575a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0271e f6577c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6578d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f6579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0271e f6580f;

    public x(AbstractC0271e abstractC0271e, int i3, Bundle bundle) {
        this.f6580f = abstractC0271e;
        Boolean bool = Boolean.TRUE;
        this.f6577c = abstractC0271e;
        this.f6575a = bool;
        this.f6576b = false;
        this.f6578d = i3;
        this.f6579e = bundle;
    }

    public abstract void a(com.google.android.gms.common.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f6575a = null;
        }
        synchronized (this.f6577c.f6501m) {
            this.f6577c.f6501m.remove(this);
        }
    }
}
