package z5;

import Bc.i;
import S3.D;
import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p0.AbstractC1482f;
import x5.e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f24115d = Pattern.compile(StubApp.getString2(24907));

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f24116e = Charset.forName(StubApp.getString2(640));

    /* renamed from: a, reason: collision with root package name */
    public final Context f24117a;

    /* renamed from: b, reason: collision with root package name */
    public final w5.b f24118b;

    /* renamed from: c, reason: collision with root package name */
    public final d f24119c = new d();

    public c(Context context, w5.b bVar) {
        this.f24117a = context;
        this.f24118b = bVar;
    }

    public static URL a(String str) {
        try {
            return new URL(StubApp.getString2(24908) + str);
        } catch (MalformedURLException e10) {
            throw new e(e10.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f24116e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                str4 = String.format(StubApp.getString2("24909"), Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        String string2 = StubApp.getString2(24164);
        Log.w(string2, str4);
        boolean isEmpty = TextUtils.isEmpty(str);
        String string22 = StubApp.getString2(81);
        Log.w(string2, AbstractC1482f.j(StubApp.getString2(24910), str2, string22, str3, isEmpty ? "" : E1.a.j(string22, str)));
    }

    public static long d(String str) {
        D.a(StubApp.getString2(24911), f24115d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static C2010a e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f24116e));
        i a3 = b.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(StubApp.getString2(ModuleDescriptor.MODULE_VERSION))) {
                str = jsonReader.nextString();
            } else if (nextName.equals(StubApp.getString2(24912))) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals(StubApp.getString2(24913))) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals(StubApp.getString2(16078))) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(StubApp.getString2(1071))) {
                        a3.f768d = jsonReader.nextString();
                    } else if (nextName2.equals(StubApp.getString2(24914))) {
                        a3.f767c = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                b g10 = a3.g();
                jsonReader.endObject();
                bVar = g10;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C2010a(str, str2, str3, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f24116e));
        i a3 = b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(StubApp.getString2(1071))) {
                a3.f768d = jsonReader.nextString();
            } else if (nextName.equals(StubApp.getString2(24914))) {
                a3.f767c = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a3.f766b = 1;
        return a3.g();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StubApp.getString2("24912"), str);
            jSONObject.put(StubApp.getString2("2633"), str2);
            jSONObject.put(StubApp.getString2("24915"), StubApp.getString2("24916"));
            jSONObject.put(StubApp.getString2("214"), StubApp.getString2("24917"));
            i(httpURLConnection, jSONObject.toString().getBytes(StubApp.getString2(640)));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StubApp.getString2("214"), StubApp.getString2("24917"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StubApp.getString2("24918"), jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes(StubApp.getString2(640)));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException(StubApp.getString2(24919));
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0 A[Catch: NameNotFoundException -> 0x00f4, TryCatch #0 {NameNotFoundException -> 0x00f4, blocks: (B:8:0x00a7, B:10:0x00b9, B:17:0x00c3, B:21:0x00d0, B:23:0x00e0, B:27:0x00f6, B:29:0x0100, B:31:0x0119), top: B:7:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6 A[Catch: NameNotFoundException -> 0x00f4, TryCatch #0 {NameNotFoundException -> 0x00f4, blocks: (B:8:0x00a7, B:10:0x00b9, B:17:0x00c3, B:21:0x00d0, B:23:0x00e0, B:27:0x00f6, B:29:0x0100, B:31:0x0119), top: B:7:0x00a7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection c(java.lang.String r10, java.net.URL r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.c.c(java.lang.String, java.net.URL):java.net.HttpURLConnection");
    }
}
