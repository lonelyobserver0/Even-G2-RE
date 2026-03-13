package B0;

import D5.z;
import S3.C0272f;
import S3.C0273g;
import S3.C0274h;
import S3.C0279m;
import S3.C0281o;
import S3.C0282p;
import S3.K;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.recyclerview.widget.C0469w;
import androidx.recyclerview.widget.l0;
import androidx.recyclerview.widget.m0;
import androidx.versionedparcelable.ParcelImpl;
import c.C0546d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f568a;

    public /* synthetic */ s(int i3) {
        this.f568a = i3;
    }

    public static void a(C0274h c0274h, Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(c0274h.f6523a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(c0274h.f6524b);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(c0274h.f6525c);
        a4.f.F(parcel, 4, c0274h.f6526d);
        a4.f.C(parcel, 5, c0274h.f6527e);
        a4.f.G(parcel, 6, c0274h.f6528f, i3);
        a4.f.B(parcel, 7, c0274h.f6529g);
        a4.f.E(parcel, 8, c0274h.f6530h, i3);
        a4.f.G(parcel, 10, c0274h.j, i3);
        a4.f.G(parcel, 11, c0274h.f6531k, i3);
        a4.f.P(parcel, 12, 4);
        parcel.writeInt(c0274h.f6532l ? 1 : 0);
        a4.f.P(parcel, 13, 4);
        parcel.writeInt(c0274h.f6533m);
        boolean z2 = c0274h.f6534n;
        a4.f.P(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        a4.f.F(parcel, 15, c0274h.f6535p);
        a4.f.N(parcel, I10);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0194  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r37) {
        /*
            Method dump skipped, instructions count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.s.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f568a) {
            case 0:
                return new u[i3];
            case 1:
                return new t[i3];
            case 2:
                return new z[i3];
            case 3:
                return new La.a[i3];
            case 4:
                return new GoogleSignInAccount[i3];
            case 5:
                return new Q.g[i3];
            case 6:
                return new Scope[i3];
            case 7:
                return new Status[i3];
            case 8:
                return new C0272f[i3];
            case 9:
                return new C0282p[i3];
            case 10:
                return new C0279m[i3];
            case 11:
                return new S3.v[i3];
            case 12:
                return new S3.w[i3];
            case 13:
                return new C0281o[i3];
            case 14:
                return new K[i3];
            case 15:
                return new C0273g[i3];
            case 16:
                return new C0274h[i3];
            case 17:
                return new ParcelImpl[i3];
            case 18:
                return new X6.d[i3];
            case 19:
                return new X6.e[i3];
            case 20:
                return new MediaBrowserCompat$MediaItem[i3];
            case 21:
                return new MediaDescriptionCompat[i3];
            case 22:
                return new MediaMetadataCompat[i3];
            case 23:
                return new RatingCompat[i3];
            case 24:
                return new C0469w[i3];
            case 25:
                return new l0[i3];
            case 26:
                return new m0[i3];
            case 27:
                return new C0546d[i3];
            case 28:
                return new com.google.android.material.datepicker.b[i3];
            default:
                return new com.google.android.material.datepicker.c[i3];
        }
    }
}
