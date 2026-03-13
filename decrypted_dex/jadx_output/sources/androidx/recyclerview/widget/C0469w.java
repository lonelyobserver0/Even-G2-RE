package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.recyclerview.widget.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0469w implements Parcelable {
    public static final Parcelable.Creator<C0469w> CREATOR = new B0.s(24);

    /* renamed from: a, reason: collision with root package name */
    public int f10317a;

    /* renamed from: b, reason: collision with root package name */
    public int f10318b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10319c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f10317a);
        parcel.writeInt(this.f10318b);
        parcel.writeInt(this.f10319c ? 1 : 0);
    }
}
