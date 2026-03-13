package B0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.z;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u implements z {
    public static final Parcelable.Creator<u> CREATOR = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f575a;

    /* renamed from: b, reason: collision with root package name */
    public final String f576b;

    /* renamed from: c, reason: collision with root package name */
    public final List f577c;

    public u(String str, String str2, List list) {
        this.f575a = str;
        this.f576b = str2;
        this.f577c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.f575a, uVar.f575a) && TextUtils.equals(this.f576b, uVar.f576b) && this.f577c.equals(uVar.f577c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f575a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f576b;
        return this.f577c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(509));
        String str = this.f575a;
        sb2.append(str != null ? AbstractC1482f.k(com.mapbox.common.b.l(StubApp.getString2(510), str, StubApp.getString2(81)), this.f576b, StubApp.getString2(511)) : "");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f575a);
        parcel.writeString(this.f576b);
        List list = this.f577c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeParcelable((Parcelable) list.get(i10), 0);
        }
    }

    public u(Parcel parcel) {
        this.f575a = parcel.readString();
        this.f576b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.f577c = Collections.unmodifiableList(arrayList);
    }
}
