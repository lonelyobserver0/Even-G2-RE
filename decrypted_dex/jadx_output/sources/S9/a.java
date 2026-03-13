package S9;

import com.stub.StubApp;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends i {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6611s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final i f6612t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b originalAdapter) {
        super(d.f6616d, Reflection.getOrCreateKotlinClass(double[].class), originalAdapter.f6642c, new double[0], 0);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.f6612t = originalAdapter;
    }

    @Override // S9.i
    public final Object b(o oVar) {
        String string2 = StubApp.getString2(6027);
        switch (this.f6611s) {
            case 0:
                Intrinsics.checkNotNullParameter(oVar, string2);
                DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
                return new double[]{Double.longBitsToDouble(oVar.i())};
            default:
                Intrinsics.checkNotNullParameter(oVar, string2);
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                return new float[]{Float.intBitsToFloat(oVar.h())};
        }
    }

    @Override // S9.i
    public final void d(r writer, Object obj) {
        switch (this.f6611s) {
            case 0:
                double[] value = (double[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                int length = value.length;
                while (true) {
                    length--;
                    if (-1 >= length) {
                        break;
                    } else {
                        writer.f(Double.doubleToLongBits(value[length]));
                    }
                }
            default:
                float[] value2 = (float[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value2, "value");
                int length2 = value2.length;
                while (true) {
                    length2--;
                    if (-1 >= length2) {
                        break;
                    } else {
                        writer.e(Float.floatToIntBits(value2[length2]));
                    }
                }
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        switch (this.f6611s) {
            case 0:
                double[] value = (double[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                for (double d8 : value) {
                    ((b) this.f6612t).e(writer, Double.valueOf(d8));
                }
                break;
            default:
                float[] value2 = (float[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value2, "value");
                for (float f10 : value2) {
                    ((b) this.f6612t).e(writer, Float.valueOf(f10));
                }
                break;
        }
    }

    @Override // S9.i
    public final void f(r writer, int i3, Object obj) {
        switch (this.f6611s) {
            case 0:
                double[] dArr = (double[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (dArr != null && dArr.length != 0) {
                    super.f(writer, i3, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (fArr != null && fArr.length != 0) {
                    super.f(writer, i3, fArr);
                    break;
                }
                break;
        }
    }

    @Override // S9.i
    public final void g(s2.d writer, int i3, Object obj) {
        switch (this.f6611s) {
            case 0:
                double[] dArr = (double[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (dArr != null && dArr.length != 0) {
                    super.g(writer, i3, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (fArr != null && fArr.length != 0) {
                    super.g(writer, i3, fArr);
                    break;
                }
                break;
        }
    }

    @Override // S9.i
    public final int h(Object obj) {
        switch (this.f6611s) {
            case 0:
                double[] value = (double[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                int i3 = 0;
                for (double d8 : value) {
                    ((b) this.f6612t).h(Double.valueOf(d8));
                    i3 += 8;
                }
                return i3;
            default:
                float[] value2 = (float[]) obj;
                Intrinsics.checkNotNullParameter(value2, "value");
                int i10 = 0;
                for (float f10 : value2) {
                    ((b) this.f6612t).getClass();
                    i10 += 4;
                }
                return i10;
        }
    }

    @Override // S9.i
    public final int i(int i3, Object obj) {
        switch (this.f6611s) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return 0;
                }
                return super.i(i3, dArr);
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return 0;
                }
                return super.i(i3, fArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b originalAdapter, byte b2) {
        super(d.f6616d, Reflection.getOrCreateKotlinClass(float[].class), originalAdapter.f6642c, new float[0], 0);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.f6612t = originalAdapter;
    }
}
