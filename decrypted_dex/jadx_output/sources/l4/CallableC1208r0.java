package l4;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: l4.r0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class CallableC1208r0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f16605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f16606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC1212t0 f16607d;

    public CallableC1208r0(BinderC1212t0 binderC1212t0, M1 m12, Bundle bundle, int i3) {
        this.f16604a = i3;
        switch (i3) {
            case 1:
                this.f16605b = m12;
                this.f16606c = bundle;
                Objects.requireNonNull(binderC1212t0);
                this.f16607d = binderC1212t0;
                break;
            default:
                this.f16605b = m12;
                this.f16606c = bundle;
                Objects.requireNonNull(binderC1212t0);
                this.f16607d = binderC1212t0;
                break;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f16604a) {
            case 0:
                BinderC1212t0 binderC1212t0 = this.f16607d;
                binderC1212t0.f16629e.A();
                M1 m12 = this.f16605b;
                return binderC1212t0.f16629e.b0(this.f16606c, m12);
            default:
                BinderC1212t0 binderC1212t02 = this.f16607d;
                binderC1212t02.f16629e.A();
                M1 m13 = this.f16605b;
                return binderC1212t02.f16629e.b0(this.f16606c, m13);
        }
    }
}
