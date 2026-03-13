package l4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import j1.C1081j;
import java.util.Iterator;

/* renamed from: l4.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1213u extends T3.a implements Iterable {
    public static final Parcelable.Creator<C1213u> CREATOR = new C1081j(6);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f16633a;

    public C1213u(Bundle bundle) {
        this.f16633a = bundle;
    }

    public final Object d(String str) {
        return this.f16633a.get(str);
    }

    public final Double f() {
        return Double.valueOf(this.f16633a.getDouble(StubApp.getString2(1061)));
    }

    public final String g() {
        return this.f16633a.getString(StubApp.getString2(7787));
    }

    public final Bundle i() {
        return new Bundle(this.f16633a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1211t(this);
    }

    public final String toString() {
        return this.f16633a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.B(parcel, 2, i());
        a4.f.N(parcel, I10);
    }
}
