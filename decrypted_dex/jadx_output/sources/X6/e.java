package X6;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends f {
    public static final Parcelable.Creator<e> CREATOR = new B0.s(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f8429a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8430b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8431c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8432d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8433e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8434f;

    /* renamed from: g, reason: collision with root package name */
    public final List f8435g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8436h;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final o f8437k;

    /* renamed from: l, reason: collision with root package name */
    public final float f8438l;

    /* renamed from: m, reason: collision with root package name */
    public final String f8439m;

    /* renamed from: n, reason: collision with root package name */
    public final String f8440n;

    /* renamed from: p, reason: collision with root package name */
    public final String f8441p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8442q;

    /* renamed from: r, reason: collision with root package name */
    public final String f8443r;

    /* renamed from: s, reason: collision with root package name */
    public final float f8444s;

    /* renamed from: t, reason: collision with root package name */
    public final String f8445t;

    /* renamed from: v, reason: collision with root package name */
    public final List f8446v;

    /* renamed from: w, reason: collision with root package name */
    public final List f8447w;

    /* renamed from: x, reason: collision with root package name */
    public final n f8448x;

    /* renamed from: y, reason: collision with root package name */
    public final String f8449y;

    /* renamed from: z, reason: collision with root package name */
    public final String f8450z;

    public e(String modelUri, List position, float f10, List modelScale, String str, List modelTranslation, List modelRotation, boolean z2, boolean z10, o modelScaleMode, float f11, String str2, String str3, String str4, int i3, String str5, float f12, String str6, List materialOverrides, List nodeOverrides, n modelElevationReference, String modelColorUseTheme, String str7) {
        Intrinsics.checkNotNullParameter(modelUri, "modelUri");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(modelScale, "modelScale");
        Intrinsics.checkNotNullParameter(modelTranslation, "modelTranslation");
        Intrinsics.checkNotNullParameter(modelRotation, "modelRotation");
        Intrinsics.checkNotNullParameter(modelScaleMode, "modelScaleMode");
        Intrinsics.checkNotNullParameter(materialOverrides, "materialOverrides");
        Intrinsics.checkNotNullParameter(nodeOverrides, "nodeOverrides");
        Intrinsics.checkNotNullParameter(modelElevationReference, "modelElevationReference");
        Intrinsics.checkNotNullParameter(modelColorUseTheme, "modelColorUseTheme");
        this.f8429a = modelUri;
        this.f8430b = position;
        this.f8431c = f10;
        this.f8432d = modelScale;
        this.f8433e = str;
        this.f8434f = modelTranslation;
        this.f8435g = modelRotation;
        this.f8436h = z2;
        this.j = z10;
        this.f8437k = modelScaleMode;
        this.f8438l = f11;
        this.f8439m = str2;
        this.f8440n = str3;
        this.f8441p = str4;
        this.f8442q = i3;
        this.f8443r = str5;
        this.f8444s = f12;
        this.f8445t = str6;
        this.f8446v = materialOverrides;
        this.f8447w = nodeOverrides;
        this.f8448x = modelElevationReference;
        this.f8449y = modelColorUseTheme;
        this.f8450z = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f8429a, eVar.f8429a) && Intrinsics.areEqual(this.f8430b, eVar.f8430b) && Float.compare(this.f8431c, eVar.f8431c) == 0 && Intrinsics.areEqual(this.f8432d, eVar.f8432d) && Intrinsics.areEqual(this.f8433e, eVar.f8433e) && Intrinsics.areEqual(this.f8434f, eVar.f8434f) && Intrinsics.areEqual(this.f8435g, eVar.f8435g) && this.f8436h == eVar.f8436h && this.j == eVar.j && this.f8437k == eVar.f8437k && Float.compare(this.f8438l, eVar.f8438l) == 0 && Intrinsics.areEqual(this.f8439m, eVar.f8439m) && Intrinsics.areEqual(this.f8440n, eVar.f8440n) && Intrinsics.areEqual(this.f8441p, eVar.f8441p) && this.f8442q == eVar.f8442q && Intrinsics.areEqual(this.f8443r, eVar.f8443r) && Float.compare(this.f8444s, eVar.f8444s) == 0 && Intrinsics.areEqual(this.f8445t, eVar.f8445t) && Intrinsics.areEqual(this.f8446v, eVar.f8446v) && Intrinsics.areEqual(this.f8447w, eVar.f8447w) && this.f8448x == eVar.f8448x && Intrinsics.areEqual(this.f8449y, eVar.f8449y) && Intrinsics.areEqual(this.f8450z, eVar.f8450z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int g10 = E1.a.g((Float.hashCode(this.f8431c) + E1.a.g(this.f8429a.hashCode() * 31, 31, this.f8430b)) * 31, 31, this.f8432d);
        String str = this.f8433e;
        int g11 = E1.a.g(E1.a.g((g10 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f8434f), 31, this.f8435g);
        boolean z2 = this.f8436h;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i10 = (g11 + i3) * 31;
        boolean z10 = this.j;
        int hashCode = (Float.hashCode(this.f8438l) + ((this.f8437k.hashCode() + ((i10 + (z10 ? 1 : z10 ? 1 : 0)) * 31)) * 31)) * 31;
        String str2 = this.f8439m;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8440n;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f8441p;
        int e10 = E1.a.e(this.f8442q, (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.f8443r;
        int hashCode4 = (Float.hashCode(this.f8444s) + ((e10 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.f8445t;
        int d8 = i2.u.d((this.f8448x.hashCode() + E1.a.g(E1.a.g((hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f8446v), 31, this.f8447w)) * 31, 31, this.f8449y);
        String str7 = this.f8450z;
        return d8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(7254));
        sb2.append(this.f8429a);
        sb2.append(StubApp.getString2(6092));
        sb2.append(this.f8430b);
        sb2.append(StubApp.getString2(7255));
        sb2.append(this.f8431c);
        sb2.append(StubApp.getString2(7256));
        sb2.append(this.f8432d);
        sb2.append(StubApp.getString2(7257));
        sb2.append(this.f8433e);
        sb2.append(StubApp.getString2(7258));
        sb2.append(this.f8434f);
        sb2.append(StubApp.getString2(7259));
        sb2.append(this.f8435g);
        sb2.append(StubApp.getString2(7260));
        sb2.append(this.f8436h);
        sb2.append(StubApp.getString2(7261));
        sb2.append(this.j);
        sb2.append(StubApp.getString2(7262));
        sb2.append(this.f8437k);
        sb2.append(StubApp.getString2(7263));
        sb2.append(this.f8438l);
        sb2.append(StubApp.getString2(7264));
        sb2.append(this.f8439m);
        sb2.append(StubApp.getString2(7265));
        sb2.append(this.f8440n);
        sb2.append(StubApp.getString2(7266));
        sb2.append(this.f8441p);
        sb2.append(StubApp.getString2(7267));
        sb2.append(this.f8442q);
        sb2.append(StubApp.getString2(7268));
        sb2.append(this.f8443r);
        sb2.append(StubApp.getString2(7269));
        sb2.append(this.f8444s);
        sb2.append(StubApp.getString2(7270));
        sb2.append(this.f8445t);
        sb2.append(StubApp.getString2(7271));
        sb2.append(this.f8446v);
        sb2.append(StubApp.getString2(7272));
        sb2.append(this.f8447w);
        sb2.append(StubApp.getString2(7273));
        sb2.append(this.f8448x);
        sb2.append(StubApp.getString2(7274));
        sb2.append(this.f8449y);
        sb2.append(StubApp.getString2(7275));
        return Xa.h.s(sb2, this.f8450z, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i3) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f8429a);
        List list = this.f8430b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeFloat(((Number) it.next()).floatValue());
        }
        out.writeFloat(this.f8431c);
        List list2 = this.f8432d;
        out.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            out.writeFloat(((Number) it2.next()).floatValue());
        }
        out.writeString(this.f8433e);
        List list3 = this.f8434f;
        out.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            out.writeFloat(((Number) it3.next()).floatValue());
        }
        List list4 = this.f8435g;
        out.writeInt(list4.size());
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            out.writeFloat(((Number) it4.next()).floatValue());
        }
        out.writeInt(this.f8436h ? 1 : 0);
        out.writeInt(this.j ? 1 : 0);
        out.writeString(this.f8437k.name());
        out.writeFloat(this.f8438l);
        out.writeString(this.f8439m);
        out.writeString(this.f8440n);
        out.writeString(this.f8441p);
        out.writeInt(this.f8442q);
        out.writeString(this.f8443r);
        out.writeFloat(this.f8444s);
        out.writeString(this.f8445t);
        out.writeStringList(this.f8446v);
        out.writeStringList(this.f8447w);
        out.writeString(this.f8448x.name());
        out.writeString(this.f8449y);
        out.writeString(this.f8450z);
    }
}
