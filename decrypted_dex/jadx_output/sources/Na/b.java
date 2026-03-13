package Na;

import Xa.h;
import Z9.q;
import android.text.TextUtils;
import android.util.Log;
import b0.C0481h;
import com.stub.StubApp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4957b = StubApp.getString2(3821).getBytes(Charset.forName(StubApp.getString2(640)));

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f4958c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a, reason: collision with root package name */
    public final q f4959a;

    public b(InputStream inputStream) {
        this.f4959a = new q(inputStream, 12);
    }

    public static void a(C0481h c0481h, C0481h c0481h2, int i3, int i10) {
        String[] strArr = {StubApp.getString2(3824), StubApp.getString2(3825), StubApp.getString2(3826), StubApp.getString2(3827), StubApp.getString2(3828), StubApp.getString2(3829), StubApp.getString2(3830), StubApp.getString2(3831), StubApp.getString2(3832), StubApp.getString2(3833), StubApp.getString2(3834), StubApp.getString2(3835), StubApp.getString2(3836), StubApp.getString2(3837), StubApp.getString2(3838), StubApp.getString2(3839), StubApp.getString2(3840), StubApp.getString2(3841), StubApp.getString2(3822), StubApp.getString2(3823), StubApp.getString2(3842), StubApp.getString2(3843)};
        for (int i11 = 0; i11 < 22; i11++) {
            String str = strArr[i11];
            String b2 = c0481h.b(str);
            if (!TextUtils.isEmpty(b2)) {
                c0481h2.D(str, b2);
            }
        }
        c0481h2.D(StubApp.getString2(3844), String.valueOf(i3));
        c0481h2.D(StubApp.getString2(3845), String.valueOf(i10));
        c0481h2.D(StubApp.getString2(3846), StubApp.getString2(824));
        c0481h2.z();
    }

    public final int b() {
        int i3;
        InputStream inputStream = (InputStream) this.f4959a.f9143b;
        int i10 = 65280;
        short s10 = 255;
        int read = ((inputStream.read() << 8) & 65280) | (inputStream.read() & 255);
        int i11 = read & 65496;
        String string2 = StubApp.getString2(3568);
        if (i11 == 65496 || read == 19789 || read == 18761) {
            while (true) {
                short read2 = (short) (inputStream.read() & s10);
                if (read2 == s10) {
                    short read3 = (short) (inputStream.read() & s10);
                    if (read3 == 218) {
                        break;
                    }
                    if (read3 != 217) {
                        i3 = (((inputStream.read() << 8) & i10) | (inputStream.read() & s10)) - 2;
                        if (read3 == 225) {
                            break;
                        }
                        long j = i3;
                        long j3 = 0;
                        if (j >= 0) {
                            long j10 = j;
                            while (j10 > 0) {
                                long skip = inputStream.skip(j10);
                                if (skip > 0) {
                                    j10 -= skip;
                                } else {
                                    if (inputStream.read() == -1) {
                                        break;
                                    }
                                    j10--;
                                }
                            }
                            j3 = j - j10;
                        }
                        if (j3 == j) {
                            i10 = 65280;
                            s10 = 255;
                        } else if (Log.isLoggable(string2, 3)) {
                            StringBuilder l9 = AbstractC1482f.l(read3, StubApp.getString2(3850), i3, StubApp.getString2(3851), StubApp.getString2(3852));
                            l9.append(j3);
                            Log.d(string2, l9.toString());
                        }
                    } else if (Log.isLoggable(string2, 3)) {
                        Log.d(string2, StubApp.getString2(3849));
                    }
                } else if (Log.isLoggable(string2, 3)) {
                    h.v(read2, StubApp.getString2(3848), string2);
                }
            }
            i3 = -1;
            if (i3 != -1) {
                byte[] bArr = new byte[i3];
                int i12 = i3;
                while (i12 > 0) {
                    int read4 = inputStream.read(bArr, i3 - i12, i12);
                    if (read4 == -1) {
                        break;
                    }
                    i12 -= read4;
                }
                int i13 = i3 - i12;
                if (i13 == i3) {
                    byte[] bArr2 = f4957b;
                    boolean z2 = i3 > bArr2.length;
                    if (z2) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= bArr2.length) {
                                break;
                            }
                            if (bArr[i14] != bArr2[i14]) {
                                z2 = false;
                                break;
                            }
                            i14++;
                        }
                    }
                    if (z2) {
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        ByteBuffer byteBuffer = (ByteBuffer) wrap.order(byteOrder).limit(i3);
                        short s11 = byteBuffer.getShort(6);
                        if (s11 != 19789) {
                            if (s11 == 18761) {
                                byteOrder = ByteOrder.LITTLE_ENDIAN;
                            } else if (Log.isLoggable(string2, 3)) {
                                h.v(s11, StubApp.getString2(3856), string2);
                            }
                        }
                        byteBuffer.order(byteOrder);
                        int i15 = byteBuffer.getInt(10);
                        short s12 = byteBuffer.getShort(i15 + 6);
                        for (int i16 = 0; i16 < s12; i16++) {
                            int i17 = (i16 * 12) + i15 + 8;
                            short s13 = byteBuffer.getShort(i17);
                            if (s13 == 274) {
                                short s14 = byteBuffer.getShort(i17 + 2);
                                if (s14 >= 1 && s14 <= 12) {
                                    int i18 = byteBuffer.getInt(i17 + 4);
                                    if (i18 >= 0) {
                                        boolean isLoggable = Log.isLoggable(string2, 3);
                                        String string22 = StubApp.getString2(3858);
                                        if (isLoggable) {
                                            StringBuilder l10 = AbstractC1482f.l(i16, StubApp.getString2(3859), s13, string22, StubApp.getString2(3860));
                                            l10.append((int) s14);
                                            l10.append(StubApp.getString2(3861));
                                            l10.append(i18);
                                            Log.d(string2, l10.toString());
                                        }
                                        int i19 = i18 + f4958c[s14];
                                        if (i19 <= 4) {
                                            int i20 = i17 + 8;
                                            if (i20 >= 0 && i20 <= byteBuffer.remaining()) {
                                                if (i19 >= 0 && i19 + i20 <= byteBuffer.remaining()) {
                                                    return byteBuffer.getShort(i20);
                                                }
                                                if (Log.isLoggable(string2, 3)) {
                                                    h.v(s13, StubApp.getString2(3863), string2);
                                                }
                                            } else if (Log.isLoggable(string2, 3)) {
                                                Log.d(string2, StubApp.getString2(3864) + i20 + string22 + ((int) s13));
                                            }
                                        } else if (Log.isLoggable(string2, 3)) {
                                            h.v(s14, StubApp.getString2(3862), string2);
                                        }
                                    } else if (Log.isLoggable(string2, 3)) {
                                        Log.d(string2, StubApp.getString2(3857));
                                    }
                                } else if (Log.isLoggable(string2, 3)) {
                                    h.v(s14, StubApp.getString2(3865), string2);
                                }
                            }
                        }
                    } else if (Log.isLoggable(string2, 3)) {
                        Log.d(string2, StubApp.getString2(3866));
                    }
                } else if (Log.isLoggable(string2, 3)) {
                    Log.d(string2, StubApp.getString2(3854) + i3 + StubApp.getString2(3855) + i13);
                    return -1;
                }
            } else if (Log.isLoggable(string2, 3)) {
                Log.d(string2, StubApp.getString2(3853));
                return -1;
            }
        } else if (Log.isLoggable(string2, 3)) {
            h.v(read, StubApp.getString2(3847), string2);
            return -1;
        }
        return -1;
    }
}
