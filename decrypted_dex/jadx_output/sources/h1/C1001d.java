package h1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.Objects;
import r0.AbstractC1560u;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1001d extends AbstractC1006i {
    public static final Parcelable.Creator<C1001d> CREATOR = new com.google.android.material.datepicker.l(24);

    /* renamed from: b, reason: collision with root package name */
    public final String f14430b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14431c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14432d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f14433e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1006i[] f14434f;

    public C1001d(String str, boolean z2, boolean z10, String[] strArr, AbstractC1006i[] abstractC1006iArr) {
        super(StubApp.getString2(18066));
        this.f14430b = str;
        this.f14431c = z2;
        this.f14432d = z10;
        this.f14433e = strArr;
        this.f14434f = abstractC1006iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1001d.class == obj.getClass()) {
            C1001d c1001d = (C1001d) obj;
            if (this.f14431c == c1001d.f14431c && this.f14432d == c1001d.f14432d) {
                int i3 = AbstractC1560u.f20190a;
                if (Objects.equals(this.f14430b, c1001d.f14430b) && Arrays.equals(this.f14433e, c1001d.f14433e) && Arrays.equals(this.f14434f, c1001d.f14434f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (((527 + (this.f14431c ? 1 : 0)) * 31) + (this.f14432d ? 1 : 0)) * 31;
        String str = this.f14430b;
        return i3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f14430b);
        parcel.writeByte(this.f14431c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14432d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f14433e);
        AbstractC1006i[] abstractC1006iArr = this.f14434f;
        parcel.writeInt(abstractC1006iArr.length);
        for (AbstractC1006i abstractC1006i : abstractC1006iArr) {
            parcel.writeParcelable(abstractC1006i, 0);
        }
    }

    public C1001d(Parcel parcel) {
        super(StubApp.getString2(18066));
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f14430b = readString;
        this.f14431c = parcel.readByte() != 0;
        this.f14432d = parcel.readByte() != 0;
        this.f14433e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f14434f = new AbstractC1006i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f14434f[i10] = (AbstractC1006i) parcel.readParcelable(AbstractC1006i.class.getClassLoader());
        }
    }
}
