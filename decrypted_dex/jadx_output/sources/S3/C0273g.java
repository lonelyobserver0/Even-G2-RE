package S3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: S3.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0273g extends T3.a {
    public static final Parcelable.Creator<C0273g> CREATOR = new B0.s(15);

    /* renamed from: a, reason: collision with root package name */
    public final C0281o f6515a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6516b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6517c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f6518d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6519e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f6520f;

    public C0273g(C0281o c0281o, boolean z2, boolean z10, int[] iArr, int i3, int[] iArr2) {
        this.f6515a = c0281o;
        this.f6516b = z2;
        this.f6517c = z10;
        this.f6518d = iArr;
        this.f6519e = i3;
        this.f6520f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.E(parcel, 1, this.f6515a, i3);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f6516b ? 1 : 0);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f6517c ? 1 : 0);
        a4.f.D(parcel, 4, this.f6518d);
        a4.f.P(parcel, 5, 4);
        parcel.writeInt(this.f6519e);
        a4.f.D(parcel, 6, this.f6520f);
        a4.f.N(parcel, I10);
    }
}
