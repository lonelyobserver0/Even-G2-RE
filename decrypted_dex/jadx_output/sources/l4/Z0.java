package l4;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1162a1 f16337b;

    public Z0(C1162a1 c1162a1, int i3) {
        this.f16336a = i3;
        switch (i3) {
            case 1:
                Objects.requireNonNull(c1162a1);
                this.f16337b = c1162a1;
                break;
            default:
                Objects.requireNonNull(c1162a1);
                this.f16337b = c1162a1;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16336a) {
            case 0:
                C1162a1 c1162a1 = this.f16337b;
                c1162a1.f16349e = c1162a1.f16353k;
                break;
            default:
                this.f16337b.f16353k = null;
                break;
        }
    }
}
