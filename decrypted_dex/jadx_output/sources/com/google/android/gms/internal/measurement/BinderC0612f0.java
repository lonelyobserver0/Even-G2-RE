package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.stub.StubApp;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BinderC0612f0 extends AbstractBinderC0700x implements N {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.O0 f11560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0612f0(C0592b0 c0592b0, l4.O0 o02) {
        super(StubApp.getString2(11684));
        this.f11560e = o02;
        Objects.requireNonNull(c0592b0);
    }

    @Override // com.google.android.gms.internal.measurement.N
    public final void a() {
        this.f11560e.run();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0700x
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 2) {
            return false;
        }
        a();
        return true;
    }
}
