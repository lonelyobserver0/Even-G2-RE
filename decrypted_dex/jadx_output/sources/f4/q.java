package f4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.stub.StubApp;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q extends T3.a {

    @JvmField
    public static final Parcelable.Creator<q> CREATOR = new com.google.android.material.datepicker.l(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f13765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13766b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13767c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13768d;

    /* renamed from: e, reason: collision with root package name */
    public final y f13769e;

    /* renamed from: f, reason: collision with root package name */
    public final q f13770f;

    static {
        Process.myUid();
        Process.myPid();
    }

    public q(int i3, String packageName, String str, String str2, ArrayList arrayList, q qVar) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (qVar != null && qVar.f13770f != null) {
            throw new IllegalArgumentException(StubApp.getString2(353));
        }
        this.f13765a = i3;
        this.f13766b = packageName;
        this.f13767c = str;
        this.f13768d = str2 == null ? qVar != null ? qVar.f13768d : null : str2;
        AbstractCollection abstractCollection = arrayList;
        if (arrayList == null) {
            AbstractCollection abstractCollection2 = qVar != null ? qVar.f13769e : null;
            abstractCollection = abstractCollection2;
            if (abstractCollection2 == null) {
                w wVar = y.f13793b;
                AbstractCollection abstractCollection3 = z.f13794e;
                Intrinsics.checkNotNullExpressionValue(abstractCollection3, "of(...)");
                abstractCollection = abstractCollection3;
            }
        }
        Intrinsics.checkNotNullParameter(abstractCollection, "<this>");
        w wVar2 = y.f13793b;
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (array[i10] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 9);
                sb2.append(StubApp.getString2(3544));
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
        z zVar = length == 0 ? z.f13794e : new z(array, length);
        Intrinsics.checkNotNullExpressionValue(zVar, "copyOf(...)");
        this.f13769e = zVar;
        this.f13770f = qVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f13765a == qVar.f13765a && Intrinsics.areEqual(this.f13766b, qVar.f13766b) && Intrinsics.areEqual(this.f13767c, qVar.f13767c) && Intrinsics.areEqual(this.f13768d, qVar.f13768d) && Intrinsics.areEqual(this.f13770f, qVar.f13770f) && Intrinsics.areEqual(this.f13769e, qVar.f13769e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13765a), this.f13766b, this.f13767c, this.f13768d, this.f13770f});
    }

    public final String toString() {
        String str = this.f13766b;
        int length = str.length() + 18;
        String str2 = this.f13767c;
        StringBuilder sb2 = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb2.append(this.f13765a);
        String string2 = StubApp.getString2(601);
        sb2.append(string2);
        sb2.append(str);
        if (str2 != null) {
            sb2.append(StubApp.getString2(1557));
            if (StringsKt.O(str2, str)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append(StubApp.getString2(511));
        }
        String str3 = this.f13768d;
        if (str3 != null) {
            sb2.append(string2);
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i3) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int I10 = a4.f.I(dest, 20293);
        a4.f.P(dest, 1, 4);
        dest.writeInt(this.f13765a);
        a4.f.F(dest, 3, this.f13766b);
        a4.f.F(dest, 4, this.f13767c);
        a4.f.F(dest, 6, this.f13768d);
        a4.f.E(dest, 7, this.f13770f, i3);
        a4.f.H(dest, 8, this.f13769e);
        a4.f.N(dest, I10);
    }
}
