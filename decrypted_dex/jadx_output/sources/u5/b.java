package u5;

import android.util.Base64OutputStream;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f21444b;

    public /* synthetic */ b(c cVar, int i3) {
        this.f21443a = i3;
        this.f21444b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f21443a) {
            case 0:
                c cVar = this.f21444b;
                synchronized (cVar) {
                    try {
                        g gVar = (g) cVar.f21445a.get();
                        ArrayList c10 = gVar.c();
                        gVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i3 = 0; i3 < c10.size(); i3++) {
                            a aVar = (a) c10.get(i3);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(StubApp.getString2("23562"), aVar.f21441a);
                            jSONObject.put(StubApp.getString2("23563"), new JSONArray((Collection) aVar.f21442b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(StubApp.getString2("23564"), jSONArray);
                        jSONObject2.put(StubApp.getString2("2155"), StubApp.getString2("4967"));
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(StubApp.getString2("640")));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString(StubApp.getString2("640"));
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                c cVar2 = this.f21444b;
                synchronized (cVar2) {
                    ((g) cVar2.f21445a.get()).h(System.currentTimeMillis(), ((F5.b) cVar2.f21447c.get()).a());
                }
                return null;
        }
    }
}
