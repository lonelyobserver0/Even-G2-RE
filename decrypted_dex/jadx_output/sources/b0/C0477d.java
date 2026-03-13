package b0;

import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p0.AbstractC1482f;

/* renamed from: b0.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0477d {

    /* renamed from: a, reason: collision with root package name */
    public final int f10411a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10412b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10413c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10414d;

    public C0477d(int i3, int i10, byte[] bArr) {
        this(-1L, bArr, i3, i10);
    }

    public static C0477d a(String str) {
        byte[] bytes = str.concat(StubApp.getString2(8618)).getBytes(C0481h.f10448b0);
        return new C0477d(2, bytes.length, bytes);
    }

    public static C0477d b(long j, ByteOrder byteOrder) {
        return c(new long[]{j}, byteOrder);
    }

    public static C0477d c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0481h.f10439S[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C0477d(4, jArr.length, wrap.array());
    }

    public static C0477d d(C0479f[] c0479fArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0481h.f10439S[5] * c0479fArr.length]);
        wrap.order(byteOrder);
        for (C0479f c0479f : c0479fArr) {
            wrap.putInt((int) c0479f.f10419a);
            wrap.putInt((int) c0479f.f10420b);
        }
        return new C0477d(5, c0479fArr.length, wrap.array());
    }

    public static C0477d e(int i3, ByteOrder byteOrder) {
        return f(new int[]{i3}, byteOrder);
    }

    public static C0477d f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0481h.f10439S[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i3 : iArr) {
            wrap.putShort((short) i3);
        }
        return new C0477d(3, iArr.length, wrap.array());
    }

    public final double g(ByteOrder byteOrder) {
        Object j = j(byteOrder);
        if (j == null) {
            throw new NumberFormatException(StubApp.getString2(8621));
        }
        if (j instanceof String) {
            return Double.parseDouble((String) j);
        }
        boolean z2 = j instanceof long[];
        String string2 = StubApp.getString2(8619);
        if (z2) {
            if (((long[]) j).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException(string2);
        }
        if (j instanceof int[]) {
            if (((int[]) j).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException(string2);
        }
        if (j instanceof double[]) {
            double[] dArr = (double[]) j;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException(string2);
        }
        if (!(j instanceof C0479f[])) {
            throw new NumberFormatException(StubApp.getString2(8620));
        }
        C0479f[] c0479fArr = (C0479f[]) j;
        if (c0479fArr.length != 1) {
            throw new NumberFormatException(string2);
        }
        C0479f c0479f = c0479fArr[0];
        return c0479f.f10419a / c0479f.f10420b;
    }

    public final int h(ByteOrder byteOrder) {
        Object j = j(byteOrder);
        if (j == null) {
            throw new NumberFormatException(StubApp.getString2(8623));
        }
        if (j instanceof String) {
            return Integer.parseInt((String) j);
        }
        boolean z2 = j instanceof long[];
        String string2 = StubApp.getString2(8619);
        if (z2) {
            long[] jArr = (long[]) j;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException(string2);
        }
        if (!(j instanceof int[])) {
            throw new NumberFormatException(StubApp.getString2(8622));
        }
        int[] iArr = (int[]) j;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException(string2);
    }

    public final String i(ByteOrder byteOrder) {
        Object j = j(byteOrder);
        if (j == null) {
            return null;
        }
        if (j instanceof String) {
            return (String) j;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z2 = j instanceof long[];
        String string2 = StubApp.getString2(321);
        int i3 = 0;
        if (z2) {
            long[] jArr = (long[]) j;
            while (i3 < jArr.length) {
                sb2.append(jArr[i3]);
                i3++;
                if (i3 != jArr.length) {
                    sb2.append(string2);
                }
            }
            return sb2.toString();
        }
        if (j instanceof int[]) {
            int[] iArr = (int[]) j;
            while (i3 < iArr.length) {
                sb2.append(iArr[i3]);
                i3++;
                if (i3 != iArr.length) {
                    sb2.append(string2);
                }
            }
            return sb2.toString();
        }
        if (j instanceof double[]) {
            double[] dArr = (double[]) j;
            while (i3 < dArr.length) {
                sb2.append(dArr[i3]);
                i3++;
                if (i3 != dArr.length) {
                    sb2.append(string2);
                }
            }
            return sb2.toString();
        }
        if (!(j instanceof C0479f[])) {
            return null;
        }
        C0479f[] c0479fArr = (C0479f[]) j;
        while (i3 < c0479fArr.length) {
            sb2.append(c0479fArr[i3].f10419a);
            sb2.append('/');
            sb2.append(c0479fArr[i3].f10420b);
            i3++;
            if (i3 != c0479fArr.length) {
                sb2.append(string2);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x003d: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:174:0x003d */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [b0.f[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [b0.f[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    public final Serializable j(ByteOrder byteOrder) {
        InputStream inputStream;
        C0475b c0475b;
        byte b2;
        String sb2;
        int i3 = 0;
        byte[] bArr = this.f10414d;
        String string2 = StubApp.getString2(8624);
        String string22 = StubApp.getString2(8612);
        InputStream inputStream2 = null;
        try {
        } catch (Throwable th) {
            th = th;
            inputStream2 = inputStream;
        }
        try {
            try {
                c0475b = new C0475b(bArr);
            } catch (IOException e10) {
                Log.e(string22, string2, e10);
                return null;
            }
            try {
                c0475b.f10406c = byteOrder;
                int i10 = this.f10411a;
                int i11 = this.f10412b;
                switch (i10) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b2 = bArr[0]) < 0 || b2 > 1) {
                            String str = new String(bArr, C0481h.f10448b0);
                            try {
                                c0475b.close();
                                return str;
                            } catch (IOException e11) {
                                Log.e(string22, string2, e11);
                                return str;
                            }
                        }
                        String str2 = new String(new char[]{(char) (b2 + 48)});
                        try {
                            c0475b.close();
                            return str2;
                        } catch (IOException e12) {
                            Log.e(string22, string2, e12);
                            return str2;
                        }
                    case 2:
                    case 7:
                        if (i11 >= C0481h.f10440T.length) {
                            int i12 = 0;
                            while (true) {
                                byte[] bArr2 = C0481h.f10440T;
                                if (i12 >= bArr2.length) {
                                    i3 = bArr2.length;
                                } else if (bArr[i12] == bArr2[i12]) {
                                    i12++;
                                }
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        try {
                            while (i3 < i11) {
                                byte b10 = bArr[i3];
                                if (b10 == 0) {
                                    sb2 = sb3.toString();
                                    c0475b.close();
                                    return sb2;
                                }
                                if (b10 >= 32) {
                                    sb3.append((char) b10);
                                } else {
                                    sb3.append('?');
                                }
                                i3++;
                            }
                            c0475b.close();
                            return sb2;
                        } catch (IOException e13) {
                            Log.e(string22, string2, e13);
                            return sb2;
                        }
                        sb2 = sb3.toString();
                    case 3:
                        ?? r15 = new int[i11];
                        while (i3 < i11) {
                            r15[i3] = c0475b.readUnsignedShort();
                            i3++;
                        }
                        try {
                            c0475b.close();
                            return r15;
                        } catch (IOException e14) {
                            Log.e(string22, string2, e14);
                            return r15;
                        }
                    case 4:
                        ?? r152 = new long[i11];
                        while (i3 < i11) {
                            r152[i3] = c0475b.readInt() & BodyPartID.bodyIdMax;
                            i3++;
                        }
                        try {
                            c0475b.close();
                            return r152;
                        } catch (IOException e15) {
                            Log.e(string22, string2, e15);
                            return r152;
                        }
                    case 5:
                        ?? r153 = new C0479f[i11];
                        while (i3 < i11) {
                            r153[i3] = new C0479f(c0475b.readInt() & BodyPartID.bodyIdMax, c0475b.readInt() & BodyPartID.bodyIdMax);
                            i3++;
                        }
                        try {
                            c0475b.close();
                            return r153;
                        } catch (IOException e16) {
                            Log.e(string22, string2, e16);
                            return r153;
                        }
                    case 8:
                        ?? r154 = new int[i11];
                        while (i3 < i11) {
                            r154[i3] = c0475b.readShort();
                            i3++;
                        }
                        try {
                            c0475b.close();
                            return r154;
                        } catch (IOException e17) {
                            Log.e(string22, string2, e17);
                            return r154;
                        }
                    case 9:
                        ?? r155 = new int[i11];
                        while (i3 < i11) {
                            r155[i3] = c0475b.readInt();
                            i3++;
                        }
                        try {
                            c0475b.close();
                            return r155;
                        } catch (IOException e18) {
                            Log.e(string22, string2, e18);
                            return r155;
                        }
                    case 10:
                        ?? r156 = new C0479f[i11];
                        while (i3 < i11) {
                            r156[i3] = new C0479f(c0475b.readInt(), c0475b.readInt());
                            i3++;
                        }
                        try {
                            c0475b.close();
                            return r156;
                        } catch (IOException e19) {
                            Log.e(string22, string2, e19);
                            return r156;
                        }
                    case 11:
                        ?? r157 = new double[i11];
                        while (i3 < i11) {
                            r157[i3] = c0475b.readFloat();
                            i3++;
                        }
                        try {
                            c0475b.close();
                            return r157;
                        } catch (IOException e20) {
                            Log.e(string22, string2, e20);
                            return r157;
                        }
                    case 12:
                        ?? r158 = new double[i11];
                        while (i3 < i11) {
                            r158[i3] = c0475b.readDouble();
                            i3++;
                        }
                        try {
                            c0475b.close();
                            return r158;
                        } catch (IOException e21) {
                            Log.e(string22, string2, e21);
                            return r158;
                        }
                    default:
                        c0475b.close();
                        return null;
                }
            } catch (IOException e22) {
                e = e22;
                Log.w(string22, StubApp.getString2("8625"), e);
                if (c0475b != null) {
                    c0475b.close();
                }
                return null;
            }
        } catch (IOException e23) {
            e = e23;
            c0475b = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e24) {
                    Log.e(string22, string2, e24);
                }
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2830));
        sb2.append(C0481h.f10438R[this.f10411a]);
        sb2.append(StubApp.getString2(8626));
        return AbstractC1482f.f(this.f10414d.length, StubApp.getString2(74), sb2);
    }

    public C0477d(long j, byte[] bArr, int i3, int i10) {
        this.f10411a = i3;
        this.f10412b = i10;
        this.f10413c = j;
        this.f10414d = bArr;
    }
}
