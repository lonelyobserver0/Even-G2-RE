package l0;

import E0.e;
import Y.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1137b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f15715f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static C1137b f15716g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15717a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15718b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15719c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15720d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final e f15721e;

    public C1137b(Context context) {
        this.f15717a = context;
        this.f15721e = new e(this, context.getMainLooper(), 2);
    }

    public static C1137b a(Context context) {
        C1137b c1137b;
        synchronized (f15715f) {
            try {
                if (f15716g == null) {
                    f15716g = new C1137b(StubApp.getOrigApplicationContext(context.getApplicationContext()));
                }
                c1137b = f15716g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1137b;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f15718b) {
            try {
                C1136a c1136a = new C1136a(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f15718b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f15718b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c1136a);
                for (int i3 = 0; i3 < intentFilter.countActions(); i3++) {
                    String action = intentFilter.getAction(i3);
                    ArrayList arrayList2 = (ArrayList) this.f15719c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f15719c.put(action, arrayList2);
                    }
                    arrayList2.add(c1136a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Intent intent) {
        ArrayList arrayList;
        String string2 = StubApp.getString2(19218);
        String string22 = StubApp.getString2(19219);
        synchronized (this.f15718b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f15717a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = (intent.getFlags() & 8) != 0;
                if (z2) {
                    Log.v(StubApp.getString2("19220"), string22 + resolveTypeIfNeeded + StubApp.getString2("19221") + scheme + StubApp.getString2("19222") + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f15719c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z2) {
                        Log.v(StubApp.getString2("19220"), string2 + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i3 = 0;
                    while (i3 < arrayList2.size()) {
                        C1136a c1136a = (C1136a) arrayList2.get(i3);
                        if (z2) {
                            Log.v(StubApp.getString2("19220"), StubApp.getString2("19223") + c1136a.f15711a);
                        }
                        if (c1136a.f15713c) {
                            if (z2) {
                                Log.v(StubApp.getString2("19220"), StubApp.getString2("19224"));
                            }
                            arrayList = arrayList2;
                        } else {
                            int match = c1136a.f15711a.match(action, resolveTypeIfNeeded, scheme, data, categories, StubApp.getString2("19220"));
                            if (match >= 0) {
                                if (z2) {
                                    String string23 = StubApp.getString2("19220");
                                    StringBuilder sb2 = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb2.append(StubApp.getString2("19225"));
                                    sb2.append(Integer.toHexString(match));
                                    Log.v(string23, sb2.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(c1136a);
                                c1136a.f15713c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z2) {
                                    String string24 = match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : StubApp.getString2("2069");
                                    Log.v(StubApp.getString2("19220"), StubApp.getString2("19226") + string24);
                                }
                            }
                        }
                        i3++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            ((C1136a) arrayList3.get(i10)).f15713c = false;
                        }
                        this.f15720d.add(new m(20, intent, arrayList3));
                        if (!this.f15721e.hasMessages(1)) {
                            this.f15721e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f15718b) {
            try {
                ArrayList arrayList = (ArrayList) this.f15718b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C1136a c1136a = (C1136a) arrayList.get(size);
                    c1136a.f15714d = true;
                    for (int i3 = 0; i3 < c1136a.f15711a.countActions(); i3++) {
                        String action = c1136a.f15711a.getAction(i3);
                        ArrayList arrayList2 = (ArrayList) this.f15719c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C1136a c1136a2 = (C1136a) arrayList2.get(size2);
                                if (c1136a2.f15712b == broadcastReceiver) {
                                    c1136a2.f15714d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f15719c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
