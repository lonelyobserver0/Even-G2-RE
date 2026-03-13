package M3;

import Vc.e;
import android.net.Uri;
import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4530b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f4529a = i3;
        this.f4530b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f4529a) {
            case 0:
                Uri.Builder buildUpon = Uri.parse(StubApp.getString2(3533)).buildUpon();
                HashMap hashMap = (HashMap) this.f4530b;
                for (String str : hashMap.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
                }
                String uri = buildUpon.build().toString();
                String string2 = StubApp.getString2(2938);
                String string22 = StubApp.getString2(3534);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                            sb2.append(StubApp.getString2("3535"));
                            sb2.append(responseCode);
                            sb2.append(StubApp.getString2("3536"));
                            sb2.append(uri);
                            Log.w(string22, sb2.toString());
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
                    sb3.append(StubApp.getString2(3537));
                    sb3.append(uri);
                    sb3.append(string2);
                    sb3.append(message);
                    Log.w(string22, sb3.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e11) {
                    String message2 = e11.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
                    sb4.append(StubApp.getString2(3538));
                    sb4.append(uri);
                    sb4.append(string2);
                    sb4.append(message2);
                    Log.w(string22, sb4.toString(), e11);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    String message3 = e.getMessage();
                    StringBuilder sb32 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
                    sb32.append(StubApp.getString2(3537));
                    sb32.append(uri);
                    sb32.append(string2);
                    sb32.append(message3);
                    Log.w(string22, sb32.toString(), e);
                    return;
                } finally {
                }
            case 1:
                e eVar = (e) this.f4530b;
                byte[] bArr = new byte[eVar.f8004h];
                while (eVar.f8006k) {
                    try {
                        int read = eVar.j.read(bArr, 0, eVar.f8004h, 0);
                        if (read > 0) {
                            try {
                                if (eVar.f8001e.write(bArr, 0, read, 1) != read) {
                                    System.out.println(StubApp.getString2("3530"));
                                }
                            } catch (Exception e13) {
                                eVar.f8005i.d(StubApp.getString2("3531") + e13.getMessage());
                            }
                        } else {
                            eVar.f8005i.d(StubApp.getString2("3532"));
                        }
                    } catch (Exception e14) {
                        System.out.println(e14);
                        return;
                    }
                }
                return;
            default:
                do {
                    try {
                    } catch (InterruptedException e15) {
                        throw new IllegalStateException(e15);
                    }
                } while (((D0.b) this.f4530b).h());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(D0.b bVar) {
        super(StubApp.getString2(3529));
        this.f4529a = 2;
        this.f4530b = bVar;
    }
}
