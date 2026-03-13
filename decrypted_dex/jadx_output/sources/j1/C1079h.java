package j1;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: j1.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1079h {

    /* renamed from: a, reason: collision with root package name */
    public final long f15247a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15248b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15249c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15250d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15251e;

    /* renamed from: f, reason: collision with root package name */
    public final List f15252f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15253g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15254h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15255i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15256k;

    public C1079h(long j, boolean z2, boolean z10, boolean z11, ArrayList arrayList, long j3, boolean z12, long j10, int i3, int i10, int i11) {
        this.f15247a = j;
        this.f15248b = z2;
        this.f15249c = z10;
        this.f15250d = z11;
        this.f15252f = Collections.unmodifiableList(arrayList);
        this.f15251e = j3;
        this.f15253g = z12;
        this.f15254h = j10;
        this.f15255i = i3;
        this.j = i10;
        this.f15256k = i11;
    }

    public C1079h(Parcel parcel) {
        this.f15247a = parcel.readLong();
        this.f15248b = parcel.readByte() == 1;
        this.f15249c = parcel.readByte() == 1;
        this.f15250d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add(new C1078g(parcel.readInt(), parcel.readLong()));
        }
        this.f15252f = Collections.unmodifiableList(arrayList);
        this.f15251e = parcel.readLong();
        this.f15253g = parcel.readByte() == 1;
        this.f15254h = parcel.readLong();
        this.f15255i = parcel.readInt();
        this.j = parcel.readInt();
        this.f15256k = parcel.readInt();
    }
}
