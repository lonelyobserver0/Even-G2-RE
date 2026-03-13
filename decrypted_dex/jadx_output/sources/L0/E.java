package L0;

import java.io.IOException;
import r0.InterfaceC1542c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class E implements InterfaceC1542c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0.f f3890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0123t f3891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I0.g f3892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f3893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3894e;

    public /* synthetic */ E(A0.f fVar, C0123t c0123t, I0.g gVar, IOException iOException, boolean z2) {
        this.f3890a = fVar;
        this.f3891b = c0123t;
        this.f3892c = gVar;
        this.f3893d = iOException;
        this.f3894e = z2;
    }

    @Override // r0.InterfaceC1542c
    public final void accept(Object obj) {
        G g10 = (G) obj;
        A0.f fVar = this.f3890a;
        g10.k(fVar.f32a, fVar.f33b, this.f3891b, this.f3892c, this.f3893d, this.f3894e);
    }
}
