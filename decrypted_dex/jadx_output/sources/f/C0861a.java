package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.l;
import com.stub.StubApp;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0861a implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<C0861a> CREATOR = new l(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f13685a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f13686b;

    public C0861a(Intent intent, int i3) {
        this.f13685a = i3;
        this.f13686b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17391));
        int i3 = this.f13685a;
        sb2.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : StubApp.getString2(17392) : StubApp.getString2(17393));
        sb2.append(StubApp.getString2(11348));
        sb2.append(this.f13686b);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i3) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f13685a);
        Intent intent = this.f13686b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i3);
        }
    }
}
