package wa;

import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f22277a = new HashMap(38);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f22278b = new HashMap(14);

    static {
        String string2 = StubApp.getString2(23888);
        c(string2);
        String string22 = StubApp.getString2(23898);
        c(string22);
        String string23 = StubApp.getString2(23883);
        c(string23);
        String string24 = StubApp.getString2(23893);
        c(string24);
        String string25 = StubApp.getString2(23904);
        c(string25);
        String string26 = StubApp.getString2(23910);
        c(string26);
        String string27 = StubApp.getString2(23923);
        c(string27);
        String string28 = StubApp.getString2(23917);
        c(string28);
        String string29 = StubApp.getString2(23951);
        c(string29);
        String string210 = StubApp.getString2(23936);
        c(string210);
        String string211 = StubApp.getString2(23950);
        c(string211);
        String string212 = StubApp.getString2(23943);
        c(string212);
        String string213 = StubApp.getString2(23929);
        c(string213);
        c(StubApp.getString2(23958));
        d(StubApp.getString2(24059), string23);
        d(StubApp.getString2(23878), string23);
        d(StubApp.getString2(24060), string24);
        d(StubApp.getString2(24061), string2);
        d(StubApp.getString2(24062), string22);
        d(StubApp.getString2(23899), string25);
        d(StubApp.getString2(24063), string28);
        d(StubApp.getString2(24064), string26);
        d(StubApp.getString2(24065), string27);
        d(StubApp.getString2(23927), string213);
        d(StubApp.getString2(24066), string212);
        d(StubApp.getString2(24067), string210);
        d(StubApp.getString2(24068), string211);
        d(StubApp.getString2(24069), string29);
        d(StubApp.getString2(24070), string29);
        d(StubApp.getString2(24071), string29);
        d(StubApp.getString2(24072), string213);
        d(StubApp.getString2(24073), string212);
        d(StubApp.getString2(24074), string210);
        d(StubApp.getString2(24075), string211);
        d(StubApp.getString2(23901), string25);
        d(StubApp.getString2(23913), string28);
        d(StubApp.getString2(23907), string26);
        d(StubApp.getString2(23920), string27);
    }

    public static Y9.b a(String str) {
        String str2 = (String) f22277a.get(str);
        if (str2 == null) {
            return null;
        }
        HashMap hashMap = f22278b;
        if (hashMap.get(str2) == null) {
            synchronized (hashMap) {
                if (hashMap.get(str2) == null) {
                    try {
                        b(str2);
                    } catch (IOException e10) {
                        throw new IllegalArgumentException(e10);
                    }
                }
            }
        }
        return (Y9.b) hashMap.get(str2);
    }

    public static void b(String str) {
        InputStream resourceAsStream;
        String k3 = E1.a.k(StubApp.getString2(24076), str, StubApp.getString2(24077));
        if (AbstractC0624h2.o()) {
            resourceAsStream = AbstractC0624h2.k(k3);
        } else {
            resourceAsStream = u.class.getResourceAsStream(StubApp.getString2(601) + k3);
        }
        if (resourceAsStream == null) {
            throw new IOException(E1.a.k(StubApp.getString2(23960), k3, StubApp.getString2(23961)));
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
        try {
            f22278b.put(str, new Z9.q(bufferedInputStream, 27).C());
        } finally {
            bufferedInputStream.close();
        }
    }

    public static void c(String str) {
        f22277a.put(str, str);
    }

    public static void d(String str, String str2) {
        f22277a.put(str, str2);
    }
}
