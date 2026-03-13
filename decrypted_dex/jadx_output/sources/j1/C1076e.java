package j1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import h1.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1076e extends AbstractC1073b {
    public static final Parcelable.Creator<C1076e> CREATOR = new n(27);

    /* renamed from: a, reason: collision with root package name */
    public final long f15233a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15234b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15235c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15236d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15237e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15238f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15239g;

    /* renamed from: h, reason: collision with root package name */
    public final List f15240h;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final long f15241k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15242l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15243m;

    /* renamed from: n, reason: collision with root package name */
    public final int f15244n;

    public C1076e(long j, boolean z2, boolean z10, boolean z11, boolean z12, long j3, long j10, List list, boolean z13, long j11, int i3, int i10, int i11) {
        this.f15233a = j;
        this.f15234b = z2;
        this.f15235c = z10;
        this.f15236d = z11;
        this.f15237e = z12;
        this.f15238f = j3;
        this.f15239g = j10;
        this.f15240h = Collections.unmodifiableList(list);
        this.j = z13;
        this.f15241k = j11;
        this.f15242l = i3;
        this.f15243m = i10;
        this.f15244n = i11;
    }

    @Override // j1.AbstractC1073b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(18950));
        sb2.append(this.f15238f);
        sb2.append(StubApp.getString2(18951));
        return Xa.h.q(sb2, this.f15239g, StubApp.getString2(9385));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f15233a);
        parcel.writeByte(this.f15234b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15235c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15236d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15237e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f15238f);
        parcel.writeLong(this.f15239g);
        List list = this.f15240h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            C1075d c1075d = (C1075d) list.get(i10);
            parcel.writeInt(c1075d.f15230a);
            parcel.writeLong(c1075d.f15231b);
            parcel.writeLong(c1075d.f15232c);
        }
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f15241k);
        parcel.writeInt(this.f15242l);
        parcel.writeInt(this.f15243m);
        parcel.writeInt(this.f15244n);
    }

    public C1076e(Parcel parcel) {
        this.f15233a = parcel.readLong();
        this.f15234b = parcel.readByte() == 1;
        this.f15235c = parcel.readByte() == 1;
        this.f15236d = parcel.readByte() == 1;
        this.f15237e = parcel.readByte() == 1;
        this.f15238f = parcel.readLong();
        this.f15239g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add(new C1075d(parcel.readLong(), parcel.readInt(), parcel.readLong()));
        }
        this.f15240h = Collections.unmodifiableList(arrayList);
        this.j = parcel.readByte() == 1;
        this.f15241k = parcel.readLong();
        this.f15242l = parcel.readInt();
        this.f15243m = parcel.readInt();
        this.f15244n = parcel.readInt();
    }
}
