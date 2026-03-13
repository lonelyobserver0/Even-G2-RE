package o0;

import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import r0.AbstractC1560u;

/* renamed from: o0.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1435j implements Comparator, Parcelable {
    public static final Parcelable.Creator<C1435j> CREATOR = new C1081j(17);

    /* renamed from: a, reason: collision with root package name */
    public final C1434i[] f18150a;

    /* renamed from: b, reason: collision with root package name */
    public int f18151b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18152c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18153d;

    public C1435j(ArrayList arrayList, String str) {
        this(str, false, (C1434i[]) arrayList.toArray(new C1434i[0]));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1434i c1434i = (C1434i) obj;
        C1434i c1434i2 = (C1434i) obj2;
        UUID uuid = AbstractC1430e.f18130a;
        return uuid.equals(c1434i.f18146b) ? uuid.equals(c1434i2.f18146b) ? 0 : 1 : c1434i.f18146b.compareTo(c1434i2.f18146b);
    }

    public final C1435j d(String str) {
        int i3 = AbstractC1560u.f20190a;
        return Objects.equals(this.f18152c, str) ? this : new C1435j(str, false, this.f18150a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1435j.class == obj.getClass()) {
            C1435j c1435j = (C1435j) obj;
            int i3 = AbstractC1560u.f20190a;
            if (Objects.equals(this.f18152c, c1435j.f18152c) && Arrays.equals(this.f18150a, c1435j.f18150a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18151b == 0) {
            String str = this.f18152c;
            this.f18151b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f18150a);
        }
        return this.f18151b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f18152c);
        parcel.writeTypedArray(this.f18150a, 0);
    }

    public C1435j(C1434i... c1434iArr) {
        this(null, true, c1434iArr);
    }

    public C1435j(String str, boolean z2, C1434i... c1434iArr) {
        this.f18152c = str;
        c1434iArr = z2 ? (C1434i[]) c1434iArr.clone() : c1434iArr;
        this.f18150a = c1434iArr;
        this.f18153d = c1434iArr.length;
        Arrays.sort(c1434iArr, this);
    }

    public C1435j(Parcel parcel) {
        this.f18152c = parcel.readString();
        C1434i[] c1434iArr = (C1434i[]) parcel.createTypedArray(C1434i.CREATOR);
        int i3 = AbstractC1560u.f20190a;
        this.f18150a = c1434iArr;
        this.f18153d = c1434iArr.length;
    }
}
