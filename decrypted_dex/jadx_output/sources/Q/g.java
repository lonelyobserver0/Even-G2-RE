package Q;

import B0.s;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends View.BaseSavedState {
    public static final Parcelable.Creator<g> CREATOR = new s(5);

    /* renamed from: a, reason: collision with root package name */
    public int f5686a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5044));
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(StubApp.getString2(5045));
        return AbstractC1482f.f(this.f5686a, StubApp.getString2(265), sb2);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f5686a);
    }
}
