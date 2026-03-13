package d0;

import C.C0028e;
import Z9.C0366a;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0439n;
import cb.C0585c;
import com.stub.StubApp;
import d.InterfaceC0760b;
import e0.AbstractC0831d;
import f.C0866f;
import i.AbstractActivityC1027h;
import i0.C1028a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import l4.E0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class M {

    /* renamed from: C, reason: collision with root package name */
    public C0866f f13144C;

    /* renamed from: D, reason: collision with root package name */
    public C0866f f13145D;

    /* renamed from: E, reason: collision with root package name */
    public C0866f f13146E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f13148G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f13149H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f13150I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f13151J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f13152K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f13153L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f13154M;

    /* renamed from: N, reason: collision with root package name */
    public ArrayList f13155N;

    /* renamed from: O, reason: collision with root package name */
    public P f13156O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13159b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f13162e;

    /* renamed from: g, reason: collision with root package name */
    public d.z f13164g;

    /* renamed from: q, reason: collision with root package name */
    public final C0764B f13173q;

    /* renamed from: r, reason: collision with root package name */
    public final C0764B f13174r;

    /* renamed from: s, reason: collision with root package name */
    public final C0764B f13175s;

    /* renamed from: t, reason: collision with root package name */
    public final C0764B f13176t;

    /* renamed from: w, reason: collision with root package name */
    public C0791v f13179w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC0793x f13180x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractComponentCallbacksC0789t f13181y;

    /* renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0789t f13182z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13158a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final D5.B f13160c = new D5.B(8);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f13161d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C0763A f13163f = new LayoutInflaterFactory2C0763A(this);

    /* renamed from: h, reason: collision with root package name */
    public C0771a f13165h = null;

    /* renamed from: i, reason: collision with root package name */
    public final C0766D f13166i = new C0766D(this);
    public final AtomicInteger j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    public final Map f13167k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map f13168l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f13169m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f13170n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final V6.b f13171o = new V6.b(this);

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f13172p = new CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final C0767E f13177u = new C0767E(this);

    /* renamed from: v, reason: collision with root package name */
    public int f13178v = -1;

    /* renamed from: A, reason: collision with root package name */
    public final C0768F f13142A = new C0768F(this);

    /* renamed from: B, reason: collision with root package name */
    public final C0585c f13143B = new C0585c(1);

    /* renamed from: F, reason: collision with root package name */
    public ArrayDeque f13147F = new ArrayDeque();

    /* renamed from: P, reason: collision with root package name */
    public final L9.n f13157P = new L9.n(this, 29);

    /* JADX WARN: Type inference failed for: r0v16, types: [d0.B] */
    /* JADX WARN: Type inference failed for: r0v17, types: [d0.B] */
    /* JADX WARN: Type inference failed for: r0v18, types: [d0.B] */
    /* JADX WARN: Type inference failed for: r0v19, types: [d0.B] */
    public M() {
        final int i3 = 0;
        this.f13173q = new M.a(this) { // from class: d0.B

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ M f13125b;

            {
                this.f13125b = this;
            }

            @Override // M.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        M m4 = this.f13125b;
                        if (m4.L()) {
                            m4.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        M m10 = this.f13125b;
                        if (m10.L() && num.intValue() == 80) {
                            m10.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0028e c0028e = (C0028e) obj;
                        M m11 = this.f13125b;
                        if (m11.L()) {
                            boolean z2 = c0028e.f824a;
                            m11.n(false);
                            break;
                        }
                        break;
                    default:
                        C.L l9 = (C.L) obj;
                        M m12 = this.f13125b;
                        if (m12.L()) {
                            boolean z10 = l9.f817a;
                            m12.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f13174r = new M.a(this) { // from class: d0.B

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ M f13125b;

            {
                this.f13125b = this;
            }

            @Override // M.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        M m4 = this.f13125b;
                        if (m4.L()) {
                            m4.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        M m10 = this.f13125b;
                        if (m10.L() && num.intValue() == 80) {
                            m10.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0028e c0028e = (C0028e) obj;
                        M m11 = this.f13125b;
                        if (m11.L()) {
                            boolean z2 = c0028e.f824a;
                            m11.n(false);
                            break;
                        }
                        break;
                    default:
                        C.L l9 = (C.L) obj;
                        M m12 = this.f13125b;
                        if (m12.L()) {
                            boolean z10 = l9.f817a;
                            m12.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f13175s = new M.a(this) { // from class: d0.B

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ M f13125b;

            {
                this.f13125b = this;
            }

            @Override // M.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        M m4 = this.f13125b;
                        if (m4.L()) {
                            m4.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        M m10 = this.f13125b;
                        if (m10.L() && num.intValue() == 80) {
                            m10.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0028e c0028e = (C0028e) obj;
                        M m11 = this.f13125b;
                        if (m11.L()) {
                            boolean z2 = c0028e.f824a;
                            m11.n(false);
                            break;
                        }
                        break;
                    default:
                        C.L l9 = (C.L) obj;
                        M m12 = this.f13125b;
                        if (m12.L()) {
                            boolean z10 = l9.f817a;
                            m12.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f13176t = new M.a(this) { // from class: d0.B

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ M f13125b;

            {
                this.f13125b = this;
            }

            @Override // M.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        M m4 = this.f13125b;
                        if (m4.L()) {
                            m4.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        M m10 = this.f13125b;
                        if (m10.L() && num.intValue() == 80) {
                            m10.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0028e c0028e = (C0028e) obj;
                        M m11 = this.f13125b;
                        if (m11.L()) {
                            boolean z2 = c0028e.f824a;
                            m11.n(false);
                            break;
                        }
                        break;
                    default:
                        C.L l9 = (C.L) obj;
                        M m12 = this.f13125b;
                        if (m12.L()) {
                            boolean z10 = l9.f817a;
                            m12.s(false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static HashSet E(C0771a c0771a) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < c0771a.f13240a.size(); i3++) {
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((V) c0771a.f13240a.get(i3)).f13220b;
            if (abstractComponentCallbacksC0789t != null && c0771a.f13246g) {
                hashSet.add(abstractComponentCallbacksC0789t);
            }
        }
        return hashSet;
    }

    public static boolean J(int i3) {
        return Log.isLoggable(StubApp.getString2(49), i3);
    }

    public static boolean K(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        abstractComponentCallbacksC0789t.getClass();
        Iterator it = abstractComponentCallbacksC0789t.f13386x.f13160c.B().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = (AbstractComponentCallbacksC0789t) it.next();
            if (abstractComponentCallbacksC0789t2 != null) {
                z2 = K(abstractComponentCallbacksC0789t2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        if (abstractComponentCallbacksC0789t == null) {
            return true;
        }
        if (abstractComponentCallbacksC0789t.f13351F) {
            return abstractComponentCallbacksC0789t.f13384v == null || M(abstractComponentCallbacksC0789t.f13387y);
        }
        return false;
    }

    public static boolean N(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        if (abstractComponentCallbacksC0789t == null) {
            return true;
        }
        M m4 = abstractComponentCallbacksC0789t.f13384v;
        return abstractComponentCallbacksC0789t.equals(m4.f13182z) && N(m4.f13181y);
    }

    public static void c0(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        if (J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16476) + abstractComponentCallbacksC0789t);
        }
        if (abstractComponentCallbacksC0789t.f13348C) {
            abstractComponentCallbacksC0789t.f13348C = false;
            abstractComponentCallbacksC0789t.f13358P = !abstractComponentCallbacksC0789t.f13358P;
        }
    }

    public final void A(ArrayList arrayList, ArrayList arrayList2, int i3, int i10) {
        Object obj;
        c0 c0Var;
        int i11;
        boolean z2;
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int i17 = i3;
        int i18 = 1;
        boolean z12 = ((C0771a) arrayList.get(i17)).f13253o;
        ArrayList arrayList3 = this.f13155N;
        if (arrayList3 == null) {
            this.f13155N = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f13155N;
        D5.B b2 = this.f13160c;
        arrayList4.addAll(b2.C());
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13182z;
        int i19 = i17;
        boolean z13 = false;
        while (i19 < i10) {
            C0771a c0771a = (C0771a) arrayList.get(i19);
            if (((Boolean) arrayList2.get(i19)).booleanValue()) {
                z2 = z12;
                i12 = i19;
                z10 = z13;
                int i20 = i18;
                ArrayList arrayList5 = this.f13155N;
                ArrayList arrayList6 = c0771a.f13240a;
                int size = arrayList6.size() - i20;
                while (size >= 0) {
                    V v2 = (V) arrayList6.get(size);
                    int i21 = v2.f13219a;
                    if (i21 != i20) {
                        if (i21 != 3) {
                            switch (i21) {
                                case 8:
                                    abstractComponentCallbacksC0789t = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0789t = v2.f13220b;
                                    break;
                                case 10:
                                    v2.f13227i = v2.f13226h;
                                    break;
                            }
                            size--;
                            i20 = 1;
                        }
                        arrayList5.add(v2.f13220b);
                        size--;
                        i20 = 1;
                    }
                    arrayList5.remove(v2.f13220b);
                    size--;
                    i20 = 1;
                }
            } else {
                ArrayList arrayList7 = this.f13155N;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList8 = c0771a.f13240a;
                    if (i22 < arrayList8.size()) {
                        V v8 = (V) arrayList8.get(i22);
                        boolean z14 = z12;
                        int i23 = v8.f13219a;
                        if (i23 != i18) {
                            i14 = i19;
                            if (i23 == 2) {
                                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = v8.f13220b;
                                int i24 = abstractComponentCallbacksC0789t2.f13346A;
                                int size2 = arrayList7.size() - 1;
                                boolean z15 = false;
                                while (size2 >= 0) {
                                    int i25 = size2;
                                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t3 = (AbstractComponentCallbacksC0789t) arrayList7.get(size2);
                                    boolean z16 = z13;
                                    if (abstractComponentCallbacksC0789t3.f13346A != i24) {
                                        i15 = i24;
                                    } else if (abstractComponentCallbacksC0789t3 == abstractComponentCallbacksC0789t2) {
                                        i15 = i24;
                                        z15 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0789t3 == abstractComponentCallbacksC0789t) {
                                            i15 = i24;
                                            i16 = 0;
                                            arrayList8.add(i22, new V(abstractComponentCallbacksC0789t3, 9, 0));
                                            i22++;
                                            abstractComponentCallbacksC0789t = null;
                                        } else {
                                            i15 = i24;
                                            i16 = 0;
                                        }
                                        V v10 = new V(abstractComponentCallbacksC0789t3, 3, i16);
                                        v10.f13222d = v8.f13222d;
                                        v10.f13224f = v8.f13224f;
                                        v10.f13223e = v8.f13223e;
                                        v10.f13225g = v8.f13225g;
                                        arrayList8.add(i22, v10);
                                        arrayList7.remove(abstractComponentCallbacksC0789t3);
                                        i22++;
                                        abstractComponentCallbacksC0789t = abstractComponentCallbacksC0789t;
                                    }
                                    size2 = i25 - 1;
                                    i24 = i15;
                                    z13 = z16;
                                }
                                z11 = z13;
                                i13 = 1;
                                if (z15) {
                                    arrayList8.remove(i22);
                                    i22--;
                                } else {
                                    v8.f13219a = 1;
                                    v8.f13221c = true;
                                    arrayList7.add(abstractComponentCallbacksC0789t2);
                                }
                            } else if (i23 == 3 || i23 == 6) {
                                arrayList7.remove(v8.f13220b);
                                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t4 = v8.f13220b;
                                if (abstractComponentCallbacksC0789t4 == abstractComponentCallbacksC0789t) {
                                    arrayList8.add(i22, new V(9, abstractComponentCallbacksC0789t4));
                                    i22++;
                                    z11 = z13;
                                    i13 = 1;
                                    abstractComponentCallbacksC0789t = null;
                                } else {
                                    z11 = z13;
                                    i13 = 1;
                                }
                            } else if (i23 != 7) {
                                if (i23 == 8) {
                                    arrayList8.add(i22, new V(abstractComponentCallbacksC0789t, 9, 0));
                                    v8.f13221c = true;
                                    i22++;
                                    abstractComponentCallbacksC0789t = v8.f13220b;
                                }
                                z11 = z13;
                                i13 = 1;
                            } else {
                                i13 = 1;
                            }
                            i22 += i13;
                            i18 = i13;
                            z12 = z14;
                            i19 = i14;
                            z13 = z11;
                        } else {
                            i13 = i18;
                            i14 = i19;
                        }
                        z11 = z13;
                        arrayList7.add(v8.f13220b);
                        i22 += i13;
                        i18 = i13;
                        z12 = z14;
                        i19 = i14;
                        z13 = z11;
                    } else {
                        z2 = z12;
                        i12 = i19;
                        z10 = z13;
                    }
                }
            }
            z13 = z10 || c0771a.f13246g;
            i19 = i12 + 1;
            i18 = 1;
            z12 = z2;
        }
        int i26 = i18;
        boolean z17 = z12;
        boolean z18 = z13;
        int i27 = -1;
        this.f13155N.clear();
        if (!z17 && this.f13178v >= i26) {
            for (int i28 = i17; i28 < i10; i28++) {
                Iterator it = ((C0771a) arrayList.get(i28)).f13240a.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t5 = ((V) it.next()).f13220b;
                    if (abstractComponentCallbacksC0789t5 != null && abstractComponentCallbacksC0789t5.f13384v != null) {
                        b2.I(g(abstractComponentCallbacksC0789t5));
                    }
                }
            }
        }
        int i29 = i17;
        while (i29 < i10) {
            C0771a c0771a2 = (C0771a) arrayList.get(i29);
            boolean booleanValue = ((Boolean) arrayList2.get(i29)).booleanValue();
            String string2 = StubApp.getString2(16477);
            if (booleanValue) {
                c0771a2.c(i27);
                ArrayList arrayList9 = c0771a2.f13240a;
                boolean z19 = true;
                for (int size3 = arrayList9.size() - 1; size3 >= 0; size3--) {
                    V v11 = (V) arrayList9.get(size3);
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t6 = v11.f13220b;
                    if (abstractComponentCallbacksC0789t6 != null) {
                        if (abstractComponentCallbacksC0789t6.f13357O != null) {
                            abstractComponentCallbacksC0789t6.k().f13335a = z19;
                        }
                        int i30 = c0771a2.f13245f;
                        int i31 = 8194;
                        int i32 = DfuBaseService.ERROR_FILE_NOT_FOUND;
                        if (i30 != 4097) {
                            if (i30 != 8194) {
                                i31 = DfuBaseService.ERROR_FILE_IO_EXCEPTION;
                                i32 = 8197;
                                if (i30 != 8197) {
                                    if (i30 == 4099) {
                                        i31 = 4099;
                                    } else if (i30 != 4100) {
                                        i31 = 0;
                                    }
                                }
                            }
                            i31 = i32;
                        }
                        if (abstractComponentCallbacksC0789t6.f13357O != null || i31 != 0) {
                            abstractComponentCallbacksC0789t6.k();
                            abstractComponentCallbacksC0789t6.f13357O.f13340f = i31;
                        }
                        abstractComponentCallbacksC0789t6.k();
                        abstractComponentCallbacksC0789t6.f13357O.getClass();
                    }
                    int i33 = v11.f13219a;
                    M m4 = c0771a2.f13254p;
                    switch (i33) {
                        case 1:
                            abstractComponentCallbacksC0789t6.K(v11.f13222d, v11.f13223e, v11.f13224f, v11.f13225g);
                            z19 = true;
                            m4.Y(abstractComponentCallbacksC0789t6, true);
                            m4.T(abstractComponentCallbacksC0789t6);
                        case 2:
                        default:
                            throw new IllegalArgumentException(string2 + v11.f13219a);
                        case 3:
                            abstractComponentCallbacksC0789t6.K(v11.f13222d, v11.f13223e, v11.f13224f, v11.f13225g);
                            m4.a(abstractComponentCallbacksC0789t6);
                            z19 = true;
                        case 4:
                            abstractComponentCallbacksC0789t6.K(v11.f13222d, v11.f13223e, v11.f13224f, v11.f13225g);
                            m4.getClass();
                            c0(abstractComponentCallbacksC0789t6);
                            z19 = true;
                        case 5:
                            abstractComponentCallbacksC0789t6.K(v11.f13222d, v11.f13223e, v11.f13224f, v11.f13225g);
                            m4.Y(abstractComponentCallbacksC0789t6, true);
                            m4.I(abstractComponentCallbacksC0789t6);
                            z19 = true;
                        case 6:
                            abstractComponentCallbacksC0789t6.K(v11.f13222d, v11.f13223e, v11.f13224f, v11.f13225g);
                            m4.c(abstractComponentCallbacksC0789t6);
                            z19 = true;
                        case 7:
                            abstractComponentCallbacksC0789t6.K(v11.f13222d, v11.f13223e, v11.f13224f, v11.f13225g);
                            m4.Y(abstractComponentCallbacksC0789t6, true);
                            m4.h(abstractComponentCallbacksC0789t6);
                            z19 = true;
                        case 8:
                            m4.a0(null);
                            z19 = true;
                        case 9:
                            m4.a0(abstractComponentCallbacksC0789t6);
                            z19 = true;
                        case 10:
                            m4.Z(abstractComponentCallbacksC0789t6, v11.f13226h);
                            z19 = true;
                    }
                }
            } else {
                c0771a2.c(1);
                ArrayList arrayList10 = c0771a2.f13240a;
                int size4 = arrayList10.size();
                int i34 = 0;
                while (i34 < size4) {
                    V v12 = (V) arrayList10.get(i34);
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t7 = v12.f13220b;
                    if (abstractComponentCallbacksC0789t7 != null) {
                        if (abstractComponentCallbacksC0789t7.f13357O != null) {
                            abstractComponentCallbacksC0789t7.k().f13335a = false;
                        }
                        int i35 = c0771a2.f13245f;
                        if (abstractComponentCallbacksC0789t7.f13357O != null || i35 != 0) {
                            abstractComponentCallbacksC0789t7.k();
                            abstractComponentCallbacksC0789t7.f13357O.f13340f = i35;
                        }
                        abstractComponentCallbacksC0789t7.k();
                        abstractComponentCallbacksC0789t7.f13357O.getClass();
                    }
                    int i36 = v12.f13219a;
                    M m10 = c0771a2.f13254p;
                    switch (i36) {
                        case 1:
                            i11 = i29;
                            abstractComponentCallbacksC0789t7.K(v12.f13222d, v12.f13223e, v12.f13224f, v12.f13225g);
                            m10.Y(abstractComponentCallbacksC0789t7, false);
                            m10.a(abstractComponentCallbacksC0789t7);
                            i34++;
                            i29 = i11;
                        case 2:
                        default:
                            throw new IllegalArgumentException(string2 + v12.f13219a);
                        case 3:
                            i11 = i29;
                            abstractComponentCallbacksC0789t7.K(v12.f13222d, v12.f13223e, v12.f13224f, v12.f13225g);
                            m10.T(abstractComponentCallbacksC0789t7);
                            i34++;
                            i29 = i11;
                        case 4:
                            i11 = i29;
                            abstractComponentCallbacksC0789t7.K(v12.f13222d, v12.f13223e, v12.f13224f, v12.f13225g);
                            m10.I(abstractComponentCallbacksC0789t7);
                            i34++;
                            i29 = i11;
                        case 5:
                            i11 = i29;
                            abstractComponentCallbacksC0789t7.K(v12.f13222d, v12.f13223e, v12.f13224f, v12.f13225g);
                            m10.Y(abstractComponentCallbacksC0789t7, false);
                            c0(abstractComponentCallbacksC0789t7);
                            i34++;
                            i29 = i11;
                        case 6:
                            i11 = i29;
                            abstractComponentCallbacksC0789t7.K(v12.f13222d, v12.f13223e, v12.f13224f, v12.f13225g);
                            m10.h(abstractComponentCallbacksC0789t7);
                            i34++;
                            i29 = i11;
                        case 7:
                            i11 = i29;
                            abstractComponentCallbacksC0789t7.K(v12.f13222d, v12.f13223e, v12.f13224f, v12.f13225g);
                            m10.Y(abstractComponentCallbacksC0789t7, false);
                            m10.c(abstractComponentCallbacksC0789t7);
                            i34++;
                            i29 = i11;
                        case 8:
                            m10.a0(abstractComponentCallbacksC0789t7);
                            i11 = i29;
                            i34++;
                            i29 = i11;
                        case 9:
                            m10.a0(null);
                            i11 = i29;
                            i34++;
                            i29 = i11;
                        case 10:
                            m10.Z(abstractComponentCallbacksC0789t7, v12.f13227i);
                            i11 = i29;
                            i34++;
                            i29 = i11;
                    }
                }
            }
            i29++;
            i27 = -1;
        }
        boolean booleanValue2 = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
        ArrayList arrayList11 = this.f13170n;
        if (z18 && !arrayList11.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(E((C0771a) it2.next()));
            }
            if (this.f13165h == null) {
                Iterator it3 = arrayList11.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        throw new ClassCastException();
                    }
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = arrayList11.iterator();
                while (it5.hasNext()) {
                    if (it5.next() != null) {
                        throw new ClassCastException();
                    }
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i37 = i17; i37 < i10; i37++) {
            C0771a c0771a3 = (C0771a) arrayList.get(i37);
            if (booleanValue2) {
                for (int size5 = c0771a3.f13240a.size() - 1; size5 >= 0; size5--) {
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t8 = ((V) c0771a3.f13240a.get(size5)).f13220b;
                    if (abstractComponentCallbacksC0789t8 != null) {
                        g(abstractComponentCallbacksC0789t8).k();
                    }
                }
            } else {
                Iterator it7 = c0771a3.f13240a.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t9 = ((V) it7.next()).f13220b;
                    if (abstractComponentCallbacksC0789t9 != null) {
                        g(abstractComponentCallbacksC0789t9).k();
                    }
                }
            }
        }
        O(this.f13178v, true);
        Iterator it8 = f(arrayList, i17, i10).iterator();
        while (it8.hasNext()) {
            e0 e0Var = (e0) it8.next();
            e0Var.f13301d = booleanValue2;
            synchronized (e0Var.f13299b) {
                try {
                    e0Var.o();
                    ArrayList arrayList12 = e0Var.f13299b;
                    ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object previous = listIterator.previous();
                            a0 a0Var = (a0) previous;
                            View view = a0Var.f13259c.f13354I;
                            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                            Intrinsics.checkNotNullParameter(view, "<this>");
                            if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                                c0Var = c0.f13290d;
                            } else {
                                int visibility = view.getVisibility();
                                if (visibility == 0) {
                                    c0Var = c0.f13288b;
                                } else if (visibility == 4) {
                                    c0Var = c0.f13290d;
                                } else {
                                    if (visibility != 8) {
                                        throw new IllegalArgumentException(StubApp.getString2("16478") + visibility);
                                    }
                                    c0Var = c0.f13289c;
                                }
                            }
                            c0 c0Var2 = a0Var.f13257a;
                            c0 c0Var3 = c0.f13288b;
                            if (c0Var2 == c0Var3 && c0Var != c0Var3) {
                                obj = previous;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    e0Var.f13302e = false;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            e0Var.i();
        }
        while (i17 < i10) {
            C0771a c0771a4 = (C0771a) arrayList.get(i17);
            if (((Boolean) arrayList2.get(i17)).booleanValue() && c0771a4.f13256r >= 0) {
                c0771a4.f13256r = -1;
            }
            c0771a4.getClass();
            i17++;
        }
        if (!z18 || arrayList11.size() <= 0) {
            return;
        }
        arrayList11.get(0).getClass();
        throw new ClassCastException();
    }

    public final AbstractComponentCallbacksC0789t B(int i3) {
        D5.B b2 = this.f13160c;
        ArrayList arrayList = (ArrayList) b2.f1340a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = (AbstractComponentCallbacksC0789t) arrayList.get(size);
            if (abstractComponentCallbacksC0789t != null && abstractComponentCallbacksC0789t.f13388z == i3) {
                return abstractComponentCallbacksC0789t;
            }
        }
        for (U u2 : ((HashMap) b2.f1341b).values()) {
            if (u2 != null) {
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = u2.f13216c;
                if (abstractComponentCallbacksC0789t2.f13388z == i3) {
                    return abstractComponentCallbacksC0789t2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC0789t C(String str) {
        D5.B b2 = this.f13160c;
        ArrayList arrayList = (ArrayList) b2.f1340a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = (AbstractComponentCallbacksC0789t) arrayList.get(size);
            if (abstractComponentCallbacksC0789t != null && str.equals(abstractComponentCallbacksC0789t.f13347B)) {
                return abstractComponentCallbacksC0789t;
            }
        }
        for (U u2 : ((HashMap) b2.f1341b).values()) {
            if (u2 != null) {
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = u2.f13216c;
                if (str.equals(abstractComponentCallbacksC0789t2.f13347B)) {
                    return abstractComponentCallbacksC0789t2;
                }
            }
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (e0Var.f13302e) {
                if (J(2)) {
                    Log.v(StubApp.getString2(49), StubApp.getString2(16479));
                }
                e0Var.f13302e = false;
                e0Var.i();
            }
        }
    }

    public final ViewGroup F(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        ViewGroup viewGroup = abstractComponentCallbacksC0789t.f13353H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0789t.f13346A <= 0 || !this.f13180x.h()) {
            return null;
        }
        View g10 = this.f13180x.g(abstractComponentCallbacksC0789t.f13346A);
        if (g10 instanceof ViewGroup) {
            return (ViewGroup) g10;
        }
        return null;
    }

    public final C0768F G() {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13181y;
        return abstractComponentCallbacksC0789t != null ? abstractComponentCallbacksC0789t.f13384v.G() : this.f13142A;
    }

    public final C0585c H() {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13181y;
        return abstractComponentCallbacksC0789t != null ? abstractComponentCallbacksC0789t.f13384v.H() : this.f13143B;
    }

    public final void I(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        if (J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16480) + abstractComponentCallbacksC0789t);
        }
        if (abstractComponentCallbacksC0789t.f13348C) {
            return;
        }
        abstractComponentCallbacksC0789t.f13348C = true;
        abstractComponentCallbacksC0789t.f13358P = true ^ abstractComponentCallbacksC0789t.f13358P;
        b0(abstractComponentCallbacksC0789t);
    }

    public final boolean L() {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13181y;
        if (abstractComponentCallbacksC0789t == null) {
            return true;
        }
        return abstractComponentCallbacksC0789t.f13385w != null && abstractComponentCallbacksC0789t.f13374l && abstractComponentCallbacksC0789t.o().L();
    }

    public final void O(int i3, boolean z2) {
        HashMap hashMap;
        C0791v c0791v;
        if (this.f13179w == null && i3 != -1) {
            throw new IllegalStateException(StubApp.getString2(16481));
        }
        if (z2 || i3 != this.f13178v) {
            this.f13178v = i3;
            D5.B b2 = this.f13160c;
            Iterator it = ((ArrayList) b2.f1340a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) b2.f1341b;
                if (!hasNext) {
                    break;
                }
                U u2 = (U) hashMap.get(((AbstractComponentCallbacksC0789t) it.next()).f13368e);
                if (u2 != null) {
                    u2.k();
                }
            }
            for (U u10 : hashMap.values()) {
                if (u10 != null) {
                    u10.k();
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = u10.f13216c;
                    if (abstractComponentCallbacksC0789t.f13376m && !abstractComponentCallbacksC0789t.s()) {
                        b2.J(u10);
                    }
                }
            }
            d0();
            if (this.f13148G && (c0791v = this.f13179w) != null && this.f13178v == 7) {
                c0791v.f13395e.invalidateOptionsMenu();
                this.f13148G = false;
            }
        }
    }

    public final void P() {
        if (this.f13179w == null) {
            return;
        }
        this.f13149H = false;
        this.f13150I = false;
        this.f13156O.f13198g = false;
        for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : this.f13160c.C()) {
            if (abstractComponentCallbacksC0789t != null) {
                abstractComponentCallbacksC0789t.f13386x.P();
            }
        }
    }

    public final boolean Q() {
        return R(-1, 0);
    }

    public final boolean R(int i3, int i10) {
        z(false);
        y(true);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13182z;
        if (abstractComponentCallbacksC0789t != null && i3 < 0 && abstractComponentCallbacksC0789t.l().Q()) {
            return true;
        }
        boolean S5 = S(this.f13153L, this.f13154M, i3, i10);
        if (S5) {
            this.f13159b = true;
            try {
                U(this.f13153L, this.f13154M);
            } finally {
                d();
            }
        }
        f0();
        if (this.f13152K) {
            this.f13152K = false;
            d0();
        }
        ((HashMap) this.f13160c.f1341b).values().removeAll(Collections.singleton(null));
        return S5;
    }

    public final boolean S(ArrayList arrayList, ArrayList arrayList2, int i3, int i10) {
        boolean z2 = (i10 & 1) != 0;
        int i11 = -1;
        if (!this.f13161d.isEmpty()) {
            if (i3 < 0) {
                i11 = z2 ? 0 : this.f13161d.size() - 1;
            } else {
                int size = this.f13161d.size() - 1;
                while (size >= 0) {
                    C0771a c0771a = (C0771a) this.f13161d.get(size);
                    if (i3 >= 0 && i3 == c0771a.f13256r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i11 = size;
                } else if (z2) {
                    i11 = size;
                    while (i11 > 0) {
                        C0771a c0771a2 = (C0771a) this.f13161d.get(i11 - 1);
                        if (i3 < 0 || i3 != c0771a2.f13256r) {
                            break;
                        }
                        i11--;
                    }
                } else if (size != this.f13161d.size() - 1) {
                    i11 = size + 1;
                }
            }
        }
        if (i11 < 0) {
            return false;
        }
        for (int size2 = this.f13161d.size() - 1; size2 >= i11; size2--) {
            arrayList.add((C0771a) this.f13161d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        if (J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16482) + abstractComponentCallbacksC0789t + StubApp.getString2(16483) + abstractComponentCallbacksC0789t.f13383t);
        }
        boolean s10 = abstractComponentCallbacksC0789t.s();
        if (abstractComponentCallbacksC0789t.f13349D && s10) {
            return;
        }
        D5.B b2 = this.f13160c;
        synchronized (((ArrayList) b2.f1340a)) {
            ((ArrayList) b2.f1340a).remove(abstractComponentCallbacksC0789t);
        }
        abstractComponentCallbacksC0789t.f13374l = false;
        if (K(abstractComponentCallbacksC0789t)) {
            this.f13148G = true;
        }
        abstractComponentCallbacksC0789t.f13376m = true;
        b0(abstractComponentCallbacksC0789t);
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException(StubApp.getString2(16484));
        }
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i3 < size) {
            if (!((C0771a) arrayList.get(i3)).f13253o) {
                if (i10 != i3) {
                    A(arrayList, arrayList2, i10, i3);
                }
                i10 = i3 + 1;
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((C0771a) arrayList.get(i10)).f13253o) {
                        i10++;
                    }
                }
                A(arrayList, arrayList2, i3, i10);
                i3 = i10 - 1;
            }
            i3++;
        }
        if (i10 != size) {
            A(arrayList, arrayList2, i10, size);
        }
    }

    public final void V(Bundle bundle) {
        int i3;
        V6.b bVar;
        String string2;
        String string22;
        int i10;
        U u2;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith(StubApp.getString2(10066)) && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f13179w.f13392b.getClassLoader());
                this.f13168l.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith(StubApp.getString2(16485)) && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f13179w.f13392b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        D5.B b2 = this.f13160c;
        HashMap hashMap2 = (HashMap) b2.f1342c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        String string23 = StubApp.getString2(291);
        N n10 = (N) bundle.getParcelable(string23);
        if (n10 == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) b2.f1341b;
        hashMap3.clear();
        Iterator it = n10.f13183a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i3 = 2;
            bVar = this.f13171o;
            string2 = StubApp.getString2(3055);
            string22 = StubApp.getString2(49);
            if (!hasNext) {
                break;
            }
            Bundle L10 = b2.L((String) it.next(), null);
            if (L10 != null) {
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = (AbstractComponentCallbacksC0789t) this.f13156O.f13193b.get(((S) L10.getParcelable(string23)).f13200b);
                if (abstractComponentCallbacksC0789t != null) {
                    if (J(2)) {
                        Log.v(string22, StubApp.getString2(16486) + abstractComponentCallbacksC0789t);
                    }
                    u2 = new U(bVar, b2, abstractComponentCallbacksC0789t, L10);
                } else {
                    u2 = new U(this.f13171o, this.f13160c, this.f13179w.f13392b.getClassLoader(), G(), L10);
                }
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = u2.f13216c;
                abstractComponentCallbacksC0789t2.f13365b = L10;
                abstractComponentCallbacksC0789t2.f13384v = this;
                if (J(2)) {
                    Log.v(string22, StubApp.getString2(16487) + abstractComponentCallbacksC0789t2.f13368e + string2 + abstractComponentCallbacksC0789t2);
                }
                u2.m(this.f13179w.f13392b.getClassLoader());
                b2.I(u2);
                u2.f13218e = this.f13178v;
            }
        }
        P p8 = this.f13156O;
        p8.getClass();
        Iterator it2 = new ArrayList(p8.f13193b.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t3 = (AbstractComponentCallbacksC0789t) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC0789t3.f13368e) == null) {
                if (J(2)) {
                    Log.v(string22, StubApp.getString2(16488) + abstractComponentCallbacksC0789t3 + StubApp.getString2(16489) + n10.f13183a);
                }
                this.f13156O.f(abstractComponentCallbacksC0789t3);
                abstractComponentCallbacksC0789t3.f13384v = this;
                U u10 = new U(bVar, b2, abstractComponentCallbacksC0789t3);
                u10.f13218e = 1;
                u10.k();
                abstractComponentCallbacksC0789t3.f13376m = true;
                u10.k();
            }
        }
        ArrayList<String> arrayList = n10.f13184b;
        ((ArrayList) b2.f1340a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0789t y10 = b2.y(str3);
                if (y10 == null) {
                    throw new IllegalStateException(E1.a.k(StubApp.getString2(16491), str3, StubApp.getString2(74)));
                }
                if (J(2)) {
                    Log.v(string22, StubApp.getString2(16490) + str3 + string2 + y10);
                }
                b2.t(y10);
            }
        }
        if (n10.f13185c != null) {
            this.f13161d = new ArrayList(n10.f13185c.length);
            int i11 = 0;
            while (true) {
                C0772b[] c0772bArr = n10.f13185c;
                if (i11 >= c0772bArr.length) {
                    break;
                }
                C0772b c0772b = c0772bArr[i11];
                c0772b.getClass();
                C0771a c0771a = new C0771a(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = c0772b.f13268a;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    V v2 = new V();
                    int i14 = i12 + 1;
                    int i15 = i3;
                    v2.f13219a = iArr[i12];
                    if (J(i15)) {
                        Log.v(string22, StubApp.getString2(16492) + c0771a + StubApp.getString2(16493) + i13 + StubApp.getString2(16494) + iArr[i14]);
                    }
                    v2.f13226h = EnumC0439n.values()[c0772b.f13270c[i13]];
                    v2.f13227i = EnumC0439n.values()[c0772b.f13271d[i13]];
                    int i16 = i12 + 2;
                    v2.f13221c = iArr[i14] != 0;
                    int i17 = iArr[i16];
                    v2.f13222d = i17;
                    int i18 = iArr[i12 + 3];
                    v2.f13223e = i18;
                    int i19 = i12 + 5;
                    int i20 = iArr[i12 + 4];
                    v2.f13224f = i20;
                    i12 += 6;
                    int i21 = iArr[i19];
                    v2.f13225g = i21;
                    c0771a.f13241b = i17;
                    c0771a.f13242c = i18;
                    c0771a.f13243d = i20;
                    c0771a.f13244e = i21;
                    c0771a.b(v2);
                    i13++;
                    i3 = i15;
                }
                int i22 = i3;
                c0771a.f13245f = c0772b.f13272e;
                c0771a.f13247h = c0772b.f13273f;
                c0771a.f13246g = true;
                c0771a.f13248i = c0772b.f13275h;
                c0771a.j = c0772b.j;
                c0771a.f13249k = c0772b.f13276k;
                c0771a.f13250l = c0772b.f13277l;
                c0771a.f13251m = c0772b.f13278m;
                c0771a.f13252n = c0772b.f13279n;
                c0771a.f13253o = c0772b.f13280p;
                c0771a.f13256r = c0772b.f13274g;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = c0772b.f13269b;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i23);
                    if (str4 != null) {
                        ((V) c0771a.f13240a.get(i23)).f13220b = b2.y(str4);
                    }
                    i23++;
                }
                c0771a.c(1);
                if (J(i22)) {
                    StringBuilder u11 = Xa.h.u(i11, StubApp.getString2(16495), StubApp.getString2(16496));
                    u11.append(c0771a.f13256r);
                    u11.append(string2);
                    u11.append(c0771a);
                    Log.v(string22, u11.toString());
                    PrintWriter printWriter = new PrintWriter(new X());
                    c0771a.f(StubApp.getString2(6127), printWriter, false);
                    printWriter.close();
                }
                this.f13161d.add(c0771a);
                i11++;
                i3 = i22;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f13161d = new ArrayList();
        }
        this.j.set(n10.f13186d);
        String str5 = n10.f13187e;
        if (str5 != null) {
            AbstractComponentCallbacksC0789t y11 = b2.y(str5);
            this.f13182z = y11;
            r(y11);
        }
        ArrayList arrayList3 = n10.f13188f;
        if (arrayList3 != null) {
            for (int i24 = i10; i24 < arrayList3.size(); i24++) {
                this.f13167k.put((String) arrayList3.get(i24), (C0773c) n10.f13189g.get(i24));
            }
        }
        this.f13147F = new ArrayDeque(n10.f13190h);
    }

    public final Bundle W() {
        int i3;
        ArrayList arrayList;
        C0772b[] c0772bArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        D();
        w();
        z(true);
        this.f13149H = true;
        this.f13156O.f13198g = true;
        D5.B b2 = this.f13160c;
        b2.getClass();
        HashMap hashMap = (HashMap) b2.f1341b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            U u2 = (U) it.next();
            if (u2 != null) {
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = u2.f13216c;
                String str = abstractComponentCallbacksC0789t.f13368e;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = u2.f13216c;
                if (abstractComponentCallbacksC0789t2.f13364a == -1 && (bundle = abstractComponentCallbacksC0789t2.f13365b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable(StubApp.getString2(291), new S(abstractComponentCallbacksC0789t2));
                if (abstractComponentCallbacksC0789t2.f13364a > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0789t2.D(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle(StubApp.getString2(16497), bundle4);
                    }
                    u2.f13214a.t(abstractComponentCallbacksC0789t2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0789t2.f13373k0.x(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle(StubApp.getString2(16498), bundle5);
                    }
                    Bundle W10 = abstractComponentCallbacksC0789t2.f13386x.W();
                    if (!W10.isEmpty()) {
                        bundle3.putBundle(StubApp.getString2(16499), W10);
                    }
                    if (abstractComponentCallbacksC0789t2.f13354I != null) {
                        u2.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0789t2.f13366c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray(StubApp.getString2(16500), sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0789t2.f13367d;
                    if (bundle6 != null) {
                        bundle3.putBundle(StubApp.getString2(16501), bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0789t2.f13369f;
                if (bundle7 != null) {
                    bundle3.putBundle(StubApp.getString2(6400), bundle7);
                }
                b2.L(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0789t.f13368e);
                if (J(2)) {
                    Log.v(StubApp.getString2(49), StubApp.getString2(16502) + abstractComponentCallbacksC0789t + StubApp.getString2(994) + abstractComponentCallbacksC0789t.f13365b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f13160c.f1342c;
        if (!hashMap2.isEmpty()) {
            D5.B b10 = this.f13160c;
            synchronized (((ArrayList) b10.f1340a)) {
                try {
                    if (((ArrayList) b10.f1340a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) b10.f1340a).size());
                        Iterator it2 = ((ArrayList) b10.f1340a).iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t3 = (AbstractComponentCallbacksC0789t) it2.next();
                            arrayList.add(abstractComponentCallbacksC0789t3.f13368e);
                            if (J(2)) {
                                Log.v(StubApp.getString2("49"), StubApp.getString2("16504") + abstractComponentCallbacksC0789t3.f13368e + StubApp.getString2("3055") + abstractComponentCallbacksC0789t3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f13161d.size();
            if (size > 0) {
                c0772bArr = new C0772b[size];
                for (i3 = 0; i3 < size; i3++) {
                    c0772bArr[i3] = new C0772b((C0771a) this.f13161d.get(i3));
                    if (J(2)) {
                        String string2 = StubApp.getString2(49);
                        StringBuilder u10 = Xa.h.u(i3, StubApp.getString2(16505), StubApp.getString2(994));
                        u10.append(this.f13161d.get(i3));
                        Log.v(string2, u10.toString());
                    }
                }
            } else {
                c0772bArr = null;
            }
            N n10 = new N();
            n10.f13187e = null;
            ArrayList arrayList3 = new ArrayList();
            n10.f13188f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            n10.f13189g = arrayList4;
            n10.f13183a = arrayList2;
            n10.f13184b = arrayList;
            n10.f13185c = c0772bArr;
            n10.f13186d = this.j.get();
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t4 = this.f13182z;
            if (abstractComponentCallbacksC0789t4 != null) {
                n10.f13187e = abstractComponentCallbacksC0789t4.f13368e;
            }
            arrayList3.addAll(this.f13167k.keySet());
            arrayList4.addAll(this.f13167k.values());
            n10.f13190h = new ArrayList(this.f13147F);
            bundle2.putParcelable(StubApp.getString2(291), n10);
            for (String str2 : this.f13168l.keySet()) {
                bundle2.putBundle(E1.a.j(StubApp.getString2(10066), str2), (Bundle) this.f13168l.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(E1.a.j(StubApp.getString2(16485), str3), (Bundle) hashMap2.get(str3));
            }
        } else if (J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16503));
            return bundle2;
        }
        return bundle2;
    }

    public final void X() {
        synchronized (this.f13158a) {
            try {
                if (this.f13158a.size() == 1) {
                    this.f13179w.f13393c.removeCallbacks(this.f13157P);
                    this.f13179w.f13393c.post(this.f13157P);
                    f0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t, boolean z2) {
        ViewGroup F3 = F(abstractComponentCallbacksC0789t);
        if (F3 == null || !(F3 instanceof C0794y)) {
            return;
        }
        ((C0794y) F3).setDrawDisappearingViewsLast(!z2);
    }

    public final void Z(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t, EnumC0439n enumC0439n) {
        if (abstractComponentCallbacksC0789t.equals(this.f13160c.y(abstractComponentCallbacksC0789t.f13368e)) && (abstractComponentCallbacksC0789t.f13385w == null || abstractComponentCallbacksC0789t.f13384v == this)) {
            abstractComponentCallbacksC0789t.f13361X = enumC0439n;
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(16452) + abstractComponentCallbacksC0789t + StubApp.getString2(16506) + this);
    }

    public final U a(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        String str = abstractComponentCallbacksC0789t.f13360T;
        if (str != null) {
            AbstractC0831d.d(abstractComponentCallbacksC0789t, str);
        }
        if (J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16507) + abstractComponentCallbacksC0789t);
        }
        U g10 = g(abstractComponentCallbacksC0789t);
        abstractComponentCallbacksC0789t.f13384v = this;
        D5.B b2 = this.f13160c;
        b2.I(g10);
        if (!abstractComponentCallbacksC0789t.f13349D) {
            b2.t(abstractComponentCallbacksC0789t);
            abstractComponentCallbacksC0789t.f13376m = false;
            if (abstractComponentCallbacksC0789t.f13354I == null) {
                abstractComponentCallbacksC0789t.f13358P = false;
            }
            if (K(abstractComponentCallbacksC0789t)) {
                this.f13148G = true;
            }
        }
        return g10;
    }

    public final void a0(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        if (abstractComponentCallbacksC0789t != null) {
            if (!abstractComponentCallbacksC0789t.equals(this.f13160c.y(abstractComponentCallbacksC0789t.f13368e)) || (abstractComponentCallbacksC0789t.f13385w != null && abstractComponentCallbacksC0789t.f13384v != this)) {
                throw new IllegalArgumentException(StubApp.getString2(16452) + abstractComponentCallbacksC0789t + StubApp.getString2(16506) + this);
            }
        }
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = this.f13182z;
        this.f13182z = abstractComponentCallbacksC0789t;
        r(abstractComponentCallbacksC0789t2);
        r(this.f13182z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0791v c0791v, AbstractC0793x abstractC0793x, AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        if (this.f13179w != null) {
            throw new IllegalStateException(StubApp.getString2(16516));
        }
        this.f13179w = c0791v;
        this.f13180x = abstractC0793x;
        this.f13181y = abstractComponentCallbacksC0789t;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13172p;
        if (abstractComponentCallbacksC0789t != 0) {
            copyOnWriteArrayList.add(new C0769G(abstractComponentCallbacksC0789t));
        } else if (c0791v != null) {
            copyOnWriteArrayList.add(c0791v);
        }
        if (this.f13181y != null) {
            f0();
        }
        if (c0791v != null) {
            d.z a3 = c0791v.f13395e.a();
            this.f13164g = a3;
            C0791v owner = abstractComponentCallbacksC0789t != 0 ? abstractComponentCallbacksC0789t : c0791v;
            a3.getClass();
            Intrinsics.checkNotNullParameter(owner, "owner");
            String string2 = StubApp.getString2(16508);
            C0766D c0766d = this.f13166i;
            Intrinsics.checkNotNullParameter(c0766d, string2);
            C0446v i3 = owner.i();
            if (i3.f9925c != EnumC0439n.f9913a) {
                d.w cancellable = new d.w(a3, i3, c0766d);
                c0766d.getClass();
                Intrinsics.checkNotNullParameter(cancellable, "cancellable");
                c0766d.f13129b.add(cancellable);
                a3.d();
                c0766d.f13130c = new d.y(0, a3, d.z.class, StubApp.getString2(16437), StubApp.getString2(16438), 0);
            }
        }
        if (abstractComponentCallbacksC0789t != 0) {
            P p8 = abstractComponentCallbacksC0789t.f13384v.f13156O;
            HashMap hashMap = p8.f13194c;
            P p9 = (P) hashMap.get(abstractComponentCallbacksC0789t.f13368e);
            if (p9 == null) {
                p9 = new P(p8.f13196e);
                hashMap.put(abstractComponentCallbacksC0789t.f13368e, p9);
            }
            this.f13156O = p9;
        } else if (c0791v != null) {
            androidx.lifecycle.V store = c0791v.f13395e.e();
            O factory = P.f13192h;
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            C1028a defaultCreationExtras = C1028a.f14702b;
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            D5.B b2 = new D5.B(store, factory, defaultCreationExtras);
            Intrinsics.checkNotNullParameter(P.class, "modelClass");
            KClass modelClass = JvmClassMappingKt.getKotlinClass(P.class);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "<this>");
            String qualifiedName = modelClass.getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException(StubApp.getString2(16510));
            }
            this.f13156O = (P) b2.E(modelClass, StubApp.getString2(16509).concat(qualifiedName));
        } else {
            this.f13156O = new P(false);
        }
        P p10 = this.f13156O;
        p10.f13198g = this.f13149H || this.f13150I;
        this.f13160c.f1343d = p10;
        C0791v c0791v2 = this.f13179w;
        if (c0791v2 != null && abstractComponentCallbacksC0789t == 0) {
            E0 f10 = c0791v2.f();
            C0765C c0765c = new C0765C(this, 0);
            String string22 = StubApp.getString2(16511);
            f10.K(string22, c0765c);
            Bundle w10 = f10.w(string22);
            if (w10 != null) {
                V(w10);
            }
        }
        C0791v c0791v3 = this.f13179w;
        if (c0791v3 != null) {
            AbstractActivityC1027h abstractActivityC1027h = c0791v3.f13395e;
            String j = E1.a.j(StubApp.getString2(16512), abstractComponentCallbacksC0789t != 0 ? AbstractC1482f.k(new StringBuilder(), abstractComponentCallbacksC0789t.f13368e, StubApp.getString2(478)) : "");
            String g10 = AbstractC1482f.g(j, StubApp.getString2(16513));
            C0770H c0770h = new C0770H(3);
            C0366a c0366a = new C0366a(this, 4);
            d.j jVar = abstractActivityC1027h.f13083h;
            this.f13144C = jVar.c(g10, c0770h, c0366a);
            this.f13145D = jVar.c(AbstractC1482f.g(j, StubApp.getString2(16514)), new C0770H(0), new A0.c(this));
            this.f13146E = jVar.c(AbstractC1482f.g(j, StubApp.getString2(16515)), new C0770H(2), new s2.d(this, 28));
        }
        C0791v c0791v4 = this.f13179w;
        if (c0791v4 != null) {
            c0791v4.b(this.f13173q);
        }
        C0791v c0791v5 = this.f13179w;
        if (c0791v5 != null) {
            AbstractActivityC1027h abstractActivityC1027h2 = c0791v5.f13395e;
            C0764B listener = this.f13174r;
            abstractActivityC1027h2.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            abstractActivityC1027h2.f13084k.add(listener);
        }
        C0791v c0791v6 = this.f13179w;
        if (c0791v6 != null) {
            AbstractActivityC1027h abstractActivityC1027h3 = c0791v6.f13395e;
            C0764B listener2 = this.f13175s;
            abstractActivityC1027h3.getClass();
            Intrinsics.checkNotNullParameter(listener2, "listener");
            abstractActivityC1027h3.f13086m.add(listener2);
        }
        C0791v c0791v7 = this.f13179w;
        if (c0791v7 != null) {
            AbstractActivityC1027h abstractActivityC1027h4 = c0791v7.f13395e;
            C0764B listener3 = this.f13176t;
            abstractActivityC1027h4.getClass();
            Intrinsics.checkNotNullParameter(listener3, "listener");
            abstractActivityC1027h4.f13087n.add(listener3);
        }
        C0791v c0791v8 = this.f13179w;
        if (c0791v8 == null || abstractComponentCallbacksC0789t != 0) {
            return;
        }
        AbstractActivityC1027h abstractActivityC1027h5 = c0791v8.f13395e;
        C0767E provider = this.f13177u;
        abstractActivityC1027h5.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        Q2.g gVar = abstractActivityC1027h5.f13078c;
        ((CopyOnWriteArrayList) gVar.f5712c).add(provider);
        ((Runnable) gVar.f5711b).run();
    }

    public final void b0(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        ViewGroup F3 = F(abstractComponentCallbacksC0789t);
        if (F3 != null) {
            C0788s c0788s = abstractComponentCallbacksC0789t.f13357O;
            if ((c0788s == null ? 0 : c0788s.f13339e) + (c0788s == null ? 0 : c0788s.f13338d) + (c0788s == null ? 0 : c0788s.f13337c) + (c0788s == null ? 0 : c0788s.f13336b) > 0) {
                if (F3.getTag(2131231169) == null) {
                    F3.setTag(2131231169, abstractComponentCallbacksC0789t);
                }
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = (AbstractComponentCallbacksC0789t) F3.getTag(2131231169);
                C0788s c0788s2 = abstractComponentCallbacksC0789t.f13357O;
                boolean z2 = c0788s2 != null ? c0788s2.f13335a : false;
                if (abstractComponentCallbacksC0789t2.f13357O == null) {
                    return;
                }
                abstractComponentCallbacksC0789t2.k().f13335a = z2;
            }
        }
    }

    public final void c(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        boolean J10 = J(2);
        String string2 = StubApp.getString2(49);
        if (J10) {
            Log.v(string2, StubApp.getString2(16517) + abstractComponentCallbacksC0789t);
        }
        if (abstractComponentCallbacksC0789t.f13349D) {
            abstractComponentCallbacksC0789t.f13349D = false;
            if (abstractComponentCallbacksC0789t.f13374l) {
                return;
            }
            this.f13160c.t(abstractComponentCallbacksC0789t);
            if (J(2)) {
                Log.v(string2, StubApp.getString2(16518) + abstractComponentCallbacksC0789t);
            }
            if (K(abstractComponentCallbacksC0789t)) {
                this.f13148G = true;
            }
        }
    }

    public final void d() {
        this.f13159b = false;
        this.f13154M.clear();
        this.f13153L.clear();
    }

    public final void d0() {
        Iterator it = this.f13160c.A().iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = u2.f13216c;
            if (abstractComponentCallbacksC0789t.f13355K) {
                if (this.f13159b) {
                    this.f13152K = true;
                } else {
                    abstractComponentCallbacksC0789t.f13355K = false;
                    u2.k();
                }
            }
        }
    }

    public final HashSet e() {
        Object c0782l;
        HashSet hashSet = new HashSet();
        Iterator it = this.f13160c.A().iterator();
        while (it.hasNext()) {
            ViewGroup container = ((U) it.next()).f13216c.f13353H;
            if (container != null) {
                C0585c factory = H();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object tag = container.getTag(2131231072);
                if (tag instanceof e0) {
                    c0782l = (e0) tag;
                } else {
                    factory.getClass();
                    Intrinsics.checkNotNullParameter(container, "container");
                    c0782l = new C0782l(container);
                    Intrinsics.checkNotNullExpressionValue(c0782l, "factory.createController(container)");
                    container.setTag(2131231072, c0782l);
                }
                hashSet.add(c0782l);
            }
        }
        return hashSet;
    }

    public final void e0(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        String string2 = StubApp.getString2(49);
        Log.e(string2, message);
        Log.e(string2, StubApp.getString2(16519));
        PrintWriter printWriter = new PrintWriter(new X());
        C0791v c0791v = this.f13179w;
        String string22 = StubApp.getString2(16520);
        String string23 = StubApp.getString2(6127);
        if (c0791v == null) {
            try {
                v(string23, null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e(string2, string22, e10);
                throw illegalStateException;
            }
        }
        try {
            c0791v.f13395e.dump(string23, null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e(string2, string22, e11);
            throw illegalStateException;
        }
    }

    public final HashSet f(ArrayList arrayList, int i3, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i3 < i10) {
            Iterator it = ((C0771a) arrayList.get(i3)).f13240a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((V) it.next()).f13220b;
                if (abstractComponentCallbacksC0789t != null && (viewGroup = abstractComponentCallbacksC0789t.f13353H) != null) {
                    hashSet.add(e0.m(viewGroup, this));
                }
            }
            i3++;
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    public final void f0() {
        String string2 = StubApp.getString2(16521);
        synchronized (this.f13158a) {
            try {
                if (!this.f13158a.isEmpty()) {
                    C0766D c0766d = this.f13166i;
                    c0766d.f13128a = true;
                    ?? r22 = c0766d.f13130c;
                    if (r22 != 0) {
                        r22.invoke();
                    }
                    if (J(3)) {
                        Log.d(StubApp.getString2("49"), string2 + this + StubApp.getString2("16522"));
                    }
                    return;
                }
                boolean z2 = this.f13161d.size() + (this.f13165h != null ? 1 : 0) > 0 && N(this.f13181y);
                if (J(3)) {
                    Log.d(StubApp.getString2(49), StubApp.getString2(16523) + this + StubApp.getString2(16524) + z2);
                }
                C0766D c0766d2 = this.f13166i;
                c0766d2.f13128a = z2;
                ?? r02 = c0766d2.f13130c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final U g(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        String str = abstractComponentCallbacksC0789t.f13368e;
        D5.B b2 = this.f13160c;
        U u2 = (U) ((HashMap) b2.f1341b).get(str);
        if (u2 != null) {
            return u2;
        }
        U u10 = new U(this.f13171o, b2, abstractComponentCallbacksC0789t);
        u10.m(this.f13179w.f13392b.getClassLoader());
        u10.f13218e = this.f13178v;
        return u10;
    }

    public final void h(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        boolean J10 = J(2);
        String string2 = StubApp.getString2(49);
        if (J10) {
            Log.v(string2, StubApp.getString2(16525) + abstractComponentCallbacksC0789t);
        }
        if (abstractComponentCallbacksC0789t.f13349D) {
            return;
        }
        abstractComponentCallbacksC0789t.f13349D = true;
        if (abstractComponentCallbacksC0789t.f13374l) {
            if (J(2)) {
                Log.v(string2, StubApp.getString2(16526) + abstractComponentCallbacksC0789t);
            }
            D5.B b2 = this.f13160c;
            synchronized (((ArrayList) b2.f1340a)) {
                ((ArrayList) b2.f1340a).remove(abstractComponentCallbacksC0789t);
            }
            abstractComponentCallbacksC0789t.f13374l = false;
            if (K(abstractComponentCallbacksC0789t)) {
                this.f13148G = true;
            }
            b0(abstractComponentCallbacksC0789t);
        }
    }

    public final void i(boolean z2) {
        if (z2 && this.f13179w != null) {
            e0(new IllegalStateException(StubApp.getString2(16527)));
            throw null;
        }
        for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : this.f13160c.C()) {
            if (abstractComponentCallbacksC0789t != null) {
                abstractComponentCallbacksC0789t.f13352G = true;
                if (z2) {
                    abstractComponentCallbacksC0789t.f13386x.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f13178v >= 1) {
            for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : this.f13160c.C()) {
                if (abstractComponentCallbacksC0789t != null) {
                    if (!abstractComponentCallbacksC0789t.f13348C ? abstractComponentCallbacksC0789t.f13386x.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f13178v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : this.f13160c.C()) {
            if (abstractComponentCallbacksC0789t != null && M(abstractComponentCallbacksC0789t)) {
                if (!abstractComponentCallbacksC0789t.f13348C ? abstractComponentCallbacksC0789t.f13386x.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0789t);
                    z2 = true;
                }
            }
        }
        if (this.f13162e != null) {
            for (int i3 = 0; i3 < this.f13162e.size(); i3++) {
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = (AbstractComponentCallbacksC0789t) this.f13162e.get(i3);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0789t2)) {
                    abstractComponentCallbacksC0789t2.getClass();
                }
            }
        }
        this.f13162e = arrayList;
        return z2;
    }

    public final void l() {
        boolean z2 = true;
        this.f13151J = true;
        z(true);
        w();
        C0791v c0791v = this.f13179w;
        D5.B b2 = this.f13160c;
        if (c0791v != null) {
            z2 = ((P) b2.f1343d).f13197f;
        } else {
            AbstractActivityC1027h abstractActivityC1027h = c0791v.f13392b;
            if (abstractActivityC1027h != null) {
                z2 = true ^ abstractActivityC1027h.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it = this.f13167k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C0773c) it.next()).f13285a.iterator();
                while (it2.hasNext()) {
                    ((P) b2.f1343d).d((String) it2.next(), false);
                }
            }
        }
        u(-1);
        C0791v c0791v2 = this.f13179w;
        if (c0791v2 != null) {
            AbstractActivityC1027h abstractActivityC1027h2 = c0791v2.f13395e;
            C0764B listener = this.f13174r;
            abstractActivityC1027h2.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            abstractActivityC1027h2.f13084k.remove(listener);
        }
        C0791v c0791v3 = this.f13179w;
        if (c0791v3 != null) {
            c0791v3.c(this.f13173q);
        }
        C0791v c0791v4 = this.f13179w;
        if (c0791v4 != null) {
            AbstractActivityC1027h abstractActivityC1027h3 = c0791v4.f13395e;
            C0764B listener2 = this.f13175s;
            abstractActivityC1027h3.getClass();
            Intrinsics.checkNotNullParameter(listener2, "listener");
            abstractActivityC1027h3.f13086m.remove(listener2);
        }
        C0791v c0791v5 = this.f13179w;
        if (c0791v5 != null) {
            AbstractActivityC1027h abstractActivityC1027h4 = c0791v5.f13395e;
            C0764B listener3 = this.f13176t;
            abstractActivityC1027h4.getClass();
            Intrinsics.checkNotNullParameter(listener3, "listener");
            abstractActivityC1027h4.f13087n.remove(listener3);
        }
        C0791v c0791v6 = this.f13179w;
        if (c0791v6 != null && this.f13181y == null) {
            AbstractActivityC1027h abstractActivityC1027h5 = c0791v6.f13395e;
            C0767E provider = this.f13177u;
            abstractActivityC1027h5.getClass();
            Intrinsics.checkNotNullParameter(provider, "provider");
            Q2.g gVar = abstractActivityC1027h5.f13078c;
            ((CopyOnWriteArrayList) gVar.f5712c).remove(provider);
            if (((HashMap) gVar.f5713d).remove(provider) != null) {
                throw new ClassCastException();
            }
            ((Runnable) gVar.f5711b).run();
        }
        this.f13179w = null;
        this.f13180x = null;
        this.f13181y = null;
        if (this.f13164g != null) {
            Iterator it3 = this.f13166i.f13129b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0760b) it3.next()).cancel();
            }
            this.f13164g = null;
        }
        C0866f c0866f = this.f13144C;
        if (c0866f != null) {
            c0866f.b();
            this.f13145D.b();
            this.f13146E.b();
        }
    }

    public final void m(boolean z2) {
        if (z2 && this.f13179w != null) {
            e0(new IllegalStateException(StubApp.getString2(16528)));
            throw null;
        }
        for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : this.f13160c.C()) {
            if (abstractComponentCallbacksC0789t != null) {
                abstractComponentCallbacksC0789t.f13352G = true;
                if (z2) {
                    abstractComponentCallbacksC0789t.f13386x.m(true);
                }
            }
        }
    }

    public final void n(boolean z2) {
        if (z2 && this.f13179w != null) {
            e0(new IllegalStateException(StubApp.getString2(16529)));
            throw null;
        }
        for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : this.f13160c.C()) {
            if (abstractComponentCallbacksC0789t != null && z2) {
                abstractComponentCallbacksC0789t.f13386x.n(true);
            }
        }
    }

    public final void o() {
        Iterator it = this.f13160c.B().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = (AbstractComponentCallbacksC0789t) it.next();
            if (abstractComponentCallbacksC0789t != null) {
                abstractComponentCallbacksC0789t.r();
                abstractComponentCallbacksC0789t.f13386x.o();
            }
        }
    }

    public final boolean p() {
        if (this.f13178v >= 1) {
            for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : this.f13160c.C()) {
                if (abstractComponentCallbacksC0789t != null) {
                    if (!abstractComponentCallbacksC0789t.f13348C ? abstractComponentCallbacksC0789t.f13386x.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f13178v < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : this.f13160c.C()) {
            if (abstractComponentCallbacksC0789t != null && !abstractComponentCallbacksC0789t.f13348C) {
                abstractComponentCallbacksC0789t.f13386x.q();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        if (abstractComponentCallbacksC0789t != null) {
            if (abstractComponentCallbacksC0789t.equals(this.f13160c.y(abstractComponentCallbacksC0789t.f13368e))) {
                abstractComponentCallbacksC0789t.f13384v.getClass();
                boolean N3 = N(abstractComponentCallbacksC0789t);
                Boolean bool = abstractComponentCallbacksC0789t.f13372k;
                if (bool == null || bool.booleanValue() != N3) {
                    abstractComponentCallbacksC0789t.f13372k = Boolean.valueOf(N3);
                    M m4 = abstractComponentCallbacksC0789t.f13386x;
                    m4.f0();
                    m4.r(m4.f13182z);
                }
            }
        }
    }

    public final void s(boolean z2) {
        if (z2 && this.f13179w != null) {
            e0(new IllegalStateException(StubApp.getString2(16530)));
            throw null;
        }
        for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : this.f13160c.C()) {
            if (abstractComponentCallbacksC0789t != null && z2) {
                abstractComponentCallbacksC0789t.f13386x.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f13178v < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : this.f13160c.C()) {
            if (abstractComponentCallbacksC0789t != null && M(abstractComponentCallbacksC0789t)) {
                if (!abstractComponentCallbacksC0789t.f13348C ? abstractComponentCallbacksC0789t.f13386x.t() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(StubApp.getString2(16531));
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(StubApp.getString2(943));
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13181y;
        String string2 = StubApp.getString2(265);
        String string22 = StubApp.getString2(1352);
        if (abstractComponentCallbacksC0789t != null) {
            sb2.append(abstractComponentCallbacksC0789t.getClass().getSimpleName());
            sb2.append(string22);
            sb2.append(Integer.toHexString(System.identityHashCode(this.f13181y)));
            sb2.append(string2);
        } else {
            C0791v c0791v = this.f13179w;
            if (c0791v != null) {
                sb2.append(c0791v.getClass().getSimpleName());
                sb2.append(string22);
                sb2.append(Integer.toHexString(System.identityHashCode(this.f13179w)));
                sb2.append(string2);
            } else {
                sb2.append(StubApp.getString2(1116));
            }
        }
        sb2.append(StubApp.getString2(16532));
        return sb2.toString();
    }

    public final void u(int i3) {
        try {
            this.f13159b = true;
            for (U u2 : ((HashMap) this.f13160c.f1341b).values()) {
                if (u2 != null) {
                    u2.f13218e = i3;
                }
            }
            O(i3, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((e0) it.next()).l();
            }
            this.f13159b = false;
            z(true);
        } catch (Throwable th) {
            this.f13159b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String g10 = AbstractC1482f.g(str, StubApp.getString2(6147));
        D5.B b2 = this.f13160c;
        b2.getClass();
        String str2 = str + StubApp.getString2(6147);
        HashMap hashMap = (HashMap) b2.f1341b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println(StubApp.getString2(16533));
            for (U u2 : hashMap.values()) {
                printWriter.print(str);
                if (u2 != null) {
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = u2.f13216c;
                    printWriter.println(abstractComponentCallbacksC0789t);
                    abstractComponentCallbacksC0789t.j(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(StubApp.getString2(1116));
                }
            }
        }
        ArrayList arrayList = (ArrayList) b2.f1340a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println(StubApp.getString2(16534));
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = (AbstractComponentCallbacksC0789t) arrayList.get(i3);
                printWriter.print(str);
                printWriter.print(StubApp.getString2(16535));
                printWriter.print(i3);
                printWriter.print(StubApp.getString2(994));
                printWriter.println(abstractComponentCallbacksC0789t2.toString());
            }
        }
        ArrayList arrayList2 = this.f13162e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println(StubApp.getString2(16536));
            for (int i10 = 0; i10 < size; i10++) {
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t3 = (AbstractComponentCallbacksC0789t) this.f13162e.get(i10);
                printWriter.print(str);
                printWriter.print(StubApp.getString2(16535));
                printWriter.print(i10);
                printWriter.print(StubApp.getString2(994));
                printWriter.println(abstractComponentCallbacksC0789t3.toString());
            }
        }
        int size3 = this.f13161d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println(StubApp.getString2(16537));
            for (int i11 = 0; i11 < size3; i11++) {
                C0771a c0771a = (C0771a) this.f13161d.get(i11);
                printWriter.print(str);
                printWriter.print(StubApp.getString2(16535));
                printWriter.print(i11);
                printWriter.print(StubApp.getString2(994));
                printWriter.println(c0771a.toString());
                c0771a.f(g10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println(StubApp.getString2(16538) + this.j.get());
        synchronized (this.f13158a) {
            try {
                int size4 = this.f13158a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println(StubApp.getString2("16539"));
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (J) this.f13158a.get(i12);
                        printWriter.print(str);
                        printWriter.print(StubApp.getString2("16535"));
                        printWriter.print(i12);
                        printWriter.print(StubApp.getString2("994"));
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println(StubApp.getString2(16540));
        printWriter.print(str);
        printWriter.print(StubApp.getString2(16541));
        printWriter.println(this.f13179w);
        printWriter.print(str);
        printWriter.print(StubApp.getString2(16542));
        printWriter.println(this.f13180x);
        if (this.f13181y != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16543));
            printWriter.println(this.f13181y);
        }
        printWriter.print(str);
        printWriter.print(StubApp.getString2(16544));
        printWriter.print(this.f13178v);
        printWriter.print(StubApp.getString2(16545));
        printWriter.print(this.f13149H);
        printWriter.print(StubApp.getString2(16546));
        printWriter.print(this.f13150I);
        printWriter.print(StubApp.getString2(16547));
        printWriter.println(this.f13151J);
        if (this.f13148G) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16548));
            printWriter.println(this.f13148G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).l();
        }
    }

    public final void x(J j, boolean z2) {
        if (!z2) {
            if (this.f13179w == null) {
                if (!this.f13151J) {
                    throw new IllegalStateException(StubApp.getString2(16550));
                }
                throw new IllegalStateException(StubApp.getString2(16549));
            }
            if (this.f13149H || this.f13150I) {
                throw new IllegalStateException(StubApp.getString2(16551));
            }
        }
        synchronized (this.f13158a) {
            try {
                if (this.f13179w == null) {
                    if (!z2) {
                        throw new IllegalStateException(StubApp.getString2("16552"));
                    }
                } else {
                    this.f13158a.add(j);
                    X();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z2) {
        if (this.f13159b) {
            throw new IllegalStateException(StubApp.getString2(16554));
        }
        if (this.f13179w == null) {
            if (!this.f13151J) {
                throw new IllegalStateException(StubApp.getString2(16550));
            }
            throw new IllegalStateException(StubApp.getString2(16549));
        }
        if (Looper.myLooper() != this.f13179w.f13393c.getLooper()) {
            throw new IllegalStateException(StubApp.getString2(16553));
        }
        if (!z2 && (this.f13149H || this.f13150I)) {
            throw new IllegalStateException(StubApp.getString2(16551));
        }
        if (this.f13153L == null) {
            this.f13153L = new ArrayList();
            this.f13154M = new ArrayList();
        }
    }

    public final boolean z(boolean z2) {
        boolean z10;
        y(z2);
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f13153L;
            ArrayList arrayList2 = this.f13154M;
            synchronized (this.f13158a) {
                if (this.f13158a.isEmpty()) {
                    z10 = false;
                } else {
                    try {
                        int size = this.f13158a.size();
                        z10 = false;
                        for (int i3 = 0; i3 < size; i3++) {
                            z10 |= ((J) this.f13158a.get(i3)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z10) {
                break;
            }
            z11 = true;
            this.f13159b = true;
            try {
                U(this.f13153L, this.f13154M);
            } finally {
                d();
            }
        }
        f0();
        if (this.f13152K) {
            this.f13152K = false;
            d0();
        }
        ((HashMap) this.f13160c.f1341b).values().removeAll(Collections.singleton(null));
        return z11;
    }
}
