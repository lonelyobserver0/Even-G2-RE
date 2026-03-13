package V1;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.stub.StubApp;
import p0.AbstractC1482f;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f7715d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f7716e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7717f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7718g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7719h;

    /* renamed from: i, reason: collision with root package name */
    public int f7720i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f7721k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1692e(0), new C1692e(0), new C1692e(0));
    }

    @Override // V1.a
    public final b a() {
        Parcel parcel = this.f7716e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.j;
        if (i3 == this.f7717f) {
            i3 = this.f7718g;
        }
        return new b(parcel, dataPosition, i3, AbstractC1482f.k(new StringBuilder(), this.f7719h, StubApp.getString2(6127)), this.f7712a, this.f7713b, this.f7714c);
    }

    @Override // V1.a
    public final boolean e(int i3) {
        while (this.j < this.f7718g) {
            int i10 = this.f7721k;
            if (i10 == i3) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i11 = this.j;
            Parcel parcel = this.f7716e;
            parcel.setDataPosition(i11);
            int readInt = parcel.readInt();
            this.f7721k = parcel.readInt();
            this.j += readInt;
        }
        return this.f7721k == i3;
    }

    @Override // V1.a
    public final void i(int i3) {
        int i10 = this.f7720i;
        SparseIntArray sparseIntArray = this.f7715d;
        Parcel parcel = this.f7716e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f7720i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i10, String str, C1692e c1692e, C1692e c1692e2, C1692e c1692e3) {
        super(c1692e, c1692e2, c1692e3);
        this.f7715d = new SparseIntArray();
        this.f7720i = -1;
        this.f7721k = -1;
        this.f7716e = parcel;
        this.f7717f = i3;
        this.f7718g = i10;
        this.j = i3;
        this.f7719h = str;
    }
}
