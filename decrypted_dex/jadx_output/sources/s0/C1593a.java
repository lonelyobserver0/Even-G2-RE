package s0;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import i2.u;
import j1.C1081j;
import java.util.ArrayList;
import java.util.Arrays;
import o0.z;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import w.AbstractC1856e;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1593a implements z {
    public static final Parcelable.Creator<C1593a> CREATOR = new C1081j(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f20587a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20588b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20589c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20590d;

    public C1593a(String str, byte[] bArr, int i3, int i10) {
        e(str, bArr, i10);
        this.f20587a = str;
        this.f20588b = bArr;
        this.f20589c = i3;
        this.f20590d = i10;
    }

    public static void e(String str, byte[] bArr, int i3) {
        byte b2;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals(StubApp.getString2(21366))) {
                    c10 = 0;
                    break;
                }
                break;
            case -1555642602:
                if (str.equals(StubApp.getString2(21343))) {
                    c10 = 1;
                    break;
                }
                break;
            case 101820674:
                if (str.equals(StubApp.getString2(23021))) {
                    c10 = 2;
                    break;
                }
                break;
            case 188404399:
                if (str.equals(StubApp.getString2(21345))) {
                    c10 = 3;
                    break;
                }
                break;
            case 1805012160:
                if (str.equals(StubApp.getString2(21344))) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (i3 == 23 && bArr.length == 4) {
                    r1 = true;
                }
                AbstractC1550k.c(r1);
                break;
            case 1:
                if (i3 == 75 && bArr.length == 1 && ((b2 = bArr[0]) == 0 || b2 == 1)) {
                    r1 = true;
                }
                AbstractC1550k.c(r1);
                break;
            case 2:
            case 3:
                if (i3 == 78 && bArr.length == 8) {
                    r1 = true;
                }
                AbstractC1550k.c(r1);
                break;
            case 4:
                AbstractC1550k.c(i3 == 0);
                break;
        }
    }

    public final ArrayList d() {
        AbstractC1550k.f(StubApp.getString2(23022), this.f20587a.equals(StubApp.getString2(21344)));
        byte[] bArr = this.f20588b;
        byte b2 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < b2; i3++) {
            arrayList.add(Integer.valueOf(bArr[i3 + 2]));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1593a.class == obj.getClass()) {
            C1593a c1593a = (C1593a) obj;
            if (this.f20587a.equals(c1593a.f20587a) && Arrays.equals(this.f20588b, c1593a.f20588b) && this.f20589c == c1593a.f20589c && this.f20590d == c1593a.f20590d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f20588b) + u.d(527, 31, this.f20587a)) * 31) + this.f20589c) * 31) + this.f20590d;
    }

    public final String toString() {
        String sb2;
        String str = this.f20587a;
        byte[] bArr = this.f20588b;
        int i3 = this.f20590d;
        if (i3 == 0) {
            if (str.equals(StubApp.getString2(21344))) {
                ArrayList d8 = d();
                StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(23023));
                new A0.c(String.valueOf(',')).e(b2, d8.iterator());
                sb2 = b2.toString();
            }
            sb2 = AbstractC1560u.U(bArr);
        } else if (i3 == 1) {
            sb2 = AbstractC1560u.n(bArr);
        } else if (i3 == 23) {
            sb2 = String.valueOf(Float.intBitsToFloat(android.support.v4.media.session.b.p(bArr)));
        } else if (i3 == 67) {
            sb2 = String.valueOf(android.support.v4.media.session.b.p(bArr));
        } else if (i3 != 75) {
            if (i3 == 78) {
                sb2 = String.valueOf(new C1553n(bArr).z());
            }
            sb2 = AbstractC1560u.U(bArr);
        } else {
            sb2 = String.valueOf(Byte.toUnsignedInt(bArr[0]));
        }
        return AbstractC1482f.i(StubApp.getString2(23024), str, StubApp.getString2(12722), sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f20587a);
        parcel.writeByteArray(this.f20588b);
        parcel.writeInt(this.f20589c);
        parcel.writeInt(this.f20590d);
    }

    public C1593a(Parcel parcel) {
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f20587a = readString;
        byte[] createByteArray = parcel.createByteArray();
        this.f20588b = createByteArray;
        this.f20589c = parcel.readInt();
        int readInt = parcel.readInt();
        this.f20590d = readInt;
        e(readString, createByteArray, readInt);
    }
}
