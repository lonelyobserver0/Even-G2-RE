package y5;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.stub.StubApp;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f23520c = {StubApp.getString2(602), StubApp.getString2(24656), StubApp.getString2(24655), ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f23521a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23522b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(R4.h r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            r0 = 1376(0x560, float:1.928E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 0
            android.content.Context r2 = r4.f6193a
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.f23521a = r0
            r4.a()
            R4.j r0 = r4.f6195c
            java.lang.String r1 = r0.f6207e
            if (r1 == 0) goto L20
            goto L5c
        L20:
            r4.a()
            r4 = 1475(0x5c3, float:2.067E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.String r1 = r0.f6204b
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L40
            r4 = 24657(0x6051, float:3.4552E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L40
            goto L5c
        L40:
            r4 = 478(0x1de, float:6.7E-43)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L52
        L50:
            r1 = r2
            goto L5c
        L52:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L5c
            goto L50
        L5c:
            r3.f23522b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.b.<init>(R4.h):void");
    }

    public final String a() {
        PublicKey publicKey;
        synchronized (this.f23521a) {
            String str = null;
            String string = this.f23521a.getString(StubApp.getString2("24658"), null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance(StubApp.getString2("24659")).generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w(StubApp.getString2("24661"), StubApp.getString2("24660") + e10);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w(StubApp.getString2("24661"), StubApp.getString2("24662"));
            }
            return str;
        }
    }
}
