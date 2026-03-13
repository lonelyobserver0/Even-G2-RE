package androidx.lifecycle;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final A f9935a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9936b;

    /* renamed from: c, reason: collision with root package name */
    public int f9937c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f9938d;

    public y(z zVar, A a3) {
        this.f9938d = zVar;
        this.f9935a = a3;
    }

    public final void a(boolean z2) {
        if (z2 == this.f9936b) {
            return;
        }
        this.f9936b = z2;
        int i3 = z2 ? 1 : -1;
        z zVar = this.f9938d;
        int i10 = zVar.f9944c;
        zVar.f9944c = i3 + i10;
        if (!zVar.f9945d) {
            zVar.f9945d = true;
            while (true) {
                try {
                    int i11 = zVar.f9944c;
                    if (i10 == i11) {
                        break;
                    } else {
                        i10 = i11;
                    }
                } finally {
                    zVar.f9945d = false;
                }
            }
        }
        if (this.f9936b) {
            zVar.b(this);
        }
    }
}
