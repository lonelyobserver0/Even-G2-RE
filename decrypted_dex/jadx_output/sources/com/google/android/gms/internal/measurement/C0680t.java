package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import com.stub.StubApp;
import i5.C1059c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0680t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11660a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11661b;

    public /* synthetic */ C0680t(Object obj, Object obj2) {
        this.f11660a = obj;
        this.f11661b = obj2;
    }

    public Object a() {
        Uri uri;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str;
        K1 k12 = (K1) this.f11660a;
        String str2 = (String) this.f11661b;
        Context context = (Context) k12.f11299b;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        C1059c c1059c = B1.f11234a;
        if (contentResolver == null) {
            c1059c.getClass();
            throw new IllegalStateException(StubApp.getString2(12289));
        }
        synchronized (c1059c) {
            try {
                if (((HashMap) c1059c.f14843b) == null) {
                    ((AtomicBoolean) c1059c.f14842a).set(false);
                    c1059c.f14843b = new HashMap(16, 1.0f);
                    c1059c.f14848g = new Object();
                    contentResolver.registerContentObserver(C1.f11238a, true, new Xa.p(c1059c));
                } else if (((AtomicBoolean) c1059c.f14842a).getAndSet(false)) {
                    ((HashMap) c1059c.f14843b).clear();
                    ((HashMap) c1059c.f14844c).clear();
                    ((HashMap) c1059c.f14845d).clear();
                    ((HashMap) c1059c.f14846e).clear();
                    ((HashMap) c1059c.f14847f).clear();
                    c1059c.f14848g = new Object();
                }
                Object obj = c1059c.f14848g;
                String str3 = null;
                if (((HashMap) c1059c.f14843b).containsKey(str2)) {
                    String str4 = (String) ((HashMap) c1059c.f14843b).get(str2);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    uri = C1.f11238a;
                    acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                } catch (E1 unused) {
                }
                try {
                    if (acquireUnstableContentProviderClient == null) {
                        throw new E1(StubApp.getString2("12288"));
                    }
                    try {
                        Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str2}, null);
                        try {
                            if (query == null) {
                                throw new E1(StubApp.getString2("12286"));
                            }
                            if (query.moveToFirst()) {
                                str = query.getString(1);
                                query.close();
                            } else {
                                query.close();
                                str = null;
                            }
                            if (str != null && str.equals(null)) {
                                str = null;
                            }
                            synchronized (c1059c) {
                                try {
                                    if (obj == c1059c.f14848g) {
                                        ((HashMap) c1059c.f14843b).put(str2, str);
                                    }
                                } finally {
                                }
                            }
                            if (str != null) {
                                return str;
                            }
                            return null;
                        } finally {
                        }
                    } catch (RemoteException e10) {
                        throw new E1(StubApp.getString2("12287"), e10);
                    }
                } finally {
                    acquireUnstableContentProviderClient.release();
                }
            } finally {
            }
        }
    }

    public void b(C0675s c0675s) {
        Iterator it = c0675s.f11658a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f11660a).put(Integer.valueOf(((EnumC0695w) it.next()).f11744a).toString(), c0675s);
        }
    }

    public InterfaceC0651n c(p2.h hVar, InterfaceC0651n interfaceC0651n) {
        a4.f.a0(hVar);
        if (!(interfaceC0651n instanceof C0656o)) {
            return interfaceC0651n;
        }
        C0656o c0656o = (C0656o) interfaceC0651n;
        ArrayList arrayList = c0656o.f11633b;
        HashMap hashMap = (HashMap) this.f11660a;
        String str = c0656o.f11632a;
        return (hashMap.containsKey(str) ? (C0675s) hashMap.get(str) : (C0675s) this.f11661b).a(str, hVar, arrayList);
    }

    public void d(p2.h hVar, a5.c cVar) {
        Z1 z12 = new Z1(cVar);
        TreeMap treeMap = (TreeMap) this.f11660a;
        for (Integer num : treeMap.keySet()) {
            C0591b clone = ((C0591b) cVar.f9283c).clone();
            InterfaceC0651n e10 = ((C0646m) treeMap.get(num)).e(hVar, Collections.singletonList(z12));
            int W10 = e10 instanceof C0616g ? a4.f.W(((C0616g) e10).f11566a.doubleValue()) : -1;
            if (W10 == 2 || W10 == -1) {
                cVar.f9283c = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f11661b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC0651n e11 = ((C0646m) treeMap2.get((Integer) it.next())).e(hVar, Collections.singletonList(z12));
            if (e11 instanceof C0616g) {
                a4.f.W(((C0616g) e11).f11566a.doubleValue());
            }
        }
    }

    public C0680t(int i3) {
        switch (i3) {
            case 3:
                this.f11660a = new TreeMap();
                this.f11661b = new TreeMap();
                break;
            default:
                this.f11660a = new HashMap();
                this.f11661b = new C0675s(6);
                C0675s c0675s = new C0675s(0);
                ArrayList arrayList = c0675s.f11658a;
                arrayList.add(EnumC0695w.f11711f);
                arrayList.add(EnumC0695w.f11712g);
                arrayList.add(EnumC0695w.f11713h);
                arrayList.add(EnumC0695w.j);
                arrayList.add(EnumC0695w.f11714k);
                arrayList.add(EnumC0695w.f11716l);
                arrayList.add(EnumC0695w.f11718m);
                b(c0675s);
                C0675s c0675s2 = new C0675s(1);
                ArrayList arrayList2 = c0675s2.f11658a;
                arrayList2.add(EnumC0695w.f11742z);
                arrayList2.add(EnumC0695w.f11701P);
                arrayList2.add(EnumC0695w.f11702R);
                arrayList2.add(EnumC0695w.f11703T);
                arrayList2.add(EnumC0695w.f11704X);
                arrayList2.add(EnumC0695w.f11706Z);
                arrayList2.add(EnumC0695w.h0);
                arrayList2.add(EnumC0695w.f11722o0);
                b(c0675s2);
                C0675s c0675s3 = new C0675s(2);
                ArrayList arrayList3 = c0675s3.f11658a;
                arrayList3.add(EnumC0695w.f11709d);
                arrayList3.add(EnumC0695w.f11720n);
                arrayList3.add(EnumC0695w.f11723p);
                arrayList3.add(EnumC0695w.f11725q);
                arrayList3.add(EnumC0695w.f11736w);
                arrayList3.add(EnumC0695w.f11729s);
                arrayList3.add(EnumC0695w.f11738x);
                arrayList3.add(EnumC0695w.f11684B);
                arrayList3.add(EnumC0695w.f11705Y);
                arrayList3.add(EnumC0695w.f11732t0);
                arrayList3.add(EnumC0695w.f11737w0);
                arrayList3.add(EnumC0695w.f11743z0);
                arrayList3.add(EnumC0695w.f11683A0);
                b(c0675s3);
                C0675s c0675s4 = new C0675s(3);
                ArrayList arrayList4 = c0675s4.f11658a;
                arrayList4.add(EnumC0695w.f11708c);
                arrayList4.add(EnumC0695w.f11721n0);
                arrayList4.add(EnumC0695w.f11726q0);
                b(c0675s4);
                C0675s c0675s5 = new C0675s(4);
                ArrayList arrayList5 = c0675s5.f11658a;
                arrayList5.add(EnumC0695w.f11686C);
                arrayList5.add(EnumC0695w.f11688D);
                arrayList5.add(EnumC0695w.f11690E);
                arrayList5.add(EnumC0695w.f11692F);
                arrayList5.add(EnumC0695w.f11694G);
                arrayList5.add(EnumC0695w.f11696H);
                arrayList5.add(EnumC0695w.f11697I);
                arrayList5.add(EnumC0695w.f11691E0);
                b(c0675s5);
                C0675s c0675s6 = new C0675s(5);
                ArrayList arrayList6 = c0675s6.f11658a;
                arrayList6.add(EnumC0695w.f11707b);
                arrayList6.add(EnumC0695w.f11740y);
                arrayList6.add(EnumC0695w.f11715k0);
                arrayList6.add(EnumC0695w.f11717l0);
                arrayList6.add(EnumC0695w.f11719m0);
                arrayList6.add(EnumC0695w.f11728r0);
                arrayList6.add(EnumC0695w.f11730s0);
                arrayList6.add(EnumC0695w.f11733u0);
                arrayList6.add(EnumC0695w.f11735v0);
                arrayList6.add(EnumC0695w.f11741y0);
                b(c0675s6);
                C0675s c0675s7 = new C0675s(7);
                ArrayList arrayList7 = c0675s7.f11658a;
                arrayList7.add(EnumC0695w.f11710e);
                arrayList7.add(EnumC0695w.f11727r);
                arrayList7.add(EnumC0695w.f11731t);
                arrayList7.add(EnumC0695w.f11734v);
                arrayList7.add(EnumC0695w.f11682A);
                arrayList7.add(EnumC0695w.f11698K);
                arrayList7.add(EnumC0695w.f11699L);
                arrayList7.add(EnumC0695w.f11700O);
                arrayList7.add(EnumC0695w.f11724p0);
                arrayList7.add(EnumC0695w.f11739x0);
                arrayList7.add(EnumC0695w.f11685B0);
                arrayList7.add(EnumC0695w.f11687C0);
                arrayList7.add(EnumC0695w.f11689D0);
                b(c0675s7);
                break;
        }
    }
}
