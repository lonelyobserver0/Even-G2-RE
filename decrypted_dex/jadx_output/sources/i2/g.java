package i2;

import android.util.Log;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f14735b = o.g(StubApp.getString2(18464));

    /* renamed from: c, reason: collision with root package name */
    public static final g f14736c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14737a;

    static {
        g gVar = new g(new HashMap());
        c(gVar);
        f14736c = gVar;
    }

    public g(g gVar) {
        this.f14737a = new HashMap(gVar.f14737a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0045 -> B:16:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i2.g a(byte[] r8) {
        /*
            r0 = 18465(0x4821, float:2.5875E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.String r1 = i2.g.f14735b
            int r2 = r8.length
            r3 = 10240(0x2800, float:1.4349E-41)
            if (r2 > r3) goto L7d
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r8)
            r8 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L49 java.lang.ClassNotFoundException -> L4d java.io.IOException -> L52
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L49 java.lang.ClassNotFoundException -> L4d java.io.IOException -> L52
            int r8 = r4.readInt()     // Catch: java.lang.Throwable -> L32 java.lang.ClassNotFoundException -> L34 java.io.IOException -> L36
        L22:
            if (r8 <= 0) goto L38
            java.lang.String r5 = r4.readUTF()     // Catch: java.lang.Throwable -> L32 java.lang.ClassNotFoundException -> L34 java.io.IOException -> L36
            java.lang.Object r6 = r4.readObject()     // Catch: java.lang.Throwable -> L32 java.lang.ClassNotFoundException -> L34 java.io.IOException -> L36
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L32 java.lang.ClassNotFoundException -> L34 java.io.IOException -> L36
            int r8 = r8 + (-1)
            goto L22
        L32:
            r8 = move-exception
            goto L6a
        L34:
            r8 = move-exception
            goto L54
        L36:
            r8 = move-exception
            goto L54
        L38:
            r4.close()     // Catch: java.io.IOException -> L3c
            goto L40
        L3c:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L40:
            r3.close()     // Catch: java.io.IOException -> L44
            goto L64
        L44:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
            goto L64
        L49:
            r2 = move-exception
            r4 = r8
            r8 = r2
            goto L6a
        L4d:
            r4 = move-exception
        L4e:
            r7 = r4
            r4 = r8
            r8 = r7
            goto L54
        L52:
            r4 = move-exception
            goto L4e
        L54:
            android.util.Log.e(r1, r0, r8)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L61
            r4.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L61:
            r3.close()     // Catch: java.io.IOException -> L44
        L64:
            i2.g r8 = new i2.g
            r8.<init>(r2)
            return r8
        L6a:
            if (r4 == 0) goto L74
            r4.close()     // Catch: java.io.IOException -> L70
            goto L74
        L70:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L74:
            r3.close()     // Catch: java.io.IOException -> L78
            goto L7c
        L78:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L7c:
            throw r8
        L7d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r0 = 18466(0x4822, float:2.5876E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.g.a(byte[]):i2.g");
    }

    public static byte[] c(g gVar) {
        ObjectOutputStream objectOutputStream;
        String string2 = StubApp.getString2(18467);
        String str = f14735b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            objectOutputStream.writeInt(gVar.f14737a.size());
            for (Map.Entry entry : gVar.f14737a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e11) {
                Log.e(str, string2, e11);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(str, string2, e12);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException(StubApp.getString2(18466));
        } catch (IOException e13) {
            e = e13;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, string2, e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    Log.e(str, string2, e14);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e15) {
                Log.e(str, string2, e15);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e16) {
                    Log.e(str, string2, e16);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e17) {
                Log.e(str, string2, e17);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.f14737a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                HashMap hashMap = this.f14737a;
                Set<String> keySet = hashMap.keySet();
                HashMap hashMap2 = ((g) obj).f14737a;
                if (keySet.equals(hashMap2.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap.get(str);
                        Object obj3 = hashMap2.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14737a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(18468));
        HashMap hashMap = this.f14737a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(str);
                sb2.append(StubApp.getString2(8801));
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(StubApp.getString2(81));
            }
        }
        sb2.append(StubApp.getString2(265));
        return sb2.toString();
    }

    public g(HashMap hashMap) {
        this.f14737a = new HashMap(hashMap);
    }
}
