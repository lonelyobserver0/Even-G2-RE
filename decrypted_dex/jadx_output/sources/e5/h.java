package e5;

import android.util.Log;
import com.stub.StubApp;
import i5.C1059c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f13616b = Charset.forName(StubApp.getString2(640));

    /* renamed from: a, reason: collision with root package name */
    public final C1059c f13617a;

    public h(C1059c c1059c) {
        this.f13617a = c1059c;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray(StubApp.getString2(17288));
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String string = jSONArray.getString(i3);
            try {
                arrayList.add(n.a(string));
            } catch (Exception e10) {
                Log.w(StubApp.getString2(280), StubApp.getString2(17289) + string, e10);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i3 = 0; i3 < list.size(); i3++) {
            try {
                jSONArray.put(new JSONObject(n.f13634a.r(list.get(i3))));
            } catch (JSONException e10) {
                Log.w(StubApp.getString2(280), StubApp.getString2(17290), e10);
            }
        }
        hashMap.put(StubApp.getString2(17288), jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i(StubApp.getString2(280), StubApp.getString2(17291) + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i(StubApp.getString2(280), AbstractC1482f.i(StubApp.getString2(17291), file.getAbsolutePath(), StubApp.getString2(17292), str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    public final Map c(String str, boolean z2) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e10;
        String string2 = StubApp.getString2(17293);
        C1059c c1059c = this.f13617a;
        File k3 = z2 ? c1059c.k(str, StubApp.getString2(17294)) : c1059c.k(str, StubApp.getString2(17295));
        if (!k3.exists() || k3.length() == 0) {
            g(k3, StubApp.getString2(9482) + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(k3);
                try {
                    HashMap a3 = a(c5.f.i(fileInputStream));
                    c5.f.b(fileInputStream, string2);
                    return a3;
                } catch (Exception e11) {
                    e10 = e11;
                    Log.w(StubApp.getString2("280"), StubApp.getString2("17296"), e10);
                    f(k3);
                    c5.f.b(fileInputStream, string2);
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th2) {
                th = th2;
                c5.f.b(r1, string2);
                throw th;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th3) {
            ?? r12 = 0;
            th = th3;
            c5.f.b(r12, string2);
            throw th;
        }
    }

    public final String d(String str) {
        FileInputStream fileInputStream;
        String string2 = StubApp.getString2(17293);
        String string22 = StubApp.getString2(17297);
        File k3 = this.f13617a.k(str, StubApp.getString2(17298));
        boolean exists = k3.exists();
        FileInputStream fileInputStream2 = null;
        String string23 = StubApp.getString2(280);
        if (!exists || k3.length() == 0) {
            String j = E1.a.j(StubApp.getString2(17300), str);
            if (Log.isLoggable(string23, 3)) {
                Log.d(string23, j, null);
            }
            f(k3);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(k3);
            try {
                try {
                    JSONObject jSONObject = new JSONObject(c5.f.i(fileInputStream));
                    String string24 = StubApp.getString2("16082");
                    String optString = !jSONObject.isNull(string24) ? jSONObject.optString(string24, null) : null;
                    String str2 = string22 + optString + StubApp.getString2("17299") + str;
                    if (Log.isLoggable(string23, 3)) {
                        Log.d(string23, str2, null);
                    }
                    c5.f.b(fileInputStream, string2);
                    return optString;
                } catch (Exception e10) {
                    e = e10;
                    Log.w(string23, StubApp.getString2("17296"), e);
                    f(k3);
                    c5.f.b(fileInputStream, string2);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                c5.f.b(fileInputStream2, string2);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            c5.f.b(fileInputStream2, string2);
            throw th;
        }
    }

    public final void h(String str, Map map, boolean z2) {
        String jSONObject;
        BufferedWriter bufferedWriter;
        String string2 = StubApp.getString2(17301);
        C1059c c1059c = this.f13617a;
        File k3 = z2 ? c1059c.k(str, StubApp.getString2(17294)) : c1059c.k(str, StubApp.getString2(17295));
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(k3), f13616b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            c5.f.b(bufferedWriter, string2);
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w(StubApp.getString2("280"), StubApp.getString2("17302"), e);
            f(k3);
            c5.f.b(bufferedWriter2, string2);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            c5.f.b(bufferedWriter2, string2);
            throw th;
        }
    }

    public final void i(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        String string2 = StubApp.getString2(17293);
        File k3 = this.f13617a.k(str, StubApp.getString2(17298));
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                g gVar = new g();
                gVar.put(StubApp.getString2("16082"), str2);
                obj = gVar.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(k3), f13616b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            c5.f.b(bufferedWriter, string2);
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w(StubApp.getString2("280"), StubApp.getString2("17303"), e);
            c5.f.b(bufferedWriter2, string2);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            c5.f.b(bufferedWriter2, string2);
            throw th;
        }
    }
}
