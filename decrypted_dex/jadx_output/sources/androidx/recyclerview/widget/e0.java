package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class e0 {

    /* renamed from: s, reason: collision with root package name */
    public static final List f10139s = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f10140a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f10141b;
    public int j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f10156r;

    /* renamed from: c, reason: collision with root package name */
    public int f10142c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f10143d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f10144e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f10145f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f10146g = -1;

    /* renamed from: h, reason: collision with root package name */
    public e0 f10147h = null;

    /* renamed from: i, reason: collision with root package name */
    public e0 f10148i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f10149k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f10150l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f10151m = 0;

    /* renamed from: n, reason: collision with root package name */
    public V f10152n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10153o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f10154p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f10155q = -1;

    public e0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f10140a = view;
    }

    public final void a(int i3) {
        this.j = i3 | this.j;
    }

    public final int b() {
        int i3 = this.f10146g;
        return i3 == -1 ? this.f10142c : i3;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.f10149k) == null || arrayList.size() == 0) ? f10139s : this.f10150l;
    }

    public final boolean d() {
        View view = this.f10140a;
        return (view.getParent() == null || view.getParent() == this.f10156r) ? false : true;
    }

    public final boolean e() {
        return (this.j & 1) != 0;
    }

    public final boolean f() {
        return (this.j & 4) != 0;
    }

    public final boolean g() {
        if ((this.j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = N.I.f4732a;
        return !this.f10140a.hasTransientState();
    }

    public final boolean h() {
        return (this.j & 8) != 0;
    }

    public final boolean i() {
        return this.f10152n != null;
    }

    public final boolean j() {
        return (this.j & 256) != 0;
    }

    public final boolean k() {
        return (this.j & 2) != 0;
    }

    public final void l(int i3, boolean z2) {
        if (this.f10143d == -1) {
            this.f10143d = this.f10142c;
        }
        if (this.f10146g == -1) {
            this.f10146g = this.f10142c;
        }
        if (z2) {
            this.f10146g += i3;
        }
        this.f10142c += i3;
        View view = this.f10140a;
        if (view.getLayoutParams() != null) {
            ((N) view.getLayoutParams()).f10054c = true;
        }
    }

    public final void m() {
        this.j = 0;
        this.f10142c = -1;
        this.f10143d = -1;
        this.f10144e = -1L;
        this.f10146g = -1;
        this.f10151m = 0;
        this.f10147h = null;
        this.f10148i = null;
        ArrayList arrayList = this.f10149k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f10154p = 0;
        this.f10155q = -1;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }

    public final void n(boolean z2) {
        int i3 = this.f10151m;
        int i10 = z2 ? i3 - 1 : i3 + 1;
        this.f10151m = i10;
        if (i10 < 0) {
            this.f10151m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i10 == 1) {
            this.j |= 16;
        } else if (z2 && i10 == 0) {
            this.j &= -17;
        }
    }

    public final boolean o() {
        return (this.j & 128) != 0;
    }

    public final boolean p() {
        return (this.j & 32) != 0;
    }

    public final String toString() {
        StringBuilder n10 = AbstractC1482f.n(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        n10.append(Integer.toHexString(hashCode()));
        n10.append(" position=");
        n10.append(this.f10142c);
        n10.append(" id=");
        n10.append(this.f10144e);
        n10.append(", oldPos=");
        n10.append(this.f10143d);
        n10.append(", pLpos:");
        n10.append(this.f10146g);
        StringBuilder sb2 = new StringBuilder(n10.toString());
        if (i()) {
            sb2.append(" scrap ");
            sb2.append(this.f10153o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb2.append(" invalid");
        }
        if (!e()) {
            sb2.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb2.append(" update");
        }
        if (h()) {
            sb2.append(" removed");
        }
        if (o()) {
            sb2.append(" ignored");
        }
        if (j()) {
            sb2.append(" tmpDetached");
        }
        if (!g()) {
            sb2.append(" not recyclable(" + this.f10151m + ")");
        }
        if ((this.j & 512) != 0 || f()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f10140a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
