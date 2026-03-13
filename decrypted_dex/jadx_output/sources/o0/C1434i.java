package o0;

import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import r0.AbstractC1560u;

/* renamed from: o0.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1434i implements Parcelable {
    public static final Parcelable.Creator<C1434i> CREATOR = new C1081j(18);

    /* renamed from: a, reason: collision with root package name */
    public int f18145a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f18146b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18147c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18148d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f18149e;

    public C1434i(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f18146b = uuid;
        this.f18147c = str;
        str2.getClass();
        this.f18148d = AbstractC1405B.m(str2);
        this.f18149e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1434i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1434i c1434i = (C1434i) obj;
        String str = c1434i.f18147c;
        int i3 = AbstractC1560u.f20190a;
        return Objects.equals(this.f18147c, str) && Objects.equals(this.f18148d, c1434i.f18148d) && Objects.equals(this.f18146b, c1434i.f18146b) && Arrays.equals(this.f18149e, c1434i.f18149e);
    }

    public final int hashCode() {
        if (this.f18145a == 0) {
            int hashCode = this.f18146b.hashCode() * 31;
            String str = this.f18147c;
            this.f18145a = Arrays.hashCode(this.f18149e) + i2.u.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f18148d);
        }
        return this.f18145a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        UUID uuid = this.f18146b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f18147c);
        parcel.writeString(this.f18148d);
        parcel.writeByteArray(this.f18149e);
    }

    public C1434i(Parcel parcel) {
        this.f18146b = new UUID(parcel.readLong(), parcel.readLong());
        this.f18147c = parcel.readString();
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f18148d = readString;
        this.f18149e = parcel.createByteArray();
    }
}
