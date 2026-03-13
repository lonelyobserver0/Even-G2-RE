package h1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.Objects;
import r0.AbstractC1560u;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1000c extends AbstractC1006i {
    public static final Parcelable.Creator<C1000c> CREATOR = new com.google.android.material.datepicker.l(23);

    /* renamed from: b, reason: collision with root package name */
    public final String f14424b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14425c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14426d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14427e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14428f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1006i[] f14429g;

    public C1000c(String str, int i3, int i10, long j, long j3, AbstractC1006i[] abstractC1006iArr) {
        super(StubApp.getString2(18065));
        this.f14424b = str;
        this.f14425c = i3;
        this.f14426d = i10;
        this.f14427e = j;
        this.f14428f = j3;
        this.f14429g = abstractC1006iArr;
    }

    @Override // h1.AbstractC1006i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1000c.class == obj.getClass()) {
            C1000c c1000c = (C1000c) obj;
            if (this.f14425c == c1000c.f14425c && this.f14426d == c1000c.f14426d && this.f14427e == c1000c.f14427e && this.f14428f == c1000c.f14428f) {
                int i3 = AbstractC1560u.f20190a;
                if (Objects.equals(this.f14424b, c1000c.f14424b) && Arrays.equals(this.f14429g, c1000c.f14429g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (((((((527 + this.f14425c) * 31) + this.f14426d) * 31) + ((int) this.f14427e)) * 31) + ((int) this.f14428f)) * 31;
        String str = this.f14424b;
        return i3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f14424b);
        parcel.writeInt(this.f14425c);
        parcel.writeInt(this.f14426d);
        parcel.writeLong(this.f14427e);
        parcel.writeLong(this.f14428f);
        AbstractC1006i[] abstractC1006iArr = this.f14429g;
        parcel.writeInt(abstractC1006iArr.length);
        for (AbstractC1006i abstractC1006i : abstractC1006iArr) {
            parcel.writeParcelable(abstractC1006i, 0);
        }
    }

    public C1000c(Parcel parcel) {
        super(StubApp.getString2(18065));
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f14424b = readString;
        this.f14425c = parcel.readInt();
        this.f14426d = parcel.readInt();
        this.f14427e = parcel.readLong();
        this.f14428f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f14429g = new AbstractC1006i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f14429g[i10] = (AbstractC1006i) parcel.readParcelable(AbstractC1006i.class.getClassLoader());
        }
    }
}
