package d1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.l;
import com.stub.StubApp;
import o0.z;
import p0.AbstractC1482f;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0796a implements z {
    public static final Parcelable.Creator<C0796a> CREATOR = new l(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f13408a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13409b;

    public C0796a(int i3, String str) {
        this.f13408a = i3;
        this.f13409b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(16814));
        sb2.append(this.f13408a);
        sb2.append(StubApp.getString2(16815));
        return AbstractC1482f.k(sb2, this.f13409b, StubApp.getString2(74));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f13409b);
        parcel.writeInt(this.f13408a);
    }
}
