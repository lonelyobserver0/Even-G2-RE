package d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.ArrayList;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0772b implements Parcelable {
    public static final Parcelable.Creator<C0772b> CREATOR = new com.google.android.material.datepicker.l(1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f13268a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13269b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f13270c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f13271d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13272e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13273f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13274g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13275h;
    public final CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13276k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f13277l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f13278m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f13279n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13280p;

    public C0772b(C0771a c0771a) {
        int size = c0771a.f13240a.size();
        this.f13268a = new int[size * 6];
        if (!c0771a.f13246g) {
            throw new IllegalStateException(StubApp.getString2(16685));
        }
        this.f13269b = new ArrayList(size);
        this.f13270c = new int[size];
        this.f13271d = new int[size];
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            V v2 = (V) c0771a.f13240a.get(i10);
            int i11 = i3 + 1;
            this.f13268a[i3] = v2.f13219a;
            ArrayList arrayList = this.f13269b;
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = v2.f13220b;
            arrayList.add(abstractComponentCallbacksC0789t != null ? abstractComponentCallbacksC0789t.f13368e : null);
            int[] iArr = this.f13268a;
            iArr[i11] = v2.f13221c ? 1 : 0;
            iArr[i3 + 2] = v2.f13222d;
            iArr[i3 + 3] = v2.f13223e;
            int i12 = i3 + 5;
            iArr[i3 + 4] = v2.f13224f;
            i3 += 6;
            iArr[i12] = v2.f13225g;
            this.f13270c[i10] = v2.f13226h.ordinal();
            this.f13271d[i10] = v2.f13227i.ordinal();
        }
        this.f13272e = c0771a.f13245f;
        this.f13273f = c0771a.f13247h;
        this.f13274g = c0771a.f13256r;
        this.f13275h = c0771a.f13248i;
        this.j = c0771a.j;
        this.f13276k = c0771a.f13249k;
        this.f13277l = c0771a.f13250l;
        this.f13278m = c0771a.f13251m;
        this.f13279n = c0771a.f13252n;
        this.f13280p = c0771a.f13253o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f13268a);
        parcel.writeStringList(this.f13269b);
        parcel.writeIntArray(this.f13270c);
        parcel.writeIntArray(this.f13271d);
        parcel.writeInt(this.f13272e);
        parcel.writeString(this.f13273f);
        parcel.writeInt(this.f13274g);
        parcel.writeInt(this.f13275h);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.f13276k);
        TextUtils.writeToParcel(this.f13277l, parcel, 0);
        parcel.writeStringList(this.f13278m);
        parcel.writeStringList(this.f13279n);
        parcel.writeInt(this.f13280p ? 1 : 0);
    }

    public C0772b(Parcel parcel) {
        this.f13268a = parcel.createIntArray();
        this.f13269b = parcel.createStringArrayList();
        this.f13270c = parcel.createIntArray();
        this.f13271d = parcel.createIntArray();
        this.f13272e = parcel.readInt();
        this.f13273f = parcel.readString();
        this.f13274g = parcel.readInt();
        this.f13275h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.j = (CharSequence) creator.createFromParcel(parcel);
        this.f13276k = parcel.readInt();
        this.f13277l = (CharSequence) creator.createFromParcel(parcel);
        this.f13278m = parcel.createStringArrayList();
        this.f13279n = parcel.createStringArrayList();
        this.f13280p = parcel.readInt() != 0;
    }
}
