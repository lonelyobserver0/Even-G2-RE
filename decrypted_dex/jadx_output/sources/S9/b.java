package S9;

import Kc.AbstractC0095b;
import Kc.C0101h;
import Kc.C0104k;
import Kc.InterfaceC0102i;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends i {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6613s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, KClass kClass, s sVar, int i3) {
        super(dVar, kClass, sVar);
        this.f6613s = i3;
    }

    @Override // S9.i
    public final Object b(o oVar) {
        String string2 = StubApp.getString2(6027);
        switch (this.f6613s) {
            case 0:
                Intrinsics.checkNotNullParameter(oVar, string2);
                DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
                return Double.valueOf(Double.longBitsToDouble(oVar.i()));
            case 1:
                Intrinsics.checkNotNullParameter(oVar, string2);
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                return Float.valueOf(Float.intBitsToFloat(oVar.h()));
            case 2:
                Intrinsics.checkNotNullParameter(oVar, string2);
                throw new IllegalStateException(StubApp.getString2(6029));
            case 3:
                Intrinsics.checkNotNullParameter(oVar, string2);
                return Boolean.valueOf(oVar.k() != 0);
            case 4:
                Intrinsics.checkNotNullParameter(oVar, string2);
                long c10 = oVar.c();
                C0101h c0101h = oVar.f6646a;
                c0101h.D(c10);
                return c0101h.f(c10);
            case 5:
                Intrinsics.checkNotNullParameter(oVar, string2);
                long d8 = oVar.d();
                while (true) {
                    int g10 = oVar.g();
                    if (g10 == -1) {
                        oVar.e(d8);
                        return Unit.INSTANCE;
                    }
                    oVar.j(g10);
                }
            case 6:
                Intrinsics.checkNotNullParameter(oVar, string2);
                return Integer.valueOf(oVar.h());
            case 7:
                Intrinsics.checkNotNullParameter(oVar, string2);
                return Long.valueOf(oVar.i());
            case 8:
                Intrinsics.checkNotNullParameter(oVar, string2);
                return Integer.valueOf(oVar.k());
            case 9:
                Intrinsics.checkNotNullParameter(oVar, string2);
                return Long.valueOf(oVar.l());
            case 10:
                Intrinsics.checkNotNullParameter(oVar, string2);
                int k3 = oVar.k();
                return Integer.valueOf((-(k3 & 1)) ^ (k3 >>> 1));
            case 11:
                Intrinsics.checkNotNullParameter(oVar, string2);
                long l9 = oVar.l();
                return Long.valueOf((l9 >>> 1) ^ (-(l9 & 1)));
            case 12:
                Intrinsics.checkNotNullParameter(oVar, string2);
                long c11 = oVar.c();
                C0101h c0101h2 = oVar.f6646a;
                c0101h2.D(c11);
                return c0101h2.J(c11, Charsets.UTF_8);
            case 13:
                Intrinsics.checkNotNullParameter(oVar, string2);
                ArrayList arrayList = new ArrayList();
                long d10 = oVar.d();
                while (true) {
                    int g11 = oVar.g();
                    if (g11 == -1) {
                        oVar.e(d10);
                        return arrayList;
                    }
                    if (g11 != 1) {
                        oVar.m();
                    } else {
                        arrayList.add(i.f6639r.b(oVar));
                    }
                }
            case 14:
                Intrinsics.checkNotNullParameter(oVar, string2);
                int k4 = oVar.k();
                if (k4 == 0) {
                    return null;
                }
                throw new IOException(u.p(k4, StubApp.getString2(6028)));
            case 15:
                Intrinsics.checkNotNullParameter(oVar, string2);
                return Integer.valueOf(oVar.k());
            default:
                Intrinsics.checkNotNullParameter(oVar, string2);
                return Long.valueOf(oVar.l());
        }
    }

    @Override // S9.i
    public final void d(r writer, Object obj) {
        switch (this.f6613s) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.f(Double.doubleToLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.e(Float.floatToIntBits(floatValue));
                return;
            case 2:
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter((Void) obj, "value");
                throw new IllegalStateException(StubApp.getString2(6029));
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.h(booleanValue ? 1 : 0);
                return;
            case 4:
                C0104k value = (C0104k) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.d(value);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter((Unit) obj, "value");
                return;
            case 6:
                int intValue = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.e(intValue);
                return;
            case 7:
                long longValue = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.f(longValue);
                return;
            case 8:
                int intValue2 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (intValue2 >= 0) {
                    writer.h(intValue2);
                    return;
                } else {
                    writer.i(intValue2);
                    return;
                }
            case 9:
                long longValue2 = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.i(longValue2);
                return;
            case 10:
                int intValue3 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.h((intValue3 >> 31) ^ (intValue3 << 1));
                return;
            case 11:
                long longValue3 = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.i((longValue3 >> 63) ^ (longValue3 << 1));
                return;
            case 12:
                String value2 = (String) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value2, "value");
                writer.getClass();
                Intrinsics.checkNotNullParameter(value2, "value");
                int length = value2.length() - 1;
                while (length >= 0) {
                    int i3 = length - 1;
                    char charAt = value2.charAt(length);
                    if (charAt < 128) {
                        writer.c(1);
                        int i10 = writer.f6662e;
                        byte[] bArr = writer.f6661d;
                        int i11 = i10 - 1;
                        bArr[i11] = (byte) charAt;
                        int max = Math.max(-1, i3 - i11);
                        int i12 = i11;
                        length = i3;
                        while (length > max) {
                            char charAt2 = value2.charAt(length);
                            if (charAt2 < 128) {
                                length--;
                                i12--;
                                bArr[i12] = (byte) charAt2;
                            } else {
                                writer.f6662e = i12;
                            }
                        }
                        writer.f6662e = i12;
                    } else {
                        if (charAt < 2048) {
                            writer.c(2);
                            byte[] bArr2 = writer.f6661d;
                            int i13 = writer.f6662e;
                            int i14 = i13 - 1;
                            writer.f6662e = i14;
                            bArr2[i14] = (byte) (128 | (charAt & '?'));
                            int i15 = i13 - 2;
                            writer.f6662e = i15;
                            bArr2[i15] = (byte) ((charAt >> 6) | 192);
                        } else if (charAt < 55296 || charAt > 57343) {
                            writer.c(3);
                            byte[] bArr3 = writer.f6661d;
                            int i16 = writer.f6662e;
                            int i17 = i16 - 1;
                            writer.f6662e = i17;
                            bArr3[i17] = (byte) ((charAt & '?') | 128);
                            int i18 = i16 - 2;
                            writer.f6662e = i18;
                            bArr3[i18] = (byte) (128 | (63 & (charAt >> 6)));
                            int i19 = i16 - 3;
                            writer.f6662e = i19;
                            bArr3[i19] = (byte) ((charAt >> '\f') | BERTags.FLAGS);
                        } else {
                            char charAt3 = i3 >= 0 ? value2.charAt(i3) : CharCompanionObject.MAX_VALUE;
                            if (charAt3 > 56319 || 56320 > charAt || charAt >= 57344) {
                                writer.c(1);
                                byte[] bArr4 = writer.f6661d;
                                int i20 = writer.f6662e - 1;
                                writer.f6662e = i20;
                                bArr4[i20] = 63;
                            } else {
                                length -= 2;
                                int i21 = (((charAt3 & 1023) << 10) | (charAt & 1023)) + PKIFailureInfo.notAuthorized;
                                writer.c(4);
                                byte[] bArr5 = writer.f6661d;
                                int i22 = writer.f6662e;
                                int i23 = i22 - 1;
                                writer.f6662e = i23;
                                bArr5[i23] = (byte) ((i21 & 63) | 128);
                                int i24 = i22 - 2;
                                writer.f6662e = i24;
                                bArr5[i24] = (byte) (((i21 >> 6) & 63) | 128);
                                int i25 = i22 - 3;
                                writer.f6662e = i25;
                                bArr5[i25] = (byte) (128 | (63 & (i21 >> 12)));
                                int i26 = i22 - 4;
                                writer.f6662e = i26;
                                bArr5[i26] = (byte) ((i21 >> 18) | 240);
                            }
                        }
                        length = i3;
                    }
                }
                return;
            case 13:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (list == null) {
                    return;
                }
                for (int size = list.size() - 1; -1 < size; size--) {
                    i.f6639r.f(writer, 1, list.get(size));
                }
                return;
            case 14:
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.h(0);
                return;
            case 15:
                int intValue4 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.h(intValue4);
                return;
            default:
                long longValue4 = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.i(longValue4);
                return;
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        switch (this.f6613s) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                ((InterfaceC0102i) writer.f20712b).j(Double.doubleToLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                ((InterfaceC0102i) writer.f20712b).l(Float.floatToIntBits(floatValue));
                return;
            case 2:
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter((Void) obj, "value");
                throw new IllegalStateException(StubApp.getString2(6029));
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.E(booleanValue ? 1 : 0);
                return;
            case 4:
                C0104k value = (C0104k) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.C(value);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter((Unit) obj, "value");
                return;
            case 6:
                int intValue = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                ((InterfaceC0102i) writer.f20712b).l(intValue);
                return;
            case 7:
                long longValue = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                ((InterfaceC0102i) writer.f20712b).j(longValue);
                return;
            case 8:
                int intValue2 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (intValue2 >= 0) {
                    writer.E(intValue2);
                    return;
                } else {
                    writer.F(intValue2);
                    return;
                }
            case 9:
                long longValue2 = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.F(longValue2);
                return;
            case 10:
                int intValue3 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.E((intValue3 >> 31) ^ (intValue3 << 1));
                return;
            case 11:
                long longValue3 = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.F((longValue3 >> 63) ^ (longValue3 << 1));
                return;
            case 12:
                String value2 = (String) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value2, "value");
                writer.getClass();
                Intrinsics.checkNotNullParameter(value2, "value");
                ((InterfaceC0102i) writer.f20712b).r(value2);
                return;
            case 13:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i.f6639r.g(writer, 1, it.next());
                }
                return;
            case 14:
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.E(0);
                return;
            case 15:
                int intValue4 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.E(intValue4);
                return;
            default:
                long longValue4 = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.F(longValue4);
                return;
        }
    }

    @Override // S9.i
    public void f(r writer, int i3, Object obj) {
        switch (this.f6613s) {
            case 14:
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.h(0);
                writer.g(i3, this.f6640a);
                break;
            default:
                super.f(writer, i3, obj);
                break;
        }
    }

    @Override // S9.i
    public void g(s2.d writer, int i3, Object obj) {
        switch (this.f6613s) {
            case 14:
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.D(i3, this.f6640a);
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.E(0);
                break;
            default:
                super.g(writer, i3, obj);
                break;
        }
    }

    @Override // S9.i
    public final int h(Object obj) {
        switch (this.f6613s) {
            case 0:
                ((Number) obj).doubleValue();
                return 8;
            case 1:
                ((Number) obj).floatValue();
                return 4;
            case 2:
                Intrinsics.checkNotNullParameter((Void) obj, "value");
                throw new IllegalStateException(StubApp.getString2(6029));
            case 3:
                ((Boolean) obj).getClass();
                return 1;
            case 4:
                C0104k value = (C0104k) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                return value.e();
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj, "value");
                return 0;
            case 6:
                ((Number) obj).intValue();
                return 4;
            case 7:
                ((Number) obj).longValue();
                return 8;
            case 8:
                int intValue = ((Number) obj).intValue();
                if (intValue < 0) {
                    return 10;
                }
                if ((intValue & (-128)) == 0) {
                    return 1;
                }
                if ((intValue & (-16384)) == 0) {
                    return 2;
                }
                if (((-2097152) & intValue) == 0) {
                    return 3;
                }
                return (intValue & (-268435456)) == 0 ? 4 : 5;
            case 9:
                return Ec.d.L(((Number) obj).longValue());
            case 10:
                int intValue2 = ((Number) obj).intValue();
                int i3 = (intValue2 >> 31) ^ (intValue2 << 1);
                if ((i3 & (-128)) == 0) {
                    return 1;
                }
                if ((i3 & (-16384)) == 0) {
                    return 2;
                }
                if (((-2097152) & i3) == 0) {
                    return 3;
                }
                return (i3 & (-268435456)) == 0 ? 4 : 5;
            case 11:
                long longValue = ((Number) obj).longValue();
                return Ec.d.L((longValue >> 63) ^ (longValue << 1));
            case 12:
                String value2 = (String) obj;
                Intrinsics.checkNotNullParameter(value2, "value");
                return (int) AbstractC0095b.k(value2);
            case 13:
                List list = (List) obj;
                int i10 = 0;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        i10 += i.f6639r.i(1, it.next());
                    }
                }
                return i10;
            case 14:
                return 1;
            case 15:
                int intValue3 = ((Number) obj).intValue();
                if ((intValue3 & (-128)) == 0) {
                    return 1;
                }
                if ((intValue3 & (-16384)) == 0) {
                    return 2;
                }
                if (((-2097152) & intValue3) == 0) {
                    return 3;
                }
                return (intValue3 & (-268435456)) == 0 ? 4 : 5;
            default:
                return Ec.d.L(((Number) obj).longValue());
        }
    }

    @Override // S9.i
    public int i(int i3, Object obj) {
        switch (this.f6613s) {
            case 14:
                d fieldEncoding = d.f6614b;
                Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
                return Ec.d.K(1) + Ec.d.K(i3 << 3);
            default:
                return super.i(i3, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, KClass kClass, s sVar, Object obj, int i3, int i10) {
        super(dVar, kClass, sVar, obj, i3);
        this.f6613s = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r3 = this;
            r0 = 2
            r3.f6613s = r0
            S9.d r0 = S9.d.f6616d
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            java.lang.String r2 = "fieldEncoding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            S9.s r2 = S9.s.f6665b
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S9.b.<init>():void");
    }
}
