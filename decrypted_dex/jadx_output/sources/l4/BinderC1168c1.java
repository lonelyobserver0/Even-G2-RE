package l4;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC0700x;
import com.google.android.gms.internal.measurement.AbstractC0705y;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l4.c1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class BinderC1168c1 extends AbstractBinderC0700x implements InterfaceC1153I {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f16402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1168c1(C1189j1 c1189j1, AtomicReference atomicReference) {
        super(StubApp.getString2(20382));
        this.f16402e = atomicReference;
    }

    @Override // l4.InterfaceC1153I
    public final void F(List list) {
        AtomicReference atomicReference = this.f16402e;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0700x
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(u1.CREATOR);
        AbstractC0705y.d(parcel);
        F(createTypedArrayList);
        return true;
    }
}
