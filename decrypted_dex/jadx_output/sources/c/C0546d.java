package c;

import B0.s;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0546d implements Parcelable {
    public static final Parcelable.Creator<C0546d> CREATOR = new s(27);

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0544b f10774a;

    public void d(int i3, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        synchronized (this) {
            try {
                if (this.f10774a == null) {
                    this.f10774a = new BinderC0545c(this);
                }
                parcel.writeStrongBinder(this.f10774a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
