package Hb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import org.slf4j.LoggerFactory;
import vb.C1847d;
import vb.EnumC1848e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final org.slf4j.a f3014b = LoggerFactory.getLogger((Class<?>) b.class);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3015a;

    /* renamed from: rc, reason: collision with root package name */
    @JsonProperty("rc")
    public int f3016rc = 0;

    @JsonProperty("err")
    public a groupReturnCode = null;

    @JsonCreator
    public b() {
    }

    public static b a(byte[] bArr, Class cls) {
        if (EnumC1848e.f21933a.a()) {
            throw new IllegalArgumentException(StubApp.getString2(2761));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 8, bArr.length);
        C1847d.a(Arrays.copyOf(bArr, 8));
        Class cls2 = Kb.b.class;
        if ((cls != cls2 || (bArr[0] & 7) != 3 || bArr[4] != 0 || bArr[5] != 1 || bArr[7] != 1) && (cls != (cls2 = Jb.a.class) || (bArr[0] & 7) != 3 || bArr[4] != 0 || bArr[5] != 8 || bArr[7] != 0)) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                c c10 = c(copyOfRange, cls2);
                if (c10 != null) {
                    c10.f3015a = copyOfRange;
                    return c10;
                }
            } catch (Exception unused) {
            }
        }
        if (((bArr[0] >> 3) & 3) == 1 && copyOfRange.length <= 21) {
            byte[] bArr2 = {99, 114, 101, 116, -65};
            byte[] bArr3 = {99, 101, 114, 114, -65};
            int i3 = 0;
            loop0: while (true) {
                if (i3 >= copyOfRange.length - 4) {
                    i3 = -1;
                    break;
                }
                for (int i10 = 0; i10 < 5; i10++) {
                    if (copyOfRange[i3 + i10] != bArr2[i10]) {
                        break;
                    }
                }
                break loop0;
                i3++;
            }
            if (i3 != -1) {
                byte[] bArr4 = new byte[copyOfRange.length];
                System.arraycopy(copyOfRange, 0, bArr4, 0, i3);
                System.arraycopy(bArr3, 0, bArr4, i3, 5);
                int i11 = i3 + 5;
                System.arraycopy(copyOfRange, i11, bArr4, i11, (copyOfRange.length - i3) - 5);
                copyOfRange = bArr4;
            }
        }
        CBORFactory cBORFactory = Ob.a.f5373a;
        b bVar = (b) new ObjectMapper(Ob.a.f5373a).readValue(copyOfRange, cls);
        bVar.f3015a = copyOfRange;
        return bVar;
    }

    public static c c(byte[] bArr, Class cls) {
        if (bArr.length < 6) {
            return null;
        }
        int i3 = bArr[0] & UByte.MAX_VALUE;
        if (i3 != 191 && i3 != 162) {
            return null;
        }
        int i10 = 1;
        int i11 = -1;
        int i12 = -1;
        boolean z2 = -1;
        while (i10 < bArr.length) {
            byte b2 = bArr[i10];
            int i13 = (b2 & 224) >> 5;
            int i14 = i10 + 1;
            int i15 = b2 & 31;
            if (i13 == 0) {
                if (i15 > 23) {
                    int i16 = i15 - 24;
                    if (i16 == 0) {
                        i15 = bArr.length > i14 ? bArr[i14] & UByte.MAX_VALUE : -1;
                        i14 = i10 + 2;
                    } else if (i16 == 1) {
                        int i17 = i10 + 2;
                        i15 = bArr.length > i17 ? ((bArr[i14] & UByte.MAX_VALUE) << 8) | (bArr[i17] & UByte.MAX_VALUE) : -1;
                        i14 = i10 + 3;
                    } else {
                        if (i16 != 2) {
                            return null;
                        }
                        int i18 = i10 + 4;
                        if (bArr.length > i18) {
                            i15 = ((bArr[i14] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 3] & UByte.MAX_VALUE) << 8) | (bArr[i18] & UByte.MAX_VALUE);
                            if (i15 < 0) {
                                return null;
                            }
                        } else {
                            i15 = -1;
                        }
                        i14 = i10 + 5;
                    }
                }
                if (i15 >= 0) {
                    if (!z2) {
                        i11 = i15;
                    } else if (z2) {
                        i12 = i15;
                    }
                    z2 = -1;
                }
            } else if (i13 == 3) {
                if (i15 == 2) {
                    int i19 = i10 + 2;
                    if (bArr.length > i19 && bArr[i14] == 114 && bArr[i19] == 99) {
                        z2 = false;
                    }
                } else {
                    if (i15 != 3) {
                        return null;
                    }
                    int i20 = i10 + 3;
                    if (bArr.length > i20 && bArr[i14] == 111 && bArr[i10 + 2] == 102 && bArr[i20] == 102) {
                        z2 = true;
                    }
                    if (bArr.length > i20) {
                        byte b10 = bArr[i14];
                        if (b10 == 114 && bArr[i10 + 2] == 101 && bArr[i20] == 116) {
                            return null;
                        }
                        if (b10 == 101 && bArr[i10 + 2] == 114 && bArr[i20] == 114) {
                            return null;
                        }
                    }
                }
                i14 += i15;
            } else {
                continue;
            }
            i10 = i14;
        }
        c cVar = (c) cls.newInstance();
        if (i11 >= 0) {
            cVar.f3016rc = i11;
        }
        if (i12 >= 0) {
            cVar.off = i12;
        }
        return cVar;
    }

    public final boolean b() {
        if (this.f3016rc != 0) {
            return false;
        }
        a aVar = this.groupReturnCode;
        return aVar == null || aVar.f3013rc == 0;
    }

    public final String toString() {
        try {
            byte[] bArr = this.f3015a;
            CBORFactory cBORFactory = Ob.a.f5373a;
            return new ObjectMapper(Ob.a.f5373a).readTree(bArr).toString();
        } catch (IOException e10) {
            org.slf4j.a aVar = f3014b;
            String string2 = StubApp.getString2(2762);
            aVar.b(string2, e10);
            return string2;
        }
    }
}
