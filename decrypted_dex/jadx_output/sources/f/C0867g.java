package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.l;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0867g implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<C0867g> CREATOR = new l(10);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f13693a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f13694b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13695c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13696d;

    public C0867g(IntentSender intentSender, Intent intent, int i3, int i10) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f13693a = intentSender;
        this.f13694b = intent;
        this.f13695c = i3;
        this.f13696d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i3) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f13693a, i3);
        dest.writeParcelable(this.f13694b, i3);
        dest.writeInt(this.f13695c);
        dest.writeInt(this.f13696d);
    }
}
