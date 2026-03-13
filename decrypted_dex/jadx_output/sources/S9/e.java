package S9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends i {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6621s;

    /* renamed from: t, reason: collision with root package name */
    public final i f6622t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i originalAdapter, int i3) {
        super(d.f6616d, Reflection.getOrCreateKotlinClass(int[].class), originalAdapter.f6642c, new int[0], 0);
        this.f6621s = i3;
        switch (i3) {
            case 1:
                Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
                super(d.f6616d, Reflection.getOrCreateKotlinClass(long[].class), originalAdapter.f6642c, new long[0], 0);
                this.f6622t = originalAdapter;
                break;
            default:
                Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
                this.f6622t = originalAdapter;
                break;
        }
    }

    @Override // S9.i
    public final Object b(o oVar) {
        i iVar = this.f6622t;
        String string2 = StubApp.getString2(6027);
        switch (this.f6621s) {
            case 0:
                Intrinsics.checkNotNullParameter(oVar, string2);
                return new int[]{((Number) iVar.b(oVar)).intValue()};
            default:
                Intrinsics.checkNotNullParameter(oVar, string2);
                return new long[]{((Number) iVar.b(oVar)).longValue()};
        }
    }

    @Override // S9.i
    public final void d(r writer, Object obj) {
        switch (this.f6621s) {
            case 0:
                int[] value = (int[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                int length = value.length;
                while (true) {
                    length--;
                    if (-1 >= length) {
                        break;
                    } else {
                        this.f6622t.d(writer, Integer.valueOf(value[length]));
                    }
                }
            default:
                long[] value2 = (long[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value2, "value");
                int length2 = value2.length;
                while (true) {
                    length2--;
                    if (-1 >= length2) {
                        break;
                    } else {
                        this.f6622t.d(writer, Long.valueOf(value2[length2]));
                    }
                }
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        switch (this.f6621s) {
            case 0:
                int[] value = (int[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                for (int i3 : value) {
                    this.f6622t.e(writer, Integer.valueOf(i3));
                }
                break;
            default:
                long[] value2 = (long[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value2, "value");
                for (long j : value2) {
                    this.f6622t.e(writer, Long.valueOf(j));
                }
                break;
        }
    }

    @Override // S9.i
    public final void f(r writer, int i3, Object obj) {
        switch (this.f6621s) {
            case 0:
                int[] iArr = (int[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (iArr != null && iArr.length != 0) {
                    super.f(writer, i3, iArr);
                    break;
                }
                break;
            default:
                long[] jArr = (long[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (jArr != null && jArr.length != 0) {
                    super.f(writer, i3, jArr);
                    break;
                }
                break;
        }
    }

    @Override // S9.i
    public final void g(s2.d writer, int i3, Object obj) {
        switch (this.f6621s) {
            case 0:
                int[] iArr = (int[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (iArr != null && iArr.length != 0) {
                    super.g(writer, i3, iArr);
                    break;
                }
                break;
            default:
                long[] jArr = (long[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (jArr != null && jArr.length != 0) {
                    super.g(writer, i3, jArr);
                    break;
                }
                break;
        }
    }

    @Override // S9.i
    public final int h(Object obj) {
        switch (this.f6621s) {
            case 0:
                int[] value = (int[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                int i3 = 0;
                for (int i10 : value) {
                    i3 += this.f6622t.h(Integer.valueOf(i10));
                }
                return i3;
            default:
                long[] value2 = (long[]) obj;
                Intrinsics.checkNotNullParameter(value2, "value");
                int i11 = 0;
                for (long j : value2) {
                    i11 += this.f6622t.h(Long.valueOf(j));
                }
                return i11;
        }
    }

    @Override // S9.i
    public final int i(int i3, Object obj) {
        switch (this.f6621s) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return 0;
                }
                return super.i(i3, iArr);
            default:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return 0;
                }
                return super.i(i3, jArr);
        }
    }
}
