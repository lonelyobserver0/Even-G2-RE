package N;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class W extends V {

    /* renamed from: o, reason: collision with root package name */
    public F.c f4759o;

    /* renamed from: p, reason: collision with root package name */
    public F.c f4760p;

    /* renamed from: q, reason: collision with root package name */
    public F.c f4761q;

    public W(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var, windowInsets);
        this.f4759o = null;
        this.f4760p = null;
        this.f4761q = null;
    }

    @Override // N.Z
    public F.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f4760p == null) {
            mandatorySystemGestureInsets = this.f4752c.getMandatorySystemGestureInsets();
            this.f4760p = F.c.b(mandatorySystemGestureInsets);
        }
        return this.f4760p;
    }

    @Override // N.Z
    public F.c i() {
        Insets systemGestureInsets;
        if (this.f4759o == null) {
            systemGestureInsets = this.f4752c.getSystemGestureInsets();
            this.f4759o = F.c.b(systemGestureInsets);
        }
        return this.f4759o;
    }

    @Override // N.Z
    public F.c k() {
        Insets tappableElementInsets;
        if (this.f4761q == null) {
            tappableElementInsets = this.f4752c.getTappableElementInsets();
            this.f4761q = F.c.b(tappableElementInsets);
        }
        return this.f4761q;
    }

    @Override // N.T, N.Z
    public c0 l(int i3, int i10, int i11, int i12) {
        WindowInsets inset;
        inset = this.f4752c.inset(i3, i10, i11, i12);
        return c0.g(inset, null);
    }

    @Override // N.U, N.Z
    public void q(F.c cVar) {
    }
}
