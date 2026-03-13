package w1;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import q0.C1503a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f22053a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22054b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22055c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22056d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22057e;

    /* renamed from: f, reason: collision with root package name */
    public final g f22058f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f22059g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22060h;

    /* renamed from: i, reason: collision with root package name */
    public final String f22061i;
    public final c j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f22062k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f22063l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f22064m;

    public c(String str, String str2, long j, long j3, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f22053a = str;
        this.f22054b = str2;
        this.f22061i = str4;
        this.f22058f = gVar;
        this.f22059g = strArr;
        this.f22055c = str2 != null;
        this.f22056d = j;
        this.f22057e = j3;
        str3.getClass();
        this.f22060h = str3;
        this.j = cVar;
        this.f22062k = new HashMap();
        this.f22063l = new HashMap();
    }

    public static c a(String str) {
        String string2 = StubApp.getString2(4962);
        String string22 = StubApp.getString2(3692);
        String replaceAll = str.replaceAll(string2, string22).replaceAll(StubApp.getString2(23759), string22);
        String string23 = StubApp.getString2(397);
        return new c(null, replaceAll.replaceAll(string22, string23).replaceAll(StubApp.getString2(23760), string23), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C1503a c1503a = new C1503a();
            c1503a.f19809a = new SpannableStringBuilder();
            treeMap.put(str, c1503a);
        }
        CharSequence charSequence = ((C1503a) treeMap.get(str)).f19809a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i3) {
        ArrayList arrayList = this.f22064m;
        if (arrayList != null) {
            return (c) arrayList.get(i3);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f22064m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z2) {
        String string2 = StubApp.getString2(2372);
        String str = this.f22053a;
        boolean equals = string2.equals(str);
        boolean equals2 = StubApp.getString2(8089).equals(str);
        if (z2 || equals || (equals2 && this.f22061i != null)) {
            long j = this.f22056d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j3 = this.f22057e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f22064m == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f22064m.size(); i3++) {
            ((c) this.f22064m.get(i3)).d(treeSet, z2 || equals);
        }
    }

    public final boolean f(long j) {
        long j3 = this.f22056d;
        long j10 = this.f22057e;
        if (j3 == -9223372036854775807L && j10 == -9223372036854775807L) {
            return true;
        }
        if (j3 <= j && j10 == -9223372036854775807L) {
            return true;
        }
        if (j3 != -9223372036854775807L || j >= j10) {
            return j3 <= j && j < j10;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f22060h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && StubApp.getString2(8089).equals(this.f22053a) && (str2 = this.f22061i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i3 = 0; i3 < c(); i3++) {
            b(i3).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j, boolean z2, String str, TreeMap treeMap) {
        boolean z10;
        TreeMap treeMap2;
        long j3;
        HashMap hashMap = this.f22062k;
        hashMap.clear();
        HashMap hashMap2 = this.f22063l;
        hashMap2.clear();
        String string2 = StubApp.getString2(2127);
        String str2 = this.f22053a;
        if (string2.equals(str2)) {
            return;
        }
        String str3 = this.f22060h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f22055c && z2) {
            SpannableStringBuilder e10 = e(str4, treeMap);
            String str5 = this.f22054b;
            str5.getClass();
            e10.append((CharSequence) str5);
            return;
        }
        if (StubApp.getString2(23765).equals(str2) && z2) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C1503a) entry.getValue()).f19809a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = StubApp.getString2(2372).equals(str2);
            for (int i3 = 0; i3 < c(); i3++) {
                c b2 = b(i3);
                if (z2 || equals) {
                    z10 = true;
                    treeMap2 = treeMap;
                    j3 = j;
                } else {
                    z10 = false;
                    j3 = j;
                    treeMap2 = treeMap;
                }
                b2.i(j3, z10, str4, treeMap2);
            }
            if (equals) {
                SpannableStringBuilder e11 = e(str4, treeMap);
                int length = e11.length() - 1;
                while (length >= 0 && e11.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e11.charAt(length) != '\n') {
                    e11.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C1503a) entry2.getValue()).f19809a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
