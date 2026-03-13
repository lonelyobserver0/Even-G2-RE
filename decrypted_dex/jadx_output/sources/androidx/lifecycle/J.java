package androidx.lifecycle;

import d0.C0765C;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class J implements r, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f9877a;

    /* renamed from: b, reason: collision with root package name */
    public final I f9878b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9879c;

    public J(String key, I handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f9877a = key;
        this.f9878b = handle;
    }

    public final void a(AbstractC0440o lifecycle, E0 registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f9879c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f9879c = true;
        lifecycle.a(this);
        registry.K(this.f9877a, (C0765C) this.f9878b.f9876a.f654f);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC0444t source, EnumC0438m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC0438m.ON_DESTROY) {
            this.f9879c = false;
            source.i().b(this);
        }
    }
}
