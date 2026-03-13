package b3;

import androidx.lifecycle.AbstractC0440o;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.EnumC0439n;
import androidx.lifecycle.InterfaceC0444t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0500b implements InterfaceC0444t, DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10606a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10607b;

    /* renamed from: c, reason: collision with root package name */
    public final C0446v f10608c;

    public C0500b(AbstractC0440o parentLifecycle, boolean z2, int i3) {
        this.f10606a = i3;
        switch (i3) {
            case 1:
                Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
                this.f10607b = z2;
                this.f10608c = new C0446v(this);
                parentLifecycle.a(this);
                break;
            default:
                Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
                this.f10607b = z2;
                this.f10608c = new C0446v(this);
                parentLifecycle.a(this);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void A(InterfaceC0444t owner) {
        switch (this.f10606a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f10608c.g(EnumC0439n.f9916d);
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f10608c.g(EnumC0439n.f9916d);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void d(InterfaceC0444t owner) {
        switch (this.f10606a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f10608c.g(EnumC0439n.f9917e);
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f10608c.g(EnumC0439n.f9917e);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void e(InterfaceC0444t owner) {
        switch (this.f10606a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f10608c.g(EnumC0439n.f9915c);
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f10608c.g(EnumC0439n.f9915c);
                break;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        switch (this.f10606a) {
        }
        return this.f10608c;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void k(InterfaceC0444t owner) {
        switch (this.f10606a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f10608c.g(EnumC0439n.f9916d);
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f10608c.g(EnumC0439n.f9916d);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void p(InterfaceC0444t owner) {
        switch (this.f10606a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f10608c.g(EnumC0439n.f9915c);
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f10608c.g(EnumC0439n.f9915c);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void v(InterfaceC0444t owner) {
        EnumC0439n enumC0439n;
        EnumC0439n enumC0439n2;
        switch (this.f10606a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                boolean z2 = this.f10607b;
                if (z2) {
                    enumC0439n = EnumC0439n.f9913a;
                } else {
                    if (z2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    enumC0439n = EnumC0439n.f9915c;
                }
                this.f10608c.g(enumC0439n);
                return;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                boolean z10 = this.f10607b;
                if (z10) {
                    enumC0439n2 = EnumC0439n.f9913a;
                } else {
                    if (z10) {
                        throw new NoWhenBranchMatchedException();
                    }
                    enumC0439n2 = EnumC0439n.f9915c;
                }
                this.f10608c.g(enumC0439n2);
                return;
        }
    }
}
