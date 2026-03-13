package i1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import h1.n;
import java.util.ArrayList;
import o0.z;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements z {
    public static final Parcelable.Creator<c> CREATOR = new n(3);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14712a;

    public c(ArrayList arrayList) {
        this.f14712a = arrayList;
        boolean z2 = false;
        if (!arrayList.isEmpty()) {
            long j = ((b) arrayList.get(0)).f14710b;
            int i3 = 1;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i3)).f14709a < j) {
                    z2 = true;
                    break;
                } else {
                    j = ((b) arrayList.get(i3)).f14710b;
                    i3++;
                }
            }
        }
        AbstractC1550k.c(!z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f14712a.equals(((c) obj).f14712a);
    }

    public final int hashCode() {
        return this.f14712a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(18458) + this.f14712a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeList(this.f14712a);
    }
}
