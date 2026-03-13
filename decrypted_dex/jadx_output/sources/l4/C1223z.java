package l4;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.cardview.widget.CardView;
import com.google.android.gms.internal.measurement.C0600c3;
import com.google.android.gms.internal.measurement.C0610e3;
import com.google.android.gms.internal.measurement.C0625h3;
import com.google.android.gms.internal.measurement.C0655n3;
import com.google.android.gms.internal.measurement.C0699w3;
import com.google.android.gms.internal.measurement.L3;
import com.google.android.gms.internal.measurement.P3;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.d4;
import com.stub.StubApp;
import g5.C0955a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.AbstractC1592c;
import s.C1590a;
import s.C1591b;

/* renamed from: l4.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1223z implements InterfaceC1217w, m.w, o1.g, Z9.m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16691b = new C1223z(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16692c = new C1223z(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16693d = new C1223z(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16694e = new C1223z(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16695f = new C1223z(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16696g = new C1223z(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16697h = new C1223z(6);
    public static final /* synthetic */ C1223z j = new C1223z(7);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16698k = new C1223z(8);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16699l = new C1223z(9);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16700m = new C1223z(10);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16701n = new C1223z(11);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16702p = new C1223z(12);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16703q = new C1223z(13);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16704r = new C1223z(14);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16705s = new C1223z(15);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16706t = new C1223z(16);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C1223z f16707v = new C1223z(17);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16708a;

    public /* synthetic */ C1223z(int i3) {
        this.f16708a = i3;
    }

    public static byte[] f(long j3, M4.I i3) {
        C0955a c0955a = new C0955a(16);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i3.size());
        Iterator<E> it = i3.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) c0955a.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(StubApp.getString2(2376), arrayList);
        bundle.putLong(StubApp.getString2(1315), j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // l4.InterfaceC1217w
    public Object a() {
        switch (this.f16708a) {
            case 0:
                List list = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11515d.b()).longValue());
            case 1:
                List list2 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11526j0.b()).longValue());
            case 2:
                List list3 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return (String) C0610e3.f11514c0.b();
            case 3:
                List list4 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l9 = (Long) C0610e3.j.b();
                l9.getClass();
                return l9;
            case 4:
                List list5 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return (String) C0610e3.f11527k.b();
            case 5:
                List list6 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l10 = (Long) C0610e3.f11508Z.b();
                l10.getClass();
                return l10;
            case 6:
                List list7 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11551w.b()).longValue());
            case 7:
                List list8 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Boolean bool = (Boolean) C0610e3.f11485C.b();
                bool.getClass();
                return bool;
            case 8:
                List list9 = AbstractC1148D.f15973a;
                Boolean bool2 = (Boolean) C0699w3.f11763a.b();
                bool2.getClass();
                return bool2;
            case 9:
                List list10 = AbstractC1148D.f15973a;
                Boolean bool3 = (Boolean) L3.f11308a.b();
                bool3.getClass();
                return bool3;
            case 10:
                List list11 = AbstractC1148D.f15973a;
                return Integer.valueOf((int) ((Long) C0625h3.f11581a.b()).longValue());
            case 11:
                List list12 = AbstractC1148D.f15973a;
                Boolean bool4 = (Boolean) a4.f11445a.b();
                bool4.getClass();
                return bool4;
            case 12:
                List list13 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11532m0.b()).longValue());
            case 13:
                List list14 = AbstractC1148D.f15973a;
                P3.f11347b.get();
                Boolean bool5 = (Boolean) R3.f11359g.b();
                bool5.getClass();
                return bool5;
            case 14:
                List list15 = AbstractC1148D.f15973a;
                Boolean bool6 = (Boolean) C0655n3.f11629b.b();
                bool6.getClass();
                return bool6;
            case 15:
                List list16 = AbstractC1148D.f15973a;
                P3.f11347b.get();
                Boolean bool7 = (Boolean) R3.f11356d.b();
                bool7.getClass();
                return bool7;
            case 16:
                List list17 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l11 = (Long) C0610e3.f11509a.b();
                l11.getClass();
                return l11;
            default:
                return new Boolean(((Boolean) d4.f11476a.b()).booleanValue());
        }
    }

    @Override // m.w
    public void b(m.l lVar, boolean z2) {
    }

    @Override // o1.g
    public long c(T0.l lVar) {
        return -1L;
    }

    @Override // o1.g
    public T0.B d() {
        return new T0.t(-9223372036854775807L);
    }

    @Override // o1.g
    public void e(long j3) {
    }

    public void g(C1590a c1590a, float f10) {
        C1591b c1591b = (C1591b) ((Drawable) c1590a.f20574a);
        CardView cardView = (CardView) c1590a.f20575b;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f10 != c1591b.f20580e || c1591b.f20581f != useCompatPadding || c1591b.f20582g != preventCornerOverlap) {
            c1591b.f20580e = f10;
            c1591b.f20581f = useCompatPadding;
            c1591b.f20582g = preventCornerOverlap;
            c1591b.b(null);
            c1591b.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c1590a.r(0, 0, 0, 0);
            return;
        }
        C1591b c1591b2 = (C1591b) ((Drawable) c1590a.f20574a);
        float f11 = c1591b2.f20580e;
        float f12 = c1591b2.f20576a;
        int ceil = (int) Math.ceil(AbstractC1592c.a(f11, f12, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(AbstractC1592c.b(f11, f12, cardView.getPreventCornerOverlap()));
        c1590a.r(ceil, ceil2, ceil, ceil2);
    }

    @Override // m.w
    public boolean m(m.l lVar) {
        return false;
    }
}
