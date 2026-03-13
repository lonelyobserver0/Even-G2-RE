package H1;

import android.content.pm.PackageInfo;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.UByte;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final u5.d f2678a = new u5.d(8);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2679b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f2680c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f2681d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2682e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f2683f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f2684g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f2685h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f2686i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(I0.e[] eVarArr, byte[] bArr) {
        int i3 = 0;
        int i10 = 0;
        for (I0.e eVar : eVarArr) {
            i10 += ((((eVar.j * 2) + 7) & (-8)) / 8) + (eVar.f3062f * 2) + d(bArr, (String) eVar.f3058b, (String) eVar.f3059c).getBytes(StandardCharsets.UTF_8).length + 16 + eVar.f3064h;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, f2683f)) {
            int length = eVarArr.length;
            while (i3 < length) {
                I0.e eVar2 = eVarArr[i3];
                q(byteArrayOutputStream, eVar2, d(bArr, (String) eVar2.f3058b, (String) eVar2.f3059c));
                p(byteArrayOutputStream, eVar2);
                i3++;
            }
        } else {
            for (I0.e eVar3 : eVarArr) {
                q(byteArrayOutputStream, eVar3, d(bArr, (String) eVar3.f3058b, (String) eVar3.f3059c));
            }
            int length2 = eVarArr.length;
            while (i3 < length2) {
                p(byteArrayOutputStream, eVarArr[i3]);
                i3++;
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException(StubApp.getString2(2491) + byteArrayOutputStream.size() + StubApp.getString2(2492) + i10);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : listFiles) {
            z2 = c(file2) && z2;
        }
        return z2;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f2685h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f2684g;
        String string2 = StubApp.getString2(1373);
        String string22 = StubApp.getString2(478);
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? string22 : string2;
        if (str.length() <= 0) {
            if (string2.equals(obj)) {
                return str2.replace(string22, string2);
            }
            if (string22.equals(obj)) {
                return str2.replace(string2, string22);
            }
        } else {
            if (str2.equals(StubApp.getString2(2493))) {
                return str;
            }
            if (str2.contains(string2) || str2.contains(string22)) {
                if (string2.equals(obj)) {
                    return str2.replace(string22, string2);
                }
                if (string22.equals(obj)) {
                    return str2.replace(string2, string22);
                }
            } else if (!str2.endsWith(StubApp.getString2(2494))) {
                StringBuilder b2 = AbstractC1856e.b(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    string2 = string22;
                }
                return AbstractC1482f.k(b2, string2, str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, StubApp.getString2(2495))));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i3) {
        byte[] bArr = new byte[i3];
        int i10 = 0;
        while (i10 < i3) {
            int read = inputStream.read(bArr, i10, i3 - i10);
            if (read < 0) {
                throw new IllegalStateException(u.p(i3, StubApp.getString2(2496)));
            }
            i10 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += (int) m(byteArrayInputStream, 2);
            iArr[i11] = i10;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        throw new java.lang.IllegalStateException(com.stub.StubApp.getString2("2498"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L5f
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L5f
            if (r4 >= r9) goto L5f
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L9e
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "2497"
            java.lang.String r10 = com.stub.StubApp.getString2(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = "693"
            java.lang.String r9 = com.stub.StubApp.getString2(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L5f:
            if (r4 != r9) goto L77
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L6b
            r0.end()
            return r1
        L6b:
            java.lang.String r8 = "2498"
            java.lang.String r8 = com.stub.StubApp.getString2(r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L77:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "2499"
            java.lang.String r10 = com.stub.StubApp.getString2(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = "2500"
            java.lang.String r9 = com.stub.StubApp.getString2(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L9e:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.d.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static I0.e[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, I0.e[] eVarArr) {
        byte[] bArr3 = f2686i;
        boolean equals = Arrays.equals(bArr, bArr3);
        String string2 = StubApp.getString2(2501);
        String string22 = StubApp.getString2(2502);
        if (!equals) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException(string2);
            }
            int m4 = (int) m(fileInputStream, 2);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException(string22);
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
            try {
                I0.e[] k3 = k(byteArrayInputStream, bArr2, m4, eVarArr);
                byteArrayInputStream.close();
                return k3;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f2681d, bArr2)) {
            throw new IllegalStateException(StubApp.getString2(2503));
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException(string2);
        }
        int m10 = (int) m(fileInputStream, 1);
        byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException(string22);
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h4);
        try {
            I0.e[] j3 = j(byteArrayInputStream2, m10, eVarArr);
            byteArrayInputStream2.close();
            return j3;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static I0.e[] j(ByteArrayInputStream byteArrayInputStream, int i3, I0.e[] eVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new I0.e[0];
        }
        if (i3 != eVarArr.length) {
            throw new IllegalStateException(StubApp.getString2(2505));
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            iArr[i10] = (int) m(byteArrayInputStream, 2);
            strArr[i10] = new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i3; i11++) {
            I0.e eVar = eVarArr[i11];
            if (!((String) eVar.f3059c).equals(strArr[i11])) {
                throw new IllegalStateException(StubApp.getString2(2504));
            }
            int i12 = iArr[i11];
            eVar.f3062f = i12;
            eVar.f3060d = g(byteArrayInputStream, i12);
        }
        return eVarArr;
    }

    public static I0.e[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, I0.e[] eVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new I0.e[0];
        }
        if (i3 != eVarArr.length) {
            throw new IllegalStateException(StubApp.getString2(2505));
        }
        for (int i10 = 0; i10 < i3; i10++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m4 = m(byteArrayInputStream, 4);
            int m10 = (int) m(byteArrayInputStream, 2);
            I0.e eVar = null;
            if (eVarArr.length > 0) {
                int indexOf = str.indexOf(StubApp.getString2(1373));
                if (indexOf < 0) {
                    indexOf = str.indexOf(StubApp.getString2(478));
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i11 = 0;
                while (true) {
                    if (i11 >= eVarArr.length) {
                        break;
                    }
                    if (((String) eVarArr[i11].f3059c).equals(substring)) {
                        eVar = eVarArr[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (eVar == null) {
                throw new IllegalStateException(StubApp.getString2(2506).concat(str));
            }
            eVar.f3065k = m4;
            int[] g10 = g(byteArrayInputStream, m10);
            if (Arrays.equals(bArr, f2685h)) {
                eVar.f3062f = m10;
                eVar.f3060d = g10;
            }
        }
        return eVarArr;
    }

    public static I0.e[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f2682e)) {
            throw new IllegalStateException(StubApp.getString2(2507));
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException(StubApp.getString2(2502));
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
        try {
            I0.e[] n10 = n(byteArrayInputStream, str, m4);
            byteArrayInputStream.close();
            return n10;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i3) {
        byte[] f10 = f(inputStream, i3);
        long j3 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            j3 += (f10[i10] & UByte.MAX_VALUE) << (i10 * 8);
        }
        return j3;
    }

    public static I0.e[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new I0.e[0];
        }
        I0.e[] eVarArr = new I0.e[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            int m10 = (int) m(byteArrayInputStream, 2);
            eVarArr[i10] = new I0.e(str, new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m10, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m10], new TreeMap());
        }
        for (int i11 = 0; i11 < i3; i11++) {
            I0.e eVar = eVarArr[i11];
            int available = byteArrayInputStream.available() - eVar.f3064h;
            int i12 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = (TreeMap) eVar.f3061e;
                if (available2 <= available) {
                    break;
                }
                i12 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i12), 1);
                for (int m11 = (int) m(byteArrayInputStream, 2); m11 > 0; m11--) {
                    m(byteArrayInputStream, 2);
                    int m12 = (int) m(byteArrayInputStream, 1);
                    if (m12 != 6 && m12 != 7) {
                        while (m12 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m13 = (int) m(byteArrayInputStream, 1); m13 > 0; m13--) {
                                m(byteArrayInputStream, 2);
                            }
                            m12--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException(StubApp.getString2(2508));
            }
            eVar.f3060d = g(byteArrayInputStream, eVar.f3062f);
            int i13 = eVar.j;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i13 * 2) + 7) & (-8)) / 8));
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = valueOf.get(i14) ? 2 : 0;
                if (valueOf.get(i14 + i13)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
        }
        return eVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, I0.e[] eVarArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f2681d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f2682e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b2 = b(eVarArr, bArr3);
                u(byteArrayOutputStream, eVarArr.length, 1);
                u(byteArrayOutputStream, b2.length, 4);
                byte[] a3 = a(b2);
                u(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = f2684g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, eVarArr.length, 1);
                for (I0.e eVar : eVarArr) {
                    int size = ((TreeMap) eVar.f3061e).size() * 4;
                    String d8 = d(bArr4, (String) eVar.f3058b, (String) eVar.f3059c);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d8.getBytes(charset).length);
                    v(byteArrayOutputStream, ((int[]) eVar.f3060d).length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, eVar.f3063g, 4);
                    byteArrayOutputStream.write(d8.getBytes(charset));
                    Iterator it = ((TreeMap) eVar.f3061e).keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i10 : (int[]) eVar.f3060d) {
                        v(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f2683f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b10 = b(eVarArr, bArr5);
                u(byteArrayOutputStream, eVarArr.length, 1);
                u(byteArrayOutputStream, b10.length, 4);
                byte[] a9 = a(b10);
                u(byteArrayOutputStream, a9.length, 4);
                byteArrayOutputStream.write(a9);
                return true;
            }
            byte[] bArr6 = f2685h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, eVarArr.length);
            for (I0.e eVar2 : eVarArr) {
                String d10 = d(bArr6, (String) eVar2.f3058b, (String) eVar2.f3059c);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d10.getBytes(charset2).length);
                TreeMap treeMap = (TreeMap) eVar2.f3061e;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, ((int[]) eVar2.f3060d).length);
                u(byteArrayOutputStream, eVar2.f3063g, 4);
                byteArrayOutputStream.write(d10.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : (int[]) eVar2.f3060d) {
                    v(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, eVarArr.length);
            int i12 = 2;
            int i13 = 2;
            for (I0.e eVar3 : eVarArr) {
                u(byteArrayOutputStream2, eVar3.f3063g, 4);
                u(byteArrayOutputStream2, eVar3.f3065k, 4);
                u(byteArrayOutputStream2, eVar3.j, 4);
                String d11 = d(bArr2, (String) eVar3.f3058b, (String) eVar3.f3059c);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d11.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(d11.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            int length3 = byteArray.length;
            String string2 = StubApp.getString2(2509);
            if (i13 != length3) {
                throw new IllegalStateException(string2 + i13 + ", does not match actual size " + byteArray.length);
            }
            j jVar = new j(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(jVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < eVarArr.length) {
                try {
                    I0.e eVar4 = eVarArr[i14];
                    v(byteArrayOutputStream3, i14);
                    v(byteArrayOutputStream3, eVar4.f3062f);
                    i15 = i15 + 4 + (eVar4.f3062f * i12);
                    int[] iArr = (int[]) eVar4.f3060d;
                    int length4 = iArr.length;
                    int i16 = i3;
                    int i17 = i12;
                    int i18 = i16;
                    while (i18 < length4) {
                        int i19 = iArr[i18];
                        v(byteArrayOutputStream3, i19 - i16);
                        i18++;
                        i16 = i19;
                    }
                    i14++;
                    i12 = i17;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException(string2 + i15 + ", does not match actual size " + byteArray2.length);
            }
            j jVar2 = new j(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < eVarArr.length) {
                try {
                    I0.e eVar5 = eVarArr[i20];
                    Iterator it3 = ((TreeMap) eVar5.f3061e).entrySet().iterator();
                    int i22 = 0;
                    while (it3.hasNext()) {
                        i22 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i22, eVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, eVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i20);
                            int length5 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length5, 4);
                            v(byteArrayOutputStream3, i22);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i21 = i23 + length5;
                            i20++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i21 != byteArray5.length) {
                throw new IllegalStateException(string2 + i21 + ", does not match actual size " + byteArray5.length);
            }
            j jVar3 = new j(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                j jVar4 = (j) arrayList2.get(i24);
                int i25 = jVar4.f2698a;
                if (i25 == 1) {
                    j3 = 0;
                } else if (i25 == 2) {
                    j3 = 1;
                } else if (i25 == 3) {
                    j3 = 2;
                } else if (i25 == 4) {
                    j3 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                u(byteArrayOutputStream, j3, 4);
                u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = jVar4.f2699b;
                if (jVar4.f2700c) {
                    long length6 = bArr7.length;
                    byte[] a10 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a10);
                    u(byteArrayOutputStream, a10.length, 4);
                    u(byteArrayOutputStream, length6, 4);
                    length = a10.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, I0.e eVar) {
        s(byteArrayOutputStream, eVar);
        int[] iArr = (int[]) eVar.f3060d;
        int length = iArr.length;
        int i3 = 0;
        int i10 = 0;
        while (i3 < length) {
            int i11 = iArr[i3];
            v(byteArrayOutputStream, i11 - i10);
            i3++;
            i10 = i11;
        }
        int i12 = eVar.j;
        byte[] bArr = new byte[(((i12 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f3061e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i13 = intValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i14 = intValue + i12;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, I0.e eVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, eVar.f3062f);
        u(byteArrayOutputStream, eVar.f3064h, 4);
        u(byteArrayOutputStream, eVar.f3063g, 4);
        u(byteArrayOutputStream, eVar.j, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i3, I0.e eVar) {
        int bitCount = Integer.bitCount(i3 & (-2));
        int i10 = eVar.j;
        byte[] bArr = new byte[(((bitCount * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f3061e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i3) != 0) {
                    if ((i12 & intValue2) == i12) {
                        int i13 = (i11 * i10) + intValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, I0.e eVar) {
        int i3 = 0;
        for (Map.Entry entry : ((TreeMap) eVar.f3061e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i3);
                v(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:48|(1:50)|51|52|(3:53|54|55)|56|57|(3:231|232|(4:234|235|236|237)(2:241|242))|59|(3:63|64|(3:71|72|(4:74|75|76|(1:70))(2:77|78))(3:(1:67)|68|(0)))|94|(2:98|(5:102|103|104|105|(2:107|108)(3:109|110|111))(2:100|101))|125|(1:127)(3:131|132|(13:136|137|138|139|140|141|142|143|145|(3:150|151|(9:153|(2:154|(1:156)(1:157))|158|159|160|161|162|163|164))|147|148|149)(2:134|135))|(1:129)|130) */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0163, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0164, code lost:
    
        r20.c(7, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0309 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ea  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, H1.c r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.d.t(android.content.Context, java.util.concurrent.Executor, H1.c, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) {
        byte[] bArr = new byte[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            bArr[i10] = (byte) ((j3 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        u(byteArrayOutputStream, i3, 2);
    }
}
