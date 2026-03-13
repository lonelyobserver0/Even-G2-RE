package i4;

import S3.D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: i4.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1041e extends T3.a {
    public static final Parcelable.Creator<C1041e> CREATOR = new h1.n(22);

    /* renamed from: a, reason: collision with root package name */
    public final List f14764a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f14765b;

    public C1041e(ArrayList arrayList, Bundle bundle) {
        this.f14765b = null;
        D.i(arrayList, StubApp.getString2(18500));
        if (!arrayList.isEmpty()) {
            for (int i3 = 1; i3 < arrayList.size(); i3++) {
                int i10 = i3 - 1;
                D.c(((C1039c) arrayList.get(i3)).f14758c >= ((C1039c) arrayList.get(i10)).f14758c, StubApp.getString2(18501), Long.valueOf(((C1039c) arrayList.get(i3)).f14758c), Long.valueOf(((C1039c) arrayList.get(i10)).f14758c));
            }
        }
        this.f14764a = Collections.unmodifiableList(arrayList);
        this.f14765b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1041e.class != obj.getClass()) {
            return false;
        }
        return this.f14764a.equals(((C1041e) obj).f14764a);
    }

    public final int hashCode() {
        return this.f14764a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        D.h(parcel);
        int I10 = a4.f.I(parcel, 20293);
        a4.f.H(parcel, 1, this.f14764a);
        a4.f.B(parcel, 2, this.f14765b);
        a4.f.N(parcel, I10);
    }
}
