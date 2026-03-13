package S3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v extends T3.a {
    public static final Parcelable.Creator<v> CREATOR = new B0.s(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f6566a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f6567b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6568c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f6569d;

    public v(int i3, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f6566a = i3;
        this.f6567b = account;
        this.f6568c = i10;
        this.f6569d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f6566a);
        a4.f.E(parcel, 2, this.f6567b, i3);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f6568c);
        a4.f.E(parcel, 4, this.f6569d, i3);
        a4.f.N(parcel, I10);
    }
}
