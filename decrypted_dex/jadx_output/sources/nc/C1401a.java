package nc;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import j1.C1081j;
import kotlin.UByte;

/* renamed from: nc.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C1401a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f17893a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f17892b = StubApp.getString2(3365).toCharArray();
    public static final Parcelable.Creator<C1401a> CREATOR = new C1081j(16);

    public C1401a(byte[] bArr) {
        this.f17893a = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        byte[] bArr = this.f17893a;
        if ((bArr != null ? bArr.length : 0) == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b2 = bArr[i3];
            int i10 = i3 * 3;
            int i11 = (b2 & UByte.MAX_VALUE) >>> 4;
            char[] cArr2 = f17892b;
            cArr[i10] = cArr2[i11];
            cArr[i10 + 1] = cArr2[b2 & 15];
            if (i3 != bArr.length - 1) {
                cArr[i10 + 2] = '-';
            }
        }
        return StubApp.getString2(26138).concat(new String(cArr));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByteArray(this.f17893a);
    }
}
