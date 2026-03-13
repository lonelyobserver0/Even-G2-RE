package u5;

import android.content.Context;
import android.content.SharedPreferences;
import com.stub.StubApp;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f21453a;

    public g(Context context, String str) {
        this.f21453a = context.getSharedPreferences(StubApp.getString2(23570) + str, 0);
    }

    public final synchronized void a() {
        try {
            long j = this.f21453a.getLong(StubApp.getString2("23571"), 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f21453a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f21453a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f21453a.edit().putStringSet(str, hashSet).putLong(StubApp.getString2("23571"), j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f21453a.edit();
            int i3 = 0;
            for (Map.Entry<String, ?> entry : this.f21453a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d8 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d8)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d8);
                        i3++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i3 == 0) {
                edit.remove(StubApp.getString2("23571"));
            } else {
                edit.putLong(StubApp.getString2("23571"), i3);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f21453a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(new ArrayList(hashSet), entry.getKey()));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f21453a.edit().putLong(StubApp.getString2("23572"), currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f21453a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        try {
            String e10 = e(str);
            if (e10 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f21453a.getStringSet(e10, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f21453a.edit().remove(e10).commit();
            } else {
                this.f21453a.edit().putStringSet(e10, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(long j) {
        String string2 = StubApp.getString2(23572);
        synchronized (this) {
            if (!this.f21453a.contains(string2)) {
                this.f21453a.edit().putLong(string2, j).commit();
                return true;
            }
            long j3 = this.f21453a.getLong(string2, -1L);
            synchronized (this) {
                boolean equals = d(j3).equals(d(j));
                if (equals) {
                    return false;
                }
                this.f21453a.edit().putLong(string2, j).commit();
                return true;
            }
        }
    }

    public final synchronized void h(long j, String str) {
        String d8 = d(j);
        if (this.f21453a.getString(StubApp.getString2("5786"), "").equals(d8)) {
            String e10 = e(d8);
            if (e10 == null) {
                return;
            }
            if (e10.equals(str)) {
                return;
            }
            i(str, d8);
            return;
        }
        long j3 = this.f21453a.getLong(StubApp.getString2("23571"), 0L);
        if (j3 + 1 == 30) {
            a();
            j3 = this.f21453a.getLong(StubApp.getString2("23571"), 0L);
        }
        HashSet hashSet = new HashSet(this.f21453a.getStringSet(str, new HashSet()));
        hashSet.add(d8);
        this.f21453a.edit().putStringSet(str, hashSet).putLong(StubApp.getString2("23571"), j3 + 1).putString(StubApp.getString2("5786"), d8).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f21453a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f21453a.edit().putStringSet(str, hashSet).commit();
    }
}
