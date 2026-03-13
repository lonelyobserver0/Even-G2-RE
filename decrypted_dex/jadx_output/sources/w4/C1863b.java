package w4;

import A.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1863b extends R.b {
    public static final Parcelable.Creator<C1863b> CREATOR = new g(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f22108c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22109d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22110e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22111f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22112g;

    public C1863b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f22108c = parcel.readInt();
        this.f22109d = parcel.readInt();
        this.f22110e = parcel.readInt() == 1;
        this.f22111f = parcel.readInt() == 1;
        this.f22112g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f22108c);
        parcel.writeInt(this.f22109d);
        parcel.writeInt(this.f22110e ? 1 : 0);
        parcel.writeInt(this.f22111f ? 1 : 0);
        parcel.writeInt(this.f22112g ? 1 : 0);
    }

    public C1863b(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f22108c = bottomSheetBehavior.f11850u;
        this.f22109d = bottomSheetBehavior.f11834d;
        this.f22110e = bottomSheetBehavior.f11832b;
        this.f22111f = bottomSheetBehavior.f11848s;
        this.f22112g = bottomSheetBehavior.f11849t;
    }
}
