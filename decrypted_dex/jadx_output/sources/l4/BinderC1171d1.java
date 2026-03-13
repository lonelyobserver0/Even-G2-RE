package l4;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC0700x;
import com.google.android.gms.internal.measurement.AbstractC0705y;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l4.d1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class BinderC1171d1 extends AbstractBinderC0700x implements InterfaceC1155K {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f16408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1189j1 f16409f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1171d1(C1189j1 c1189j1, AtomicReference atomicReference) {
        super(StubApp.getString2(20401));
        this.f16408e = atomicReference;
        this.f16409f = c1189j1;
    }

    @Override // l4.InterfaceC1155K
    public final void G(z1 z1Var) {
        AtomicReference atomicReference = this.f16408e;
        synchronized (atomicReference) {
            T t3 = ((C1200n0) this.f16409f.f4728a).f16541f;
            C1200n0.l(t3);
            t3.f16249p.c(Integer.valueOf(z1Var.f16712a.size()), StubApp.getString2("20402"));
            atomicReference.set(z1Var);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0700x
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 2) {
            return false;
        }
        z1 z1Var = (z1) AbstractC0705y.a(parcel, z1.CREATOR);
        AbstractC0705y.d(parcel);
        G(z1Var);
        return true;
    }
}
